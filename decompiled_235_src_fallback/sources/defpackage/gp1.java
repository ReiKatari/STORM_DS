package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gp1  reason: default package */
/* loaded from: classes.dex */
public enum gp1 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.gp1[] $VALUES = null;
    public static final defpackage.gp1 ACTIVE = null;
    public static final defpackage.gp1 INSTALLED = null;
    public static final defpackage.gp1 NOT_INSTALLED = null;

    private static final /* synthetic */ defpackage.gp1[] $values() {
            gp1 r0 = defpackage.gp1.ACTIVE
            gp1 r1 = defpackage.gp1.INSTALLED
            gp1 r2 = defpackage.gp1.NOT_INSTALLED
            gp1[] r0 = new defpackage.gp1[]{r0, r1, r2}
            return r0
    }

    static {
            gp1 r0 = new gp1
            java.lang.String r1 = "ACTIVE"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.gp1.ACTIVE = r0
            gp1 r0 = new gp1
            java.lang.String r1 = "INSTALLED"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.gp1.INSTALLED = r0
            gp1 r0 = new gp1
            java.lang.String r1 = "NOT_INSTALLED"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.gp1.NOT_INSTALLED = r0
            gp1[] r0 = $values()
            defpackage.gp1.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.gp1.$ENTRIES = r0
            return
    }

    gp1(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.gp1.$ENTRIES
            return r0
    }

    public static defpackage.gp1 valueOf(java.lang.String r1) {
            java.lang.Class<gp1> r0 = defpackage.gp1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            gp1 r1 = (defpackage.gp1) r1
            return r1
    }

    public static defpackage.gp1[] values() {
            gp1[] r0 = defpackage.gp1.$VALUES
            java.lang.Object r0 = r0.clone()
            gp1[] r0 = (defpackage.gp1[]) r0
            return r0
    }
}
