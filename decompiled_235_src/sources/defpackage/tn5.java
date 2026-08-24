package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tn5  reason: default package */
/* loaded from: classes.dex */
public final class tn5 extends vn5 {
    public final o75 a;
    public final boolean b;
    public final hb5 c;
    public final boolean d;

    public tn5(o75 o75Var, boolean z, hb5 hb5Var, boolean z2) {
        this.a = o75Var;
        this.b = z;
        this.c = hb5Var;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof tn5) {
                tn5 tn5Var = (tn5) obj;
                if (!this.a.equals(tn5Var.a) || this.b != tn5Var.b || !this.c.equals(tn5Var.c) || this.d != tn5Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int e = xg6.e(this.a.hashCode() * 31, this.b, 31);
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + e) * 31);
    }

    public final String toString() {
        return "AchievementSubmission(achievement=" + this.a + ", forHardcoreMode=" + this.b + ", authentication=" + this.c + ", firstTry=" + this.d + ")";
    }
}
