package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cy2  reason: default package */
/* loaded from: classes.dex */
public final class cy2 extends e74 {
    public final c40 a;

    public cy2(c40 c40Var) {
        this.a = c40Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z64, dy2] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? z64Var = new z64();
        z64Var.k0 = this.a;
        return z64Var;
    }

    public final boolean equals(Object obj) {
        cy2 cy2Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof cy2) {
            cy2Var = (cy2) obj;
        } else {
            cy2Var = null;
        }
        if (cy2Var == null) {
            return false;
        }
        return this.a.equals(cy2Var.a);
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        ((dy2) z64Var).k0 = this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a.a);
    }
}
