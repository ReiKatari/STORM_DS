package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jz4  reason: default package */
/* loaded from: classes.dex */
public final class jz4 extends b05 {
    public final long a;

    public jz4(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof jz4) && this.a == ((jz4) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "OnAchievementUnPrimed(achievementId=" + this.a + ")";
    }
}
