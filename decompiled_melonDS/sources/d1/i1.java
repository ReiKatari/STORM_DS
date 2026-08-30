package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class i1 implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ q1 B;

    public /* synthetic */ i1(q1 q1Var, int i2) {
        this.A = i2;
        this.B = q1Var;
    }

    @Override // mc.a
    public final Object b() {
        boolean z10;
        switch (this.A) {
            case 0:
                q1 q1Var = this.B;
                if (nc.k.a(q1Var.f3652d.getValue(), q1Var.f3649a.c()) && q1Var.f3655g.g() == Long.MIN_VALUE && !((Boolean) q1Var.f3656h.getValue()).booleanValue()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            default:
                return Long.valueOf(this.B.b());
        }
    }
}
