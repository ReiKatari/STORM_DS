package n2;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class g2 {
    public static final int a(ArrayList arrayList, int i2, int i10) {
        int d4 = d(arrayList, i2, i10);
        if (d4 >= 0) {
            return d4;
        }
        return -(d4 + 1);
    }

    public static final int b(int[] iArr, int i2) {
        int i10 = i2 * 5;
        return Integer.bitCount(iArr[i10 + 1] >> 28) + iArr[i10 + 4];
    }

    public static final void c(int i2, int i10, int[] iArr) {
        if (i10 >= 0) {
        }
        int i11 = (i2 * 5) + 1;
        iArr[i11] = i10 | (iArr[i11] & (-67108864));
    }

    public static final int d(ArrayList arrayList, int i2, int i10) {
        int size = arrayList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int i13 = ((a) arrayList.get(i12)).f9871a;
            if (i13 < 0) {
                i13 += i10;
            }
            int b10 = nc.k.b(i13, i2);
            if (b10 < 0) {
                i11 = i12 + 1;
            } else if (b10 > 0) {
                size = i12 - 1;
            } else {
                return i12;
            }
        }
        return -(i11 + 1);
    }

    public static final void e() {
        throw new ConcurrentModificationException();
    }
}
