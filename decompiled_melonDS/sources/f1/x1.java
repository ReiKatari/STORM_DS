package f1;

import h1.j2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x1 extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final j2 f4679a;

    /* renamed from: b  reason: collision with root package name */
    public final h1.n1 f4680b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4681c;

    /* renamed from: d  reason: collision with root package name */
    public final h1.q0 f4682d;

    /* renamed from: e  reason: collision with root package name */
    public final j1.i f4683e;

    /* renamed from: f  reason: collision with root package name */
    public final h1.d f4684f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4685g;

    /* renamed from: h  reason: collision with root package name */
    public final i f4686h;

    public x1(i iVar, h1.d dVar, h1.q0 q0Var, h1.n1 n1Var, j2 j2Var, j1.i iVar2, boolean z10, boolean z11) {
        this.f4679a = j2Var;
        this.f4680b = n1Var;
        this.f4681c = z10;
        this.f4682d = q0Var;
        this.f4683e = iVar2;
        this.f4684f = dVar;
        this.f4685g = z11;
        this.f4686h = iVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [a4.k, f1.y1, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        ?? kVar = new a4.k();
        kVar.f4689k0 = this.f4679a;
        kVar.f4690l0 = this.f4680b;
        kVar.f4691m0 = this.f4681c;
        kVar.f4692n0 = this.f4682d;
        kVar.f4693o0 = this.f4683e;
        kVar.p0 = this.f4684f;
        kVar.f4694q0 = this.f4685g;
        kVar.f4695r0 = this.f4686h;
        return kVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && x1.class == obj.getClass()) {
                x1 x1Var = (x1) obj;
                if (nc.k.a(this.f4679a, x1Var.f4679a) && this.f4680b == x1Var.f4680b && this.f4681c == x1Var.f4681c && nc.k.a(this.f4682d, x1Var.f4682d) && nc.k.a(this.f4683e, x1Var.f4683e) && nc.k.a(this.f4684f, x1Var.f4684f) && this.f4685g == x1Var.f4685g && nc.k.a(this.f4686h, x1Var.f4686h)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        j1.i iVar = this.f4683e;
        ((y1) oVar).T0(this.f4686h, this.f4684f, this.f4682d, this.f4680b, this.f4679a, iVar, this.f4685g, this.f4681c);
    }

    public final int hashCode() {
        int i2;
        int i10;
        int i11;
        int i12 = 0;
        int e6 = w.d.e(w.d.e((this.f4680b.hashCode() + (this.f4679a.hashCode() * 31)) * 31, this.f4681c, 31), false, 31);
        h1.q0 q0Var = this.f4682d;
        if (q0Var != null) {
            i2 = q0Var.hashCode();
        } else {
            i2 = 0;
        }
        int i13 = (e6 + i2) * 31;
        j1.i iVar = this.f4683e;
        if (iVar != null) {
            i10 = iVar.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i13 + i10) * 31;
        h1.d dVar = this.f4684f;
        if (dVar != null) {
            i11 = dVar.hashCode();
        } else {
            i11 = 0;
        }
        int e10 = w.d.e((i14 + i11) * 31, this.f4685g, 31);
        i iVar2 = this.f4686h;
        if (iVar2 != null) {
            i12 = iVar2.hashCode();
        }
        return e10 + i12;
    }
}
