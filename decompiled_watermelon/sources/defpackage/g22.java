package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g22  reason: default package */
/* loaded from: classes.dex */
public final class g22 implements re7 {
    public final re7 a;
    public final re7 b;

    public g22(re7 re7Var, re7 re7Var2) {
        this.a = re7Var;
        this.b = re7Var2;
    }

    @Override // defpackage.re7
    public final int a(od1 od1Var) {
        int a = this.a.a(od1Var) - this.b.a(od1Var);
        if (a < 0) {
            return 0;
        }
        return a;
    }

    @Override // defpackage.re7
    public final int b(od1 od1Var) {
        int b = this.a.b(od1Var) - this.b.b(od1Var);
        if (b < 0) {
            return 0;
        }
        return b;
    }

    @Override // defpackage.re7
    public final int c(od1 od1Var, sd3 sd3Var) {
        int c = this.a.c(od1Var, sd3Var) - this.b.c(od1Var, sd3Var);
        if (c < 0) {
            return 0;
        }
        return c;
    }

    @Override // defpackage.re7
    public final int d(od1 od1Var, sd3 sd3Var) {
        int d = this.a.d(od1Var, sd3Var) - this.b.d(od1Var, sd3Var);
        if (d < 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g22)) {
            return false;
        }
        g22 g22Var = (g22) obj;
        if (b53.x(g22Var.a, this.a) && b53.x(g22Var.b, this.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ')';
    }
}
