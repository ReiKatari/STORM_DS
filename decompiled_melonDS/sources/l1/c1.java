package l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c1 extends b3.o implements a4.a0 {

    /* renamed from: i0  reason: collision with root package name */
    public float f8513i0;

    /* renamed from: j0  reason: collision with root package name */
    public float f8514j0;

    /* renamed from: k0  reason: collision with root package name */
    public float f8515k0;

    /* renamed from: l0  reason: collision with root package name */
    public float f8516l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f8517m0;

    @Override // a4.a0
    public final y3.w0 d(y3.x0 x0Var, y3.u0 u0Var, long j2) {
        int O = x0Var.O(this.f8515k0) + x0Var.O(this.f8513i0);
        int O2 = x0Var.O(this.f8516l0) + x0Var.O(this.f8514j0);
        y3.i1 e6 = u0Var.e(x4.b.i(j2, -O, -O2));
        return x0Var.u0(x4.b.g(e6.A + O, j2), x4.b.f(e6.B + O2, j2), zb.r.A, new he.g(8, this, e6));
    }
}
