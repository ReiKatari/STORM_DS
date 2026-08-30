package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xd4  reason: default package */
/* loaded from: classes.dex */
public final class xd4 extends ze4 {
    public static final xd4 d = new ze4(0, 2, 1);

    @Override // defpackage.ze4
    public final void c(yp0 yp0Var, xs xsVar, z86 z86Var, r8 r8Var, af4 af4Var) {
        int i;
        int i2;
        f33 f33Var = (f33) yp0Var.g(0);
        int c = z86Var.c((mk2) yp0Var.g(1));
        if (z86Var.t >= c) {
            xu0.a("Check failed");
        }
        cg2.S(z86Var, xsVar, c);
        int i3 = z86Var.t;
        int i4 = z86Var.v;
        while (i4 >= 0 && !z86Var.y(i4)) {
            i4 = z86Var.E(z86Var.b, i4);
        }
        int i5 = i4 + 1;
        int i6 = 0;
        while (i5 < i3) {
            if (z86Var.v(i3, i5)) {
                if (z86Var.y(i5)) {
                    i6 = 0;
                }
                i5++;
            } else {
                if (z86Var.y(i5)) {
                    i2 = 1;
                } else {
                    i2 = z86Var.b[(z86Var.r(i5) * 5) + 1] & 67108863;
                }
                i6 += i2;
                i5 += z86Var.u(i5);
            }
        }
        while (true) {
            i = z86Var.t;
            if (i >= c) {
                break;
            } else if (z86Var.v(c, i)) {
                int i7 = z86Var.t;
                if (i7 < z86Var.u && (z86Var.b[(z86Var.r(i7) * 5) + 1] & 1073741824) != 0) {
                    xsVar.d(z86Var.D(z86Var.t));
                    i6 = 0;
                }
                z86Var.P();
            } else {
                i6 += z86Var.L();
            }
        }
        if (i != c) {
            xu0.a("Check failed");
        }
        f33Var.a = i6;
    }
}
