package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zi3  reason: default package */
/* loaded from: classes.dex */
public final class zi3 extends yy3 implements gk1 {
    public bj3 j0;

    @Override // defpackage.yy3
    public final void J0() {
        this.j0.getClass();
    }

    @Override // defpackage.yy3
    public final void K0() {
        bj3 bj3Var = this.j0;
        bj3Var.e();
        bj3Var.b = null;
    }

    @Override // defpackage.gk1
    public final void T(xf3 xf3Var) {
        ArrayList arrayList = (ArrayList) this.j0.h;
        if (arrayList.size() <= 0) {
            xf3Var.a();
        } else {
            ej6.j(arrayList.get(0));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zi3) && b53.x(this.j0, ((zi3) obj).j0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.j0.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.j0 + ')';
    }
}
