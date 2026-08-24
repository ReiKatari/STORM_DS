package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q70  reason: default package */
/* loaded from: classes.dex */
public final class q70 extends e74 {
    public final s70 a;

    public q70(s70 s70Var) {
        this.a = s70Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z64, t70] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? z64Var = new z64();
        z64Var.k0 = this.a;
        return z64Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof q70) {
                if (!nb3.k(this.a, ((q70) obj).a)) {
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
        t70 t70Var = (t70) z64Var;
        s70 s70Var = t70Var.k0;
        if (s70Var != null) {
            s70Var.a.j(t70Var);
        }
        s70 s70Var2 = this.a;
        if (s70Var2 != null) {
            s70Var2.a.b(t70Var);
        }
        t70Var.k0 = s70Var2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
