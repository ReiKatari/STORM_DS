package b4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b2 implements cc.f, x2, p4.c {
    public static final /* synthetic */ b2 A = new Object();
    public static final b2 B = new Object();
    public static final d3 L = new Object();

    /* JADX WARN: Type inference failed for: r0v1, types: [nc.t, java.lang.Object] */
    @Override // b4.x2
    public mc.a a(a aVar) {
        if (aVar.isAttachedToWindow()) {
            androidx.lifecycle.x d4 = androidx.lifecycle.s0.d(aVar);
            if (d4 != null) {
                return l0.b(aVar, d4.getLifecycle());
            }
            x3.a.d("View tree for " + aVar + " has no ViewTreeLifecycleOwner");
            wa.b.a();
            return null;
        }
        ?? obj = new Object();
        w2 w2Var = new w2(aVar, obj, 0);
        aVar.addOnAttachStateChangeListener(w2Var);
        obj.A = new a4.n0(4, aVar, w2Var);
        return new a4.m0(5, obj);
    }
}
