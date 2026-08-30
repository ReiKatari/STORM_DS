package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h05  reason: default package */
/* loaded from: classes.dex */
public final class h05 extends s05 {
    public final dy4 a;

    public h05(dy4 dy4Var) {
        this.a = dy4Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof h05) || !this.a.equals(((h05) obj).a)) {
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
