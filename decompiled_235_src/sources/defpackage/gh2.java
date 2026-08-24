package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gh2  reason: default package */
/* loaded from: classes.dex */
public final class gh2 extends e74 {
    public final jh2 a;

    public gh2(jh2 jh2Var) {
        this.a = jh2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [lh2, z64] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? z64Var = new z64();
        z64Var.k0 = this.a;
        return z64Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof gh2) || !this.a.equals(((gh2) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        ((lh2) z64Var).k0 = this.a;
    }

    public final int hashCode() {
        return this.a.A.hashCode();
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.a + ')';
    }
}
