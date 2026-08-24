package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzcl {
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

    public static boolean zzb(java.util.Set r2, java.util.Collection r3) {
            r3.getClass()
            boolean r0 = r3 instanceof com.google.android.gms.internal.mlkit_vision_text_common.zzcd
            if (r0 == 0) goto Ld
            com.google.android.gms.internal.mlkit_vision_text_common.zzcd r3 = (com.google.android.gms.internal.mlkit_vision_text_common.zzcd) r3
            java.util.Set r3 = r3.zza()
        Ld:
            boolean r0 = r3 instanceof java.util.Set
            if (r0 == 0) goto L36
            int r0 = r3.size()
            int r1 = r2.size()
            if (r0 <= r1) goto L36
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        L20:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r2.next()
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L20
            r2.remove()
            r0 = 1
            goto L20
        L35:
            return r0
        L36:
            java.util.Iterator r3 = r3.iterator()
            boolean r2 = zzc(r2, r3)
            return r2
    }

    public static boolean zzc(java.util.Set r2, java.util.Iterator r3) {
            r0 = 0
        L1:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L11
            java.lang.Object r1 = r3.next()
            boolean r1 = r2.remove(r1)
            r0 = r0 | r1
            goto L1
        L11:
            return r0
    }
}
