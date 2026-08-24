package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nt0  reason: default package */
/* loaded from: classes.dex */
public abstract class nt0 {
    public final String a;
    public final long b;
    public final int c;

    public nt0(String str, int i, long j) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() != 0) {
            if (i >= -1 && i <= 63) {
                return;
            }
            i.h("The id must be between -1 and 63");
            throw null;
        }
        i.h("The name of a color space cannot be null and must contain at least 1 character");
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
            nt0 nt0Var = (nt0) obj;
            if (this.c == nt0Var.c && this.a.equals(nt0Var.a)) {
                return q60.A(this.b, nt0Var.b);
            }
            return false;
        }
        return false;
    }

    public abstract long f(float f, float f2, float f3, float f4, nt0 nt0Var);

    public int hashCode() {
        return i61.c(this.b, this.a.hashCode() * 31, 31) + this.c;
    }

    public final String toString() {
        return this.a + " (id=" + this.c + ", model=" + ((Object) q60.a0(this.b)) + ')';
    }
}
