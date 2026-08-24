package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ub6  reason: default package */
/* loaded from: classes.dex */
public enum ub6 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.ub6[] $VALUES = null;
    public static final defpackage.ub6 IDLE = null;
    public static final defpackage.ub6 QUEUED = null;
    public static final defpackage.ub6 QUEUING = null;
    public static final defpackage.ub6 RUNNING = null;

    private static /* synthetic */ defpackage.ub6[] $values() {
            ub6 r0 = defpackage.ub6.IDLE
            ub6 r1 = defpackage.ub6.QUEUING
            ub6 r2 = defpackage.ub6.QUEUED
            ub6 r3 = defpackage.ub6.RUNNING
            ub6[] r0 = new defpackage.ub6[]{r0, r1, r2, r3}
            return r0
    }

    static {
            ub6 r0 = new ub6
            java.lang.String r1 = "IDLE"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.ub6.IDLE = r0
            ub6 r0 = new ub6
            java.lang.String r1 = "QUEUING"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.ub6.QUEUING = r0
            ub6 r0 = new ub6
            java.lang.String r1 = "QUEUED"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.ub6.QUEUED = r0
            ub6 r0 = new ub6
            java.lang.String r1 = "RUNNING"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.ub6.RUNNING = r0
            ub6[] r0 = $values()
            defpackage.ub6.$VALUES = r0
            return
    }

    ub6(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.ub6 valueOf(java.lang.String r1) {
            java.lang.Class<ub6> r0 = defpackage.ub6.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ub6 r1 = (defpackage.ub6) r1
            return r1
    }

    public static defpackage.ub6[] values() {
            ub6[] r0 = defpackage.ub6.$VALUES
            java.lang.Object r0 = r0.clone()
            ub6[] r0 = (defpackage.ub6[]) r0
            return r0
    }
}
