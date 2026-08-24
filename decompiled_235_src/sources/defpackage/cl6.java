package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cl6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cl6 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ el6 B;

    public /* synthetic */ cl6(el6 el6Var, int i) {
        this.A = i;
        this.B = el6Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        el6 el6Var = this.B;
        switch (i) {
            case 0:
                rj0 rj0Var = el6Var.d;
                if (rj0Var.u() instanceof sg4) {
                    rj0Var.i(ll6.Dismissed);
                }
                return Boolean.TRUE;
            default:
                rj0 rj0Var2 = el6Var.d;
                if (rj0Var2.u() instanceof sg4) {
                    rj0Var2.i(ll6.ActionPerformed);
                }
                return jg7.a;
        }
    }
}
