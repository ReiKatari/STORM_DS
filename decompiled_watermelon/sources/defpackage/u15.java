package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u15  reason: default package */
/* loaded from: classes.dex */
public final class u15 {
    public final dy4 a;
    public final boolean b;
    public final boolean c;

    public u15(dy4 dy4Var, boolean z, boolean z2) {
        this.a = dy4Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u15) {
                u15 u15Var = (u15) obj;
                if (!this.a.equals(u15Var.a) || this.b != u15Var.b || this.c != u15Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ej6.c(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return "RAUserAchievement(achievement=" + this.a + ", isUnlocked=" + this.b + ", forHardcoreMode=" + this.c + ")";
    }
}
