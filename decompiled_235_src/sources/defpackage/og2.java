package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: og2  reason: default package */
/* loaded from: classes.dex */
public final class og2 extends e74 {
    public final qn2 a;

    public og2(qn2 qn2Var) {
        this.a = qn2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z64, pg2] */
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
        if (!(obj instanceof og2)) {
            return false;
        }
        if (this.a == ((og2) obj).a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        ((pg2) z64Var).k0 = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
