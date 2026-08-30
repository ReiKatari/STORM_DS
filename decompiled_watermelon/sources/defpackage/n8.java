package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n8  reason: default package */
/* loaded from: classes.dex */
public final class n8 extends m56 {
    public final q9 a;
    public final tj4 b;
    public final tj4 c;

    public n8(q9 q9Var, q36 q36Var, y55 y55Var) {
        this.a = q9Var;
        this.b = me2.G(q36Var);
        this.c = me2.G(y55Var);
    }

    @Override // defpackage.m56
    public final m56 a(u36 u36Var, q36 q36Var, long j, long j2, long j3) {
        tj4 tj4Var = this.b;
        sn2.i(this.a, j, j2, j3, !b53.x((q36) tj4Var.getValue(), q36Var));
        tj4Var.setValue(q36Var);
        return this;
    }

    @Override // defpackage.m56
    public final y55 c() {
        return (y55) this.c.getValue();
    }

    @Override // defpackage.m56
    public final boolean d() {
        return true;
    }

    @Override // defpackage.m56
    public final q9 e() {
        return this.a;
    }

    @Override // defpackage.m56
    public final m56 h() {
        q9 q9Var = this.a;
        yf2.b(mb4.e(((mb4) ((tj4) q9Var.X).getValue()).a, ((mb4) ((tj4) q9Var.R).getValue()).a), ((i76) ((tj4) q9Var.B).getValue()).a);
        w36 w36Var = ((q36) this.b.getValue()).l0;
        tj4 tj4Var = w36Var.d0;
        c56 c56Var = (c56) ((f56) tj4Var.getValue()).b.getValue();
        f56 f56Var = (f56) tj4Var.getValue();
        rd3 rd3Var = w36Var.e().b.Y;
        if (rd3Var != null) {
            hk2.U(rd3Var.O());
            c56Var.getClass();
            return c74.a;
        }
        i.i("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
        return null;
    }

    @Override // defpackage.m56
    public final void i(y55 y55Var) {
        this.c.setValue(y55Var);
    }

    @Override // defpackage.m56
    public final m56 g(q36 q36Var) {
        return this;
    }
}
