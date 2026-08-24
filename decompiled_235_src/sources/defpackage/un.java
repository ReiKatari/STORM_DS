package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: un  reason: default package */
/* loaded from: classes.dex */
public final class un<S> extends e74 {
    public final w97 a;
    public final qa4 b;
    public final yn c;

    public un(w97 w97Var, qa4 qa4Var, yn ynVar) {
        this.a = w97Var;
        this.b = qa4Var;
        this.c = ynVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xn, hb3, z64] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? hb3Var = new hb3(1);
        hb3Var.l0 = this.a;
        hb3Var.m0 = this.b;
        hb3Var.n0 = this.c;
        hb3Var.o0 = -9223372034707292160L;
        return hb3Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof un) {
            un unVar = (un) obj;
            if (nb3.k(unVar.a, this.a) && unVar.b.equals(this.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        xn xnVar = (xn) z64Var;
        xnVar.l0 = this.a;
        xnVar.m0 = this.b;
        xnVar.n0 = this.c;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.c.hashCode() * 31;
        w97 w97Var = this.a;
        if (w97Var != null) {
            i = w97Var.hashCode();
        } else {
            i = 0;
        }
        return this.b.hashCode() + ((hashCode + i) * 31);
    }
}
