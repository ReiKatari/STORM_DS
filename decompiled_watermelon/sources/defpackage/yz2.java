package defpackage;

import java.util.List;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yz2  reason: default package */
/* loaded from: classes.dex */
public final class yz2 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ yz2[] $VALUES;
    public static final yz2 A;
    public static final yz2 B;
    public static final xz2 Companion;
    public static final yz2 DEBUG;
    public static final yz2 DOWN;
    public static final yz2 FAST_FORWARD;
    public static final yz2 HINGE;
    public static final yz2 HOLD_FAST_FORWARD;
    public static final yz2 L;
    public static final yz2 LEFT;
    public static final yz2 MICROPHONE;
    public static final yz2 PAUSE;
    public static final yz2 QUICK_LOAD;
    public static final yz2 QUICK_SAVE;
    public static final yz2 R;
    public static final yz2 RESET;
    public static final yz2 REWIND;
    public static final yz2 RIGHT;
    public static final yz2 SELECT;
    public static final yz2 START;
    public static final yz2 SWAP_SCREENS;
    private static final List<yz2> SYSTEM_BUTTONS;
    public static final yz2 TOGGLE_SOFT_INPUT;
    public static final yz2 TOUCHSCREEN;
    public static final yz2 UP;
    public static final yz2 X;
    public static final yz2 Y;
    private final int keyCode;

    private static final /* synthetic */ yz2[] $values() {
        return new yz2[]{A, B, SELECT, START, RIGHT, LEFT, UP, DOWN, R, L, X, Y, DEBUG, TOUCHSCREEN, HINGE, PAUSE, FAST_FORWARD, MICROPHONE, RESET, TOGGLE_SOFT_INPUT, SWAP_SCREENS, QUICK_SAVE, QUICK_LOAD, REWIND, HOLD_FAST_FORWARD};
    }

    /* JADX WARN: Type inference failed for: r12v17, types: [xz2, java.lang.Object] */
    static {
        yz2 yz2Var = new yz2("A", 0, 0);
        A = yz2Var;
        yz2 yz2Var2 = new yz2("B", 1, 1);
        B = yz2Var2;
        yz2 yz2Var3 = new yz2("SELECT", 2, 2);
        SELECT = yz2Var3;
        yz2 yz2Var4 = new yz2("START", 3, 3);
        START = yz2Var4;
        yz2 yz2Var5 = new yz2("RIGHT", 4, 4);
        RIGHT = yz2Var5;
        yz2 yz2Var6 = new yz2("LEFT", 5, 5);
        LEFT = yz2Var6;
        yz2 yz2Var7 = new yz2("UP", 6, 6);
        UP = yz2Var7;
        yz2 yz2Var8 = new yz2("DOWN", 7, 7);
        DOWN = yz2Var8;
        yz2 yz2Var9 = new yz2("R", 8, 8);
        R = yz2Var9;
        yz2 yz2Var10 = new yz2("L", 9, 9);
        L = yz2Var10;
        yz2 yz2Var11 = new yz2("X", 10, 10);
        X = yz2Var11;
        yz2 yz2Var12 = new yz2("Y", 11, 11);
        Y = yz2Var12;
        DEBUG = new yz2("DEBUG", 12, 19);
        TOUCHSCREEN = new yz2("TOUCHSCREEN", 13, 22);
        HINGE = new yz2("HINGE", 14, 23);
        PAUSE = new yz2("PAUSE", 15, -1);
        FAST_FORWARD = new yz2("FAST_FORWARD", 16, -1);
        MICROPHONE = new yz2("MICROPHONE", 17, -1);
        RESET = new yz2("RESET", 18, -1);
        TOGGLE_SOFT_INPUT = new yz2("TOGGLE_SOFT_INPUT", 19, -1);
        SWAP_SCREENS = new yz2("SWAP_SCREENS", 20, -1);
        QUICK_SAVE = new yz2("QUICK_SAVE", 21, -1);
        QUICK_LOAD = new yz2("QUICK_LOAD", 22, -1);
        REWIND = new yz2("REWIND", 23, -1);
        HOLD_FAST_FORWARD = new yz2("HOLD_FAST_FORWARD", 24, -1);
        yz2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
        Companion = new Object();
        SYSTEM_BUTTONS = l07.c0(yz2Var, yz2Var2, yz2Var11, yz2Var12, yz2Var10, yz2Var9, yz2Var4, yz2Var3, yz2Var6, yz2Var5, yz2Var7, yz2Var8);
    }

    private yz2(String str, int i, int i2) {
        this.keyCode = i2;
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static yz2 valueOf(String str) {
        return (yz2) Enum.valueOf(yz2.class, str);
    }

    public static yz2[] values() {
        return (yz2[]) $VALUES.clone();
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
