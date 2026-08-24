package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ym4  reason: default package */
/* loaded from: classes.dex */
public final class ym4 extends ao4 {
    public static final ym4 d = new ao4(0, 2, 1);

    @Override // defpackage.ao4
    public final void c(ls0 ls0Var, nt ntVar, pk6 pk6Var, jb1 jb1Var, bo4 bo4Var) {
        int i;
        int i2;
        n93 n93Var = (n93) ls0Var.g(0);
        int c = pk6Var.c((sq2) ls0Var.g(1));
        if (pk6Var.t >= c) {
            tx0.a("Check failed");
        }
        xk2.F(pk6Var, ntVar, c);
        int i3 = pk6Var.t;
        int i4 = pk6Var.v;
        while (i4 >= 0 && !pk6Var.y(i4)) {
            i4 = pk6Var.E(pk6Var.b, i4);
        }
        int i5 = i4 + 1;
        int i6 = 0;
        while (i5 < i3) {
            if (pk6Var.v(i3, i5)) {
                if (pk6Var.y(i5)) {
                    i6 = 0;
                }
                i5++;
            } else {
                if (pk6Var.y(i5)) {
                    i2 = 1;
                } else {
                    i2 = pk6Var.b[(pk6Var.r(i5) * 5) + 1] & 67108863;
                }
                i6 += i2;
                i5 += pk6Var.u(i5);
            }
        }
        while (true) {
            i = pk6Var.t;
            if (i >= c) {
                break;
            } else if (pk6Var.v(c, i)) {
                int i7 = pk6Var.t;
                if (i7 < pk6Var.u && (pk6Var.b[(pk6Var.r(i7) * 5) + 1] & 1073741824) != 0) {
                    ntVar.d(pk6Var.D(pk6Var.t));
                    i6 = 0;
                }
                pk6Var.P();
            } else {
                i6 += pk6Var.L();
            }
        }
        if (i != c) {
            tx0.a("Check failed");
        }
        n93Var.a = i6;
    }
}
