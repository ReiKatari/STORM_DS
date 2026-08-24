package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: op3  reason: default package */
/* loaded from: classes.dex */
public final class op3 extends e74 {
    public final tp3 a;
    public final p70 b;
    public final lo4 c;

    public op3(tp3 tp3Var, p70 p70Var, lo4 lo4Var) {
        this.a = tp3Var;
        this.b = p70Var;
        this.c = lo4Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [sp3, z64] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? z64Var = new z64();
        z64Var.k0 = this.a;
        z64Var.l0 = this.b;
        z64Var.m0 = this.c;
        return z64Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof op3) {
                op3 op3Var = (op3) obj;
                if (!nb3.k(this.a, op3Var.a) || !nb3.k(this.b, op3Var.b) || this.c != op3Var.c) {
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
        sp3 sp3Var = (sp3) z64Var;
        sp3Var.k0 = this.a;
        sp3Var.l0 = this.b;
        sp3Var.m0 = this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + xg6.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, false, 31);
    }
}
