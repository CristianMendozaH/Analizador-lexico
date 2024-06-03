
import compilerTools.TextColor;
import java.awt.Color;

@SuppressWarnings("FallThrough")
class LexerColor {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
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
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\1\1\1\4\22\0\1\1"+
    "\1\0\1\5\5\0\2\6\1\7\1\10\1\0\1\11"+
    "\1\12\1\13\12\14\7\0\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\1\26\1\42\1\43\1\44\1\26\1\6\1\0"+
    "\1\6\1\0\1\26\1\0\1\45\1\46\1\47\1\50"+
    "\1\51\1\52\1\53\1\54\1\55\1\26\1\56\1\57"+
    "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67"+
    "\1\70\1\26\1\71\1\72\1\73\1\26\1\6\1\0"+
    "\1\6\7\0\1\3\73\0\1\74\7\0\1\74\3\0"+
    "\1\74\3\0\1\74\1\0\1\74\6\0\1\74\1\0"+
    "\1\74\4\0\1\74\7\0\1\74\3\0\1\74\3\0"+
    "\1\74\1\0\1\74\6\0\1\74\1\0\1\74\u012b\0"+
    "\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\1\1\3\3\1\35\4\1\5"+
    "\2\0\1\6\30\4\1\7\1\4\1\7\1\4\1\7"+
    "\4\4\1\10\22\4\2\0\2\6\10\4\1\11\1\4"+
    "\1\12\11\4\1\13\24\4\1\0\1\6\26\4\1\14"+
    "\12\4\1\15";

