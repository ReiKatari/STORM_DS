package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xr0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xr0 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ ra5 B;
    public final /* synthetic */ gb5 L;

    public /* synthetic */ xr0(ra5 ra5Var, gb5 gb5Var, int i) {
        this.A = i;
        this.B = ra5Var;
        this.L = gb5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                this.B.D(this.L);
                return;
            case 1:
                this.B.x(this.L);
                return;
            default:
                this.B.C(this.L);
                return;
        }
    }
}
