package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eb5  reason: default package */
/* loaded from: classes.dex */
public final class eb5 {
    public final o75 a;
    public final boolean b;
    public final boolean c;

    public eb5(o75 o75Var, boolean z, boolean z2) {
        this.a = o75Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof eb5) {
                eb5 eb5Var = (eb5) obj;
                if (!this.a.equals(eb5Var.a) || this.b != eb5Var.b || this.c != eb5Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xg6.e(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RAUserAchievement(achievement=");
        sb.append(this.a);
        sb.append(", isUnlocked=");
        sb.append(this.b);
        sb.append(", forHardcoreMode=");
        return i61.o(sb, this.c, ")");
    }
}
