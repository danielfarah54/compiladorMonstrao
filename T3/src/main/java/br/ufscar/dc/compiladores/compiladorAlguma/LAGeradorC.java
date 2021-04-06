/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.dc.compiladores.compiladorAlguma;

import br.ufscar.dc.compiladores.compiladorAlguma.TabelaDeSimbolos.TipoLA;

public class LAGeradorC extends RegrasBaseVisitor<Void> {

    StringBuilder saida;
    TabelaDeSimbolos tabela;

    public LAGeradorC() {
        saida = new StringBuilder();
        this.tabela = new TabelaDeSimbolos();
    }

    @Override
    public Void visitPrograma(RegrasParser.ProgramaContext ctx) {
        saida.append("#include <stdio.h>\n");
        saida.append("#include <stdlib.h>\n");
        saida.append("\n");
        visitDeclaracoes(ctx.declaracoes());
 
        saida.append("\n");
        saida.append("int main() {\n");
        visitCorpo(ctx.corpo());
        saida.append("\nreturn 0;\n");
        saida.append("}\n");
        return null;
    }
    
    @Override
    public Void visitDeclaracoes(RegrasParser.DeclaracoesContext ctx){
        
        for(RegrasParser.Decl_local_globalContext c : ctx.decl_local_global()){
            visitDecl_local_global(c);
        }
        
        return null;
    }
    
    @Override
    public Void visitDecl_local_global(RegrasParser.Decl_local_globalContext ctx){
        
        if(ctx.declaracao_global()!=null){
            visitDeclaracao_global(ctx.declaracao_global());
        }else{
            visitDeclaracao_local(ctx.declaracao_local());
        }
        return null;
    }
    
    
    
    @Override
    public Void visitDeclaracao_local(RegrasParser.Declaracao_localContext ctx) {
        String nomeVar = null;
        String strTipoVar = ctx.variavel().tipo().getText();
        TabelaDeSimbolos.TipoLA tipoVar = TabelaDeSimbolos.TipoLA.INVALIDO;
        switch (strTipoVar) {
            case "inteiro":
                tipoVar = TabelaDeSimbolos.TipoLA.INTEIRO;
                strTipoVar = "int";
                break;
            case "real":
                tipoVar = TabelaDeSimbolos.TipoLA.REAL;
                strTipoVar = "float";
                break;
            case "literal":
                tipoVar = TabelaDeSimbolos.TipoLA.LITERAL;
                strTipoVar = "char";
                break;
            case "^literal":
                tipoVar = TabelaDeSimbolos.TipoLA.LITERAL;
                strTipoVar = "char*";
                break;
            case "^inteiro":
                tipoVar = TabelaDeSimbolos.TipoLA.INTEIRO;
                strTipoVar = "int*";
                break;
            case "^real":
                tipoVar = TabelaDeSimbolos.TipoLA.REAL;
                strTipoVar = "float*";
                break;
            case "logico":
                tipoVar = TabelaDeSimbolos.TipoLA.REAL;
                strTipoVar = "int";
                break;
            case "^logico":
                tipoVar = TabelaDeSimbolos.TipoLA.REAL;
                strTipoVar = "int*";
                break;
            case "registro":
                tipoVar = TabelaDeSimbolos.TipoLA.REGISTRO;
                strTipoVar = "struct ";
            default:
                // Nunca irá acontecer, pois o analisador sintático
                // não permite
                break;
        }
        // Podemos adicionar na tabela de símbolos sem verificar
        // pois a análise semântica já fez as verificações
        tabela.inserir(nomeVar, tipoVar);
        for(RegrasParser.IdentificadorContext ic: ctx.variavel().identificador()){
            nomeVar = ic.getText();// ctx.variavel().identificador().get(0).IDENT().get(0).getText();
            if(strTipoVar.equals("char")){
            saida.append(strTipoVar + " " + nomeVar + "[80];\n");
            }else{
                saida.append(strTipoVar + " " + nomeVar + ";\n");
            }
        }
        
        return null;
    }

    @Override
    public Void visitCmdAtribuicao(RegrasParser.CmdAtribuicaoContext ctx) {
        String var = ctx.identificador().getText();
        
        if(ctx.PONTEIRO()!=null){
            saida.append("*");
        }else{
            saida.append(var+"=");
            //visitExpressao(ctx.expressao());
            saida.append(ctx.expressao().getText()+";\n");
            
        }
        
        
        return null;
    }
    
    @Override
    public Void visitExpressao(RegrasParser.ExpressaoContext ctx){
        visitTermo_logico(ctx.termo_logico(0));
        for(RegrasParser.Termo_logicoContext termoLogico : ctx.outrosTermosLog){
            saida.append(" || ");
            visitTermo_logico(termoLogico);
        }
        
        return null;
    }
    
    @Override 
    public Void visitTermo_logico(RegrasParser.Termo_logicoContext ctx){
        visitFator_logico(ctx.primeiroFatLogico);
        
        for(RegrasParser.Fator_logicoContext fatorLogico : ctx.outrosFatLogico){
            saida.append(" && ");
            visitFator_logico(fatorLogico);
        }
        
        return null;
        
    }
    
