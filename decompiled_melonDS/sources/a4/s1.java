package a4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class s1 {

    /* renamed from: a  reason: collision with root package name */
    public static final a1.d0 f333a;

    static {
        a1.d0 d0Var = a1.r0.f92a;
        f333a = new a1.d0();
    }

    public static final void a(b3.o oVar, int i2, int i10) {
        if (oVar instanceof k) {
            k kVar = (k) oVar;
            int i11 = kVar.f246i0;
            b(oVar, i11 & i2, i10);
            int i12 = (~i11) & i2;
            for (b3.o oVar2 = kVar.f247j0; oVar2 != null; oVar2 = oVar2.Y) {
                a(oVar2, i12, i10);
            }
            return;
        }
        b(oVar, i2 & oVar.L, i10);
    }

    public static final void b(b3.o oVar, int i2, int i10) {
        if (i10 != 0 || oVar.D0()) {
            if ((i2 & 2) != 0 && (oVar instanceof a0)) {
                l.k((a0) oVar);
                if (i10 == 2) {
                    l.r(oVar, 2).j1();
                }
            }
            if ((i2 & 128) != 0 && i10 != 2) {
                l.t(oVar).E();
            }
            if ((4194304 & i2) != 0 && i10 != 2) {
                l.t(oVar).W(false);
            }
            if ((i2 & 256) != 0 && (oVar instanceof q)) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        o0 t5 = l.t(oVar);
                        t5.c0(t5.I0 - 1);
                    }
                } else {
                    o0 t10 = l.t(oVar);
                    t10.c0(t10.I0 + 1);
                }
                if (i10 != 2) {
                    o0 t11 = l.t(oVar);
                    if (t11.I0 != 0 && !t11.p() && !t11.q() && !t11.H0) {
                        b4.x xVar = (b4.x) s0.a(t11);
                        a0.g gVar = xVar.Q0.f206e;
                        gVar.getClass();
                        if (t11.I0 > 0) {
                            ((p2.b) gVar.B).b(t11);
                            t11.H0 = true;
                        }
                        xVar.B(null);
                    }
                }
            }
            if ((i2 & 4) != 0 && (oVar instanceof p)) {
                l.j((p) oVar);
            }
            if ((i2 & 8) != 0 && (oVar instanceof l2)) {
                l.t(oVar).f289m0 = true;
            }
            if ((i2 & 64) != 0 && (oVar instanceof f2)) {
                t0 t0Var = l.t((f2) oVar).B0;
                t0Var.f348p.f230k0 = true;
                c1 c1Var = t0Var.f349q;
                if (c1Var != null) {
                    c1Var.f175q0 = true;
                }
            }
            if ((i2 & 2048) != 0 && (oVar instanceof g3.w)) {
                ((g3.w) oVar).C(d.f181a);
            }
            if ((i2 & 4096) != 0 && (oVar instanceof g3.g)) {
                g3.g gVar2 = (g3.g) oVar;
                g3.i iVar = ((g3.p) ((b4.x) l.u(gVar2)).getFocusOwner()).f5530d;
                if (iVar.f5518d.a(gVar2)) {
                    iVar.a();
                }
            }
        }
    }

    public static final void c(b3.o oVar) {
        if (!oVar.f1777h0) {
            x3.a.c("autoInvalidateUpdatedNode called on unattached node");
        }
        a(oVar, -1, 0);
    }

    public static final int d(b3.n nVar) {
        int i2;
        if (nVar instanceof y3.e0) {
            i2 = 3;
        } else {
            i2 = 1;
        }
        if (nVar instanceof f3.f) {
            i2 |= 4;
        }
        if (nVar instanceof i4.b) {
            i2 |= 8;
        }
        if (nVar instanceof y3.f1) {
            i2 |= 64;
        }
        if (nVar instanceof f4.a) {
            return 524288 | i2;
        }
        return i2;
    }

    public static final int e(b3.o oVar) {
        int i2;
        int i10 = oVar.L;
        if (i10 != 0) {
            return i10;
        }
        Class<?> cls = oVar.getClass();
        a1.d0 d0Var = f333a;
        int d4 = d0Var.d(cls);
        if (d4 >= 0) {
            return d0Var.f34c[d4];
        }
        if (oVar instanceof a0) {
            i2 = 3;
        } else {
            i2 = 1;
        }
        if (oVar instanceof p) {
            i2 |= 4;
        }
        if (oVar instanceof l2) {
            i2 |= 8;
        }
        if (oVar instanceof h2) {
            i2 |= 16;
        }
        if (oVar instanceof z3.c) {
            i2 |= 32;
        }
        if (oVar instanceof f2) {
            i2 |= 64;
        }
        if (oVar instanceof y3.e1) {
            i2 |= 128;
        } else if (oVar instanceof z) {
            i2 |= 4194432;
        }
        if (oVar instanceof q) {
            i2 |= 256;
        }
        if (oVar instanceof c1.l1) {
            i2 |= 512;
        }
        if (oVar instanceof g3.g0) {
            i2 |= 1024;
        }
        if (oVar instanceof g3.w) {
            i2 |= 2048;
        }
        if (oVar instanceof g3.g) {
            i2 |= 4096;
        }
        if (oVar instanceof t3.e) {
            i2 |= 8192;
        }
        if (oVar instanceof b4.m) {
            i2 |= 16384;
        }
        if (oVar instanceof i) {
            i2 |= 32768;
        }
        if (oVar instanceof q2) {
            i2 |= 262144;
        }
        if (oVar instanceof f4.a) {
            i2 |= 524288;
        }
        if (oVar instanceof s3.c) {
            i2 |= 2097152;
        }
        if (oVar instanceof p1.p) {
            i2 |= 8388608;
        }
        d0Var.g(i2, cls);
        return i2;
    }

    public static final int f(b3.o oVar) {
        if (oVar instanceof k) {
            k kVar = (k) oVar;
            int i2 = kVar.f246i0;
            for (b3.o oVar2 = kVar.f247j0; oVar2 != null; oVar2 = oVar2.Y) {
                i2 |= f(oVar2);
            }
            return i2;
        }
        return e(oVar);
    }

    public static final boolean g(int i2) {
        boolean z10;
        boolean z11 = false;
        if ((i2 & 128) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i2 & 4194304) != 0) {
            z11 = true;
        }
        return z10 | z11;
    }
}
