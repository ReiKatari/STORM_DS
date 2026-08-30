package a4;

import android.view.KeyEvent;
import b4.w2;
import b4.y2;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n0 extends nc.l implements mc.a {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(nc.t tVar, g3.g0 g0Var) {
        super(0);
        this.B = 9;
        this.R = tVar;
        this.L = g0Var;
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [yb.f, java.lang.Object] */
    @Override // mc.a
    public final Object b() {
        boolean z10;
        float f8;
        float f10;
        i4.p pVar;
        o0 o0Var;
        androidx.lifecycle.k kVar;
        androidx.lifecycle.a1 defaultViewModelProviderFactory;
        h3.c cVar;
        switch (this.B) {
            case 0:
                n1 n1Var = ((o0) this.L).A0;
                nc.t tVar = (nc.t) this.R;
                if ((n1Var.f268f.R & 8) != 0) {
                    for (b3.o oVar = n1Var.f267e; oVar != null; oVar = oVar.X) {
                        if ((oVar.L & 8) != 0) {
                            b3.o oVar2 = oVar;
                            p2.b bVar = null;
                            while (oVar2 != null) {
                                if (oVar2 instanceof l2) {
                                    l2 l2Var = (l2) oVar2;
                                    if (l2Var.i0()) {
                                        i4.m mVar = new i4.m();
                                        tVar.A = mVar;
                                        mVar.R = true;
                                    }
                                    if (l2Var.j0()) {
                                        ((i4.m) tVar.A).L = true;
                                    }
                                    l2Var.f0((i4.x) tVar.A);
                                } else if ((oVar2.L & 8) != 0 && (oVar2 instanceof k)) {
                                    int i2 = 0;
                                    for (b3.o oVar3 = ((k) oVar2).f247j0; oVar3 != null; oVar3 = oVar3.Y) {
                                        if ((oVar3.L & 8) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                oVar2 = oVar3;
                                            } else {
                                                if (bVar == null) {
                                                    bVar = new p2.b(new b3.o[16]);
                                                }
                                                if (oVar2 != null) {
                                                    bVar.b(oVar2);
                                                    oVar2 = null;
                                                }
                                                bVar.b(oVar3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                oVar2 = l.e(bVar);
                            }
                        }
                    }
                }
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                i3.k0 k0Var = r1.I0;
                ((mc.l) this.L).k(k0Var);
                r1 r1Var = (r1) this.R;
                i3.n0 n0Var = r1Var.f331z0;
                i3.n0 n0Var2 = k0Var.f6646e0;
                boolean z11 = false;
                if (n0Var != n0Var2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z12 = r1Var.A0;
                boolean z13 = k0Var.f6647f0;
                if (z12 != z13) {
                    z11 = true;
                }
                if (z10 || z11) {
                    r1Var.f331z0 = n0Var2;
                    r1Var.A0 = z13;
                    if (r1Var.B0 && (z11 || (z13 && z10))) {
                        r1Var.f315i0.F();
                    }
                }
                r1Var.B0 = true;
                k0Var.f6652k0 = k0Var.f6646e0.a(k0Var.f6648g0, k0Var.f6650i0, k0Var.f6649h0);
                return yb.y.f14813a;
            case 2:
                return Boolean.valueOf(b4.x.b((b4.x) this.L, (KeyEvent) this.R));
            case 3:
                b4.d0 d0Var = (b4.d0) this.R;
                b4.p2 p2Var = (b4.p2) this.L;
                i4.j jVar = p2Var.X;
                i4.j jVar2 = p2Var.Y;
                Float f11 = p2Var.L;
                Float f12 = p2Var.R;
                if (jVar != null && f11 != null) {
                    f8 = ((Number) jVar.f6723a.b()).floatValue() - f11.floatValue();
                } else {
                    f8 = 0.0f;
                }
                if (jVar2 != null && f12 != null) {
                    f10 = ((Number) jVar2.f6723a.b()).floatValue() - f12.floatValue();
                } else {
                    f10 = 0.0f;
                }
                if (f8 != 0.0f || f10 != 0.0f) {
                    int A = d0Var.A(p2Var.A);
                    i4.q qVar = (i4.q) d0Var.s().b(d0Var.f1812f0);
                    if (qVar != null) {
                        try {
                            b6.g gVar = d0Var.f1814h0;
                            if (gVar != null) {
                                gVar.f2077a.setBoundsInScreen(d0Var.k(qVar));
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    i4.q qVar2 = (i4.q) d0Var.s().b(d0Var.f1813g0);
                    if (qVar2 != null) {
                        try {
                            b6.g gVar2 = d0Var.f1815i0;
                            if (gVar2 != null) {
                                gVar2.f2077a.setBoundsInScreen(d0Var.k(qVar2));
                            }
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    d0Var.R.invalidate();
                    i4.q qVar3 = (i4.q) d0Var.s().b(A);
                    if (qVar3 != null && (pVar = qVar3.f6774a) != null && (o0Var = pVar.f6769c) != null) {
                        if (jVar != null) {
                            d0Var.f1817k0.i(A, jVar);
                        }
                        if (jVar2 != null) {
                            d0Var.f1818l0.i(A, jVar2);
                        }
                        d0Var.w(o0Var);
                    }
                }
                if (jVar != null) {
                    p2Var.L = (Float) jVar.f6723a.b();
                }
                if (jVar2 != null) {
                    p2Var.R = (Float) jVar2.f6723a.b();
                }
                return yb.y.f14813a;
            case 4:
                ((b4.a) this.L).removeOnAttachStateChangeListener((w2) this.R);
                return yb.y.f14813a;
            case l1.c.f8511g /* 5 */:
                ((androidx.lifecycle.r) this.L).c((y2) this.R);
                return yb.y.f14813a;
            case l1.c.f8509e /* 6 */:
                androidx.lifecycle.e1 e1Var = (androidx.lifecycle.e1) this.R.getValue();
                if (e1Var instanceof androidx.lifecycle.k) {
                    kVar = (androidx.lifecycle.k) e1Var;
                } else {
                    kVar = null;
                }
                if (kVar == null || (defaultViewModelProviderFactory = kVar.getDefaultViewModelProviderFactory()) == null) {
                    return ((ci.d) this.L).getDefaultViewModelProviderFactory();
                }
                return defaultViewModelProviderFactory;
            case 7:
                ((f3.b) this.L).f4820k0.k((f3.c) this.R);
                return yb.y.f14813a;
            case 8:
                mc.a aVar = (mc.a) this.L;
                if (aVar == null || (cVar = (h3.c) aVar.b()) == null) {
                    r1 r1Var2 = (r1) this.R;
                    if (!r1Var2.X0().f1777h0) {
                        r1Var2 = null;
                    }
                    if (r1Var2 == null) {
                        return null;
                    }
                    return pc.a.h(0L, zb.k.T(r1Var2.L));
                }
                return cVar;
            case l1.c.f8508d /* 9 */:
                ((nc.t) this.R).A = ((g3.g0) this.L).Q0();
                return yb.y.f14813a;
            default:
                ((v3.d) this.L).d((b3.o) this.R);
                return yb.y.f14813a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(int i2, Object obj, Object obj2) {
        super(0);
        this.B = i2;
        this.L = obj;
        this.R = obj2;
    }
}
