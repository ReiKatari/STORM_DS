package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xc2  reason: default package */
/* loaded from: classes.dex */
public final class xc2 extends dz3 {
    public final wc2 a;

    public xc2(wc2 wc2Var) {
        this.a = wc2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, zc2] */
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
        if ((obj instanceof xc2) && b53.x(this.a, ((xc2) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        zc2 zc2Var = (zc2) yy3Var;
        zc2Var.j0.a.k(zc2Var);
        wc2 wc2Var = this.a;
        zc2Var.j0 = wc2Var;
        wc2Var.a.b(zc2Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.a + ')';
    }
}
