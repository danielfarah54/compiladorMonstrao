package br.ufscar.dc.compiladores.compiladorTask;

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

            // Leitura do arquivo de entrada
            CharStream cs = CharStreams.fromFileName(args[0]);
            
            // Declarações do analisador léxico e do analisador sintático
            TaskRulesLexer lex = new TaskRulesLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lex);
            TaskRulesParser parser = new TaskRulesParser(tokens);

            // Criação de um listener para o parser, para customização das mensagens de erro
            CustomErrorListener mcel = new CustomErrorListener(pw);
            parser.removeErrorListeners();
            parser.addErrorListener(mcel);

            Token t = null;
            
            // Enquanto existirem tokens
            while ((t = lex.nextToken()).getType() != Token.EOF) {

                //System.out.println("<" + TaskRulesLexer.VOCABULARY.getDisplayName(t.getType()) + "," + t.getText() + ">");
                
                // TRATAMENTO DOS ERROS LÉXICOS:
                
                // Cadeia não fechada
                if (TaskRulesLexer.VOCABULARY.getDisplayName(t.getType()).equals("CADEIA_NAO_FECHADA")) {
                    pw.println("Linha " + (lex.getLine() - 1) + ": cadeia literal nao fechada");
                    pw.println("Fim da compilacao");
                    pw.close();
                    return;
                }
                
                // Símbolo não identificado
                if (TaskRulesLexer.VOCABULARY.getDisplayName(t.getType()).equals("ERRO")) {
                    pw.println("Linha " + lex.getLine() + ": " + t.getText() + " - simbolo nao identificado");
                    pw.println("Fim da compilacao");
                    pw.close();
                    return;
                }
            }
            
            // TRATAMENTO DOS ERROS SINTÁTICOS:
            
            // Resetar os tokens para fazer uma nova varredura do inicio
            lex.reset();

            // Inicia o analisador sintático
            parser.programa();
            pw.close();

        } catch (IOException ex) {
            // Em caso de alguma exceção, apenas ignora
        }
    }
}
