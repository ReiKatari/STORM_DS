package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bz0  reason: default package */
/* loaded from: classes.dex */
public enum bz0 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.bz0[] $VALUES = null;
    public static final defpackage.bz0 INVALID = null;
    public static final defpackage.bz0 MISSING = null;
    public static final defpackage.bz0 PRESENT = null;

    private static final /* synthetic */ defpackage.bz0[] $values() {
            bz0 r0 = defpackage.bz0.PRESENT
            bz0 r1 = defpackage.bz0.MISSING
            bz0 r2 = defpackage.bz0.INVALID
            bz0[] r0 = new defpackage.bz0[]{r0, r1, r2}
            return r0
    }

    static {
            bz0 r0 = new bz0
            java.lang.String r1 = "PRESENT"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.bz0.PRESENT = r0
            bz0 r0 = new bz0
            java.lang.String r1 = "MISSING"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.bz0.MISSING = r0
            bz0 r0 = new bz0
            java.lang.String r1 = "INVALID"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.bz0.INVALID = r0
            bz0[] r0 = $values()
            defpackage.bz0.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.bz0.$ENTRIES = r0
            return
    }

    bz0(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.bz0.$ENTRIES
            return r0
    }

    public static defpackage.bz0 valueOf(java.lang.String r1) {
            java.lang.Class<bz0> r0 = defpackage.bz0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            bz0 r1 = (defpackage.bz0) r1
            return r1
    }

    public static defpackage.bz0[] values() {
            bz0[] r0 = defpackage.bz0.$VALUES
            java.lang.Object r0 = r0.clone()
            bz0[] r0 = (defpackage.bz0[]) r0
            return r0
    }
}
