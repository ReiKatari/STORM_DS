package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: om1  reason: default package */
/* loaded from: classes.dex */
public final class om1 implements Comparable {
    public final float A;

    public static int a(float f, float f2) {
        if (!Float.isNaN(f) && !Float.isNaN(f2)) {
            return Float.compare(f, f2);
        }
        return 0;
    }

    public static final boolean b(float f, float f2) {
        if (Float.compare(f, f2) == 0) {
            return true;
        }
        return false;
    }

    public static String c(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return a(this.A, ((om1) obj).A);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof om1) {
            if (Float.compare(this.A, ((om1) obj).A) != 0) {
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
