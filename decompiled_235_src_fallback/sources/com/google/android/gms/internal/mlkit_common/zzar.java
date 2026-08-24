package com.google.android.gms.internal.mlkit_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzar {
    public static int zza(java.util.Set r3) {
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
            r1 = r0
        L6:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L1a
            java.lang.Object r2 = r3.next()
            if (r2 == 0) goto L17
            int r2 = r2.hashCode()
            goto L18
        L17:
            r2 = r0
        L18:
            int r1 = r1 + r2
            goto L6
        L1a:
            return r1
    }
}
