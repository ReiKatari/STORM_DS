package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: aq2  reason: default package */
/* loaded from: classes.dex */
public final class aq2 {
    public final dy4 a;
    public final x15 b;

    public aq2(dy4 dy4Var, x15 x15Var) {
        x15Var.getClass();
        this.a = dy4Var;
        this.b = x15Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof aq2) {
                aq2 aq2Var = (aq2) obj;
                if (!this.a.equals(aq2Var.a) || !b53.x(this.b, aq2Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "QueuedAchievement(achievement=" + this.a + ", authentication=" + this.b + ")";
    }
}
