package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qy2  reason: default package */
/* loaded from: classes.dex */
public final class qy2 extends e74 {
    public final r94 a;

    public qy2(r94 r94Var) {
        this.a = r94Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z64, uy2] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? z64Var = new z64();
        z64Var.k0 = this.a;
        return z64Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof qy2) && nb3.k(((qy2) obj).a, this.a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        uy2 uy2Var = (uy2) z64Var;
        r94 r94Var = uy2Var.k0;
        r94 r94Var2 = this.a;
        if (!nb3.k(r94Var, r94Var2)) {
            uy2Var.T0();
            uy2Var.k0 = r94Var2;
        }
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
