package ai;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i0 extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public final /* synthetic */ g3.z Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(g3.z zVar, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Y = zVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        zc.u uVar = (zc.u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                yb.y yVar = yb.y.f14813a;
                ((i0) t(cVar, uVar)).v(yVar);
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                yb.y yVar2 = yb.y.f14813a;
                ((i0) t(cVar, uVar)).v(yVar2);
                return yVar2;
            case 2:
                yb.y yVar3 = yb.y.f14813a;
                ((i0) t(cVar, uVar)).v(yVar3);
                return yVar3;
            default:
                yb.y yVar4 = yb.y.f14813a;
                ((i0) t(cVar, uVar)).v(yVar4);
                return yVar4;
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new i0(this.Y, cVar, 0);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new i0(this.Y, cVar, 1);
            case 2:
                return new i0(this.Y, cVar, 2);
            default:
                return new i0(this.Y, cVar, 3);
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        int i2 = this.X;
        yb.y yVar = yb.y.f14813a;
        g3.z zVar = this.Y;
        switch (i2) {
            case 0:
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                g3.z.a(zVar);
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                g3.z.a(zVar);
                return yVar;
            case 2:
                dc.a aVar3 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                g3.z.a(zVar);
                return yVar;
            default:
                dc.a aVar4 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                g3.z.a(zVar);
                return yVar;
        }
    }
}
