package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ca  reason: default package */
/* loaded from: classes.dex */
public final class ca implements re7 {
    public final re7 a;
    public final nh4 b;

    public ca(re7 re7Var, nh4 nh4Var) {
        this.a = re7Var;
        this.b = nh4Var;
    }

    @Override // defpackage.re7
    public final int a(od1 od1Var) {
        return this.b.a(od1Var) + this.a.a(od1Var);
    }

    @Override // defpackage.re7
    public final int b(od1 od1Var) {
        return this.b.b(od1Var) + this.a.b(od1Var);
    }

    @Override // defpackage.re7
    public final int c(od1 od1Var, sd3 sd3Var) {
        return this.b.c(od1Var, sd3Var) + this.a.c(od1Var, sd3Var);
    }

    @Override // defpackage.re7
    public final int d(od1 od1Var, sd3 sd3Var) {
        return this.b.d(od1Var, sd3Var) + this.a.d(od1Var, sd3Var);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ca) {
                ca caVar = (ca) obj;
                if (b53.x(caVar.a, this.a) && caVar.b.equals(this.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.b.a.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " + " + this.b + ')';
    }
}
