package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gn4  reason: default package */
/* loaded from: classes.dex */
public final class gn4 extends ao4 {
    public static final gn4 e = new gn4(1, 2, 0);
    public static final gn4 f = new gn4(1, 1, 1);
    public static final gn4 g = new gn4(1, 2, 2);
    public static final gn4 h = new gn4(1, 1, 3);
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gn4(int i, int i2, int i3) {
        super(i, i2);
        this.d = i3;
    }

    @Override // defpackage.ao4
    public final void c(ls0 ls0Var, nt ntVar, pk6 pk6Var, jb1 jb1Var, bo4 bo4Var) {
        switch (this.d) {
            case 0:
                Object c = ((on2) ls0Var.g(0)).c();
                sq2 sq2Var = (sq2) ls0Var.g(1);
                int f2 = ls0Var.f(0);
                sq2Var.getClass();
                pk6Var.U(pk6Var.c(sq2Var), c);
                ntVar.k(f2, c);
                ntVar.d(c);
                return;
            case 1:
                sq2 sq2Var2 = (sq2) ls0Var.g(0);
                int f3 = ls0Var.f(0);
                ntVar.j();
                sq2Var2.getClass();
                ntVar.c(f3, pk6Var.D(pk6Var.c(sq2Var2)));
                return;
            case 2:
                Object g2 = ls0Var.g(0);
                sq2 sq2Var3 = (sq2) ls0Var.g(1);
                int f4 = ls0Var.f(0);
                if (g2 instanceof br2) {
                    br2 br2Var = (br2) g2;
                    ((ua4) jb1Var.e).b(br2Var);
                    ((ka4) jb1Var.d).a(br2Var);
                }
                Object K = pk6Var.K(g2, pk6Var.c(sq2Var3), f4);
                if (K instanceof br2) {
                    jb1Var.e((br2) K);
                    return;
                } else if (K instanceof cf5) {
                    ((cf5) K).c();
                    return;
                } else {
                    return;
                }
            default:
                Object g3 = ls0Var.g(0);
                int f5 = ls0Var.f(0);
                if (g3 instanceof br2) {
                    br2 br2Var2 = (br2) g3;
                    ((ua4) jb1Var.e).b(br2Var2);
                    ((ka4) jb1Var.d).a(br2Var2);
                }
                Object K2 = pk6Var.K(g3, pk6Var.t, f5);
                if (K2 instanceof br2) {
                    jb1Var.e((br2) K2);
                    return;
                } else if (K2 instanceof cf5) {
                    ((cf5) K2).c();
                    return;
                } else {
                    return;
                }
        }
    }

    @Override // defpackage.ao4
    public sq2 d(ls0 ls0Var) {
        switch (this.d) {
            case 0:
                return (sq2) ls0Var.g(1);
            case 1:
                return (sq2) ls0Var.g(0);
            default:
                return super.d(ls0Var);
        }
    }
}
