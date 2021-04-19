package br.ufscar.dc.compiladores.compiladorTask;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class Principal {

    public static void main(String args[]) {
        try ( PrintWriter pw = new PrintWriter(new File(args[1]))) {
            
            boolean erroLexico=false;

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

                ///System.out.println("<" + TaskRulesLexer.VOCABULARY.getDisplayName(t.getType()) + "," + t.getText() + ">");

                // TRATAMENTO DOS ERROS LÉXICOS:
                // Cadeia não fechada
                if (TaskRulesLexer.VOCABULARY.getDisplayName(t.getType()).equals("CADEIA_LINHA_NAO_FECHADA")) {
                    pw.println("Linha " + (lex.getLine() - 1) + ": cadeia literal nao fechada");
                    erroLexico=true;

                }

                if (TaskRulesLexer.VOCABULARY.getDisplayName(t.getType()).equals("CADEIA_MULTILINHA_NAO_FECHADA")) {
                    pw.println("Linha " + (lex.getLine() - 1) + ": cadeia literal nao fechada");
                    erroLexico=true;

                }

                // Símbolo não identificado
                if (TaskRulesLexer.VOCABULARY.getDisplayName(t.getType()).equals("ERRO")) {
                    pw.println("Linha " + lex.getLine() + ": " + t.getText() + " - simbolo nao identificado");
                    erroLexico=true;

                }
            }

            // TRATAMENTO DOS ERROS SINTÁTICOS E SEMÂNTICOS
            // Resetar os tokens para fazer uma nova varredura do inicio
            lex.reset();

            //CRIACAO DA ARVORE DO PROGRAMA
            TaskRulesParser.ProgramaContext arvore = parser.programa();
            //INICIALIZA ANALISADOR SEMANTICO
            AnalisadorSemantico as = new AnalisadorSemantico();
            
            if(!erroLexico){
                //ANALISADOR SEMANTICO VISITA ARVORE
            as.visitPrograma(arvore);
            
            //SE NÃO TIVER ERROS
            if (SemanticoUtils.errosSemanticos.isEmpty()) {
                //GERACAO DO CODIGO
                GeradorCronoTask aux = new GeradorCronoTask();
                aux.visitPrograma(arvore);
                pw.print(aux.saida.toString());

            } else { //SE TIVER ERROS IMPRIME OS ERROS
                for (String erros : SemanticoUtils.errosSemanticos) {
                    pw.println(erros);

                }
                pw.println("Fim da compilacao");
            }

            }
            
            pw.close();

        } catch (IOException ex) {
            // Em caso de alguma exceção, apenas ignora
            System.out.println("Erro ao abrir arquivo");
        }
    }
}
