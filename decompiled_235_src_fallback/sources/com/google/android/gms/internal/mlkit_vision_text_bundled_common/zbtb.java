package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
class zbtb extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbta {
    protected final byte[] zba;

    public zbtb(byte[] r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r2.getClass()
            r1.zba = r2
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r7.zbd()
            r3 = r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r3 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc) r3
            int r3 = r3.zbd()
            if (r1 == r3) goto L18
            return r2
        L18:
            int r1 = r7.zbd()
            if (r1 != 0) goto L1f
            return r0
        L1f:
            boolean r1 = r8 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtb
            if (r1 == 0) goto L88
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtb r8 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtb) r8
            int r1 = r7.zbi()
            int r3 = r8.zbi()
            if (r1 == 0) goto L35
            if (r3 == 0) goto L35
            if (r1 != r3) goto L34
            goto L35
        L34:
            return r2
        L35:
            int r1 = r7.zbd()
            int r3 = r8.zbd()
            if (r1 > r3) goto L6d
            int r3 = r8.zbd()
            if (r1 > r3) goto L5d
            byte[] r7 = r7.zba
            byte[] r3 = r8.zba
            r8.zbc()
            r8 = r2
            r4 = r8
        L4e:
            if (r8 >= r1) goto L5c
            r5 = r7[r8]
            r6 = r3[r4]
            if (r5 == r6) goto L57
            return r2
        L57:
            int r8 = r8 + 1
            int r4 = r4 + 1
            goto L4e
        L5c:
            return r0
        L5d:
            int r7 = r8.zbd()
            java.lang.String r8 = "Ran off end of other: 0, "
            java.lang.String r0 = ", "
            java.lang.String r7 = defpackage.lb1.j(r8, r1, r7, r0)
            defpackage.i.h(r7)
            return r2
        L6d:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            int r7 = r7.zbd()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Length too large: "
            r0.<init>(r2)
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L88:
            boolean r7 = r8.equals(r7)
            return r7
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    public byte zba(int r1) {
            r0 = this;
            byte[] r0 = r0.zba
            r0 = r0[r1]
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    public byte zbb(int r1) {
            r0 = this;
            byte[] r0 = r0.zba
            r0 = r0[r1]
            return r0
    }

    public int zbc() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    public int zbd() {
            r0 = this;
            byte[] r0 = r0.zba
            int r0 = r0.length
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    public final int zbe(int r1, int r2, int r3) {
            r0 = this;
            byte[] r0 = r0.zba
            r2 = 0
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zbb(r1, r0, r2, r3)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc zbf(int r2, int r3) {
            r1 = this;
            int r2 = r1.zbd()
            r0 = 0
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc.zbh(r0, r3, r2)
            if (r2 != 0) goto Le
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc.zbb
            return r1
        Le:
            byte[] r1 = r1.zba
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsw r3 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsw
            r3.<init>(r1, r0, r2)
            return r3
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    public final void zbg(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbst r3) {
            r2 = this;
            int r0 = r2.zbd()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbth r3 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbth) r3
            byte[] r2 = r2.zba
            r1 = 0
            r3.zbc(r2, r1, r0)
            return
    }
}
