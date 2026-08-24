package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbvd implements com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvy {
    private static final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvk zba = null;
    private final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvk zbb;

    static {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvb r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvb
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvd.zba = r0
            return
    }

    public zbvd() {
            r4 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvc r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvc
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbty r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbty.zba()
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu.zba
            r2 = 2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvk[] r2 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvk[r2]
            r3 = 0
            r2[r3] = r1
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvk r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvd.zba
            r3 = 1
            r2[r3] = r1
            r0.<init>(r2)
            r4.<init>()
            byte[] r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zbb
            r4.zbb = r0
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvy
    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx zba(java.lang.Class r8) {
            r7 = this;
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zba
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf> r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf.class
            boolean r0 = r0.isAssignableFrom(r8)
            if (r0 != 0) goto Lc
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu.zba
        Lc:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvk r7 = r7.zbb
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvj r1 = r7.zbb(r8)
            boolean r7 = r1.zbb()
            if (r7 != 0) goto L41
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu.zba
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvs r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvt.zba()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuy r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuz.zba()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwl r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbm()
            int r7 = r1.zbc()
            int r7 = r7 + (-1)
            r0 = 1
            if (r7 == r0) goto L35
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtq r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbts.zba()
        L33:
            r5 = r7
            goto L37
        L35:
            r7 = 0
            goto L33
        L37:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvh r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvi.zba()
            r0 = r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp.zbl(r0, r1, r2, r3, r4, r5, r6)
            return r7
        L41:
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu.zba
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwl r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbm()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtq r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbts.zba()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r0 = r1.zba()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvq r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvq.zbc(r7, r8, r0)
            return r7
    }
}
