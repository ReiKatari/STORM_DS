package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rw4  reason: default package */
/* loaded from: classes.dex */
public enum rw4 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.rw4[] $VALUES = null;
    public static final defpackage.rw4 HIGH = null;
    public static final defpackage.rw4 LOW = null;
    public static final defpackage.rw4 NORMAL = null;

    static {
            rw4 r0 = new rw4
            java.lang.String r1 = "LOW"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.rw4.LOW = r0
            rw4 r1 = new rw4
            java.lang.String r2 = "NORMAL"
            r3 = 1
            r1.<init>(r2, r3)
            defpackage.rw4.NORMAL = r1
            rw4 r2 = new rw4
            java.lang.String r3 = "HIGH"
            r4 = 2
            r2.<init>(r3, r4)
            defpackage.rw4.HIGH = r2
            rw4[] r0 = new defpackage.rw4[]{r0, r1, r2}
            defpackage.rw4.$VALUES = r0
            return
    }

    rw4(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.rw4 valueOf(java.lang.String r1) {
            java.lang.Class<rw4> r0 = defpackage.rw4.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            rw4 r1 = (defpackage.rw4) r1
            return r1
    }

    public static defpackage.rw4[] values() {
            rw4[] r0 = defpackage.rw4.$VALUES
            java.lang.Object r0 = r0.clone()
            rw4[] r0 = (defpackage.rw4[]) r0
            return r0
    }
}
