/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.dc.compiladores.compiladorAlguma;

import br.ufscar.dc.compiladores.compiladorAlguma.TabelaDeSimbolos.TipoLA;
import java.util.ArrayList;
import java.util.HashMap;
import org.antlr.v4.runtime.Token;

public class Calculador extends RegrasBaseVisitor<Void> {
    //TabelaDeSimbolos tabela;
    static Escopos escoposAninhados = new Escopos();
    // Hashs para usar com funcao, procedimentos, registros,
     static HashMap<String, ArrayList<TipoLA>> tabelaFuncaoProcedimento = new HashMap<>();
    HashMap<String, ArrayList<String>> tabelaRegistro = new HashMap<>();
   
    //Funcao para adicionar uma Variavel encontrada na tabela de simbolos,
    //Ela tambem faz a verificação se o tipo declarado existe e verificando tambem se os identificadores ja foram declarados anteriormente
    public void adicionaVariavelTabela(String nome, String tipo, Token nomeT, Token tipoT){
        TabelaDeSimbolos tabelaLocal = escoposAninhados.obterEscopoAtual();
        
        TabelaDeSimbolos tabelaGlobal = escoposAninhados.percorrerEscoposAninhados().get(escoposAninhados.percorrerEscoposAninhados().size()-1);
        TipoLA tipoLa=null;
         if (tabelaRegistro.containsKey(tipo)) {
            tipoLa= TipoLA.REGISTRO;
        }
         
        if(tipo.charAt(0)=='^'){
            tipo=tipo.substring(1);
        }
        if(tipo.equals("literal")){
            tipoLa= TipoLA.LITERAL;
        }else if(tipo.equals("inteiro")){
            tipoLa=TipoLA.INTEIRO;
        }else if(tipo.equals("real")){
            tipoLa=TipoLA.REAL;
        }else if(tipo.equals("logico")){
            tipoLa=TipoLA.LOGICO;
        }else if(tipo.equals("registro")){
            tipoLa=TipoLA.REGISTRO;
        }else{
            tipoLa=TipoLA.INVALIDO;
        }
        
                       
        if(tipoLa == TipoLA.INVALIDO){
            LASemanticoUtils.adicionarErroSemantico(tipoT, "tipo "+tipo+" nao declarado");
        }
        
        if(!tabelaLocal.existe(nome)){
            if(!tabelaGlobal.existe(nome)){
                tabelaLocal.inserir(nome, tipoLa);
            }else{
                LASemanticoUtils.adicionarErroSemantico(nomeT, "identificador " + nome + " ja declarado anteriormente");
            }
        }else{
                LASemanticoUtils.adicionarErroSemantico(nomeT, "identificador " + nome + " ja declarado anteriormente");
        }
    }
    
    
    @Override
    public Void visitPrograma(RegrasParser.ProgramaContext ctx) {
        TabelaDeSimbolos tabela = new TabelaDeSimbolos();
        return super.visitPrograma(ctx);
   }

    //corpo é a parte onde todo o código, referente ao programa a ser compilado, estará
    //Funcao Visit para visitar o contexto do corpo, ele cria um novo escopo aqui e caminha pelos comandos desse corpo
    //Verifica tambem o uso indevido do comando retorne
    @Override
    public Void visitCorpo(RegrasParser.CorpoContext ctx) {
        escoposAninhados.criarNovoEscopo();

        for (RegrasParser.CmdContext c : ctx.cmd()) {
            if (c.cmdRetorne() != null) {
                LASemanticoUtils.adicionarErroSemantico(c.getStart(), "comando retorne nao permitido nesse escoposAninhados");
            }
        }

        return super.visitCorpo(ctx);
    }
    
    @Override
    public Void visitDeclaracoes(RegrasParser.DeclaracoesContext ctx){
        TabelaDeSimbolos tabela = escoposAninhados.obterEscopoAtual();
        
        for(RegrasParser.Decl_local_globalContext dlgc : ctx.decl_local_global()){
            visitDecl_local_global(dlgc);
        }
        
        return super.visitDeclaracoes(ctx);
    }
    
    @Override
    public Void visitDecl_local_global(RegrasParser.Decl_local_globalContext ctx){
        TabelaDeSimbolos tabela = escoposAninhados.obterEscopoAtual();
        
        if(ctx.declaracao_global() != null){
            visitDeclaracao_global(ctx.declaracao_global());
        } else if(ctx.declaracao_local()!=null){
            visitDeclaracao_local(ctx.declaracao_local());
        }
        
        return super.visitDecl_local_global(ctx);
    }

