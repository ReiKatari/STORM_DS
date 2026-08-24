package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lt  reason: default package */
/* loaded from: classes.dex */
public final class lt extends e74 {
    public final boolean a;
    public final qn2 b;

    public lt(qn2 qn2Var, boolean z) {
        this.a = z;
        this.b = qn2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z64, o51] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? z64Var = new z64();
        z64Var.k0 = this.a;
        z64Var.l0 = this.b;
        return z64Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lt) {
                lt ltVar = (lt) obj;
                if (this.a != ltVar.a || this.b != ltVar.b) {
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
        o51 o51Var = (o51) z64Var;
        o51Var.k0 = this.a;
        o51Var.l0 = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
