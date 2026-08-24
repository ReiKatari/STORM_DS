package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wp3  reason: default package */
/* loaded from: classes.dex */
public final class wp3 extends e74 {
    public final zp3 a;

    public wp3(zp3 zp3Var) {
        this.a = zp3Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z64, xp3] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? z64Var = new z64();
        z64Var.k0 = this.a;
        return z64Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof wp3) && this.a == ((wp3) obj).a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        xp3 xp3Var = (xp3) z64Var;
        zp3 zp3Var = xp3Var.k0;
        zp3 zp3Var2 = this.a;
        if (!nb3.k(zp3Var, zp3Var2) && xp3Var.A.j0) {
            zp3 zp3Var3 = xp3Var.k0;
            zp3Var3.g();
            zp3Var3.b = null;
            xp3Var.k0 = zp3Var2;
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.a + ')';
    }
}
