package h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n implements j2 {

    /* renamed from: a  reason: collision with root package name */
    public final mc.l f5977a;

    /* renamed from: b  reason: collision with root package name */
    public final m f5978b = new m(this);

    /* renamed from: c  reason: collision with root package name */
    public final f1.j1 f5979c = new f1.j1();

    /* renamed from: d  reason: collision with root package name */
    public final n2.f1 f5980d;

    /* renamed from: e  reason: collision with root package name */
    public final n2.f1 f5981e;

    /* renamed from: f  reason: collision with root package name */
    public final n2.f1 f5982f;

    public n(mc.l lVar) {
        this.f5977a = lVar;
        Boolean bool = Boolean.FALSE;
        this.f5980d = n2.s.w(bool);
        this.f5981e = n2.s.w(bool);
        this.f5982f = n2.s.w(bool);
    }

    @Override // h1.j2
    public final boolean b() {
        return ((Boolean) this.f5980d.getValue()).booleanValue();
    }

    @Override // h1.j2
    public final Object c(f1.f1 f1Var, mc.p pVar, cc.c cVar) {
        Object g10 = zc.x.g(new a2.o(this, f1Var, pVar, null, 24), cVar);
        if (g10 == dc.a.COROUTINE_SUSPENDED) {
            return g10;
        }
        return yb.y.f14813a;
    }

    @Override // h1.j2
    public final float e(float f8) {
        return ((Number) this.f5977a.k(Float.valueOf(f8))).floatValue();
    }
}
