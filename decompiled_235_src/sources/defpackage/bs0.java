package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bs0  reason: default package */
/* loaded from: classes.dex */
public final class bs0 {
    public final float a;
    public final float b;

    public bs0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static boolean d(Comparable comparable, Comparable comparable2) {
        if (((Number) comparable).floatValue() <= ((Number) comparable2).floatValue()) {
            return true;
        }
        return false;
    }

    public final Comparable a() {
        return Float.valueOf(this.b);
    }

    public final Comparable b() {
        return Float.valueOf(this.a);
    }

    public final boolean c() {
        if (this.a > this.b) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bs0) {
            if (!c() || !((bs0) obj).c()) {
                bs0 bs0Var = (bs0) obj;
                if (this.a == bs0Var.a && this.b == bs0Var.b) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (c()) {
            return -1;
        }
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
