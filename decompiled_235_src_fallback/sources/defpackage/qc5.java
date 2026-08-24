package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qc5  reason: default package */
/* loaded from: classes.dex */
public enum qc5 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.qc5[] $VALUES = null;
    public static final defpackage.qc5 REOPEN_PAUSE_MENU = null;
    public static final defpackage.qc5 START_SYNC = null;

    private static final /* synthetic */ defpackage.qc5[] $values() {
            qc5 r0 = defpackage.qc5.START_SYNC
            qc5 r1 = defpackage.qc5.REOPEN_PAUSE_MENU
            qc5[] r0 = new defpackage.qc5[]{r0, r1}
            return r0
    }

    static {
            qc5 r0 = new qc5
            java.lang.String r1 = "START_SYNC"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.qc5.START_SYNC = r0
            qc5 r0 = new qc5
            java.lang.String r1 = "REOPEN_PAUSE_MENU"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.qc5.REOPEN_PAUSE_MENU = r0
            qc5[] r0 = $values()
            defpackage.qc5.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.qc5.$ENTRIES = r0
            return
    }

    qc5(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.qc5.$ENTRIES
            return r0
    }

    public static defpackage.qc5 valueOf(java.lang.String r1) {
            java.lang.Class<qc5> r0 = defpackage.qc5.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            qc5 r1 = (defpackage.qc5) r1
            return r1
    }

    public static defpackage.qc5[] values() {
            qc5[] r0 = defpackage.qc5.$VALUES
            java.lang.Object r0 = r0.clone()
            qc5[] r0 = (defpackage.qc5[]) r0
            return r0
    }
}
