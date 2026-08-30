package h1;

import g2.l5;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l0 extends a4.j1 {

    /* renamed from: i  reason: collision with root package name */
    public static final l5 f5957i = new l5(3);

    /* renamed from: a  reason: collision with root package name */
    public final p0 f5958a;

    /* renamed from: b  reason: collision with root package name */
    public final n1 f5959b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5960c;

    /* renamed from: d  reason: collision with root package name */
    public final j1.i f5961d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5962e;

    /* renamed from: f  reason: collision with root package name */
    public final mc.q f5963f;

    /* renamed from: g  reason: collision with root package name */
    public final mc.q f5964g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f5965h;

    public l0(p0 p0Var, n1 n1Var, boolean z10, j1.i iVar, boolean z11, m0 m0Var, mc.q qVar, boolean z12) {
        this.f5958a = p0Var;
        this.f5959b = n1Var;
        this.f5960c = z10;
        this.f5961d = iVar;
        this.f5962e = z11;
        this.f5963f = m0Var;
        this.f5964g = qVar;
        this.f5965h = z12;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h1.o0, h1.k0, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        l5 l5Var = f5957i;
        boolean z10 = this.f5960c;
        j1.i iVar = this.f5961d;
        n1 n1Var = this.f5959b;
        ?? k0Var = new k0(l5Var, z10, iVar, n1Var);
        k0Var.C0 = this.f5958a;
        k0Var.D0 = n1Var;
        k0Var.E0 = this.f5962e;
        k0Var.F0 = this.f5963f;
        k0Var.G0 = this.f5964g;
        k0Var.H0 = this.f5965h;
        return k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l0.class != obj.getClass()) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (nc.k.a(this.f5958a, l0Var.f5958a) && this.f5959b == l0Var.f5959b && this.f5960c == l0Var.f5960c && nc.k.a(this.f5961d, l0Var.f5961d) && this.f5962e == l0Var.f5962e && nc.k.a(this.f5963f, l0Var.f5963f) && nc.k.a(this.f5964g, l0Var.f5964g) && this.f5965h == l0Var.f5965h) {
            return true;
        }
        return false;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        boolean z10;
        boolean z11;
        o0 o0Var = (o0) oVar;
        p0 p0Var = o0Var.C0;
        p0 p0Var2 = this.f5958a;
        if (!nc.k.a(p0Var, p0Var2)) {
            o0Var.C0 = p0Var2;
            z10 = true;
        } else {
            z10 = false;
        }
        n1 n1Var = o0Var.D0;
        n1 n1Var2 = this.f5959b;
        if (n1Var != n1Var2) {
            o0Var.D0 = n1Var2;
            z10 = true;
        }
        boolean z12 = o0Var.H0;
        boolean z13 = this.f5965h;
        if (z12 != z13) {
            o0Var.H0 = z13;
            z11 = true;
        } else {
            z11 = z10;
        }
        o0Var.F0 = this.f5963f;
        o0Var.G0 = this.f5964g;
        o0Var.E0 = this.f5962e;
        o0Var.i1(f5957i, this.f5960c, this.f5961d, n1Var2, z11);
    }

    public final int hashCode() {
        int i2;
        int e6 = w.d.e((this.f5959b.hashCode() + (this.f5958a.hashCode() * 31)) * 31, this.f5960c, 31);
        j1.i iVar = this.f5961d;
        if (iVar != null) {
            i2 = iVar.hashCode();
        } else {
            i2 = 0;
        }
        int e10 = w.d.e((e6 + i2) * 31, this.f5962e, 31);
        int hashCode = this.f5964g.hashCode();
        return Boolean.hashCode(this.f5965h) + ((hashCode + ((this.f5963f.hashCode() + e10) * 31)) * 31);
    }
}
