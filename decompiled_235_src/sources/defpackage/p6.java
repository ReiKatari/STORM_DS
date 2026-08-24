package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class p6 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ o3 B;
    public final /* synthetic */ n3 L;

    public /* synthetic */ p6(o3 o3Var, n3 n3Var, int i) {
        this.A = i;
        this.B = o3Var;
        this.L = n3Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        p3 p3Var;
        p3 p3Var2;
        int i = this.A;
        boolean z = false;
        ls3 ls3Var = null;
        n3 n3Var = this.L;
        o3 o3Var = this.B;
        v3 v3Var = (v3) obj;
        switch (i) {
            case 0:
                v3Var.getClass();
                if (v3Var instanceof p3) {
                    p3Var = (p3) v3Var;
                } else {
                    p3Var = null;
                }
                if (p3Var != null) {
                    ls3Var = p3Var.a;
                }
                if (nb3.k(ls3Var, o3Var.a) && p3Var.e == n3Var) {
                    z = true;
                }
                if (z) {
                    p3Var.f.E();
                }
                return Boolean.valueOf(z);
            default:
                v3Var.getClass();
                if (v3Var instanceof p3) {
                    p3Var2 = (p3) v3Var;
                } else {
                    p3Var2 = null;
                }
                if (p3Var2 != null) {
                    ls3Var = p3Var2.a;
                }
                if (nb3.k(ls3Var, o3Var.a) && p3Var2.e == n3Var) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