    @Override
    public Void visitDeclaracao_local(RegrasParser.Declaracao_localContext ctx) {
        
        TabelaDeSimbolos tabela = escoposAninhados.obterEscopoAtual();
        String tipoVar = null;

        //verificar o tipo de declaração (variavel | constante | tipo)
        if (ctx.decl != null) {
            //variavel do tipo registro
            if (ctx.variavel().tipo().registro() != null) {
                
                for(RegrasParser.IdentificadorContext ic : ctx.variavel().identificador()){
                    
                    adicionaVariavelTabela(ic.getText(), "registro", ic.getStart(), null);
                    
                    for(RegrasParser.VariavelContext vc : ctx.variavel().tipo().registro().variavel()){
                        tipoVar = vc.tipo().getText();
                        
                        for( RegrasParser.IdentificadorContext icr : vc.identificador()){
                            
                            adicionaVariavelTabela(ic.getText() + '.' + icr.getText(), tipoVar, icr.getStart(), vc.tipo().getStart());
                        }
                    }
                }
            } else {
 
                tipoVar = ctx.variavel().tipo().getText();
                
                if(tabelaRegistro.containsKey(tipoVar)){
                    ArrayList<String> variaveis_registro = tabelaRegistro.get(tipoVar);
                    
                    for(RegrasParser.IdentificadorContext ic : ctx.variavel().identificador()){
                        String nome = ic.IDENT().get(0).getText();
                        if(tabela.existe(nome) || tabelaRegistro.containsKey(nome)){
                            LASemanticoUtils.adicionarErroSemantico(ic.getStart(), "identificador " + nome + " ja declarado anteriormente");
                        }else{
                            adicionaVariavelTabela(nome, "registro", ic.getStart(), ctx.variavel().tipo().getStart());
                            for(int i=0;i<variaveis_registro.size();i=i+2){
                                 adicionaVariavelTabela(nome + '.' + variaveis_registro.get(i), variaveis_registro.get(i+1), ic.getStart(), ctx.variavel().tipo().getStart());
                            }
                        }
                    }
                }else {
                   for (RegrasParser.IdentificadorContext ident : ctx.variavel().identificador()) {
                        String nomeVar = ident.getText();
                        if (tabelaFuncaoProcedimento.containsKey(nomeVar)) {
                            LASemanticoUtils.adicionarErroSemantico(ident.getStart(), "identificador " + nomeVar + " ja declarado anteriormente");
                        } else {
                            adicionaVariavelTabela(nomeVar, tipoVar, ident.getStart(), ctx.variavel().tipo().getStart());

                        }
                    } 
                }
            }
            
        } else if (ctx.constant!=null) {
             adicionaVariavelTabela(ctx.IDENT().getText(), ctx.tipo_basico().getText(), ctx.IDENT().getSymbol(), ctx.IDENT().getSymbol());
        
        } else if(ctx.decl_tipo!=null){
             if (ctx.tipo().registro() != null) {
                ArrayList<String> variaveisRegistro = new ArrayList<String>();
                for (RegrasParser.VariavelContext vc : ctx.tipo().registro().variavel()) {
                    tipoVar = vc.tipo().getText();
                    for (RegrasParser.IdentificadorContext ic : vc.identificador()) {
                        variaveisRegistro.add(ic.getText());
                        variaveisRegistro.add(tipoVar);
                    }
                }
                tabelaRegistro.put(ctx.IDENT().getText(), variaveisRegistro);
            
            }
        }
        
        return super.visitDeclaracao_local(ctx);
    }

