package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ry4  reason: default package */
/* loaded from: classes.dex */
public final class ry4 extends e74 {
    public final sj a;

    public ry4(sj sjVar) {
        this.a = sjVar;
    }

    @Override // defpackage.e74
    public final z64 e() {
        return new ny2(this.a, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ry4) && this.a.equals(((ry4) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        sy4 sy4Var = (sy4) z64Var;
        sj sjVar = sy4Var.l0;
        sj sjVar2 = this.a;
        if (!nb3.k(sjVar, sjVar2)) {
            sy4Var.l0 = sjVar2;
            if (sy4Var.m0) {
                sy4Var.T0();
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
