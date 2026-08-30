package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k96  reason: default package */
/* loaded from: classes.dex */
public final class k96 {
    public final long a;
    public final j96 b;
    public final String c;

    public k96(long j, j96 j96Var, String str) {
        j96Var.getClass();
        this.a = j;
        this.b = j96Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k96)) {
            return false;
        }
        k96 k96Var = (k96) obj;
        if (this.a == k96Var.a && this.b == k96Var.b && b53.x(this.c, k96Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "SmartSyncSkippedAchievement(achievementId=" + this.a + ", reason=" + this.b + ", reasonDetail=" + this.c + ")";
    }
}
