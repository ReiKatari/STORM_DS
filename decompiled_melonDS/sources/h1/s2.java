package h1;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s2 extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public final /* synthetic */ r1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s2(r1 r1Var, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Y = r1Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        zc.u uVar = (zc.u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                yb.y yVar = yb.y.f14813a;
                ((s2) t(cVar, uVar)).v(yVar);
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                yb.y yVar2 = yb.y.f14813a;
                ((s2) t(cVar, uVar)).v(yVar2);
                return yVar2;
            case 2:
                yb.y yVar3 = yb.y.f14813a;
                ((s2) t(cVar, uVar)).v(yVar3);
                return yVar3;
            case 3:
                yb.y yVar4 = yb.y.f14813a;
                ((s2) t(cVar, uVar)).v(yVar4);
                return yVar4;
            case 4:
                yb.y yVar5 = yb.y.f14813a;
                ((s2) t(cVar, uVar)).v(yVar5);
                return yVar5;
            case l1.c.f8511g /* 5 */:
                yb.y yVar6 = yb.y.f14813a;
                ((s2) t(cVar, uVar)).v(yVar6);
                return yVar6;
            case l1.c.f8509e /* 6 */:
                yb.y yVar7 = yb.y.f14813a;
                ((s2) t(cVar, uVar)).v(yVar7);
                return yVar7;
            default:
                yb.y yVar8 = yb.y.f14813a;
                ((s2) t(cVar, uVar)).v(yVar8);
                return yVar8;
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new s2(this.Y, cVar, 0);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new s2(this.Y, cVar, 1);
            case 2:
                return new s2(this.Y, cVar, 2);
            case 3:
                return new s2(this.Y, cVar, 3);
            case 4:
                return new s2(this.Y, cVar, 4);
            case l1.c.f8511g /* 5 */:
                return new s2(this.Y, cVar, 5);
            case l1.c.f8509e /* 6 */:
                return new s2(this.Y, cVar, 6);
            default:
                return new s2(this.Y, cVar, 7);
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        int i2 = this.X;
        yb.y yVar = yb.y.f14813a;
        r1 r1Var = this.Y;
        switch (i2) {
            case 0:
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                r1Var.d();
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                r1Var.e();
                return yVar;
            case 2:
                dc.a aVar3 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                r1Var.e();
                return yVar;
            case 3:
                dc.a aVar4 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                r1Var.d();
                return yVar;
            case 4:
                dc.a aVar5 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                r1Var.e();
                return yVar;
            case l1.c.f8511g /* 5 */:
                dc.a aVar6 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                r1Var.e();
                return yVar;
            case l1.c.f8509e /* 6 */:
                dc.a aVar7 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                r1Var.d();
                return yVar;
            default:
                dc.a aVar8 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                r1Var.e();
                return yVar;
        }
    }
}
