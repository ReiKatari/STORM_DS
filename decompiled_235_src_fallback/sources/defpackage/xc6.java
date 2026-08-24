package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xc6  reason: default package */
/* loaded from: classes.dex */
public enum xc6 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.xc6[] $VALUES = null;
    public static final defpackage.xc6 CREATED = null;
    public static final defpackage.xc6 CREATING = null;
    public static final defpackage.xc6 PENDING = null;

    private static final /* synthetic */ defpackage.xc6[] $values() {
            xc6 r0 = defpackage.xc6.PENDING
            xc6 r1 = defpackage.xc6.CREATING
            xc6 r2 = defpackage.xc6.CREATED
            xc6[] r0 = new defpackage.xc6[]{r0, r1, r2}
            return r0
    }

    static {
            xc6 r0 = new xc6
            java.lang.String r1 = "PENDING"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.xc6.PENDING = r0
            xc6 r0 = new xc6
            java.lang.String r1 = "CREATING"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.xc6.CREATING = r0
            xc6 r0 = new xc6
            java.lang.String r1 = "CREATED"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.xc6.CREATED = r0
            xc6[] r0 = $values()
            defpackage.xc6.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.xc6.$ENTRIES = r0
            return
    }

    xc6(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.xc6.$ENTRIES
            return r0
    }

    public static defpackage.xc6 valueOf(java.lang.String r1) {
            java.lang.Class<xc6> r0 = defpackage.xc6.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            xc6 r1 = (defpackage.xc6) r1
            return r1
    }

    public static defpackage.xc6[] values() {
            xc6[] r0 = defpackage.xc6.$VALUES
            java.lang.Object r0 = r0.clone()
            xc6[] r0 = (defpackage.xc6[]) r0
            return r0
    }
}
