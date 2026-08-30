package n2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a  reason: collision with root package name */
    public y f9980a;

    /* renamed from: b  reason: collision with root package name */
    public int f9981b;

    /* renamed from: c  reason: collision with root package name */
    public a f9982c;

    /* renamed from: d  reason: collision with root package name */
    public mc.p f9983d;

    /* renamed from: e  reason: collision with root package name */
    public int f9984e;

    /* renamed from: f  reason: collision with root package name */
    public a1.d0 f9985f;

    /* renamed from: g  reason: collision with root package name */
    public a1.m0 f9986g;

    public p1(y yVar) {
        this.f9980a = yVar;
    }

    public final boolean a() {
        boolean z10;
        if (this.f9980a != null) {
            a aVar = this.f9982c;
            if (aVar != null) {
                z10 = aVar.a();
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final o0 b(Object obj) {
        o0 s10;
        y yVar = this.f9980a;
        if (yVar != null && (s10 = yVar.s(this, obj)) != null) {
            return s10;
        }
        return o0.IGNORED;
    }

    public final void c() {
        y yVar = this.f9980a;
        if (yVar != null) {
            yVar.f10074i0 = true;
            yVar.f10079n0.i();
        }
        this.f9980a = null;
        this.f9985f = null;
        this.f9986g = null;
        this.f9983d = null;
    }

    public final void d(boolean z10) {
        int i2;
        int i10 = this.f9981b;
        if (z10) {
            i2 = i10 | 32;
        } else {
            i2 = i10 & (-33);
        }
        this.f9981b = i2;
    }
}
