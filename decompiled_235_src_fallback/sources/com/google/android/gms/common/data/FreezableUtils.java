package com.google.android.gms.common.data;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class FreezableUtils {
    public FreezableUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T, E extends com.google.android.gms.common.data.Freezable<T>> java.util.ArrayList<T> freeze(java.util.ArrayList<E> r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            int r1 = r4.size()
            r2 = 0
        Le:
            if (r2 >= r1) goto L20
            java.lang.Object r3 = r4.get(r2)
            com.google.android.gms.common.data.Freezable r3 = (com.google.android.gms.common.data.Freezable) r3
            java.lang.Object r3 = r3.freeze()
            r0.add(r3)
            int r2 = r2 + 1
            goto Le
        L20:
            return r0
    }

    public static <T, E extends com.google.android.gms.common.data.Freezable<T>> java.util.ArrayList<T> freeze(E[] r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.length
            r0.<init>(r1)
            r1 = 0
        L7:
            int r2 = r3.length
            if (r1 >= r2) goto L16
            r2 = r3[r1]
            java.lang.Object r2 = r2.freeze()
            r0.add(r2)
            int r1 = r1 + 1
            goto L7
        L16:
            return r0
    }

    public static <T, E extends com.google.android.gms.common.data.Freezable<T>> java.util.ArrayList<T> freezeIterable(java.lang.Iterable<E> r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L9:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r2.next()
            com.google.android.gms.common.data.Freezable r1 = (com.google.android.gms.common.data.Freezable) r1
            java.lang.Object r1 = r1.freeze()
            r0.add(r1)
            goto L9
        L1d:
            return r0
    }
}
