package br.ufscar.dc.compiladores.compiladorAlguma;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;

/*
termoAritmo  === termo_logico 
fator_logico === fator_logico 
 */
public class LASemanticoUtils {

    public static List<String> errosSemanticos = new ArrayList<>();

    public static void adicionarErroSemantico(Token t, String mensagem) {
        int linha = t.getLine();
        errosSemanticos.add(String.format("Linha %d: %s", linha, mensagem));
    }

    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, RegrasParser.ExpressaoContext ctx) {
        TabelaDeSimbolos.TipoLA ret = null;

        TabelaDeSimbolos.TipoLA aux = verificarTipo(tabela, ctx.termo_logico(0));
        ret = aux;

        for (RegrasParser.Termo_logicoContext termoLogico : ctx.termo_logico()) {
            aux = verificarTipo(tabela, termoLogico);
            if (ret != aux && aux != TabelaDeSimbolos.TipoLA.INVALID) {
                //adicionarErroSemantico(ctx.start, "Expressão " + ctx.getText() + " contém tipos incompatíveis");
                ret = TabelaDeSimbolos.TipoLA.INVALID;
                return ret;
            }
        }

        return ret;
    }

    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, RegrasParser.Termo_logicoContext ctx) {
        TabelaDeSimbolos.TipoLA ret = null;
        TabelaDeSimbolos.TipoLA aux = verificarTipo(tabela, ctx.fator_logico(0));
        ret = aux;
        for (RegrasParser.Fator_logicoContext fatorLogico : ctx.fator_logico()) {
            aux= verificarTipo(tabela, fatorLogico);
            if (ret != aux && aux != TabelaDeSimbolos.TipoLA.INVALID) {
                //adicionarErroSemantico(ctx.start, "Termo " + ctx.getText() + " contém tipos incompatíveis");
                ret = TabelaDeSimbolos.TipoLA.INVALID;
                return ret;
            }
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, RegrasParser.Fator_logicoContext ctx) {

        TabelaDeSimbolos.TipoLA ret = null;

        ret = verificarTipo(tabela, ctx.parcela_logica());

        return ret;

    }

    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, RegrasParser.Parcela_logicaContext ctx) {
        TabelaDeSimbolos.TipoLA ret = null;

        if (ctx.exp_relacional() != null) {
            ret = verificarTipo(tabela, ctx.exp_relacional());

        } else {
            ret = TabelaDeSimbolos.TipoLA.LOGICO;
        }
        return ret;

    }

    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, RegrasParser.Exp_relacionalContext ctx) {

        TabelaDeSimbolos.TipoLA ret1 = null;

        ret1 = verificarTipo(tabela, ctx.exp_aritmetica().get(0));

        if (ctx.exp_aritmetica().size() > 1) {
            TabelaDeSimbolos.TipoLA ret2 = verificarTipo(tabela, ctx.exp_aritmetica().get(1));

            if (ret1 == ret2) {
                return TabelaDeSimbolos.TipoLA.LOGICO;

                //verificar se é inteiro com real (vice-versa)
            } else {
                  if ( ((ret1 == TabelaDeSimbolos.TipoLA.REAL) && (ret2 == TabelaDeSimbolos.TipoLA.INTEIRO)) || ((ret2 == TabelaDeSimbolos.TipoLA.REAL) && (ret1 == TabelaDeSimbolos.TipoLA.INTEIRO)) ) {
                    return TabelaDeSimbolos.TipoLA.LOGICO;
                } else {
                    return TabelaDeSimbolos.TipoLA.INVALID;
                }
            }
        }

        return ret1;

    }

    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, RegrasParser.Exp_aritmeticaContext ctx) {
        TabelaDeSimbolos.TipoLA ret = null;

        ret = verificarTipo(tabela, ctx.termo().get(0));

        for (RegrasParser.TermoContext termo : ctx.termo()) {
            TabelaDeSimbolos.TipoLA aux = verificarTipo(tabela, termo);
            if ((ret != aux) && (aux != TabelaDeSimbolos.TipoLA.INVALID)) {

                if ((aux == TabelaDeSimbolos.TipoLA.REAL) || (aux == TabelaDeSimbolos.TipoLA.INTEIRO)) {
                    ret = TabelaDeSimbolos.TipoLA.REAL;
                } else {

                    ret = TabelaDeSimbolos.TipoLA.INVALID;
                    return ret;
                }
            }
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, RegrasParser.TermoContext ctx) {
        TabelaDeSimbolos.TipoLA ret = null;

        ret = verificarTipo(tabela, ctx.fator().get(0));

        for (RegrasParser.FatorContext fator : ctx.fator()) {
            TabelaDeSimbolos.TipoLA aux = verificarTipo(tabela, fator);
            if ((ret != aux) && (aux != TabelaDeSimbolos.TipoLA.INVALID)) {

                if ((aux == TabelaDeSimbolos.TipoLA.REAL) || (aux == TabelaDeSimbolos.TipoLA.INTEIRO)) {
                    ret = TabelaDeSimbolos.TipoLA.REAL;
                } else {

                    ret = TabelaDeSimbolos.TipoLA.INVALID;
                    return ret;
                }
            }
        }

        return ret;
    }

    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, RegrasParser.FatorContext ctx) {
        TabelaDeSimbolos.TipoLA ret = null;

        ret = verificarTipo(tabela, ctx.parcela().get(0));

        for (RegrasParser.ParcelaContext parcela : ctx.parcela()) {
            ret = verificarTipo(tabela, parcela);
            
        }

        return ret;
    }

    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, RegrasParser.ParcelaContext ctx) {

        if (ctx.parcela_nao_unario() != null) {
            return verificarTipo(tabela, ctx.parcela_nao_unario());
        } else {
            return verificarTipo(tabela, ctx.parcela_unario());
        }
    }

    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, RegrasParser.Parcela_nao_unarioContext ctx) {
        TabelaDeSimbolos.TipoLA ret = null;

        if (ctx.identificador() != null) {
            if (!tabela.existe(ctx.identificador().getText())) {
                adicionarErroSemantico(ctx.identificador().getStart(), "identificador " + ctx.identificador().getText() + " nao declarado");
                ret = TabelaDeSimbolos.TipoLA.INVALID;
                return ret;
            } else {
                ret = tabela.verificar(ctx.identificador().getText());
                return ret;
            }
        } else {
            ret = TabelaDeSimbolos.TipoLA.LITERAL;
            return ret;
        }
    }

    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, RegrasParser.Parcela_unarioContext ctx) {
        TabelaDeSimbolos.TipoLA ret = null;
        
        if (ctx.identificador() != null) {
            //System.out.println("entrou - if");
            String nome = null;
             if (ctx.identificador().dimensao().exp_aritmetica().size() > 0) {
                nome = ctx.identificador().IDENT().get(0).getText();
            } else {
                nome = ctx.identificador().getText();
            }
            if (tabela.existe(nome)) {
                ret = tabela.verificar(nome);
            } else {
                
                TabelaDeSimbolos tabelaGlobal = Calculador.escoposAninhados.percorrerEscoposAninhados().get(Calculador.escoposAninhados.percorrerEscoposAninhados().size()-1);
                if (!tabelaGlobal.existe(nome)) {
                    //ARRUMAR ISSO
                    //NAO DEVERIA REPETIR
                    if(!errosSemanticos.contains("Linha "+ctx.identificador().getStart().getLine()+": "+"identificador " + ctx.identificador().getText() + " nao declarado")){
                        adicionarErroSemantico(ctx.identificador().start, "identificador " + ctx.identificador().getText() + " nao declarado");
                        ret = TabelaDeSimbolos.TipoLA.INVALID;
                    }
                    
                } else {
                    
                   ret = tabelaGlobal.verificar(nome);
                }
            }
            
            
        } else if (ctx.IDENT() != null) {
            //System.out.println("entrou ident");
            if (Calculador.tabelaFuncaoProcedimento.containsKey(ctx.IDENT().getText())) {
                System.out.println("funcao/proc declarado");
                List<TabelaDeSimbolos.TipoLA> aux = Calculador.tabelaFuncaoProcedimento.get(ctx.IDENT().getText());
                System.out.println("EM " + ctx.IDENT().getText() + " FUNCAO");
                if (aux.size()-1 == ctx.expressao().size()) {
                    System.out.println(aux);
                    for (int i = 0; i < ctx.expressao().size(); i++) {
                        System.out.println("TIPO PARAM: " + aux.get(i) + " TIPO EXPRESSAO (" + ctx.expressao().get(i).getText() + "): " + verificarTipo(tabela, ctx.expressao().get(i)));
                        if (aux.get(i) != verificarTipo(tabela, ctx.expressao().get(i))) {
                            
                            adicionarErroSemantico(ctx.expressao().get(i).getStart(), "incompatibilidade de parametros na chamada de " + ctx.IDENT().getText());
                        }
                    }
                    ret = aux.get(aux.size()-1);
                } else {
                    System.out.println("aasuaiduaiduasidsi");
                    //System.out.println("Linha "+ctx.IDENT().getSymbol().getLine()+": incompatibilidade de parametros na chamada de " + ctx.IDENT().getText());
                    //if(!errosSemanticos.contains("Linha "+ctx.IDENT().getSymbol().getLine()+": incompatibilidade de parametros na chamada de " + ctx.IDENT().getText())){
                        adicionarErroSemantico(ctx.IDENT().getSymbol(), "incompatibilidade de parametros na chamada de " + ctx.IDENT().getText());
                    //}
                }
            } else {
                ret = TabelaDeSimbolos.TipoLA.INVALID;
            }
        } else if(ctx.NUM_INT()!=null){
            ret = TabelaDeSimbolos.TipoLA.INTEIRO;
        }else if(ctx.NUM_REAL()!=null){
            ret = TabelaDeSimbolos.TipoLA.REAL;
        }else{
            
            ret = verificarTipo(tabela, ctx.expressao().get(0));
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, RegrasParser.IdentificadorContext ctx){
        String nomeVar = ctx.IDENT().get(0).getText();
        
        return tabela.verificar(nomeVar);
    }
    
    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, String nomeVar) {
        return tabela.verificar(nomeVar);
    }

}
