package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lc2  reason: default package */
/* loaded from: classes.dex */
public final class lc2 extends e74 {
    public final wj1 a;
    public final float b;

    public lc2(wj1 wj1Var, float f) {
        this.a = wj1Var;
        this.b = f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z64, mc2] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? z64Var = new z64();
        z64Var.k0 = this.a;
        z64Var.l0 = this.b;
        return z64Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc2)) {
            return false;
        }
        lc2 lc2Var = (lc2) obj;
        if (this.a == lc2Var.a && this.b == lc2Var.b) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        mc2 mc2Var = (mc2) z64Var;
        mc2Var.k0 = this.a;
        mc2Var.l0 = this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
