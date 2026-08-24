package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u45  reason: default package */
/* loaded from: classes.dex */
public enum u45 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.u45[] $VALUES = null;
    public static final defpackage.u45 PROTO2 = null;
    public static final defpackage.u45 PROTO3 = null;

    static {
            u45 r0 = new u45
            java.lang.String r1 = "PROTO2"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.u45.PROTO2 = r0
            u45 r1 = new u45
            java.lang.String r2 = "PROTO3"
            r3 = 1
            r1.<init>(r2, r3)
            defpackage.u45.PROTO3 = r1
            u45[] r0 = new defpackage.u45[]{r0, r1}
            defpackage.u45.$VALUES = r0
            return
    }

    u45(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.u45 valueOf(java.lang.String r1) {
            java.lang.Class<u45> r0 = defpackage.u45.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            u45 r1 = (defpackage.u45) r1
            return r1
    }

    public static defpackage.u45[] values() {
            u45[] r0 = defpackage.u45.$VALUES
            java.lang.Object r0 = r0.clone()
            u45[] r0 = (defpackage.u45[]) r0
            return r0
    }
}
