package codigo;
import java_cup.runtime.Symbol;

class LexerCup implements java_cup.runtime.Scanner {

  public static final int YYEOF = -1;

  private static final int ZZ_BUFFERSIZE = 16384;

  public static final int YYINITIAL = 0;


  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  3,  5,  0,  0,  3,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     3, 32,  6,  0,  0, 35, 30,  0, 36, 37, 29, 27,  3, 28,  0,  4, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  0, 43, 34, 26, 33,  0, 
     0,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1, 23,  1,  1,  1,  1,  1,  1,  1, 40,  0, 41,  0,  1, 
     0, 13,  7, 11, 20, 10, 19, 18, 12, 22,  1,  1, 15, 42, 17, 16, 
     1,  1, 14, 24,  9, 21,  1, 25,  1,  8,  1, 38, 31, 39,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\12\2"+
    "\1\7\1\10\1\11\1\12\3\13\2\14\1\1\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\2\1\23\1\4"+
    "\1\24\10\2\1\25\1\2\1\26\2\2\1\14\1\27"+
    "\1\13\1\0\10\2\1\30\1\2\1\31\2\2\1\0"+
    "\1\2\1\32\1\33\1\34\4\2\1\3\1\35\1\2"+
    "\1\36\1\37";

  private static int [] zzUnpackAction() {
    int [] result = new int[81];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       
    int j = offset;  
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\54\0\130\0\204\0\260\0\334\0\54\0\u0108"+
    "\0\u0134\0\u0160\0\u018c\0\u01b8\0\u01e4\0\u0210\0\u023c\0\u0268"+
    "\0\u0294\0\u02c0\0\u02ec\0\u0318\0\u0344\0\u0370\0\u039c\0\u02c0"+
    "\0\u03c8\0\u03f4\0\u0344\0\u0420\0\54\0\54\0\54\0\54"+
    "\0\54\0\u044c\0\54\0\u0478\0\54\0\u04a4\0\u04d0\0\u04fc"+
    "\0\u0528\0\u0554\0\u0580\0\u05ac\0\u05d8\0\u0604\0\u0630\0\130"+
    "\0\u065c\0\u0688\0\54\0\54\0\54\0\u06b4\0\u06e0\0\u070c"+
    "\0\u0738\0\u0764\0\u0790\0\u07bc\0\u07e8\0\u0814\0\130\0\u0840"+
    "\0\130\0\u086c\0\u0898\0\u08c4\0\u08f0\0\130\0\130\0\130"+
    "\0\u091c\0\u0948\0\u0974\0\u09a0\0\54\0\130\0\u09cc\0\130"+
    "\0\130";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[81];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  
    int j = offset;  
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\5\1\7\1\10"+
    "\1\3\1\11\1\12\1\13\3\3\1\14\3\3\1\15"+
    "\1\16\1\3\1\17\1\20\1\3\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\55\0\2\3\4\0\23\3\20\0\1\3\3\0\1\4"+
    "\54\0\1\5\1\0\1\5\52\0\1\44\25\0\1\45"+
    "\22\0\2\3\4\0\1\3\1\46\21\3\20\0\1\3"+
    "\2\0\2\3\4\0\7\3\1\47\13\3\20\0\1\3"+
    "\2\0\2\3\4\0\10\3\1\50\12\3\20\0\1\3"+
    "\2\0\2\3\4\0\5\3\1\51\15\3\20\0\1\3"+
    "\2\0\2\3\4\0\11\3\1\52\11\3\20\0\1\3"+
    "\2\0\2\3\4\0\6\3\1\53\1\3\1\54\1\55"+
    "\11\3\20\0\1\3\2\0\2\3\4\0\11\3\1\56"+
    "\11\3\20\0\1\3\2\0\2\3\4\0\12\3\1\57"+
    "\1\3\1\60\6\3\20\0\1\3\2\0\2\3\4\0"+
    "\2\3\1\61\20\3\20\0\1\3\2\0\2\3\4\0"+
    "\5\3\1\62\15\3\20\0\1\3\33\0\1\63\53\0"+
    "\1\45\1\64\52\0\1\45\1\0\1\64\51\0\1\45"+
    "\57\0\1\65\54\0\1\65\46\0\1\63\6\0\1\63"+
    "\44\0\1\63\7\0\1\63\45\0\1\66\20\0\2\3"+
    "\4\0\6\3\1\67\14\3\20\0\1\3\1\0\5\44"+
    "\1\0\46\44\1\0\2\3\4\0\2\3\1\70\20\3"+
    "\20\0\1\3\2\0\2\3\4\0\16\3\1\71\4\3"+
    "\20\0\1\3\2\0\2\3\4\0\21\3\1\72\1\3"+
    "\20\0\1\3\2\0\2\3\4\0\6\3\1\73\14\3"+
    "\20\0\1\3\2\0\2\3\4\0\12\3\1\74\10\3"+
    "\20\0\1\3\2\0\2\3\4\0\10\3\1\75\12\3"+
    "\20\0\1\3\2\0\2\3\4\0\11\3\1\76\11\3"+
    "\20\0\1\3\2\0\2\3\4\0\7\3\1\77\13\3"+
    "\20\0\1\3\2\0\2\3\4\0\16\3\1\100\4\3"+
    "\20\0\1\3\2\0\2\3\4\0\2\3\1\101\20\3"+
    "\20\0\1\3\2\0\2\3\4\0\7\3\1\102\13\3"+
    "\20\0\1\3\2\0\2\3\4\0\17\3\1\103\3\3"+
    "\20\0\1\3\3\0\1\104\52\0\2\3\4\0\17\3"+
    "\1\105\3\3\20\0\1\3\2\0\2\3\4\0\3\3"+
    "\1\106\17\3\20\0\1\3\2\0\2\3\4\0\3\3"+
    "\1\107\17\3\20\0\1\3\2\0\2\3\4\0\3\3"+
    "\1\110\17\3\20\0\1\3\2\0\2\3\4\0\7\3"+
    "\1\106\13\3\20\0\1\3\2\0\2\3\4\0\13\3"+
    "\1\106\7\3\20\0\1\3\2\0\2\3\4\0\21\3"+
    "\1\71\1\3\20\0\1\3\2\0\2\3\4\0\6\3"+
    "\1\111\14\3\20\0\1\3\2\0\2\3\4\0\1\112"+
    "\22\3\20\0\1\3\2\0\2\3\4\0\17\3\1\113"+
    "\3\3\20\0\1\3\2\0\2\3\4\0\10\3\1\114"+
    "\12\3\20\0\1\3\3\0\1\104\42\0\1\115\7\0"+
    "\2\3\4\0\12\3\1\116\10\3\20\0\1\3\2\0"+
    "\2\3\4\0\2\3\1\106\20\3\20\0\1\3\2\0"+
    "\2\3\4\0\10\3\1\70\12\3\20\0\1\3\2\0"+
    "\2\3\4\0\12\3\1\117\10\3\20\0\1\3\2\0"+
    "\2\3\4\0\3\3\1\120\17\3\20\0\1\3\2\0"+
    "\2\3\4\0\13\3\1\121\7\3\20\0\1\3\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2552];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       
    int j = offset;  
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\1\11\25\1\5\11\1\1\1\11"+
    "\1\1\1\11\15\1\3\11\1\0\15\1\1\0\10\1"+
    "\1\11\4\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[81];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       
    int j = offset;  
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  private java.io.Reader zzReader;

  private int zzState;

  private int zzLexicalState = YYINITIAL;

  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  private int zzMarkedPos;

  private int zzCurrentPos;

  private int zzStartRead;

  private int zzEndRead;

  private int yyline;

  private int yychar;

  private int yycolumn;

  private boolean zzAtBOL = true;

  private boolean zzAtEOF;

  private boolean zzEOFDone;

    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }


