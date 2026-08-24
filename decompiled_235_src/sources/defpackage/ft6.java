package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ft6  reason: default package */
/* loaded from: classes.dex */
public final class ft6 extends e74 {
    public final tm1 a;

    public ft6(tm1 tm1Var) {
        this.a = tm1Var;
    }

    @Override // defpackage.e74
    public final z64 e() {
        return new ny2(nb3.t, this.a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ft6) {
                ft6 ft6Var = (ft6) obj;
                sj sjVar = nb3.t;
                if (!sjVar.equals(sjVar) || !nb3.k(this.a, ft6Var.a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        gt6 gt6Var = (gt6) z64Var;
        sj sjVar = nb3.t;
        if (!nb3.k(gt6Var.l0, sjVar)) {
            gt6Var.l0 = sjVar;
            if (gt6Var.m0) {
                gt6Var.T0();
            }
        }
        gt6Var.k0 = this.a;
    }

    public final int hashCode() {
        int i = 0;
        int e = xg6.e(1022 * 31, false, 31);
        tm1 tm1Var = this.a;
        if (tm1Var != null) {
            i = tm1Var.hashCode();
        }
        return e + i;
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + nb3.t + ", overrideDescendants=false, touchBoundsExpansion=" + this.a + ')';
    }
}
