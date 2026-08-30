package a5;

import a4.s2;
import android.content.Context;
import android.view.Choreographer;
import b4.a1;
import b4.c2;
import b4.m3;
import b4.n3;
import b4.y0;
import b4.z0;
import me.magnum.melonds.common.camera.DSiCameraSource;
import y3.h1;
import y3.i1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n extends nc.l implements mc.l {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i2, Object obj, Object obj2) {
        super(1);
        this.B = i2;
        this.L = obj;
        this.R = obj2;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        d2.v vVar;
        switch (this.B) {
            case 0:
                n2.h0 h0Var = (n2.h0) obj;
                m0 m0Var = (m0) this.L;
                m0Var.setPositionProvider((q0) this.R);
                m0Var.m();
                return new Object();
            case DSiCameraSource.FrontCamera /* 1 */:
                n2.h0 h0Var2 = (n2.h0) obj;
                Context context = (Context) this.L;
                Context applicationContext = context.getApplicationContext();
                b4.p0 p0Var = (b4.p0) this.R;
                applicationContext.registerComponentCallbacks(p0Var);
                return new b4.o0(0, context, p0Var);
            case 2:
                n2.h0 h0Var3 = (n2.h0) obj;
                Context context2 = (Context) this.L;
                Context applicationContext2 = context2.getApplicationContext();
                b4.q0 q0Var = (b4.q0) this.R;
                applicationContext2.registerComponentCallbacks(q0Var);
                return new b4.o0(1, context2, q0Var);
            case 3:
                zc.u uVar = (zc.u) obj;
                return new c2((d2.u) this.L, new a4.m0(2, (b4.t0) this.R));
            case 4:
                Throwable th2 = (Throwable) obj;
                c2 c2Var = (c2) this.L;
                synchronized (c2Var.f1800c) {
                    try {
                        c2Var.f1802e = true;
                        p2.b bVar = c2Var.f1801d;
                        Object[] objArr = bVar.A;
                        int i2 = bVar.L;
                        for (int i10 = 0; i10 < i2; i10++) {
                            q4.m mVar = (q4.m) ((s2) objArr[i10]).get();
                            if (mVar != null && (vVar = mVar.f12259b) != null) {
                                vVar.closeConnection();
                                mVar.f12259b = null;
                            }
                        }
                        c2Var.f1801d.g();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                q4.y yVar = ((b4.t0) this.R).B;
                yVar.f12280b.set(null);
                yVar.f12279a.h();
                return yb.y.f14813a;
            case l1.c.f8511g /* 5 */:
                Throwable th4 = (Throwable) obj;
                y0 y0Var = (y0) this.L;
                z0 z0Var = (z0) this.R;
                synchronized (y0Var.X) {
                    y0Var.Z.remove(z0Var);
                }
                return yb.y.f14813a;
            case l1.c.f8509e /* 6 */:
                Throwable th5 = (Throwable) obj;
                ((Choreographer) ((a1) this.L).B).removeFrameCallback((z0) this.R);
                return yb.y.f14813a;
            case 7:
                b4.n nVar = (b4.n) obj;
                mc.p pVar = (mc.p) this.R;
                n3 n3Var = (n3) this.L;
                if (!n3Var.L) {
                    androidx.lifecycle.r lifecycle = nVar.f1902a.getLifecycle();
                    n3Var.X = pVar;
                    if (n3Var.R == null) {
                        n3Var.R = lifecycle;
                        lifecycle.a(n3Var);
                    } else if (lifecycle.b().isAtLeast(androidx.lifecycle.q.CREATED)) {
                        n3Var.B.B(new v2.c(1330788943, true, new m3(n3Var, pVar, 1)));
                    }
                }
                return yb.y.f14813a;
            case 8:
                h1 h1Var = (h1) obj;
                i1 i1Var = (i1) this.L;
                float g10 = ((c1.l0) this.R).f2460c.g();
                h1Var.getClass();
                long j2 = 0;
                h1.a(h1Var, i1Var);
                i1Var.q0(x4.j.c((j2 & 4294967295L) | (j2 << 32), i1Var.X), g10, null);
                return yb.y.f14813a;
            case l1.c.f8508d /* 9 */:
                h1.u((h1) obj, (i1) this.L, 0, 0, ((i3.n) this.R).f6663i0, 4);
                return yb.y.f14813a;
            default:
                h1.u((h1) obj, (i1) this.L, 0, 0, ((i3.o0) this.R).f6674t0, 4);
                return yb.y.f14813a;
        }
    }
}
