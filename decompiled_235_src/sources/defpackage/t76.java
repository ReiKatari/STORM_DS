package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t76  reason: default package */
/* loaded from: classes.dex */
public final class t76 extends e74 {
    public final f86 a;
    public final lo4 b;
    public final boolean c;
    public final sd2 d;
    public final r94 e;
    public final z70 f;
    public final boolean g;
    public final sg h;

    public t76(sg sgVar, z70 z70Var, sd2 sd2Var, r94 r94Var, lo4 lo4Var, f86 f86Var, boolean z, boolean z2) {
        this.a = f86Var;
        this.b = lo4Var;
        this.c = z;
        this.d = sd2Var;
        this.e = r94Var;
        this.f = z70Var;
        this.g = z2;
        this.h = sgVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [zg1, u76, z64] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? zg1Var = new zg1();
        zg1Var.m0 = this.a;
        zg1Var.n0 = this.b;
        zg1Var.o0 = this.c;
        zg1Var.p0 = this.d;
        zg1Var.q0 = this.e;
        zg1Var.r0 = this.f;
        zg1Var.s0 = this.g;
        zg1Var.t0 = this.h;
        return zg1Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && t76.class == obj.getClass()) {
                t76 t76Var = (t76) obj;
                if (nb3.k(this.a, t76Var.a) && this.b == t76Var.b && this.c == t76Var.c && nb3.k(this.d, t76Var.d) && nb3.k(this.e, t76Var.e) && nb3.k(this.f, t76Var.f) && this.g == t76Var.g && nb3.k(this.h, t76Var.h)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        r94 r94Var = this.e;
        ((u76) z64Var).W0(this.h, this.f, this.d, r94Var, this.b, this.a, this.g, this.c);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int e = xg6.e(xg6.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31), false, 31);
        sd2 sd2Var = this.d;
        if (sd2Var != null) {
            i = sd2Var.hashCode();
        } else {
            i = 0;
        }
        int i5 = (e + i) * 31;
        r94 r94Var = this.e;
        if (r94Var != null) {
            i2 = r94Var.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        z70 z70Var = this.f;
        if (z70Var != null) {
            i3 = z70Var.hashCode();
        } else {
            i3 = 0;
        }
        int e2 = xg6.e((i6 + i3) * 31, this.g, 31);
        sg sgVar = this.h;
        if (sgVar != null) {
            i4 = sgVar.hashCode();
        }
        return e2 + i4;
    }
}
