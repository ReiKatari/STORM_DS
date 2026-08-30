package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h76  reason: default package */
/* loaded from: classes.dex */
public final class h76 {
    public static final h76 c;
    public final ct3 a;
    public final ct3 b;

    static {
        mf1 mf1Var = mf1.o0;
        c = new h76(mf1Var, mf1Var);
    }

    public h76(ct3 ct3Var, ct3 ct3Var2) {
        this.a = ct3Var;
        this.b = ct3Var2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h76) {
                h76 h76Var = (h76) obj;
                if (!this.a.equals(h76Var.a) || !this.b.equals(h76Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ')';
    }
}
