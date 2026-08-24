package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v85  reason: default package */
/* loaded from: classes.dex */
public final class v85 extends l95 {
    public final long a;

    public v85(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof v85) && this.a == ((v85) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return lb1.i(this.a, "OnGameCompleted(subsetId=", ")");
    }
}
