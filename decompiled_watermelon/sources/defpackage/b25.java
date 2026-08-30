package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b25  reason: default package */
/* loaded from: classes.dex */
public final class b25 {
    public final String a;
    public final long b;
    public final long c;

    public b25(String str, long j, long j2) {
        str.getClass();
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b25)) {
            return false;
        }
        b25 b25Var = (b25) obj;
        if (b53.x(this.a, b25Var.a) && this.b == b25Var.b && this.c == b25Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + b31.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RAUserProfile(username=");
        sb.append(this.a);
        sb.append(", score=");
        sb.append(this.b);
        return wh1.p(sb, ", softcoreScore=", this.c, ")");
    }
}
