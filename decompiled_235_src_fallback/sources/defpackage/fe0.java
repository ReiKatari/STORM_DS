package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fe0  reason: default package */
/* loaded from: classes.dex */
public enum fe0 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.fe0[] $VALUES = null;
    public static final defpackage.fe0 CONVERGED = null;
    public static final defpackage.fe0 FLASH_REQUIRED = null;
    public static final defpackage.fe0 INACTIVE = null;
    public static final defpackage.fe0 LOCKED = null;
    public static final defpackage.fe0 SEARCHING = null;
    public static final defpackage.fe0 UNKNOWN = null;

    private static /* synthetic */ defpackage.fe0[] $values() {
            fe0 r0 = defpackage.fe0.UNKNOWN
            fe0 r1 = defpackage.fe0.INACTIVE
            fe0 r2 = defpackage.fe0.SEARCHING
            fe0 r3 = defpackage.fe0.FLASH_REQUIRED
            fe0 r4 = defpackage.fe0.CONVERGED
            fe0 r5 = defpackage.fe0.LOCKED
            fe0[] r0 = new defpackage.fe0[]{r0, r1, r2, r3, r4, r5}
            return r0
    }

    static {
            fe0 r0 = new fe0
            java.lang.String r1 = "UNKNOWN"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.fe0.UNKNOWN = r0
            fe0 r0 = new fe0
            java.lang.String r1 = "INACTIVE"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.fe0.INACTIVE = r0
            fe0 r0 = new fe0
            java.lang.String r1 = "SEARCHING"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.fe0.SEARCHING = r0
            fe0 r0 = new fe0
            java.lang.String r1 = "FLASH_REQUIRED"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.fe0.FLASH_REQUIRED = r0
            fe0 r0 = new fe0
            java.lang.String r1 = "CONVERGED"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.fe0.CONVERGED = r0
            fe0 r0 = new fe0
            java.lang.String r1 = "LOCKED"
            r2 = 5
            r0.<init>(r1, r2)
            defpackage.fe0.LOCKED = r0
            fe0[] r0 = $values()
            defpackage.fe0.$VALUES = r0
            return
    }

    fe0(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.fe0 valueOf(java.lang.String r1) {
            java.lang.Class<fe0> r0 = defpackage.fe0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            fe0 r1 = (defpackage.fe0) r1
            return r1
    }

    public static defpackage.fe0[] values() {
            fe0[] r0 = defpackage.fe0.$VALUES
            java.lang.Object r0 = r0.clone()
            fe0[] r0 = (defpackage.fe0[]) r0
            return r0
    }
}
