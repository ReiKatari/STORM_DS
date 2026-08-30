package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hn3  reason: default package */
/* loaded from: classes.dex */
public final class hn3 {
    public qm3 a;
    public dn3 b;

    public final void a(fn3 fn3Var, pm3 pm3Var) {
        qm3 targetState = pm3Var.getTargetState();
        qm3 qm3Var = this.a;
        qm3Var.getClass();
        if (targetState != null && targetState.compareTo(qm3Var) < 0) {
            qm3Var = targetState;
        }
        this.a = qm3Var;
        this.b.d(fn3Var, pm3Var);
        this.a = targetState;
    }
}
