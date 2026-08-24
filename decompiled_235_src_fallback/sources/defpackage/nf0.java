package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nf0  reason: default package */
/* loaded from: classes.dex */
public enum nf0 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.nf0[] $VALUES = null;
    public static final defpackage.nf0 AT_LEAST = null;
    public static final defpackage.nf0 EXACT = null;

    private static final /* synthetic */ defpackage.nf0[] $values() {
            nf0 r0 = defpackage.nf0.AT_LEAST
            nf0 r1 = defpackage.nf0.EXACT
            nf0[] r0 = new defpackage.nf0[]{r0, r1}
            return r0
    }

    static {
            nf0 r0 = new nf0
            java.lang.String r1 = "AT_LEAST"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.nf0.AT_LEAST = r0
            nf0 r0 = new nf0
            java.lang.String r1 = "EXACT"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.nf0.EXACT = r0
            nf0[] r0 = $values()
            defpackage.nf0.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.nf0.$ENTRIES = r0
            return
    }

    nf0(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.nf0.$ENTRIES
            return r0
    }

    public static defpackage.nf0 valueOf(java.lang.String r1) {
            java.lang.Class<nf0> r0 = defpackage.nf0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            nf0 r1 = (defpackage.nf0) r1
            return r1
    }

    public static defpackage.nf0[] values() {
            nf0[] r0 = defpackage.nf0.$VALUES
            java.lang.Object r0 = r0.clone()
            nf0[] r0 = (defpackage.nf0[]) r0
            return r0
    }
}
