package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x96  reason: default package */
/* loaded from: classes.dex */
public final class x96 extends e74 {
    public final boolean a;
    public final r94 b;
    public final n43 c;
    public final boolean d;
    public final boolean e;
    public final mq5 f;
    public final on2 g;

    public x96(boolean z, r94 r94Var, n43 n43Var, boolean z2, boolean z3, mq5 mq5Var, on2 on2Var) {
        this.a = z;
        this.b = r94Var;
        this.c = n43Var;
        this.d = z2;
        this.e = z3;
        this.f = mq5Var;
        this.g = on2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z96, h0, z64] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? h0Var = new h0(this.b, this.c, this.d, this.e, null, this.f, this.g);
        h0Var.J0 = this.a;
        return h0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && x96.class == obj.getClass()) {
                x96 x96Var = (x96) obj;
                if (this.a != x96Var.a || !nb3.k(this.b, x96Var.b) || !nb3.k(this.c, x96Var.c) || this.d != x96Var.d || this.e != x96Var.e || !nb3.k(this.f, x96Var.f) || this.g != x96Var.g) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        z96 z96Var = (z96) z64Var;
        boolean z = z96Var.J0;
        boolean z2 = this.a;
        if (z != z2) {
            z96Var.J0 = z2;
            bl2.G(z96Var);
        }
        z96Var.f1(this.b, this.c, this.d, this.e, null, this.f, this.g);
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = Boolean.hashCode(this.a) * 31;
        int i3 = 0;
        r94 r94Var = this.b;
        if (r94Var != null) {
            i = r94Var.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        n43 n43Var = this.c;
        if (n43Var != null) {
            i2 = n43Var.hashCode();
        } else {
            i2 = 0;
        }
        int e = xg6.e(xg6.e((i4 + i2) * 31, this.d, 31), this.e, 31);
        mq5 mq5Var = this.f;
        if (mq5Var != null) {
            i3 = Integer.hashCode(mq5Var.a);
        }
        return this.g.hashCode() + ((e + i3) * 31);
    }
}
