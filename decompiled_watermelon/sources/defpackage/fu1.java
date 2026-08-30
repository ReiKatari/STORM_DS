package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fu1  reason: default package */
/* loaded from: classes.dex */
public final class fu1 extends pu1 {
    public final int a;
    public final Long b;

    public fu1(int i, Long l) {
        this.a = i;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu1)) {
            return false;
        }
        fu1 fu1Var = (fu1) obj;
        if (this.a == fu1Var.a && b53.x(this.b, fu1Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.a) * 31;
        Long l = this.b;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "ShowOfflineAchievementsSyncChoice(pendingUnlockCount=" + this.a + ", ledgerExpiresInMs=" + this.b + ")";
    }
}
