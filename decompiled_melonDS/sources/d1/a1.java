package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a1 implements x {

    /* renamed from: a  reason: collision with root package name */
    public final float f3515a;

    /* renamed from: b  reason: collision with root package name */
    public final float f3516b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f3517c;

    public a1(float f8, float f10, Object obj) {
        this.f3515a = f8;
        this.f3516b = f10;
        this.f3517c = obj;
    }

    @Override // d1.j
    public final y1 a(w1 w1Var) {
        p pVar;
        Object obj = this.f3517c;
        if (obj == null) {
            pVar = null;
        } else {
            pVar = (p) w1Var.f3690a.k(obj);
        }
        return new a0.b(this.f3515a, this.f3516b, pVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a1) {
            a1 a1Var = (a1) obj;
            if (a1Var.f3515a == this.f3515a && a1Var.f3516b == this.f3516b && nc.k.a(a1Var.f3517c, this.f3517c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        Object obj = this.f3517c;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        return Float.hashCode(this.f3516b) + w.d.b(this.f3515a, i2 * 31, 31);
    }

    public /* synthetic */ a1(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
