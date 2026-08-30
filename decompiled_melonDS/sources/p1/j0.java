package p1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f11219a;

    /* renamed from: b  reason: collision with root package name */
    public final l0 f11220b;

    /* renamed from: d  reason: collision with root package name */
    public int f11222d;

    /* renamed from: e  reason: collision with root package name */
    public j0 f11223e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f11224f;

    /* renamed from: c  reason: collision with root package name */
    public int f11221c = -1;

    /* renamed from: g  reason: collision with root package name */
    public final n2.f1 f11225g = n2.s.w(null);

    public j0(Object obj, l0 l0Var) {
        this.f11219a = obj;
        this.f11220b = l0Var;
    }

    public final j0 a() {
        if (this.f11224f) {
            k1.b.c("Pin should not be called on an already disposed item ");
        }
        if (this.f11222d == 0) {
            this.f11220b.A.add(this);
            j0 j0Var = (j0) this.f11225g.getValue();
            if (j0Var != null) {
                j0Var.a();
            } else {
                j0Var = null;
            }
            this.f11223e = j0Var;
        }
        this.f11222d++;
        return this;
    }

    public final void b() {
        if (!this.f11224f) {
            if (this.f11222d <= 0) {
                k1.b.c("Release should only be called once");
            }
            int i2 = this.f11222d - 1;
            this.f11222d = i2;
            if (i2 == 0) {
                this.f11220b.A.remove(this);
                j0 j0Var = this.f11223e;
                if (j0Var != null) {
                    j0Var.b();
                }
                this.f11223e = null;
            }
        }
    }
}
