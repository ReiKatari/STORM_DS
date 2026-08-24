package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qr0  reason: default package */
/* loaded from: classes.dex */
public enum qr0 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.qr0[] $VALUES = null;
    public static final defpackage.qr0 ANDROID_FIREBASE = null;
    public static final defpackage.qr0 UNKNOWN = null;
    private final int value;

    static {
            qr0 r0 = new qr0
            java.lang.String r1 = "UNKNOWN"
            r2 = 0
            r0.<init>(r1, r2, r2)
            defpackage.qr0.UNKNOWN = r0
            qr0 r1 = new qr0
            r2 = 1
            r3 = 23
            java.lang.String r4 = "ANDROID_FIREBASE"
            r1.<init>(r4, r2, r3)
            defpackage.qr0.ANDROID_FIREBASE = r1
            qr0[] r0 = new defpackage.qr0[]{r0, r1}
            defpackage.qr0.$VALUES = r0
            return
    }

    qr0(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static defpackage.qr0 valueOf(java.lang.String r1) {
            java.lang.Class<qr0> r0 = defpackage.qr0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            qr0 r1 = (defpackage.qr0) r1
            return r1
    }

    public static defpackage.qr0[] values() {
            qr0[] r0 = defpackage.qr0.$VALUES
            java.lang.Object r0 = r0.clone()
            qr0[] r0 = (defpackage.qr0[]) r0
            return r0
    }
}
