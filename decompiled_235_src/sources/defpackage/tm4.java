package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tm4  reason: default package */
/* loaded from: classes.dex */
public final class tm4 extends ao4 {
    public static final tm4 d = new ao4(0, 2, 1);

    @Override // defpackage.ao4
    public final void c(ls0 ls0Var, nt ntVar, pk6 pk6Var, jb1 jb1Var, bo4 bo4Var) {
        sq2 sq2Var = (sq2) ls0Var.g(0);
        Object g = ls0Var.g(1);
        if (g instanceof br2) {
            br2 br2Var = (br2) g;
            ((ua4) jb1Var.e).b(br2Var);
            ((ka4) jb1Var.d).a(br2Var);
        }
        if (pk6Var.n != 0) {
            tx0.a("Can only append a slot if not current inserting");
        }
        int i = pk6Var.i;
        int i2 = pk6Var.j;
        int c = pk6Var.c(sq2Var);
        int g2 = pk6Var.g(pk6Var.b, pk6Var.r(c + 1));
        pk6Var.i = g2;
        pk6Var.j = g2;
        pk6Var.x(1, c);
        if (i >= g2) {
            i++;
            i2++;
        }
        pk6Var.c[g2] = g;
        pk6Var.i = i;
        pk6Var.j = i2;
    }
}
