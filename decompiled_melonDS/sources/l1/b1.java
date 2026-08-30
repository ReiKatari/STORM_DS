package l1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b1 extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final float f8501a;

    /* renamed from: b  reason: collision with root package name */
    public final float f8502b;

    /* renamed from: c  reason: collision with root package name */
    public final float f8503c;

    /* renamed from: d  reason: collision with root package name */
    public final float f8504d;

    public b1(float f8, float f10, float f11, float f12) {
        boolean z10;
        boolean z11;
        boolean z12;
        this.f8501a = f8;
        this.f8502b = f10;
        this.f8503c = f11;
        this.f8504d = f12;
        boolean z13 = true;
        if (f8 < 0.0f && !Float.isNaN(f8)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (f10 < 0.0f && !Float.isNaN(f10)) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean z14 = z10 & z11;
        if (f11 < 0.0f && !Float.isNaN(f11)) {
            z12 = false;
        } else {
            z12 = true;
        }
        boolean z15 = z14 & z12;
        if (f12 < 0.0f && !Float.isNaN(f12)) {
            z13 = false;
        }
        if (!(z15 & z13)) {
            m1.a.a("Padding must be non-negative");
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b3.o, l1.c1] */
    @Override // a4.j1
    public final b3.o e() {
        ?? oVar = new b3.o();
        oVar.f8513i0 = this.f8501a;
        oVar.f8514j0 = this.f8502b;
        oVar.f8515k0 = this.f8503c;
        oVar.f8516l0 = this.f8504d;
        oVar.f8517m0 = true;
        return oVar;
    }

    public final boolean equals(Object obj) {
        b1 b1Var;
        if (obj instanceof b1) {
            b1Var = (b1) obj;
        } else {
            b1Var = null;
        }
        if (b1Var != null && x4.f.b(this.f8501a, b1Var.f8501a) && x4.f.b(this.f8502b, b1Var.f8502b) && x4.f.b(this.f8503c, b1Var.f8503c) && x4.f.b(this.f8504d, b1Var.f8504d)) {
            return true;
        }
        return false;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        c1 c1Var = (c1) oVar;
        c1Var.f8513i0 = this.f8501a;
        c1Var.f8514j0 = this.f8502b;
        c1Var.f8515k0 = this.f8503c;
        c1Var.f8516l0 = this.f8504d;
        c1Var.f8517m0 = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + w.d.b(this.f8504d, w.d.b(this.f8503c, w.d.b(this.f8502b, Float.hashCode(this.f8501a) * 31, 31), 31), 31);
    }
}
