package com.google.mlkit.vision.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class BitmapInStreamingChecker {
    private static final com.google.android.gms.common.internal.GmsLogger zza = null;
    private final java.util.LinkedList zzb;
    private long zzc;

    static {
            com.google.android.gms.common.internal.GmsLogger r0 = new com.google.android.gms.common.internal.GmsLogger
            java.lang.String r1 = "StreamingFormatChecker"
            java.lang.String r2 = ""
            r0.<init>(r1, r2)
            com.google.mlkit.vision.common.internal.BitmapInStreamingChecker.zza = r0
            return
    }

    public BitmapInStreamingChecker() {
            r2 = this;
            r2.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r2.zzb = r0
            r0 = -1
            r2.zzc = r0
            return
    }

    public void check(com.google.mlkit.vision.common.InputImage r9) {
            r8 = this;
            int r9 = r9.getFormat()
            r0 = -1
            if (r9 == r0) goto L8
            goto L5f
        L8:
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.util.LinkedList r9 = r8.zzb
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r9.add(r2)
            java.util.LinkedList r9 = r8.zzb
            int r9 = r9.size()
            r2 = 5
            if (r9 <= r2) goto L23
            java.util.LinkedList r9 = r8.zzb
            r9.removeFirst()
        L23:
            java.util.LinkedList r9 = r8.zzb
            int r9 = r9.size()
            if (r9 != r2) goto L5f
            java.util.LinkedList r9 = r8.zzb
            java.lang.Object r9 = r9.peekFirst()
            java.lang.Long r9 = (java.lang.Long) r9
            java.lang.Object r9 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)
            java.lang.Long r9 = (java.lang.Long) r9
            long r2 = r9.longValue()
            long r2 = r0 - r2
            r4 = 5000(0x1388, double:2.4703E-320)
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 >= 0) goto L5f
            long r2 = r8.zzc
            r6 = -1
            int r9 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r9 == 0) goto L54
            long r2 = r0 - r2
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 >= 0) goto L54
            goto L5f
        L54:
            r8.zzc = r0
            com.google.android.gms.common.internal.GmsLogger r8 = com.google.mlkit.vision.common.internal.BitmapInStreamingChecker.zza
            java.lang.String r9 = "StreamingFormatChecker"
            java.lang.String r0 = "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit."
            r8.w(r9, r0)
        L5f:
            return
    }
}
