package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yr0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yr0 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ ra5 B;
    public final /* synthetic */ gb5 L;
    public final /* synthetic */ long R;
    public final /* synthetic */ m37 X;

    public /* synthetic */ yr0(ra5 ra5Var, gb5 gb5Var, long j, m37 m37Var, int i) {
        this.A = i;
        this.B = ra5Var;
        this.L = gb5Var;
        this.R = j;
        this.X = m37Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        m37 m37Var = this.X;
        long j = this.R;
        gb5 gb5Var = this.L;
        ra5 ra5Var = this.B;
        switch (i) {
            case 0:
                ra5Var.J(gb5Var, j, (eb5) m37Var);
                return;
            default:
                ra5Var.I(gb5Var, j, (ih) m37Var);
                return;
        }
    }
}
