package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mi1  reason: default package */
/* loaded from: classes.dex */
public final class mi1 {
    public final long a;

    public static String a(long j) {
        if (j != 9205357640488583168L) {
            return "(" + ((Object) ji1.c(Float.intBitsToFloat((int) (j >> 32)))) + ", " + ((Object) ji1.c(Float.intBitsToFloat((int) (j & 4294967295L)))) + ')';
        }
        return "DpOffset.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mi1) {
            if (this.a != ((mi1) obj).a) {
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
