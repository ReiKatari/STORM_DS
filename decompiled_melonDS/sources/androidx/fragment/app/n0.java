package androidx.fragment.app;

import android.view.View;
import android.view.Window;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n0 extends s0 implements n5.a, n5.b, m5.k, m5.l, androidx.lifecycle.e1, d.b0, h.i, q7.f, l1, a6.p {
    public final /* synthetic */ l.i X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(l.i iVar) {
        super(iVar);
        this.X = iVar;
    }

    @Override // d.b0
    public final d.a0 a() {
        return this.X.a();
    }

    @Override // a6.p
    public final void c(y0 y0Var) {
        this.X.c(y0Var);
    }

    @Override // androidx.fragment.app.r0
    public final View d(int i2) {
        return this.X.findViewById(i2);
    }

    @Override // androidx.fragment.app.r0
    public final boolean e() {
        Window window = this.X.getWindow();
        if (window != null && window.peekDecorView() != null) {
            return true;
        }
        return false;
    }

    @Override // m5.l
    public final void f(z5.a aVar) {
        this.X.f(aVar);
    }

    @Override // n5.a
    public final void g(z5.a aVar) {
        this.X.g(aVar);
    }

    @Override // androidx.lifecycle.x
    public final androidx.lifecycle.r getLifecycle() {
        return this.X.p0;
    }

    @Override // q7.f
    public final q7.d getSavedStateRegistry() {
        return this.X.R.f12313b;
    }

    @Override // androidx.lifecycle.e1
    public final androidx.lifecycle.d1 getViewModelStore() {
        return this.X.getViewModelStore();
    }

    @Override // n5.b
    public final void h(z5.a aVar) {
        this.X.h(aVar);
    }

    @Override // n5.b
    public final void i(z5.a aVar) {
        this.X.i(aVar);
    }

    @Override // a6.p
    public final void j(y0 y0Var) {
        this.X.j(y0Var);
    }

    @Override // m5.l
    public final void k(z5.a aVar) {
        this.X.k(aVar);
    }

    @Override // m5.k
    public final void l(z5.a aVar) {
        this.X.l(aVar);
    }

    @Override // h.i
    public final h.h m() {
        return this.X.f3294c0;
    }

    @Override // m5.k
    public final void n(z5.a aVar) {
        this.X.n(aVar);
    }

    @Override // n5.a
    public final void o(z5.a aVar) {
        this.X.o(aVar);
    }

    @Override // androidx.fragment.app.l1
    public final void b(j0 j0Var) {
    }
}
