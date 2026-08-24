package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: js2  reason: default package */
/* loaded from: classes.dex */
public final class js2 extends ut3 {
    public static final js2 b = new ut3();
    public static final is2 c = new Object();

    @Override // defpackage.ut3
    public final void a(gu3 gu3Var) {
        if (gu3Var instanceof qe1) {
            qe1 qe1Var = (qe1) gu3Var;
            is2 is2Var = c;
            is2Var.getClass();
            qe1Var.onStart(is2Var);
            qe1Var.onResume(is2Var);
            return;
        }
        e41.f(gu3Var, " must implement androidx.lifecycle.DefaultLifecycleObserver.");
    }

    @Override // defpackage.ut3
    public final tt3 b() {
        return tt3.RESUMED;
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // defpackage.ut3
    public final void c(gu3 gu3Var) {
    }
}
