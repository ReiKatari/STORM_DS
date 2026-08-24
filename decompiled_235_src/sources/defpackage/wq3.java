package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wq3  reason: default package */
/* loaded from: classes.dex */
public final class wq3 extends e74 {
    public final on2 a;
    public final tq3 b;
    public final lo4 c;
    public final boolean d;

    public wq3(on2 on2Var, tq3 tq3Var, lo4 lo4Var, boolean z) {
        this.a = on2Var;
        this.b = tq3Var;
        this.c = lo4Var;
        this.d = z;
    }

    @Override // defpackage.e74
    public final z64 e() {
        return new zq3(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wq3) {
            wq3 wq3Var = (wq3) obj;
            if (this.a == wq3Var.a && nb3.k(this.b, wq3Var.b) && this.c == wq3Var.c && this.d == wq3Var.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        zq3 zq3Var = (zq3) z64Var;
        zq3Var.k0 = this.a;
        zq3Var.l0 = this.b;
        lo4 lo4Var = zq3Var.m0;
        lo4 lo4Var2 = this.c;
        if (lo4Var != lo4Var2) {
            zq3Var.m0 = lo4Var2;
            bl2.G(zq3Var);
        }
        boolean z = zq3Var.n0;
        boolean z2 = this.d;
        if (z == z2) {
            return;
        }
        zq3Var.n0 = z2;
        zq3Var.R0();
        bl2.G(zq3Var);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Boolean.hashCode(false) + xg6.e((this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31, this.d, 31);
    }
}
