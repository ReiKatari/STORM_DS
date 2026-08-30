package cd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f implements h {
    public final h A;
    public final mc.l B;

    public f(h hVar, mc.l lVar) {
        this.A = hVar;
        this.B = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nc.t, java.lang.Object] */
    @Override // cd.h
    public final Object c(i iVar, cc.c cVar) {
        ?? obj = new Object();
        obj.A = dd.c.f4036b;
        Object c4 = this.A.c(new b7.y(this, obj, iVar, 2), cVar);
        if (c4 == dc.a.COROUTINE_SUSPENDED) {
            return c4;
        }
        return yb.y.f14813a;
    }
}
