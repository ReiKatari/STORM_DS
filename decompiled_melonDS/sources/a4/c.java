package a4;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends b3.o implements a0, p, l2, h2, z3.c, f2, z, q, g3.g, g3.w, g3.b0, d2, f3.a {

    /* renamed from: i0  reason: collision with root package name */
    public b3.n f157i0;

    @Override // a4.a0
    public final int B0(x0 x0Var, y3.u0 u0Var, int i2) {
        b3.n nVar = this.f157i0;
        nVar.getClass();
        return ((y3.e0) nVar).d(new y3.y(x0Var, x0Var.getLayoutDirection()), new t1(u0Var, y3.y0.Min, y3.z0.Height, 2), x4.b.b(i2, 0, 13)).a();
    }

    @Override // g3.w
    public final void C(g3.r rVar) {
        b3.n nVar = this.f157i0;
        x3.a.c("applyFocusProperties called on wrong node");
        nVar.getClass();
        throw new ClassCastException();
    }

    @Override // b3.o
    public final void G0() {
        O0(true);
    }

    @Override // b3.o
    public final void H0() {
        if (!this.f1777h0) {
            x3.a.c("unInitializeModifier called on unattached node");
        }
        if ((this.L & 8) != 0) {
            ((b4.x) l.u(this)).x();
        }
    }

    @Override // a4.a0
    public final int K(x0 x0Var, y3.u0 u0Var, int i2) {
        b3.n nVar = this.f157i0;
        nVar.getClass();
        return ((y3.e0) nVar).d(new y3.y(x0Var, x0Var.getLayoutDirection()), new t1(u0Var, y3.y0.Max, y3.z0.Height, 2), x4.b.b(i2, 0, 13)).a();
    }

    @Override // g3.g
    public final void M(g3.e0 e0Var) {
        b3.n nVar = this.f157i0;
        x3.a.c("onFocusEvent called on wrong node");
        nVar.getClass();
        throw new ClassCastException();
    }

    public final void O0(boolean z10) {
        if (!this.f1777h0) {
            x3.a.c("initializeModifier called on unattached node");
        }
        b3.n nVar = this.f157i0;
        if ((this.L & 4) != 0 && !z10) {
            l.r(this, 2).e1();
        }
        if ((this.L & 2) != 0) {
            n2 n2Var = l.t(this).A0.f267e;
            n2Var.getClass();
            if (n2Var.f273i0) {
                r1 r1Var = this.f1771b0;
                r1Var.getClass();
                ((d0) r1Var).y1(this);
                b2 b2Var = r1Var.H0;
                if (b2Var != null) {
                    ((b4.y1) b2Var).c();
                }
            }
            if (!z10) {
                l.r(this, 2).e1();
                l.t(this).E();
            }
        }
        if (nVar instanceof n1.v) {
            n1.v vVar = (n1.v) nVar;
            o0 t5 = l.t(this);
            switch (vVar.f9843a) {
                case 0:
                    ((n1.x) vVar.f9844b).f9857k = t5;
                    break;
                case DSiCameraSource.FrontCamera /* 1 */:
                    ((o1.t) vVar.f9844b).f10598j = t5;
                    break;
                default:
                    ((q1.a0) vVar.f9844b).f12116y.setValue(t5);
                    break;
            }
        }
        if ((this.L & 8) != 0) {
            ((b4.x) l.u(this)).x();
        }
    }

    @Override // a4.h2
    public final boolean U() {
        this.f157i0.getClass();
        throw new ClassCastException();
    }

    @Override // f3.a
    public final x4.c b() {
        return l.t(this).f295t0;
    }

    @Override // a4.q
    public final void b0(r1 r1Var) {
        this.f157i0.getClass();
        throw new ClassCastException();
    }

    @Override // f3.a
    public final long c() {
        return zb.k.T(l.r(this, 128).L);
    }

    @Override // a4.a0
    public final y3.w0 d(y3.x0 x0Var, y3.u0 u0Var, long j2) {
        b3.n nVar = this.f157i0;
        nVar.getClass();
        return ((y3.e0) nVar).d(x0Var, u0Var, j2);
    }

    @Override // a4.l2
    public final void f0(i4.x xVar) {
        int i2;
        b3.n nVar = this.f157i0;
        nVar.getClass();
        i4.b bVar = (i4.b) nVar;
        i4.m mVar = new i4.m();
        mVar.L = bVar.f6709a;
        bVar.f6710b.k(mVar);
        xVar.getClass();
        i4.m mVar2 = (i4.m) xVar;
        a1.m0 m0Var = mVar2.A;
        if (mVar.L) {
            mVar2.L = true;
        }
        if (mVar.R) {
            mVar2.R = true;
        }
        a1.m0 m0Var2 = mVar.A;
        Object[] objArr = m0Var2.f68b;
        Object[] objArr2 = m0Var2.f69c;
        long[] jArr = m0Var2.f67a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j2 = jArr[i10];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8;
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((255 & j2) < 128) {
                            int i14 = (i10 << 3) + i13;
                            Object obj = objArr[i14];
                            Object obj2 = objArr2[i14];
                            i4.w wVar = (i4.w) obj;
                            if (!m0Var.b(wVar)) {
                                m0Var.m(wVar, obj2);
                            } else if (obj2 instanceof i4.a) {
                                Object g10 = m0Var.g(wVar);
                                g10.getClass();
                                i4.a aVar = (i4.a) g10;
                                i2 = i11;
                                String str = aVar.f6707a;
                                if (str == null) {
                                    str = ((i4.a) obj2).f6707a;
                                }
                                yb.d dVar = aVar.f6708b;
                                if (dVar == null) {
                                    dVar = ((i4.a) obj2).f6708b;
                                }
                                m0Var.m(wVar, new i4.a(str, dVar));
                                j2 >>= i2;
                                i13++;
                                i11 = i2;
                            }
                        }
                        i2 = i11;
                        j2 >>= i2;
                        i13++;
                        i11 = i2;
                    }
                    if (i12 != i11) {
                        return;
                    }
                }
                if (i10 != length) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // z3.c
    public final p7.j g() {
        return z3.a.f14958b;
    }

    @Override // a4.h2
    public final void g0() {
        this.f157i0.getClass();
        throw new ClassCastException();
    }

    @Override // f3.a
    public final x4.m getLayoutDirection() {
        return l.t(this).f296u0;
    }

    @Override // a4.a0
    public final int p0(x0 x0Var, y3.u0 u0Var, int i2) {
        b3.n nVar = this.f157i0;
        nVar.getClass();
        return ((y3.e0) nVar).d(new y3.y(x0Var, x0Var.getLayoutDirection()), new t1(u0Var, y3.y0.Max, y3.z0.Width, 2), x4.b.b(0, i2, 7)).c();
    }

    @Override // a4.p
    public final void q0() {
        l.j(this);
    }

    @Override // a4.h2
    public final boolean r0() {
        this.f157i0.getClass();
        throw new ClassCastException();
    }

    @Override // a4.h2
    public final void s0(v3.k kVar, v3.l lVar, long j2) {
        this.f157i0.getClass();
        throw new ClassCastException();
    }

    public final String toString() {
        return this.f157i0.toString();
    }

    @Override // a4.d2
    public final boolean w() {
        return this.f1777h0;
    }

    @Override // a4.a0
    public final int y0(x0 x0Var, y3.u0 u0Var, int i2) {
        b3.n nVar = this.f157i0;
        nVar.getClass();
        return ((y3.e0) nVar).d(new y3.y(x0Var, x0Var.getLayoutDirection()), new t1(u0Var, y3.y0.Min, y3.z0.Width, 2), x4.b.b(0, i2, 7)).c();
    }

    @Override // a4.p
    public final void z(r0 r0Var) {
        b3.n nVar = this.f157i0;
        nVar.getClass();
        f3.f fVar = (f3.f) nVar;
        r0Var.a();
    }

    @Override // a4.f2
    public final Object z0(x4.c cVar, Object obj) {
        b3.n nVar = this.f157i0;
        nVar.getClass();
        return ((y3.f1) nVar).c();
    }

    @Override // a4.j, a4.h2
    public final void a() {
    }

    @Override // a4.z
    public final void o(long j2) {
    }

    @Override // a4.z
    public final void s(y3.z zVar) {
    }
}
