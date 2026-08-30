package u1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: g  reason: collision with root package name */
    public static final p1.a0 f13331g = y2.k.b(new mg.m(15, (byte) 0), new h1(0));

    /* renamed from: a  reason: collision with root package name */
    public final n2.b1 f13332a;

    /* renamed from: b  reason: collision with root package name */
    public final n2.b1 f13333b = new n2.b1(0.0f);

    /* renamed from: c  reason: collision with root package name */
    public final n2.c1 f13334c = new n2.c1(0);

    /* renamed from: d  reason: collision with root package name */
    public h3.c f13335d = h3.c.f6051e;

    /* renamed from: e  reason: collision with root package name */
    public long f13336e = l4.q0.f8883b;

    /* renamed from: f  reason: collision with root package name */
    public final n2.f1 f13337f;

    public i1(h1.n1 n1Var, float f8) {
        this.f13332a = new n2.b1(f8);
        this.f13337f = new n2.f1(n1Var, n2.e.Z);
    }

    public final void a(h1.n1 n1Var, h3.c cVar, int i2, int i10) {
        boolean z10;
        float f8;
        int i11;
        float f10;
        float f11 = i10 - i2;
        this.f13333b.h(f11);
        float f12 = cVar.f6052a;
        float f13 = cVar.f6053b;
        h3.c cVar2 = this.f13335d;
        int i12 = (f12 > cVar2.f6052a ? 1 : (f12 == cVar2.f6052a ? 0 : -1));
        n2.b1 b1Var = this.f13332a;
        if (i12 != 0 || f13 != cVar2.f6053b) {
            if (n1Var == h1.n1.Vertical) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                f12 = f13;
            }
            if (z10) {
                f8 = cVar.f6055d;
            } else {
                f8 = cVar.f6054c;
            }
            float g10 = b1Var.g();
            float f14 = i2;
            float f15 = g10 + f14;
            if (f8 > f15 || (f12 < g10 && f8 - f12 > f14)) {
                f10 = f8 - f15;
            } else if (i11 < 0 && f8 - f12 <= f14) {
                f10 = f12 - g10;
            } else {
                f10 = 0.0f;
            }
            b1Var.h(b1Var.g() + f10);
            this.f13335d = cVar;
        }
        b1Var.h(p7.j.f(b1Var.g(), 0.0f, f11));
        this.f13334c.h(i2);
    }
}
