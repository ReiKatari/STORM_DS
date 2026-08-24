package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iw7  reason: default package */
/* loaded from: classes.dex */
public enum iw7 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.iw7[] $VALUES = null;
    public static final defpackage.iw7 BLOCKED = null;
    public static final defpackage.iw7 CANCELLED = null;
    public static final defpackage.iw7 ENQUEUED = null;
    public static final defpackage.iw7 FAILED = null;
    public static final defpackage.iw7 RUNNING = null;
    public static final defpackage.iw7 SUCCEEDED = null;

    private static final /* synthetic */ defpackage.iw7[] $values() {
            iw7 r0 = defpackage.iw7.ENQUEUED
            iw7 r1 = defpackage.iw7.RUNNING
            iw7 r2 = defpackage.iw7.SUCCEEDED
            iw7 r3 = defpackage.iw7.FAILED
            iw7 r4 = defpackage.iw7.BLOCKED
            iw7 r5 = defpackage.iw7.CANCELLED
            iw7[] r0 = new defpackage.iw7[]{r0, r1, r2, r3, r4, r5}
            return r0
    }

    static {
            iw7 r0 = new iw7
            java.lang.String r1 = "ENQUEUED"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.iw7.ENQUEUED = r0
            iw7 r0 = new iw7
            java.lang.String r1 = "RUNNING"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.iw7.RUNNING = r0
            iw7 r0 = new iw7
            java.lang.String r1 = "SUCCEEDED"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.iw7.SUCCEEDED = r0
            iw7 r0 = new iw7
            java.lang.String r1 = "FAILED"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.iw7.FAILED = r0
            iw7 r0 = new iw7
            java.lang.String r1 = "BLOCKED"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.iw7.BLOCKED = r0
            iw7 r0 = new iw7
            java.lang.String r1 = "CANCELLED"
            r2 = 5
            r0.<init>(r1, r2)
            defpackage.iw7.CANCELLED = r0
            iw7[] r0 = $values()
            defpackage.iw7.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.iw7.$ENTRIES = r0
            return
    }

    iw7(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.iw7.$ENTRIES
            return r0
    }

    public static defpackage.iw7 valueOf(java.lang.String r1) {
            java.lang.Class<iw7> r0 = defpackage.iw7.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            iw7 r1 = (defpackage.iw7) r1
            return r1
    }

    public static defpackage.iw7[] values() {
            iw7[] r0 = defpackage.iw7.$VALUES
            java.lang.Object r0 = r0.clone()
            iw7[] r0 = (defpackage.iw7[]) r0
            return r0
    }

    public final boolean isFinished() {
            r1 = this;
            iw7 r0 = defpackage.iw7.SUCCEEDED
            if (r1 == r0) goto Lf
            iw7 r0 = defpackage.iw7.FAILED
            if (r1 == r0) goto Lf
            iw7 r0 = defpackage.iw7.CANCELLED
            if (r1 != r0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }
}
