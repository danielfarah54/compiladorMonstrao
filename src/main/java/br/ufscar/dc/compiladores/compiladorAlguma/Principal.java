/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.dc.compiladores.compiladorAlguma;

import java.io.FileWriter;
import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;


public class Principal {

    public static void main(String args[]) {
        try {
            //Leitura do arquivo de entrada
            CharStream cs = CharStreams.fromFileName(args[0]);
            RegrasLexicasLexer lex = new RegrasLexicasLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lex);
            RegrasLexicasParser parser = new RegrasLexicasParser(tokens);
       
            
            FileWriter myWriter = new FileWriter(args[1]);

            Token t = null;
            //Enquanto existirem tokens
            while ((t = lex.nextToken()).getType() != Token.EOF) {
                //Tratamento de erros
                if(RegrasLexicasLexer.VOCABULARY.getDisplayName(t.getType()).equals("COMENTARIO_NAO_FECHADO")){
                    myWriter.write("Linha "+(lex.getLine()-1)+": comentario nao fechado\n");
                    break;
                }
                if(RegrasLexicasLexer.VOCABULARY.getDisplayName(t.getType()).equals("CADEIA_NAO_FECHADA")){
                    myWriter.write("Linha "+(lex.getLine()-1) +": cadeia literal nao fechada\n");
                    break;
                }
                if(RegrasLexicasLexer.VOCABULARY.getDisplayName(t.getType()).equals("ERRO")){
                    myWriter.write("Linha "+lex.getLine()+": "+t.getText()+" - simbolo nao identificado\n");
                    break;
                }
                //Escrita do token no arquivo
                myWriter.write("<'" + t.getText() + "," + RegrasLexicasLexer.VOCABULARY.getDisplayName(t.getType()) + ">\n");
                
            }
            
            parser.programa();
            myWriter.close();

        } catch (IOException ex) {
        }
    }
}
