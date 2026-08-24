package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ju0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ju0 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ jk5 B;
    public final /* synthetic */ yk5 L;
    public final /* synthetic */ long R;
    public final /* synthetic */ th X;

    public /* synthetic */ ju0(jk5 jk5Var, yk5 yk5Var, long j, th thVar, int i) {
        this.A = i;
        this.B = jk5Var;
        this.L = yk5Var;
        this.R = j;
        this.X = thVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        th thVar = this.X;
        long j = this.R;
        yk5 yk5Var = this.L;
        jk5 jk5Var = this.B;
        switch (i) {
            case 0:
                jk5Var.J(yk5Var, j, thVar);
                return;
            default:
                jk5Var.x(yk5Var, j, thVar);
                return;
        }
    }
}
