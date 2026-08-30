package b4;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.layouts.LayoutListActivity;
import me.magnum.melonds.ui.layouts.LayoutSelectorActivity;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class o extends nc.i implements mc.a {

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ int f1905b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i2, Object obj, Class cls, String str, String str2, int i10, int i11, int i12) {
        super(i2, obj, cls, str, str2, i10, i11);
        this.f1905b0 = i12;
    }

    @Override // mc.a
    public final Object b() {
        ContentCaptureSession a10;
        boolean V0;
        a4.n1 n1Var;
        switch (this.f1905b0) {
            case 0:
                View view = (View) this.B;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30) {
                    a6.l.i(view);
                }
                if (i2 >= 29 && (a10 = c8.d0.a(view)) != null) {
                    return new d2.m(a10, view);
                }
                return null;
            case DSiCameraSource.FrontCamera /* 1 */:
                V0 = ((f1.l0) this.B).p0.V0(7);
                return Boolean.valueOf(V0);
            case 2:
                g3.i iVar = (g3.i) this.B;
                a1.n0 n0Var = iVar.f5517c;
                a1.n0 n0Var2 = iVar.f5518d;
                g3.p pVar = iVar.f5515a;
                g3.g0 f8 = pVar.f();
                if (f8 == null) {
                    Object[] objArr = n0Var2.f75b;
                    long[] jArr = n0Var2.f74a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j2 = jArr[i10];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i11 = 8 - ((~(i10 - length)) >>> 31);
                                for (int i12 = 0; i12 < i11; i12++) {
                                    if ((j2 & 255) < 128) {
                                        ((g3.g) objArr[(i10 << 3) + i12]).M(g3.e0.Inactive);
                                    }
                                    j2 >>= 8;
                                }
                                if (i11 != 8) {
                                }
                            }
                            if (i10 != length) {
                                i10++;
                            }
                        }
                    }
                } else if (f8.f1777h0) {
                    if (n0Var.c(f8)) {
                        f8.U0();
                    }
                    g3.e0 T0 = f8.T0();
                    if (!f8.A.f1777h0) {
                        x3.a.c("visitAncestors called on an unattached node");
                    }
                    b3.o oVar = f8.A;
                    a4.o0 t5 = a4.l.t(f8);
                    int i13 = 0;
                    while (t5 != null) {
                        if ((t5.A0.f268f.R & 5120) != 0) {
                            while (oVar != null) {
                                int i14 = oVar.L;
                                if ((i14 & 5120) != 0) {
                                    if ((i14 & 1024) != 0) {
                                        i13++;
                                    }
                                    if ((oVar instanceof g3.g) && n0Var2.c(oVar)) {
                                        if (i13 <= 1) {
                                            ((g3.g) oVar).M(T0);
                                        } else {
                                            ((g3.g) oVar).M(g3.e0.ActiveParent);
                                        }
                                        n0Var2.l(oVar);
                                    }
                                }
                                oVar = oVar.X;
                            }
                        }
                        t5 = t5.u();
                        if (t5 != null && (n1Var = t5.A0) != null) {
                            oVar = n1Var.f267e;
                        } else {
                            oVar = null;
                        }
                    }
                    Object[] objArr2 = n0Var2.f75b;
                    long[] jArr2 = n0Var2.f74a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i15 = 0;
                        while (true) {
                            long j10 = jArr2[i15];
                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                for (int i17 = 0; i17 < i16; i17++) {
                                    if ((j10 & 255) < 128) {
                                        ((g3.g) objArr2[(i15 << 3) + i17]).M(g3.e0.Inactive);
                                    }
                                    j10 >>= 8;
                                }
                                if (i16 != 8) {
                                }
                            }
                            if (i15 != length2) {
                                i15++;
                            }
                        }
                    }
                }
                if (pVar.f() == null || pVar.f5529c.T0() == g3.e0.Inactive) {
                    pVar.c();
                }
                n0Var.b();
                n0Var2.b();
                iVar.f5519e = false;
                return yb.y.f14813a;
            case 3:
                k7.t tVar = (k7.t) this.B;
                ah.h0 h0Var = tVar.f8073a;
                if (h0Var != null) {
                    zc.x.f(h0Var, null);
                    tVar.g();
                    f5.e eVar = tVar.f8077e;
                    if (eVar != null) {
                        ((m7.b) eVar.f4860g).close();
                        u7.c cVar = (u7.c) eVar.f4861h;
                        if (cVar != null) {
                            cVar.close();
                        }
                        return yb.y.f14813a;
                    }
                    nc.k.f("connectionManager");
                    throw null;
                }
                nc.k.f("coroutineScope");
                throw null;
            case 4:
                ah.e0 e0Var = (ah.e0) this.B;
                cd.q1 q1Var = e0Var.f12533d;
                q1Var.getClass();
                q1Var.k(null, zh.u.f15139a);
                e0Var.g();
                return yb.y.f14813a;
            case l1.c.f8511g /* 5 */:
                ((ph.f) this.B).f11654e.j(null);
                return yb.y.f14813a;
            case l1.c.f8509e /* 6 */:
                ((rg.d) this.B).a();
                return yb.y.f14813a;
            case 7:
                ((LayoutListActivity) this.B).finish();
                return yb.y.f14813a;
            case 8:
                ((LayoutSelectorActivity) this.B).finish();
                return yb.y.f14813a;
            case l1.c.f8508d /* 9 */:
                return ((b2.g) this.B).v0();
            default:
                xg.h hVar = (xg.h) this.B;
                cd.q1 q1Var2 = hVar.f14610e;
                q1Var2.getClass();
                q1Var2.k(null, yg.d.f14821a);
                hVar.f();
                return yb.y.f14813a;
        }
    }
}
