package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kq4  reason: default package */
/* loaded from: classes.dex */
public final class kq4 extends z64 implements jm3 {
    public float k0;
    public float l0;
    public float m0;
    public float n0;
    public boolean o0;

    @Override // defpackage.jm3
    public final f34 c(g34 g34Var, x24 x24Var, long j) {
        int r0 = g34Var.r0(this.m0) + g34Var.r0(this.k0);
        int r02 = g34Var.r0(this.n0) + g34Var.r0(this.l0);
        dx4 y = x24Var.y(s21.i(j, -r0, -r02));
        return g34Var.K(s21.g(y.A + r0, j), s21.f(y.B + r02, j), zt1.A, new qk4(1, this, y));
    }
}
