/* The following code was generated by JFlex 1.4.3 on 10/21/18 7:05 PM */

package  D_Mas_Mas.Analizador;
    

import java_cup.runtime.Symbol;
import java.io.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.LinkedList;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 10/21/18 7:05 PM from the specification file
 * <tt>Scanner.jflex</tt>
 */
public class ScannerDMM implements java_cup.runtime.Scanner {

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
    "\11\0\1\60\1\24\1\0\2\60\22\0\1\60\1\55\1\4\1\0"+
    "\1\25\1\51\1\56\1\5\1\35\1\36\1\23\1\45\1\44\1\46"+
    "\1\2\1\22\12\1\1\41\1\42\1\52\1\53\1\54\1\47\1\0"+
    "\1\13\1\32\1\27\1\12\1\10\1\15\2\6\1\30\2\6\1\16"+
    "\1\31\1\26\1\14\1\43\1\6\1\11\1\17\1\20\1\21\1\7"+
    "\4\6\1\37\1\0\1\40\1\50\1\3\1\0\1\13\1\32\1\27"+
    "\1\12\1\10\1\15\2\6\1\30\2\6\1\16\1\31\1\26\1\14"+
    "\1\43\1\6\1\11\1\17\1\20\1\21\1\7\4\6\1\33\1\57"+
    "\1\34\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\2\1\11\4\1\5"+
    "\1\6\1\7\1\1\5\4\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\4\1\20\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\2\1"+
    "\2\0\1\32\1\0\11\4\1\33\1\4\4\0\12\4"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\14\4\1\46\2\0\1\47\25\4\1\50"+
    "\1\51\1\52\1\53\1\54\11\4\1\55\2\4\1\56"+
    "\5\4\1\57\1\60\11\4\1\61\2\4\1\62\4\4"+
    "\1\63\12\4\1\64\1\65\12\4\1\66\1\67\1\4"+
    "\1\70\1\71\1\72\1\73\1\74\2\4\1\75\1\76"+
    "\1\77";

