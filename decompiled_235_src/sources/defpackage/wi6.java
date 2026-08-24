package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wi6  reason: default package */
/* loaded from: classes.dex */
public final class wi6 {
    public static final wi6 c;
    public final ge7 a;
    public final ge7 b;

    static {
        qj1 qj1Var = qj1.m;
        c = new wi6(qj1Var, qj1Var);
    }

    public wi6(ge7 ge7Var, ge7 ge7Var2) {
        this.a = ge7Var;
        this.b = ge7Var2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wi6) {
                wi6 wi6Var = (wi6) obj;
                if (!this.a.equals(wi6Var.a) || !this.b.equals(wi6Var.b)) {
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
