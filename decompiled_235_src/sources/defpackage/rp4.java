package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rp4  reason: default package */
/* loaded from: classes.dex */
public final class rp4 {
    public final int a;

    public static String a(int i) {
        return xg6.o("MirrorMode(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rp4) {
            if (this.a != ((rp4) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
