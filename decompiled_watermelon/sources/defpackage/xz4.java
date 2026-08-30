package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xz4  reason: default package */
/* loaded from: classes.dex */
public final class xz4 extends b05 {
    public final long a;
    public final long b;
    public final y25 c;
    public final w25 d;
    public final int e;

    public xz4(long j, long j2, y25 y25Var, w25 w25Var, int i) {
        this.a = j;
        this.b = j2;
        this.c = y25Var;
        this.d = w25Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xz4) {
                xz4 xz4Var = (xz4) obj;
                if (this.a != xz4Var.a || this.b != xz4Var.b || this.c != xz4Var.c || this.d != xz4Var.d || this.e != xz4Var.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int c = b31.c(this.b, Long.hashCode(this.a) * 31, 31);
        int hashCode = this.d.hashCode();
        return Integer.hashCode(this.e) + ((hashCode + ((this.c.hashCode() + c) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder q = wh1.q(this.a, "OnPendingSubmissionResolved(submissionSessionId=", ", nativeSubmissionId=");
        q.append(this.b);
        q.append(", submissionType=");
        q.append(this.c);
        q.append(", resolution=");
        q.append(this.d);
        q.append(", resultCode=");
        q.append(this.e);
        q.append(")");
        return q.toString();
    }
}
