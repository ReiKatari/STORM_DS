package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends ec.j implements mc.q {
    public /* synthetic */ zc.u X;
    public /* synthetic */ float Y;
    public final /* synthetic */ n Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(n nVar, cc.c cVar) {
        super(3, cVar);
        this.Z = nVar;
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        float floatValue = ((Number) obj2).floatValue();
        c cVar = new c(this.Z, (cc.c) obj3);
        cVar.X = (zc.u) obj;
        cVar.Y = floatValue;
        yb.y yVar = yb.y.f14813a;
        cVar.v(yVar);
        return yVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        p7.j.I(obj);
        zc.x.v(this.X, null, null, new b(this.Z, this.Y, null), 3);
        return yb.y.f14813a;
    }
}
