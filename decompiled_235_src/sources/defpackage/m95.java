package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m95  reason: default package */
/* loaded from: classes.dex */
public final class m95 extends ca5 {
    public final o75 a;

    public m95(o75 o75Var) {
        this.a = o75Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof m95) || !this.a.equals(((m95) obj).a)) {
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
        return "AchievementPrimed(achievement=" + this.a + ")";
    }
}
