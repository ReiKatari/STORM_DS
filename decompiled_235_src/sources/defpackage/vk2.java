package defpackage;

import android.view.View;
import android.view.Window;
import androidx.fragment.app.o;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vk2  reason: default package */
/* loaded from: classes.dex */
public final class vk2 extends cl2 implements kl4, yl4, rl4, sl4, bp7, jl4, l9, g56, ol2, l44 {
    public final /* synthetic */ jq X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk2(jq jqVar) {
        super(jqVar);
        this.X = jqVar;
    }

    @Override // defpackage.jl4
    public final il4 b() {
        return this.X.b();
    }

    @Override // defpackage.zk2
    public final View c(int i) {
        return this.X.findViewById(i);
    }

    @Override // defpackage.sl4
    public final void d(b31 b31Var) {
        this.X.d(b31Var);
    }

    @Override // defpackage.rl4
    public final void e(b31 b31Var) {
        this.X.e(b31Var);
    }

    @Override // defpackage.yl4
    public final void f(b31 b31Var) {
        this.X.f(b31Var);
    }

    @Override // defpackage.l9
    public final j9 g() {
        return this.X.e0;
    }

    @Override // defpackage.hu3
    public final ut3 getLifecycle() {
        return this.X.s0;
    }

    @Override // defpackage.g56
    public final d56 getSavedStateRegistry() {
        return this.X.R.b;
    }

    @Override // defpackage.bp7
    public final ap7 getViewModelStore() {
        return this.X.getViewModelStore();
    }

    @Override // defpackage.yl4
    public final void h(b31 b31Var) {
        this.X.h(b31Var);
    }

    @Override // defpackage.l44
    public final void i(fl2 fl2Var) {
        this.X.i(fl2Var);
    }

    @Override // defpackage.zk2
    public final boolean j() {
        Window window = this.X.getWindow();
        if (window != null && window.peekDecorView() != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.kl4
    public final void k(b31 b31Var) {
        this.X.k(b31Var);
    }

    @Override // defpackage.kl4
    public final void l(b31 b31Var) {
        this.X.l(b31Var);
    }

    @Override // defpackage.l44
    public final void m(fl2 fl2Var) {
        this.X.m(fl2Var);
    }

    @Override // defpackage.sl4
    public final void n(b31 b31Var) {
        this.X.n(b31Var);
    }

    @Override // defpackage.rl4
    public final void o(b31 b31Var) {
        this.X.o(b31Var);
    }

    @Override // defpackage.ol2
    public final void a(o oVar) {
    }
}
