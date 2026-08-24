package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f66  reason: default package */
/* loaded from: classes.dex */
public enum f66 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.f66[] $VALUES = null;
    public static final defpackage.f66 DEVICE_CHARGING = null;
    public static final defpackage.f66 DEVICE_IDLE = null;
    public static final defpackage.f66 NETWORK_UNMETERED = null;

    static {
            f66 r0 = new f66
            java.lang.String r1 = "NETWORK_UNMETERED"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.f66.NETWORK_UNMETERED = r0
            f66 r1 = new f66
            java.lang.String r2 = "DEVICE_IDLE"
            r3 = 1
            r1.<init>(r2, r3)
            defpackage.f66.DEVICE_IDLE = r1
            f66 r2 = new f66
            java.lang.String r3 = "DEVICE_CHARGING"
            r4 = 2
            r2.<init>(r3, r4)
            defpackage.f66.DEVICE_CHARGING = r2
            f66[] r0 = new defpackage.f66[]{r0, r1, r2}
            defpackage.f66.$VALUES = r0
            return
    }

    f66(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.f66 valueOf(java.lang.String r1) {
            java.lang.Class<f66> r0 = defpackage.f66.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            f66 r1 = (defpackage.f66) r1
            return r1
    }

    public static defpackage.f66[] values() {
            f66[] r0 = defpackage.f66.$VALUES
            java.lang.Object r0 = r0.clone()
            f66[] r0 = (defpackage.f66[]) r0
            return r0
    }
}
