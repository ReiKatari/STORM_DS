package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uh4  reason: default package */
/* loaded from: classes.dex */
public abstract class uh4 {
    public static final Object[] a = new Object[0];
    public static final ca4 b = new ca4(0);

    public static final void a(int i, List list) {
        int size = list.size();
        if (i >= 0 && i < size) {
            return;
        }
        e41.q(xg6.m(i, size, "Index ", " is out of bounds. The list has ", " elements."));
    }

    public static final void b(int i, List list, int i2) {
        int size = list.size();
        if (i <= i2) {
            if (i >= 0) {
                if (i2 <= size) {
                    return;
                }
                throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
            }
            e41.q(lb1.k("fromIndex (", i, ") is less than 0."));
            return;
        }
        i.h(xg6.m(i, i2, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
    }
}
