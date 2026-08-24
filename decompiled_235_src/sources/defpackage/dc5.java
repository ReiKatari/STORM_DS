package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dc5  reason: default package */
/* loaded from: classes.dex */
public final class dc5 {
    public final long a;
    public final ic5 b;
    public final gc5 c;
    public final int d;

    public dc5(long j, ic5 ic5Var, gc5 gc5Var, int i) {
        this.a = j;
        this.b = ic5Var;
        this.c = gc5Var;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof dc5) {
                dc5 dc5Var = (dc5) obj;
                if (this.a != dc5Var.a || this.b != dc5Var.b || this.c != dc5Var.c || this.d != dc5Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return Integer.hashCode(this.d) + ((hashCode2 + ((hashCode + (Long.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RaNativePendingRetryResolution(nativeSubmissionId=" + this.a + ", submissionType=" + this.b + ", resolution=" + this.c + ", resultCode=" + this.d + ")";
    }
}
