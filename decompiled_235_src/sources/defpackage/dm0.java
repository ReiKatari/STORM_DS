package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dm0  reason: default package */
/* loaded from: classes.dex */
public final class dm0 extends wl0 {
    public final Iterable R;

    public dm0(Iterable iterable, l61 l61Var, int i, m80 m80Var) {
        super(l61Var, i, m80Var);
        this.R = iterable;
    }

    @Override // defpackage.wl0
    public final Object e(r35 r35Var, r41 r41Var) {
        pb6 pb6Var = new pb6(r35Var);
        for (le2 le2Var : this.R) {
            hv.L(r35Var, null, null, new z(le2Var, pb6Var, null, 15), 3);
        }
        return jg7.a;
    }

    @Override // defpackage.wl0
    public final wl0 f(l61 l61Var, int i, m80 m80Var) {
        return new dm0(this.R, l61Var, i, m80Var);
    }

    @Override // defpackage.wl0
    public final ul0 i(w61 w61Var) {
        z zVar = new z(this, (r41) null, 13);
        m80 m80Var = m80.SUSPEND;
        a71 a71Var = a71.DEFAULT;
        r35 r35Var = new r35(mb3.M(w61Var, this.A), nb3.c(this.B, m80Var, null, 4));
        a71Var.invoke(zVar, r35Var, r35Var);
        return r35Var;
    }
}
