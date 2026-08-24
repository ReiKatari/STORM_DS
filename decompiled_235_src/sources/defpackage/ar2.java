package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ar2  reason: default package */
/* loaded from: classes.dex */
public final class ar2 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final p94 e;
    public final ex6 f;

    public ar2(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            r05.a("Invalid start index");
        }
        this.d = new ArrayList();
        p94 p94Var = new p94();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            zg3 zg3Var = (zg3) this.a.get(i3);
            int i4 = zg3Var.c;
            int i5 = zg3Var.d;
            p94Var.i(i4, new nu2(i3, i2, i5));
            i2 += i5;
        }
        this.e = p94Var;
        this.f = new ex6(new a10(this, 2));
    }

    public final boolean a(int i, int i2) {
        nu2 nu2Var;
        int i3;
        int i4;
        p94 p94Var = this.e;
        nu2 nu2Var2 = (nu2) p94Var.b(i);
        if (nu2Var2 == null) {
            return false;
        }
        int i5 = nu2Var2.b;
        int i6 = i2 - nu2Var2.c;
        nu2Var2.c = i2;
        if (i6 != 0) {
            Object[] objArr = p94Var.c;
            long[] jArr = p94Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i7 = 0;
                while (true) {
                    long j = jArr[i7];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                        for (int i9 = 0; i9 < i8; i9++) {
                            if ((255 & j) < 128 && (i3 = (nu2Var = (nu2) objArr[(i7 << 3) + i9]).b) >= i5 && nu2Var != nu2Var2 && (i4 = i3 + i6) >= 0) {
                                nu2Var.b = i4;
                            }
                            j >>= 8;
                        }
                        if (i8 != 8) {
                            return true;
                        }
                    }
                    if (i7 != length) {
                        i7++;
                    } else {
                        return true;
                    }
                }
            } else {
                return true;
            }
        } else {
            return true;
        }
    }
}
