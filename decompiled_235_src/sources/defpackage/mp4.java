package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mp4  reason: default package */
/* loaded from: classes.dex */
public final class mp4 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof mp4) {
            if (this.a != ((mp4) obj).a) {
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
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    switch (i) {
                        case 10:
                            return "ERROR_OUTPUT_FAILED";
                        case 11:
                            return "ERROR_OUTPUT_ABORTED";
                        case 12:
                            return "ERROR_OUTPUT_MISSING";
                        case 13:
                            return "ERROR_OUTPUT_DROPPED";
                        default:
                            return xg6.o("OutputStatus(value=", i, ')');
                    }
                }
                return "UNAVAILABLE";
            }
            return "AVAILABLE";
        }
        return "PENDING";
    }
}
