package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vs3  reason: default package */
/* loaded from: classes.dex */
public final class vs3 {
    public final long a;
    public final int b;
    public final String c;

    public vs3(String str, int i, long j) {
        this.a = j;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vs3) {
                vs3 vs3Var = (vs3) obj;
                if (this.a != vs3Var.a || this.b != vs3Var.b || !this.c.equals(vs3Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + lb1.a(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "SubmitLegacy(leaderboardId=" + this.a + ", value=" + this.b + ", formattedValue=" + this.c + ")";
    }
}
