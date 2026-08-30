package a6;

import android.view.WindowInsets;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class r1 extends v1 {

    /* renamed from: c  reason: collision with root package name */
    public final WindowInsets.Builder f514c;

    public r1(i2 i2Var) {
        super(i2Var);
        WindowInsets.Builder l10;
        WindowInsets f8 = i2Var.f();
        if (f8 != null) {
            l10 = a5.n0.c(f8);
        } else {
            l10 = q.i1.l();
        }
        this.f514c = l10;
    }

    @Override // a6.v1
    public i2 b() {
        WindowInsets build;
        a();
        build = this.f514c.build();
        i2 g10 = i2.g(null, build);
        g10.f479a.q(this.f518b);
        return g10;
    }

    @Override // a6.v1
    public void d(q5.b bVar) {
        this.f514c.setMandatorySystemGestureInsets(bVar.e());
    }

    @Override // a6.v1
    public void e(q5.b bVar) {
        this.f514c.setStableInsets(bVar.e());
    }

    @Override // a6.v1
    public void f(q5.b bVar) {
        this.f514c.setSystemGestureInsets(bVar.e());
    }

    @Override // a6.v1
    public void g(q5.b bVar) {
        this.f514c.setSystemWindowInsets(bVar.e());
    }

    @Override // a6.v1
    public void h(q5.b bVar) {
        this.f514c.setTappableElementInsets(bVar.e());
    }

    public r1() {
        this.f514c = q.i1.l();
    }
}
