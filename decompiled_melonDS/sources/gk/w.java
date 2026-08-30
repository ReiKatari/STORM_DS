package gk;

import java.io.IOException;
import java.lang.reflect.Method;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w implements h, pi.h {
    public final /* synthetic */ int A;
    public final /* synthetic */ zc.h B;

    public /* synthetic */ w(zc.h hVar, int i2) {
        this.A = i2;
        this.B = hVar;
    }

    @Override // gk.h
    public void b(e eVar, r0 r0Var) {
        switch (this.A) {
            case 0:
                boolean z10 = r0Var.f5800a.f11710k0;
                zc.h hVar = this.B;
                if (z10) {
                    Object obj = r0Var.f5801b;
                    if (obj == null) {
                        w.x0 i2 = eVar.i();
                        i2.getClass();
                        nc.e a10 = nc.u.a(u.class);
                        Class cls = a10.f10259a;
                        cls.getClass();
                        Object cast = cls.cast(((p7.o) i2.f14093f).i(a10));
                        cast.getClass();
                        Method method = ((u) cast).f5811b;
                        hVar.h(new yb.k(new NullPointerException("Response from " + ff.a.class.getName() + '.' + method.getName() + " was null but response body type was declared as non-null")));
                        return;
                    }
                    hVar.h(obj);
                    return;
                }
                hVar.h(new yb.k(new androidx.fragment.app.g0(r0Var)));
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                boolean z11 = r0Var.f5800a.f11710k0;
                zc.h hVar2 = this.B;
                if (z11) {
                    hVar2.h(r0Var.f5801b);
                    return;
                } else {
                    hVar2.h(new yb.k(new androidx.fragment.app.g0(r0Var)));
                    return;
                }
            default:
                this.B.h(r0Var);
                return;
        }
    }

    @Override // gk.h
    public void c(e eVar, Throwable th2) {
        switch (this.A) {
            case 0:
                this.B.h(new yb.k(th2));
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                this.B.h(new yb.k(th2));
                return;
            default:
                this.B.h(new yb.k(th2));
                return;
        }
    }

    @Override // pi.h
    public void h(ti.n nVar, pi.d0 d0Var) {
        this.B.h(d0Var);
    }

    @Override // pi.h
    public void m(ti.n nVar, IOException iOException) {
        this.B.h(new yb.k(iOException));
    }
}
