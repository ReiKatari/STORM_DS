package h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class d2 implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ i2 B;

    public /* synthetic */ d2(i2 i2Var, int i2) {
        this.A = i2;
        this.B = i2Var;
    }

    @Override // mc.a
    public final Object b() {
        switch (this.A) {
            case 0:
                return Boolean.valueOf(this.B.f1777h0);
            default:
                g3.g0 g0Var = this.B.J0;
                if (!g0Var.A.f1777h0) {
                    return null;
                }
                g3.e0 T0 = g0Var.T0();
                if (!T0.getHasFocus()) {
                    return null;
                }
                if (T0.isFocused()) {
                    return g0Var.R0(null);
                }
                g3.g0 f8 = ((g3.p) ((b4.x) a4.l.u(g0Var)).getFocusOwner()).f();
                if (f8 == null) {
                    return null;
                }
                return f8.R0(a4.l.s(g0Var));
        }
    }
}
