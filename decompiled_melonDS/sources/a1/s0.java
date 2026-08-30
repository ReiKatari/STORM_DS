package a1;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class s0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Object[] f100a = new Object[0];

    /* renamed from: b  reason: collision with root package name */
    public static final h0 f101b = new h0(0);

    public static final void a(int i2, List list) {
        int size = list.size();
        if (i2 >= 0 && i2 < size) {
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i2 + " is out of bounds. The list has " + size + " elements.");
    }

    public static final void b(List list, int i2, int i10) {
        int size = list.size();
        if (i2 <= i10) {
            if (i2 >= 0) {
                if (i10 <= size) {
                    return;
                }
                throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is more than than the list size (" + size + ')');
            }
            wa.b.f(w.d.m("fromIndex (", i2, ") is less than 0."));
            return;
        }
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i2 + ") is greater than toIndex (" + i10 + ").");
    }
}
