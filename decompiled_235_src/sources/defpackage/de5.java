package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: de5  reason: default package */
/* loaded from: classes.dex */
public final class de5 implements rp6, le2, ro2 {
    public final /* synthetic */ rp6 A;

    public de5(tp6 tp6Var) {
        this.A = tp6Var;
    }

    @Override // defpackage.le2
    public final Object b(ne2 ne2Var, r41 r41Var) {
        return this.A.b(ne2Var, r41Var);
    }

    @Override // defpackage.ro2
    public final le2 c(l61 l61Var, int i, m80 m80Var) {
        if (((i < 0 || i >= 2) && i != -2) || m80Var != m80.DROP_OLDEST) {
            return pf6.d(this, l61Var, i, m80Var);
        }
        return this;
    }

    @Override // defpackage.rp6
    public final Object getValue() {
        return this.A.getValue();
    }
}
