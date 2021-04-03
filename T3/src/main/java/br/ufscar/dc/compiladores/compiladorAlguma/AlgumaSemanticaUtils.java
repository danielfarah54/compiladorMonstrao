package br.ufscar.dc.compiladores.compiladorAlguma;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;

/*
termoAritmo  === termo_logico 
fator_logico === fator_logico 
*/

public class AlgumaSemanticoUtils {
    public static List<String> errosSemanticos = new ArrayList<>();
    
    public static void adicionarErroSemantico(Token t, String mensagem) {
        int linha = t.getLine();
        int coluna = t.getCharPositionInLine();
        errosSemanticos.add(String.format("Erro %d:%d - %s", linha, coluna, mensagem));
    }
    
    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, RegrasParse.expressaoContext ctx) {
        TabelaDeSimbolos.TipoLA ret = null;
        for (var ta : ctx.termo_logico()) {
            TabelaDeSimbolos.TipoLA aux = verificarTipo(tabela, ta);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoLA.INVALIDO) {
                adicionarErroSemantico(ctx.start, "Expressão " + ctx.getText() + " contém tipos incompatíveis");
                ret = TabelaDeSimbolos.TipoLA.INVALIDO;
            }
        }

        return ret;
    }

    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, RegrasParse.termo_logicoContext ctx) {
        TabelaDeSimbolos.TipoLA ret = null;

        for (var fa : ctx.fator_logico()) {
            TabelaDeSimbolos.TipoLA aux = verificarTipo(tabela, fa);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoLA.INVALIDO) {
                adicionarErroSemantico(ctx.start, "Termo " + ctx.getText() + " contém tipos incompatíveis");
                ret = TabelaDeSimbolos.TipoLA.INVALIDO;
            }
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, RegrasParse.fator_logicoContext ctx) {
        if (ctx.NUM_INT() != null) {
            return TabelaDeSimbolos.TipoLA.INTEIRO;
        }
        if (ctx.NUM_REAL() != null) {
            return TabelaDeSimbolos.TipoLA.REAL;
        }
        if (ctx.IDENT() != null) {
            String nomeVar = ctx.IDENT().getText();
            if (!tabela.existe(nomeVar)) {
                adicionarErroSemantico(ctx.IDENT().getSymbol(), "identificador " + nomeVar + " nao declarado");
                return TabelaDeSimbolos.TipoLA.INVALIDO;
            }
            return verificarTipo(tabela, nomeVar);
        }
        // se não for nenhum dos tipos acima, só pode ser uma expressão
        // entre parêntesis
        return verificarTipo(tabela, ctx.expressao());
    }
    
    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, String nomeVar) {
        return tabela.verificar(nomeVar);
    }
}