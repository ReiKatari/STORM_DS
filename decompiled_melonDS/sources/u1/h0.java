package u1;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h0 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ h0[] $VALUES;
    private final boolean editsText;
    public static final h0 LEFT_CHAR = new h0("LEFT_CHAR", 0, false);
    public static final h0 RIGHT_CHAR = new h0("RIGHT_CHAR", 1, false);
    public static final h0 RIGHT_WORD = new h0("RIGHT_WORD", 2, false);
    public static final h0 LEFT_WORD = new h0("LEFT_WORD", 3, false);
    public static final h0 NEXT_PARAGRAPH = new h0("NEXT_PARAGRAPH", 4, false);
    public static final h0 PREV_PARAGRAPH = new h0("PREV_PARAGRAPH", 5, false);
    public static final h0 LINE_START = new h0("LINE_START", 6, false);
    public static final h0 LINE_END = new h0("LINE_END", 7, false);
    public static final h0 LINE_LEFT = new h0("LINE_LEFT", 8, false);
    public static final h0 LINE_RIGHT = new h0("LINE_RIGHT", 9, false);
    public static final h0 UP = new h0("UP", 10, false);
    public static final h0 DOWN = new h0("DOWN", 11, false);
    public static final h0 CENTER = new h0("CENTER", 12, false);
    public static final h0 PAGE_UP = new h0("PAGE_UP", 13, false);
    public static final h0 PAGE_DOWN = new h0("PAGE_DOWN", 14, false);
    public static final h0 HOME = new h0("HOME", 15, false);
    public static final h0 END = new h0("END", 16, false);
    public static final h0 COPY = new h0("COPY", 17, false);
    public static final h0 PASTE = new h0("PASTE", 18, true);
    public static final h0 CUT = new h0("CUT", 19, true);
    public static final h0 DELETE_PREV_CHAR = new h0("DELETE_PREV_CHAR", 20, true);
    public static final h0 DELETE_NEXT_CHAR = new h0("DELETE_NEXT_CHAR", 21, true);
    public static final h0 DELETE_PREV_WORD = new h0("DELETE_PREV_WORD", 22, true);
    public static final h0 DELETE_NEXT_WORD = new h0("DELETE_NEXT_WORD", 23, true);
    public static final h0 DELETE_FROM_LINE_START = new h0("DELETE_FROM_LINE_START", 24, true);
    public static final h0 DELETE_TO_LINE_END = new h0("DELETE_TO_LINE_END", 25, true);
    public static final h0 SELECT_ALL = new h0("SELECT_ALL", 26, false);
    public static final h0 SELECT_LEFT_CHAR = new h0("SELECT_LEFT_CHAR", 27, false);
    public static final h0 SELECT_RIGHT_CHAR = new h0("SELECT_RIGHT_CHAR", 28, false);
    public static final h0 SELECT_UP = new h0("SELECT_UP", 29, false);
    public static final h0 SELECT_DOWN = new h0("SELECT_DOWN", 30, false);
    public static final h0 SELECT_PAGE_UP = new h0("SELECT_PAGE_UP", 31, false);
    public static final h0 SELECT_PAGE_DOWN = new h0("SELECT_PAGE_DOWN", 32, false);
    public static final h0 SELECT_HOME = new h0("SELECT_HOME", 33, false);
    public static final h0 SELECT_END = new h0("SELECT_END", 34, false);
    public static final h0 SELECT_LEFT_WORD = new h0("SELECT_LEFT_WORD", 35, false);
    public static final h0 SELECT_RIGHT_WORD = new h0("SELECT_RIGHT_WORD", 36, false);
    public static final h0 SELECT_NEXT_PARAGRAPH = new h0("SELECT_NEXT_PARAGRAPH", 37, false);
    public static final h0 SELECT_PREV_PARAGRAPH = new h0("SELECT_PREV_PARAGRAPH", 38, false);
    public static final h0 SELECT_LINE_START = new h0("SELECT_LINE_START", 39, false);
    public static final h0 SELECT_LINE_END = new h0("SELECT_LINE_END", 40, false);
    public static final h0 SELECT_LINE_LEFT = new h0("SELECT_LINE_LEFT", 41, false);
    public static final h0 SELECT_LINE_RIGHT = new h0("SELECT_LINE_RIGHT", 42, false);
    public static final h0 DESELECT = new h0("DESELECT", 43, false);
    public static final h0 NEW_LINE = new h0("NEW_LINE", 44, true);
    public static final h0 TAB = new h0("TAB", 45, true);
    public static final h0 UNDO = new h0("UNDO", 46, true);
    public static final h0 REDO = new h0("REDO", 47, true);
    public static final h0 CHARACTER_PALETTE = new h0("CHARACTER_PALETTE", 48, true);

    private static final /* synthetic */ h0[] $values() {
        return new h0[]{LEFT_CHAR, RIGHT_CHAR, RIGHT_WORD, LEFT_WORD, NEXT_PARAGRAPH, PREV_PARAGRAPH, LINE_START, LINE_END, LINE_LEFT, LINE_RIGHT, UP, DOWN, CENTER, PAGE_UP, PAGE_DOWN, HOME, END, COPY, PASTE, CUT, DELETE_PREV_CHAR, DELETE_NEXT_CHAR, DELETE_PREV_WORD, DELETE_NEXT_WORD, DELETE_FROM_LINE_START, DELETE_TO_LINE_END, SELECT_ALL, SELECT_LEFT_CHAR, SELECT_RIGHT_CHAR, SELECT_UP, SELECT_DOWN, SELECT_PAGE_UP, SELECT_PAGE_DOWN, SELECT_HOME, SELECT_END, SELECT_LEFT_WORD, SELECT_RIGHT_WORD, SELECT_NEXT_PARAGRAPH, SELECT_PREV_PARAGRAPH, SELECT_LINE_START, SELECT_LINE_END, SELECT_LINE_LEFT, SELECT_LINE_RIGHT, DESELECT, NEW_LINE, TAB, UNDO, REDO, CHARACTER_PALETTE};
    }

    static {
        h0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private h0(String str, int i2, boolean z10) {
        this.editsText = z10;
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) $VALUES.clone();
    }

    public final boolean getEditsText() {
        return this.editsText;
    }
}
