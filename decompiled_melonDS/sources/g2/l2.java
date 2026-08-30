package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l2 extends b3.o implements a4.i, a4.a0 {
    @Override // a4.a0
    public final y3.w0 d(y3.x0 x0Var, y3.u0 u0Var, long j2) {
        boolean z10;
        if (this.f1777h0 && ((Boolean) a4.l.h(this, d2.f5111a)).booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j10 = d2.f5112b;
        y3.i1 e6 = u0Var.e(j2);
        int i2 = e6.A;
        if (z10) {
            i2 = Math.max(i2, x0Var.O(x4.h.b(j10)));
        }
        int i10 = e6.B;
        if (z10) {
            i10 = Math.max(i10, x0Var.O(x4.h.a(j10)));
        }
        return x0Var.u0(i2, i10, zb.r.A, new k2(i2, e6, i10));
    }
}
