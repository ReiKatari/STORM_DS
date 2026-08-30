package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sg5  reason: default package */
/* loaded from: classes.dex */
public final class sg5 {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;

    public sg5(int i, int i2, int i3, boolean z) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg5)) {
            return false;
        }
        sg5 sg5Var = (sg5) obj;
        if (this.a == sg5Var.a && this.b == sg5Var.b && this.c == sg5Var.c && this.d == sg5Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + wh1.a(this.c, wh1.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "RomAchievementsSummary(forHardcoreMode=" + this.a + ", totalAchievements=" + this.b + ", completedAchievements=" + this.c + ", totalPoints=" + this.d + ")";
    }
}
