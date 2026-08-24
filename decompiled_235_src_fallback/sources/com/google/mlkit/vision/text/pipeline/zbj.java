package com.google.mlkit.vision.text.pipeline;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbj {
    public static defpackage.r08 zba(java.nio.ByteBuffer r6, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbnx r7) {
            byte[] r1 = r6.array()
            int r6 = r7.zbc()
            int r5 = zbb(r6)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbcr r4 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbcr
            int r6 = r7.zbd()
            int r0 = r7.zba()
            r4.<init>(r6, r0)
            long r6 = r7.zbe()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r6
            r08 r0 = new r08
            r0.<init>(r1, r2, r4, r5)
            return r0
    }

    public static int zbb(int r3) {
            r0 = 1
            if (r3 == r0) goto Lc
            r1 = 3
            r2 = 2
            if (r3 == r2) goto Lb
            if (r3 == r1) goto La
            return r0
        La:
            return r2
        Lb:
            return r1
        Lc:
            r3 = 4
            return r3
    }
}
