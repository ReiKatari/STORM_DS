package d;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v extends f7.d {

    /* renamed from: d  reason: collision with root package name */
    public final w f3311d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3312e;

    public v(w wVar, x xVar) {
        boolean z10 = wVar.f3314b;
        this.f4931a = xVar;
        this.f4932b = z10;
        this.f3311d = wVar;
        this.f3312e = true;
    }

    @Override // f7.d
    public final void a() {
        this.f3311d.a();
    }

    @Override // f7.d
    public final void b() {
        this.f3311d.b();
    }

    @Override // f7.d
    public final void c(f7.b bVar) {
        this.f3311d.c(new a(bVar));
    }

    @Override // f7.d
    public final void d(f7.b bVar) {
        bVar.getClass();
        this.f3311d.d(new a(bVar));
    }

    public final void g(boolean z10) {
        boolean z11;
        this.f3312e = z10;
        if (z10 && this.f3311d.f3314b) {
            z11 = true;
        } else {
            z11 = false;
        }
        f(z11);
    }
}
