package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qo1  reason: default package */
/* loaded from: classes.dex */
public final class qo1 extends e74 {
    public final qn2 a;

    public qo1(qn2 qn2Var) {
        this.a = qn2Var;
    }

    @Override // defpackage.e74
    public final z64 e() {
        return new na0(new oa0(), this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qo1)) {
            return false;
        }
        if (this.a == ((qo1) obj).a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        na0 na0Var = (na0) z64Var;
        na0Var.m0 = this.a;
        na0Var.R0();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
