package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yl0  reason: default package */
/* loaded from: classes.dex */
public final class yl0 extends xl0 {
    public yl0(le2 le2Var, l61 l61Var, int i, m80 m80Var, int i2) {
        super((i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? m80.SUSPEND : m80Var, (i2 & 2) != 0 ? vt1.A : l61Var, le2Var);
    }

    @Override // defpackage.wl0
    public final wl0 f(l61 l61Var, int i, m80 m80Var) {
        return new xl0(i, m80Var, l61Var, this.R);
    }

    @Override // defpackage.wl0
    public final le2 g() {
        return this.R;
    }

    @Override // defpackage.xl0
    public final Object j(ne2 ne2Var, r41 r41Var) {
        Object b = this.R.b(ne2Var, r41Var);
        if (b == x61.COROUTINE_SUSPENDED) {
            return b;
        }
        return jg7.a;
    }
}
