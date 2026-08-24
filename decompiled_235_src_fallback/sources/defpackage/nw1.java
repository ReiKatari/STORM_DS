package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nw1  reason: default package */
/* loaded from: classes.dex */
public enum nw1 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.nw1[] $VALUES = null;
    public static final defpackage.nw1 INIT_FAILED = null;
    public static final defpackage.nw1 UNSUPPORTED = null;

    private static final /* synthetic */ defpackage.nw1[] $values() {
            nw1 r0 = defpackage.nw1.UNSUPPORTED
            nw1 r1 = defpackage.nw1.INIT_FAILED
            nw1[] r0 = new defpackage.nw1[]{r0, r1}
            return r0
    }

    static {
            nw1 r0 = new nw1
            java.lang.String r1 = "UNSUPPORTED"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.nw1.UNSUPPORTED = r0
            nw1 r0 = new nw1
            java.lang.String r1 = "INIT_FAILED"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.nw1.INIT_FAILED = r0
            nw1[] r0 = $values()
            defpackage.nw1.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.nw1.$ENTRIES = r0
            return
    }

    nw1(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.nw1.$ENTRIES
            return r0
    }

    public static defpackage.nw1 valueOf(java.lang.String r1) {
            java.lang.Class<nw1> r0 = defpackage.nw1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            nw1 r1 = (defpackage.nw1) r1
            return r1
    }

    public static defpackage.nw1[] values() {
            nw1[] r0 = defpackage.nw1.$VALUES
            java.lang.Object r0 = r0.clone()
            nw1[] r0 = (defpackage.nw1[]) r0
            return r0
    }
}
