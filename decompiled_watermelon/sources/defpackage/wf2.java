package defpackage;

import android.view.View;
import android.view.Window;
import androidx.fragment.app.o;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wf2  reason: default package */
/* loaded from: classes.dex */
public final class wf2 extends dg2 implements mc4, ad4, sc4, tc4, ab7, lc4, k9, au5, pg2, xw3 {
    public final /* synthetic */ xp X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf2(xp xpVar) {
        super(xpVar);
        this.X = xpVar;
    }

    @Override // defpackage.lc4
    public final kc4 b() {
        return this.X.b();
    }

    @Override // defpackage.xw3
    public final void c(gg2 gg2Var) {
        this.X.c(gg2Var);
    }

    @Override // defpackage.ag2
    public final View d(int i) {
        return this.X.findViewById(i);
    }

    @Override // defpackage.ag2
    public final boolean e() {
        Window window = this.X.getWindow();
        if (window != null && window.peekDecorView() != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.mc4
    public final void f(wz0 wz0Var) {
        this.X.f(wz0Var);
    }

    @Override // defpackage.mc4
    public final void g(wz0 wz0Var) {
        this.X.g(wz0Var);
    }

    @Override // defpackage.fn3
    public final rm3 getLifecycle() {
        return this.X.r0;
    }

    @Override // defpackage.au5
    public final xt5 getSavedStateRegistry() {
        return this.X.R.b;
    }

    @Override // defpackage.ab7
    public final za7 getViewModelStore() {
        return this.X.getViewModelStore();
    }

    @Override // defpackage.tc4
    public final void h(wz0 wz0Var) {
        this.X.h(wz0Var);
    }

    @Override // defpackage.sc4
    public final void i(wz0 wz0Var) {
        this.X.i(wz0Var);
    }

    @Override // defpackage.xw3
    public final void j(gg2 gg2Var) {
        this.X.j(gg2Var);
    }

    @Override // defpackage.ad4
    public final void k(wz0 wz0Var) {
        this.X.k(wz0Var);
    }

    @Override // defpackage.k9
    public final i9 l() {
        return this.X.d0;
    }

    @Override // defpackage.ad4
    public final void m(wz0 wz0Var) {
        this.X.m(wz0Var);
    }

    @Override // defpackage.tc4
    public final void n(wz0 wz0Var) {
        this.X.n(wz0Var);
    }

    @Override // defpackage.sc4
    public final void o(wz0 wz0Var) {
        this.X.o(wz0Var);
    }

    @Override // defpackage.pg2
    public final void a(o oVar) {
    }
}
