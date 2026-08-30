package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bu1  reason: default package */
/* loaded from: classes.dex */
public final class bu1 extends cu1 {
    public final wx2 a;
    public final boolean b;
    public final boolean c;

    public bu1(wx2 wx2Var, boolean z, boolean z2) {
        this.a = wx2Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bu1) {
                bu1 bu1Var = (bu1) obj;
                if (!this.a.equals(bu1Var.a) || this.b != bu1Var.b || this.c != bu1Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ej6.c(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return "SettingsScreen(romSettingsOverrides=" + this.a + ", retroAchievementsRuntimeIdentityLocked=" + this.b + ", retroAchievementsInGameLogoutSupported=" + this.c + ")";
    }
}
