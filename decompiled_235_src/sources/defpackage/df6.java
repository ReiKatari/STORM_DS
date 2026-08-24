package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: df6  reason: default package */
/* loaded from: classes.dex */
public final class df6 extends e74 {
    public final if6 a;

    public df6(if6 if6Var) {
        this.a = if6Var;
    }

    @Override // defpackage.e74
    public final z64 e() {
        return new cf6(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof df6) && this.a == ((df6) obj).a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        cf6 cf6Var = (cf6) z64Var;
        if6 if6Var = cf6Var.m0;
        if6 if6Var2 = this.a;
        if (if6Var2 != if6Var) {
            if6Var.A.setValue(Boolean.FALSE);
            cf6Var.m0 = if6Var2;
            if6Var2.A.setValue(Boolean.valueOf(cf6Var.j0));
            if (cf6Var.j0) {
                cf6Var.U0();
            }
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SharedBoundsNodeElement(sharedElementState=" + this.a + ')';
    }
}
