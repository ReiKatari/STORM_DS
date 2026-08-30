package ai;

import android.view.InputDevice;
import android.view.KeyEvent;
import b4.r2;
import b4.s1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
import u1.h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b1 implements mc.l, pi.h {
    public final /* synthetic */ int A;
    public final Object B;
    public final Object L;

    public /* synthetic */ b1(int i2, Object obj, Object obj2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
    }

    @Override // pi.h
    public void h(ti.n nVar, pi.d0 d0Var) {
        ((zc.h) this.L).h(d0Var);
    }

    @Override // mc.l
    public final Object k(Object obj) {
        boolean z10;
        long j2;
        switch (this.A) {
            case 0:
                ((a7.a) this.B).k(((ArrayList) this.L).get(((Number) obj).intValue()));
                return "achievement";
            case DSiCameraSource.FrontCamera /* 1 */:
                int intValue = ((Number) obj).intValue();
                return ((l4.b0) this.B).j(Integer.valueOf(intValue), ((List) this.L).get(intValue));
            case 2:
                return ((l4.c0) this.B).k(((List) this.L).get(((Number) obj).intValue()));
            case 3:
                ((l4.c0) this.B).k(((List) this.L).get(((Number) obj).intValue()));
                return "achievement";
            case 4:
                return ((l4.c0) this.B).k(((List) this.L).get(((Number) obj).intValue()));
            case l1.c.f8511g /* 5 */:
                Throwable th2 = (Throwable) obj;
                e9.a aVar = (e9.a) this.B;
                Object obj2 = aVar.f4415b;
                zc.h hVar = (zc.h) this.L;
                synchronized (obj2) {
                    ((ArrayList) aVar.f4416c).remove(hVar);
                }
                return yb.y.f14813a;
            case l1.c.f8509e /* 6 */:
                Throwable th3 = (Throwable) obj;
                if (th3 instanceof q8.s) {
                    ((p8.u) this.B).f11505c.compareAndSet(-256, ((q8.s) th3).A);
                }
                ((ta.a) this.L).cancel(false);
                return yb.y.f14813a;
            case 7:
                Throwable th4 = (Throwable) obj;
                try {
                    ((ti.n) this.B).cancel();
                } catch (Throwable unused) {
                }
                return yb.y.f14813a;
            case 8:
                return ((od.x) this.B).k(((List) this.L).get(((Number) obj).intValue()));
            case l1.c.f8508d /* 9 */:
                KeyEvent keyEvent = ((t3.b) obj).f13107a;
                if (((u1.p0) this.B).a() == u1.d0.Selection && keyEvent.getKeyCode() == 4) {
                    z10 = true;
                    if (t3.c.c(keyEvent) == 1) {
                        ((f2.b1) this.L).g(null);
                        return Boolean.valueOf(z10);
                    }
                }
                z10 = false;
                return Boolean.valueOf(z10);
            case l1.c.f8510f /* 10 */:
                KeyEvent keyEvent2 = ((t3.b) obj).f13107a;
                g3.l lVar = (g3.l) this.B;
                InputDevice device = keyEvent2.getDevice();
                boolean z11 = false;
                if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent2.getSource() == 33554433) && t3.c.c(keyEvent2) == 2 && keyEvent2.getSource() != 257)) {
                    if (u1.l0.k(19, keyEvent2)) {
                        z11 = ((g3.p) lVar).g(5, true);
                    } else if (u1.l0.k(20, keyEvent2)) {
                        z11 = ((g3.p) lVar).g(6, true);
                    } else if (u1.l0.k(21, keyEvent2)) {
                        z11 = ((g3.p) lVar).g(3, true);
                    } else if (u1.l0.k(22, keyEvent2)) {
                        z11 = ((g3.p) lVar).g(4, true);
                    } else if (u1.l0.k(23, keyEvent2)) {
                        r2 r2Var = ((u1.p0) this.L).f13381c;
                        if (r2Var != null) {
                            ((s1) r2Var).b();
                        }
                        z11 = true;
                    }
                }
                return Boolean.valueOf(z11);
            case 11:
                return ((h1) this.B).k(((List) this.L).get(((Number) obj).intValue()));
            case 12:
                z2.j jVar = (z2.j) obj;
                synchronized (z2.l.f14919c) {
                    j2 = z2.l.f14921e;
                    z2.l.f14921e = 1 + j2;
                }
                return new z2.b(j2, jVar, (mc.l) this.B, (mc.l) this.L);
            default:
                return ((zf.f) this.B).k(((List) this.L).get(((Number) obj).intValue()));
        }
    }

    @Override // pi.h
    public void m(ti.n nVar, IOException iOException) {
        if (!nVar.f13226j0) {
            ((zc.h) this.L).h(new yb.k(iOException));
        }
    }
}
