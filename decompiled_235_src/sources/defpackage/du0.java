package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: du0  reason: default package */
/* loaded from: classes.dex */
public final class du0 extends e74 {
    public final r94 a;
    public final boolean b;
    public final on2 c;
    public final on2 d;

    public du0(on2 on2Var, on2 on2Var2, r94 r94Var, boolean z) {
        this.a = r94Var;
        this.b = z;
        this.c = on2Var;
        this.d = on2Var2;
    }

    @Override // defpackage.e74
    public final z64 e() {
        return new gu0(this.c, this.d, this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && du0.class == obj.getClass()) {
            du0 du0Var = (du0) obj;
            if (nb3.k(this.a, du0Var.a) && this.b == du0Var.b && this.c == du0Var.c && this.d == du0Var.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        gu0 gu0Var = (gu0) z64Var;
        gu0Var.I0 = true;
        if (gu0Var.H0 == null) {
            z = true;
        } else {
            z = false;
        }
        on2 on2Var = this.d;
        if (on2Var == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            gu0Var.V0();
            bl2.G(gu0Var);
            z3 = true;
        } else {
            z3 = false;
        }
        gu0Var.H0 = on2Var;
        boolean z5 = gu0Var.r0;
        boolean z6 = this.b;
        if (z5 != z6) {
            z4 = true;
        } else {
            z4 = z3;
        }
        gu0Var.f1(this.a, null, false, z6, null, null, this.c);
        if (z4) {
            gu0Var.g1(false);
            gu0Var.g1(true);
        }
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        r94 r94Var = this.a;
        if (r94Var != null) {
            i = r94Var.hashCode();
        } else {
            i = 0;
        }
        int hashCode = (this.c.hashCode() + xg6.e(xg6.e(i * 961, false, 31), this.b, 29791)) * 961;
        on2 on2Var = this.d;
        if (on2Var != null) {
            i2 = on2Var.hashCode();
        }
        return Boolean.hashCode(true) + ((hashCode + i2) * 961);
    }
}
