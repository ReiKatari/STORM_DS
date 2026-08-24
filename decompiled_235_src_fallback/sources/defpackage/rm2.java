package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rm2  reason: default package */
/* loaded from: classes.dex */
public enum rm2 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.rm2[] $VALUES = null;
    public static final defpackage.rm2 COMPLETE = null;
    public static final defpackage.rm2 FRAME_INFO_COMPLETE = null;
    public static final defpackage.rm2 STARTED = null;
    public static final defpackage.rm2 STREAM_RESULTS_COMPLETE = null;

    private static final /* synthetic */ defpackage.rm2[] $values() {
            rm2 r0 = defpackage.rm2.STARTED
            rm2 r1 = defpackage.rm2.FRAME_INFO_COMPLETE
            rm2 r2 = defpackage.rm2.STREAM_RESULTS_COMPLETE
            rm2 r3 = defpackage.rm2.COMPLETE
            rm2[] r0 = new defpackage.rm2[]{r0, r1, r2, r3}
            return r0
    }

    static {
            rm2 r0 = new rm2
            java.lang.String r1 = "STARTED"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.rm2.STARTED = r0
            rm2 r0 = new rm2
            java.lang.String r1 = "FRAME_INFO_COMPLETE"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.rm2.FRAME_INFO_COMPLETE = r0
            rm2 r0 = new rm2
            java.lang.String r1 = "STREAM_RESULTS_COMPLETE"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.rm2.STREAM_RESULTS_COMPLETE = r0
            rm2 r0 = new rm2
            java.lang.String r1 = "COMPLETE"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.rm2.COMPLETE = r0
            rm2[] r0 = $values()
            defpackage.rm2.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.rm2.$ENTRIES = r0
            return
    }

    rm2(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.rm2.$ENTRIES
            return r0
    }

    public static defpackage.rm2 valueOf(java.lang.String r1) {
            java.lang.Class<rm2> r0 = defpackage.rm2.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            rm2 r1 = (defpackage.rm2) r1
            return r1
    }

    public static defpackage.rm2[] values() {
            rm2[] r0 = defpackage.rm2.$VALUES
            java.lang.Object r0 = r0.clone()
            rm2[] r0 = (defpackage.rm2[]) r0
            return r0
    }
}
