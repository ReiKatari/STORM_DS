package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ds0  reason: default package */
/* loaded from: classes.dex */
public enum ds0 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.ds0[] $VALUES = null;
    public static final defpackage.ds0 APP_CLOSED = null;
    public static final defpackage.ds0 APP_DISCONNECTED = null;
    public static final defpackage.ds0 CAMERA2_CLOSED = null;
    public static final defpackage.ds0 CAMERA2_DISCONNECTED = null;
    public static final defpackage.ds0 CAMERA2_ERROR = null;
    public static final defpackage.ds0 CAMERA2_EXCEPTION = null;

    private static final /* synthetic */ defpackage.ds0[] $values() {
            ds0 r0 = defpackage.ds0.APP_CLOSED
            ds0 r1 = defpackage.ds0.APP_DISCONNECTED
            ds0 r2 = defpackage.ds0.CAMERA2_CLOSED
            ds0 r3 = defpackage.ds0.CAMERA2_DISCONNECTED
            ds0 r4 = defpackage.ds0.CAMERA2_ERROR
            ds0 r5 = defpackage.ds0.CAMERA2_EXCEPTION
            ds0[] r0 = new defpackage.ds0[]{r0, r1, r2, r3, r4, r5}
            return r0
    }

    static {
            ds0 r0 = new ds0
            java.lang.String r1 = "APP_CLOSED"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.ds0.APP_CLOSED = r0
            ds0 r0 = new ds0
            java.lang.String r1 = "APP_DISCONNECTED"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.ds0.APP_DISCONNECTED = r0
            ds0 r0 = new ds0
            java.lang.String r1 = "CAMERA2_CLOSED"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.ds0.CAMERA2_CLOSED = r0
            ds0 r0 = new ds0
            java.lang.String r1 = "CAMERA2_DISCONNECTED"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.ds0.CAMERA2_DISCONNECTED = r0
            ds0 r0 = new ds0
            java.lang.String r1 = "CAMERA2_ERROR"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.ds0.CAMERA2_ERROR = r0
            ds0 r0 = new ds0
            java.lang.String r1 = "CAMERA2_EXCEPTION"
            r2 = 5
            r0.<init>(r1, r2)
            defpackage.ds0.CAMERA2_EXCEPTION = r0
            ds0[] r0 = $values()
            defpackage.ds0.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.ds0.$ENTRIES = r0
            return
    }

    ds0(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.ds0.$ENTRIES
            return r0
    }

    public static defpackage.ds0 valueOf(java.lang.String r1) {
            java.lang.Class<ds0> r0 = defpackage.ds0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ds0 r1 = (defpackage.ds0) r1
            return r1
    }

    public static defpackage.ds0[] values() {
            ds0[] r0 = defpackage.ds0.$VALUES
            java.lang.Object r0 = r0.clone()
            ds0[] r0 = (defpackage.ds0[]) r0
            return r0
    }
}
