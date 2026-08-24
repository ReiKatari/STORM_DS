package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kt4  reason: default package */
/* loaded from: classes.dex */
public enum kt4 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.kt4[] $VALUES = null;
    public static final defpackage.kt4 Clockwise = null;
    public static final defpackage.kt4 CounterClockwise = null;

    private static final /* synthetic */ defpackage.kt4[] $values() {
            kt4 r0 = defpackage.kt4.CounterClockwise
            kt4 r1 = defpackage.kt4.Clockwise
            kt4[] r0 = new defpackage.kt4[]{r0, r1}
            return r0
    }

    static {
            kt4 r0 = new kt4
            java.lang.String r1 = "CounterClockwise"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.kt4.CounterClockwise = r0
            kt4 r0 = new kt4
            java.lang.String r1 = "Clockwise"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.kt4.Clockwise = r0
            kt4[] r0 = $values()
            defpackage.kt4.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.kt4.$ENTRIES = r0
            return
    }

    kt4(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.kt4.$ENTRIES
            return r0
    }

    public static defpackage.kt4 valueOf(java.lang.String r1) {
            java.lang.Class<kt4> r0 = defpackage.kt4.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kt4 r1 = (defpackage.kt4) r1
            return r1
    }

    public static defpackage.kt4[] values() {
            kt4[] r0 = defpackage.kt4.$VALUES
            java.lang.Object r0 = r0.clone()
            kt4[] r0 = (defpackage.kt4[]) r0
            return r0
    }
}
