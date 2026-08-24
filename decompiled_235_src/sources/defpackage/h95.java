package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h95  reason: default package */
/* loaded from: classes.dex */
public final class h95 extends l95 {
    public final long a;
    public final long b;
    public final ic5 c;
    public final gc5 d;
    public final int e;

    public h95(long j, long j2, ic5 ic5Var, gc5 gc5Var, int i) {
        this.a = j;
        this.b = j2;
        this.c = ic5Var;
        this.d = gc5Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h95) {
                h95 h95Var = (h95) obj;
                if (this.a != h95Var.a || this.b != h95Var.b || this.c != h95Var.c || this.d != h95Var.d || this.e != h95Var.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int c = i61.c(this.b, Long.hashCode(this.a) * 31, 31);
        int hashCode = this.d.hashCode();
        return Integer.hashCode(this.e) + ((hashCode + ((this.c.hashCode() + c) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder s = xg6.s(this.a, "OnPendingSubmissionResolved(submissionSessionId=", ", nativeSubmissionId=");
        s.append(this.b);
        s.append(", submissionType=");
        s.append(this.c);
        s.append(", resolution=");
        s.append(this.d);
        s.append(", resultCode=");
        s.append(this.e);
        s.append(")");
        return s.toString();
    }
}
