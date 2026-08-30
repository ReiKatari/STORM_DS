package c1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n0 extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final d1.q1 f2471a;

    /* renamed from: b  reason: collision with root package name */
    public final d1.k1 f2472b;

    /* renamed from: c  reason: collision with root package name */
    public final d1.k1 f2473c;

    /* renamed from: d  reason: collision with root package name */
    public final d1.k1 f2474d;

    /* renamed from: e  reason: collision with root package name */
    public final c1 f2475e;

    /* renamed from: f  reason: collision with root package name */
    public final d1 f2476f;

    /* renamed from: g  reason: collision with root package name */
    public final mc.a f2477g;

    /* renamed from: h  reason: collision with root package name */
    public final o0 f2478h;

    public n0(d1.q1 q1Var, d1.k1 k1Var, d1.k1 k1Var2, d1.k1 k1Var3, c1 c1Var, d1 d1Var, mc.a aVar, o0 o0Var) {
        this.f2471a = q1Var;
        this.f2472b = k1Var;
        this.f2473c = k1Var2;
        this.f2474d = k1Var3;
        this.f2475e = c1Var;
        this.f2476f = d1Var;
        this.f2477g = aVar;
        this.f2478h = o0Var;
    }

    @Override // a4.j1
    public final b3.o e() {
        return new b1(this.f2471a, this.f2472b, this.f2473c, this.f2474d, this.f2475e, this.f2476f, this.f2477g, this.f2478h);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n0) {
            n0 n0Var = (n0) obj;
            if (n0Var.f2471a.equals(this.f2471a) && nc.k.a(n0Var.f2472b, this.f2472b) && nc.k.a(n0Var.f2473c, this.f2473c) && nc.k.a(n0Var.f2474d, this.f2474d) && n0Var.f2475e.equals(this.f2475e) && nc.k.a(n0Var.f2476f, this.f2476f) && n0Var.f2477g == this.f2477g && nc.k.a(n0Var.f2478h, this.f2478h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        b1 b1Var = (b1) oVar;
        b1Var.f2383j0 = this.f2471a;
        b1Var.f2384k0 = this.f2472b;
        b1Var.f2385l0 = this.f2473c;
        b1Var.f2386m0 = this.f2474d;
        b1Var.f2387n0 = this.f2475e;
        b1Var.f2388o0 = this.f2476f;
        b1Var.p0 = this.f2477g;
        b1Var.f2389q0 = this.f2478h;
    }

    public final int hashCode() {
        int i2;
        int i10;
        int hashCode = this.f2471a.hashCode() * 31;
        int i11 = 0;
        d1.k1 k1Var = this.f2472b;
        if (k1Var != null) {
            i2 = k1Var.hashCode();
        } else {
            i2 = 0;
        }
        int i12 = (hashCode + i2) * 31;
        d1.k1 k1Var2 = this.f2473c;
        if (k1Var2 != null) {
            i10 = k1Var2.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i12 + i10) * 31;
        d1.k1 k1Var3 = this.f2474d;
        if (k1Var3 != null) {
            i11 = k1Var3.hashCode();
        }
        int hashCode2 = this.f2475e.f2397a.hashCode();
        int hashCode3 = this.f2476f.f2403a.hashCode();
        return this.f2478h.hashCode() + ((this.f2477g.hashCode() + ((hashCode3 + ((hashCode2 + ((i13 + i11) * 31)) * 31)) * 31)) * 31);
    }
}
