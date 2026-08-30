package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ni1  reason: default package */
/* loaded from: classes.dex */
public final class ni1 {
    public final long a;

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ni1) {
            if (this.a != ((ni1) obj).a) {
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
        long j = this.a;
        if (j != 9205357640488583168L) {
            return ((Object) ji1.c(b(j))) + " x " + ((Object) ji1.c(a(j)));
        }
        return "DpSize.Unspecified";
    }
}
