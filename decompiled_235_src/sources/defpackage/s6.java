package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class s6 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ o75 B;
    public final /* synthetic */ n3 L;

    public /* synthetic */ s6(o75 o75Var, n3 n3Var, int i) {
        this.A = i;
        this.B = o75Var;
        this.L = n3Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        o75 o75Var;
        o75 o75Var2;
        int i = this.A;
        boolean z = false;
        m3 m3Var = null;
        n3 n3Var = this.L;
        o75 o75Var3 = this.B;
        v3 v3Var = (v3) obj;
        switch (i) {
            case 0:
                v3Var.getClass();
                if (v3Var instanceof m3) {
                    m3Var = (m3) v3Var;
                }
                if (m3Var != null && (o75Var = m3Var.a) != null && o75Var.a == o75Var3.a && m3Var.b == n3Var) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                v3Var.getClass();
                if (v3Var instanceof m3) {
                    m3Var = (m3) v3Var;
                }
                if (m3Var != null && (o75Var2 = m3Var.a) != null && o75Var2.a == o75Var3.a && m3Var.b == n3Var) {
                    z = true;
                }
                if (z) {
                    m3Var.c.E();
                }
                return Boolean.valueOf(z);
        }
    }
}
