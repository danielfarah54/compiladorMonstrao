/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.dc.compiladores.compiladorAlguma;

import br.ufscar.dc.compiladores.compiladorAlguma.TabelaDeSimbolos.TipoLA;

public class Calculador extends RegrasBaseVisitor {

    @Override
    public Double visitPrograma(RegrasParser.ProgramaContext ctx) {
        return visitExpressao(ctx.expressao());
    }

    @Override
    public boolean visitExpressao(RegrasParser.ExpressaoContext ctx) {
        boolean valor = visitTermoLogico(ctx.termo_logico().get(0));

        for (int i = 1; i < ctx.termo_logico().size(); i++) {
            RegrasParser.Op_logico_1Context op1 = ctx.op_logico_1(i);
            RegrasParser.Termo_logicoContext termo_logico = ctx.termo_logico().get(i);

            valor = !(valor ^ visitTermoLogico(termo_logico));
        }

        return valor;
    }

    @Override
    public boolean visitTermoLogico(RegrasParser.Termo_logicoContext ctx) {
        boolean valor = visitFatorLogico(ctx.fator_logico().get(0));

        for (int i = 1; i < ctx.fator_logico().size(); i++) {
            RegrasParser.Fator_logicoContext fator_logico = ctx.fator_logico().get(i);

            valor = !(valor ^ visitFatorLogico(fator_logico));
        }
        return valor;
    }

    @Override
    public boolean visitFatorLogico(RegrasParser.Fator_logicoContext ctx) {
        boolean valor = visitParcelaLogica(ctx.parcela_logica());

        String negacao = ctx.NEGACAO().getText();

        if (negacao.equals("nao")) {
            return !valor;
        } else {
            return valor;
        }
    }

    @Override
    public boolean visitParcelaLogica(RegrasParser.Parcela_logicaContext ctx) {
        boolean valor = visitExpRelacional(ctx.exp_relacional());

        String falso = ctx.FALSO().getText();
        String verdadeiro = ctx.VERDADEIRO().getText();

        if (falso
                != null) {
            return false;
        }

        if (verdadeiro
                != null) {
            return true;
        }
        return valor;
    }

    @Override
    public boolean visitExpRelacional(RegrasParser.Exp_relacionalContext ctx) {
        Double valor1 = Double.parseDouble(ctx.exp_aritmetica().get(0).getText());
        Double valor2 = Double.parseDouble(ctx.exp_aritmetica().get(1).getText());
        
         String opRelacional = ctx.op_relacional().getText();

        if (opRelacional.equals("=")) {
            return valor1==valor2;

        } else if (opRelacional.equals("<>")) {
            return valor1!=valor2;
        } else if (opRelacional.equals(">=")) {
            return valor1>=valor2;
        } else if (opRelacional.equals("<=")) {
            return valor1<=valor2;
        } else if (opRelacional.equals(">")) {
            return valor1>valor2;
        } else if (opRelacional.equals("<")) {
            return valor1<valor2;
        }
        
        return true;
    }

    @Override
    public Double visitTermo(RegrasParser.TermoContext ctx) {
        double valor = visitFator(ctx.fator().get(0));
        for (int i = 1; i < ctx.fator().size(); i++) {
            RegrasParser.Op2Context op2 = ctx.op2(i);
            RegrasParser.FatorContext of = ctx.fator().get(i);
            String strOp2 = op2.getText();
            if (strOp2.equals("*")) {
                valor *= visitFator(of);
            } else {
                valor /= visitFator(of);
            }
        }
        return valor;
    }

    @Override
    public Double visitFator(RegrasParser.FatorContext ctx) {
        double valor = visitParcela(ctx.parcela().get(0));

    }
}

@Override
public Double visitExpAritmetica(RegrasParser.Exp_aritmeticaContext ctx){
        double valor = visitTermo(ctx.termo().get(0));
        for (int i = 1; i < ctx.termo().size(); i++) {
            RegrasParser.Op1Context op1 = ctx.op1(i);
            RegrasParser.TermoContext ot = ctx.termo().get(i);
            String strOp1 = op1.getText();
            if (strOp1.equals("+")) {
                valor += visitTermo(ot);
            } else {
                valor -= visitTermo(ot);
            }
        }
        return valor;
    }


 @Override
public Void visitPrograma(RegrasParser.ProgramaContext ctx) {
        tabela = new TabelaDeSimbolos();
        return super.visitPrograma(ctx);
    }

    @Override
public Void visitDeclaracao(RegrasParser.DeclaracaoContext ctx) {
        String nomeVar = ctx.IDENT().getText();
        String strTipoVar = ctx.tipo_basico().getText();
        TipoLA tipoVar = TipoLA.INVALIDO;
        switch (strTipoVar) {
            case "inteiro":
                tipoVar = TipoLA.INTEIRO;
                break;
            case "real":
                tipoVar = TipoLA.REAL;
                break;
            default:
                // Nunca irá acontecer, pois o analisador sintático
                // não permite
                break;
        }

        // Verificar se a variável já foi declarada
        if (tabela.existe(nomeVar)) {
            AlgumaSemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), "Variável " + nomeVar + " já existe");
        } else {
            tabela.adicionar(nomeVar, tipoVar);
        }

        return super.visitDeclaracao(ctx);
    }
    
    
}
