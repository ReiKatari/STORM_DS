package a2;

import a6.b1;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import c8.c0;
import f1.d0;
import f1.e0;
import f2.f0;
import f2.z0;
import h1.a3;
import h1.b3;
import h1.m0;
import me.magnum.melonds.common.camera.DSiCameraSource;
import q1.a0;
import u1.v0;
import v3.h0;
import v3.w;
import yb.y;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h implements PointerInputEventHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f127a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f128b;

    public /* synthetic */ h(int i2, Object obj) {
        this.f127a = i2;
        this.f128b = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w wVar, cc.c cVar) {
        int i2 = this.f127a;
        Object obj = this.f128b;
        y yVar = y.f14813a;
        switch (i2) {
            case 0:
                Object e6 = b3.e(wVar, new f0(1, null, new g(1, (k) obj, k.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, 0, 0)), cVar);
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                if (e6 != aVar) {
                    e6 = yVar;
                }
                if (e6 == aVar) {
                    return e6;
                }
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                Object e10 = b3.e(wVar, new c2.c(0, null, (c2.d) obj), cVar);
                if (e10 == dc.a.COROUTINE_SUSPENDED) {
                    return e10;
                }
                return yVar;
            case 2:
                Object e11 = b3.e(wVar, new b1(1, null, (f1.i) obj), cVar);
                if (e11 == dc.a.COROUTINE_SUSPENDED) {
                    return e11;
                }
                return yVar;
            case 3:
                e0 e0Var = (e0) obj;
                d0 d0Var = new d0(e0Var, null);
                c cVar2 = new c(13, e0Var);
                m0 m0Var = a3.f5853a;
                Object g10 = x.g(new a9.e(wVar, d0Var, null, null, cVar2, null, 4), cVar);
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                if (g10 != aVar2) {
                    g10 = yVar;
                }
                if (g10 == aVar2) {
                    return g10;
                }
                return yVar;
            case 4:
                Object O0 = ((h0) wVar).O0(new f0(0, null, (mc.l) obj), cVar);
                if (O0 == dc.a.COROUTINE_SUSPENDED) {
                    return O0;
                }
                return yVar;
            case l1.c.f8511g /* 5 */:
                Object g11 = x.g(new b7.p(wVar, (v0) obj, (cc.c) null, 2), cVar);
                dc.a aVar3 = dc.a.COROUTINE_SUSPENDED;
                if (g11 != aVar3) {
                    g11 = yVar;
                }
                if (g11 == aVar3) {
                    return g11;
                }
                return yVar;
            case l1.c.f8509e /* 6 */:
                Object d4 = a3.d(wVar, null, new og.b((og.e) obj, 2), cVar, 7);
                if (d4 == dc.a.COROUTINE_SUSPENDED) {
                    return d4;
                }
                return yVar;
            case 7:
                Object g12 = x.g(new mh.m(wVar, (a0) obj, null, 4), cVar);
                if (g12 == dc.a.COROUTINE_SUSPENDED) {
                    return g12;
                }
                return yVar;
            default:
                f2.b1 b1Var = (f2.b1) obj;
                d0.c cVar3 = b1Var.A;
                z0 z0Var = b1Var.f4730z;
                h0 h0Var = (h0) wVar;
                h0Var.getClass();
                Object e12 = b3.e(wVar, new c2.c(new c0(a4.l.t(h0Var).f297v0), cVar3, z0Var, null), cVar);
                if (e12 != dc.a.COROUTINE_SUSPENDED) {
                    e12 = yVar;
                }
                if (e12 == dc.a.COROUTINE_SUSPENDED) {
                    return e12;
                }
                return yVar;
        }
    }
}
