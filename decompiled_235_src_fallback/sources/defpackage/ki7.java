package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ki7  reason: default package */
/* loaded from: classes.dex */
public enum ki7 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.ki7[] $VALUES = null;
    public static final defpackage.ki7 CAMERA2_CAMERA_CONTROL = null;
    public static final defpackage.ki7 DEFAULT = null;
    public static final defpackage.ki7 SESSION_CONFIG = null;

    private static final /* synthetic */ defpackage.ki7[] $values() {
            ki7 r0 = defpackage.ki7.SESSION_CONFIG
            ki7 r1 = defpackage.ki7.DEFAULT
            ki7 r2 = defpackage.ki7.CAMERA2_CAMERA_CONTROL
            ki7[] r0 = new defpackage.ki7[]{r0, r1, r2}
            return r0
    }

    static {
            ki7 r0 = new ki7
            java.lang.String r1 = "SESSION_CONFIG"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.ki7.SESSION_CONFIG = r0
            ki7 r0 = new ki7
            java.lang.String r1 = "DEFAULT"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.ki7.DEFAULT = r0
            ki7 r0 = new ki7
            java.lang.String r1 = "CAMERA2_CAMERA_CONTROL"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.ki7.CAMERA2_CAMERA_CONTROL = r0
            ki7[] r0 = $values()
            defpackage.ki7.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.ki7.$ENTRIES = r0
            return
    }

    ki7(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.ki7.$ENTRIES
            return r0
    }

    public static defpackage.ki7 valueOf(java.lang.String r1) {
            java.lang.Class<ki7> r0 = defpackage.ki7.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ki7 r1 = (defpackage.ki7) r1
            return r1
    }

    public static defpackage.ki7[] values() {
            ki7[] r0 = defpackage.ki7.$VALUES
            java.lang.Object r0 = r0.clone()
            ki7[] r0 = (defpackage.ki7[]) r0
            return r0
    }
}
