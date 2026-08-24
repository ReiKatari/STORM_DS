package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ih7  reason: default package */
/* loaded from: classes.dex */
final class ih7 extends e74 {
    public final float a;
    public final float b;

    public ih7(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [jh7, z64] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? z64Var = new z64();
        z64Var.k0 = this.a;
        z64Var.l0 = this.b;
        return z64Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ih7) {
            ih7 ih7Var = (ih7) obj;
            if (om1.b(this.a, ih7Var.a) && om1.b(this.b, ih7Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        jh7 jh7Var = (jh7) z64Var;
        jh7Var.k0 = this.a;
        jh7Var.l0 = this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
