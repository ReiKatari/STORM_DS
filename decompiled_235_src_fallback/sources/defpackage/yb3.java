package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yb3  reason: default package */
/* loaded from: classes.dex */
public enum yb3 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.yb3[] $VALUES = null;
    public static final defpackage.yb3 DEFERRED = null;
    public static final defpackage.yb3 IGNORED = null;
    public static final defpackage.yb3 IMMINENT = null;
    public static final defpackage.yb3 SCHEDULED = null;

    private static final /* synthetic */ defpackage.yb3[] $values() {
            yb3 r0 = defpackage.yb3.IGNORED
            yb3 r1 = defpackage.yb3.SCHEDULED
            yb3 r2 = defpackage.yb3.DEFERRED
            yb3 r3 = defpackage.yb3.IMMINENT
            yb3[] r0 = new defpackage.yb3[]{r0, r1, r2, r3}
            return r0
    }

    static {
            yb3 r0 = new yb3
            java.lang.String r1 = "IGNORED"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.yb3.IGNORED = r0
            yb3 r0 = new yb3
            java.lang.String r1 = "SCHEDULED"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.yb3.SCHEDULED = r0
            yb3 r0 = new yb3
            java.lang.String r1 = "DEFERRED"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.yb3.DEFERRED = r0
            yb3 r0 = new yb3
            java.lang.String r1 = "IMMINENT"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.yb3.IMMINENT = r0
            yb3[] r0 = $values()
            defpackage.yb3.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.yb3.$ENTRIES = r0
            return
    }

    yb3(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.yb3.$ENTRIES
            return r0
    }

    public static defpackage.yb3 valueOf(java.lang.String r1) {
            java.lang.Class<yb3> r0 = defpackage.yb3.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            yb3 r1 = (defpackage.yb3) r1
            return r1
    }

    public static defpackage.yb3[] values() {
            yb3[] r0 = defpackage.yb3.$VALUES
            java.lang.Object r0 = r0.clone()
            yb3[] r0 = (defpackage.yb3[]) r0
            return r0
    }
}
