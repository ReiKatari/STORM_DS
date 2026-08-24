package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tx7  reason: default package */
/* loaded from: classes.dex */
public final class tx7 extends e74 {
    public final wj1 a;
    public final eo2 b;
    public final Object c;

    public tx7(wj1 wj1Var, eo2 eo2Var, Object obj) {
        this.a = wj1Var;
        this.b = eo2Var;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [vx7, z64] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? z64Var = new z64();
        z64Var.k0 = this.a;
        z64Var.l0 = this.b;
        return z64Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && tx7.class == obj.getClass()) {
                tx7 tx7Var = (tx7) obj;
                if (this.a != tx7Var.a || !nb3.k(this.c, tx7Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        vx7 vx7Var = (vx7) z64Var;
        vx7Var.k0 = this.a;
        vx7Var.l0 = this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + xg6.e(this.a.hashCode() * 31, false, 31);
    }
}
