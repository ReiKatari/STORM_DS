package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yu4  reason: default package */
/* loaded from: classes.dex */
public final class yu4 implements zu4 {
    public final gd5 a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final int h;
    public final String i;
    public final bd5 j;

    public yu4(gd5 gd5Var, String str, long j, long j2, long j3, long j4, long j5, int i, String str2) {
        gd5Var.getClass();
        this.a = gd5Var;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = i;
        this.i = str2;
        this.j = bd5.LEADERBOARD;
    }

    @Override // defpackage.zu4
    public final bd5 a() {
        return this.j;
    }

    @Override // defpackage.zu4
    public final gd5 b() {
        return this.a;
    }

    @Override // defpackage.zu4
    public final String c() {
        return this.b;
    }

    @Override // defpackage.zu4
    public final long d() {
        return this.d;
    }

    @Override // defpackage.zu4
    public final long e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof yu4) {
                yu4 yu4Var = (yu4) obj;
                if (!nb3.k(this.a, yu4Var.a) || !this.b.equals(yu4Var.b) || this.c != yu4Var.c || this.d != yu4Var.d || this.e != yu4Var.e || this.f != yu4Var.f || this.g != yu4Var.g || this.h != yu4Var.h || !this.i.equals(yu4Var.i)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.zu4
    public final long f() {
        return this.e;
    }

    public final int hashCode() {
        return this.i.hashCode() + lb1.a(this.h, i61.c(this.g, i61.c(this.f, xg6.e(i61.c(this.e, i61.c(this.d, i61.c(this.c, xg6.d(this.a.hashCode() * 31, 31, this.b), 31), 31), 31), true, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeaderboardEntry(context=");
        sb.append(this.a);
        sb.append(", submissionId=");
        sb.append(this.b);
        sb.append(", nativeSubmissionId=");
        sb.append(this.c);
        xg6.B(sb, ", sequence=", this.d, ", createdAtEpochMs=");
        sb.append(this.e);
        xg6.B(sb, ", hardcore=true, leaderboardId=", this.f, ", attemptId=");
        sb.append(this.g);
        sb.append(", rawScore=");
        sb.append(this.h);
        sb.append(", formattedScore=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }
}
