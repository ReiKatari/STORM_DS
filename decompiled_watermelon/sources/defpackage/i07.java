package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i07  reason: default package */
/* loaded from: classes.dex */
public final class i07 extends dz6 {
    public final /* synthetic */ int a;
    public final boolean b;

    public /* synthetic */ i07(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.dz6
    public final Object b(o83 o83Var) {
        switch (this.a) {
            case 0:
                if (o83Var.n0() == q83.NULL) {
                    o83Var.j0();
                    return null;
                }
                return Double.valueOf(o83Var.R());
            default:
                if (o83Var.n0() == q83.NULL) {
                    o83Var.j0();
                    return null;
                }
                return Float.valueOf((float) o83Var.R());
        }
    }

    @Override // defpackage.dz6
    public final void c(b93 b93Var, Object obj) {
        int i = this.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                Number number = (Number) obj;
                if (number == null) {
                    b93Var.F();
                    return;
                }
                double doubleValue = number.doubleValue();
                if (z) {
                    k07.a(doubleValue);
                }
                b93Var.Q(doubleValue);
                return;
            default:
                Number number2 = (Number) obj;
                if (number2 == null) {
                    b93Var.F();
                    return;
                }
                float floatValue = number2.floatValue();
                if (z) {
                    k07.a(floatValue);
                }
                if (!(number2 instanceof Float)) {
                    number2 = Float.valueOf(floatValue);
                }
                b93Var.V(number2);
                return;
        }
    }
}
