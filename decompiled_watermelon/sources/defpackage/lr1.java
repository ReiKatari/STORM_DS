package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lr1  reason: default package */
/* loaded from: classes.dex */
public final class lr1 implements w92 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ct1 B;

    public /* synthetic */ lr1(ct1 ct1Var, int i) {
        this.A = i;
        this.B = ct1Var;
    }

    @Override // defpackage.w92
    public final Object b(Object obj, j11 j11Var) {
        int i = this.A;
        o27 o27Var = o27.a;
        ct1 ct1Var = this.B;
        switch (i) {
            case 0:
                r05 r05Var = (r05) obj;
                ct1Var.o = pp1.A;
                return o27Var;
            default:
                b05 b05Var = (b05) obj;
                if (b05Var instanceof fz4) {
                    ct1Var.o = tq0.Y0(ct1Var.o, new Long(((fz4) b05Var).a));
                } else if (b05Var instanceof jz4) {
                    ct1Var.o = tq0.W0(ct1Var.o, new Long(((jz4) b05Var).a));
                } else if (b05Var instanceof iz4) {
                    ct1Var.p = tq0.Y0(ct1Var.p, new vs1(((iz4) b05Var).a, n23.a.g()));
                }
                return o27Var;
        }
    }
}
