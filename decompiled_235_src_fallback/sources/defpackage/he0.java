package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: he0  reason: default package */
/* loaded from: classes.dex */
public enum he0 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.he0[] $VALUES = null;
    public static final defpackage.he0 CONVERGED = null;
    public static final defpackage.he0 INACTIVE = null;
    public static final defpackage.he0 LOCKED = null;
    public static final defpackage.he0 METERING = null;
    public static final defpackage.he0 UNKNOWN = null;

    private static /* synthetic */ defpackage.he0[] $values() {
            he0 r0 = defpackage.he0.UNKNOWN
            he0 r1 = defpackage.he0.INACTIVE
            he0 r2 = defpackage.he0.METERING
            he0 r3 = defpackage.he0.CONVERGED
            he0 r4 = defpackage.he0.LOCKED
            he0[] r0 = new defpackage.he0[]{r0, r1, r2, r3, r4}
            return r0
    }

    static {
            he0 r0 = new he0
            java.lang.String r1 = "UNKNOWN"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.he0.UNKNOWN = r0
            he0 r0 = new he0
            java.lang.String r1 = "INACTIVE"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.he0.INACTIVE = r0
            he0 r0 = new he0
            java.lang.String r1 = "METERING"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.he0.METERING = r0
            he0 r0 = new he0
            java.lang.String r1 = "CONVERGED"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.he0.CONVERGED = r0
            he0 r0 = new he0
            java.lang.String r1 = "LOCKED"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.he0.LOCKED = r0
            he0[] r0 = $values()
            defpackage.he0.$VALUES = r0
            return
    }

    he0(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.he0 valueOf(java.lang.String r1) {
            java.lang.Class<he0> r0 = defpackage.he0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            he0 r1 = (defpackage.he0) r1
            return r1
    }

    public static defpackage.he0[] values() {
            he0[] r0 = defpackage.he0.$VALUES
            java.lang.Object r0 = r0.clone()
            he0[] r0 = (defpackage.he0[]) r0
            return r0
    }
}
