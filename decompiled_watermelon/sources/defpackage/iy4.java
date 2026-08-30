package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: iy4  reason: default package */
/* loaded from: classes.dex */
public final class iy4 {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;

    public iy4(long j, long j2, String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iy4)) {
            return false;
        }
        iy4 iy4Var = (iy4) obj;
        if (this.a == iy4Var.a && this.b == iy4Var.b && b53.x(this.c, iy4Var.c) && b53.x(this.d, iy4Var.d) && b53.x(this.e, iy4Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int c = b31.c(this.b, Long.hashCode(this.a) * 31, 31);
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.e.hashCode() + ej6.b((c + hashCode) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder q = wh1.q(this.a, "RAAchievementSetEntity(id=", ", gameId=");
        q.append(this.b);
        q.append(", title=");
        q.append(this.c);
        b31.B(q, ", type=", this.d, ", iconUrl=", this.e);
        q.append(")");
        return q.toString();
    }
}
