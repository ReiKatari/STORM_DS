package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z21  reason: default package */
/* loaded from: classes.dex */
public final class z21 extends e74 {
    public final qn2 a;

    public z21(qn2 qn2Var) {
        this.a = qn2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h83, z64, a31] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? h83Var = new h83();
        h83Var.m0 = this.a;
        return h83Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof z21) && ((z21) obj).a == this.a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        a31 a31Var = (a31) z64Var;
        qn2 qn2Var = a31Var.m0;
        qn2 qn2Var2 = this.a;
        if (qn2Var2 != qn2Var) {
            a31Var.m0 = qn2Var2;
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
