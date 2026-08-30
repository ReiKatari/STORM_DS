package l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g0 implements b2 {

    /* renamed from: a  reason: collision with root package name */
    public final float f8560a;

    /* renamed from: b  reason: collision with root package name */
    public final float f8561b;

    /* renamed from: c  reason: collision with root package name */
    public final float f8562c;

    /* renamed from: d  reason: collision with root package name */
    public final float f8563d;

    public g0(float f8, float f10, float f11, float f12) {
        this.f8560a = f8;
        this.f8561b = f10;
        this.f8562c = f11;
        this.f8563d = f12;
    }

    @Override // l1.b2
    public final int a(x4.c cVar) {
        return cVar.O(this.f8563d);
    }

    @Override // l1.b2
    public final int b(x4.c cVar, x4.m mVar) {
        return cVar.O(this.f8562c);
    }

    @Override // l1.b2
    public final int c(x4.c cVar, x4.m mVar) {
        return cVar.O(this.f8560a);
    }

    @Override // l1.b2
    public final int d(x4.c cVar) {
        return cVar.O(this.f8561b);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g0) {
                g0 g0Var = (g0) obj;
                if (x4.f.b(this.f8560a, g0Var.f8560a) && x4.f.b(this.f8561b, g0Var.f8561b) && x4.f.b(this.f8562c, g0Var.f8562c) && x4.f.b(this.f8563d, g0Var.f8563d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8563d) + w.d.b(this.f8562c, w.d.b(this.f8561b, Float.hashCode(this.f8560a) * 31, 31), 31);
    }

    public final String toString() {
        return "Insets(left=" + ((Object) x4.f.c(this.f8560a)) + ", top=" + ((Object) x4.f.c(this.f8561b)) + ", right=" + ((Object) x4.f.c(this.f8562c)) + ", bottom=" + ((Object) x4.f.c(this.f8563d)) + ')';
    }
}
