package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: co1  reason: default package */
/* loaded from: classes.dex */
public final class co1 extends e74 {
    public static final vn0 i = new vn0(23);
    public final go1 a;
    public final lo4 b;
    public final boolean c;
    public final r94 d;
    public final boolean e;
    public final fo2 f;
    public final fo2 g;
    public final boolean h;

    public co1(go1 go1Var, lo4 lo4Var, boolean z, r94 r94Var, boolean z2, do1 do1Var, fo2 fo2Var, boolean z3) {
        this.a = go1Var;
        this.b = lo4Var;
        this.c = z;
        this.d = r94Var;
        this.e = z2;
        this.f = do1Var;
        this.g = fo2Var;
        this.h = z3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fo1, z64, yn1] */
    @Override // defpackage.e74
    public final z64 e() {
        vn0 vn0Var = i;
        boolean z = this.c;
        r94 r94Var = this.d;
        lo4 lo4Var = this.b;
        ?? yn1Var = new yn1(vn0Var, z, r94Var, lo4Var);
        yn1Var.F0 = this.a;
        yn1Var.G0 = lo4Var;
        yn1Var.H0 = this.e;
        yn1Var.I0 = this.f;
        yn1Var.J0 = this.g;
        yn1Var.K0 = this.h;
        return yn1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || co1.class != obj.getClass()) {
            return false;
        }
        co1 co1Var = (co1) obj;
        if (nb3.k(this.a, co1Var.a) && this.b == co1Var.b && this.c == co1Var.c && nb3.k(this.d, co1Var.d) && this.e == co1Var.e && nb3.k(this.f, co1Var.f) && nb3.k(this.g, co1Var.g) && this.h == co1Var.h) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        boolean z;
        boolean z2;
        fo1 fo1Var = (fo1) z64Var;
        go1 go1Var = fo1Var.F0;
        go1 go1Var2 = this.a;
        if (!nb3.k(go1Var, go1Var2)) {
            fo1Var.F0 = go1Var2;
            z = true;
        } else {
            z = false;
        }
        lo4 lo4Var = fo1Var.G0;
        lo4 lo4Var2 = this.b;
        if (lo4Var != lo4Var2) {
            fo1Var.G0 = lo4Var2;
            z = true;
        }
        boolean z3 = fo1Var.K0;
        boolean z4 = this.h;
        if (z3 != z4) {
            fo1Var.K0 = z4;
            z2 = true;
        } else {
            z2 = z;
        }
        fo1Var.I0 = this.f;
        fo1Var.J0 = this.g;
        fo1Var.H0 = this.e;
        fo1Var.l1(i, this.c, this.d, lo4Var2, z2);
    }

    public final int hashCode() {
        int i2;
        int e = xg6.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
        r94 r94Var = this.d;
        if (r94Var != null) {
            i2 = r94Var.hashCode();
        } else {
            i2 = 0;
        }
        int e2 = xg6.e((e + i2) * 31, this.e, 31);
        int hashCode = this.g.hashCode();
        return Boolean.hashCode(this.h) + ((hashCode + ((this.f.hashCode() + e2) * 31)) * 31);
    }
}
