package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qp6  reason: default package */
/* loaded from: classes.dex */
public enum qp6 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.qp6[] $VALUES = null;
    public static final defpackage.qp6 MatchFound = null;
    public static final defpackage.qp6 NoMatchFound = null;
    public static final defpackage.qp6 NoRequest = null;
    public static final defpackage.qp6 VisibleContentAbsentDuringTransition = null;

    private static final /* synthetic */ defpackage.qp6[] $values() {
            qp6 r0 = defpackage.qp6.NoRequest
            qp6 r1 = defpackage.qp6.MatchFound
            qp6 r2 = defpackage.qp6.VisibleContentAbsentDuringTransition
            qp6 r3 = defpackage.qp6.NoMatchFound
            qp6[] r0 = new defpackage.qp6[]{r0, r1, r2, r3}
            return r0
    }

    static {
            qp6 r0 = new qp6
            java.lang.String r1 = "NoRequest"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.qp6.NoRequest = r0
            qp6 r0 = new qp6
            java.lang.String r1 = "MatchFound"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.qp6.MatchFound = r0
            qp6 r0 = new qp6
            java.lang.String r1 = "VisibleContentAbsentDuringTransition"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.qp6.VisibleContentAbsentDuringTransition = r0
            qp6 r0 = new qp6
            java.lang.String r1 = "NoMatchFound"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.qp6.NoMatchFound = r0
            qp6[] r0 = $values()
            defpackage.qp6.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.qp6.$ENTRIES = r0
            return
    }

    qp6(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.qp6.$ENTRIES
            return r0
    }

    public static defpackage.qp6 valueOf(java.lang.String r1) {
            java.lang.Class<qp6> r0 = defpackage.qp6.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            qp6 r1 = (defpackage.qp6) r1
            return r1
    }

    public static defpackage.qp6[] values() {
            qp6[] r0 = defpackage.qp6.$VALUES
            java.lang.Object r0 = r0.clone()
            qp6[] r0 = (defpackage.qp6[]) r0
            return r0
    }
}
