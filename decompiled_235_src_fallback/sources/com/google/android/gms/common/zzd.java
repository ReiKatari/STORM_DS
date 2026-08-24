package com.google.android.gms.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzd {
    public static int zza(int r6) {
            r0 = 1
            r1 = 2
            r2 = 3
            int[] r1 = new int[]{r0, r1, r2}
            r3 = 0
        L8:
            if (r3 >= r2) goto L18
            r4 = r1[r3]
            int r5 = r4 + (-1)
            if (r4 == 0) goto L16
            if (r5 != r6) goto L13
            return r4
        L13:
            int r3 = r3 + 1
            goto L8
        L16:
            r6 = 0
            throw r6
        L18:
            return r0
    }
}
