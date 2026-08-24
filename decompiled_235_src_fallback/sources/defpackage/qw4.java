package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qw4  reason: default package */
/* loaded from: classes.dex */
public enum qw4 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.qw4[] $VALUES = null;
    public static final defpackage.qw4 DISK = null;
    public static final defpackage.qw4 MEMORY = null;
    public static final defpackage.qw4 NETWORK = null;
    final int debugColor;

    static {
            qw4 r0 = new qw4
            r1 = 0
            r2 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            java.lang.String r3 = "MEMORY"
            r0.<init>(r3, r1, r2)
            defpackage.qw4.MEMORY = r0
            qw4 r1 = new qw4
            r2 = 1
            r3 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            java.lang.String r4 = "DISK"
            r1.<init>(r4, r2, r3)
            defpackage.qw4.DISK = r1
            qw4 r2 = new qw4
            r3 = 2
            r4 = -65536(0xffffffffffff0000, float:NaN)
            java.lang.String r5 = "NETWORK"
            r2.<init>(r5, r3, r4)
            defpackage.qw4.NETWORK = r2
            qw4[] r0 = new defpackage.qw4[]{r0, r1, r2}
            defpackage.qw4.$VALUES = r0
            return
    }

    qw4(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.debugColor = r3
            return
    }

    public static defpackage.qw4 valueOf(java.lang.String r1) {
            java.lang.Class<qw4> r0 = defpackage.qw4.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            qw4 r1 = (defpackage.qw4) r1
            return r1
    }

    public static defpackage.qw4[] values() {
            qw4[] r0 = defpackage.qw4.$VALUES
            java.lang.Object r0 = r0.clone()
            qw4[] r0 = (defpackage.qw4[]) r0
            return r0
    }
}
