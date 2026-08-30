package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u10  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class u10 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ qr6 B;
    public final /* synthetic */ mi2 L;

    public /* synthetic */ u10(qr6 qr6Var, mi2 mi2Var, int i) {
        this.A = i;
        this.B = qr6Var;
        this.L = mi2Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.A;
        mi2 mi2Var = this.L;
        qr6 qr6Var = this.B;
        switch (i) {
            case 0:
                lr6 lr6Var = (lr6) obj;
                if (qr6Var != null) {
                    qr6Var.a.setValue(lr6Var);
                }
                if (mi2Var != null) {
                    mi2Var.n(lr6Var);
                }
                return o27.a;
            default:
                ch1 ch1Var = (ch1) obj;
                qr6Var.c.add(mi2Var);
                return new sy(7, qr6Var, mi2Var);
        }
    }
}
