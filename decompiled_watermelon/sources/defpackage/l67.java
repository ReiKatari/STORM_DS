package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l67  reason: default package */
/* loaded from: classes.dex */
public final class l67 {
    public final String a;
    public final String b;

    public l67(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l67) {
                l67 l67Var = (l67) obj;
                if (!this.a.equals(l67Var.a) || !this.b.equals(l67Var.b)) {
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
        return "ValidatedRetroAchievementsHost(clientHost=" + this.a + ", apiUrl=" + this.b + ")";
    }
}
