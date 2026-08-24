package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ok6  reason: default package */
/* loaded from: classes.dex */
public abstract class ok6 {
    public static final int a(ArrayList arrayList, int i, int i2) {
        int e = e(arrayList, i, i2);
        if (e >= 0) {
            return e;
        }
        return -(e + 1);
    }

    public static final int b(int[] iArr, int i) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final void c(int i, int i2, int[] iArr) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final mk6 d(mk6 mk6Var) {
        if (!(mk6Var instanceof mk6)) {
            mk6Var = null;
        }
        if (mk6Var != null) {
            return mk6Var;
        }
        tx0.b("Inconsistent composition");
        e41.c();
        return null;
    }

    public static final int e(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((sq2) arrayList.get(i4)).a;
            if (i5 < 0) {
                i5 += i2;
            }
            int p = nb3.p(i5, i);
            if (p < 0) {
                i3 = i4 + 1;
            } else if (p > 0) {
                size = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i3 + 1);
    }

    public static final void f() {
        throw new ConcurrentModificationException();
    }
}
