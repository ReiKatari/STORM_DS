package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yd5  reason: default package */
/* loaded from: classes.dex */
public final class yd5 extends ae5 {
    public final dy4 a;
    public final boolean b;
    public final x15 c;
    public final boolean d;

    public yd5(dy4 dy4Var, boolean z, x15 x15Var, boolean z2) {
        this.a = dy4Var;
        this.b = z;
        this.c = x15Var;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof yd5) {
                yd5 yd5Var = (yd5) obj;
                if (!this.a.equals(yd5Var.a) || this.b != yd5Var.b || !this.c.equals(yd5Var.c) || this.d != yd5Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int c = ej6.c(this.a.hashCode() * 31, this.b, 31);
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + c) * 31);
    }

    public final String toString() {
        return "AchievementSubmission(achievement=" + this.a + ", forHardcoreMode=" + this.b + ", authentication=" + this.c + ", firstTry=" + this.d + ")";
    }
}
