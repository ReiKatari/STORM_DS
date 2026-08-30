package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m1 implements l1 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f3607a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3608b;

    public m1(Object obj, Object obj2) {
        this.f3607a = obj;
        this.f3608b = obj2;
    }

    @Override // d1.l1
    public final Object a() {
        return this.f3607a;
    }

    @Override // d1.l1
    public final Object c() {
        return this.f3608b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l1) {
            l1 l1Var = (l1) obj;
            if (nc.k.a(this.f3607a, l1Var.a()) && nc.k.a(this.f3608b, l1Var.c())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i10 = 0;
        Object obj = this.f3607a;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = i2 * 31;
        Object obj2 = this.f3608b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i11 + i10;
    }
}
