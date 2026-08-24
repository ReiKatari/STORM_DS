package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ry1  reason: default package */
/* loaded from: classes.dex */
public final class ry1 extends az1 {
    public final int a;

    public ry1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ry1) && this.a == ((ry1) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return lb1.k("ShowOfflineAchievementsSyncProgress(totalUnlockCount=", this.a, ")");
    }
}