    @Override
    public Void visitDeclaracao_global(RegrasParser.Declaracao_globalContext ctx) {
        escoposAninhados.criarNovoEscopo();
        TabelaDeSimbolos tabela = escoposAninhados.obterEscopoAtual();
        ArrayList<TipoLA> tiposVariaveis = new ArrayList<TipoLA>();

        if(ctx.proc!=null){
            for(RegrasParser.ParametroContext parametro : ctx.parametros().parametro()){
                if(parametro.tipo_estendido().tipo_basico_ident().tipo_basico()!=null){
                    
                    for(RegrasParser.IdentificadorContext ic : parametro.identificador()){
                        adicionaVariavelTabela(ic.getText(), parametro.tipo_estendido().getText(), ic.getStart(), parametro.tipo_estendido().getStart());
                        String tipo = parametro.tipo_estendido().getText();
                        TipoLA tipoLa=null;
                         if (tabelaRegistro.containsKey(tipo)) {
                            tipoLa= TipoLA.REGISTRO;
                        }

                       if(tipo.charAt(0)=='^'){
                            tipo=tipo.substring(1);
                        }
                        if(tipo.equals("literal")){
                            tipoLa= TipoLA.LITERAL;
                        }else if(tipo.equals("inteiro")){
                            tipoLa=TipoLA.INTEIRO;
                        }else if(tipo.equals("real")){
                            tipoLa=TipoLA.REAL;
                        }else if(tipo.equals("logico")){
                            tipoLa=TipoLA.LOGICO;
                        }else if(tipo.equals("registro")){
                            tipoLa=TipoLA.REGISTRO;
                        }else{
                            tipoLa=TipoLA.INVALIDO;
                        }
                        tiposVariaveis.add(tipoLa);
                    }
                }else{
                    if(tabelaRegistro.containsKey(parametro.tipo_estendido().tipo_basico_ident().IDENT().getText())){
                        ArrayList<String> variaveisRegistro = tabelaRegistro.get(parametro.tipo_estendido().tipo_basico_ident().IDENT().getText());
                        
                        for(RegrasParser.IdentificadorContext ic: parametro.identificador()){
                            TipoLA tipoLa=null;
                            String tipo = parametro.tipo_estendido().getText();
                            if (tabelaRegistro.containsKey(tipo)) {
                                tipoLa= TipoLA.REGISTRO;
                            }

                            if(tipo.charAt(0)=='^'){
                                tipo=tipo.substring(1);
                            }
                            if(tipo.equals("literal")){
                                tipoLa= TipoLA.LITERAL;
                            }else if(tipo.equals("inteiro")){
                                tipoLa=TipoLA.INTEIRO;
                            }else if(tipo.equals("real")){
                                tipoLa=TipoLA.REAL;
                            }else if(tipo.equals("logico")){
                                tipoLa=TipoLA.LOGICO;
                            }else if(tipo.equals("registro")){
                                tipoLa=TipoLA.REGISTRO;
                            }else{
                                tipoLa=TipoLA.INVALIDO;
                            }
                            tiposVariaveis.add(tipoLa);
                            
                            for(int i=0;i<tiposVariaveis.size();i=i+2){
                                adicionaVariavelTabela(ic.getText() + '.' + variaveisRegistro.get(i), variaveisRegistro.get(i+1), ic.getStart(), ic.getStart());
                            }
                        }
                    }else{
                       LASemanticoUtils.adicionarErroSemantico(parametro.getStart(), "tipo nao declarado"); 
                    }
                }
            }
            for(RegrasParser.CmdContext c : ctx.cmd()){
                if(c.cmdRetorne()!=null){
                    LASemanticoUtils.adicionarErroSemantico(c.getStart(), "comando retorne nao permitido nesse escopo");
                }
                
            }

            tabelaFuncaoProcedimento.put(ctx.IDENT().getText(), tiposVariaveis);
        }else if(ctx.func!=null){
            for(RegrasParser.ParametroContext parametro: ctx.parametros().parametro()){
                
                if(parametro.tipo_estendido().tipo_basico_ident().tipo_basico()!=null){
                    for(RegrasParser.IdentificadorContext ic : parametro.identificador()){
                        adicionaVariavelTabela(ic.getText(), parametro.tipo_estendido().getText(), ic.getStart(), parametro.tipo_estendido().getStart());
                        String tipo = parametro.tipo_estendido().getText();
                        TipoLA tipoLa=null;
                         if (tabelaRegistro.containsKey(tipo)) {
                            tipoLa= TipoLA.REGISTRO;
                            }

                        if(tipo.charAt(0)=='^'){
                            tipo=tipo.substring(1);
                        }
                        if(tipo.equals("literal")){
                            tipoLa= TipoLA.LITERAL;
                        }else if(tipo.equals("inteiro")){
                            tipoLa=TipoLA.INTEIRO;
                        }else if(tipo.equals("real")){
                            tipoLa=TipoLA.REAL;
                        }else if(tipo.equals("logico")){
                            tipoLa=TipoLA.LOGICO;
                        }else if(tipo.equals("registro")){
                            tipoLa=TipoLA.REGISTRO;
                        }else{
                            tipoLa=TipoLA.INVALIDO;
                        }
                        tiposVariaveis.add(tipoLa);
                    }
                } else{
                    
                    if(tabelaRegistro.containsKey(parametro.tipo_estendido().tipo_basico_ident().IDENT().getText())){
                        ArrayList<String> variaveisRegistro = tabelaRegistro.get(parametro.tipo_estendido().tipo_basico_ident().IDENT().getText());
                        
                        for(RegrasParser.IdentificadorContext ic : parametro.identificador()){
                            String tipo = parametro.tipo_estendido().tipo_basico_ident().IDENT().getText();
                            TipoLA tipoLa=null;
                         if (tabelaRegistro.containsKey(tipo)) {
                            tipoLa= TipoLA.REGISTRO;
                        }

                        if(tipo.charAt(0)=='^'){
                            tipo=tipo.substring(1);
                        }
                        if(tipo.equals("literal")){
                            tipoLa= TipoLA.LITERAL;
                        }else if(tipo.equals("inteiro")){
                            tipoLa=TipoLA.INTEIRO;
                        }else if(tipo.equals("real")){
                            tipoLa=TipoLA.REAL;
                        }else if(tipo.equals("logico")){
                            tipoLa=TipoLA.LOGICO;
                        }else if(tipo.equals("registro")){
                            tipoLa=TipoLA.REGISTRO;
                        }else{
                            tipoLa=TipoLA.INVALIDO;
                        }
                        tiposVariaveis.add(tipoLa);
                            for(int i=0; i<variaveisRegistro.size();i=i+2){
                                 adicionaVariavelTabela(ic.getText() + "." + variaveisRegistro.get(i), variaveisRegistro.get(i+1), ic.getStart(), ic.getStart());
                            }
                        }
                    }else{
                        LASemanticoUtils.adicionarErroSemantico(parametro.getStart(), "tipo nao declarado");
                    }
                }
            }
            
          
        }
        
        return super.visitDeclaracao_global(ctx);
    }


