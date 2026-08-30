package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w35  reason: default package */
/* loaded from: classes.dex */
public final class w35 {
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final long e;

    public w35(long j, long j2, String str, String str2, String str3) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w35) {
                w35 w35Var = (w35) obj;
                if (!this.a.equals(w35Var.a) || this.b != w35Var.b || !this.c.equals(w35Var.c) || !this.d.equals(w35Var.d) || this.e != w35Var.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + ej6.b(ej6.b(b31.c(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RaSubmissionContext(userId=");
        sb.append(this.a);
        sb.append(", gameId=");
        sb.append(this.b);
        b31.B(sb, ", contentHash=", this.c, ", sessionId=", this.d);
        return wh1.p(sb, ", nativeSessionId=", this.e, ")");
    }
}
