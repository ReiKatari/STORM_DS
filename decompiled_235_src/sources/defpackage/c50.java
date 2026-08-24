package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c50  reason: default package */
/* loaded from: classes.dex */
public final class c50 extends e74 {
    public final qn2 a;

    public c50(qn2 qn2Var) {
        this.a = qn2Var;
    }

    @Override // defpackage.e74
    public final z64 e() {
        return new d50(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c50)) {
            return false;
        }
        if (this.a == ((c50) obj).a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        eg4 eg4Var;
        d50 d50Var = (d50) z64Var;
        qn2 qn2Var = this.a;
        d50Var.k0 = qn2Var;
        if (d50Var.A.j0 && (eg4Var = nc1.d0(d50Var, 2).n0) != null) {
            eg4Var.x1(qn2Var, true);
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
