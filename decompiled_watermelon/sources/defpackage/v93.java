package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v93  reason: default package */
/* loaded from: classes.dex */
public final class v93 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ v93[] $VALUES;
    private final boolean editsText;
    public static final v93 LEFT_CHAR = new v93("LEFT_CHAR", 0, false);
    public static final v93 RIGHT_CHAR = new v93("RIGHT_CHAR", 1, false);
    public static final v93 RIGHT_WORD = new v93("RIGHT_WORD", 2, false);
    public static final v93 LEFT_WORD = new v93("LEFT_WORD", 3, false);
    public static final v93 NEXT_PARAGRAPH = new v93("NEXT_PARAGRAPH", 4, false);
    public static final v93 PREV_PARAGRAPH = new v93("PREV_PARAGRAPH", 5, false);
    public static final v93 LINE_START = new v93("LINE_START", 6, false);
    public static final v93 LINE_END = new v93("LINE_END", 7, false);
    public static final v93 LINE_LEFT = new v93("LINE_LEFT", 8, false);
    public static final v93 LINE_RIGHT = new v93("LINE_RIGHT", 9, false);
    public static final v93 UP = new v93("UP", 10, false);
    public static final v93 DOWN = new v93("DOWN", 11, false);
    public static final v93 CENTER = new v93("CENTER", 12, false);
    public static final v93 PAGE_UP = new v93("PAGE_UP", 13, false);
    public static final v93 PAGE_DOWN = new v93("PAGE_DOWN", 14, false);
    public static final v93 HOME = new v93("HOME", 15, false);
    public static final v93 END = new v93("END", 16, false);
    public static final v93 COPY = new v93("COPY", 17, false);
    public static final v93 PASTE = new v93("PASTE", 18, true);
    public static final v93 CUT = new v93("CUT", 19, true);
    public static final v93 DELETE_PREV_CHAR = new v93("DELETE_PREV_CHAR", 20, true);
    public static final v93 DELETE_NEXT_CHAR = new v93("DELETE_NEXT_CHAR", 21, true);
    public static final v93 DELETE_PREV_WORD = new v93("DELETE_PREV_WORD", 22, true);
    public static final v93 DELETE_NEXT_WORD = new v93("DELETE_NEXT_WORD", 23, true);
    public static final v93 DELETE_FROM_LINE_START = new v93("DELETE_FROM_LINE_START", 24, true);
    public static final v93 DELETE_TO_LINE_END = new v93("DELETE_TO_LINE_END", 25, true);
    public static final v93 SELECT_ALL = new v93("SELECT_ALL", 26, false);
    public static final v93 SELECT_LEFT_CHAR = new v93("SELECT_LEFT_CHAR", 27, false);
    public static final v93 SELECT_RIGHT_CHAR = new v93("SELECT_RIGHT_CHAR", 28, false);
    public static final v93 SELECT_UP = new v93("SELECT_UP", 29, false);
    public static final v93 SELECT_DOWN = new v93("SELECT_DOWN", 30, false);
    public static final v93 SELECT_PAGE_UP = new v93("SELECT_PAGE_UP", 31, false);
    public static final v93 SELECT_PAGE_DOWN = new v93("SELECT_PAGE_DOWN", 32, false);
    public static final v93 SELECT_HOME = new v93("SELECT_HOME", 33, false);
    public static final v93 SELECT_END = new v93("SELECT_END", 34, false);
    public static final v93 SELECT_LEFT_WORD = new v93("SELECT_LEFT_WORD", 35, false);
    public static final v93 SELECT_RIGHT_WORD = new v93("SELECT_RIGHT_WORD", 36, false);
    public static final v93 SELECT_NEXT_PARAGRAPH = new v93("SELECT_NEXT_PARAGRAPH", 37, false);
    public static final v93 SELECT_PREV_PARAGRAPH = new v93("SELECT_PREV_PARAGRAPH", 38, false);
    public static final v93 SELECT_LINE_START = new v93("SELECT_LINE_START", 39, false);
    public static final v93 SELECT_LINE_END = new v93("SELECT_LINE_END", 40, false);
    public static final v93 SELECT_LINE_LEFT = new v93("SELECT_LINE_LEFT", 41, false);
    public static final v93 SELECT_LINE_RIGHT = new v93("SELECT_LINE_RIGHT", 42, false);
    public static final v93 DESELECT = new v93("DESELECT", 43, false);
    public static final v93 NEW_LINE = new v93("NEW_LINE", 44, true);
    public static final v93 TAB = new v93("TAB", 45, true);
    public static final v93 UNDO = new v93("UNDO", 46, true);
    public static final v93 REDO = new v93("REDO", 47, true);
    public static final v93 CHARACTER_PALETTE = new v93("CHARACTER_PALETTE", 48, true);

    private static final /* synthetic */ v93[] $values() {
        return new v93[]{LEFT_CHAR, RIGHT_CHAR, RIGHT_WORD, LEFT_WORD, NEXT_PARAGRAPH, PREV_PARAGRAPH, LINE_START, LINE_END, LINE_LEFT, LINE_RIGHT, UP, DOWN, CENTER, PAGE_UP, PAGE_DOWN, HOME, END, COPY, PASTE, CUT, DELETE_PREV_CHAR, DELETE_NEXT_CHAR, DELETE_PREV_WORD, DELETE_NEXT_WORD, DELETE_FROM_LINE_START, DELETE_TO_LINE_END, SELECT_ALL, SELECT_LEFT_CHAR, SELECT_RIGHT_CHAR, SELECT_UP, SELECT_DOWN, SELECT_PAGE_UP, SELECT_PAGE_DOWN, SELECT_HOME, SELECT_END, SELECT_LEFT_WORD, SELECT_RIGHT_WORD, SELECT_NEXT_PARAGRAPH, SELECT_PREV_PARAGRAPH, SELECT_LINE_START, SELECT_LINE_END, SELECT_LINE_LEFT, SELECT_LINE_RIGHT, DESELECT, NEW_LINE, TAB, UNDO, REDO, CHARACTER_PALETTE};
    }

    static {
        v93[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private v93(String str, int i, boolean z) {
        this.editsText = z;
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static v93 valueOf(String str) {
        return (v93) Enum.valueOf(v93.class, str);
    }

    public static v93[] values() {
        return (v93[]) $VALUES.clone();
    }

    public final boolean getEditsText() {
        return this.editsText;
    }
}
