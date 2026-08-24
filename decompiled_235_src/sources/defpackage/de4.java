package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: de4  reason: default package */
/* loaded from: classes.dex */
public final class de4 extends e74 {
    public final ae4 a;

    public de4(ae4 ae4Var) {
        this.a = ae4Var;
    }

    @Override // defpackage.e74
    public final z64 e() {
        return new ge4(this.a, null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof de4) || !nb3.k(((de4) obj).a, this.a)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        ge4 ge4Var = (ge4) z64Var;
        ge4Var.k0 = this.a;
        eb ebVar = ge4Var.l0;
        if (((ge4) ebVar.B) == ge4Var) {
            ebVar.B = null;
        }
        eb ebVar2 = new eb(14);
        ge4Var.l0 = ebVar2;
        if (ge4Var.j0) {
            ebVar2.B = ge4Var;
            ebVar2.L = null;
            ge4Var.m0 = null;
            ebVar2.R = new pj(ge4Var, 14);
            ebVar2.X = ge4Var.F0();
        }
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
