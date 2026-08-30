package oe;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public int f10908a;

    /* renamed from: b  reason: collision with root package name */
    public int f10909b;

    public a0(int i2, int i10) {
        this.f10908a = i2;
        this.f10909b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f10908a == a0Var.f10908a && this.f10909b == a0Var.f10909b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10909b) + (Integer.hashCode(this.f10908a) * 31);
    }

    public final String toString() {
        int i2 = this.f10908a;
        int i10 = this.f10909b;
        return "Point(x=" + i2 + ", y=" + i10 + ")";
    }
}
