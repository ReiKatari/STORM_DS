package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yu6  reason: default package */
/* loaded from: classes.dex */
public final class yu6 extends gv6 {
    public final zu6 a;
    public final boolean b;
    public final boolean c;

    public yu6(zu6 zu6Var, boolean z, boolean z2) {
        zu6Var.getClass();
        this.a = zu6Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu6)) {
            return false;
        }
        yu6 yu6Var = (yu6) obj;
        if (this.a == yu6Var.a && this.b == yu6Var.b && this.c == yu6Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ej6.c(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return "RetroAchievementsMode(status=" + this.a + ", offlineNoInternetAtStart=" + this.b + ", hardcoreOfflineDisabled=" + this.c + ")";
    }
}
