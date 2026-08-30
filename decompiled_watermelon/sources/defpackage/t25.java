package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t25  reason: default package */
/* loaded from: classes.dex */
public final class t25 {
    public final long a;
    public final y25 b;
    public final w25 c;
    public final int d;

    public t25(long j, y25 y25Var, w25 w25Var, int i) {
        this.a = j;
        this.b = y25Var;
        this.c = w25Var;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof t25) {
                t25 t25Var = (t25) obj;
                if (this.a != t25Var.a || this.b != t25Var.b || this.c != t25Var.c || this.d != t25Var.d) {
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
