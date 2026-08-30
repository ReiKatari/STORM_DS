package u1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class y0 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f13464a;

    static {
        int[] iArr = new int[h0.values().length];
        try {
            iArr[h0.COPY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h0.PASTE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h0.CUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[h0.LEFT_CHAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[h0.RIGHT_CHAR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[h0.LEFT_WORD.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[h0.RIGHT_WORD.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[h0.PREV_PARAGRAPH.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[h0.NEXT_PARAGRAPH.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[h0.UP.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[h0.DOWN.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[h0.PAGE_UP.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[h0.PAGE_DOWN.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[h0.LINE_START.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[h0.LINE_END.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[h0.LINE_LEFT.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[h0.LINE_RIGHT.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[h0.HOME.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[h0.END.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[h0.DELETE_PREV_CHAR.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[h0.DELETE_NEXT_CHAR.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[h0.DELETE_PREV_WORD.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[h0.DELETE_NEXT_WORD.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[h0.DELETE_FROM_LINE_START.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr[h0.DELETE_TO_LINE_END.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr[h0.NEW_LINE.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr[h0.TAB.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr[h0.SELECT_ALL.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr[h0.SELECT_LEFT_CHAR.ordinal()] = 29;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr[h0.SELECT_RIGHT_CHAR.ordinal()] = 30;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr[h0.SELECT_LEFT_WORD.ordinal()] = 31;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr[h0.SELECT_RIGHT_WORD.ordinal()] = 32;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr[h0.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr[h0.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr[h0.SELECT_LINE_START.ordinal()] = 35;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr[h0.SELECT_LINE_END.ordinal()] = 36;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr[h0.SELECT_LINE_LEFT.ordinal()] = 37;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr[h0.SELECT_LINE_RIGHT.ordinal()] = 38;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr[h0.SELECT_UP.ordinal()] = 39;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr[h0.SELECT_DOWN.ordinal()] = 40;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr[h0.SELECT_PAGE_UP.ordinal()] = 41;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr[h0.SELECT_PAGE_DOWN.ordinal()] = 42;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr[h0.SELECT_HOME.ordinal()] = 43;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr[h0.SELECT_END.ordinal()] = 44;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr[h0.DESELECT.ordinal()] = 45;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr[h0.UNDO.ordinal()] = 46;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr[h0.REDO.ordinal()] = 47;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr[h0.CHARACTER_PALETTE.ordinal()] = 48;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr[h0.CENTER.ordinal()] = 49;
        } catch (NoSuchFieldError unused49) {
        }
        f13464a = iArr;
    }
}
