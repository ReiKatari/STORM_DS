package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mq4  reason: default package */
/* loaded from: classes.dex */
public final class mq4 extends e74 {
    public final lq4 a;

    public mq4(lq4 lq4Var) {
        this.a = lq4Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nq4, h83, z64] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? h83Var = new h83();
        h83Var.m0 = this.a;
        return h83Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mq4)) {
            return false;
        }
        return nb3.k(((mq4) obj).a, this.a);
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        nq4 nq4Var = (nq4) z64Var;
        lq4 lq4Var = nq4Var.m0;
        lq4 lq4Var2 = this.a;
        if (!nb3.k(lq4Var2, lq4Var)) {
            nq4Var.m0 = lq4Var2;
            nq4Var.S0();
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
