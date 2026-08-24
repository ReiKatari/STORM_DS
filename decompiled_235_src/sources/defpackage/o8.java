package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o8  reason: default package */
/* loaded from: classes.dex */
public final class o8 extends zg6 {
    public final eb a;
    public final vs4 b;
    public final vs4 c;

    public o8(eb ebVar, cf6 cf6Var, of5 of5Var) {
        this.a = ebVar;
        this.b = np2.Y(cf6Var);
        this.c = np2.Y(of5Var);
    }

    @Override // defpackage.zg6
    public final zg6 a(gf6 gf6Var, cf6 cf6Var, long j, long j2, long j3) {
        vs4 vs4Var = this.b;
        kn2.q(this.a, j, j2, j3, !nb3.k((cf6) vs4Var.getValue(), cf6Var));
        vs4Var.setValue(cf6Var);
        return this;
    }

    @Override // defpackage.zg6
    public final of5 c() {
        return (of5) this.c.getValue();
    }

    @Override // defpackage.zg6
    public final boolean d() {
        return true;
    }

    @Override // defpackage.zg6
    public final eb e() {
        return this.a;
    }

    @Override // defpackage.zg6
    public final zg6 h() {
        eb ebVar = this.a;
        kj2.b(jk4.f(((jk4) ((vs4) ebVar.X).getValue()).a, ((jk4) ((vs4) ebVar.R).getValue()).a), ((xi6) ((vs4) ebVar.B).getValue()).a);
        if6 if6Var = ((cf6) this.b.getValue()).m0;
        vs4 vs4Var = if6Var.e0;
        og6 og6Var = (og6) ((rg6) vs4Var.getValue()).b.getValue();
        rg6 rg6Var = (rg6) vs4Var.getValue();
        jk3 jk3Var = if6Var.e().b.Y;
        if (jk3Var != null) {
            qo2.S(jk3Var.m());
            og6Var.getClass();
            return rf4.a;
        }
        i.h("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
        return null;
    }

    @Override // defpackage.zg6
    public final void i(of5 of5Var) {
        this.c.setValue(of5Var);
    }

    @Override // defpackage.zg6
    public final zg6 g(cf6 cf6Var) {
        return this;
    }
}
