package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cy6  reason: default package */
/* loaded from: classes.dex */
public final class cy6 implements ez6 {
    public final n07 A;
    public final boolean B;
    public final Class L;
    public final p83 R;
    public final i73 X;

    public cy6(Object obj, n07 n07Var, boolean z, Class cls) {
        this.R = (p83) obj;
        this.X = (i73) obj;
        this.A = n07Var;
        this.B = z;
        this.L = cls;
    }

    @Override // defpackage.ez6
    public final dz6 a(qo2 qo2Var, n07 n07Var) {
        boolean isAssignableFrom;
        n07 n07Var2 = this.A;
        if (n07Var2 != null) {
            if (!n07Var2.equals(n07Var) && (!this.B || n07Var2.b != n07Var.a)) {
                isAssignableFrom = false;
            } else {
                isAssignableFrom = true;
            }
        } else {
            isAssignableFrom = this.L.isAssignableFrom(n07Var.a);
        }
        if (isAssignableFrom) {
            return new dy6(this.R, this.X, qo2Var, n07Var, this, true);
        }
        return null;
    }
}
