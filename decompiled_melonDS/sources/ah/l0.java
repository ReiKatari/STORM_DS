package ah;

import java.io.Serializable;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l0 implements cd.h {
    public final /* synthetic */ int A;
    public final /* synthetic */ cd.h B;

    public /* synthetic */ l0(cd.h hVar, int i2) {
        this.A = i2;
        this.B = hVar;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.io.Serializable] */
    @Override // cd.h
    public final Object c(cd.i iVar, cc.c cVar) {
        switch (this.A) {
            case 0:
                Object c4 = this.B.c(new a9.h(iVar, 2), cVar);
                if (c4 != dc.a.COROUTINE_SUSPENDED) {
                    return yb.y.f14813a;
                }
                return c4;
            case DSiCameraSource.FrontCamera /* 1 */:
                Object c10 = this.B.c(new a9.h(iVar, 4), cVar);
                if (c10 != dc.a.COROUTINE_SUSPENDED) {
                    return yb.y.f14813a;
                }
                return c10;
            case 2:
                Object c11 = this.B.c(new a9.h(iVar, 5), cVar);
                if (c11 != dc.a.COROUTINE_SUSPENDED) {
                    return yb.y.f14813a;
                }
                return c11;
            case 3:
                Object c12 = this.B.c(new a9.h(iVar, 6), cVar);
                if (c12 != dc.a.COROUTINE_SUSPENDED) {
                    return yb.y.f14813a;
                }
                return c12;
            case 4:
                Object c13 = this.B.c(new a9.h(iVar, 7), cVar);
                if (c13 != dc.a.COROUTINE_SUSPENDED) {
                    return yb.y.f14813a;
                }
                return c13;
            case l1.c.f8511g /* 5 */:
                Object c14 = this.B.c(new cd.a0((Serializable) new Object(), iVar, 1), cVar);
                if (c14 != dc.a.COROUTINE_SUSPENDED) {
                    return yb.y.f14813a;
                }
                return c14;
            case l1.c.f8509e /* 6 */:
                Object c15 = this.B.c(new a9.h(iVar, 8), cVar);
                if (c15 != dc.a.COROUTINE_SUSPENDED) {
                    return yb.y.f14813a;
                }
                return c15;
            case 7:
                Object c16 = this.B.c(new a9.h(iVar, 9), cVar);
                if (c16 != dc.a.COROUTINE_SUSPENDED) {
                    return yb.y.f14813a;
                }
                return c16;
            case 8:
                Object c17 = this.B.c(new a9.h(iVar, 10), cVar);
                if (c17 != dc.a.COROUTINE_SUSPENDED) {
                    return yb.y.f14813a;
                }
                return c17;
            case l1.c.f8508d /* 9 */:
                Object c18 = this.B.c(new a9.h(iVar, 19), cVar);
                if (c18 != dc.a.COROUTINE_SUSPENDED) {
                    return yb.y.f14813a;
                }
                return c18;
            case l1.c.f8510f /* 10 */:
                Object c19 = this.B.c(new a9.h(iVar, 20), cVar);
                if (c19 != dc.a.COROUTINE_SUSPENDED) {
                    return yb.y.f14813a;
                }
                return c19;
            default:
                Object c20 = this.B.c(new a9.h(iVar, 21), cVar);
                if (c20 != dc.a.COROUTINE_SUSPENDED) {
                    return yb.y.f14813a;
                }
                return c20;
        }
    }
}
