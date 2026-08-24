package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qy1  reason: default package */
/* loaded from: classes.dex */
public final class qy1 extends az1 {
    public final int a;
    public final Long b;

    public qy1(int i, Long l) {
        this.a = i;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qy1)) {
            return false;
        }
        qy1 qy1Var = (qy1) obj;
        if (this.a == qy1Var.a && nb3.k(this.b, qy1Var.b)) {
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
