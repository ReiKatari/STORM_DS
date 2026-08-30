package dd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y implements cd.i {
    public final bd.x A;

    public y(bd.v vVar) {
        this.A = vVar;
    }

    @Override // cd.i
    public final Object a(Object obj, cc.c cVar) {
        Object b10 = this.A.b(cVar, obj);
        if (b10 == dc.a.COROUTINE_SUSPENDED) {
            return b10;
        }
        return yb.y.f14813a;
    }
}
