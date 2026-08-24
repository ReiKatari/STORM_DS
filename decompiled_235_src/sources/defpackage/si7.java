package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: si7  reason: default package */
/* loaded from: classes.dex */
public final class si7 implements jk5 {
    public final /* synthetic */ wi7 A;

    public si7(wi7 wi7Var) {
        this.A = wi7Var;
    }

    @Override // defpackage.jk5
    public final void F(yk5 yk5Var, long j, wk5 wk5Var) {
        Integer num;
        if (this.A.q.a != 0 && (num = (Integer) yk5Var.b(uy6.b)) != null) {
            wi7 wi7Var = this.A;
            int intValue = num.intValue();
            synchronized (wi7Var.c) {
                pu puVar = wi7Var.f;
                int v = wk5Var.v();
                Throwable th = new Throwable("Failed in framework level".concat(" with CaptureFailure.reason = " + v));
                while (!puVar.isEmpty() && ((ti7) puVar.first()).a <= intValue) {
                    ((ti7) puVar.first()).b.v0(th);
                    gt0.X0(puVar);
                    this.A.q.a();
                }
            }
        }
    }

    @Override // defpackage.jk5
    public final void x(yk5 yk5Var, long j, th thVar) {
        Integer num;
        if (this.A.q.a != 0 && (num = (Integer) yk5Var.b(uy6.b)) != null) {
            wi7 wi7Var = this.A;
            int intValue = num.intValue();
            synchronized (wi7Var.c) {
                pu puVar = wi7Var.f;
                while (!puVar.isEmpty() && ((ti7) puVar.first()).a <= intValue) {
                    ((ti7) puVar.first()).b.b0(jg7.a);
                    gt0.X0(puVar);
                    this.A.q.a();
                }
            }
        }
    }
}
