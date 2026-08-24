package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l97  reason: default package */
/* loaded from: classes.dex */
public final class l97 extends e74 {
    public final ag1 a;
    public final h37 b;

    public l97(ag1 ag1Var, h37 h37Var) {
        this.a = ag1Var;
        this.b = h37Var;
    }

    @Override // defpackage.e74
    public final z64 e() {
        return new o97(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l97.class == obj.getClass()) {
            l97 l97Var = (l97) obj;
            if (nb3.k(this.a, l97Var.a) && this.b == l97Var.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        o97 o97Var = (o97) z64Var;
        o97Var.n0 = this.b;
        ag1 ag1Var = o97Var.m0;
        ag1 ag1Var2 = this.a;
        if (nb3.k(ag1Var, ag1Var2) && o97Var.o0) {
            return;
        }
        o97Var.m0 = ag1Var2;
        o97Var.o0 = true;
        o97Var.s0.T0();
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + xg6.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, false, 31);
    }
}
