package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p95  reason: default package */
/* loaded from: classes.dex */
public final class p95 extends ca5 {
    public final o75 a;

    public p95(o75 o75Var) {
        o75Var.getClass();
        this.a = o75Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof p95) && nb3.k(this.a, ((p95) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AchievementTriggerError(achievement=" + this.a + ")";
    }
}
