package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: as3  reason: default package */
/* loaded from: classes.dex */
public enum as3 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.as3[] $VALUES = null;
    public static final defpackage.as3 CANCELED = null;
    public static final defpackage.as3 FAILED = null;
    public static final defpackage.as3 PENDING = null;
    public static final defpackage.as3 SCOREBOARD = null;
    public static final defpackage.as3 TRACKING = null;

    private static final /* synthetic */ defpackage.as3[] $values() {
            as3 r0 = defpackage.as3.TRACKING
            as3 r1 = defpackage.as3.PENDING
            as3 r2 = defpackage.as3.SCOREBOARD
            as3 r3 = defpackage.as3.FAILED
            as3 r4 = defpackage.as3.CANCELED
            as3[] r0 = new defpackage.as3[]{r0, r1, r2, r3, r4}
            return r0
    }

    static {
            as3 r0 = new as3
            java.lang.String r1 = "TRACKING"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.as3.TRACKING = r0
            as3 r0 = new as3
            java.lang.String r1 = "PENDING"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.as3.PENDING = r0
            as3 r0 = new as3
            java.lang.String r1 = "SCOREBOARD"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.as3.SCOREBOARD = r0
            as3 r0 = new as3
            java.lang.String r1 = "FAILED"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.as3.FAILED = r0
            as3 r0 = new as3
            java.lang.String r1 = "CANCELED"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.as3.CANCELED = r0
            as3[] r0 = $values()
            defpackage.as3.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.as3.$ENTRIES = r0
            return
    }

    as3(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.as3.$ENTRIES
            return r0
    }

    public static defpackage.as3 valueOf(java.lang.String r1) {
            java.lang.Class<as3> r0 = defpackage.as3.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            as3 r1 = (defpackage.as3) r1
            return r1
    }

    public static defpackage.as3[] values() {
            as3[] r0 = defpackage.as3.$VALUES
            java.lang.Object r0 = r0.clone()
            as3[] r0 = (defpackage.as3[]) r0
            return r0
    }
}
