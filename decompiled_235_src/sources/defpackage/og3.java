package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: og3  reason: default package */
/* loaded from: classes.dex */
public final class og3 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ og3[] $VALUES;
    private final boolean editsText;
    public static final og3 LEFT_CHAR = new og3("LEFT_CHAR", 0, false);
    public static final og3 RIGHT_CHAR = new og3("RIGHT_CHAR", 1, false);
    public static final og3 RIGHT_WORD = new og3("RIGHT_WORD", 2, false);
    public static final og3 LEFT_WORD = new og3("LEFT_WORD", 3, false);
    public static final og3 NEXT_PARAGRAPH = new og3("NEXT_PARAGRAPH", 4, false);
    public static final og3 PREV_PARAGRAPH = new og3("PREV_PARAGRAPH", 5, false);
    public static final og3 LINE_START = new og3("LINE_START", 6, false);
    public static final og3 LINE_END = new og3("LINE_END", 7, false);
    public static final og3 LINE_LEFT = new og3("LINE_LEFT", 8, false);
    public static final og3 LINE_RIGHT = new og3("LINE_RIGHT", 9, false);
    public static final og3 UP = new og3("UP", 10, false);
    public static final og3 DOWN = new og3("DOWN", 11, false);
    public static final og3 CENTER = new og3("CENTER", 12, false);
    public static final og3 PAGE_UP = new og3("PAGE_UP", 13, false);
    public static final og3 PAGE_DOWN = new og3("PAGE_DOWN", 14, false);
    public static final og3 HOME = new og3("HOME", 15, false);
    public static final og3 END = new og3("END", 16, false);
    public static final og3 COPY = new og3("COPY", 17, false);
    public static final og3 PASTE = new og3("PASTE", 18, true);
    public static final og3 CUT = new og3("CUT", 19, true);
    public static final og3 DELETE_PREV_CHAR = new og3("DELETE_PREV_CHAR", 20, true);
    public static final og3 DELETE_NEXT_CHAR = new og3("DELETE_NEXT_CHAR", 21, true);
    public static final og3 DELETE_PREV_WORD = new og3("DELETE_PREV_WORD", 22, true);
    public static final og3 DELETE_NEXT_WORD = new og3("DELETE_NEXT_WORD", 23, true);
    public static final og3 DELETE_FROM_LINE_START = new og3("DELETE_FROM_LINE_START", 24, true);
    public static final og3 DELETE_TO_LINE_END = new og3("DELETE_TO_LINE_END", 25, true);
    public static final og3 SELECT_ALL = new og3("SELECT_ALL", 26, false);
    public static final og3 SELECT_LEFT_CHAR = new og3("SELECT_LEFT_CHAR", 27, false);
    public static final og3 SELECT_RIGHT_CHAR = new og3("SELECT_RIGHT_CHAR", 28, false);
    public static final og3 SELECT_UP = new og3("SELECT_UP", 29, false);
    public static final og3 SELECT_DOWN = new og3("SELECT_DOWN", 30, false);
    public static final og3 SELECT_PAGE_UP = new og3("SELECT_PAGE_UP", 31, false);
    public static final og3 SELECT_PAGE_DOWN = new og3("SELECT_PAGE_DOWN", 32, false);
    public static final og3 SELECT_HOME = new og3("SELECT_HOME", 33, false);
    public static final og3 SELECT_END = new og3("SELECT_END", 34, false);
    public static final og3 SELECT_LEFT_WORD = new og3("SELECT_LEFT_WORD", 35, false);
    public static final og3 SELECT_RIGHT_WORD = new og3("SELECT_RIGHT_WORD", 36, false);
    public static final og3 SELECT_NEXT_PARAGRAPH = new og3("SELECT_NEXT_PARAGRAPH", 37, false);
    public static final og3 SELECT_PREV_PARAGRAPH = new og3("SELECT_PREV_PARAGRAPH", 38, false);
    public static final og3 SELECT_LINE_START = new og3("SELECT_LINE_START", 39, false);
    public static final og3 SELECT_LINE_END = new og3("SELECT_LINE_END", 40, false);
    public static final og3 SELECT_LINE_LEFT = new og3("SELECT_LINE_LEFT", 41, false);
    public static final og3 SELECT_LINE_RIGHT = new og3("SELECT_LINE_RIGHT", 42, false);
    public static final og3 DESELECT = new og3("DESELECT", 43, false);
    public static final og3 NEW_LINE = new og3("NEW_LINE", 44, true);
    public static final og3 TAB = new og3("TAB", 45, true);
    public static final og3 UNDO = new og3("UNDO", 46, true);
    public static final og3 REDO = new og3("REDO", 47, true);
    public static final og3 CHARACTER_PALETTE = new og3("CHARACTER_PALETTE", 48, true);

    private static final /* synthetic */ og3[] $values() {
        return new og3[]{LEFT_CHAR, RIGHT_CHAR, RIGHT_WORD, LEFT_WORD, NEXT_PARAGRAPH, PREV_PARAGRAPH, LINE_START, LINE_END, LINE_LEFT, LINE_RIGHT, UP, DOWN, CENTER, PAGE_UP, PAGE_DOWN, HOME, END, COPY, PASTE, CUT, DELETE_PREV_CHAR, DELETE_NEXT_CHAR, DELETE_PREV_WORD, DELETE_NEXT_WORD, DELETE_FROM_LINE_START, DELETE_TO_LINE_END, SELECT_ALL, SELECT_LEFT_CHAR, SELECT_RIGHT_CHAR, SELECT_UP, SELECT_DOWN, SELECT_PAGE_UP, SELECT_PAGE_DOWN, SELECT_HOME, SELECT_END, SELECT_LEFT_WORD, SELECT_RIGHT_WORD, SELECT_NEXT_PARAGRAPH, SELECT_PREV_PARAGRAPH, SELECT_LINE_START, SELECT_LINE_END, SELECT_LINE_LEFT, SELECT_LINE_RIGHT, DESELECT, NEW_LINE, TAB, UNDO, REDO, CHARACTER_PALETTE};
    }

    static {
        og3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private og3(String str, int i, boolean z) {
        this.editsText = z;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static og3 valueOf(String str) {
        return (og3) Enum.valueOf(og3.class, str);
    }

    public static og3[] values() {
        return (og3[]) $VALUES.clone();
    }

    public final boolean getEditsText() {
        return this.editsText;
    }
}
