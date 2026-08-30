package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ec4  reason: default package */
/* loaded from: classes.dex */
public final class ec4 extends d54 {
    public final fc4 d;
    public boolean e;

    public ec4(fc4 fc4Var, gc4 gc4Var) {
        boolean z = fc4Var.b;
        this.a = gc4Var;
        this.b = z;
        this.d = fc4Var;
        this.e = true;
    }

    @Override // defpackage.d54
    public final void a() {
        this.d.a();
    }

    @Override // defpackage.d54
    public final void b() {
        this.d.b();
    }

    @Override // defpackage.d54
    public final void c(b54 b54Var) {
        this.d.c(new ky(b54Var));
    }

    @Override // defpackage.d54
    public final void d(b54 b54Var) {
        b54Var.getClass();
        this.d.d(new ky(b54Var));
    }

    public final void g(boolean z) {
        boolean z2;
        this.e = z;
        if (z && this.d.b) {
            z2 = true;
        } else {
            z2 = false;
        }
        f(z2);
    }
}
