package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l3  reason: default package */
/* loaded from: classes.dex */
public final class l3 extends v3 {
    public final o75 a;
    public final int b;
    public final int c;
    public final String d;
    public final bt e;
    public final long f;

    public l3(o75 o75Var, int i, int i2, String str, bt btVar, long j) {
        this.a = o75Var;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = btVar;
        this.f = j;
    }

    @Override // defpackage.v3
    public final bt a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l3) {
                l3 l3Var = (l3) obj;
                if (this.a.equals(l3Var.a) && this.b == l3Var.b && this.c == l3Var.c && this.d.equals(l3Var.d) && this.e == l3Var.e && this.f == l3Var.f) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int d = xg6.d(lb1.a(this.c, lb1.a(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
        return Long.hashCode(this.f) + ((this.e.hashCode() + d) * 31);
    }

    public final String toString() {
        return "AchievementProgress(achievement=" + this.a + ", current=" + this.b + ", target=" + this.c + ", progress=" + this.d + ", state=" + this.e + ", uiInstanceId=" + this.f + ")";
    }
}
