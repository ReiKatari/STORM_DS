package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nm2  reason: default package */
/* loaded from: classes.dex */
public final class nm2 {
    public final long a;

    public static String a(long j) {
        return lb1.h(j, "Frame-");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nm2) {
            if (this.a != ((nm2) obj).a) {
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
