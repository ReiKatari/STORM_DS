package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g86  reason: default package */
/* loaded from: classes.dex */
public final class g86 extends e74 {
    public final s76 a;
    public final boolean b;

    public g86(s76 s76Var, boolean z) {
        this.a = s76Var;
        this.b = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z64, n76] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? z64Var = new z64();
        z64Var.k0 = this.a;
        z64Var.l0 = this.b;
        return z64Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g86) {
            g86 g86Var = (g86) obj;
            if (nb3.k(this.a, g86Var.a) && this.b == g86Var.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        n76 n76Var = (n76) z64Var;
        n76Var.k0 = this.a;
        n76Var.l0 = this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + xg6.e(this.a.hashCode() * 31, false, 31);
    }
}
