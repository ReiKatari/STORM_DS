package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v10  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class v10 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ qr6 B;

    public /* synthetic */ v10(qr6 qr6Var, int i) {
        this.A = i;
        this.B = qr6Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        to toVar;
        kr6 kr6Var;
        int i = this.A;
        boolean z = false;
        qr6 qr6Var = this.B;
        switch (i) {
            case 0:
                if (qr6Var != null) {
                    z = ((Boolean) new v10(qr6Var, 2).c()).booleanValue();
                }
                return Boolean.valueOf(z);
            case 1:
                if (qr6Var != null) {
                    z = ((Boolean) new v10(qr6Var, 2).c()).booleanValue();
                }
                return Boolean.valueOf(z);
            default:
                to toVar2 = qr6Var.b;
                lr6 lr6Var = (lr6) qr6Var.a.getValue();
                if (lr6Var != null && (kr6Var = lr6Var.a) != null) {
                    toVar = kr6Var.a;
                } else {
                    toVar = null;
                }
                return Boolean.valueOf(b53.x(toVar2, toVar));
        }
    }
}
