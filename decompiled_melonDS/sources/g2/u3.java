package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u3 {

    /* renamed from: a  reason: collision with root package name */
    public final t1.d f5420a;

    /* renamed from: b  reason: collision with root package name */
    public final t1.d f5421b;

    /* renamed from: c  reason: collision with root package name */
    public final t1.d f5422c;

    public u3() {
        t1.d b10 = t1.e.b(4);
        t1.d b11 = t1.e.b(4);
        t1.d b12 = t1.e.b(0);
        this.f5420a = b10;
        this.f5421b = b11;
        this.f5422c = b12;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u3) {
                u3 u3Var = (u3) obj;
                if (!nc.k.a(this.f5420a, u3Var.f5420a) || !nc.k.a(this.f5421b, u3Var.f5421b) || !nc.k.a(this.f5422c, u3Var.f5422c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f5421b.hashCode();
        return this.f5422c.hashCode() + ((hashCode + (this.f5420a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(small=" + this.f5420a + ", medium=" + this.f5421b + ", large=" + this.f5422c + ')';
    }
}
