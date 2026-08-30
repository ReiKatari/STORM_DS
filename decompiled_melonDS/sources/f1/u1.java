package f1;

import a4.l2;
import androidx.preference.Preference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u1 extends b3.o implements a4.a0, l2 {

    /* renamed from: i0  reason: collision with root package name */
    public w1 f4656i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f4657j0;

    @Override // a4.a0
    public final int B0(a4.x0 x0Var, y3.u0 u0Var, int i2) {
        if (!this.f4657j0) {
            i2 = Preference.DEFAULT_ORDER;
        }
        return u0Var.h0(i2);
    }

    @Override // a4.a0
    public final int K(a4.x0 x0Var, y3.u0 u0Var, int i2) {
        if (!this.f4657j0) {
            i2 = Preference.DEFAULT_ORDER;
        }
        return u0Var.g(i2);
    }

    @Override // a4.a0
    public final y3.w0 d(y3.x0 x0Var, y3.u0 u0Var, long j2) {
        h1.n1 n1Var;
        int g10;
        mc.l lVar;
        int i2;
        int i10;
        if (this.f4657j0) {
            n1Var = h1.n1.Vertical;
        } else {
            n1Var = h1.n1.Horizontal;
        }
        n.g(j2, n1Var);
        boolean z10 = this.f4657j0;
        int i11 = Preference.DEFAULT_ORDER;
        if (z10) {
            g10 = Integer.MAX_VALUE;
        } else {
            g10 = x4.a.g(j2);
        }
        if (this.f4657j0) {
            i11 = x4.a.h(j2);
        }
        y3.i1 e6 = u0Var.e(x4.a.a(j2, 0, i11, 0, g10, 5));
        int i12 = e6.A;
        int h2 = x4.a.h(j2);
        if (i12 > h2) {
            i12 = h2;
        }
        int i13 = e6.B;
        int g11 = x4.a.g(j2);
        if (i13 > g11) {
            i13 = g11;
        }
        int i14 = e6.B - i13;
        int i15 = e6.A - i12;
        if (!this.f4657j0) {
            i14 = i15;
        }
        w1 w1Var = this.f4656i0;
        n2.c1 c1Var = w1Var.f4673e;
        n2.c1 c1Var2 = w1Var.f4669a;
        c1Var.h(i14);
        z2.f e10 = z2.q.e();
        if (e10 != null) {
            lVar = e10.e();
        } else {
            lVar = null;
        }
        z2.f h10 = z2.q.h(e10);
        try {
            if (c1Var2.g() > i14) {
                c1Var2.h(i14);
            }
            z2.q.k(e10, h10, lVar);
            w1 w1Var2 = this.f4656i0;
            if (this.f4657j0) {
                i2 = i13;
            } else {
                i2 = i12;
            }
            w1Var2.f4670b.h(i2);
            w1 w1Var3 = this.f4656i0;
            if (this.f4657j0) {
                i10 = e6.B;
            } else {
                i10 = e6.A;
            }
            w1Var3.f4671c.h(i10);
            return x0Var.u0(i12, i13, zb.r.A, new s1(this, i14, e6, 0));
        } catch (Throwable th2) {
            z2.q.k(e10, h10, lVar);
            throw th2;
        }
    }

    @Override // a4.l2
    public final void f0(i4.x xVar) {
        tc.c[] cVarArr = i4.v.f6808a;
        i4.w wVar = i4.t.m;
        tc.c[] cVarArr2 = i4.v.f6808a;
        tc.c cVar = cVarArr2[6];
        xVar.a(wVar, Boolean.TRUE);
        i4.j jVar = new i4.j(new mc.a(this) { // from class: f1.t1
            public final /* synthetic */ u1 B;

            {
                this.B = this;
            }

            @Override // mc.a
            public final Object b() {
                int g10;
                switch (r2) {
                    case 0:
                        g10 = this.B.f4656i0.f4669a.g();
                        break;
                    default:
                        g10 = this.B.f4656i0.f4673e.g();
                        break;
                }
                return Float.valueOf(g10);
            }
        }, new mc.a(this) { // from class: f1.t1
            public final /* synthetic */ u1 B;

            {
                this.B = this;
            }

            @Override // mc.a
            public final Object b() {
                int g10;
                switch (r2) {
                    case 0:
                        g10 = this.B.f4656i0.f4669a.g();
                        break;
                    default:
                        g10 = this.B.f4656i0.f4673e.g();
                        break;
                }
                return Float.valueOf(g10);
            }
        });
        if (this.f4657j0) {
            i4.w wVar2 = i4.t.f6801v;
            tc.c cVar2 = cVarArr2[13];
            xVar.a(wVar2, jVar);
            return;
        }
        i4.w wVar3 = i4.t.f6800u;
        tc.c cVar3 = cVarArr2[12];
        xVar.a(wVar3, jVar);
    }

    @Override // a4.a0
    public final int p0(a4.x0 x0Var, y3.u0 u0Var, int i2) {
        if (this.f4657j0) {
            i2 = Preference.DEFAULT_ORDER;
        }
        return u0Var.g0(i2);
    }

    @Override // a4.a0
    public final int y0(a4.x0 x0Var, y3.u0 u0Var, int i2) {
        if (this.f4657j0) {
            i2 = Preference.DEFAULT_ORDER;
        }
        return u0Var.b0(i2);
    }
}
