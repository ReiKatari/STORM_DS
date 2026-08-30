package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bv1  reason: default package */
/* loaded from: classes.dex */
public final class bv1 {
    public final String a;
    public final long b;
    public final boolean c;
    public final gs0 d;

    public bv1(String str, long j, boolean z, gs0 gs0Var) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = gs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bv1) {
            bv1 bv1Var = (bv1) obj;
            if (this.a.equals(bv1Var.a) && this.b == bv1Var.b && this.c == bv1Var.c && this.d == bv1Var.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ej6.c(b31.c(this.b, this.a.hashCode() * 31, 31), this.c, 31);
    }

    public final String toString() {
        return "HeavyShaderCompileRequest(presetName=" + this.a + ", estimatedMillis=" + this.b + ", isMeasured=" + this.c + ", response=" + this.d + ")";
    }
}
