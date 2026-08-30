package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a07  reason: default package */
/* loaded from: classes.dex */
public final class a07 implements ez6 {
    public final /* synthetic */ Class A;
    public final /* synthetic */ Class B;
    public final /* synthetic */ dz6 L;

    public a07(Class cls, Class cls2, dz6 dz6Var) {
        this.A = cls;
        this.B = cls2;
        this.L = dz6Var;
    }

    @Override // defpackage.ez6
    public final dz6 a(qo2 qo2Var, n07 n07Var) {
        Class cls = n07Var.a;
        if (cls != this.A && cls != this.B) {
            return null;
        }
        return this.L;
    }

    public final String toString() {
        return "Factory[type=" + this.B.getName() + "+" + this.A.getName() + ",adapter=" + this.L + "]";
    }
}
