package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f70  reason: default package */
/* loaded from: classes.dex */
public final class f70 extends e74 {
    public final e40 a;
    public final boolean b;

    public f70(e40 e40Var, boolean z) {
        this.a = e40Var;
        this.b = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g70, z64] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? z64Var = new z64();
        z64Var.k0 = this.a;
        z64Var.l0 = this.b;
        return z64Var;
    }

    public final boolean equals(Object obj) {
        f70 f70Var;
        if (this != obj) {
            if (obj instanceof f70) {
                f70Var = (f70) obj;
            } else {
                f70Var = null;
            }
            if (f70Var != null && this.a.equals(f70Var.a) && this.b == f70Var.b) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        g70 g70Var = (g70) z64Var;
        g70Var.k0 = this.a;
        g70Var.l0 = this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
