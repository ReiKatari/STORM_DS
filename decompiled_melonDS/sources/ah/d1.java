package ah;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d1 extends ec.j implements mc.q {
    public final /* synthetic */ int X;
    public /* synthetic */ ve.f Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(int i2, int i10, cc.c cVar) {
        super(i2, cVar);
        this.X = i10;
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        ve.f fVar = (ve.f) obj;
        yb.y yVar = (yb.y) obj2;
        cc.c cVar = (cc.c) obj3;
        switch (this.X) {
            case 0:
                d1 d1Var = new d1(3, 0, cVar);
                d1Var.Y = fVar;
                return d1Var.v(yb.y.f14813a);
            default:
                d1 d1Var2 = new d1(3, 1, cVar);
                d1Var2.Y = fVar;
                return d1Var2.v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        switch (this.X) {
            case 0:
                ve.f fVar = this.Y;
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                return fVar;
            default:
                ve.f fVar2 = this.Y;
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                return fVar2;
        }
    }
}
