package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oq4  reason: default package */
/* loaded from: classes.dex */
public final class oq4 extends e74 {
    public final lq4 a;

    public oq4(lq4 lq4Var) {
        this.a = lq4Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [rq4, z64] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? z64Var = new z64();
        z64Var.k0 = this.a;
        return z64Var;
    }

    public final boolean equals(Object obj) {
        oq4 oq4Var;
        if (obj instanceof oq4) {
            oq4Var = (oq4) obj;
        } else {
            oq4Var = null;
        }
        if (oq4Var == null) {
            return false;
        }
        return nb3.k(this.a, oq4Var.a);
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        ((rq4) z64Var).k0 = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
