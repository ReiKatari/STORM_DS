package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ar0  reason: default package */
/* loaded from: classes.dex */
public abstract class ar0 {
    public final String a;
    public final long b;
    public final int c;

    public ar0(String str, int i, long j) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() != 0) {
            if (i >= -1 && i <= 63) {
                return;
            }
            i.i("The id must be between -1 and 63");
            throw null;
        }
        i.i("The name of a color space cannot be null and must contain at least 1 character");
        throw null;
    }

    public abstract float a(int i);

    public abstract float b(int i);

    public boolean c() {
        return false;
    }

    public abstract long d(float f, float f2, float f3);

    public abstract float e(float f, float f2, float f3);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ar0 ar0Var = (ar0) obj;
            if (this.c == ar0Var.c && this.a.equals(ar0Var.a)) {
                return dk7.s(this.b, ar0Var.b);
            }
            return false;
        }
        return false;
    }

    public abstract long f(float f, float f2, float f3, float f4, ar0 ar0Var);

    public int hashCode() {
        return b31.c(this.b, this.a.hashCode() * 31, 31) + this.c;
    }

    public final String toString() {
        return this.a + " (id=" + this.c + ", model=" + ((Object) dk7.K(this.b)) + ')';
    }
}
