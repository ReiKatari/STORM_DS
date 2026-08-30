package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zz6  reason: default package */
/* loaded from: classes.dex */
public final class zz6 implements ez6 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ dz6 L;

    public /* synthetic */ zz6(int i, dz6 dz6Var, Object obj) {
        this.A = i;
        this.B = obj;
        this.L = dz6Var;
    }

    @Override // defpackage.ez6
    public final dz6 a(qo2 qo2Var, n07 n07Var) {
        int i = this.A;
        dz6 dz6Var = this.L;
        Object obj = this.B;
        switch (i) {
            case 0:
                if (n07Var.a != ((Class) obj)) {
                    return null;
                }
                return dz6Var;
            case 1:
                Class<?> cls = n07Var.a;
                if (!((Class) obj).isAssignableFrom(cls)) {
                    return null;
                }
                return new rq0(this, cls);
            default:
                if (!n07Var.equals((n07) obj)) {
                    return null;
                }
                return dz6Var;
        }
    }

    public String toString() {
        int i = this.A;
        dz6 dz6Var = this.L;
        Object obj = this.B;
        switch (i) {
            case 0:
                return "Factory[type=" + ((Class) obj).getName() + ",adapter=" + dz6Var + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) obj).getName() + ",adapter=" + dz6Var + "]";
            default:
                return super.toString();
        }
    }
}
