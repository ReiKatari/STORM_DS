package com.google.android.gms.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzy {
    public static int zza(int r5) {
            r0 = 6
            int[] r1 = new int[r0]
            r1 = {x001a: FILL_ARRAY_DATA  , data: [1, 2, 3, 4, 5, 6} // fill-array
            r2 = 0
        L7:
            if (r2 >= r0) goto L17
            r3 = r1[r2]
            int r4 = r3 + (-1)
            if (r3 == 0) goto L15
            if (r4 != r5) goto L12
            return r3
        L12:
            int r2 = r2 + 1
            goto L7
        L15:
            r5 = 0
            throw r5
        L17:
            r5 = 1
            return r5
    }
}
