package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class r6 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ u95 B;

    public /* synthetic */ r6(u95 u95Var, int i) {
        this.A = i;
        this.B = u95Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        o3 o3Var;
        ta5 ta5Var;
        int i = this.A;
        ls3 ls3Var = null;
        o3 o3Var2 = null;
        u95 u95Var = this.B;
        v3 v3Var = (v3) obj;
        switch (i) {
            case 0:
                v3Var.getClass();
                if (v3Var instanceof o3) {
                    o3Var = (o3) v3Var;
                } else {
                    o3Var = null;
                }
                if (o3Var != null) {
                    ls3Var = o3Var.a;
                }
                return Boolean.valueOf(nb3.k(ls3Var, u95Var.a));
            default:
                v3Var.getClass();
                if (v3Var instanceof o3) {
                    o3Var2 = (o3) v3Var;
                }
                boolean z = false;
                if (o3Var2 != null && (ta5Var = o3Var2.b) != null && ta5Var.a == u95Var.b.a) {
                    z = true;
                }
                if (z) {
                    ((o3) v3Var).e.E();
                }
                return Boolean.valueOf(z);
        }
    }
}
