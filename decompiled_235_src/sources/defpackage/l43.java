package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l43  reason: default package */
/* loaded from: classes.dex */
public final class l43 extends e74 {
    public final r94 a;
    public final n43 b;

    public l43(r94 r94Var, n43 n43Var) {
        this.a = r94Var;
        this.b = n43Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [zg1, z64, m43] */
    @Override // defpackage.e74
    public final z64 e() {
        xg1 a = this.b.a(this.a);
        ?? zg1Var = new zg1();
        zg1Var.m0 = a;
        zg1Var.R0(a);
        return zg1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l43)) {
            return false;
        }
        l43 l43Var = (l43) obj;
        if (nb3.k(this.a, l43Var.a) && nb3.k(this.b, l43Var.b)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        m43 m43Var = (m43) z64Var;
        xg1 a = this.b.a(this.a);
        m43Var.S0(m43Var.m0);
        m43Var.m0 = a;
        m43Var.R0(a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
