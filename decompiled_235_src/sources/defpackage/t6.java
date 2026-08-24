package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class t6 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ y95 B;

    public /* synthetic */ t6(y95 y95Var, int i) {
        this.A = i;
        this.B = y95Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        r3 r3Var;
        r3 r3Var2;
        int i = this.A;
        ls3 ls3Var = null;
        y95 y95Var = this.B;
        v3 v3Var = (v3) obj;
        switch (i) {
            case 0:
                v3Var.getClass();
                if (v3Var instanceof r3) {
                    r3Var = (r3) v3Var;
                } else {
                    r3Var = null;
                }
                if (r3Var != null) {
                    ls3Var = r3Var.a;
                }
                return Boolean.valueOf(nb3.k(ls3Var, y95Var.a));
            default:
                v3Var.getClass();
                if (v3Var instanceof r3) {
                    r3Var2 = (r3) v3Var;
                } else {
                    r3Var2 = null;
                }
                if (r3Var2 != null) {
                    ls3Var = r3Var2.a;
                }
                boolean k = nb3.k(ls3Var, y95Var.a);
                if (k) {
                    r3Var2.e.E();
                }
                return Boolean.valueOf(k);
        }
    }
}
