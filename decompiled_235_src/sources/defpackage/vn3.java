package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vn3  reason: default package */
/* loaded from: classes.dex */
public final class vn3 extends e74 {
    public final float a;
    public final boolean b;

    public vn3(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z64, wn3] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? z64Var = new z64();
        z64Var.k0 = this.a;
        z64Var.l0 = this.b;
        return z64Var;
    }

    public final boolean equals(Object obj) {
        vn3 vn3Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof vn3) {
            vn3Var = (vn3) obj;
        } else {
            vn3Var = null;
        }
        if (vn3Var != null && this.a == vn3Var.a && this.b == vn3Var.b) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        wn3 wn3Var = (wn3) z64Var;
        wn3Var.k0 = this.a;
        wn3Var.l0 = this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
