package eh;

import oe.t;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f4492a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4493b;

    /* renamed from: c  reason: collision with root package name */
    public final t f4494c;

    public l(Integer num, int i2, t tVar) {
        tVar.getClass();
        this.f4492a = num;
        this.f4493b = i2;
        this.f4494c = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (nc.k.a(this.f4492a, lVar.f4492a) && this.f4493b == lVar.f4493b && this.f4494c == lVar.f4494c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.f4492a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return this.f4494c.hashCode() + w.d.c(this.f4493b, hashCode * 31, 31);
    }

    public final String toString() {
        return "Axis(deviceId=" + this.f4492a + ", axisCode=" + this.f4493b + ", direction=" + this.f4494c + ")";
    }
}
