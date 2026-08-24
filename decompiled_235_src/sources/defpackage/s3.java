package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s3  reason: default package */
/* loaded from: classes.dex */
public final class s3 extends nb3 {
    public final long x;

    public s3(long j) {
        this.x = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof s3) && this.x == ((s3) obj).x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.x);
    }

    public final String toString() {
        return lb1.i(this.x, "AwardAchievement(achievementId=", ")");
    }
}
