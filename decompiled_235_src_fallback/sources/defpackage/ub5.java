package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ub5  reason: default package */
/* loaded from: classes.dex */
public enum ub5 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.ub5[] $VALUES = null;
    public static final defpackage.ub5 OFFLINE_ACCUMULATING = null;
    public static final defpackage.ub5 ONLINE_LIVE = null;
    public static final defpackage.ub5 PENDING_RA_SUBMISSIONS = null;
    public static final defpackage.ub5 RECONCILING_RA_SUBMISSIONS = null;

    private static final /* synthetic */ defpackage.ub5[] $values() {
            ub5 r0 = defpackage.ub5.ONLINE_LIVE
            ub5 r1 = defpackage.ub5.OFFLINE_ACCUMULATING
            ub5 r2 = defpackage.ub5.PENDING_RA_SUBMISSIONS
            ub5 r3 = defpackage.ub5.RECONCILING_RA_SUBMISSIONS
            ub5[] r0 = new defpackage.ub5[]{r0, r1, r2, r3}
            return r0
    }

    static {
            ub5 r0 = new ub5
            java.lang.String r1 = "ONLINE_LIVE"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.ub5.ONLINE_LIVE = r0
            ub5 r0 = new ub5
            java.lang.String r1 = "OFFLINE_ACCUMULATING"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.ub5.OFFLINE_ACCUMULATING = r0
            ub5 r0 = new ub5
            java.lang.String r1 = "PENDING_RA_SUBMISSIONS"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.ub5.PENDING_RA_SUBMISSIONS = r0
            ub5 r0 = new ub5
            java.lang.String r1 = "RECONCILING_RA_SUBMISSIONS"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.ub5.RECONCILING_RA_SUBMISSIONS = r0
            ub5[] r0 = $values()
            defpackage.ub5.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.ub5.$ENTRIES = r0
            return
    }

    ub5(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.ub5.$ENTRIES
            return r0
    }

    public static defpackage.ub5 valueOf(java.lang.String r1) {
            java.lang.Class<ub5> r0 = defpackage.ub5.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ub5 r1 = (defpackage.ub5) r1
            return r1
    }

    public static defpackage.ub5[] values() {
            ub5[] r0 = defpackage.ub5.$VALUES
            java.lang.Object r0 = r0.clone()
            ub5[] r0 = (defpackage.ub5[]) r0
            return r0
    }
}
