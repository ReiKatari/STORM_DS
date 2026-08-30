package defpackage;

import java.util.List;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vc3  reason: default package */
/* loaded from: classes.dex */
public final class vc3 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ vc3[] $VALUES;
    public static final vc3 BOTTOM_SCREEN;
    public static final vc3 BUTTONS;
    public static final vc3 BUTTON_FAST_FORWARD_TOGGLE;
    public static final vc3 BUTTON_HINGE;
    public static final vc3 BUTTON_L;
    public static final vc3 BUTTON_MICROPHONE_TOGGLE;
    public static final vc3 BUTTON_PAUSE;
    public static final vc3 BUTTON_QUICK_LOAD;
    public static final vc3 BUTTON_QUICK_SAVE;
    public static final vc3 BUTTON_R;
    public static final vc3 BUTTON_RESET;
    public static final vc3 BUTTON_REWIND;
    public static final vc3 BUTTON_SELECT;
    public static final vc3 BUTTON_START;
    public static final vc3 BUTTON_SWAP_SCREENS;
    public static final vc3 BUTTON_TOGGLE_SOFT_INPUT;
    public static final vc3 DPAD;
    public static final vc3 HYBRID_SCREEN;
    public static final vc3 TOP_SCREEN;
    private final List<yz2> matchingInputs;

    private static final /* synthetic */ vc3[] $values() {
        return new vc3[]{TOP_SCREEN, BOTTOM_SCREEN, HYBRID_SCREEN, DPAD, BUTTONS, BUTTON_START, BUTTON_SELECT, BUTTON_L, BUTTON_R, BUTTON_HINGE, BUTTON_FAST_FORWARD_TOGGLE, BUTTON_TOGGLE_SOFT_INPUT, BUTTON_RESET, BUTTON_PAUSE, BUTTON_SWAP_SCREENS, BUTTON_QUICK_SAVE, BUTTON_QUICK_LOAD, BUTTON_REWIND, BUTTON_MICROPHONE_TOGGLE};
    }

    static {
        pp1 pp1Var = pp1.A;
        TOP_SCREEN = new vc3("TOP_SCREEN", 0, pp1Var);
        BOTTOM_SCREEN = new vc3("BOTTOM_SCREEN", 1, pp1Var);
        HYBRID_SCREEN = new vc3("HYBRID_SCREEN", 2, pp1Var);
        DPAD = new vc3("DPAD", 3, l07.c0(yz2.UP, yz2.DOWN, yz2.LEFT, yz2.RIGHT));
        BUTTONS = new vc3("BUTTONS", 4, l07.c0(yz2.A, yz2.B, yz2.X, yz2.Y));
        BUTTON_START = new vc3("BUTTON_START", 5, l07.b0(yz2.START));
        BUTTON_SELECT = new vc3("BUTTON_SELECT", 6, l07.b0(yz2.SELECT));
        BUTTON_L = new vc3("BUTTON_L", 7, l07.b0(yz2.L));
        BUTTON_R = new vc3("BUTTON_R", 8, l07.b0(yz2.R));
        BUTTON_HINGE = new vc3("BUTTON_HINGE", 9, l07.b0(yz2.HINGE));
        BUTTON_FAST_FORWARD_TOGGLE = new vc3("BUTTON_FAST_FORWARD_TOGGLE", 10, l07.b0(yz2.FAST_FORWARD));
        BUTTON_TOGGLE_SOFT_INPUT = new vc3("BUTTON_TOGGLE_SOFT_INPUT", 11, l07.b0(yz2.TOGGLE_SOFT_INPUT));
        BUTTON_RESET = new vc3("BUTTON_RESET", 12, l07.b0(yz2.RESET));
        BUTTON_PAUSE = new vc3("BUTTON_PAUSE", 13, l07.b0(yz2.PAUSE));
        BUTTON_SWAP_SCREENS = new vc3("BUTTON_SWAP_SCREENS", 14, l07.b0(yz2.SWAP_SCREENS));
        BUTTON_QUICK_SAVE = new vc3("BUTTON_QUICK_SAVE", 15, l07.b0(yz2.QUICK_SAVE));
        BUTTON_QUICK_LOAD = new vc3("BUTTON_QUICK_LOAD", 16, l07.b0(yz2.QUICK_LOAD));
        BUTTON_REWIND = new vc3("BUTTON_REWIND", 17, l07.b0(yz2.REWIND));
        BUTTON_MICROPHONE_TOGGLE = new vc3("BUTTON_MICROPHONE_TOGGLE", 18, l07.b0(yz2.MICROPHONE));
        vc3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private vc3(String str, int i, List list) {
        this.matchingInputs = list;
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static vc3 valueOf(String str) {
        return (vc3) Enum.valueOf(vc3.class, str);
    }

    public static vc3[] values() {
        return (vc3[]) $VALUES.clone();
    }

    public final List<yz2> getMatchingInputs() {
        return this.matchingInputs;
    }

    public final boolean isScreen() {
        if (this != TOP_SCREEN && this != BOTTOM_SCREEN && this != HYBRID_SCREEN) {
            return false;
        }
        return true;
    }
}
