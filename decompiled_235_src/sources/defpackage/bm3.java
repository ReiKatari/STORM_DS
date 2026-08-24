package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bm3  reason: default package */
/* loaded from: classes.dex */
public final class bm3 extends e74 {
    public final String a;

    public bm3(String str) {
        this.a = str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [cm3, z64] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? z64Var = new z64();
        z64Var.k0 = this.a;
        return z64Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof bm3) || !this.a.equals(((bm3) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        ((cm3) z64Var).k0 = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + ((Object) this.a) + ')';
    }
}
