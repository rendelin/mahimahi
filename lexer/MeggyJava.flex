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
  {Comments}           { }
  {WhiteSpace}         { }

  /* Meggy Java Operators */
  "+"                    {return symbol(sym.PLUS);}
  "-"                    {return symbol(sym.MINUS);}
  "*"                    {return symbol(sym.TIMES);}
  "("                    {return symbol(sym.LPAREN);}
  ")"                    {return symbol(sym.RPAREN);}
  "="                    {return symbol(sym.ASSIGN);}
  "{"                    {return symbol(sym.LBRACE);}
  "}"                    {return symbol(sym.RBRACE);}
  ";"                    {return symbol(sym.SEMI);}
  "=="                   {return symbol(sym.EQUAL);}
  "&&"                   {return symbol(sym.AND);}
  "<"                    {return symbol(sym.LT);}
  "!"                    {return symbol(sym.NOT);}
  ","                    {return symbol(sym.COMMA);}
  "["                    {return symbol(sym.LBRACKET);}
  "]"                    {return symbol(sym.RBRACKET);}
  "."                    {return symbol(sym.DOT);}

  /* Meggy Java Types */
  "boolean"           {return symbol(sym.BOOLEAN)}
  "int"               {return symbol(sym.INT)}
  "byte"              {return symbol(sym.BYTE)}
  "Meggy.Color"       {return symbol(sym.COLOR)}
  "Meggy.Button"      {return symbol(sym.BUTTON)}
  "Meggy.Tone"        {return symbol(sym.TONE)}
}

<STRING>{
  \"                   {yybegin(YYINITIAL); return symbol(sym.STRING_LITERAL, string.toString());}
  \\                   { string.append('\\'); }
}


