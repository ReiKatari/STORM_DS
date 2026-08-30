package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hh4  reason: default package */
/* loaded from: classes.dex */
public final class hh4 extends yy3 implements mf3 {
    public float j0;
    public float k0;
    public float l0;
    public float m0;
    public boolean n0;

    @Override // defpackage.mf3
    public final uv3 e(vv3 vv3Var, mv3 mv3Var, long j) {
        int Y = vv3Var.Y(this.l0) + vv3Var.Y(this.j0);
        int Y2 = vv3Var.Y(this.m0) + vv3Var.Y(this.k0);
        yn4 c = mv3Var.c(nz0.i(j, -Y, -Y2));
        return vv3Var.s0(nz0.g(c.A + Y, j), nz0.f(c.B + Y2, j), qp1.A, new gi2(26, this, c));
    }
}
