package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l6  reason: default package */
/* loaded from: classes.dex */
public final class l6 extends n6 {
    public final r15 a;

    public l6(r15 r15Var) {
        r15Var.getClass();
        this.a = r15Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l6) && b53.x(this.a, ((l6) obj).a)) {
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
