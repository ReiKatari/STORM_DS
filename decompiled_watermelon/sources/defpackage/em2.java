package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: em2  reason: default package */
/* loaded from: classes.dex */
public final class em2 extends rm3 {
    public static final em2 b = new rm3();
    public static final dm2 c = new Object();

    @Override // defpackage.rm3
    public final void a(en3 en3Var) {
        if (en3Var instanceof ua1) {
            ua1 ua1Var = (ua1) en3Var;
            dm2 dm2Var = c;
            dm2Var.getClass();
            ua1Var.onStart(dm2Var);
            ua1Var.onResume(dm2Var);
            return;
        }
        f81.g(en3Var, " must implement androidx.lifecycle.DefaultLifecycleObserver.");
    }

    @Override // defpackage.rm3
    public final qm3 b() {
        return qm3.RESUMED;
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // defpackage.rm3
    public final void c(en3 en3Var) {
    }
}
