package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mz1  reason: default package */
/* loaded from: classes.dex */
public final class mz1 {
    public final String a;
    public final long b;
    public final boolean c;
    public final tu0 d;

    public mz1(String str, long j, boolean z, tu0 tu0Var) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = tu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mz1) {
            mz1 mz1Var = (mz1) obj;
            if (this.a.equals(mz1Var.a) && this.b == mz1Var.b && this.c == mz1Var.c && this.d == mz1Var.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + xg6.e(i61.c(this.b, this.a.hashCode() * 31, 31), this.c, 31);
    }

    public final String toString() {
        return "HeavyShaderCompileRequest(presetName=" + this.a + ", estimatedMillis=" + this.b + ", isMeasured=" + this.c + ", response=" + this.d + ")";
    }
}
