package mahimahi.parser.lexer;

public class LexerException extends RuntimeException {

    private static final long serialVersionUID = 1126247415089443148L;

    public LexerException(String msg, int line, int pos) {
	super("Unrecognized token at [" + line + "," + pos + "]: " + msg);
    }
}