  private static int [] zzUnpackAction() {
    int [] result = new int[175];
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
    "\0\0\0\75\0\75\0\172\0\267\0\75\0\364\0\u0131"+
    "\0\u016e\0\u01ab\0\u01e8\0\u0225\0\u0262\0\u029f\0\u02dc\0\u0319"+
    "\0\u0356\0\u0393\0\u03d0\0\u040d\0\u044a\0\u0487\0\u04c4\0\u0501"+
    "\0\u053e\0\u057b\0\u05b8\0\u05f5\0\u0632\0\u066f\0\u06ac\0\u06e9"+
    "\0\u0726\0\u0763\0\u07a0\0\u07dd\0\u081a\0\u0857\0\75\0\267"+
    "\0\u0894\0\u08d1\0\u090e\0\u094b\0\u0988\0\u09c5\0\u0a02\0\u0a3f"+
    "\0\u0a7c\0\u0ab9\0\u0af6\0\u0b33\0\u0b70\0\u0bad\0\u0bea\0\u0c27"+
    "\0\u0c64\0\u0ca1\0\u0cde\0\u0d1b\0\u0d58\0\u0d95\0\u0dd2\0\u0e0f"+
    "\0\u0e4c\0\u0e89\0\u0319\0\u0ec6\0\u0f03\0\u0f40\0\u0f7d\0\u0fba"+
    "\0\u0ff7\0\u1034\0\u1071\0\u0319\0\u10ae\0\u10eb\0\u1128\0\u1165"+
    "\0\u11a2\0\u11df\0\u121c\0\u1259\0\u1296\0\u12d3\0\u1310\0\u134d"+
    "\0\u138a\0\u13c7\0\u1404\0\u1441\0\u147e\0\u14bb\0\u14f8\0\u1535"+
    "\0\75\0\u1572\0\u15af\0\u15ec\0\u1629\0\u1666\0\u16a3\0\u16e0"+
    "\0\u171d\0\u175a\0\u0319\0\u1797\0\u0319\0\u17d4\0\u1811\0\u184e"+
    "\0\u188b\0\u18c8\0\u1905\0\u1942\0\u197f\0\u19bc\0\u0319\0\u19f9"+
    "\0\u1a36\0\u1a73\0\u1ab0\0\u1aed\0\u1b2a\0\u1b67\0\u1ba4\0\u1be1"+
    "\0\u1c1e\0\u1c5b\0\u1c98\0\u1cd5\0\u1d12\0\u1d4f\0\u1d8c\0\u1dc9"+
    "\0\u1e06\0\u1e43\0\u1e80\0\u1ebd\0\u14f8\0\u1efa\0\u1f37\0\u1f74"+
    "\0\u1fb1\0\u1fee\0\u202b\0\u2068\0\u20a5\0\u20e2\0\u211f\0\u215c"+
    "\0\u2199\0\u21d6\0\u2213\0\u2250\0\u228d\0\u22ca\0\u2307\0\u2344"+
    "\0\u2381\0\u23be\0\u23fb\0\u0319\0\u2438\0\u2475\0\u24b2\0\u24ef"+
    "\0\u252c\0\u2569\0\u25a6\0\u25e3\0\u2620\0\u265d\0\u0319";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[175];
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
    "\1\2\2\3\1\0\1\4\1\5\1\6\1\2\1\7"+
    "\1\10\1\2\1\11\1\2\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\2\20\1\21\4\20\1\22\1\23\1\24"+
    "\1\20\1\25\1\26\1\27\1\20\1\30\2\20\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\2\20\1\37\3\20"+
    "\1\40\1\41\1\42\1\20\1\43\1\44\1\45\1\20"+
    "\1\46\3\20\77\0\1\3\77\0\1\47\3\0\2\50"+
    "\1\0\60\50\11\0\1\6\75\0\1\6\72\0\1\51"+
    "\3\0\1\52\75\0\16\20\1\53\26\20\1\54\13\20"+
    "\14\0\5\20\1\55\11\20\1\56\2\20\1\57\12\20"+
    "\1\60\10\20\1\61\2\20\1\62\7\20\14\0\14\20"+
    "\1\63\26\20\1\64\15\20\14\0\5\20\1\65\27\20"+
    "\1\66\23\20\14\0\14\20\1\67\1\20\1\70\10\20"+
    "\1\71\13\20\1\72\1\20\1\73\10\20\1\74\2\20"+
    "\14\0\1\20\1\75\12\20\1\76\2\20\1\77\11\20"+
    "\1\100\11\20\1\101\2\20\1\102\12\20\14\0\61\20"+
    "\14\0\6\20\1\103\6\20\1\104\1\105\17\20\1\103"+
    "\5\20\1\106\1\107\13\20\14\0\5\20\1\110\11\20"+
    "\1\111\15\20\1\112\10\20\1\113\12\20\14\0\22\20"+
    "\1\114\26\20\1\114\7\20\14\0\17\20\1\115\2\20"+
    "\1\116\23\20\1\117\2\20\1\120\7\20\14\0\1\20"+
    "\1\121\3\20\1\122\23\20\1\123\3\20\1\124\23\20"+
    "\14\0\5\20\1\125\13\20\1\126\2\20\1\127\10\20"+
    "\1\130\12\20\1\131\2\20\1\132\5\20\14\0\22\20"+
    "\1\133\26\20\1\134\7\20\14\0\10\20\1\135\27\20"+
    "\1\136\20\20\14\0\45\20\1\54\13\20\14\0\35\20"+
    "\1\60\10\20\1\61\2\20\1\62\7\20\14\0\43\20"+
    "\1\64\15\20\14\0\35\20\1\66\23\20\14\0\43\20"+
    "\1\72\1\20\1\73\10\20\1\74\2\20\14\0\31\20"+
    "\1\100\11\20\1\101\2\20\1\102\12\20\14\0\36\20"+
    "\1\103\5\20\1\106\1\107\13\20\14\0\35\20\1\112"+
    "\10\20\1\113\12\20\14\0\51\20\1\114\7\20\14\0"+
    "\46\20\1\117\2\20\1\120\7\20\14\0\31\20\1\123"+
    "\3\20\1\124\23\20\14\0\35\20\1\130\12\20\1\131"+
    "\2\20\1\132\5\20\14\0\51\20\1\134\7\20\14\0"+
    "\40\20\1\136\20\20\7\137\1\140\65\137\2\52\1\141"+
    "\1\52\1\142\70\52\14\0\4\20\1\114\54\20\14\0"+
    "\34\20\1\114\24\20\14\0\7\20\1\143\51\20\14\0"+
    "\17\20\1\144\41\20\14\0\5\20\1\145\53\20\14\0"+
    "\37\20\1\146\21\20\14\0\46\20\1\147\12\20\14\0"+
    "\35\20\1\150\23\20\14\0\1\20\1\151\57\20\14\0"+
    "\31\20\1\152\27\20\14\0\6\20\1\153\52\20\14\0"+
    "\36\20\1\153\22\20\14\0\23\20\1\154\35\20\14\0"+
    "\4\20\1\155\54\20\14\0\3\20\1\156\55\20\14\0"+
    "\52\20\1\157\6\20\14\0\34\20\1\155\24\20\14\0"+
    "\33\20\1\160\25\20\14\0\14\20\1\161\44\20\14\0"+
    "\17\20\1\162\41\20\14\0\22\20\1\103\36\20\14\0"+
    "\43\20\1\163\15\20\14\0\46\20\1\164\12\20\14\0"+
    "\51\20\1\103\7\20\14\0\20\20\1\165\40\20\14\0"+
    "\20\20\1\166\3\20\1\167\34\20\14\0\47\20\1\170"+
    "\11\20\14\0\47\20\1\171\3\20\1\167\5\20\14\0"+
    "\27\20\1\172\31\20\14\0\24\20\1\114\34\20\14\0"+
    "\56\20\1\173\2\20\14\0\53\20\1\114\5\20\14\0"+
    "\26\20\1\174\32\20\14\0\11\20\1\175\47\20\14\0"+
    "\55\20\1\176\3\20\14\0\41\20\1\177\17\20\14\0"+
    "\16\20\1\200\42\20\14\0\24\20\1\201\34\20\14\0"+
    "\45\20\1\202\13\20\14\0\53\20\1\203\5\20\14\0"+
    "\14\20\1\204\44\20\14\0\22\20\1\172\36\20\14\0"+
    "\22\20\1\205\36\20\14\0\43\20\1\206\15\20\14\0"+
    "\51\20\1\173\7\20\14\0\51\20\1\207\7\20\14\0"+
    "\25\20\1\210\2\20\1\103\30\20\14\0\54\20\1\211"+
    "\2\20\1\103\1\20\14\0\11\20\1\212\47\20\14\0"+
    "\41\20\1\213\17\20\7\137\1\214\74\137\1\214\3\137"+
    "\1\215\61\137\2\0\1\141\106\0\11\20\1\216\47\20"+
    "\14\0\14\20\1\217\44\20\14\0\1\20\1\220\57\20"+
    "\14\0\41\20\1\221\17\20\14\0\43\20\1\222\15\20"+
    "\14\0\31\20\1\223\27\20\14\0\23\20\1\224\35\20"+
    "\14\0\52\20\1\225\6\20\14\0\5\20\1\103\53\20"+
    "\14\0\5\20\1\226\53\20\14\0\35\20\1\103\23\20"+
    "\14\0\35\20\1\227\23\20\14\0\23\20\1\210\35\20"+
    "\14\0\1\20\1\230\57\20\14\0\52\20\1\211\6\20"+
    "\14\0\31\20\1\231\27\20\14\0\17\20\1\232\41\20"+
    "\14\0\25\20\1\172\33\20\14\0\46\20\1\233\12\20"+
    "\14\0\54\20\1\173\4\20\14\0\24\20\1\155\34\20"+
    "\14\0\53\20\1\155\5\20\14\0\5\20\1\234\53\20"+
    "\14\0\16\20\1\172\42\20\14\0\35\20\1\235\23\20"+
    "\14\0\45\20\1\173\13\20\14\0\7\20\1\154\51\20"+
    "\14\0\25\20\1\236\33\20\14\0\37\20\1\157\21\20"+
    "\14\0\54\20\1\237\4\20\14\0\6\20\1\103\52\20"+
    "\14\0\11\20\1\240\47\20\14\0\36\20\1\103\22\20"+
    "\14\0\41\20\1\241\17\20\14\0\5\20\1\167\53\20"+
    "\14\0\35\20\1\167\23\20\14\0\14\20\1\154\44\20"+
    "\14\0\43\20\1\157\15\20\7\137\1\214\3\137\1\141"+
    "\61\137\14\0\16\20\1\155\42\20\14\0\5\20\1\242"+
    "\53\20\14\0\13\20\1\103\45\20\14\0\45\20\1\155"+
    "\13\20\14\0\35\20\1\243\23\20\14\0\42\20\1\103"+
    "\16\20\14\0\23\20\1\244\35\20\14\0\52\20\1\244"+
    "\6\20\14\0\20\20\1\245\40\20\14\0\47\20\1\246"+
    "\11\20\14\0\24\20\1\167\34\20\14\0\53\20\1\167"+
    "\5\20\14\0\22\20\1\247\36\20\14\0\51\20\1\250"+
    "\7\20\14\0\22\20\1\155\36\20\14\0\51\20\1\155"+
    "\7\20\14\0\22\20\1\251\36\20\14\0\51\20\1\252"+
    "\7\20\14\0\16\20\1\253\42\20\14\0\45\20\1\254"+
    "\13\20\14\0\1\20\1\255\57\20\14\0\31\20\1\256"+
    "\27\20\14\0\24\20\1\103\34\20\14\0\53\20\1\103"+
    "\5\20\14\0\24\20\1\257\34\20\14\0\53\20\1\257"+
    "\5\20\14\0\16\20\1\167\42\20\14\0\45\20\1\167"+
    "\13\20\14\0\7\20\1\167\51\20\14\0\37\20\1\167"+
    "\21\20\14\0\16\20\1\103\42\20\14\0\45\20\1\103"+
    "\13\20";

  private static int [] zzUnpackTrans() {
    int [] result = new int[9882];
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\2\1\1\11\40\1\1\11\2\0\65\1"+
    "\2\0\1\11\52\1\1\0\43\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[175];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    private TextColor textColor(long start, int size, Color color){
        return new TextColor((int) start, size, color);
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerColor(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public TextColor yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { /* Ignorar */
            }
            // fall through
          case 14: break;
          case 2:
            { /*IGNORAR*/
            }
            // fall through
          case 15: break;
          case 3:
            { return textColor(yychar, yylength(), new Color(96, 96, 96));
            }
            // fall through
          case 16: break;
          case 4:
            { return textColor(yychar, yylength(), new Color(0, 0, 0));
            }
            // fall through
          case 17: break;
          case 5:
            { return textColor(yychar, yylength(), new Color(68, 196, 30));
            }
            // fall through
          case 18: break;
          case 6:
            { return textColor(yychar, yylength(), new Color(146, 146, 146));
            }
            // fall through
          case 19: break;
          case 7:
            { return textColor(yychar, yylength(), new Color(0, 0, 139));
            }
            // fall through
          case 20: break;
          case 8:
            { return textColor(yychar, yylength(), new Color(178, 34, 34));
            }
            // fall through
          case 21: break;
          case 9:
            { return textColor( yychar, yylength(), new Color(19,141,50));
            }
            // fall through
          case 22: break;
          case 10:
            { return textColor(yychar, yylength(), new Color(255, 140, 0));
            }
            // fall through
          case 23: break;
          case 11:
            { return textColor(yychar, yylength(), new Color(148, 58, 173));
            }
            // fall through
          case 24: break;
          case 12:
            { return textColor(yychar, yylength(), new Color(30,148,195));
            }
            // fall through
          case 25: break;
          case 13:
            { return textColor( yychar, yylength(), new Color(255, 140, 0));
            }
            // fall through
          case 26: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}