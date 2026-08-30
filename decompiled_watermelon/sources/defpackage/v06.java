package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v06  reason: default package */
/* loaded from: classes.dex */
public final class v06 implements Runnable {
    public final in3 A;
    public final pm3 B;
    public boolean L;

    public v06(in3 in3Var, pm3 pm3Var) {
        in3Var.getClass();
        pm3Var.getClass();
        this.A = in3Var;
        this.B = pm3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.L) {
            this.A.f(this.B);
            this.L = true;
        }
    }
}
