package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class r6 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ dy4 B;
    public final /* synthetic */ l3 L;

    public /* synthetic */ r6(dy4 dy4Var, l3 l3Var, int i) {
        this.A = i;
        this.B = dy4Var;
        this.L = l3Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        dy4 dy4Var;
        dy4 dy4Var2;
        int i = this.A;
        boolean z = false;
        k3 k3Var = null;
        l3 l3Var = this.L;
        dy4 dy4Var3 = this.B;
        t3 t3Var = (t3) obj;
        switch (i) {
            case 0:
                t3Var.getClass();
                if (t3Var instanceof k3) {
                    k3Var = (k3) t3Var;
                }
                if (k3Var != null && (dy4Var = k3Var.a) != null && dy4Var.a == dy4Var3.a && k3Var.b == l3Var) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                t3Var.getClass();
                if (t3Var instanceof k3) {
                    k3Var = (k3) t3Var;
                }
                if (k3Var != null && (dy4Var2 = k3Var.a) != null && dy4Var2.a == dy4Var3.a && k3Var.b == l3Var) {
                    z = true;
                }
                if (z) {
                    k3Var.c.q();
                }
                return Boolean.valueOf(z);
        }
    }
}
