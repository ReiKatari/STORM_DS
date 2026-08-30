package h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f2 extends ec.j implements mc.p {
    public /* synthetic */ Object X;
    public final /* synthetic */ long Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(long j2, cc.c cVar) {
        super(2, cVar);
        this.Y = j2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        cc.c cVar = (cc.c) obj2;
        yb.y yVar = yb.y.f14813a;
        ((f2) t(cVar, (n2) obj)).v(yVar);
        return yVar;
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        f2 f2Var = new f2(this.Y, cVar);
        f2Var.X = obj;
        return f2Var;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        p7.j.I(obj);
        p2 p2Var = ((n2) this.X).f5985a;
        p2Var.c(p2Var.f5999k, this.Y, 1);
        return yb.y.f14813a;
    }
}
