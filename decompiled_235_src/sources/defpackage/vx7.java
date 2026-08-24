package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vx7  reason: default package */
/* loaded from: classes.dex */
public final class vx7 extends z64 implements jm3 {
    public wj1 k0;
    public eo2 l0;

    @Override // defpackage.jm3
    public final f34 c(final g34 g34Var, x24 x24Var, long j) {
        int j2;
        int i = 0;
        if (this.k0 != wj1.Vertical) {
            j2 = 0;
        } else {
            j2 = q21.j(j);
        }
        if (this.k0 == wj1.Horizontal) {
            i = q21.i(j);
        }
        final dx4 y = x24Var.y(s21.a(j2, q21.h(j), i, q21.g(j)));
        final int q = gi2.q(y.A, q21.j(j), q21.h(j));
        final int q2 = gi2.q(y.B, q21.i(j), q21.g(j));
        return g34Var.K(q, q2, zt1.A, new qn2() { // from class: ux7
            @Override // defpackage.qn2
            public final Object g(Object obj) {
                eo2 eo2Var = vx7.this.l0;
                dx4 dx4Var = y;
                cx4.k((cx4) obj, dx4Var, ((i93) eo2Var.o(new q93(((q - dx4Var.A) << 32) | ((q2 - dx4Var.B) & 4294967295L)), g34Var.getLayoutDirection())).a);
                return jg7.a;
            }
        });
    }
}
