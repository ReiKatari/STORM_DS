package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: op0  reason: default package */
/* loaded from: classes.dex */
public final class op0 {
    public final float a;
    public final float b;

    public op0(float f, float f2) {
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
        if (obj instanceof op0) {
            if (!c() || !((op0) obj).c()) {
                op0 op0Var = (op0) obj;
                if (this.a == op0Var.a && this.b == op0Var.b) {
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
