package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o00  reason: default package */
/* loaded from: classes.dex */
public final class o00 extends e74 {
    public final long a;
    public final f80 b;
    public final float c;
    public final ke6 d;

    public o00(long j, bv3 bv3Var, ke6 ke6Var, int i) {
        j = (i & 1) != 0 ? kt0.h : j;
        bv3Var = (i & 2) != 0 ? null : bv3Var;
        this.a = j;
        this.b = bv3Var;
        this.c = 1.0f;
        this.d = ke6Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d10, z64] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? z64Var = new z64();
        z64Var.k0 = this.a;
        z64Var.l0 = this.b;
        z64Var.m0 = this.c;
        z64Var.n0 = this.d;
        z64Var.o0 = 9205357640488583168L;
        return z64Var;
    }

    public final boolean equals(Object obj) {
        o00 o00Var;
        if (obj instanceof o00) {
            o00Var = (o00) obj;
        } else {
            o00Var = null;
        }
        if (o00Var == null || !kt0.d(this.a, o00Var.a) || !nb3.k(this.b, o00Var.b) || this.c != o00Var.c || !nb3.k(this.d, o00Var.d)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        d10 d10Var = (d10) z64Var;
        d10Var.k0 = this.a;
        d10Var.l0 = this.b;
        d10Var.m0 = this.c;
        ke6 ke6Var = d10Var.n0;
        ke6 ke6Var2 = this.d;
        if (!nb3.k(ke6Var, ke6Var2)) {
            d10Var.n0 = ke6Var2;
            bl2.G(d10Var);
        }
        f04.I(d10Var);
    }

    public final int hashCode() {
        int i;
        int i2 = kt0.i;
        int hashCode = Long.hashCode(this.a) * 31;
        f80 f80Var = this.b;
        if (f80Var != null) {
            i = f80Var.hashCode();
        } else {
            i = 0;
        }
        return this.d.hashCode() + xg6.a(this.c, (hashCode + i) * 31, 31);
    }
}
