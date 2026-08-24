package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gd5  reason: default package */
/* loaded from: classes.dex */
public final class gd5 {
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final long e;

    public gd5(long j, long j2, String str, String str2, String str3) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gd5) {
                gd5 gd5Var = (gd5) obj;
                if (!this.a.equals(gd5Var.a) || this.b != gd5Var.b || !this.c.equals(gd5Var.c) || !this.d.equals(gd5Var.d) || this.e != gd5Var.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + xg6.d(xg6.d(i61.c(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RaSubmissionContext(userId=");
        sb.append(this.a);
        sb.append(", gameId=");
        sb.append(this.b);
        i61.B(sb, ", contentHash=", this.c, ", sessionId=", this.d);
        return lb1.r(sb, ", nativeSessionId=", this.e, ")");
    }
}
