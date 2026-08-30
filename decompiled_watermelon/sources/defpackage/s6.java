package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class s6 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ o05 B;

    public /* synthetic */ s6(o05 o05Var, int i) {
        this.A = i;
        this.B = o05Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        p3 p3Var;
        p3 p3Var2;
        int i = this.A;
        kl3 kl3Var = null;
        o05 o05Var = this.B;
        t3 t3Var = (t3) obj;
        switch (i) {
            case 0:
                t3Var.getClass();
                if (t3Var instanceof p3) {
                    p3Var = (p3) t3Var;
                } else {
                    p3Var = null;
                }
                if (p3Var != null) {
                    kl3Var = p3Var.a;
                }
                return Boolean.valueOf(b53.x(kl3Var, o05Var.a));
            default:
                t3Var.getClass();
                if (t3Var instanceof p3) {
                    p3Var2 = (p3) t3Var;
                } else {
                    p3Var2 = null;
                }
                if (p3Var2 != null) {
                    kl3Var = p3Var2.a;
                }
                boolean x = b53.x(kl3Var, o05Var.a);
                if (x) {
                    p3Var2.e.q();
                }
                return Boolean.valueOf(x);
        }
    }
}
