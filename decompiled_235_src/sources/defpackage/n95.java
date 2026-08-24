package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n95  reason: default package */
/* loaded from: classes.dex */
public final class n95 extends ca5 {
    public final long a;

    public n95(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n95) && this.a == ((n95) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return lb1.i(this.a, "AchievementProgressHidden(achievementId=", ")");
    }
}