  private static int [] zzUnpackAction() {
    int [] result = new int[200];
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
    "\0\0\0\61\0\142\0\61\0\223\0\304\0\365\0\u0126"+
    "\0\u0157\0\u0188\0\u01b9\0\u01ea\0\u021b\0\u024c\0\u027d\0\u02ae"+
    "\0\u02df\0\61\0\u0310\0\u0341\0\u0372\0\u03a3\0\u03d4\0\u0405"+
    "\0\u0436\0\61\0\61\0\61\0\61\0\61\0\61\0\61"+
    "\0\61\0\u0467\0\61\0\u0498\0\u04c9\0\61\0\61\0\61"+
    "\0\u04fa\0\u052b\0\u055c\0\u058d\0\u05be\0\u05ef\0\u0620\0\304"+
    "\0\61\0\u0651\0\u0682\0\u06b3\0\u06e4\0\u0715\0\u0746\0\u0777"+
    "\0\u07a8\0\u07d9\0\u080a\0\u083b\0\u086c\0\u089d\0\u08ce\0\u08ff"+
    "\0\u0930\0\u0961\0\u0992\0\u09c3\0\u09f4\0\u0a25\0\u0a56\0\u0a87"+
    "\0\u0ab8\0\u0ae9\0\u0b1a\0\61\0\61\0\61\0\61\0\61"+
    "\0\61\0\61\0\61\0\u0620\0\61\0\u0b4b\0\u0b7c\0\u0bad"+
    "\0\u0bde\0\u0c0f\0\u0c40\0\u0c71\0\u0ca2\0\u0cd3\0\u0d04\0\u0d35"+
    "\0\u0d66\0\u089d\0\u0d97\0\u0dc8\0\u0930\0\u0df9\0\u0e2a\0\u0e5b"+
    "\0\u0e8c\0\u0ebd\0\u0eee\0\u0f1f\0\u0f50\0\u0f81\0\u0fb2\0\u0fe3"+
    "\0\u1014\0\u1045\0\u1076\0\u10a7\0\u10d8\0\u1109\0\u113a\0\u116b"+
    "\0\u119c\0\u11cd\0\223\0\223\0\61\0\61\0\223\0\u11fe"+
    "\0\u122f\0\u1260\0\u1291\0\u12c2\0\u12f3\0\u1324\0\u1355\0\u1386"+
    "\0\223\0\u13b7\0\u13e8\0\223\0\u1419\0\u144a\0\u147b\0\u14ac"+
    "\0\u14dd\0\223\0\223\0\u150e\0\u153f\0\u1570\0\u15a1\0\u15d2"+
    "\0\u1603\0\u1634\0\u1665\0\u1696\0\223\0\u16c7\0\u16f8\0\223"+
    "\0\u1729\0\u175a\0\u178b\0\u17bc\0\223\0\u17ed\0\u181e\0\u184f"+
    "\0\u1880\0\u18b1\0\u18e2\0\u1913\0\u1944\0\u1975\0\u19a6\0\223"+
    "\0\223\0\u19d7\0\u1a08\0\u1a39\0\u1a6a\0\u1a9b\0\u1acc\0\u1afd"+
    "\0\u1b2e\0\u1b5f\0\u1b90\0\223\0\223\0\u1bc1\0\223\0\223"+
    "\0\223\0\223\0\223\0\u1bf2\0\u1c23\0\223\0\223\0\223";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[200];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\5\1\10"+
    "\1\11\1\12\1\13\1\5\1\14\1\15\1\16\1\17"+
    "\1\20\1\5\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
    "\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
    "\1\23\62\0\1\3\1\57\57\0\1\5\1\0\1\5"+
    "\2\0\14\5\4\0\5\5\10\0\1\5\15\0\4\60"+
    "\1\61\54\60\1\0\1\62\4\0\14\62\4\0\5\62"+
    "\10\0\1\62\16\0\1\5\1\0\1\5\2\0\2\5"+
    "\1\63\2\5\1\64\6\5\4\0\5\5\10\0\1\5"+
    "\16\0\1\5\1\0\1\5\2\0\11\5\1\65\2\5"+
    "\4\0\1\66\4\5\10\0\1\5\16\0\1\5\1\0"+
    "\1\5\2\0\2\5\1\67\11\5\4\0\5\5\10\0"+
    "\1\5\16\0\1\5\1\0\1\5\2\0\2\5\1\70"+
    "\11\5\4\0\5\5\10\0\1\5\16\0\1\5\1\0"+
    "\1\5\2\0\1\5\1\71\12\5\4\0\5\5\10\0"+
    "\1\5\16\0\1\5\1\0\1\5\2\0\5\5\1\72"+
    "\6\5\4\0\5\5\10\0\1\5\16\0\1\5\1\0"+
    "\1\5\2\0\14\5\4\0\2\5\1\73\2\5\10\0"+
    "\1\5\16\0\1\5\1\0\1\5\2\0\14\5\4\0"+
    "\2\5\1\74\2\5\10\0\1\5\16\0\1\5\1\0"+
    "\1\5\2\0\3\5\1\75\10\5\4\0\5\5\10\0"+
    "\1\5\37\0\1\76\1\77\61\0\1\23\33\0\1\23"+
    "\23\0\1\100\1\0\1\101\34\0\1\5\1\0\1\5"+
    "\2\0\13\5\1\102\4\0\5\5\10\0\1\5\16\0"+
    "\1\5\1\0\1\5\2\0\5\5\1\103\1\104\4\5"+
    "\1\105\4\0\5\5\10\0\1\5\16\0\1\5\1\0"+
    "\1\5\2\0\14\5\4\0\3\5\1\106\1\5\10\0"+
    "\1\5\16\0\1\5\1\0\1\5\2\0\14\5\4\0"+
    "\2\5\1\107\2\5\10\0\1\5\16\0\1\5\1\0"+
    "\1\5\2\0\6\5\1\110\5\5\4\0\5\5\10\0"+
    "\1\5\16\0\1\5\1\0\1\5\2\0\3\5\1\111"+
    "\1\5\1\112\5\5\1\113\4\0\5\5\10\0\1\5"+
    "\62\0\1\114\61\0\1\115\65\0\1\116\60\0\1\117"+
    "\60\0\1\120\60\0\1\121\63\0\1\122\61\0\1\123"+
    "\2\0\1\124\64\0\1\125\54\0\1\5\1\0\1\5"+
    "\2\0\3\5\1\126\10\5\4\0\5\5\10\0\1\5"+
    "\16\0\1\5\1\0\1\5\2\0\14\5\4\0\1\5"+
    "\1\127\3\5\10\0\1\5\16\0\1\5\1\0\1\5"+
    "\2\0\12\5\1\130\1\5\4\0\5\5\10\0\1\5"+
    "\16\0\1\5\1\0\1\5\2\0\12\5\1\131\1\5"+
    "\4\0\5\5\10\0\1\5\16\0\1\5\1\0\1\5"+
    "\2\0\12\5\1\132\1\5\4\0\5\5\10\0\1\5"+
    "\16\0\1\5\1\0\1\5\2\0\12\5\1\133\1\5"+
    "\4\0\1\5\1\134\3\5\10\0\1\5\16\0\1\5"+
    "\1\0\1\5\2\0\5\5\1\135\6\5\4\0\5\5"+
    "\10\0\1\5\16\0\1\5\1\0\1\5\2\0\10\5"+
    "\1\136\3\5\4\0\5\5\10\0\1\5\16\0\1\5"+
    "\1\0\1\5\2\0\14\5\4\0\1\137\4\5\10\0"+
    "\1\5\16\0\1\5\1\0\1\5\2\0\14\5\4\0"+
    "\1\140\4\5\10\0\1\5\16\0\1\5\1\0\1\5"+
    "\2\0\13\5\1\141\4\0\5\5\10\0\1\5\15\0"+
    "\5\142\1\0\16\142\1\0\34\142\23\77\1\143\35\77"+
    "\23\100\1\144\35\100\5\145\1\0\16\145\1\0\34\145"+
    "\1\0\1\5\1\0\1\5\2\0\10\5\1\146\3\5"+
    "\4\0\5\5\10\0\1\5\16\0\1\5\1\0\1\5"+
    "\2\0\3\5\1\147\1\150\7\5\4\0\5\5\10\0"+
    "\1\5\16\0\1\5\1\0\1\5\2\0\14\5\4\0"+
    "\1\151\4\5\10\0\1\5\16\0\1\5\1\0\1\5"+
    "\2\0\5\5\1\152\6\5\4\0\5\5\10\0\1\5"+
    "\16\0\1\5\1\0\1\5\2\0\14\5\4\0\5\5"+
    "\10\0\1\153\16\0\1\5\1\0\1\5\2\0\2\5"+
    "\1\154\11\5\4\0\5\5\10\0\1\5\16\0\1\5"+
    "\1\0\1\5\2\0\6\5\1\155\5\5\4\0\5\5"+
    "\10\0\1\5\16\0\1\5\1\0\1\5\2\0\14\5"+
    "\4\0\2\5\1\156\2\5\10\0\1\5\16\0\1\5"+
    "\1\0\1\5\2\0\3\5\1\157\10\5\4\0\5\5"+
    "\10\0\1\5\16\0\1\5\1\0\1\5\2\0\14\5"+
    "\4\0\1\160\4\5\10\0\1\5\16\0\1\5\1\0"+
    "\1\5\2\0\4\5\1\161\7\5\4\0\5\5\10\0"+
    "\1\5\16\0\1\5\1\0\1\5\2\0\14\5\4\0"+
    "\2\5\1\162\2\5\10\0\1\5\16\0\1\5\1\0"+
    "\1\5\2\0\3\5\1\163\10\5\4\0\5\5\10\0"+
    "\1\5\16\0\1\5\1\0\1\5\2\0\2\5\1\164"+
    "\11\5\4\0\5\5\10\0\1\5\16\0\1\5\1\0"+
    "\1\5\2\0\6\5\1\165\5\5\4\0\5\5\10\0"+
    "\1\5\16\0\1\5\1\0\1\5\2\0\2\5\1\166"+
    "\11\5\4\0\5\5\10\0\1\5\16\0\1\5\1\0"+
    "\1\5\2\0\14\5\4\0\2\5\1\167\2\5\10\0"+
    "\1\5\16\0\1\5\1\0\1\5\2\0\10\5\1\170"+
    "\3\5\4\0\5\5\10\0\1\5\16\0\1\5\1\0"+
    "\1\5\2\0\11\5\1\171\2\5\4\0\5\5\10\0"+
    "\1\5\16\0\1\5\1\0\1\5\2\0\2\5\1\172"+
    "\11\5\4\0\5\5\10\0\1\5\16\0\1\5\1\0"+
    "\1\5\2\0\6\5\1\173\5\5\4\0\5\5\10\0"+
    "\1\5\16\0\1\5\1\0\1\5\2\0\2\5\1\174"+
    "\11\5\4\0\5\5\10\0\1\5\15\0\22\77\1\175"+
    "\1\143\35\77\23\100\1\144\1\100\1\176\33\100\1\0"+
    "\1\5\1\0\1\5\2\0\6\5\1\177\5\5\4\0"+
    "\5\5\10\0\1\5\16\0\1\5\1\0\1\5\2\0"+
    "\5\5\1\200\6\5\4\0\5\5\10\0\1\5\16\0"+
    "\1\5\1\0\1\5\2\0\2\5\1\201\11\5\4\0"+
    "\5\5\10\0\1\5\16\0\1\5\1\0\1\5\2\0"+
    "\12\5\1\202\1\5\4\0\5\5\10\0\1\5\16\0"+
    "\1\5\1\0\1\5\2\0\4\5\1\203\7\5\4\0"+
    "\5\5\10\0\1\5\16\0\1\5\1\0\1\5\2\0"+
    "\3\5\1\204\2\5\1\205\5\5\4\0\5\5\10\0"+
    "\1\5\16\0\1\5\1\0\1\5\2\0\14\5\4\0"+
    "\1\206\4\5\10\0\1\5\16\0\1\5\1\0\1\5"+
    "\2\0\10\5\1\207\3\5\4\0\5\5\10\0\1\5"+
    "\16\0\1\5\1\0\1\5\2\0\14\5\4\0\1\210"+
    "\4\5\10\0\1\5\16\0\1\5\1\0\1\5\2\0"+
    "\5\5\1\211\6\5\4\0\5\5\10\0\1\5\16\0"+
    "\1\5\1\0\1\5\2\0\12\5\1\212\1\5\4\0"+
    "\5\5\10\0\1\5\16\0\1\5\1\0\1\5\2\0"+
    "\5\5\1\213\6\5\4\0\5\5\10\0\1\5\16\0"+
    "\1\5\1\0\1\5\2\0\6\5\1\214\5\5\4\0"+
    "\5\5\10\0\1\5\16\0\1\5\1\0\1\5\2\0"+
    "\13\5\1\215\4\0\5\5\10\0\1\5\16\0\1\5"+
    "\1\0\1\5\2\0\3\5\1\216\10\5\4\0\5\5"+
    "\10\0\1\5\16\0\1\5\1\0\1\5\2\0\3\5"+
    "\1\217\10\5\4\0\5\5\10\0\1\5\16\0\1\5"+
    "\1\0\1\5\2\0\14\5\4\0\1\220\4\5\10\0"+
    "\1\5\16\0\1\5\1\0\1\5\2\0\14\5\4\0"+
    "\3\5\1\221\1\5\10\0\1\5\16\0\1\5\1\0"+
    "\1\5\2\0\6\5\1\222\5\5\4\0\5\5\10\0"+
    "\1\5\16\0\1\5\1\0\1\5\2\0\2\5\1\174"+
    "\3\5\1\174\5\5\4\0\5\5\10\0\1\5\16\0"+
    "\1\5\1\0\1\5\2\0\5\5\1\223\6\5\4\0"+
    "\5\5\10\0\1\5\16\0\1\5\1\0\1\5\2\0"+
    "\14\5\4\0\1\5\1\224\3\5\10\0\1\5\16\0"+
    "\1\5\1\0\1\5\2\0\14\5\4\0\1\225\4\5"+
    "\10\0\1\5\16\0\1\5\1\0\1\5\2\0\14\5"+
    "\4\0\2\5\1\226\2\5\10\0\1\5\16\0\1\5"+
    "\1\0\1\5\2\0\3\5\1\227\10\5\4\0\5\5"+
    "\10\0\1\5\16\0\1\5\1\0\1\5\2\0\14\5"+
    "\4\0\2\5\1\230\2\5\10\0\1\5\16\0\1\5"+
    "\1\0\1\5\2\0\3\5\1\231\10\5\4\0\5\5"+
    "\10\0\1\5\16\0\1\5\1\0\1\5\2\0\12\5"+
    "\1\232\1\5\4\0\5\5\10\0\1\5\16\0\1\5"+
    "\1\0\1\5\2\0\2\5\1\233\11\5\4\0\5\5"+
    "\10\0\1\5\16\0\1\5\1\0\1\5\2\0\14\5"+
    "\4\0\1\5\1\234\3\5\10\0\1\5\16\0\1\5"+
    "\1\0\1\5\2\0\6\5\1\235\5\5\4\0\5\5"+
    "\10\0\1\5\16\0\1\5\1\0\1\5\2\0\4\5"+
    "\1\236\7\5\4\0\5\5\10\0\1\5\16\0\1\5"+
    "\1\0\1\5\2\0\14\5\4\0\1\5\1\237\3\5"+
    "\10\0\1\5\16\0\1\5\1\0\1\5\2\0\6\5"+
    "\1\240\5\5\4\0\5\5\10\0\1\5\16\0\1\5"+
    "\1\0\1\5\2\0\14\5\4\0\1\241\4\5\10\0"+
    "\1\5\16\0\1\5\1\0\1\5\2\0\2\5\1\242"+
    "\11\5\4\0\5\5\10\0\1\5\16\0\1\5\1\0"+
    "\1\5\2\0\5\5\1\243\6\5\4\0\5\5\10\0"+
    "\1\5\16\0\1\5\1\0\1\5\2\0\12\5\1\244"+
    "\1\5\4\0\5\5\10\0\1\5\16\0\1\5\1\0"+
    "\1\5\2\0\5\5\1\245\6\5\4\0\5\5\10\0"+
    "\1\5\16\0\1\5\1\0\1\5\2\0\14\5\4\0"+
    "\1\246\4\5\10\0\1\5\16\0\1\5\1\0\1\5"+
    "\2\0\5\5\1\247\6\5\4\0\5\5\10\0\1\5"+
    "\16\0\1\5\1\0\1\5\2\0\14\5\4\0\3\5"+
    "\1\250\1\5\10\0\1\5\16\0\1\5\1\0\1\5"+
    "\2\0\12\5\1\251\1\5\4\0\5\5\10\0\1\5"+
    "\16\0\1\5\1\0\1\5\2\0\3\5\1\252\10\5"+
    "\4\0\5\5\10\0\1\5\16\0\1\5\1\0\1\5"+
    "\2\0\5\5\1\253\6\5\4\0\5\5\10\0\1\5"+
    "\16\0\1\5\1\0\1\5\2\0\14\5\4\0\2\5"+
    "\1\254\2\5\10\0\1\5\16\0\1\5\1\0\1\5"+
    "\2\0\2\5\1\255\11\5\4\0\5\5\10\0\1\5"+
    "\16\0\1\5\1\0\1\5\2\0\12\5\1\256\1\5"+
    "\4\0\5\5\10\0\1\5\16\0\1\5\1\0\1\5"+
    "\2\0\5\5\1\257\6\5\4\0\5\5\10\0\1\5"+
    "\16\0\1\5\1\0\1\5\2\0\3\5\1\260\10\5"+
    "\4\0\5\5\10\0\1\5\16\0\1\5\1\0\1\5"+
    "\2\0\10\5\1\261\3\5\4\0\5\5\10\0\1\5"+
    "\16\0\1\5\1\0\1\5\2\0\2\5\1\262\11\5"+
    "\4\0\5\5\10\0\1\5\16\0\1\5\1\0\1\5"+
    "\2\0\13\5\1\263\4\0\5\5\10\0\1\5\16\0"+
    "\1\5\1\0\1\5\2\0\4\5\1\264\7\5\4\0"+
    "\5\5\10\0\1\5\16\0\1\5\1\0\1\5\2\0"+
    "\14\5\4\0\2\5\1\265\2\5\10\0\1\5\16\0"+
    "\1\5\1\0\1\5\2\0\5\5\1\266\6\5\4\0"+
    "\5\5\10\0\1\5\16\0\1\5\1\0\1\5\2\0"+
    "\5\5\1\267\6\5\4\0\5\5\10\0\1\5\16\0"+
    "\1\5\1\0\1\5\2\0\14\5\4\0\1\270\4\5"+
    "\10\0\1\5\16\0\1\5\1\0\1\5\2\0\14\5"+
    "\4\0\5\5\10\0\1\271\16\0\1\5\1\0\1\5"+
    "\2\0\3\5\1\272\10\5\4\0\5\5\10\0\1\5"+
    "\16\0\1\5\1\0\1\5\2\0\13\5\1\273\4\0"+
    "\5\5\10\0\1\5\16\0\1\5\1\0\1\5\2\0"+
    "\3\5\1\274\10\5\4\0\5\5\10\0\1\5\16\0"+
    "\1\5\1\0\1\5\2\0\3\5\1\275\10\5\4\0"+
    "\5\5\10\0\1\5\16\0\1\5\1\0\1\5\2\0"+
    "\5\5\1\276\6\5\4\0\5\5\10\0\1\5\16\0"+
    "\1\5\1\0\1\5\2\0\6\5\1\277\5\5\4\0"+
    "\5\5\10\0\1\5\16\0\1\5\1\0\1\5\2\0"+
    "\3\5\1\300\10\5\4\0\5\5\10\0\1\5\16\0"+
    "\1\5\1\0\1\5\2\0\3\5\1\301\10\5\4\0"+
    "\5\5\10\0\1\5\16\0\1\5\1\0\1\5\2\0"+
    "\11\5\1\302\2\5\4\0\5\5\10\0\1\5\16\0"+
    "\1\5\1\0\1\5\2\0\6\5\1\303\5\5\4\0"+
    "\5\5\10\0\1\5\16\0\1\5\1\0\1\5\2\0"+
    "\5\5\1\304\6\5\4\0\5\5\10\0\1\5\16\0"+
    "\1\5\1\0\1\5\2\0\6\5\1\174\5\5\4\0"+
    "\5\5\10\0\1\5\16\0\1\5\1\0\1\5\2\0"+
    "\3\5\1\305\10\5\4\0\5\5\10\0\1\5\16\0"+
    "\1\5\1\0\1\5\2\0\3\5\1\306\10\5\4\0"+
    "\5\5\10\0\1\5\16\0\1\5\1\0\1\5\2\0"+
    "\10\5\1\307\3\5\4\0\5\5\10\0\1\5\16\0"+
    "\1\5\1\0\1\5\2\0\5\5\1\310\6\5\4\0"+
    "\5\5\10\0\1\5\15\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7252];
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
    "\1\0\1\11\1\1\1\11\15\1\1\11\7\1\10\11"+
    "\1\1\1\11\2\1\3\11\6\1\2\0\1\11\1\0"+
    "\13\1\4\0\12\1\10\11\1\1\1\11\15\1\2\0"+
    "\30\1\2\11\112\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[200];
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
  public ScannerDMM(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public ScannerDMM(java.io.InputStream in) {
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
    while (i < 164) {
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
        case 15: 
          { System.out.println("puntoComa");   return new Symbol (simbolosDMM.puntoComa, yyline+1,yychar+1, new String (yytext()));
          }
        case 64: break;
        case 29: 
          { System.out.println("menosMenos");   return new Symbol (simbolosDMM.menosMenos, yyline+1,yychar+1, new String (yytext()));
          }
        case 65: break;
        case 3: 
          { System.out.println("punto");   return new Symbol (simbolosDMM.punto, yyline+1,yychar+1, new String (yytext()));
          }
        case 66: break;
        case 46: 
          { System.out.println("vacio");   return new Symbol (simbolosDMM.vacio, yyline+1,yychar+1, new String (yytext()));
          }
        case 67: break;
        case 23: 
          { System.out.println("igual");   return new Symbol (simbolosDMM.igual, yyline+1,yychar+1, new String (yytext()));
          }
        case 68: break;
        case 5: 
          { System.out.println("division");   return new Symbol (simbolosDMM.division, yyline+1,yychar+1, new String (yytext()));
          }
        case 69: break;
        case 28: 
          { System.out.println("masMas");   return new Symbol (simbolosDMM.masMas, yyline+1,yychar+1, new String (yytext()));
          }
        case 70: break;
        case 26: 
          { System.out.println(yytext());                return new Symbol (simbolosDMM.cadena, yyline+1,yychar+1, new String (yytext()));
          }
        case 71: break;
        case 63: 
          { System.out.println("estructura");   return new Symbol (simbolosDMM.estructura, yyline+1,yychar+1, new String (yytext()));
          }
        case 72: break;
        case 48: 
          { System.out.println("liena");   return new Symbol (simbolosDMM.linea, yyline+1,yychar+1, new String (yytext()));
          }
        case 73: break;
        case 53: 
          { System.out.println("t_decimal");   return new Symbol (simbolosDMM.t_decimal, yyline+1,yychar+1, new String (yytext()));
          }
        case 74: break;
        case 44: 
          { System.out.println("nulo");   return new Symbol (simbolosDMM.nulo, yyline+1,yychar+1, new String (yytext()));
          }
        case 75: break;
        case 20: 
          { System.out.println("potencia");   return new Symbol (simbolosDMM.potencia, yyline+1,yychar+1, new String (yytext()));
          }
        case 76: break;
        case 11: 
          { System.out.println("cierraPar");   return new Symbol (simbolosDMM.cierraPar, yyline+1,yychar+1, new String (yytext()));
          }
        case 77: break;
        case 14: 
          { System.out.println("dosPuntos");   return new Symbol (simbolosDMM.dosPuntos, yyline+1,yychar+1, new String (yytext()));
          }
        case 78: break;
        case 62: 
          { System.out.println("principal");   return new Symbol (simbolosDMM.principal, yyline+1,yychar+1, new String (yytext()));
          }
        case 79: break;
        case 30: 
          { System.out.println("menorIgual");   return new Symbol (simbolosDMM.menorIgual, yyline+1,yychar+1, new String (yytext()));
          }
        case 80: break;
        case 58: 
          { System.out.println("importar");   return new Symbol (simbolosDMM.importar, yyline+1,yychar+1, new String (yytext()));
          }
        case 81: break;
        case 13: 
          { System.out.println("cierraCor");   return new Symbol (simbolosDMM.cierraCor, yyline+1,yychar+1, new String (yytext()));
          }
        case 82: break;
        case 43: 
          { System.out.println("Coment Multi2");   /* se ignora*/
          }
        case 83: break;
        case 38: 
          { System.out.println("Coment simple");   /* se ignora*/
          }
        case 84: break;
        case 9: 
          { System.out.println("cierraLlave");   return new Symbol (simbolosDMM.cierraLlave, yyline+1,yychar+1, new String (yytext()));
          }
        case 85: break;
        case 37: 
          { System.out.println(yytext());                return new Symbol (simbolosDMM.caracter, yyline+1,yychar+1, new String (yytext()));
          }
        case 86: break;
        case 60: 
          { System.out.println("t_booleano");   return new Symbol (simbolosDMM.t_booleano, yyline+1,yychar+1, new String (yytext()));
          }
        case 87: break;
        case 42: 
          { System.out.println("Coment Multi");   /* se ignora*/
          }
        case 88: break;
        case 8: 
          { System.out.println("abreLlave");   return new Symbol (simbolosDMM.abreLlave, yyline+1,yychar+1, new String (yytext()));
          }
        case 89: break;
        case 4: 
          { System.out.println(yytext());                return new Symbol (simbolosDMM.identificador, yyline+1,yychar+1, new String (yytext()));
          }
        case 90: break;
        case 1: 
          { ErrorScan(yyline,yychar,yytext());
          }
        case 91: break;
        case 32: 
          { System.out.println("mayorIgual");   return new Symbol (simbolosDMM.mayorIgual, yyline+1,yychar+1, new String (yytext()));
          }
        case 92: break;
        case 39: 
          { System.out.println("Coment simple2");   /* se ignora*/
          }
        case 93: break;
        case 36: 
          { System.out.println(yytext());                return new Symbol (simbolosDMM.numero_decimal, yyline+1,yychar+1, new String (yytext()));
          }
        case 94: break;
        case 33: 
          { System.out.println("disitnoA");   return new Symbol (simbolosDMM.distintoA, yyline+1,yychar+1, new String (yytext()));
          }
        case 95: break;
        case 16: 
          { System.out.println("coma");   return new Symbol (simbolosDMM.coma, yyline+1,yychar+1, new String (yytext()));
          }
        case 96: break;
        case 61: 
          { System.out.println("continuar");   return new Symbol (simbolosDMM.continuar, yyline+1,yychar+1, new String (yytext()));
          }
        case 97: break;
        case 59: 
          { System.out.println("mientras");  return new Symbol (simbolosDMM.mientras, yyline+1,yychar+1, new String (yytext()));
          }
        case 98: break;
        case 52: 
          { System.out.println("detener");   return new Symbol (simbolosDMM.detener, yyline+1,yychar+1, new String (yytext()));
          }
        case 99: break;
        case 35: 
          { System.out.println("or");   return new Symbol (simbolosDMM.or, yyline+1,yychar+1, new String (yytext()));
          }
        case 100: break;
        case 12: 
          { System.out.println("abreCor");   return new Symbol (simbolosDMM.abreCor, yyline+1,yychar+1, new String (yytext()));
          }
        case 101: break;
        case 50: 
          { System.out.println("t_entero");   return new Symbol (simbolosDMM.t_entero, yyline+1,yychar+1, new String (yytext()));
          }
        case 102: break;
        case 2: 
          { System.out.println(yytext());                return new Symbol (simbolosDMM.numero_entero, yyline+1,yychar+1, new String (yytext()));
          }
        case 103: break;
        case 54: 
          { System.out.println("retornar");   return new Symbol (simbolosDMM.retornar, yyline+1,yychar+1, new String (yytext()));
          }
        case 104: break;
        case 25: 
          { System.out.println("not");  return new Symbol (simbolosDMM.not, yyline+1,yychar+1, new String (yytext()));
          }
        case 105: break;
        case 55: 
          { System.out.println("t_caracter");   return new Symbol (simbolosDMM.t_caracter, yyline+1,yychar+1, new String (yytext()));
          }
        case 106: break;
        case 57: 
          { System.out.println("imprimir");   return new Symbol (simbolosDMM.imprimir, yyline+1,yychar+1, new String (yytext()));
          }
        case 107: break;
        case 27: 
          { System.out.println("si");   return new Symbol (simbolosDMM.si, yyline+1,yychar+1, new String (yytext()));
          }
        case 108: break;
        case 19: 
          { System.out.println("?");   return new Symbol (simbolosDMM.interrogacion, yyline+1,yychar+1, new String (yytext()));
          }
        case 109: break;
        case 10: 
          { System.out.println("abrePar");   return new Symbol (simbolosDMM.abrePar, yyline+1,yychar+1, new String (yytext()));
          }
        case 110: break;
        case 6: 
          { System.out.println("multiplicacion");   return new Symbol (simbolosDMM.multiplicacion, yyline+1,yychar+1, new String (yytext()));
          }
        case 111: break;
        case 41: 
          { System.out.println("valor bool");               return new Symbol (simbolosDMM.valBool, yyline+1,yychar+1, new String (yytext()));
          }
        case 112: break;
        case 22: 
          { System.out.println("menor");  return new Symbol (simbolosDMM.menor, yyline+1,yychar+1, new String (yytext()));
          }
        case 113: break;
        case 18: 
          { System.out.println("menos");   return new Symbol (simbolosDMM.menos, yyline+1,yychar+1, new String (yytext()));
          }
        case 114: break;
        case 24: 
          { System.out.println("mayor");  return new Symbol (simbolosDMM.mayor, yyline+1,yychar+1, new String (yytext()));
          }
        case 115: break;
        case 49: 
          { System.out.println("puntoD");   return new Symbol (simbolosDMM.puntoD, yyline+1,yychar+1, new String (yytext()));
          }
        case 116: break;
        case 31: 
          { System.out.println("igualIgual");   return new Symbol (simbolosDMM.igualIgual, yyline+1,yychar+1, new String (yytext()));
          }
        case 117: break;
        case 45: 
          { System.out.println("para");   return new Symbol (simbolosDMM.para, yyline+1,yychar+1, new String (yytext()));
          }
        case 118: break;
        case 56: 
          { System.out.println("cuadrado");   return new Symbol (simbolosDMM.cuadrado, yyline+1,yychar+1, new String (yytext()));
          }
        case 119: break;
        case 7: 
          { /* Se ignoran */
          }
        case 120: break;
        case 21: 
          { System.out.println("residuo");   return new Symbol (simbolosDMM.residuo, yyline+1,yychar+1, new String (yytext()));
          }
        case 121: break;
        case 47: 
          { System.out.println("ovalo");   return new Symbol (simbolosDMM.ovalo, yyline+1,yychar+1, new String (yytext()));
          }
        case 122: break;
        case 34: 
          { System.out.println("and");   return new Symbol (simbolosDMM.and, yyline+1,yychar+1, new String (yytext()));
          }
        case 123: break;
        case 17: 
          { System.out.println("mas");   return new Symbol (simbolosDMM.mas, yyline+1,yychar+1, new String (yytext()));
          }
        case 124: break;
        case 51: 
          { System.out.println("t_cadena");   return new Symbol (simbolosDMM.t_cadena, yyline+1,yychar+1, new String (yytext()));
          }
        case 125: break;
        case 40: 
          { System.out.println("sino");   return new Symbol (simbolosDMM.sino, yyline+1,yychar+1, new String (yytext()));
          }
        case 126: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(simbolosDMM.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
