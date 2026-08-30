package zb;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final int f15010a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f15011b;

    public t(int i2, Object obj) {
        this.f15010a = i2;
        this.f15011b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f15010a == tVar.f15010a && nc.k.a(this.f15011b, tVar.f15011b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.f15010a) * 31;
        Object obj = this.f15011b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f15010a + ", value=" + this.f15011b + ')';
    }
}
