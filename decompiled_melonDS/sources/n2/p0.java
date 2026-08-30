package n2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f9978a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f9979b;

    public p0(Integer num, Object obj) {
        this.f9978a = num;
        this.f9979b = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p0) {
                p0 p0Var = (p0) obj;
                if (!this.f9978a.equals(p0Var.f9978a) || !nc.k.a(this.f9979b, p0Var.f9979b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2;
        int hashCode = this.f9978a.hashCode() * 31;
        Object obj = this.f9979b;
        if (obj instanceof Enum) {
            i2 = ((Enum) obj).ordinal();
        } else if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        return i2 + hashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f9978a + ", right=" + this.f9979b + ')';
    }
}