    @Override
    public Void visitCmdLeia(RegrasParser.CmdLeiaContext ctx) {
        TabelaDeSimbolos tabela = escoposAninhados.obterEscopoAtual();
        TipoLA tipos;
        String nomeVar;
        for (RegrasParser.IdentificadorContext ic : ctx.identificador()) {

            nomeVar = ic.getText();
            
            if (!tabela.existe(ic.getText()) ) {
                LASemanticoUtils.adicionarErroSemantico(ic.getStart(), "identificador " + ic.getText() + " nao declarado");
            }
        }
        return super.visitCmdLeia(ctx);
    }

    //Visitação para o comando escreva, essa funcao basicamente obtem o escopo atual pega as expressao dentro do contexto e chama verificaTipo de Utils
    @Override
    public Void visitCmdEscreva(RegrasParser.CmdEscrevaContext ctx) {
        TabelaDeSimbolos tabela = escoposAninhados.obterEscopoAtual();
        TipoLA tipo;

        for (RegrasParser.ExpressaoContext expressao : ctx.expressao()) {
            tipo = LASemanticoUtils.verificarTipo(tabela, expressao);
        }

        return super.visitCmdEscreva(ctx);
    }
    
     //Visitante para o comando se (IF)
    @Override
    public Void visitCmdSe(RegrasParser.CmdSeContext ctx) {
        TabelaDeSimbolos tabela = escoposAninhados.obterEscopoAtual();
        TipoLA tipo = LASemanticoUtils.verificarTipo(tabela, ctx.expressao());

        return super.visitCmdSe(ctx);
    }

    
    @Override
    public Void visitCmdCaso(RegrasParser.CmdCasoContext ctx) {
        TabelaDeSimbolos tabela = escoposAninhados.obterEscopoAtual();
        TipoLA tipo = LASemanticoUtils.verificarTipo(tabela, ctx.exp_aritmetica());

        for (RegrasParser.CmdContext cmd : ctx.cmd()) {
            visitCmd(cmd);
        }

        return super.visitCmdCaso(ctx);
    }
    
