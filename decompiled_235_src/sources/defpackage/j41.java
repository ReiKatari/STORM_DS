package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j41  reason: default package */
/* loaded from: classes.dex */
public final class j41 implements f05 {
    public final on2 a;

    @Override // defpackage.f05
    public long a(m93 m93Var, long j, kk3 kk3Var, long j2) {
        long j3;
        boolean z;
        int i = m93Var.a + ((int) (((i93) this.a.c()).a >> 32));
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j >> 32);
        if (kk3Var == kk3.Ltr) {
            z = true;
        } else {
            z = false;
        }
        return (ak7.G(m93Var.b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true) & 4294967295L) | (ak7.G(i, i2, i3, z) << 32);
    }
}
