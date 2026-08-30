package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f05  reason: default package */
/* loaded from: classes.dex */
public final class f05 extends s05 {
    public final dy4 a;

    public f05(dy4 dy4Var) {
        dy4Var.getClass();
        this.a = dy4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f05) && b53.x(this.a, ((f05) obj).a)) {
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
