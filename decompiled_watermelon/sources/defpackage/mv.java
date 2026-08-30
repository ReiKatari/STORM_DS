package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mv  reason: default package */
/* loaded from: classes.dex */
public final class mv extends pv {
    public final qi4 a;
    public final m12 b;

    public mv(qi4 qi4Var, m12 m12Var) {
        this.a = qi4Var;
        this.b = m12Var;
    }

    @Override // defpackage.pv
    public final qi4 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mv) {
                mv mvVar = (mv) obj;
                if (!b53.x(this.a, mvVar.a) || !this.b.equals(mvVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        qi4 qi4Var = this.a;
        if (qi4Var == null) {
            hashCode = 0;
        } else {
            hashCode = qi4Var.hashCode();
        }
        return this.b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.a + ", result=" + this.b + ')';
    }
}
