package defpackage;

import android.view.WindowInsets;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cu7  reason: default package */
/* loaded from: classes.dex */
public class cu7 extends iu7 {
    public final WindowInsets.Builder e;

    public cu7(vu7 vu7Var) {
        super(vu7Var);
        WindowInsets.Builder m;
        WindowInsets f = vu7Var.f();
        if (f != null) {
            m = fq7.c(f);
        } else {
            m = r74.m();
        }
        this.e = m;
    }

    @Override // defpackage.iu7
    public vu7 b() {
        WindowInsets build;
        a();
        build = this.e.build();
        vu7 g = vu7.g(null, build);
        e83[] e83VarArr = this.b;
        ru7 ru7Var = g.a;
        ru7Var.v(e83VarArr);
        ru7Var.u(null);
        ru7Var.z(this.c);
        ru7Var.A(this.d);
        return g;
    }

    @Override // defpackage.iu7
    public void e(e83 e83Var) {
        this.e.setMandatorySystemGestureInsets(e83Var.e());
    }

    @Override // defpackage.iu7
    public void f(e83 e83Var) {
        this.e.setStableInsets(e83Var.e());
    }

    @Override // defpackage.iu7
    public void g(e83 e83Var) {
        this.e.setSystemGestureInsets(e83Var.e());
    }

    @Override // defpackage.iu7
    public void h(e83 e83Var) {
        this.e.setSystemWindowInsets(e83Var.e());
    }

    @Override // defpackage.iu7
    public void i(e83 e83Var) {
        this.e.setTappableElementInsets(e83Var.e());
    }

    public cu7() {
        this.e = r74.m();
    }
}
