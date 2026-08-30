package p2;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class c {
    public static final void a(int i2, List list) {
        int size = list.size();
        if (i2 >= 0 && i2 < size) {
            return;
        }
        c(i2, size);
    }

    public static final void b(List list, int i2, int i10) {
        if (i2 > i10) {
            f(i2, i10);
        }
        if (i2 < 0) {
            d(i2);
        }
        if (i10 > list.size()) {
            e(i10, list.size());
        }
    }

    private static final void c(int i2, int i10) {
        throw new IndexOutOfBoundsException("Index " + i2 + " is out of bounds. The list has " + i10 + " elements.");
    }

    private static final void d(int i2) {
        throw new IndexOutOfBoundsException(w.d.m("fromIndex (", i2, ") is less than 0."));
    }

    private static final void e(int i2, int i10) {
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + i10 + ')');
    }

    private static final void f(int i2, int i10) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i2 + ") is greater than toIndex (" + i10 + ").");
    }
}
