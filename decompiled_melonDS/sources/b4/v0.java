package b4;

import android.view.Choreographer;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v0 extends ec.j implements mc.p {
    public final /* synthetic */ int X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(int i2, int i10, cc.c cVar) {
        super(i2, cVar);
        this.X = i10;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                return ((v0) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                cc.c cVar = (cc.c) obj2;
                yb.y yVar = yb.y.f14813a;
                ((v0) t(cVar, (cd.h) obj)).v(yVar);
                return yVar;
            case 2:
                cc.c cVar2 = (cc.c) obj2;
                yb.y yVar2 = yb.y.f14813a;
                ((v0) t(cVar2, (h1.u1) obj)).v(yVar2);
                return yVar2;
            default:
                return ((v0) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new v0(2, 0, cVar);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new v0(2, 1, cVar);
            case 2:
                return new v0(2, 2, cVar);
            default:
                return new v0(2, 3, cVar);
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        int i2 = this.X;
        yb.y yVar = yb.y.f14813a;
        switch (i2) {
            case 0:
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                return Choreographer.getInstance();
            case DSiCameraSource.FrontCamera /* 1 */:
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                return yVar;
            case 2:
                dc.a aVar3 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                return yVar;
            default:
                dc.a aVar4 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                return Boolean.valueOf(MelonEmulator.f9466a.takeScreenshot());
        }
    }
}
