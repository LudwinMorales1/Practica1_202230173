package codigo;
import static codigo.Tokens.*;

class Lexer {

  public static final int YYEOF = -1;

  private static final int ZZ_BUFFERSIZE = 16384;

 
  public static final int YYINITIAL = 0;

 
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };


  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\16\2\0\1\3\22\0\1\3\7\0\1\23\1\24"+
    "\1\22\1\20\1\3\1\21\1\0\1\15\12\2\3\0\1\17\3\0"+
    "\32\1\4\0\1\1\1\0\4\1\1\10\1\7\1\1\1\14\1\4"+
    "\2\1\1\11\1\1\1\5\4\1\1\12\1\6\2\1\1\13\3\1"+
    "\uff85\0";

  
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\3\2\1\5\1\6"+
    "\1\7\1\10\1\11\1\1\1\2\1\12\2\2\1\4"+
    "\1\0\2\2\1\0\1\3";

  private static int [] zzUnpackAction() {
    int [] result = new int[24];
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
    "\0\0\0\25\0\52\0\77\0\124\0\151\0\176\0\223"+
    "\0\250\0\25\0\25\0\25\0\25\0\275\0\322\0\52"+
    "\0\347\0\374\0\u0111\0\u0126\0\u013b\0\u0150\0\u0165\0\25";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[24];
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
    "\1\2\1\3\1\4\1\5\1\6\3\3\1\7\2\3"+
    "\1\10\1\3\1\11\1\5\1\12\1\13\1\14\1\15"+
    "\1\16\1\2\26\0\2\3\1\0\11\3\12\0\1\4"+
    "\25\0\1\5\12\0\1\5\7\0\2\3\1\0\1\3"+
    "\1\17\1\3\1\20\5\3\11\0\2\3\1\0\5\3"+
    "\1\21\3\3\11\0\2\3\1\0\10\3\1\22\25\0"+
    "\1\23\30\0\1\24\4\0\2\3\1\0\2\3\1\20"+
    "\6\3\11\0\2\3\1\0\6\3\1\25\2\3\11\0"+
    "\2\3\1\0\1\26\10\3\10\0\16\23\1\0\6\23"+
    "\2\0\1\27\23\0\2\3\1\0\4\3\1\20\4\3"+
    "\11\0\2\3\1\0\5\3\1\25\3\3\12\0\1\27"+
    "\21\0\1\30";

  private static int [] zzUnpackTrans() {
    int [] result = new int[378];
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
    "\1\0\1\11\7\1\4\11\6\1\1\0\2\1\1\0"+
    "\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[24];
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

  public String lexeme;


  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

 
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

 
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  
    int j = 0; 
    while (i < 82) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
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


  public Tokens yylex() throws java.io.IOException {
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
        case 1: 
          { return ERROR;
          }
        case 11: break;
        case 5: 
          { return Division;
          }
        case 12: break;
        case 7: 
          { return Suma;
          }
        case 13: break;
        case 6: 
          { return Igual;
          }
        case 14: break;
        case 10: 
          { lexeme=yytext(); return Reservadas;
          }
        case 15: break;
        case 9: 
          { return Multiplicacion;
          }
        case 16: break;
        case 3: 
          { lexeme=yytext(); return Numero;
          }
        case 17: break;
        case 8: 
          { return Resta;
          }
        case 18: break;
        case 4: 
          { /*Ignore*/
          }
        case 19: break;
        case 2: 
          { lexeme=yytext(); return Identificador;
          }
        case 20: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
