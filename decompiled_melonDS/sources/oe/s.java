package oe;

import java.util.List;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s A;
    public static final s B;
    public static final r Companion;
    public static final s DEBUG;
    public static final s DOWN;
    public static final s FAST_FORWARD;
    public static final s HINGE;
    public static final s L;
    public static final s LEFT;
    public static final s MICROPHONE;
    public static final s PAUSE;
    public static final s QUICK_LOAD;
    public static final s QUICK_SAVE;
    public static final s R;
    public static final s RESET;
    public static final s REWIND;
    public static final s RIGHT;
    public static final s SELECT;
    public static final s START;
    public static final s SWAP_SCREENS;
    private static final List<s> SYSTEM_BUTTONS;
    public static final s TOGGLE_SOFT_INPUT;
    public static final s TOUCHSCREEN;
    public static final s UP;
    public static final s X;
    public static final s Y;
    private final int keyCode;

    private static final /* synthetic */ s[] $values() {
        return new s[]{A, B, SELECT, START, RIGHT, LEFT, UP, DOWN, R, L, X, Y, DEBUG, TOUCHSCREEN, HINGE, PAUSE, FAST_FORWARD, MICROPHONE, RESET, TOGGLE_SOFT_INPUT, SWAP_SCREENS, QUICK_SAVE, QUICK_LOAD, REWIND};
    }

    /* JADX WARN: Type inference failed for: r12v16, types: [oe.r, java.lang.Object] */
    static {
        s sVar = new s("A", 0, 0);
        A = sVar;
        s sVar2 = new s("B", 1, 1);
        B = sVar2;
        s sVar3 = new s("SELECT", 2, 2);
        SELECT = sVar3;
        s sVar4 = new s("START", 3, 3);
        START = sVar4;
        s sVar5 = new s("RIGHT", 4, 4);
        RIGHT = sVar5;
        s sVar6 = new s("LEFT", 5, 5);
        LEFT = sVar6;
        s sVar7 = new s("UP", 6, 6);
        UP = sVar7;
        s sVar8 = new s("DOWN", 7, 7);
        DOWN = sVar8;
        s sVar9 = new s("R", 8, 8);
        R = sVar9;
        s sVar10 = new s("L", 9, 9);
        L = sVar10;
        s sVar11 = new s("X", 10, 10);
        X = sVar11;
        s sVar12 = new s("Y", 11, 11);
        Y = sVar12;
        DEBUG = new s("DEBUG", 12, 19);
        TOUCHSCREEN = new s("TOUCHSCREEN", 13, 22);
        HINGE = new s("HINGE", 14, 23);
        PAUSE = new s("PAUSE", 15, -1);
        FAST_FORWARD = new s("FAST_FORWARD", 16, -1);
        MICROPHONE = new s("MICROPHONE", 17, -1);
        RESET = new s("RESET", 18, -1);
        TOGGLE_SOFT_INPUT = new s("TOGGLE_SOFT_INPUT", 19, -1);
        SWAP_SCREENS = new s("SWAP_SCREENS", 20, -1);
        QUICK_SAVE = new s("QUICK_SAVE", 21, -1);
        QUICK_LOAD = new s("QUICK_LOAD", 22, -1);
        REWIND = new s("REWIND", 23, -1);
        s[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
        Companion = new Object();
        SYSTEM_BUTTONS = p7.t.y(sVar, sVar2, sVar11, sVar12, sVar10, sVar9, sVar4, sVar3, sVar6, sVar5, sVar7, sVar8);
    }

    private s(String str, int i2, int i10) {
        this.keyCode = i10;
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
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
