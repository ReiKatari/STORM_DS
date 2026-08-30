package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r36  reason: default package */
/* loaded from: classes.dex */
public final class r36 extends dz3 {
    public final w36 a;

    public r36(w36 w36Var) {
        this.a = w36Var;
    }

    @Override // defpackage.dz3
    public final yy3 c() {
        return new q36(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof r36) && this.a == ((r36) obj).a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        q36 q36Var = (q36) yy3Var;
        w36 w36Var = q36Var.l0;
        w36 w36Var2 = this.a;
        if (w36Var2 != w36Var) {
            w36Var.A.setValue(Boolean.FALSE);
            q36Var.l0 = w36Var2;
            w36Var2.A.setValue(Boolean.valueOf(q36Var.i0));
            if (q36Var.i0) {
                q36Var.U0();
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
