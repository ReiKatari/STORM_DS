package i3;

import a4.l2;
import a4.r1;
import y3.i1;
import y3.u0;
import y3.w0;
import y3.x0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n extends b3.o implements a4.a0, l2 {

    /* renamed from: i0  reason: collision with root package name */
    public mc.l f6663i0;

    public n(mc.l lVar) {
        this.f6663i0 = lVar;
    }

    @Override // b3.o
    public final boolean D0() {
        return false;
    }

    @Override // a4.a0
    public final w0 d(x0 x0Var, u0 u0Var, long j2) {
        i1 e6 = u0Var.e(j2);
        return x0Var.u0(e6.A, e6.B, zb.r.A, new a5.n(9, e6, this));
    }

    @Override // a4.l2
    public final boolean e() {
        return false;
    }

    @Override // a4.l2
    public final void f0(i4.x xVar) {
        boolean z10;
        n0 n0Var;
        mc.l lVar;
        r1 r5 = a4.l.r(this, 2);
        if (!r5.B0) {
            k0 k0Var = z.f6702a;
            if (k0Var == null) {
                z.f6702a = new k0();
            } else {
                k0Var.a();
            }
            k0 k0Var2 = z.f6702a;
            k0Var2.getClass();
            k0Var2.f6649h0 = r5.f315i0.f295t0;
            k0Var2.f6648g0 = zb.k.T(r5.L);
            z2.f e6 = z2.q.e();
            if (e6 != null) {
                lVar = e6.e();
            } else {
                lVar = null;
            }
            z2.f h2 = z2.q.h(e6);
            try {
                this.f6663i0.k(k0Var2);
                z2.q.k(e6, h2, lVar);
                n0Var = k0Var2.f6646e0;
                z10 = k0Var2.f6647f0;
            } catch (Throwable th2) {
                z2.q.k(e6, h2, lVar);
                throw th2;
            }
        } else {
            n0 n0Var2 = r5.f331z0;
            z10 = r5.A0;
            n0Var = n0Var2;
        }
        if (!z10) {
            return;
        }
        i4.v.f(xVar, n0Var);
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f6663i0 + ')';
    }
}
