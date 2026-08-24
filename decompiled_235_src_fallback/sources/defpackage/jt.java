package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jt  reason: default package */
/* loaded from: classes.dex */
public enum jt extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.jt[] $VALUES = null;
    public static final defpackage.jt NIGHTLY = null;
    public static final defpackage.jt PRODUCTION = null;

    private static final /* synthetic */ defpackage.jt[] $values() {
            jt r0 = defpackage.jt.PRODUCTION
            jt r1 = defpackage.jt.NIGHTLY
            jt[] r0 = new defpackage.jt[]{r0, r1}
            return r0
    }

    static {
            jt r0 = new jt
            java.lang.String r1 = "PRODUCTION"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.jt.PRODUCTION = r0
            jt r0 = new jt
            java.lang.String r1 = "NIGHTLY"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.jt.NIGHTLY = r0
            jt[] r0 = $values()
            defpackage.jt.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.jt.$ENTRIES = r0
            return
    }

    jt(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.jt.$ENTRIES
            return r0
    }

    public static defpackage.jt valueOf(java.lang.String r1) {
            java.lang.Class<jt> r0 = defpackage.jt.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            jt r1 = (defpackage.jt) r1
            return r1
    }

    public static defpackage.jt[] values() {
            jt[] r0 = defpackage.jt.$VALUES
            java.lang.Object r0 = r0.clone()
            jt[] r0 = (defpackage.jt[]) r0
            return r0
    }
}
