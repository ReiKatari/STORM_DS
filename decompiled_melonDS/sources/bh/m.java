package bh;

import cd.g1;
import mc.p;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.r1;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m extends ec.j implements p {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i2, int i10, cc.c cVar) {
        super(i2, cVar);
        this.X = i10;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                return ((m) t((cc.c) obj2, (vf.a) obj)).v(y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((m) t((cc.c) obj2, (vf.a) obj)).v(y.f14813a);
            case 2:
                return ((m) t((cc.c) obj2, (g1) obj)).v(y.f14813a);
            case 3:
                cc.c cVar = (cc.c) obj2;
                y yVar = y.f14813a;
                ((m) t(cVar, (g2.m) obj)).v(yVar);
                return yVar;
            case 4:
                return ((m) t((cc.c) obj2, (ve.f) obj)).v(y.f14813a);
            default:
                return ((m) t((cc.c) obj2, (r1) obj)).v(y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                m mVar = new m(2, 0, cVar);
                mVar.Y = obj;
                return mVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                m mVar2 = new m(2, 1, cVar);
                mVar2.Y = obj;
                return mVar2;
            case 2:
                m mVar3 = new m(2, 2, cVar);
                mVar3.Y = obj;
                return mVar3;
            case 3:
                m mVar4 = new m(2, 3, cVar);
                mVar4.Y = obj;
                return mVar4;
            case 4:
                m mVar5 = new m(2, 4, cVar);
                mVar5.Y = obj;
                return mVar5;
            default:
                m mVar6 = new m(2, 5, cVar);
                mVar6.Y = obj;
                return mVar6;
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        boolean z10 = false;
        switch (this.X) {
            case 0:
                vf.a aVar = (vf.a) this.Y;
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                if (aVar == vf.a.CONNECTED) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case DSiCameraSource.FrontCamera /* 1 */:
                vf.a aVar3 = (vf.a) this.Y;
                dc.a aVar4 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                if (aVar3 == vf.a.DISCONNECTED) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 2:
                dc.a aVar5 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                if (((g1) this.Y) != g1.START) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 3:
                dc.a aVar6 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                ((g2.m) this.Y).a(0.0f);
                return y.f14813a;
            case 4:
                ve.f fVar = (ve.f) this.Y;
                dc.a aVar7 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                if (fVar != null) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            default:
                dc.a aVar8 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                if (((r1) this.Y) == r1.ShutDown) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
        }
    }
}
