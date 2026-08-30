package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ie4  reason: default package */
/* loaded from: classes.dex */
public final class ie4 extends ze4 {
    public static final ie4 d = new ze4(1, 0, 2);

    @Override // defpackage.ze4
    public final void c(yp0 yp0Var, xs xsVar, z86 z86Var, r8 r8Var, af4 af4Var) {
        int[] iArr;
        mk2 mk2Var;
        int c;
        int i;
        int f = yp0Var.f(0);
        if (z86Var.n != 0) {
            xu0.a("Cannot move a group while inserting");
        }
        if (f < 0) {
            xu0.a("Parameter offset is out of bounds");
        }
        if (f != 0) {
            int i2 = z86Var.t;
            int i3 = z86Var.v;
            int i4 = z86Var.u;
            int i5 = i2;
            while (true) {
                iArr = z86Var.b;
                if (f <= 0) {
                    break;
                }
                i5 += iArr[(z86Var.r(i5) * 5) + 3];
                if (i5 > i4) {
                    xu0.a("Parameter offset is out of bounds");
                }
                f--;
            }
            int i6 = iArr[(z86Var.r(i5) * 5) + 3];
            int g = z86Var.g(z86Var.b, z86Var.r(z86Var.t));
            int g2 = z86Var.g(z86Var.b, z86Var.r(i5));
            int i7 = i5 + i6;
            int g3 = z86Var.g(z86Var.b, z86Var.r(i7));
            int i8 = g3 - g2;
            z86Var.x(i8, Math.max(z86Var.t - 1, 0));
            z86Var.w(i6);
            int[] iArr2 = z86Var.b;
            int r = z86Var.r(i7) * 5;
            nu.d0(z86Var.r(i2) * 5, r, (i6 * 5) + r, iArr2, iArr2);
            if (i8 > 0) {
                Object[] objArr = z86Var.c;
                int h = z86Var.h(g2 + i8);
                System.arraycopy(objArr, h, objArr, g, z86Var.h(g3 + i8) - h);
            }
            int i9 = g2 + i8;
            int i10 = i9 - g;
            int i11 = z86Var.k;
            int i12 = z86Var.l;
            int length = z86Var.c.length;
            int i13 = z86Var.m;
            int i14 = i2 + i6;
            int i15 = i2;
            while (i15 < i14) {
                int r2 = z86Var.r(i15);
                int i16 = i10;
                int g4 = z86Var.g(iArr2, r2) - i16;
                if (i13 < r2) {
                    i = 0;
                } else {
                    i = i11;
                }
                int[] iArr3 = iArr2;
                iArr3[(r2 * 5) + 4] = z86.i(z86.i(g4, i, i12, length), z86Var.k, z86Var.l, z86Var.c.length);
                i15++;
                i10 = i16;
                iArr2 = iArr3;
                i11 = i11;
            }
            int i17 = i7 + i6;
            int p = z86Var.p();
            int a = y86.a(z86Var.d, i7, p);
            ArrayList arrayList = new ArrayList();
            if (a >= 0) {
                while (a < z86Var.d.size() && (c = z86Var.c((mk2Var = (mk2) z86Var.d.get(a)))) >= i7 && c < i17) {
                    arrayList.add(mk2Var);
                    mk2 mk2Var2 = (mk2) z86Var.d.remove(a);
                }
            }
            int i18 = i2 - i7;
            int size = arrayList.size();
            for (int i19 = 0; i19 < size; i19++) {
                mk2 mk2Var3 = (mk2) arrayList.get(i19);
                int c2 = z86Var.c(mk2Var3) + i18;
                if (c2 >= z86Var.g) {
                    mk2Var3.a = -(p - c2);
                } else {
                    mk2Var3.a = c2;
                }
                z86Var.d.add(y86.a(z86Var.d, c2, p), mk2Var3);
            }
            if (z86Var.I(i7, i6)) {
                xu0.a("Unexpectedly removed anchors");
            }
            z86Var.m(i3, z86Var.u, i2);
            if (i8 > 0) {
                z86Var.J(i9, i8, i7 - 1);
            }
        }
    }
}
