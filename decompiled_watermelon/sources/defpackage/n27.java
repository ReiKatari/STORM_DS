package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n27  reason: default package */
/* loaded from: classes.dex */
public final class n27 implements re7 {
    public final re7 a;
    public final re7 b;

    public n27(re7 re7Var, re7 re7Var2) {
        this.a = re7Var;
        this.b = re7Var2;
    }

    @Override // defpackage.re7
    public final int a(od1 od1Var) {
        return Math.max(this.a.a(od1Var), this.b.a(od1Var));
    }

    @Override // defpackage.re7
    public final int b(od1 od1Var) {
        return Math.max(this.a.b(od1Var), this.b.b(od1Var));
    }

    @Override // defpackage.re7
    public final int c(od1 od1Var, sd3 sd3Var) {
        return Math.max(this.a.c(od1Var, sd3Var), this.b.c(od1Var, sd3Var));
    }

    @Override // defpackage.re7
    public final int d(od1 od1Var, sd3 sd3Var) {
        return Math.max(this.a.d(od1Var, sd3Var), this.b.d(od1Var, sd3Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n27)) {
            return false;
        }
        n27 n27Var = (n27) obj;
        if (b53.x(n27Var.a, this.a) && b53.x(n27Var.b, this.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ')';
    }
}
