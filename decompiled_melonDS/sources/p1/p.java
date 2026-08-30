package p1;

import h1.n1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p extends b3.o implements a4.a0 {

    /* renamed from: l0  reason: collision with root package name */
    public static final m f11244l0 = new Object();

    /* renamed from: i0  reason: collision with root package name */
    public q f11245i0;

    /* renamed from: j0  reason: collision with root package name */
    public h1.a f11246j0;

    /* renamed from: k0  reason: collision with root package name */
    public n1 f11247k0;

    public final boolean O0(j jVar, int i2) {
        if (i2 == 5 || i2 == 6) {
            if (this.f11247k0 == n1.Horizontal) {
                return false;
            }
        } else if (i2 == 3 || i2 == 4) {
            if (this.f11247k0 == n1.Vertical) {
                return false;
            }
        } else if (i2 != 1 && i2 != 2) {
            a0.j.p("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        if (P0(i2)) {
            if (jVar.f11218b >= this.f11245i0.a() - 1) {
                return false;
            }
        } else if (jVar.f11217a <= 0) {
            return false;
        }
        return true;
    }

    public final boolean P0(int i2) {
        if (i2 == 1) {
            return false;
        }
        if (i2 == 2) {
            return true;
        }
        if (i2 == 5) {
            return false;
        }
        if (i2 == 6) {
            return true;
        }
        if (i2 == 3) {
            int i10 = n.f11234a[a4.l.t(this).f296u0.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2) {
                return true;
            }
            m9.o.o();
            return false;
        } else if (i2 == 4) {
            int i11 = n.f11234a[a4.l.t(this).f296u0.ordinal()];
            if (i11 == 1) {
                return true;
            }
            if (i11 == 2) {
                return false;
            }
            m9.o.o();
            return false;
        } else {
            a0.j.p("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
    }

    @Override // a4.a0
    public final y3.w0 d(y3.x0 x0Var, y3.u0 u0Var, long j2) {
        y3.i1 e6 = u0Var.e(j2);
        return x0Var.u0(e6.A, e6.B, zb.r.A, new c9.o(e6, 9));
    }
}
