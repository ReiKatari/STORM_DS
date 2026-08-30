package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends ec.j implements mc.l {
    public final /* synthetic */ c X;
    public final /* synthetic */ Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Object obj, cc.c cVar2) {
        super(1, cVar2);
        this.X = cVar;
        this.Y = obj;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        b bVar = new b(this.X, this.Y, (cc.c) obj);
        yb.y yVar = yb.y.f14813a;
        bVar.v(yVar);
        return yVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        p7.j.I(obj);
        c cVar = this.X;
        c.b(cVar);
        Object a10 = c.a(cVar, this.Y);
        cVar.f3525c.B.setValue(a10);
        cVar.f3527e.setValue(a10);
        return yb.y.f14813a;
    }
}
