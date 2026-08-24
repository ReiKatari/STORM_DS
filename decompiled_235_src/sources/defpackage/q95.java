package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q95  reason: default package */
/* loaded from: classes.dex */
public final class q95 extends ca5 {
    public final o75 a;

    public q95(o75 o75Var) {
        o75Var.getClass();
        this.a = o75Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof q95) && nb3.k(this.a, ((q95) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AchievementTriggered(achievement=" + this.a + ")";
    }
}
