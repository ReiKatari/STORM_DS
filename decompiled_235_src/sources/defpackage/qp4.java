package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qp4  reason: default package */
/* loaded from: classes.dex */
public final class qp4 {
    public final long a;

    public static String a(long j) {
        return "DynamicRangeProfile(value=" + j + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qp4) {
            if (this.a != ((qp4) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
