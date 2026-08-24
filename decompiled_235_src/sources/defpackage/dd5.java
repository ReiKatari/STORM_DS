package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dd5  reason: default package */
/* loaded from: classes.dex */
public final class dd5 {
    public final fd5 a;
    public final lc5 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final lc5 h;
    public final boolean i;

    public dd5(fd5 fd5Var, lc5 lc5Var, int i, int i2, int i3, int i4, int i5, lc5 lc5Var2, boolean z) {
        fd5Var.getClass();
        this.a = fd5Var;
        this.b = lc5Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = lc5Var2;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof dd5) {
                dd5 dd5Var = (dd5) obj;
                if (this.a != dd5Var.a || !this.b.equals(dd5Var.b) || this.c != dd5Var.c || this.d != dd5Var.d || this.e != dd5Var.e || this.f != dd5Var.f || this.g != dd5Var.g || !this.h.equals(dd5Var.h) || this.i != dd5Var.i) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int a = lb1.a(this.g, lb1.a(this.f, lb1.a(this.e, lb1.a(this.d, lb1.a(this.c, (hashCode + (this.a.hashCode() * 31)) * 31, 31), 31), 31), 31), 31);
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RaPendingSyncResult(source=");
        sb.append(this.a);
        sb.append(", before=");
        sb.append(this.b);
        sb.append(", submittedAchievements=");
        lb1.x(sb, this.c, ", submittedLeaderboardEntries=", this.d, ", alreadyAccepted=");
        lb1.x(sb, this.e, ", failedAchievements=", this.f, ", failedLeaderboardEntries=");
        sb.append(this.g);
        sb.append(", remaining=");
        sb.append(this.h);
        sb.append(", transientFailure=");
        return i61.o(sb, this.i, ")");
    }
}
