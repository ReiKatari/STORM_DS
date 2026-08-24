package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lu0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class lu0 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ jk5 B;
    public final /* synthetic */ yk5 L;
    public final /* synthetic */ long R;
    public final /* synthetic */ hh7 X;

    public /* synthetic */ lu0(jk5 jk5Var, yk5 yk5Var, long j, hh7 hh7Var, int i) {
        this.A = i;
        this.B = jk5Var;
        this.L = yk5Var;
        this.R = j;
        this.X = hh7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        hh7 hh7Var = this.X;
        long j = this.R;
        yk5 yk5Var = this.L;
        jk5 jk5Var = this.B;
        switch (i) {
            case 0:
                jk5Var.F(yk5Var, j, (wk5) hh7Var);
                return;
            default:
                jk5Var.D(yk5Var, j, (uh) hh7Var);
                return;
        }
    }
}
