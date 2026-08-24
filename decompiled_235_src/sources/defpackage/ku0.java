package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ku0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ku0 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ jk5 B;
    public final /* synthetic */ yk5 L;

    public /* synthetic */ ku0(jk5 jk5Var, yk5 yk5Var, int i) {
        this.A = i;
        this.B = jk5Var;
        this.L = yk5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                this.B.r(this.L);
                return;
            case 1:
                this.B.k(this.L);
                return;
            default:
                this.B.A(this.L);
                return;
        }
    }
}
