package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zl3  reason: default package */
/* loaded from: classes.dex */
public final class zl3 extends e74 {
    public final fo2 a;

    public zl3(fo2 fo2Var) {
        this.a = fo2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z64, im3] */
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
        if (!(obj instanceof zl3)) {
            return false;
        }
        if (this.a == ((zl3) obj).a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        ((im3) z64Var).k0 = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
