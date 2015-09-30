package mahimahi.parser.lexer;
import mahimahi.parser.sym;
import mahimahi.parser.SymbolValue;
import java_cup.runtime.Symbol;
import java.io.FileInputStream;
import java.io.InputStream;

%%

%class MeggyJavaLexer   /* The class name will be generated */
%public
%unicode
%cup
%line
%column

%{
  StringBuffer string = new StringBuffer();

  private Symbol symbol(int type) {
    SymbolValue symValue;
    int tokValue = -1;

    if(type == sym.COLOR_LITERAL) {
	String color = yytext().split(".")[2];

	switch(color) {
	case "DARK": tokValue = 0; break;
	case "RED":  tokValue = 1; break;	    
	case "ORANGE": tokValue = 2; break;
	case "YELLOW": tokValue = 3; break;
	case "GREEN":  tokValue = 4; break;	    
	case "BLUE":   tokValue = 5; break;
	case "VIOLET": tokValue = 6; break;    
	case "WHITE":  tokValue = 7; break;
	default:
	    throw new LexerException("Color " + color, yyline, yycolumn);
	}
    }
    else if(type == sym.BUTTON_LITERAL) {
	String button = yytext().split(".")[2];

	switch(button) {
	case "B": tokValue = 1; break;
	case "A": tokValue = 2; break;
	case "Up": tokValue = 4; break;
	case "Down": tokValue = 8; break;
	case "Left": tokValue = 16; break;
	case "Right": tokValue = 32; break;
	default:
	    throw new LexerException("Button " + button, yyline, yycolumn);
	}
    }else if(type == sym.TONE_LITERAL)  {
	String tone = yytext().split(".")[2];

	switch(tone) {
	case "C3": tokValue = 61157; break;
	case "Cs3": tokValue = 57724; break;
 	case "D3": tokValue = 54485; break;
 	case "Ds3": tokValue = 51427; break;
 	case "E3": tokValue = 48541; break;
 	case "F3": tokValue = 45816; break;
 	case "Fs3": tokValue = 43243; break;
 	case "G3": tokValue = 40816; break;
 	case "Gs3": tokValue = 38526; break;
 	case "A3": tokValue = 36363; break;
 	case "As3": tokValue = 34323; break;
 	case "B3": tokValue = 32397; break;
	default:
	    throw new LexerException("Tone " + tone, yyline, yycolumn);
	}
    } else if(type == sym.INT_LITERAL) {
	tokValue = Integer.valueOf(yytext());
    }
    symValue = new SymbolValue(yyline, yycolumn, yytext(), tokValue);
    return new Symbol(type, yyline, yycolumn, symValue);
  }
  
  private Symbol symbol(int type, int value) {
    SymbolValue symValue = new SymbolValue(yyline, yycolumn, yytext(), value);

    return new Symbol(type, yyline, yycolumn, symValue);
  }

  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }

  private SymbolValue symVal(String name, int value) {
    return new SymbolValue(yyline, yycolumn, name, value);
  }

  private SymbolValue symVal(String name) {
    return new SymbolValue(yyline, yycolumn, name);
  }

%}

%eofval{
  return new Symbol(sym.EOF);
%eofval}

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t\f] 

/* comments */
Comments       = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}

TraditionalComment   = "/*" [^*]~ "*/"  |  "/* " "*"+ "*/"
EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}?  /* Last line comment has no line terminator */
DocumentationComment = "/**" {CommentContent} "*"+ "/"
CommentContent       = ([^*] | \*+ [^*] )*

Identifier           = [A-Za-z] [A-Za-z0-9]*

DecIntegerLiteral    = 0 | [1-9][0-9]*

ColorLiteral         = "Meggy.Color."("DARK" | "RED" | "ORANHE" | "YELLOW" | "GREEN" | "BLUE" | "VIOLET" | "WHITE")
ButtonLiteral        = "Meggy.Button."("A" | "B" | "Up" | "Down" | "Left" | "Right")
ToneLiteral          = "Meggy.Tone."("C3" | "D3" | "E3" | "F3" | "G3" | "A3" | "B3" | "Cs3" | "Ds3" | "Fs3" | "Gs3" | "As3")

%state STRING

%%
<YYINITIAL> {

  /* Meggy Java Statements keywords */
  "Meggy.setPixel"            {return symbol(sym.MEGGYSETPIXEL);}  
  "Meggy.setAuxLEDs"          {return symbol(sym.MEGGYSETAUXLEDS);}  
  "Meggy.toneStart"           {return symbol(sym.MEGGYTONESTART);}  
  "Meggy.delay"               {return symbol(sym.MEGGYDELAY);}  
  "Meggy.getPixel"            {return symbol(sym.MEGGYGETPIXEL);}  
  "Meggy.checkButton"         {return symbol(sym.MEGGYCHECKBUTTON);}

  /* Meggy Java Types */
  "boolean"           {return symbol(sym.BOOLEAN);}
  "int"               {return symbol(sym.INT);}
  "byte"              {return symbol(sym.BYTE);}
  "String"            {return symbol(sym.STRING_TYPE);}
  "void"              {return symbol(sym.VOID);}
  "Meggy.Color"       {return symbol(sym.COLOR);}
  "Meggy.Button"      {return symbol(sym.BUTTON);}
  "Meggy.Tone"        {return symbol(sym.TONE);}

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

  /* Meggy Java Keyword */
  "main"              {return symbol(sym.MAIN);}
  "if"                {return symbol(sym.IF);}
  "else"              {return symbol(sym.ELSE);}
  "while"             {return symbol(sym.WHILE);}
  "public"            {return symbol(sym.PUBLIC);}
  "return"            {return symbol(sym.RETURN);}
  "static"            {return symbol(sym.STATIC);}
  "this"              {return symbol(sym.THIS);}
  "class"             {return symbol(sym.CLASS);}
  "extends"           {return symbol(sym.EXTENDS);}
  "new"               {return symbol(sym.NEW);}
  "import"            {return symbol(sym.IMPORT);}

  /* Meggy Java Constants */
  "meggy.Meggy"              {return symbol(sym.MEGGY);}  
  {ColorLiteral}             {return symbol(sym.COLOR_LITERAL);}  
  {ButtonLiteral}            {return symbol(sym.BUTTON_LITERAL);}
  {ToneLiteral}              {return symbol(sym.TONE_LITERAL);}
  {DecIntegerLiteral}        {return symbol(sym.INT_LITERAL);}
  "true"                     {return symbol(sym.TRUE, 1);}
  "false"                    {return symbol(sym.FALSE, 0);}

  {Identifier}         {return symbol(sym.IDENTIFIER);}

  \"                   { string.setLength(0); yybegin(STRING);}
  {Comments}           { }
  {WhiteSpace}         { }
}

<STRING>{
  \"                   {yybegin(YYINITIAL); return symbol(sym.STRING_LITERAL, string.toString());}
  [^\n\r\"\\]+         { string.append( yytext()); }
  \\n                  { string.append('\n'); }
  \\                   { string.append('\\'); }
  \\\"                 { string.append('\"'); }
  \\r                  { string.append('\r'); }
  \\t                  { string.append('\t'); }
}

[^]                    { throw new Error("Illegal character <" + yytext() + ">");}
