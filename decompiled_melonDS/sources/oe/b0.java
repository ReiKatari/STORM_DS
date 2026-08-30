package oe;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f10912a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10913b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10914c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10915d;

    public b0(int i2, int i10, int i11, int i12) {
        this.f10912a = i2;
        this.f10913b = i10;
        this.f10914c = i11;
        this.f10915d = i12;
    }

    public final int a() {
        return this.f10913b + this.f10915d;
    }

    public final int b() {
        return this.f10912a + this.f10914c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (this.f10912a == b0Var.f10912a && this.f10913b == b0Var.f10913b && this.f10914c == b0Var.f10914c && this.f10915d == b0Var.f10915d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10915d) + w.d.c(this.f10914c, w.d.c(this.f10913b, Integer.hashCode(this.f10912a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder j2 = kc.a.j("Rect(x=", this.f10912a, ", y=", this.f10913b, ", width=");
        j2.append(this.f10914c);
        j2.append(", height=");
        j2.append(this.f10915d);
        j2.append(")");
        return j2.toString();
    }
}
