package defpackage;

import java.util.List;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nj3  reason: default package */
/* loaded from: classes.dex */
public final class nj3 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ nj3[] $VALUES;
    public static final nj3 BOTTOM_SCREEN;
    public static final nj3 BUTTONS;
    public static final nj3 BUTTON_FAST_FORWARD_TOGGLE;
    public static final nj3 BUTTON_HINGE;
    public static final nj3 BUTTON_L;
    public static final nj3 BUTTON_MICROPHONE_TOGGLE;
    public static final nj3 BUTTON_PAUSE;
    public static final nj3 BUTTON_QUICK_LOAD;
    public static final nj3 BUTTON_QUICK_SAVE;
    public static final nj3 BUTTON_R;
    public static final nj3 BUTTON_RESET;
    public static final nj3 BUTTON_REWIND;
    public static final nj3 BUTTON_SELECT;
    public static final nj3 BUTTON_START;
    public static final nj3 BUTTON_SWAP_SCREENS;
    public static final nj3 BUTTON_TOGGLE_EXTRA_BUTTONS;
    public static final nj3 BUTTON_TOGGLE_SOFT_INPUT;
    public static final nj3 BUTTON_TRANSLATE;
    public static final nj3 DPAD;
    public static final nj3 HYBRID_SCREEN;
    public static final nj3 TOP_SCREEN;
    private final List<b63> matchingInputs;

    private static final /* synthetic */ nj3[] $values() {
        return new nj3[]{TOP_SCREEN, BOTTOM_SCREEN, HYBRID_SCREEN, DPAD, BUTTONS, BUTTON_START, BUTTON_SELECT, BUTTON_L, BUTTON_R, BUTTON_HINGE, BUTTON_FAST_FORWARD_TOGGLE, BUTTON_TOGGLE_SOFT_INPUT, BUTTON_RESET, BUTTON_PAUSE, BUTTON_SWAP_SCREENS, BUTTON_QUICK_SAVE, BUTTON_QUICK_LOAD, BUTTON_REWIND, BUTTON_MICROPHONE_TOGGLE, BUTTON_TRANSLATE, BUTTON_TOGGLE_EXTRA_BUTTONS};
    }

    static {
        yt1 yt1Var = yt1.A;
        TOP_SCREEN = new nj3("TOP_SCREEN", 0, yt1Var);
        BOTTOM_SCREEN = new nj3("BOTTOM_SCREEN", 1, yt1Var);
        HYBRID_SCREEN = new nj3("HYBRID_SCREEN", 2, yt1Var);
        DPAD = new nj3("DPAD", 3, hf.c0(b63.UP, b63.DOWN, b63.LEFT, b63.RIGHT));
        BUTTONS = new nj3("BUTTONS", 4, hf.c0(b63.A, b63.B, b63.X, b63.Y));
        BUTTON_START = new nj3("BUTTON_START", 5, hf.b0(b63.START));
        BUTTON_SELECT = new nj3("BUTTON_SELECT", 6, hf.b0(b63.SELECT));
        BUTTON_L = new nj3("BUTTON_L", 7, hf.b0(b63.L));
        BUTTON_R = new nj3("BUTTON_R", 8, hf.b0(b63.R));
        BUTTON_HINGE = new nj3("BUTTON_HINGE", 9, hf.b0(b63.HINGE));
        BUTTON_FAST_FORWARD_TOGGLE = new nj3("BUTTON_FAST_FORWARD_TOGGLE", 10, hf.b0(b63.FAST_FORWARD));
        BUTTON_TOGGLE_SOFT_INPUT = new nj3("BUTTON_TOGGLE_SOFT_INPUT", 11, hf.b0(b63.TOGGLE_SOFT_INPUT));
        BUTTON_RESET = new nj3("BUTTON_RESET", 12, hf.b0(b63.RESET));
        BUTTON_PAUSE = new nj3("BUTTON_PAUSE", 13, hf.b0(b63.PAUSE));
        BUTTON_SWAP_SCREENS = new nj3("BUTTON_SWAP_SCREENS", 14, hf.b0(b63.SWAP_SCREENS));
        BUTTON_QUICK_SAVE = new nj3("BUTTON_QUICK_SAVE", 15, hf.b0(b63.QUICK_SAVE));
        BUTTON_QUICK_LOAD = new nj3("BUTTON_QUICK_LOAD", 16, hf.b0(b63.QUICK_LOAD));
        BUTTON_REWIND = new nj3("BUTTON_REWIND", 17, hf.b0(b63.REWIND));
        BUTTON_MICROPHONE_TOGGLE = new nj3("BUTTON_MICROPHONE_TOGGLE", 18, hf.b0(b63.MICROPHONE));
        BUTTON_TRANSLATE = new nj3("BUTTON_TRANSLATE", 19, hf.b0(b63.TRANSLATE));
        BUTTON_TOGGLE_EXTRA_BUTTONS = new nj3("BUTTON_TOGGLE_EXTRA_BUTTONS", 20, hf.b0(b63.TOGGLE_EXTRA_BUTTONS));
        nj3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private nj3(String str, int i, List list) {
        this.matchingInputs = list;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static nj3 valueOf(String str) {
        return (nj3) Enum.valueOf(nj3.class, str);
    }

    public static nj3[] values() {
        return (nj3[]) $VALUES.clone();
    }

    public final List<b63> getMatchingInputs() {
        return this.matchingInputs;
    }

    public final boolean isScreen() {
        if (this != TOP_SCREEN && this != BOTTOM_SCREEN && this != HYBRID_SCREEN) {
            return false;
        }
        return true;
    }
}
