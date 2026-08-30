package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class q6 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ k05 B;

    public /* synthetic */ q6(k05 k05Var, int i) {
        this.A = i;
        this.B = k05Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        m3 m3Var;
        j15 j15Var;
        int i = this.A;
        kl3 kl3Var = null;
        m3 m3Var2 = null;
        k05 k05Var = this.B;
        t3 t3Var = (t3) obj;
        switch (i) {
            case 0:
                t3Var.getClass();
                if (t3Var instanceof m3) {
                    m3Var = (m3) t3Var;
                } else {
                    m3Var = null;
                }
                if (m3Var != null) {
                    kl3Var = m3Var.a;
                }
                return Boolean.valueOf(b53.x(kl3Var, k05Var.a));
            default:
                t3Var.getClass();
                if (t3Var instanceof m3) {
                    m3Var2 = (m3) t3Var;
                }
                boolean z = false;
                if (m3Var2 != null && (j15Var = m3Var2.b) != null && j15Var.a == k05Var.b.a) {
                    z = true;
                }
                if (z) {
                    ((m3) t3Var).e.q();
                }
                return Boolean.valueOf(z);
        }
    }
}
