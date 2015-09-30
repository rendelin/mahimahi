
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed Sep 30 10:04:15 EDT 2015
//----------------------------------------------------

package mahimahi.parser;

import mahimahi.parser.SymbolValue;
import java_cup.runtime.*;
import java.util.*;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileNotFoundException;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed Sep 30 10:04:15 EDT 2015
  */
public class MeggyJavaParser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public MeggyJavaParser() {super();}

  /** Constructor which sets the default scanner. */
  public MeggyJavaParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public MeggyJavaParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\013\000\002\002\004\000\002\002\006\000\002\010" +
    "\002\000\002\003\024\000\002\004\004\000\002\004\003" +
    "\000\002\005\013\000\002\007\006\000\002\007\003\000" +
    "\002\007\003\000\002\006\002" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\050\000\004\060\005\001\002\000\004\002\052\001" +
    "\002\000\004\061\006\001\002\000\004\024\007\001\002" +
    "\000\004\046\011\001\002\000\004\002\000\001\002\000" +
    "\004\035\012\001\002\000\004\020\uffff\001\002\000\004" +
    "\020\014\001\002\000\004\042\015\001\002\000\004\044" +
    "\016\001\002\000\004\031\017\001\002\000\004\036\020" +
    "\001\002\000\004\016\021\001\002\000\004\030\022\001" +
    "\002\000\004\022\023\001\002\000\004\023\024\001\002" +
    "\000\004\035\025\001\002\000\004\017\026\001\002\000" +
    "\004\020\027\001\002\000\004\062\031\001\002\000\004" +
    "\021\050\001\002\000\004\016\032\001\002\000\010\016" +
    "\036\051\034\052\033\001\002\000\006\014\ufff8\017\ufff8" +
    "\001\002\000\006\014\ufff9\017\ufff9\001\002\000\004\014" +
    "\042\001\002\000\004\027\037\001\002\000\004\017\040" +
    "\001\002\000\010\016\036\051\034\052\033\001\002\000" +
    "\006\014\ufffa\017\ufffa\001\002\000\010\016\036\051\034" +
    "\052\033\001\002\000\004\014\044\001\002\000\010\016" +
    "\036\051\034\052\033\001\002\000\004\017\046\001\002" +
    "\000\004\024\047\001\002\000\004\021\ufffb\001\002\000" +
    "\004\021\051\001\002\000\004\002\ufffe\001\002\000\004" +
    "\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\050\000\004\002\003\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\003\007\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\010\012\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\005" +
    "\027\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\007\034\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\007\040\001\001\000\002\001\001\000\004\007\042\001" +
    "\001\000\002\001\001\000\004\007\044\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$MeggyJavaParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$MeggyJavaParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$MeggyJavaParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  
             public PrintWriter out;
	     public String programName;

       	     public void unrecovered_syntax_error(Symbol cur_SymbolValue) {
               report_fatal_error("Fatal syntax error", cur_SymbolValue);
             }

	     public void report_fatal_error(String message, Object info) {
               Symbol symbolValue = (Symbol)info;
	       SymbolValue tok = (SymbolValue)symbolValue.value;

               report_error(message, info); done_parsing();
               throw new ParseException("Fatal parsing error", tok.line, tok.pos);
             }
       
             public void report_error(String message, Object info) {
	       Symbol symbolValue = (Symbol) info;
	       SymbolValue tok = (SymbolValue) symbolValue.value;
	       System.err.println("[" + tok.line + "," + tok.pos + "]" + message + " at " + tok.toString() );
             }            
       
             
}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$MeggyJavaParser$actions {

 private PrintStream sout; 
  private final MeggyJavaParser parser;

  /** Constructor */
  CUP$MeggyJavaParser$actions(MeggyJavaParser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$MeggyJavaParser$do_action(
    int                        CUP$MeggyJavaParser$act_num,
    java_cup.runtime.lr_parser CUP$MeggyJavaParser$parser,
    java.util.Stack            CUP$MeggyJavaParser$stack,
    int                        CUP$MeggyJavaParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$MeggyJavaParser$result;

      /* select the action based on the action number */
      switch (CUP$MeggyJavaParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // Empty ::= 
            {
              Object RESULT =null;

              CUP$MeggyJavaParser$result = parser.getSymbolFactory().newSymbol("Empty",4, ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.peek()), RESULT);
            }
          return CUP$MeggyJavaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Expression ::= COLOR_LITERAL 
            {
              SymbolValue RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.peek()).right;
		SymbolValue e = (SymbolValue)((java_cup.runtime.Symbol) CUP$MeggyJavaParser$stack.peek()).value;
		 RESULT = e;  
              CUP$MeggyJavaParser$result = parser.getSymbolFactory().newSymbol("Expression",5, ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.peek()), RESULT);
            }
          return CUP$MeggyJavaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Expression ::= INT_LITERAL 
            {
              SymbolValue RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.peek()).right;
		SymbolValue e = (SymbolValue)((java_cup.runtime.Symbol) CUP$MeggyJavaParser$stack.peek()).value;
		 RESULT = e; 
              CUP$MeggyJavaParser$result = parser.getSymbolFactory().newSymbol("Expression",5, ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.peek()), RESULT);
            }
          return CUP$MeggyJavaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // Expression ::= LPAREN BYTE RPAREN Expression 
            {
              SymbolValue RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.peek()).right;
		SymbolValue e = (SymbolValue)((java_cup.runtime.Symbol) CUP$MeggyJavaParser$stack.peek()).value;
		 RESULT = e; 
              CUP$MeggyJavaParser$result = parser.getSymbolFactory().newSymbol("Expression",5, ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.elementAt(CUP$MeggyJavaParser$top-3)), ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.peek()), RESULT);
            }
          return CUP$MeggyJavaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // Statement ::= MEGGYSETPIXEL LPAREN Expression COMMA Expression COMMA Expression RPAREN SEMI 
            {
              Object RESULT =null;
		int e0left = ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.elementAt(CUP$MeggyJavaParser$top-6)).left;
		int e0right = ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.elementAt(CUP$MeggyJavaParser$top-6)).right;
		SymbolValue e0 = (SymbolValue)((java_cup.runtime.Symbol) CUP$MeggyJavaParser$stack.elementAt(CUP$MeggyJavaParser$top-6)).value;
		int e1left = ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.elementAt(CUP$MeggyJavaParser$top-4)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.elementAt(CUP$MeggyJavaParser$top-4)).right;
		SymbolValue e1 = (SymbolValue)((java_cup.runtime.Symbol) CUP$MeggyJavaParser$stack.elementAt(CUP$MeggyJavaParser$top-4)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.elementAt(CUP$MeggyJavaParser$top-2)).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.elementAt(CUP$MeggyJavaParser$top-2)).right;
		SymbolValue e2 = (SymbolValue)((java_cup.runtime.Symbol) CUP$MeggyJavaParser$stack.elementAt(CUP$MeggyJavaParser$top-2)).value;
		System.out.println(e0.lexeme + e1.lexeme + e2.lexeme);
              CUP$MeggyJavaParser$result = parser.getSymbolFactory().newSymbol("Statement",3, ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.elementAt(CUP$MeggyJavaParser$top-8)), ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.peek()), RESULT);
            }
          return CUP$MeggyJavaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // Statement_list ::= Empty 
            {
              Object RESULT =null;

              CUP$MeggyJavaParser$result = parser.getSymbolFactory().newSymbol("Statement_list",2, ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.peek()), RESULT);
            }
          return CUP$MeggyJavaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // Statement_list ::= Statement Statement_list 
            {
              Object RESULT =null;

              CUP$MeggyJavaParser$result = parser.getSymbolFactory().newSymbol("Statement_list",2, ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.elementAt(CUP$MeggyJavaParser$top-1)), ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.peek()), RESULT);
            }
          return CUP$MeggyJavaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // MainClass ::= CLASS IDENTIFIER NT$0 LBRACE PUBLIC STATIC VOID MAIN LPAREN STRING_TYPE LBRACKET RBRACKET IDENTIFIER RPAREN LBRACE Statement RBRACE RBRACE 
            {
              Object RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$MeggyJavaParser$stack.elementAt(CUP$MeggyJavaParser$top-15)).value;
		int idleft = ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.elementAt(CUP$MeggyJavaParser$top-16)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.elementAt(CUP$MeggyJavaParser$top-16)).right;
		SymbolValue id = (SymbolValue)((java_cup.runtime.Symbol) CUP$MeggyJavaParser$stack.elementAt(CUP$MeggyJavaParser$top-16)).value;
		 parser.out.flush(); 
              CUP$MeggyJavaParser$result = parser.getSymbolFactory().newSymbol("MainClass",1, ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.elementAt(CUP$MeggyJavaParser$top-17)), ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.peek()), RESULT);
            }
          return CUP$MeggyJavaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // NT$0 ::= 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.peek()).right;
		SymbolValue id = (SymbolValue)((java_cup.runtime.Symbol) CUP$MeggyJavaParser$stack.peek()).value;
 sout = new PrintStream(new FileOutputStream(id.lexeme + ".java.s")); 
	          parser.out = new PrintWriter(sout);
	       	
              CUP$MeggyJavaParser$result = parser.getSymbolFactory().newSymbol("NT$0",6, ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.peek()), RESULT);
            }
          return CUP$MeggyJavaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // Goal ::= IMPORT MEGGY SEMI MainClass 
            {
              Object RESULT =null;

              CUP$MeggyJavaParser$result = parser.getSymbolFactory().newSymbol("Goal",0, ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.elementAt(CUP$MeggyJavaParser$top-3)), ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.peek()), RESULT);
            }
          return CUP$MeggyJavaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= Goal EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.elementAt(CUP$MeggyJavaParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.elementAt(CUP$MeggyJavaParser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$MeggyJavaParser$stack.elementAt(CUP$MeggyJavaParser$top-1)).value;
		RESULT = start_val;
              CUP$MeggyJavaParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.elementAt(CUP$MeggyJavaParser$top-1)), ((java_cup.runtime.Symbol)CUP$MeggyJavaParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$MeggyJavaParser$parser.done_parsing();
          return CUP$MeggyJavaParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

