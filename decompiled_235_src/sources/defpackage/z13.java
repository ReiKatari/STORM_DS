package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z13  reason: default package */
/* loaded from: classes.dex */
public final class z13 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof z13) {
            if (this.a != ((z13) obj).a) {
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
        int i = this.a;
        if (i == 0) {
            return "Argb8888";
        }
        if (i == 1) {
            return "Alpha8";
        }
        if (i == 2) {
            return "Rgb565";
        }
        if (i == 3) {
            return "F16";
        }
        if (i == 4) {
            return "Gpu";
        }
        return "Unknown";
    }
}
