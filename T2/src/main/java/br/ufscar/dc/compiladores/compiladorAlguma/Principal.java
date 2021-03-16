/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.dc.compiladores.compiladorAlguma;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class Principal {

    public static void main(String args[]) {
        try (PrintWriter pw = new PrintWriter(new File(args[1]))) {

            //Leitura do arquivo de entrada
            CharStream cs = CharStreams.fromFileName(args[0]);
            RegrasLexicasLexer lex = new RegrasLexicasLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lex);
            RegrasLexicasParser parser = new RegrasLexicasParser(tokens);

            CustomErrorListener mcel = new CustomErrorListener(pw);
            parser.removeErrorListeners();
            parser.addErrorListener(mcel);

            Token t = null;
            //Enquanto existirem tokens
            while ((t = lex.nextToken()).getType() != Token.EOF) {
                //Tratamento de erros
                if (RegrasLexicasLexer.VOCABULARY.getDisplayName(t.getType()).equals("COMENTARIO_NAO_FECHADO")) {
                    pw.println("Linha " + (lex.getLine() - 1) + ": comentario nao fechado");
                    pw.println("Fim da compilacao");
                    pw.close();
                    return;
                }
                if (RegrasLexicasLexer.VOCABULARY.getDisplayName(t.getType()).equals("CADEIA_NAO_FECHADA")) {
                    pw.println("Linha " + (lex.getLine() - 1) + ": cadeia literal nao fechada");
                    pw.println("Fim da compilacao");
                    pw.close();
                    return;
                }
                if (RegrasLexicasLexer.VOCABULARY.getDisplayName(t.getType()).equals("ERRO")) {
                    pw.println("Linha " + lex.getLine() + ": " + t.getText() + " - simbolo nao identificado");
                    pw.println("Fim da compilacao");
                    pw.close();
                    return;
                }

            }
            //resetar os tokens para o inicio
            lex.reset();

            parser.programa();
            pw.close();

        } catch (IOException ex) {
        }
    }
}
