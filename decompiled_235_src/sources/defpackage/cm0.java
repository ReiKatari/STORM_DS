package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cm0  reason: default package */
/* loaded from: classes.dex */
public final class cm0 extends xl0 {
    public final fo2 X;

    public cm0(fo2 fo2Var, le2 le2Var, l61 l61Var, int i, m80 m80Var) {
        super(i, m80Var, l61Var, le2Var);
        this.X = fo2Var;
    }

    @Override // defpackage.wl0
    public final wl0 f(l61 l61Var, int i, m80 m80Var) {
        return new cm0(this.X, this.R, l61Var, i, m80Var);
    }

    @Override // defpackage.xl0
    public final Object j(ne2 ne2Var, r41 r41Var) {
        Object C = g04.C(new zl0(this, ne2Var, null), r41Var);
        if (C == x61.COROUTINE_SUSPENDED) {
            return C;
        }
        return jg7.a;
    }
}
