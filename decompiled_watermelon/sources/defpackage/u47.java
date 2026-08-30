package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u47  reason: default package */
/* loaded from: classes.dex */
public final class u47 implements ra5 {
    public final /* synthetic */ y47 A;

    public u47(y47 y47Var) {
        this.A = y47Var;
    }

    @Override // defpackage.ra5
    public final void J(gb5 gb5Var, long j, eb5 eb5Var) {
        Integer num;
        if (this.A.q.a != 0 && (num = (Integer) gb5Var.b(km6.b)) != null) {
            y47 y47Var = this.A;
            int intValue = num.intValue();
            synchronized (y47Var.c) {
                xt xtVar = y47Var.f;
                int K = eb5Var.K();
                Throwable th = new Throwable("Failed in framework level".concat(" with CaptureFailure.reason = " + K));
                while (!xtVar.isEmpty() && ((v47) xtVar.first()).a <= intValue) {
                    ((v47) xtVar.first()).b.v0(th);
                    tq0.a1(xtVar);
                    this.A.q.a();
                }
            }
        }
    }

    @Override // defpackage.ra5
    public final void i(gb5 gb5Var, long j, hh hhVar) {
        Integer num;
        if (this.A.q.a != 0 && (num = (Integer) gb5Var.b(km6.b)) != null) {
            y47 y47Var = this.A;
            int intValue = num.intValue();
            synchronized (y47Var.c) {
                xt xtVar = y47Var.f;
                while (!xtVar.isEmpty() && ((v47) xtVar.first()).a <= intValue) {
                    ((v47) xtVar.first()).b.c0(o27.a);
                    tq0.a1(xtVar);
                    this.A.q.a();
                }
            }
        }
    }
}
