package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: au3  reason: default package */
/* loaded from: classes.dex */
public final class au3 implements fu3, w61 {
    public final ut3 A;
    public final l61 B;

    public au3(ut3 ut3Var, l61 l61Var) {
        l61Var.getClass();
        this.A = ut3Var;
        this.B = l61Var;
        if (ut3Var.b() == tt3.DESTROYED) {
            yh2.m(l61Var, null);
        }
    }

    @Override // defpackage.w61
    public final l61 A() {
        return this.B;
    }

    @Override // defpackage.fu3
    public final void h(hu3 hu3Var, st3 st3Var) {
        ut3 ut3Var = this.A;
        if (ut3Var.b().compareTo(tt3.DESTROYED) <= 0) {
            ut3Var.c(this);
            yh2.m(this.B, null);
        }
    }
}
