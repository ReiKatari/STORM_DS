package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vl4  reason: default package */
/* loaded from: classes.dex */
public final class vl4 implements wl4 {
    public final w35 a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final int h;
    public final String i;
    public final r35 j;

    public vl4(w35 w35Var, String str, long j, long j2, long j3, long j4, long j5, int i, String str2) {
        w35Var.getClass();
        this.a = w35Var;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = i;
        this.i = str2;
        this.j = r35.LEADERBOARD;
    }

    @Override // defpackage.wl4
    public final w35 a() {
        return this.a;
    }

    @Override // defpackage.wl4
    public final r35 b() {
        return this.j;
    }

    @Override // defpackage.wl4
    public final long c() {
        return this.d;
    }

    @Override // defpackage.wl4
    public final long d() {
        return this.c;
    }

    @Override // defpackage.wl4
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vl4) {
                vl4 vl4Var = (vl4) obj;
                if (!b53.x(this.a, vl4Var.a) || !this.b.equals(vl4Var.b) || this.c != vl4Var.c || this.d != vl4Var.d || this.e != vl4Var.e || this.f != vl4Var.f || this.g != vl4Var.g || this.h != vl4Var.h || !this.i.equals(vl4Var.i)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.wl4
    public final long f() {
        return this.e;
    }

    public final int hashCode() {
        return this.i.hashCode() + wh1.a(this.h, b31.c(this.g, b31.c(this.f, ej6.c(b31.c(this.e, b31.c(this.d, b31.c(this.c, ej6.b(this.a.hashCode() * 31, 31, this.b), 31), 31), 31), true, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeaderboardEntry(context=");
        sb.append(this.a);
        sb.append(", submissionId=");
        sb.append(this.b);
        sb.append(", nativeSubmissionId=");
        sb.append(this.c);
        ej6.k(sb, ", sequence=", this.d, ", createdAtEpochMs=");
        sb.append(this.e);
        ej6.k(sb, ", hardcore=true, leaderboardId=", this.f, ", attemptId=");
        sb.append(this.g);
        sb.append(", rawScore=");
        sb.append(this.h);
        sb.append(", formattedScore=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }
}
