package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jg4  reason: default package */
/* loaded from: classes.dex */
public final class jg4 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof jg4) {
            if (this.a != ((jg4) obj).a) {
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
                        case mj2.L /* 12 */:
                            return "ERROR_OUTPUT_MISSING";
                        case 13:
                            return "ERROR_OUTPUT_DROPPED";
                        default:
                            return ej6.e("OutputStatus(value=", i, ')');
                    }
                }
                return "UNAVAILABLE";
            }
            return "AVAILABLE";
        }
        return "PENDING";
    }
}
