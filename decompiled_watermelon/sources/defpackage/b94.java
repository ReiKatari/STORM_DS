package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b94  reason: default package */
/* loaded from: classes.dex */
public abstract class b94 {
    public static final Object[] a = new Object[0];
    public static final w14 b = new w14(0);

    public static final void a(int i, List list) {
        int size = list.size();
        if (i >= 0 && i < size) {
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + size + " elements.");
    }

    public static final void b(int i, int i2, List list) {
        int size = list.size();
        if (i <= i2) {
            if (i >= 0) {
                if (i2 <= size) {
                    return;
                }
                throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
            }
            f81.q(wh1.j("fromIndex (", i, ") is less than 0."));
            return;
        }
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
    }
}
