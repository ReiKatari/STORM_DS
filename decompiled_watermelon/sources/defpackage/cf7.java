package defpackage;

import android.view.WindowInsets;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cf7  reason: default package */
/* loaded from: classes.dex */
public class cf7 extends if7 {
    public final WindowInsets.Builder e;

    public cf7(vf7 vf7Var) {
        super(vf7Var);
        WindowInsets.Builder k;
        WindowInsets f = vf7Var.f();
        if (f != null) {
            k = bf7.c(f);
        } else {
            k = zq4.k();
        }
        this.e = k;
    }

    @Override // defpackage.if7
    public vf7 b() {
        WindowInsets build;
        a();
        build = this.e.build();
        vf7 g = vf7.g(null, build);
        x13[] x13VarArr = this.b;
        rf7 rf7Var = g.a;
        rf7Var.v(x13VarArr);
        rf7Var.u(null);
        rf7Var.z(this.c);
        rf7Var.A(this.d);
        return g;
    }

    @Override // defpackage.if7
    public void e(x13 x13Var) {
        this.e.setMandatorySystemGestureInsets(x13Var.e());
    }

    @Override // defpackage.if7
    public void f(x13 x13Var) {
        this.e.setStableInsets(x13Var.e());
    }

    @Override // defpackage.if7
    public void g(x13 x13Var) {
        this.e.setSystemGestureInsets(x13Var.e());
    }

    @Override // defpackage.if7
    public void h(x13 x13Var) {
        this.e.setSystemWindowInsets(x13Var.e());
    }

    @Override // defpackage.if7
    public void i(x13 x13Var) {
        this.e.setTappableElementInsets(x13Var.e());
    }

    public cf7() {
        this.e = zq4.k();
    }
}
