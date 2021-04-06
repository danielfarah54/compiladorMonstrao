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

            // Leitura do arquivo de entrada
            CharStream cs = CharStreams.fromFileName(args[0]);
            
            // Declarações do analisador léxico e do analisador sintático
            RegrasLexer lex = new RegrasLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lex);
            RegrasParser parser = new RegrasParser(tokens);
            RegrasParser.ProgramaContext arvore = parser.programa();
            Calculador calc = new Calculador();
            calc.visitPrograma(arvore);
           
            
            if(LASemanticoUtils.errosSemanticos.isEmpty()){

                LAGeradorC aux = new LAGeradorC();
                aux.visitPrograma(arvore);
                pw.print(aux.saida.toString());

            }else{
                 for(String erros : LASemanticoUtils.errosSemanticos){
                    pw.println(erros);
                    
                 }
                 pw.println("Fim da compilacao");
            }

            pw.close();

        } catch (IOException ex) {
            // Em caso de alguma exceção, apenas ignora
            System.out.println("erro no arquivo");
        }
    }
}
