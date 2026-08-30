package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mt6  reason: default package */
/* loaded from: classes.dex */
public final class mt6 extends fv5 implements Runnable {
    public final long Z;

    public mt6(long j, k11 k11Var) {
        super(k11Var, k11Var.a());
        this.Z = j;
    }

    @Override // defpackage.p63
    public final String e0() {
        return super.e0() + "(timeMillis=" + this.Z + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        dk7.x(this.X);
        t(new lt6("Timed out waiting for " + this.Z + " ms", this));
    }
}
