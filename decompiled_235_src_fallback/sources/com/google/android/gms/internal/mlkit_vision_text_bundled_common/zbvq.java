package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbvq implements com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx {
    private final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm zba;
    private final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwl zbb;
    private final boolean zbc;
    private final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtq zbd;

    private zbvq(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwl r1, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtq r2, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r3) {
            r0 = this;
            r0.<init>()
            r0.zbb = r1
            boolean r1 = r3 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub
            r0.zbc = r1
            r0.zbd = r2
            r0.zba = r3
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvq zbc(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwl r1, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtq r2, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r3) {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvq r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvq
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final int zba(java.lang.Object r2) {
            r1 = this;
            r0 = r2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r0 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf) r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r0 = r0.zbc
            int r0 = r0.zbb()
            boolean r1 = r1.zbc
            if (r1 == 0) goto L16
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub r2 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub) r2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtu r1 = r2.zbb
            int r1 = r1.zbc()
            int r0 = r0 + r1
        L16:
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final int zbb(java.lang.Object r2) {
            r1 = this;
            r0 = r2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r0 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf) r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r0 = r0.zbc
            int r0 = r0.hashCode()
            boolean r1 = r1.zbc
            if (r1 == 0) goto L1a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub r2 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub) r2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtu r1 = r2.zbb
            int r0 = r0 * 53
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh r1 = r1.zba
            int r1 = r1.hashCode()
            int r0 = r0 + r1
        L1a:
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final java.lang.Object zbe() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r1 = r1.zba
            boolean r0 = r1 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
            if (r0 == 0) goto Ld
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r1 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf) r1
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r1 = r1.zbt()
            return r1
        Ld:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvl r1 = r1.zbJ()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r1 = r1.zbl()
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final void zbf(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwl r0 = r1.zbb
            r0.zbb(r2)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtq r1 = r1.zbd
            r1.zba(r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final void zbg(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwl r0 = r1.zbb
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbp(r0, r2, r3)
            boolean r0 = r1.zbc
            if (r0 == 0) goto Le
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtq r1 = r1.zbd
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbo(r1, r2, r3)
        Le:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final void zbh(java.lang.Object r11, byte[] r12, int r13, int r14, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsq r15) {
            r10 = this;
            r0 = r11
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r0 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf) r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r1 = r0.zbc
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm.zbc()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm.zbf()
            r0.zbc = r1
        L11:
            r6 = r1
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub r11 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub) r11
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtu r11 = r11.zbg()
            r0 = 0
            r1 = r0
        L1a:
            if (r13 >= r14) goto Lc5
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r12, r13, r15)
            int r2 = r15.zba
            r13 = 11
            r3 = 2
            if (r2 == r13) goto L60
            r13 = r2 & 7
            if (r13 != r3) goto L59
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp r13 = r15.zbd
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r1 = r10.zba
            int r3 = r2 >>> 3
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbud r1 = r13.zbc(r1, r3)
            if (r1 == 0) goto L51
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r13 = r1.zba
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu.zba()
            java.lang.Class r13 = r13.getClass()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r13 = r2.zbb(r13)
            int r13 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbe(r13, r12, r4, r14, r15)
            java.lang.Object r2 = r15.zbc
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuc r3 = r1.zbb
            r11.zbj(r3, r2)
            goto L1a
        L51:
            r3 = r12
            r5 = r14
            r7 = r15
            int r13 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbj(r2, r3, r4, r5, r6, r7)
            goto L1a
        L59:
            r5 = r14
            r7 = r15
            int r13 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbq(r2, r12, r4, r5, r7)
            goto L1a
        L60:
            r5 = r14
            r7 = r15
            r13 = 0
            r14 = r0
        L64:
            if (r4 >= r5) goto Lb7
            int r15 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r12, r4, r7)
            int r2 = r7.zba
            int r4 = r2 >>> 3
            r8 = r2 & 7
            if (r4 == r3) goto L9d
            r9 = 3
            if (r4 == r9) goto L76
            goto Lae
        L76:
            if (r1 == 0) goto L92
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r2 = r1.zba
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu.zba()
            java.lang.Class r2 = r2.getClass()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r2 = r4.zbb(r2)
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbe(r2, r12, r15, r5, r7)
            java.lang.Object r15 = r7.zbc
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuc r2 = r1.zbb
            r11.zbj(r2, r15)
            goto L64
        L92:
            if (r8 != r3) goto Lae
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zba(r12, r15, r7)
            java.lang.Object r14 = r7.zbc
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r14 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc) r14
            goto L64
        L9d:
            if (r8 != 0) goto Lae
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r12, r15, r7)
            int r13 = r7.zba
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp r15 = r7.zbd
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r1 = r10.zba
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbud r1 = r15.zbc(r1, r13)
            goto L64
        Lae:
            r4 = 12
            if (r2 == r4) goto Lb8
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbq(r2, r12, r15, r5, r7)
            goto L64
        Lb7:
            r15 = r4
        Lb8:
            if (r14 == 0) goto Lc0
            int r13 = r13 << 3
            r13 = r13 | r3
            r6.zbj(r13, r14)
        Lc0:
            r13 = r15
            r14 = r5
            r15 = r7
            goto L1a
        Lc5:
            r5 = r14
            if (r13 != r5) goto Lc9
            return
        Lc9:
            java.lang.String r10 = "Failed to parse the message."
            defpackage.fa6.j(r10)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final void zbi(java.lang.Object r5, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy r6) {
            r4 = this;
            r4 = r5
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub r4 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub) r4
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtu r4 = r4.zbb
            java.util.Iterator r4 = r4.zbg()
        L9:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L52
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtt r1 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtt) r1
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwx r2 = r1.zbe()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwx r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwx.zbi
            if (r2 != r3) goto L4c
            r1.zbg()
            r1.zbf()
            boolean r2 = r0 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbut
            r3 = 32149011(0x1ea8e13, float:8.616189E-38)
            if (r2 == 0) goto L41
            r1.zba()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbut r0 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbut) r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuv r0 = r0.zba()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r0 = r0.zbb()
            r6.zbx(r3, r0)
            goto L9
        L41:
            r1.zba()
            java.lang.Object r0 = r0.getValue()
            r6.zbx(r3, r0)
            goto L9
        L4c:
            java.lang.String r4 = "Found invalid MessageSet item."
            defpackage.i.m(r4)
            return
        L52:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r5 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf) r5
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r4 = r5.zbc
            r4.zbk(r6)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final boolean zbj(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            r0 = r3
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r0 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf) r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r0 = r0.zbc
            r1 = r4
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r1 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf) r1
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r1 = r1.zbc
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L12
            r2 = 0
            return r2
        L12:
            boolean r2 = r2.zbc
            if (r2 == 0) goto L23
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub r3 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub) r3
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtu r2 = r3.zbb
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub r4 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub) r4
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtu r3 = r4.zbb
            boolean r2 = r2.equals(r3)
            return r2
        L23:
            r2 = 1
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final boolean zbk(java.lang.Object r1) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub r1 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub) r1
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtu r0 = r1.zbb
            boolean r0 = r0.zbm()
            return r0
    }
}
