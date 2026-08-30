package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yi3  reason: default package */
/* loaded from: classes.dex */
public final class yi3 extends dz3 {
    public final bj3 a;

    public yi3(bj3 bj3Var) {
        this.a = bj3Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, zi3] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? yy3Var = new yy3();
        yy3Var.j0 = this.a;
        return yy3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof yi3) && this.a == ((yi3) obj).a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        zi3 zi3Var = (zi3) yy3Var;
        bj3 bj3Var = zi3Var.j0;
        bj3 bj3Var2 = this.a;
        if (!b53.x(bj3Var, bj3Var2) && zi3Var.A.i0) {
            bj3 bj3Var3 = zi3Var.j0;
            bj3Var3.e();
            bj3Var3.b = null;
            zi3Var.j0 = bj3Var2;
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.a + ')';
    }
}
