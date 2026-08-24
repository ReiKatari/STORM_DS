package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ul4  reason: default package */
/* loaded from: classes.dex */
public final class ul4 extends e74 {
    public final qn2 a;

    public ul4(qn2 qn2Var) {
        this.a = qn2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z64, vl4] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? z64Var = new z64();
        z64Var.k0 = this.a;
        z64Var.l0 = -9223372034707292160L;
        return z64Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul4)) {
            return false;
        }
        if (this.a == ((ul4) obj).a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        vl4 vl4Var = (vl4) z64Var;
        vl4Var.k0 = this.a;
        vl4Var.l0 = -9223372034707292160L;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
