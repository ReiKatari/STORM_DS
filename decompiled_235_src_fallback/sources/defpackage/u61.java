package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u61  reason: default package */
/* loaded from: classes.dex */
public enum u61 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.u61[] $VALUES = null;
    public static final defpackage.u61 BLOCKING = null;
    public static final defpackage.u61 CPU_ACQUIRED = null;
    public static final defpackage.u61 DORMANT = null;
    public static final defpackage.u61 PARKING = null;
    public static final defpackage.u61 TERMINATED = null;

    private static final /* synthetic */ defpackage.u61[] $values() {
            u61 r0 = defpackage.u61.CPU_ACQUIRED
            u61 r1 = defpackage.u61.BLOCKING
            u61 r2 = defpackage.u61.PARKING
            u61 r3 = defpackage.u61.DORMANT
            u61 r4 = defpackage.u61.TERMINATED
            u61[] r0 = new defpackage.u61[]{r0, r1, r2, r3, r4}
            return r0
    }

    static {
            u61 r0 = new u61
            java.lang.String r1 = "CPU_ACQUIRED"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.u61.CPU_ACQUIRED = r0
            u61 r0 = new u61
            java.lang.String r1 = "BLOCKING"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.u61.BLOCKING = r0
            u61 r0 = new u61
            java.lang.String r1 = "PARKING"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.u61.PARKING = r0
            u61 r0 = new u61
            java.lang.String r1 = "DORMANT"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.u61.DORMANT = r0
            u61 r0 = new u61
            java.lang.String r1 = "TERMINATED"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.u61.TERMINATED = r0
            u61[] r0 = $values()
            defpackage.u61.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.u61.$ENTRIES = r0
            return
    }

    u61(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.u61.$ENTRIES
            return r0
    }

    public static defpackage.u61 valueOf(java.lang.String r1) {
            java.lang.Class<u61> r0 = defpackage.u61.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            u61 r1 = (defpackage.u61) r1
            return r1
    }

    public static defpackage.u61[] values() {
            u61[] r0 = defpackage.u61.$VALUES
            java.lang.Object r0 = r0.clone()
            u61[] r0 = (defpackage.u61[]) r0
            return r0
    }
}
