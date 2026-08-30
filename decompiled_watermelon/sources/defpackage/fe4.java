package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fe4  reason: default package */
/* loaded from: classes.dex */
public final class fe4 extends ze4 {
    public static final fe4 e = new fe4(1, 2, 0);
    public static final fe4 f = new fe4(1, 1, 1);
    public static final fe4 g = new fe4(1, 2, 2);
    public static final fe4 h = new fe4(1, 1, 3);
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fe4(int i, int i2, int i3) {
        super(i, i2);
        this.d = i3;
    }

    @Override // defpackage.ze4
    public final void c(yp0 yp0Var, xs xsVar, z86 z86Var, r8 r8Var, af4 af4Var) {
        switch (this.d) {
            case 0:
                Object c = ((ki2) yp0Var.g(0)).c();
                mk2 mk2Var = (mk2) yp0Var.g(1);
                int f2 = yp0Var.f(0);
                mk2Var.getClass();
                z86Var.U(z86Var.c(mk2Var), c);
                xsVar.f(f2, c);
                xsVar.d(c);
                return;
            case 1:
                mk2 mk2Var2 = (mk2) yp0Var.g(0);
                int f3 = yp0Var.f(0);
                xsVar.s();
                mk2Var2.getClass();
                xsVar.c(f3, z86Var.D(z86Var.c(mk2Var2)));
                return;
            case 2:
                Object g2 = yp0Var.g(0);
                mk2 mk2Var3 = (mk2) yp0Var.g(1);
                int f4 = yp0Var.f(0);
                if (g2 instanceof wk2) {
                    wk2 wk2Var = (wk2) g2;
                    ((o24) r8Var.e).b(wk2Var);
                    ((e24) r8Var.d).a(wk2Var);
                }
                Object K = z86Var.K(z86Var.c(mk2Var3), f4, g2);
                if (K instanceof wk2) {
                    r8Var.e((wk2) K);
                    return;
                } else if (K instanceof m55) {
                    ((m55) K).c();
                    return;
                } else {
                    return;
                }
            default:
                Object g3 = yp0Var.g(0);
                int f5 = yp0Var.f(0);
                if (g3 instanceof wk2) {
                    wk2 wk2Var2 = (wk2) g3;
                    ((o24) r8Var.e).b(wk2Var2);
                    ((e24) r8Var.d).a(wk2Var2);
                }
                Object K2 = z86Var.K(z86Var.t, f5, g3);
                if (K2 instanceof wk2) {
                    r8Var.e((wk2) K2);
                    return;
                } else if (K2 instanceof m55) {
                    ((m55) K2).c();
                    return;
                } else {
                    return;
                }
        }
    }

    @Override // defpackage.ze4
    public mk2 d(yp0 yp0Var) {
        switch (this.d) {
            case 0:
                return (mk2) yp0Var.g(1);
            case 1:
                return (mk2) yp0Var.g(0);
            default:
                return super.d(yp0Var);
        }
    }
}