    //Visitante para o comando para (for)
    //Verifica tambem erros de identificadores nao declarados
    @Override
    public Void visitCmdPara(RegrasParser.CmdParaContext ctx) {
        TabelaDeSimbolos tabela = escoposAninhados.obterEscopoAtual();

        if (!tabela.existe(ctx.IDENT().getText())) {
            LASemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), "identificador " + ctx.IDENT().getText() + " nao declarado");
        }

        for(RegrasParser.Exp_aritmeticaContext expArit : ctx.exp_aritmetica()){
            LASemanticoUtils.verificarTipo(tabela, expArit);
        }
        
        for(RegrasParser.CmdContext c : ctx.cmd()){
            visitCmd(c);
        }

        return super.visitCmdPara(ctx);
    }
    
    //Visitante  do comando Enquanto (while)
    //Obtem o escopo atual e passar a expressoa para verificarTipo
    @Override
    public Void visitCmdEnquanto(RegrasParser.CmdEnquantoContext ctx){
        TabelaDeSimbolos tabela = escoposAninhados.obterEscopoAtual();
        TipoLA tipoExpressao = LASemanticoUtils.verificarTipo(tabela, ctx.expressao());
        return super.visitCmdEnquanto(ctx); 
    }
    
    
    //Visitante  do comando Enquanto (faca)
    @Override
    public Void visitCmdFaca(RegrasParser.CmdFacaContext ctx){
        TabelaDeSimbolos tabela = escoposAninhados.obterEscopoAtual();
        TipoLA tipoExpressao = LASemanticoUtils.verificarTipo(tabela, ctx.expressao());
        
        
        for(RegrasParser.CmdContext c : ctx.cmd()){
            visitCmd(c);
        }
        
        return super.visitCmdFaca(ctx);
    }
    
    //Visitante para o comando atribuição
    //Recebe o escopo atual, verifica se o identificador ja nao foi declarado
    //Verifica se as atribuições sao compativeis com os tipos declarados
    @Override
    public Void visitCmdAtribuicao(RegrasParser.CmdAtribuicaoContext ctx){
        TabelaDeSimbolos tabela = escoposAninhados.obterEscopoAtual();
        TipoLA tipoExpressao = LASemanticoUtils.verificarTipo(tabela, ctx.expressao());
        String varNome = ctx.identificador().getText();
        
        if(tipoExpressao != TipoLA.INVALIDO){
            
            if (!tabela.existe(varNome)){
                 LASemanticoUtils.adicionarErroSemantico(ctx.identificador().getStart(), "identificador " + ctx.identificador().getText() + " nao declarado");
            } else {
                
                TipoLA varTipo = LASemanticoUtils.verificarTipo(tabela, varNome);
                if(varTipo != tipoExpressao){
                    if ( !(((varTipo == TipoLA.REAL) || (varTipo == TipoLA.INTEIRO)) & ((tipoExpressao == TipoLA.INTEIRO) || (tipoExpressao == TipoLA.REAL))) ) {
 
                        if (ctx.PONTEIRO() != null) {
                            LASemanticoUtils.adicionarErroSemantico(ctx.identificador().getStart(), "atribuicao nao compativel para ^" + ctx.identificador().getText());
                        } else {
                            LASemanticoUtils.adicionarErroSemantico(ctx.identificador().getStart(), "atribuicao nao compativel para " + ctx.identificador().getText());
                        }
                }
                
            }
        }
    } else {
           LASemanticoUtils.adicionarErroSemantico(ctx.identificador().getStart(), "atribuicao nao compativel para " + ctx.identificador().getText());
        }
        return super.visitCmdAtribuicao(ctx);
    }
    
    @Override
    public Void visitCmdChamada(RegrasParser.CmdChamadaContext ctx){
        TabelaDeSimbolos tabela = escoposAninhados.obterEscopoAtual();
        
        for(RegrasParser.ExpressaoContext ec: ctx.expressao()){
            LASemanticoUtils.verificarTipo(tabela, ec);
        }
        
        return super.visitCmdChamada(ctx);
    }
    
    @Override
    public Void visitCmdRetorne(RegrasParser.CmdRetorneContext ctx){
        TabelaDeSimbolos tabela = escoposAninhados.obterEscopoAtual();
        TipoLA tipoExpressao = LASemanticoUtils.verificarTipo(tabela, ctx.expressao());
        
        return super.visitCmdRetorne(ctx);
        
    }
}
