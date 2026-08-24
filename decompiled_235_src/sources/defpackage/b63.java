package defpackage;

import java.util.List;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b63  reason: default package */
/* loaded from: classes.dex */
public final class b63 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ b63[] $VALUES;
    public static final b63 A;
    public static final b63 B;
    public static final a63 Companion;
    public static final b63 DEBUG;
    public static final b63 DOWN;
    public static final b63 FAST_FORWARD;
    public static final b63 HINGE;
    public static final b63 HOLD_FAST_FORWARD;
    public static final b63 L;
    public static final b63 LEFT;
    public static final b63 MICROPHONE;
    public static final b63 PAUSE;
    public static final b63 QUICK_LOAD;
    public static final b63 QUICK_SAVE;
    public static final b63 R;
    public static final b63 RESET;
    public static final b63 REWIND;
    public static final b63 RIGHT;
    public static final b63 SELECT;
    public static final b63 START;
    public static final b63 SWAP_SCREENS;
    private static final List<b63> SYSTEM_BUTTONS;
    public static final b63 TOGGLE_EXTRA_BUTTONS;
    public static final b63 TOGGLE_SOFT_INPUT;
    public static final b63 TOUCHSCREEN;
    public static final b63 TRANSLATE;
    public static final b63 UP;
    public static final b63 X;
    public static final b63 Y;
    private final int keyCode;

    private static final /* synthetic */ b63[] $values() {
        return new b63[]{A, B, SELECT, START, RIGHT, LEFT, UP, DOWN, R, L, X, Y, DEBUG, TOUCHSCREEN, HINGE, PAUSE, FAST_FORWARD, MICROPHONE, RESET, TOGGLE_SOFT_INPUT, SWAP_SCREENS, QUICK_SAVE, QUICK_LOAD, REWIND, HOLD_FAST_FORWARD, TRANSLATE, TOGGLE_EXTRA_BUTTONS};
    }

    /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.Object, a63] */
    static {
        b63 b63Var = new b63("A", 0, 0);
        A = b63Var;
        b63 b63Var2 = new b63("B", 1, 1);
        B = b63Var2;
        b63 b63Var3 = new b63("SELECT", 2, 2);
        SELECT = b63Var3;
        b63 b63Var4 = new b63("START", 3, 3);
        START = b63Var4;
        b63 b63Var5 = new b63("RIGHT", 4, 4);
        RIGHT = b63Var5;
        b63 b63Var6 = new b63("LEFT", 5, 5);
        LEFT = b63Var6;
        b63 b63Var7 = new b63("UP", 6, 6);
        UP = b63Var7;
        b63 b63Var8 = new b63("DOWN", 7, 7);
        DOWN = b63Var8;
        b63 b63Var9 = new b63("R", 8, 8);
        R = b63Var9;
        b63 b63Var10 = new b63("L", 9, 9);
        L = b63Var10;
        b63 b63Var11 = new b63("X", 10, 10);
        X = b63Var11;
        b63 b63Var12 = new b63("Y", 11, 11);
        Y = b63Var12;
        DEBUG = new b63("DEBUG", 12, 19);
        TOUCHSCREEN = new b63("TOUCHSCREEN", 13, 22);
        HINGE = new b63("HINGE", 14, 23);
        PAUSE = new b63("PAUSE", 15, -1);
        FAST_FORWARD = new b63("FAST_FORWARD", 16, -1);
        MICROPHONE = new b63("MICROPHONE", 17, -1);
        RESET = new b63("RESET", 18, -1);
        TOGGLE_SOFT_INPUT = new b63("TOGGLE_SOFT_INPUT", 19, -1);
        SWAP_SCREENS = new b63("SWAP_SCREENS", 20, -1);
        QUICK_SAVE = new b63("QUICK_SAVE", 21, -1);
        QUICK_LOAD = new b63("QUICK_LOAD", 22, -1);
        REWIND = new b63("REWIND", 23, -1);
        HOLD_FAST_FORWARD = new b63("HOLD_FAST_FORWARD", 24, -1);
        TRANSLATE = new b63("TRANSLATE", 25, -1);
        TOGGLE_EXTRA_BUTTONS = new b63("TOGGLE_EXTRA_BUTTONS", 26, -1);
        b63[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
        Companion = new Object();
        SYSTEM_BUTTONS = hf.c0(b63Var, b63Var2, b63Var11, b63Var12, b63Var10, b63Var9, b63Var4, b63Var3, b63Var6, b63Var5, b63Var7, b63Var8);
    }

    private b63(String str, int i, int i2) {
        this.keyCode = i2;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static b63 valueOf(String str) {
        return (b63) Enum.valueOf(b63.class, str);
    }

    public static b63[] values() {
        return (b63[]) $VALUES.clone();
    }

    public final int getKeyCode() {
        return this.keyCode;
    }

    public final boolean isSystemInput() {
        if (this.keyCode != -1) {
            return true;
        }
        return false;
    }
}
