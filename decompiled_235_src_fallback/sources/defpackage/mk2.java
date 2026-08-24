package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mk2  reason: default package */
/* loaded from: classes.dex */
public enum mk2 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.mk2[] $VALUES = null;
    public static final defpackage.mk2 BOTTOM_CENTER = null;
    public static final defpackage.mk2 BOTTOM_LEFT = null;
    public static final defpackage.mk2 BOTTOM_RIGHT = null;
    public static final defpackage.mk2 HIDDEN = null;
    public static final defpackage.mk2 TOP_CENTER = null;
    public static final defpackage.mk2 TOP_LEFT = null;
    public static final defpackage.mk2 TOP_RIGHT = null;

    private static final /* synthetic */ defpackage.mk2[] $values() {
            mk2 r0 = defpackage.mk2.HIDDEN
            mk2 r1 = defpackage.mk2.TOP_LEFT
            mk2 r2 = defpackage.mk2.TOP_CENTER
            mk2 r3 = defpackage.mk2.TOP_RIGHT
            mk2 r4 = defpackage.mk2.BOTTOM_LEFT
            mk2 r5 = defpackage.mk2.BOTTOM_CENTER
            mk2 r6 = defpackage.mk2.BOTTOM_RIGHT
            mk2[] r0 = new defpackage.mk2[]{r0, r1, r2, r3, r4, r5, r6}
            return r0
    }

    static {
            mk2 r0 = new mk2
            java.lang.String r1 = "HIDDEN"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.mk2.HIDDEN = r0
            mk2 r0 = new mk2
            java.lang.String r1 = "TOP_LEFT"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.mk2.TOP_LEFT = r0
            mk2 r0 = new mk2
            java.lang.String r1 = "TOP_CENTER"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.mk2.TOP_CENTER = r0
            mk2 r0 = new mk2
            java.lang.String r1 = "TOP_RIGHT"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.mk2.TOP_RIGHT = r0
            mk2 r0 = new mk2
            java.lang.String r1 = "BOTTOM_LEFT"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.mk2.BOTTOM_LEFT = r0
            mk2 r0 = new mk2
            java.lang.String r1 = "BOTTOM_CENTER"
            r2 = 5
            r0.<init>(r1, r2)
            defpackage.mk2.BOTTOM_CENTER = r0
            mk2 r0 = new mk2
            java.lang.String r1 = "BOTTOM_RIGHT"
            r2 = 6
            r0.<init>(r1, r2)
            defpackage.mk2.BOTTOM_RIGHT = r0
            mk2[] r0 = $values()
            defpackage.mk2.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.mk2.$ENTRIES = r0
            return
    }

    mk2(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.mk2.$ENTRIES
            return r0
    }

    public static defpackage.mk2 valueOf(java.lang.String r1) {
            java.lang.Class<mk2> r0 = defpackage.mk2.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            mk2 r1 = (defpackage.mk2) r1
            return r1
    }

    public static defpackage.mk2[] values() {
            mk2[] r0 = defpackage.mk2.$VALUES
            java.lang.Object r0 = r0.clone()
            mk2[] r0 = (defpackage.mk2[]) r0
            return r0
    }
}
