package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j3  reason: default package */
/* loaded from: classes.dex */
public final class j3 extends t3 {
    public final dy4 a;
    public final int b;
    public final int c;
    public final String d;
    public final os e;
    public final long f;

    public j3(dy4 dy4Var, int i, int i2, String str, os osVar, long j) {
        this.a = dy4Var;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = osVar;
        this.f = j;
    }

    @Override // defpackage.t3
    public final os a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j3) {
                j3 j3Var = (j3) obj;
                if (this.a.equals(j3Var.a) && this.b == j3Var.b && this.c == j3Var.c && this.d.equals(j3Var.d) && this.e == j3Var.e && this.f == j3Var.f) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int b = ej6.b(wh1.a(this.c, wh1.a(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
        return Long.hashCode(this.f) + ((this.e.hashCode() + b) * 31);
    }

    public final String toString() {
        return "AchievementProgress(achievement=" + this.a + ", current=" + this.b + ", target=" + this.c + ", progress=" + this.d + ", state=" + this.e + ", uiInstanceId=" + this.f + ")";
    }
}
