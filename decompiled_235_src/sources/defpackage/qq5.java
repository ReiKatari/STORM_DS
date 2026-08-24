package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qq5  reason: default package */
/* loaded from: classes.dex */
public final class qq5 {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;

    public qq5(int i, int i2, int i3, boolean z) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq5)) {
            return false;
        }
        qq5 qq5Var = (qq5) obj;
        if (this.a == qq5Var.a && this.b == qq5Var.b && this.c == qq5Var.c && this.d == qq5Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + lb1.a(this.c, lb1.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "RomAchievementsSummary(forHardcoreMode=" + this.a + ", totalAchievements=" + this.b + ", completedAchievements=" + this.c + ", totalPoints=" + this.d + ")";
    }
}
