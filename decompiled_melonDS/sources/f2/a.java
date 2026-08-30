package f2;

import android.os.Build;
import android.os.Trace;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public /* synthetic */ a(Object obj, boolean z10, Object obj2, Object obj3, int i2) {
        this.A = i2;
        this.L = obj;
        this.B = z10;
        this.R = obj2;
        this.X = obj3;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        switch (this.A) {
            case 0:
                i3.f fVar = (i3.f) this.R;
                i3.l lVar = (i3.l) this.X;
                a4.r0 r0Var = (a4.r0) obj;
                r0Var.a();
                k3.b bVar = r0Var.A;
                if (((Boolean) ((mc.a) this.L).b()).booleanValue()) {
                    if (this.B) {
                        long S = bVar.S();
                        a4.n nVar = bVar.B;
                        long t5 = nVar.t();
                        nVar.p().p();
                        try {
                            ((d2.t) nVar.B).E(-1.0f, 1.0f, S);
                            bVar.g(fVar, lVar);
                        } finally {
                            w.d.y(nVar, t5);
                        }
                    } else {
                        bVar.g(fVar, lVar);
                    }
                }
                return yb.y.f14813a;
            default:
                p8.u uVar = (p8.u) this.L;
                String str = (String) this.R;
                q8.b0 b0Var = (q8.b0) this.X;
                Throwable th2 = (Throwable) obj;
                if (th2 instanceof q8.s) {
                    uVar.f11505c.compareAndSet(-256, ((q8.s) th2).A);
                }
                if (this.B && str != null) {
                    p8.x xVar = b0Var.f12328e.m;
                    int hashCode = b0Var.f12324a.hashCode();
                    xVar.getClass();
                    if (Build.VERSION.SDK_INT >= 29) {
                        b8.a.b(hashCode, aj.g.v0(str));
                    } else {
                        String v02 = aj.g.v0(str);
                        try {
                            if (aj.g.f867e == null) {
                                aj.g.f867e = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                            }
                            aj.g.f867e.invoke(null, Long.valueOf(aj.g.f864b), v02, Integer.valueOf(hashCode));
                        } catch (Exception e6) {
                            aj.g.F("asyncTraceEnd", e6);
                        }
                    }
                }
                return yb.y.f14813a;
        }
    }
}
