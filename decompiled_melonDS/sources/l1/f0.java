package l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f0 extends b3.o implements a4.a0 {

    /* renamed from: i0  reason: collision with root package name */
    public c0 f8551i0;

    /* renamed from: j0  reason: collision with root package name */
    public float f8552j0;

    @Override // a4.a0
    public final y3.w0 d(y3.x0 x0Var, y3.u0 u0Var, long j2) {
        int j10;
        int h2;
        int g10;
        int i2;
        if (x4.a.d(j2) && this.f8551i0 != c0.Vertical) {
            int round = Math.round(x4.a.h(j2) * this.f8552j0);
            int j11 = x4.a.j(j2);
            j10 = x4.a.h(j2);
            if (round < j11) {
                round = j11;
            }
            if (round <= j10) {
                j10 = round;
            }
            h2 = j10;
        } else {
            j10 = x4.a.j(j2);
            h2 = x4.a.h(j2);
        }
        if (x4.a.c(j2) && this.f8551i0 != c0.Horizontal) {
            int round2 = Math.round(x4.a.g(j2) * this.f8552j0);
            int i10 = x4.a.i(j2);
            i2 = x4.a.g(j2);
            if (round2 < i10) {
                round2 = i10;
            }
            if (round2 <= i2) {
                i2 = round2;
            }
            g10 = i2;
        } else {
            int i11 = x4.a.i(j2);
            g10 = x4.a.g(j2);
            i2 = i11;
        }
        y3.i1 e6 = u0Var.e(x4.b.a(j10, h2, i2, g10));
        return x0Var.u0(e6.A, e6.B, zb.r.A, new c9.o(e6, 5));
    }
}
