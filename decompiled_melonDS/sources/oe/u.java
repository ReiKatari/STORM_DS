package oe;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u extends x {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f10956a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10957b;

    /* renamed from: c  reason: collision with root package name */
    public final t f10958c;

    public u(Integer num, int i2, t tVar) {
        tVar.getClass();
        this.f10956a = num;
        this.f10957b = i2;
        this.f10958c = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (nc.k.a(this.f10956a, uVar.f10956a) && this.f10957b == uVar.f10957b && this.f10958c == uVar.f10958c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.f10956a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return this.f10958c.hashCode() + w.d.c(this.f10957b, hashCode * 31, 31);
    }

    public final String toString() {
        return "Axis(deviceId=" + this.f10956a + ", axisCode=" + this.f10957b + ", direction=" + this.f10958c + ")";
    }
}
