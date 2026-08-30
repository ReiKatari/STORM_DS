package ve;

import java.util.List;
import oe.s;
import p7.t;
import q8.r;
import zb.q;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c BOTTOM_SCREEN;
    public static final c BUTTONS;
    public static final c BUTTON_FAST_FORWARD_TOGGLE;
    public static final c BUTTON_HINGE;
    public static final c BUTTON_L;
    public static final c BUTTON_MICROPHONE_TOGGLE;
    public static final c BUTTON_PAUSE;
    public static final c BUTTON_QUICK_LOAD;
    public static final c BUTTON_QUICK_SAVE;
    public static final c BUTTON_R;
    public static final c BUTTON_RESET;
    public static final c BUTTON_REWIND;
    public static final c BUTTON_SELECT;
    public static final c BUTTON_START;
    public static final c BUTTON_SWAP_SCREENS;
    public static final c BUTTON_TOGGLE_SOFT_INPUT;
    public static final c DPAD;
    public static final c TOP_SCREEN;
    private final List<s> matchingInputs;

    private static final /* synthetic */ c[] $values() {
        return new c[]{TOP_SCREEN, BOTTOM_SCREEN, DPAD, BUTTONS, BUTTON_START, BUTTON_SELECT, BUTTON_L, BUTTON_R, BUTTON_HINGE, BUTTON_FAST_FORWARD_TOGGLE, BUTTON_TOGGLE_SOFT_INPUT, BUTTON_RESET, BUTTON_PAUSE, BUTTON_SWAP_SCREENS, BUTTON_QUICK_SAVE, BUTTON_QUICK_LOAD, BUTTON_REWIND, BUTTON_MICROPHONE_TOGGLE};
    }

    static {
        q qVar = q.A;
        TOP_SCREEN = new c("TOP_SCREEN", 0, qVar);
        BOTTOM_SCREEN = new c("BOTTOM_SCREEN", 1, qVar);
        DPAD = new c("DPAD", 2, t.y(s.UP, s.DOWN, s.LEFT, s.RIGHT));
        BUTTONS = new c("BUTTONS", 3, t.y(s.A, s.B, s.X, s.Y));
        BUTTON_START = new c("BUTTON_START", 4, t.x(s.START));
        BUTTON_SELECT = new c("BUTTON_SELECT", 5, t.x(s.SELECT));
        BUTTON_L = new c("BUTTON_L", 6, t.x(s.L));
        BUTTON_R = new c("BUTTON_R", 7, t.x(s.R));
        BUTTON_HINGE = new c("BUTTON_HINGE", 8, t.x(s.HINGE));
        BUTTON_FAST_FORWARD_TOGGLE = new c("BUTTON_FAST_FORWARD_TOGGLE", 9, t.x(s.FAST_FORWARD));
        BUTTON_TOGGLE_SOFT_INPUT = new c("BUTTON_TOGGLE_SOFT_INPUT", 10, t.x(s.TOGGLE_SOFT_INPUT));
        BUTTON_RESET = new c("BUTTON_RESET", 11, t.x(s.RESET));
        BUTTON_PAUSE = new c("BUTTON_PAUSE", 12, t.x(s.PAUSE));
        BUTTON_SWAP_SCREENS = new c("BUTTON_SWAP_SCREENS", 13, t.x(s.SWAP_SCREENS));
        BUTTON_QUICK_SAVE = new c("BUTTON_QUICK_SAVE", 14, t.x(s.QUICK_SAVE));
        BUTTON_QUICK_LOAD = new c("BUTTON_QUICK_LOAD", 15, t.x(s.QUICK_LOAD));
        BUTTON_REWIND = new c("BUTTON_REWIND", 16, t.x(s.REWIND));
        BUTTON_MICROPHONE_TOGGLE = new c("BUTTON_MICROPHONE_TOGGLE", 17, t.x(s.MICROPHONE));
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = r.x($values);
    }

    private c(String str, int i2, List list) {
        this.matchingInputs = list;
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final List<s> getMatchingInputs() {
        return this.matchingInputs;
    }

    public final boolean isScreen() {
        if (this != TOP_SCREEN && this != BOTTOM_SCREEN) {
            return false;
        }
        return true;
    }
}
