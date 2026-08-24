package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbuo {
    static final java.nio.charset.Charset zba = null;
    public static final byte[] zbb = null;

    static {
            java.lang.String r0 = "US-ASCII"
            java.nio.charset.Charset.forName(r0)
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zba = r0
            java.lang.String r0 = "ISO-8859-1"
            java.nio.charset.Charset.forName(r0)
            r0 = 0
            byte[] r2 = new byte[r0]
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zbb = r2
            java.nio.ByteBuffer.wrap(r2)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbte r1 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbte
            r5 = 0
            r6 = 0
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            r1.zba(r0)     // Catch: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq -> L27
            return
        L27:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
    }

    public static int zba(boolean r0) {
            if (r0 == 0) goto L5
            r0 = 1231(0x4cf, float:1.725E-42)
            return r0
        L5:
            r0 = 1237(0x4d5, float:1.733E-42)
            return r0
    }

    public static int zbb(int r1, byte[] r2, int r3, int r4) {
            r3 = 0
        L1:
            if (r3 >= r4) goto Lb
            int r1 = r1 * 31
            r0 = r2[r3]
            int r1 = r1 + r0
            int r3 = r3 + 1
            goto L1
        Lb:
            return r1
    }

    public static java.lang.Object zbc(java.lang.Object r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.String r0 = "messageType"
            defpackage.u34.x(r0)
            r0 = 0
            return r0
    }

    public static boolean zbd(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r0) {
            boolean r0 = r0 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsk
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = 0
            throw r0
    }
}
