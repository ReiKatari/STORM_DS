package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ji1  reason: default package */
/* loaded from: classes.dex */
public final class ji1 implements Comparable {
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
        return a(this.A, ((ji1) obj).A);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ji1) {
            if (Float.compare(this.A, ((ji1) obj).A) != 0) {
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
