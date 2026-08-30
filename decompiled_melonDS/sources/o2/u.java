package o2;

import java.util.ArrayList;
import n2.g2;
import n2.h2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u extends ek.a {

    /* renamed from: d  reason: collision with root package name */
    public static final u f10663d = new ek.a(1, 0, 2);

    @Override // ek.a
    public final void c(f2.s sVar, n2.c cVar, h2 h2Var, v2.i iVar, j0 j0Var) {
        int[] iArr;
        n2.a aVar;
        int c4;
        int i2;
        int e6 = sVar.e(0);
        if (h2Var.f9916n != 0) {
            n2.t.a("Cannot move a group while inserting");
        }
        if (e6 < 0) {
            n2.t.a("Parameter offset is out of bounds");
        }
        if (e6 != 0) {
            int i10 = h2Var.f9922t;
            int i11 = h2Var.f9924v;
            int i12 = h2Var.f9923u;
            int i13 = i10;
            while (true) {
                iArr = h2Var.f9905b;
                if (e6 <= 0) {
                    break;
                }
                i13 += iArr[(h2Var.r(i13) * 5) + 3];
                if (i13 > i12) {
                    n2.t.a("Parameter offset is out of bounds");
                }
                e6--;
            }
            int i14 = iArr[(h2Var.r(i13) * 5) + 3];
            int g10 = h2Var.g(h2Var.f9905b, h2Var.r(h2Var.f9922t));
            int g11 = h2Var.g(h2Var.f9905b, h2Var.r(i13));
            int i15 = i13 + i14;
            int g12 = h2Var.g(h2Var.f9905b, h2Var.r(i15));
            int i16 = g12 - g11;
            h2Var.x(i16, Math.max(h2Var.f9922t - 1, 0));
            h2Var.w(i14);
            int[] iArr2 = h2Var.f9905b;
            int r5 = h2Var.r(i15) * 5;
            zb.k.g(h2Var.r(i10) * 5, r5, (i14 * 5) + r5, iArr2, iArr2);
            if (i16 > 0) {
                Object[] objArr = h2Var.f9906c;
                int h2 = h2Var.h(g11 + i16);
                System.arraycopy(objArr, h2, objArr, g10, h2Var.h(g12 + i16) - h2);
            }
            int i17 = g11 + i16;
            int i18 = i17 - g10;
            int i19 = h2Var.f9914k;
            int i20 = h2Var.f9915l;
            int length = h2Var.f9906c.length;
            int i21 = h2Var.m;
            int i22 = i10 + i14;
            int i23 = i10;
            while (i23 < i22) {
                int r10 = h2Var.r(i23);
                int i24 = i18;
                int g13 = h2Var.g(iArr2, r10) - i24;
                if (i21 < r10) {
                    i2 = 0;
                } else {
                    i2 = i19;
                }
                int[] iArr3 = iArr2;
                iArr3[(r10 * 5) + 4] = h2.i(h2.i(g13, i2, i20, length), h2Var.f9914k, h2Var.f9915l, h2Var.f9906c.length);
                i23++;
                i18 = i24;
                iArr2 = iArr3;
                i19 = i19;
            }
            int i25 = i15 + i14;
            int p10 = h2Var.p();
            int a10 = g2.a(h2Var.f9907d, i15, p10);
            ArrayList arrayList = new ArrayList();
            if (a10 >= 0) {
                while (a10 < h2Var.f9907d.size() && (c4 = h2Var.c((aVar = (n2.a) h2Var.f9907d.get(a10)))) >= i15 && c4 < i25) {
                    arrayList.add(aVar);
                    n2.a aVar2 = (n2.a) h2Var.f9907d.remove(a10);
                }
            }
            int i26 = i10 - i15;
            int size = arrayList.size();
            for (int i27 = 0; i27 < size; i27++) {
                n2.a aVar3 = (n2.a) arrayList.get(i27);
                int c10 = h2Var.c(aVar3) + i26;
                if (c10 >= h2Var.f9910g) {
                    aVar3.f9871a = -(p10 - c10);
                } else {
                    aVar3.f9871a = c10;
                }
                h2Var.f9907d.add(g2.a(h2Var.f9907d, c10, p10), aVar3);
            }
            if (h2Var.I(i15, i14)) {
                n2.t.a("Unexpectedly removed anchors");
            }
            h2Var.m(i11, h2Var.f9923u, i10);
            if (i16 > 0) {
                h2Var.J(i17, i16, i15 - 1);
            }
        }
    }
}
