package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cl4  reason: default package */
/* loaded from: classes.dex */
public final class cl4 extends jd4 {
    public final dl4 d;
    public boolean e;

    public cl4(dl4 dl4Var, el4 el4Var) {
        boolean z = dl4Var.b;
        this.a = el4Var;
        this.b = z;
        this.d = dl4Var;
        this.e = true;
    }

    @Override // defpackage.jd4
    public final void a() {
        this.d.a();
    }

    @Override // defpackage.jd4
    public final void b() {
        this.d.b();
    }

    @Override // defpackage.jd4
    public final void c(hd4 hd4Var) {
        this.d.c(new b00(hd4Var));
    }

    @Override // defpackage.jd4
    public final void d(hd4 hd4Var) {
        hd4Var.getClass();
        this.d.d(new b00(hd4Var));
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
