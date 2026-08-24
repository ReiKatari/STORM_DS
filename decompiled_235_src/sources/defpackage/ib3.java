package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ib3  reason: default package */
/* loaded from: classes.dex */
public final class ib3 extends e74 {
    public final gb3 a;

    public ib3(gb3 gb3Var) {
        this.a = gb3Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hb3, z64, kb3] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? hb3Var = new hb3(0);
        hb3Var.l0 = this.a;
        hb3Var.m0 = true;
        return hb3Var;
    }

    public final boolean equals(Object obj) {
        ib3 ib3Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ib3) {
            ib3Var = (ib3) obj;
        } else {
            ib3Var = null;
        }
        if (ib3Var != null && this.a == ib3Var.a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        kb3 kb3Var = (kb3) z64Var;
        kb3Var.l0 = this.a;
        kb3Var.m0 = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }
}
