package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xu4  reason: default package */
/* loaded from: classes.dex */
public final class xu4 implements zu4 {
    public final gd5 a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final bd5 g;

    public xu4(gd5 gd5Var, String str, long j, long j2, long j3, long j4) {
        gd5Var.getClass();
        this.a = gd5Var;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = bd5.ACHIEVEMENT;
    }

    @Override // defpackage.zu4
    public final bd5 a() {
        return this.g;
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
            if (obj instanceof xu4) {
                xu4 xu4Var = (xu4) obj;
                if (!nb3.k(this.a, xu4Var.a) || !this.b.equals(xu4Var.b) || this.c != xu4Var.c || this.d != xu4Var.d || this.e != xu4Var.e || this.f != xu4Var.f) {
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
        return Long.hashCode(this.f) + xg6.e(i61.c(this.e, i61.c(this.d, i61.c(this.c, xg6.d(this.a.hashCode() * 31, 31, this.b), 31), 31), 31), true, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AchievementUnlock(context=");
        sb.append(this.a);
        sb.append(", submissionId=");
        sb.append(this.b);
        sb.append(", nativeSubmissionId=");
        sb.append(this.c);
        xg6.B(sb, ", sequence=", this.d, ", createdAtEpochMs=");
        sb.append(this.e);
        return lb1.r(sb, ", hardcore=true, achievementId=", this.f, ")");
    }
}
