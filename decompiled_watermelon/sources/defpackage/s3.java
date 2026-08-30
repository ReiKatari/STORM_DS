package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s3  reason: default package */
/* loaded from: classes.dex */
public final class s3 extends t3 {
    public final se a;
    public final boolean b;
    public final os c;
    public final long d;

    public s3(se seVar, boolean z, os osVar, long j) {
        this.a = seVar;
        this.b = z;
        this.c = osVar;
        this.d = j;
    }

    @Override // defpackage.t3
    public final os a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof s3) {
                s3 s3Var = (s3) obj;
                if (this.a.equals(s3Var.a) && this.b == s3Var.b && this.c == s3Var.c && this.d == s3Var.d) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int c = ej6.c(this.a.hashCode() * 31, this.b, 31);
        return Long.hashCode(this.d) + ((this.c.hashCode() + c) * 31);
    }

    public final String toString() {
        return "ServerCommunicationFailed(source=" + this.a + ", willRetryInBackground=" + this.b + ", state=" + this.c + ", uiInstanceId=" + this.d + ")";
    }
}
