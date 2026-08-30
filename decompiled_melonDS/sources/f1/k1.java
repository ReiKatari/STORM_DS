package f1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a  reason: collision with root package name */
    public final long f4604a;

    /* renamed from: b  reason: collision with root package name */
    public final l1.h1 f4605b;

    public k1() {
        long d4 = i3.z.d(4284900966L);
        l1.h1 b10 = l1.c.b(3, 0.0f);
        this.f4604a = d4;
        this.f4605b = b10;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (k1.class.equals(cls)) {
                obj.getClass();
                k1 k1Var = (k1) obj;
                if (!i3.s.c(this.f4604a, k1Var.f4604a) || !nc.k.a(this.f4605b, k1Var.f4605b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2 = i3.s.f6688i;
        return this.f4605b.hashCode() + (Long.hashCode(this.f4604a) * 31);
    }

    public final String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) i3.s.i(this.f4604a)) + ", drawPadding=" + this.f4605b + ')';
    }
}
