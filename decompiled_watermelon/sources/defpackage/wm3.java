package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wm3  reason: default package */
/* loaded from: classes.dex */
public final class wm3 implements en3 {
    public final xm3 A;
    public final fn3 B;

    public wm3(fn3 fn3Var, xm3 xm3Var) {
        this.B = fn3Var;
        this.A = xm3Var;
    }

    @rc4(pm3.ON_DESTROY)
    public void onDestroy(fn3 fn3Var) {
        this.A.l(fn3Var);
    }

    @rc4(pm3.ON_START)
    public void onStart(fn3 fn3Var) {
        this.A.g(fn3Var);
    }

    @rc4(pm3.ON_STOP)
    public void onStop(fn3 fn3Var) {
        this.A.h(fn3Var);
    }
}
