package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d0 extends ec.j implements mc.p {
    public /* synthetic */ float X;

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        return ((d0) t((cc.c) obj2, Float.valueOf(((Number) obj).floatValue()))).v(yb.y.f14813a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ec.j, d1.d0, cc.c] */
    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        ?? jVar = new ec.j(2, cVar);
        jVar.X = ((Number) obj).floatValue();
        return jVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        boolean z10;
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        p7.j.I(obj);
        if (this.X > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
