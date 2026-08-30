package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: np4  reason: default package */
/* loaded from: classes.dex */
public final class np4 extends dz3 {
    public final gj a;

    public np4(gj gjVar) {
        this.a = gjVar;
    }

    @Override // defpackage.dz3
    public final yy3 c() {
        return new ms2(this.a, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof np4) && this.a.equals(((np4) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        op4 op4Var = (op4) yy3Var;
        gj gjVar = op4Var.k0;
        gj gjVar2 = this.a;
        if (!b53.x(gjVar, gjVar2)) {
            op4Var.k0 = gjVar2;
            if (op4Var.l0) {
                op4Var.T0();
            }
        }
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.b * 31);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.a + ", overrideDescendants=false)";
    }
}
