package br.ufscar.dc.compiladores.compiladorTask;

import java.io.PrintWriter;
import java.util.BitSet;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

public class CustomErrorListener implements ANTLRErrorListener {

    PrintWriter pw;

    public CustomErrorListener(PrintWriter pw) {
        this.pw = pw;
    }

    @Override
    public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
        // Não será necessário para o T2, pode deixar vazio
    }

    @Override
    public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {
        // Não será necessário para o T2, pode deixar vazio
    }

    @Override
    public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
        // Não será necessário para o T2, pode deixar vazio
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        
        // Aqui vamos colocar o tratamento de erro customizado
        // t recebe o primeiro símbolo após a detecção do erro
        Token t = (Token) offendingSymbol;

        // Tratando o erro de fim de arquivo
        if (t.getText().equals("<EOF>")) {
            pw.println("Linha " + line + ": erro sintatico proximo a EOF");
        }
        
        // Para outros tipos de erro:
        else {
            pw.println("Linha " + line + ": erro sintatico proximo a " + t.getText());

            
        }
    }
}