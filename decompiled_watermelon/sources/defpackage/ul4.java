package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ul4  reason: default package */
/* loaded from: classes.dex */
public final class ul4 implements wl4 {
    public final w35 a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final r35 g;

    public ul4(w35 w35Var, String str, long j, long j2, long j3, long j4) {
        w35Var.getClass();
        this.a = w35Var;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = r35.ACHIEVEMENT;
    }

    @Override // defpackage.wl4
    public final w35 a() {
        return this.a;
    }

    @Override // defpackage.wl4
    public final r35 b() {
        return this.g;
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
            if (obj instanceof ul4) {
                ul4 ul4Var = (ul4) obj;
                if (!b53.x(this.a, ul4Var.a) || !this.b.equals(ul4Var.b) || this.c != ul4Var.c || this.d != ul4Var.d || this.e != ul4Var.e || this.f != ul4Var.f) {
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
        return Long.hashCode(this.f) + ej6.c(b31.c(this.e, b31.c(this.d, b31.c(this.c, ej6.b(this.a.hashCode() * 31, 31, this.b), 31), 31), 31), true, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AchievementUnlock(context=");
        sb.append(this.a);
        sb.append(", submissionId=");
        sb.append(this.b);
        sb.append(", nativeSubmissionId=");
        sb.append(this.c);
        ej6.k(sb, ", sequence=", this.d, ", createdAtEpochMs=");
        sb.append(this.e);
        return wh1.p(sb, ", hardcore=true, achievementId=", this.f, ")");
    }
}