  LexerCup(java.io.Reader in) {
    this.zzReader = in;
  }

  LexerCup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  private boolean zzRefill() throws java.io.IOException {

    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    if (zzCurrentPos >= zzBuffer.length) {
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

    return true;
  }

  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            
    zzEndRead = zzStartRead;  

    if (zzReader != null)
      zzReader.close();
  }


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

  public final int yystate() {
    return zzLexicalState;
  }

  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }

  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }

  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }

  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


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

  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }

  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }

  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

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

            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();

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


      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 22: 
          { return new Symbol(sym.If, yychar, yyline, yytext());
          }
        case 32: break;
        case 19: 
          { return new Symbol(sym.P_coma, yychar, yyline, yytext());
          }
        case 33: break;
        case 25: 
          { return new Symbol(sym.Int, yychar, yyline, yytext());
          }
        case 34: break;
        case 24: 
          { return new Symbol(sym.For, yychar, yyline, yytext());
          }
        case 35: break;
        case 6: 
          { return new Symbol(sym.Comillas, yychar, yyline, yytext());
          }
        case 36: break;
        case 30: 
          { return new Symbol(sym.While, yychar, yyline, yytext());
          }
        case 37: break;
        case 11: 
          { return new Symbol(sym.Op_logico, yychar, yyline, yytext());
          }
        case 38: break;
        case 1: 
          { return new Symbol(sym.ERROR, yychar, yyline, yytext());
          }
        case 39: break;
        case 15: 
          { return new Symbol(sym.Llave_a, yychar, yyline, yytext());
          }
        case 40: break;
        case 21: 
          { return new Symbol(sym.Do, yychar, yyline, yytext());
          }
        case 41: break;
        case 29: 
          { return new Symbol(sym.Main, yychar, yyline, yytext());
          }
        case 42: break;
        case 13: 
          { return new Symbol(sym.Parentesis_a, yychar, yyline, yytext());
          }
        case 43: break;
        case 17: 
          { return new Symbol(sym.Corchete_a, yychar, yyline, yytext());
          }
        case 44: break;
        case 9: 
          { return new Symbol(sym.Resta, yychar, yyline, yytext());
          }
        case 45: break;
        case 31: 
          { return new Symbol(sym.Cadena, yychar, yyline, yytext());
          }
        case 46: break;
        case 16: 
          { return new Symbol(sym.Llave_c, yychar, yyline, yytext());
          }
        case 47: break;
        case 26: 
          { return new Symbol(sym.T_dato, yychar, yyline, yytext());
          }
        case 48: break;
        case 12: 
          { return new Symbol(sym.Op_relacional, yychar, yyline, yytext());
          }
        case 49: break;
        case 20: 
          { return new Symbol(sym.Op_atribucion, yychar, yyline, yytext());
          }
        case 50: break;
        case 10: 
          { return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());
          }
        case 51: break;
        case 23: 
          { return new Symbol(sym.Op_incremento, yychar, yyline, yytext());
          }
        case 52: break;
        case 18: 
          { return new Symbol(sym.Corchete_c, yychar, yyline, yytext());
          }
        case 53: break;
        case 3: 
          { return new Symbol(sym.Numero, yychar, yyline, yytext());
          }
        case 54: break;
        case 28: 
          { return new Symbol(sym.Else, yychar, yyline, yytext());
          }
        case 55: break;
        case 5: 
          { return new Symbol(sym.Division, yychar, yyline, yytext());
          }
        case 56: break;
        case 2: 
          { return new Symbol(sym.Identificador, yychar, yyline, yytext());
          }
        case 57: break;
        case 27: 
          { return new Symbol(sym.Op_booleano, yychar, yyline, yytext());
          }
        case 58: break;
        case 7: 
          { return new Symbol(sym.Igual, yychar, yyline, yytext());
          }
        case 59: break;
        case 4: 
          { 
          }
        case 60: break;
        case 8: 
          { return new Symbol(sym.Suma, yychar, yyline, yytext());
          }
        case 61: break;
        case 14: 
          { return new Symbol(sym.Parentesis_c, yychar, yyline, yytext());
          }
        case 62: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
