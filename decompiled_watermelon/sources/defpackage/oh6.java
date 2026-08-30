package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oh6  reason: default package */
/* loaded from: classes.dex */
public final class oh6 extends dz3 {
    public final oi1 a;

    public oh6(oi1 oi1Var) {
        this.a = oi1Var;
    }

    @Override // defpackage.dz3
    public final yy3 c() {
        return new ms2(pu.v, this.a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof oh6) {
                oh6 oh6Var = (oh6) obj;
                gj gjVar = pu.v;
                if (!gjVar.equals(gjVar) || !b53.x(this.a, oh6Var.a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        ph6 ph6Var = (ph6) yy3Var;
        gj gjVar = pu.v;
        if (!b53.x(ph6Var.k0, gjVar)) {
            ph6Var.k0 = gjVar;
            if (ph6Var.l0) {
                ph6Var.T0();
            }
        }
        ph6Var.j0 = this.a;
    }

    public final int hashCode() {
        int i = 0;
        int c = ej6.c(1022 * 31, false, 31);
        oi1 oi1Var = this.a;
        if (oi1Var != null) {
            i = oi1Var.hashCode();
        }
        return c + i;
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + pu.v + ", overrideDescendants=false, touchBoundsExpansion=" + this.a + ')';
    }
}
