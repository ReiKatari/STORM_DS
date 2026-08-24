package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: of1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class of1 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ bw6 B;

    public /* synthetic */ of1(bw6 bw6Var, int i) {
        this.A = i;
        this.B = bw6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        bw6 bw6Var = this.B;
        switch (i) {
            case 0:
                bw6Var.b();
                return;
            default:
                bw6Var.e.cancel(true);
                return;
        }
    }
}
