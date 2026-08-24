package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rq6  reason: default package */
/* loaded from: classes.dex */
public enum rq6 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.rq6[] $VALUES = null;
    public static final defpackage.rq6 Fixed = null;
    public static final defpackage.rq6 NotApplicable = null;
    public static final defpackage.rq6 NotFixed = null;
    public static final defpackage.rq6 Unknown = null;

    private static final /* synthetic */ defpackage.rq6[] $values() {
            rq6 r0 = defpackage.rq6.Unknown
            rq6 r1 = defpackage.rq6.Fixed
            rq6 r2 = defpackage.rq6.NotApplicable
            rq6 r3 = defpackage.rq6.NotFixed
            rq6[] r0 = new defpackage.rq6[]{r0, r1, r2, r3}
            return r0
    }

    static {
            rq6 r0 = new rq6
            java.lang.String r1 = "Unknown"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.rq6.Unknown = r0
            rq6 r0 = new rq6
            java.lang.String r1 = "Fixed"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.rq6.Fixed = r0
            rq6 r0 = new rq6
            java.lang.String r1 = "NotApplicable"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.rq6.NotApplicable = r0
            rq6 r0 = new rq6
            java.lang.String r1 = "NotFixed"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.rq6.NotFixed = r0
            rq6[] r0 = $values()
            defpackage.rq6.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.rq6.$ENTRIES = r0
            return
    }

    rq6(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.rq6.$ENTRIES
            return r0
    }

    public static defpackage.rq6 valueOf(java.lang.String r1) {
            java.lang.Class<rq6> r0 = defpackage.rq6.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            rq6 r1 = (defpackage.rq6) r1
            return r1
    }

    public static defpackage.rq6[] values() {
            rq6[] r0 = defpackage.rq6.$VALUES
            java.lang.Object r0 = r0.clone()
            rq6[] r0 = (defpackage.rq6[]) r0
            return r0
    }
}
