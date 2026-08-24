package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r95  reason: default package */
/* loaded from: classes.dex */
public final class r95 extends ca5 {
    public final o75 a;

    public r95(o75 o75Var) {
        this.a = o75Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof r95) || !this.a.equals(((r95) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AchievementUnPrimed(achievement=" + this.a + ")";
    }
}
