package h1;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m0 extends ec.j implements mc.q {
    public final /* synthetic */ int X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(int i2, int i10, cc.c cVar) {
        super(i2, cVar);
        this.X = i10;
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                zc.u uVar = (zc.u) obj;
                long j2 = ((h3.b) obj2).f6050a;
                m0 m0Var = new m0(3, 0, (cc.c) obj3);
                yb.y yVar = yb.y.f14813a;
                m0Var.v(yVar);
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                zc.u uVar2 = (zc.u) obj;
                ((Number) obj2).floatValue();
                m0 m0Var2 = new m0(3, 1, (cc.c) obj3);
                yb.y yVar2 = yb.y.f14813a;
                m0Var2.v(yVar2);
                return yVar2;
            default:
                r1 r1Var = (r1) obj;
                long j10 = ((h3.b) obj2).f6050a;
                m0 m0Var3 = new m0(3, 2, (cc.c) obj3);
                yb.y yVar3 = yb.y.f14813a;
                m0Var3.v(yVar3);
                return yVar3;
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
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                return yVar;
            default:
                dc.a aVar3 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                return yVar;
        }
    }
}
