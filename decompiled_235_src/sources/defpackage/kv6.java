package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kv6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kv6 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ qv6 B;

    public /* synthetic */ kv6(qv6 qv6Var, int i) {
        this.A = i;
        this.B = qv6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        qv6 qv6Var = this.B;
        switch (i) {
            case 0:
                u24.x().execute(new kv6(qv6Var, 1));
                return;
            default:
                if (!qv6Var.n) {
                    qv6Var.d();
                    return;
                }
                return;
        }
    }
}
