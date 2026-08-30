package d2;

import b4.r2;
import b4.s1;
import g3.z;
import me.magnum.melonds.common.camera.DSiCameraSource;
import u1.p0;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ h B;

    public /* synthetic */ f(h hVar, int i2) {
        this.A = i2;
        this.B = hVar;
    }

    @Override // mc.a
    public final Object b() {
        switch (this.A) {
            case 0:
                a4.l.q(this.B);
                return y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                this.B.f3737q0.h(true);
                return Boolean.TRUE;
            case 2:
                this.B.f3737q0.d(true);
                return Boolean.TRUE;
            case 3:
                this.B.f3737q0.f();
                return Boolean.TRUE;
            case 4:
                a4.l.q(this.B);
                return y.f14813a;
            case l1.c.f8511g /* 5 */:
                this.B.f3737q0.p();
                return Boolean.TRUE;
            case l1.c.f8509e /* 6 */:
                h hVar = this.B;
                u1.s sVar = hVar.f3734m0.f13400w;
                sVar.B.f13395r.b(hVar.f3738r0.f12254e);
                return Boolean.TRUE;
            default:
                h hVar2 = this.B;
                p0 p0Var = hVar2.f3734m0;
                z zVar = hVar2.f3739s0;
                if (!p0Var.b()) {
                    z.a(zVar);
                } else {
                    r2 r2Var = p0Var.f13381c;
                    if (r2Var != null) {
                        ((s1) r2Var).b();
                    }
                }
                return Boolean.TRUE;
        }
    }
}
