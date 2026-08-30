package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lc5  reason: default package */
/* loaded from: classes.dex */
public final class lc5 {
    public final int a;
    public final ih b;

    public lc5(int i, ih ihVar) {
        this.a = i;
        this.b = ihVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lc5) {
                lc5 lc5Var = (lc5) obj;
                if (this.a == lc5Var.a && b53.x(this.b, lc5Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.a) * 31;
        ih ihVar = this.b;
        if (ihVar == null) {
            hashCode = 0;
        } else {
            hashCode = ihVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Result3A(status=" + ((Object) ("Status(value=" + this.a + ')')) + ", frameMetadata=" + this.b + ')';
    }
}
