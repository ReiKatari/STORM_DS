package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i0 extends a3.b {

    /* renamed from: b  reason: collision with root package name */
    public final n2.f1 f3595b;

    /* renamed from: c  reason: collision with root package name */
    public final n2.f1 f3596c;

    public i0(Object obj) {
        super(1);
        this.f3595b = n2.s.w(obj);
        this.f3596c = n2.s.w(obj);
    }

    @Override // a3.b
    public final Object c() {
        return this.f3595b.getValue();
    }

    @Override // a3.b
    public final Object e() {
        return this.f3596c.getValue();
    }

    @Override // a3.b
    public final void g(Object obj) {
        this.f3595b.setValue(obj);
    }

    @Override // a3.b
    public final void i() {
    }

    @Override // a3.b
    public final void h(q1 q1Var) {
    }
}
