package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jn4  reason: default package */
/* loaded from: classes.dex */
public final class jn4 extends ao4 {
    public static final jn4 d = new ao4(1, 0, 2);

    @Override // defpackage.ao4
    public final void c(ls0 ls0Var, nt ntVar, pk6 pk6Var, jb1 jb1Var, bo4 bo4Var) {
        int[] iArr;
        sq2 sq2Var;
        int c;
        int i;
        int f = ls0Var.f(0);
        if (pk6Var.n != 0) {
            tx0.a("Cannot move a group while inserting");
        }
        if (f < 0) {
            tx0.a("Parameter offset is out of bounds");
        }
        if (f != 0) {
            int i2 = pk6Var.t;
            int i3 = pk6Var.v;
            int i4 = pk6Var.u;
            int i5 = i2;
            while (true) {
                iArr = pk6Var.b;
                if (f <= 0) {
                    break;
                }
                i5 += iArr[(pk6Var.r(i5) * 5) + 3];
                if (i5 > i4) {
                    tx0.a("Parameter offset is out of bounds");
                }
                f--;
            }
            int i6 = iArr[(pk6Var.r(i5) * 5) + 3];
            int g = pk6Var.g(pk6Var.b, pk6Var.r(pk6Var.t));
            int g2 = pk6Var.g(pk6Var.b, pk6Var.r(i5));
            int i7 = i5 + i6;
            int g3 = pk6Var.g(pk6Var.b, pk6Var.r(i7));
            int i8 = g3 - g2;
            pk6Var.x(i8, Math.max(pk6Var.t - 1, 0));
            pk6Var.w(i6);
            int[] iArr2 = pk6Var.b;
            int r = pk6Var.r(i7) * 5;
            fv.r0(pk6Var.r(i2) * 5, r, (i6 * 5) + r, iArr2, iArr2);
            if (i8 > 0) {
                Object[] objArr = pk6Var.c;
                int h = pk6Var.h(g2 + i8);
                System.arraycopy(objArr, h, objArr, g, pk6Var.h(g3 + i8) - h);
            }
            int i9 = g2 + i8;
            int i10 = i9 - g;
            int i11 = pk6Var.k;
            int i12 = pk6Var.l;
            int length = pk6Var.c.length;
            int i13 = pk6Var.m;
            int i14 = i2 + i6;
            int i15 = i2;
            while (i15 < i14) {
                int r2 = pk6Var.r(i15);
                int i16 = i10;
                int g4 = pk6Var.g(iArr2, r2) - i16;
                if (i13 < r2) {
                    i = 0;
                } else {
                    i = i11;
                }
                int[] iArr3 = iArr2;
                iArr3[(r2 * 5) + 4] = pk6.i(pk6.i(g4, i, i12, length), pk6Var.k, pk6Var.l, pk6Var.c.length);
                i15++;
                i10 = i16;
                iArr2 = iArr3;
                i11 = i11;
            }
            int i17 = i7 + i6;
            int p = pk6Var.p();
            int a = ok6.a(pk6Var.d, i7, p);
            ArrayList arrayList = new ArrayList();
            if (a >= 0) {
                while (a < pk6Var.d.size() && (c = pk6Var.c((sq2Var = (sq2) pk6Var.d.get(a)))) >= i7 && c < i17) {
                    arrayList.add(sq2Var);
                    sq2 sq2Var2 = (sq2) pk6Var.d.remove(a);
                }
            }
            int i18 = i2 - i7;
            int size = arrayList.size();
            for (int i19 = 0; i19 < size; i19++) {
                sq2 sq2Var3 = (sq2) arrayList.get(i19);
                int c2 = pk6Var.c(sq2Var3) + i18;
                if (c2 >= pk6Var.g) {
                    sq2Var3.a = -(p - c2);
                } else {
                    sq2Var3.a = c2;
                }
                pk6Var.d.add(ok6.a(pk6Var.d, c2, p), sq2Var3);
            }
            if (pk6Var.I(i7, i6)) {
                tx0.a("Unexpectedly removed anchors");
            }
            pk6Var.m(i3, pk6Var.u, i2);
            if (i8 > 0) {
                pk6Var.J(i9, i8, i7 - 1);
            }
        }
    }
}
