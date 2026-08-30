package a3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final int f152a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f153b;

    public l(int i2, Integer num) {
        this.f152a = i2;
        this.f153b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f152a == lVar.f152a && nc.k.a(this.f153b, lVar.f153b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.f152a) * 31;
        Integer num = this.f153b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.f152a + ", dataOffset=" + this.f153b + ')';
    }
}
