/* The following code was generated by JFlex 1.4.3 on 10/22/18 9:41 PM */

package ASM.Analizador;
    
import java_cup.runtime.Symbol;
import java.io.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.LinkedList;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 10/22/18 9:41 PM from the specification file
 * <tt>Scanner.jflex</tt>
 */
public class ScannerASM implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\37\1\5\1\0\1\37\1\4\22\0\1\37\3\0\1\35"+
    "\2\0\1\0\1\12\1\13\1\7\1\0\1\22\1\0\1\2\1\6"+
    "\12\1\1\14\1\15\5\0\1\23\1\3\1\34\1\24\1\36\1\26"+
    "\2\3\1\25\2\3\1\20\1\27\1\16\1\21\1\32\1\3\1\33"+
    "\1\3\1\30\1\17\1\31\4\3\4\0\1\3\1\0\1\23\1\3"+
    "\1\34\1\24\1\36\1\26\2\3\1\25\2\3\1\20\1\27\1\16"+
    "\1\21\1\32\1\3\1\33\1\3\1\30\1\17\1\31\4\3\1\10"+
    "\1\0\1\11\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\1\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\4\1\14\5\4"+
    "\1\15\1\4\1\0\1\16\1\0\10\4\1\17\2\16"+
    "\2\0\1\4\1\20\1\4\1\21\2\4\1\22\1\4"+
    "\1\23\1\0\1\16\1\24\1\25\1\4\1\26\2\4"+
    "\1\27\2\4\1\30";

  private static int [] zzUnpackAction() {
    int [] result = new int[59];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\40\0\100\0\40\0\140\0\200\0\240\0\40"+
    "\0\40\0\40\0\40\0\40\0\40\0\300\0\40\0\340"+
    "\0\u0100\0\u0120\0\u0140\0\u0160\0\40\0\u0180\0\u01a0\0\u01c0"+
    "\0\u01e0\0\u0200\0\u0220\0\u0240\0\u0260\0\u0280\0\u02a0\0\u02c0"+
    "\0\u02e0\0\u01a0\0\u0300\0\40\0\u0320\0\u0340\0\u0360\0\140"+
    "\0\u0380\0\140\0\u03a0\0\u03c0\0\140\0\u03e0\0\140\0\u0400"+
    "\0\u0320\0\140\0\140\0\u0420\0\140\0\u0440\0\u0460\0\140"+
    "\0\u0480\0\u04a0\0\140";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[59];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\2\6\1\7\1\2\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\3\5\1\17"+
    "\1\20\1\21\1\5\1\22\1\23\2\5\1\24\2\5"+
    "\1\25\1\26\1\6\41\0\1\3\1\27\36\0\1\5"+
    "\1\0\1\5\12\0\4\5\1\0\12\5\1\0\1\5"+
    "\5\0\2\6\31\0\1\6\6\0\1\30\1\31\31\0"+
    "\1\5\1\0\1\5\12\0\1\5\1\32\2\5\1\0"+
    "\12\5\1\0\1\5\2\0\1\5\1\0\1\5\12\0"+
    "\4\5\1\0\1\5\1\33\10\5\1\0\1\5\2\0"+
    "\1\5\1\0\1\5\12\0\4\5\1\0\2\5\1\34"+
    "\7\5\1\0\1\5\2\0\1\5\1\0\1\5\12\0"+
    "\1\5\1\35\2\5\1\0\12\5\1\0\1\5\2\0"+
    "\1\5\1\0\1\5\12\0\1\5\1\36\1\5\1\37"+
    "\1\0\12\5\1\0\1\5\2\0\1\5\1\0\1\5"+
    "\12\0\4\5\1\0\10\5\1\40\1\5\1\0\1\5"+
    "\2\0\1\5\1\0\1\5\12\0\1\41\3\5\1\0"+
    "\12\5\1\0\1\5\2\0\1\42\36\0\4\30\1\43"+
    "\1\44\32\30\7\45\1\46\30\45\1\0\1\5\1\0"+
    "\1\5\12\0\2\5\1\47\1\5\1\0\12\5\1\0"+
    "\1\5\2\0\1\5\1\0\1\5\12\0\4\5\1\0"+
    "\1\5\1\50\10\5\1\0\1\5\2\0\1\5\1\0"+
    "\1\5\12\0\4\5\1\0\3\5\1\51\2\5\1\52"+
    "\3\5\1\0\1\5\2\0\1\5\1\0\1\5\12\0"+
    "\1\53\3\5\1\0\12\5\1\0\1\5\2\0\1\5"+
    "\1\0\1\5\12\0\2\5\1\54\1\5\1\0\12\5"+
    "\1\0\1\5\2\0\1\5\1\0\1\5\12\0\4\5"+
    "\1\0\1\5\1\55\10\5\1\0\1\5\2\0\1\5"+
    "\1\0\1\5\12\0\4\5\1\0\2\5\1\56\7\5"+
    "\1\0\1\5\2\0\1\5\1\0\1\5\12\0\4\5"+
    "\1\0\1\5\1\57\10\5\1\0\1\5\6\0\1\44"+
    "\32\0\7\45\1\60\36\45\1\61\1\60\30\45\1\0"+
    "\1\5\1\0\1\5\12\0\3\5\1\62\1\0\12\5"+
    "\1\0\1\5\2\0\1\5\1\0\1\5\12\0\4\5"+
    "\1\0\3\5\1\63\6\5\1\0\1\5\2\0\1\5"+
    "\1\0\1\5\12\0\4\5\1\0\11\5\1\64\1\0"+
    "\1\5\2\0\1\5\1\0\1\5\12\0\4\5\1\0"+
    "\5\5\1\65\4\5\1\0\1\5\2\0\1\5\1\0"+
    "\1\5\12\0\1\66\3\5\1\0\12\5\1\0\1\5"+
    "\1\0\6\45\1\44\1\60\30\45\1\0\1\5\1\0"+
    "\1\5\12\0\4\5\1\0\5\5\1\67\4\5\1\0"+
    "\1\5\2\0\1\5\1\0\1\5\12\0\4\5\1\0"+
    "\5\5\1\70\4\5\1\0\1\5\2\0\1\5\1\0"+
    "\1\5\12\0\4\5\1\0\2\5\1\71\7\5\1\0"+
    "\1\5\2\0\1\5\1\0\1\5\12\0\3\5\1\72"+
    "\1\0\12\5\1\0\1\5\2\0\1\5\1\0\1\5"+
    "\12\0\1\73\3\5\1\0\12\5\1\0\1\5\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1216];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\3\1\6\11\1\1\1\11"+
    "\5\1\1\11\1\1\1\0\1\1\1\0\12\1\1\11"+
    "\2\0\11\1\1\0\13\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[59];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
public static String cadena;

/* ------------------------==: METODO DE ERROR LEXICO :==---------------------*/
    private void ErrorScan(int linea, int columna, String valor) {
        System.out.println("Error Lexico Iden: " + valor + ", " + linea + ", " + columna);
        cadena += "<tr>"
                + "<td><center><b>" + valor + "</b></center></td>"
                + "<td><center><b>" + linea + "</b></center></td>"
                + "<td><center><b>" + columna + "</b></center></td>"
                + "</tr>";
    }



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public ScannerASM(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public ScannerASM(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 146) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 17: 
          { System.out.println("division");   return new Symbol (simbolosASM.div, yyline+1,yychar+1, new String (yytext()));
          }
        case 25: break;
        case 15: 
          { System.out.println(yytext());                return new Symbol (simbolosASM.numero_decimal, yyline+1,yychar+1, new String (yytext()));
          }
        case 26: break;
        case 22: 
          { System.out.println("multiplicacion");   return new Symbol (simbolosASM.mult, yyline+1,yychar+1, new String (yytext()));
          }
        case 27: break;
        case 20: 
          { System.out.println("nulo");   return new Symbol (simbolosASM.nulo, yyline+1,yychar+1, new String (yytext()));
          }
        case 28: break;
        case 2: 
          { System.out.println(yytext());                return new Symbol (simbolosASM.numero_entero, yyline+1,yychar+1, new String (yytext()));
          }
        case 29: break;
        case 23: 
          { System.out.println("print");   return new Symbol (simbolosASM.print, yyline+1,yychar+1, new String (yytext()));
          }
        case 30: break;
        case 14: 
          { System.out.println("comentario");   /* se ignora*/
          }
        case 31: break;
        case 8: 
          { System.out.println("abrePar");   return new Symbol (simbolosASM.abrePar, yyline+1,yychar+1, new String (yytext()));
          }
        case 32: break;
        case 11: 
          { System.out.println("puntoComa");   return new Symbol (simbolosASM.puntoComa, yyline+1,yychar+1, new String (yytext()));
          }
        case 33: break;
        case 1: 
          { ErrorScan(yyline,yychar,yytext());
          }
        case 34: break;
        case 18: 
          { System.out.println("mod");   return new Symbol (simbolosASM.mod, yyline+1,yychar+1, new String (yytext()));
          }
        case 35: break;
        case 9: 
          { System.out.println("cierraPar");   return new Symbol (simbolosASM.cierraPar, yyline+1,yychar+1, new String (yytext()));
          }
        case 36: break;
        case 5: 
          { /* Se ignoran */
          }
        case 37: break;
        case 10: 
          { System.out.println("dosPuntos");   return new Symbol (simbolosASM.dosPuntos, yyline+1,yychar+1, new String (yytext()));
          }
        case 38: break;
        case 16: 
          { System.out.println("add");   return new Symbol (simbolosASM.add, yyline+1,yychar+1, new String (yytext()));
          }
        case 39: break;
        case 4: 
          { System.out.println(yytext());                return new Symbol (simbolosASM.identificador, yyline+1,yychar+1, new String (yytext()));
          }
        case 40: break;
        case 6: 
          { System.out.println("abreLlave");   return new Symbol (simbolosASM.abreLlave, yyline+1,yychar+1, new String (yytext()));
          }
        case 41: break;
        case 21: 
          { System.out.println("diff");   return new Symbol (simbolosASM.diff, yyline+1,yychar+1, new String (yytext()));
          }
        case 42: break;
        case 24: 
          { System.out.println("function");   return new Symbol (simbolosASM.function, yyline+1,yychar+1, new String (yytext()));
          }
        case 43: break;
        case 13: 
          { System.out.println("dolar");   return new Symbol (simbolosASM.dolar, yyline+1,yychar+1, new String (yytext()));
          }
        case 44: break;
        case 12: 
          { System.out.println("coma");   return new Symbol (simbolosASM.coma, yyline+1,yychar+1, new String (yytext()));
          }
        case 45: break;
        case 7: 
          { System.out.println("cierraLlave");   return new Symbol (simbolosASM.cierraLlave, yyline+1,yychar+1, new String (yytext()));
          }
        case 46: break;
        case 19: 
          { System.out.println("end");   return new Symbol (simbolosASM.end, yyline+1,yychar+1, new String (yytext()));
          }
        case 47: break;
        case 3: 
          { System.out.println("punto");   return new Symbol (simbolosASM.punto, yyline+1,yychar+1, new String (yytext()));
          }
        case 48: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(simbolosASM.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
