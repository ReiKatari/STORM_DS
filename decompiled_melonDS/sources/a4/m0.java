package a4;

import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m0 extends nc.l implements mc.a {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(int i2, Object obj) {
        super(0);
        this.B = i2;
        this.L = obj;
    }

    @Override // mc.a
    public final Object b() {
        y3.z parentLayoutCoordinates;
        boolean z10;
        n2.y yVar;
        switch (this.B) {
            case 0:
                t0 t0Var = ((o0) this.L).B0;
                t0Var.f348p.f238t0 = true;
                c1 c1Var = t0Var.f349q;
                if (c1Var != null) {
                    c1Var.f173n0 = true;
                }
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                a5.m0 m0Var = (a5.m0) this.L;
                parentLayoutCoordinates = m0Var.getParentLayoutCoordinates();
                if (((parentLayoutCoordinates == null || !parentLayoutCoordinates.U()) ? null : null) != null && m0Var.m0getPopupContentSizebOM6tXw() != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 2:
                zc.x.f(((b4.t0) this.L).L, null);
                return yb.y.f14813a;
            case 3:
                return yb.y.f14813a;
            case 4:
                w2.c cVar = (w2.c) ((b4.g2) this.L).f1848a.B;
                if (!cVar.B) {
                    if (cVar.L) {
                        x2.a.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    cVar.a();
                    cVar.L = true;
                }
                return yb.y.f14813a;
            case l1.c.f8511g /* 5 */:
                ((mc.a) ((nc.t) this.L).A).b();
                return yb.y.f14813a;
            case l1.c.f8509e /* 6 */:
                return ((mc.a) this.L).b();
            case 7:
                return (ci.d) this.L;
            case 8:
                return (androidx.lifecycle.e1) ((m0) this.L).b();
            case l1.c.f8508d /* 9 */:
                ((g3.g0) this.L).Q0();
                return yb.y.f14813a;
            case l1.c.f8510f /* 10 */:
                j4.b bVar = (j4.b) this.L;
                bVar.f7423g = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    bVar.a();
                    Trace.endSection();
                    return yb.y.f14813a;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            case 11:
                n2.f1 f1Var = ((o3.j0) this.L).f10772b0;
                yb.y yVar2 = yb.y.f14813a;
                f1Var.setValue(yVar2);
                return yVar2;
            case 12:
                Object systemService = ((View) ((p1.c1) this.L).A).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 13:
                return new BaseInputConnection(((q4.b0) this.L).f12210a, false);
            case 14:
                return new d8.c(1, (r9.b) this.L);
            case l1.c.f8512h /* 15 */:
                return (zc.u) ((b9.e) this.L).X;
            case 16:
                return ((u3.h) this.L).O0();
            case 17:
                y3.h0 h0Var = (y3.h0) this.L;
                if (!((Boolean) h0Var.f14687g.getValue()).booleanValue() && (yVar = h0Var.f14683c) != null) {
                    yVar.l();
                }
                return yb.y.f14813a;
            default:
                y3.p0 a10 = ((y3.q1) this.L).a();
                o0 o0Var = a10.A;
                if (a10.f14725h0 != ((p2.b) ((a1.f0) o0Var.o()).B).L) {
                    a1.m0 m0Var2 = a10.Y;
                    Object[] objArr = m0Var2.f69c;
                    long[] jArr = m0Var2.f67a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j2 = jArr[i2];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i10 = 8 - ((~(i2 - length)) >>> 31);
                                for (int i11 = 0; i11 < i10; i11++) {
                                    if ((255 & j2) < 128) {
                                        ((y3.h0) objArr[(i2 << 3) + i11]).f14684d = true;
                                    }
                                    j2 >>= 8;
                                }
                                if (i10 != 8) {
                                }
                            }
                            if (i2 != length) {
                                i2++;
                            }
                        }
                    }
                    if (o0Var.f280d0 != null) {
                        if (!o0Var.B0.f338e) {
                            o0.V(o0Var, false, 7);
                        }
                    } else if (!o0Var.q()) {
                        o0.X(o0Var, false, 7);
                    }
                }
                return yb.y.f14813a;
        }
    }
}
