package f2;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v0 extends ec.j implements mc.l {
    public final /* synthetic */ int X;
    public final /* synthetic */ b1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(b1 b1Var, cc.c cVar, int i2) {
        super(1, cVar);
        this.X = i2;
        this.Y = b1Var;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        cc.c cVar = (cc.c) obj;
        switch (this.X) {
            case 0:
                v0 v0Var = new v0(this.Y, cVar, 0);
                yb.y yVar = yb.y.f14813a;
                v0Var.v(yVar);
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                v0 v0Var2 = new v0(this.Y, cVar, 1);
                yb.y yVar2 = yb.y.f14813a;
                v0Var2.v(yVar2);
                return yVar2;
            case 2:
                v0 v0Var3 = new v0(this.Y, cVar, 2);
                yb.y yVar3 = yb.y.f14813a;
                v0Var3.v(yVar3);
                return yVar3;
            default:
                v0 v0Var4 = new v0(this.Y, cVar, 3);
                yb.y yVar4 = yb.y.f14813a;
                v0Var4.v(yVar4);
                return yVar4;
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        int i2 = this.X;
        yb.y yVar = yb.y.f14813a;
        b1 b1Var = this.Y;
        switch (i2) {
            case 0:
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                b1Var.B = false;
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                b1Var.f();
                return yVar;
            case 2:
                dc.a aVar3 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                b1Var.d(b1Var.B);
                return yVar;
            default:
                dc.a aVar4 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                b1Var.p();
                return yVar;
        }
    }
}
