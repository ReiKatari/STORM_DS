package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class o6 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ m3 B;
    public final /* synthetic */ l3 L;

    public /* synthetic */ o6(m3 m3Var, l3 l3Var, int i) {
        this.A = i;
        this.B = m3Var;
        this.L = l3Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        n3 n3Var;
        n3 n3Var2;
        int i = this.A;
        boolean z = false;
        kl3 kl3Var = null;
        l3 l3Var = this.L;
        m3 m3Var = this.B;
        t3 t3Var = (t3) obj;
        switch (i) {
            case 0:
                t3Var.getClass();
                if (t3Var instanceof n3) {
                    n3Var = (n3) t3Var;
                } else {
                    n3Var = null;
                }
                if (n3Var != null) {
                    kl3Var = n3Var.a;
                }
                if (b53.x(kl3Var, m3Var.a) && n3Var.e == l3Var) {
                    z = true;
                }
                if (z) {
                    n3Var.f.q();
                }
                return Boolean.valueOf(z);
            default:
                t3Var.getClass();
                if (t3Var instanceof n3) {
                    n3Var2 = (n3) t3Var;
                } else {
                    n3Var2 = null;
                }
                if (n3Var2 != null) {
                    kl3Var = n3Var2.a;
                }
                if (b53.x(kl3Var, m3Var.a) && n3Var2.e == l3Var) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
