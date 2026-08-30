package x4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f implements Comparable {
    public final float A;

    public static int a(float f8, float f10) {
        if (!Float.isNaN(f8) && !Float.isNaN(f10)) {
            return Float.compare(f8, f10);
        }
        return 0;
    }

    public static final boolean b(float f8, float f10) {
        if (Float.compare(f8, f10) == 0) {
            return true;
        }
        return false;
    }

    public static String c(float f8) {
        if (Float.isNaN(f8)) {
            return "Dp.Unspecified";
        }
        return f8 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return a(this.A, ((f) obj).A);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (Float.compare(this.A, ((f) obj).A) != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.A);
    }

    public final String toString() {
        return c(this.A);
    }
}
