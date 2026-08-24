package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ju2  reason: default package */
/* loaded from: classes.dex */
public final class ju2 {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof ju2) {
            if (this.a != ((ju2) obj).a) {
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
        return "GridItemSpan(packedValue=" + this.a + ')';
    }
}
