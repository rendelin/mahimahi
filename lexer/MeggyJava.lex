package MeggyJava
import java_cup.runtime.Symbol;
import java.io.FileInputStream;
import java.io.InputStream;

%%

%class MeggyJavaLexer   /* The class name will be generated */
%unicode
%cup
%line
%column

%{
  StringBuffer string = new StringBuffer();
  
  private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
  }

  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }
%}

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t\f] 

/* comments */
Comments       = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}

TraditionalComment   = "/*" [^*]~ "*/"  |  "/* " "*"+ "*/"
EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}?  /* Last line comment has no line terminator */
DocumentationComment = "/**" {CommentContent} "*"+ "/"
CommentContent       = ([^*] | \*+ [^*] )*

Identifier           = [:jletter][:jletterdigit:]*

DecIntegerLiteral    = 0 | [1-9][0-9]*

%state STRING

%%

<YYINITIAL> "int"      {return symbol(sym.INT);}

<YYINITIAL> {
  {Identifier}         {return symbol(sym.IDENTIFIER);}
  {DecIntegerLiteral}  {return symbol(sym.INTEGER_LITERAL);}
  \"                   { string.setLength(0); yybegin(STRING);}
  {Comments}            { }
  {WhiteSpace}         { }
}

<STRING>{
  \"                   {yybegin(YYINITIAL); return symbol(sym.STRING_LITERAL, string.toString());}
  \\                   { string.append('\\'); }
}


