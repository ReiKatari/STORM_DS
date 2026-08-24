package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m6  reason: default package */
/* loaded from: classes.dex */
public final class m6 extends o6 {
    public final bb5 a;

    public m6(bb5 bb5Var) {
        bb5Var.getClass();
        this.a = bb5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m6) && nb3.k(this.a, ((m6) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RuntimeAchievementUiModel(runtimeAchievement=" + this.a + ")";
    }
}
