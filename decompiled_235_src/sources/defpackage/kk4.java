package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kk4  reason: default package */
/* loaded from: classes.dex */
public final class kk4 extends e74 {
    public final float a;
    public final float b;

    public kk4(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nk4, z64] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? z64Var = new z64();
        z64Var.k0 = this.a;
        z64Var.l0 = this.b;
        z64Var.m0 = true;
        return z64Var;
    }

    public final boolean equals(Object obj) {
        kk4 kk4Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof kk4) {
            kk4Var = (kk4) obj;
        } else {
            kk4Var = null;
        }
        if (kk4Var != null && om1.b(this.a, kk4Var.a) && om1.b(this.b, kk4Var.b)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        nk4 nk4Var = (nk4) z64Var;
        float f = nk4Var.k0;
        float f2 = this.a;
        boolean b = om1.b(f, f2);
        float f3 = this.b;
        if (!b || !om1.b(nk4Var.l0, f3) || !nk4Var.m0) {
            nc1.f0(nk4Var).U(false);
        }
        nk4Var.k0 = f2;
        nk4Var.l0 = f3;
        nk4Var.m0 = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + xg6.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) om1.c(this.a)) + ", y=" + ((Object) om1.c(this.b)) + ", rtlAware=true)";
    }
}
