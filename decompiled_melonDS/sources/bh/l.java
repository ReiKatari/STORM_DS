package bh;

import cd.q1;
import mc.q;
import me.magnum.melonds.common.camera.DSiCameraSource;
import nc.p;
import q.q3;
import yb.y;
import zc.p1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l extends ec.j implements q {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i2, cc.c cVar, Object obj) {
        super(3, cVar);
        this.X = i2;
        this.Y = obj;
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        cd.i iVar = (cd.i) obj;
        Throwable th2 = (Throwable) obj2;
        cc.c cVar = (cc.c) obj3;
        switch (this.X) {
            case 0:
                l lVar = new l(0, cVar, (q3) this.Y);
                y yVar = y.f14813a;
                lVar.v(yVar);
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                l lVar2 = new l(3, cVar);
                lVar2.Y = th2;
                y yVar2 = y.f14813a;
                lVar2.v(yVar2);
                return yVar2;
            default:
                l lVar3 = new l(2, cVar, (p) this.Y);
                y yVar3 = y.f14813a;
                lVar3.v(yVar3);
                return yVar3;
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        int i2 = this.X;
        y yVar = y.f14813a;
        switch (i2) {
            case 0:
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                q3 q3Var = (q3) this.Y;
                q1 q1Var = (q1) q3Var.f11999f;
                q1Var.getClass();
                q1Var.k(null, zb.q.A);
                bd.h hVar = (bd.h) q3Var.f11998e;
                if (hVar != null) {
                    hVar.i(null);
                }
                q3Var.f11998e = null;
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                Throwable th2 = (Throwable) this.Y;
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                if (th2 instanceof p1) {
                    return yVar;
                }
                throw th2;
            default:
                dc.a aVar3 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                ((p) this.Y).A = true;
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i2, cc.c cVar) {
        super(i2, cVar);
        this.X = 1;
    }
}