    @Override
    public Void visitFator_logico(RegrasParser.Fator_logicoContext ctx){
        if(ctx.NEGACAO()!=null){
            saida.append("!");
        }
        
        visitParcela_logica(ctx.parcela_logica());
        return null;
    }
    
    @Override
    public Void visitParcela_logica(RegrasParser.Parcela_logicaContext ctx){
        
        if(ctx.FALSO()!=null){
            saida.append("false");
        }else if(ctx.VERDADEIRO()!=null){
            saida.append("true");
        }else{
            visitExp_relacional(ctx.exp_relacional());
        }
        return null;
    }
    
    @Override
    public Void visitExp_relacional(RegrasParser.Exp_relacionalContext ctx){
        String arit1=ctx.exp_aritmetica().get(0).getText();
        saida.append(arit1);
        if(ctx.op_relacional()!=null){
            switch(ctx.op_relacional().getText()){
                case "=" :
                    saida.append("==");
                    break;
                case "<>":
                    saida.append("!=");
                    break;
                default:
                    saida.append(ctx.op_relacional().getText());
            }
            
        }
        saida.append(ctx.exp_aritmetica(1).getText());
        return null;
    }
    
    

    @Override
    public Void visitCmdSe(RegrasParser.CmdSeContext ctx) {
        saida.append("if(");
        visitExpressao(ctx.expressao());
        saida.append("){\n");
        for(RegrasParser.CmdContext c: ctx.comandos){
            visitCmd(c);
        }
        
        
        if (ctx.cmd().size() > 1) { // tem else
            saida.append("}else{\n");
            for(RegrasParser.CmdContext c: ctx.outrosComandos){
            visitCmd(c);
            }
        }
        saida.append("}\n");
        return null;
    }

    @Override
    public Void visitCmdLeia(RegrasParser.CmdLeiaContext ctx) {
        saida.append("scanf(\"");
        String aux="";
        for(RegrasParser.IdentificadorContext ic : ctx.identificador()){
            TipoLA tipo = LASemanticoUtils.verificarTipo(Calculador.escoposAninhados.obterEscopoAtual(), ic);
            
            switch (tipo) {
            case INTEIRO:
                aux = "%d\", &";
                break;
            case REAL:
                aux = "%f\", &";
                break;
            case LITERAL:
                aux = "%s\", ";
                break;
            }
            saida.append(aux+ic.getText());
            
        }
        saida.append(");\n");
        return null;
    }

    @Override
    public Void visitCmdEnquanto(RegrasParser.CmdEnquantoContext ctx) {
        saida.append("while(");
        visitExpressao(ctx.expressao());
        saida.append("){\n");
        for(RegrasParser.CmdContext cmdC : ctx.cmd()){
            visitCmd(cmdC);
        }
        saida.append("}\n");
        return null;
    }

    @Override 
    public Void visitCmdPara(RegrasParser.CmdParaContext ctx) {
        saida.append("for( " + ctx.IDENT().getText() + " = " + ctx.exp_aritmetica().get(0).getText() + "; " + ctx.IDENT().getText() + " <= " + 
            ctx.exp_aritmetica(1).getText() + "; " + ctx.IDENT().getText() + "++ ){\n");
        for(RegrasParser.CmdContext cmdC : ctx.cmd()){
            visitCmd(cmdC);
        }
        saida.append("}\n");

        return null;
    }

    @Override
    public Void visitCmdFaca(RegrasParser.CmdFacaContext ctx){
        saida.append("do{" + "\n");
        for(RegrasParser.CmdContext cmdC : ctx.cmd()){
            visitCmd(cmdC);
        }
        saida.append("} while( ");
        visitExpressao(ctx.expressao());
        saida.append(");" + "\n");
        
        return null;
    }
 
    @Override
    public Void visitCmdEscreva(RegrasParser.CmdEscrevaContext ctx) {
        saida.append("printf(\"");
        String aux="";
        for(RegrasParser.ExpressaoContext ec : ctx.expressao()){
            TipoLA tipo = LASemanticoUtils.verificarTipo(Calculador.escoposAninhados.obterEscopoAtual(), ec);
            
            switch (tipo) {
            case INTEIRO:
                aux += ","+ec.getText();
                saida.append("%d");
                break;
            case REAL:
                aux += ","+ec.getText();
                saida.append("%f");
                break;
            case LITERAL:
                if(Calculador.escoposAninhados.obterEscopoAtual().existe(ec.getText())){
                     aux += ","+ec.getText();
                     saida.append("%s");
                }else{
                     String aux2= ec.getText().split("\"")[1];
                     saida.append(aux2);
                }
                
                break;
            }
            
            
        }
        saida.append("\""+aux);
        saida.append(");\n");
         
        return null;
    }

   
/*
    @Override
    public Void visitRegistro(RegrasParser.registroContext ctx){


    }


    @Override
    public Void visitProcedimento(RegrasParser.procedimentoContext ctx){


    }

    @Override
    public Void visitFuncao(RegrasParser.funcaoContext ctx){

    }

*/
}