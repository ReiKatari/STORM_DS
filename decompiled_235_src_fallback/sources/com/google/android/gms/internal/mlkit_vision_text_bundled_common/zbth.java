package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbth extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk {
    private final byte[] zbb;
    private final int zbc;
    private int zbd;

    public zbth(byte[] r3, int r4, int r5) {
            r2 = this;
            r4 = 0
            r2.<init>(r4)
            int r4 = r3.length
            int r0 = r4 - r5
            r0 = r0 | r5
            r1 = 0
            if (r0 < 0) goto L12
            r2.zbb = r3
            r2.zbd = r1
            r2.zbc = r5
            return
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r5}
            java.lang.String r4 = "Array range is invalid. Buffer.length=%d, offset=%d, length=%d"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r2.<init>(r3)
            throw r2
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final int zba() {
            r1 = this;
            int r0 = r1.zbc
            int r1 = r1.zbd
            int r0 = r0 - r1
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbb(byte r4) {
            r3 = this;
            byte[] r0 = r3.zbb     // Catch: java.lang.IndexOutOfBoundsException -> Lb
            int r1 = r3.zbd     // Catch: java.lang.IndexOutOfBoundsException -> Lb
            int r2 = r1 + 1
            r3.zbd = r2     // Catch: java.lang.IndexOutOfBoundsException -> Lb
            r0[r1] = r4     // Catch: java.lang.IndexOutOfBoundsException -> Lb
            return
        Lb:
            r4 = move-exception
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbti r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbti
            int r1 = r3.zbd
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r3 = r3.zbc
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r2}
            java.lang.String r1 = "Pos: %d, limit: %d, len: %d"
            java.lang.String r3 = java.lang.String.format(r1, r3)
            r0.<init>(r3, r4)
            throw r0
    }

    public final void zbc(byte[] r3, int r4, int r5) {
            r2 = this;
            byte[] r4 = r2.zbb     // Catch: java.lang.IndexOutOfBoundsException -> Le
            int r0 = r2.zbd     // Catch: java.lang.IndexOutOfBoundsException -> Le
            r1 = 0
            java.lang.System.arraycopy(r3, r1, r4, r0, r5)     // Catch: java.lang.IndexOutOfBoundsException -> Le
            int r3 = r2.zbd     // Catch: java.lang.IndexOutOfBoundsException -> Le
            int r3 = r3 + r5
            r2.zbd = r3     // Catch: java.lang.IndexOutOfBoundsException -> Le
            return
        Le:
            r3 = move-exception
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbti r4 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbti
            int r0 = r2.zbd
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r2 = r2.zbc
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r2, r5}
            java.lang.String r5 = "Pos: %d, limit: %d, len: %d"
            java.lang.String r2 = java.lang.String.format(r5, r2)
            r4.<init>(r2, r3)
            throw r4
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbd(int r1, boolean r2) {
            r0 = this;
            int r1 = r1 << 3
            r0.zbw(r1)
            r0.zbb(r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbe(byte[] r1, int r2, int r3) {
            r0 = this;
            r0.zbw(r3)
            r2 = 0
            r0.zbc(r1, r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbf(int r1, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r2) {
            r0 = this;
            int r1 = r1 << 3
            r1 = r1 | 2
            r0.zbw(r1)
            r0.zbg(r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbg(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r2) {
            r1 = this;
            int r0 = r2.zbd()
            r1.zbw(r0)
            r2.zbg(r1)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbh(int r1, int r2) {
            r0 = this;
            int r1 = r1 << 3
            r1 = r1 | 5
            r0.zbw(r1)
            r0.zbi(r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbi(int r6) {
            r5 = this;
            byte[] r0 = r5.zbb     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r1 = r5.zbd     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r2 = r1 + 1
            r5.zbd = r2     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            r3 = r6 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r3 = r1 + 2
            r5.zbd = r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r4 = r6 >> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            r0[r2] = r4     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r2 = r1 + 3
            r5.zbd = r2     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r4 = r6 >> 16
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            r0[r3] = r4     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r1 = r1 + 4
            r5.zbd = r1     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r6 = r6 >> 24
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            r0[r2] = r6     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            return
        L2f:
            r6 = move-exception
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbti r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbti
            int r1 = r5.zbd
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r5 = r5.zbc
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r5 = new java.lang.Object[]{r1, r5, r2}
            java.lang.String r1 = "Pos: %d, limit: %d, len: %d"
            java.lang.String r5 = java.lang.String.format(r1, r5)
            r0.<init>(r5, r6)
            throw r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbj(int r1, long r2) {
            r0 = this;
            int r1 = r1 << 3
            r1 = r1 | 1
            r0.zbw(r1)
            r0.zbk(r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbk(long r8) {
            r7 = this;
            byte[] r0 = r7.zbb     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            int r1 = r7.zbd     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            int r2 = r1 + 1
            r7.zbd = r2     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            int r3 = (int) r8     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            int r3 = r1 + 2
            r7.zbd = r3     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r4 = 8
            long r5 = r8 >> r4
            int r5 = (int) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r0[r2] = r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            int r2 = r1 + 3
            r7.zbd = r2     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r5 = 16
            long r5 = r8 >> r5
            int r5 = (int) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r0[r3] = r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            int r3 = r1 + 4
            r7.zbd = r3     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r5 = 24
            long r5 = r8 >> r5
            int r5 = (int) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r0[r2] = r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            int r2 = r1 + 5
            r7.zbd = r2     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r5 = 32
            long r5 = r8 >> r5
            int r5 = (int) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r0[r3] = r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            int r3 = r1 + 6
            r7.zbd = r3     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r5 = 40
            long r5 = r8 >> r5
            int r5 = (int) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r0[r2] = r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            int r2 = r1 + 7
            r7.zbd = r2     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r5 = 48
            long r5 = r8 >> r5
            int r5 = (int) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r0[r3] = r5     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            int r1 = r1 + r4
            r7.zbd = r1     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r1 = 56
            long r8 = r8 >> r1
            int r8 = (int) r8     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            r0[r2] = r8     // Catch: java.lang.IndexOutOfBoundsException -> L6f
            return
        L6f:
            r8 = move-exception
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbti r9 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbti
            int r0 = r7.zbd
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r7 = r7.zbc
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r7 = new java.lang.Object[]{r0, r7, r1}
            java.lang.String r0 = "Pos: %d, limit: %d, len: %d"
            java.lang.String r7 = java.lang.String.format(r0, r7)
            r9.<init>(r7, r8)
            throw r9
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbl(int r1, int r2) {
            r0 = this;
            int r1 = r1 << 3
            r0.zbw(r1)
            r0.zbm(r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbm(int r3) {
            r2 = this;
            if (r3 < 0) goto L6
            r2.zbw(r3)
            return
        L6:
            long r0 = (long) r3
            r2.zby(r0)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbn(byte[] r1, int r2, int r3) {
            r0 = this;
            r2 = 0
            r0.zbc(r1, r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbo(int r1, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r2, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r3) {
            r0 = this;
            int r1 = r1 << 3
            r1 = r1 | 2
            r0.zbw(r1)
            r1 = r2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsj r1 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsj) r1
            int r1 = r1.zbj(r3)
            r0.zbw(r1)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtl r0 = r0.zba
            r3.zbi(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbp(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r2) {
            r1 = this;
            int r0 = r2.zbo()
            r1.zbw(r0)
            r2.zbL(r1)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbq(int r2, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r3) {
            r1 = this;
            r0 = 11
            r1.zbw(r0)
            r0 = 2
            r1.zbv(r0, r2)
            r2 = 26
            r1.zbw(r2)
            r1.zbp(r3)
            r2 = 12
            r1.zbw(r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbr(int r2, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r3) {
            r1 = this;
            r0 = 11
            r1.zbw(r0)
            r0 = 2
            r1.zbv(r0, r2)
            r2 = 3
            r1.zbf(r2, r3)
            r2 = 12
            r1.zbw(r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbs(int r1, java.lang.String r2) {
            r0 = this;
            int r1 = r1 << 3
            r1 = r1 | 2
            r0.zbw(r1)
            r0.zbt(r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbt(java.lang.String r6) {
            r5 = this;
            int r0 = r5.zbd
            int r1 = r6.length()     // Catch: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwu -> L2e java.lang.IndexOutOfBoundsException -> L45
            int r1 = r1 * 3
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r1)     // Catch: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwu -> L2e java.lang.IndexOutOfBoundsException -> L45
            int r2 = r6.length()     // Catch: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwu -> L2e java.lang.IndexOutOfBoundsException -> L45
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r2)     // Catch: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwu -> L2e java.lang.IndexOutOfBoundsException -> L45
            if (r2 != r1) goto L30
            int r1 = r0 + r2
            r5.zbd = r1     // Catch: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwu -> L2e java.lang.IndexOutOfBoundsException -> L45
            byte[] r3 = r5.zbb     // Catch: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwu -> L2e java.lang.IndexOutOfBoundsException -> L45
            int r4 = r5.zbc     // Catch: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwu -> L2e java.lang.IndexOutOfBoundsException -> L45
            int r4 = r4 - r1
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwv.zbb(r6, r3, r1, r4)     // Catch: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwu -> L2e java.lang.IndexOutOfBoundsException -> L45
            r5.zbd = r0     // Catch: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwu -> L2e java.lang.IndexOutOfBoundsException -> L45
            int r3 = r1 - r0
            int r3 = r3 - r2
            r5.zbw(r3)     // Catch: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwu -> L2e java.lang.IndexOutOfBoundsException -> L45
            r5.zbd = r1     // Catch: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwu -> L2e java.lang.IndexOutOfBoundsException -> L45
            return
        L2e:
            r1 = move-exception
            goto L4c
        L30:
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwv.zbc(r6)     // Catch: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwu -> L2e java.lang.IndexOutOfBoundsException -> L45
            r5.zbw(r1)     // Catch: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwu -> L2e java.lang.IndexOutOfBoundsException -> L45
            byte[] r1 = r5.zbb     // Catch: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwu -> L2e java.lang.IndexOutOfBoundsException -> L45
            int r2 = r5.zbd     // Catch: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwu -> L2e java.lang.IndexOutOfBoundsException -> L45
            int r3 = r5.zbc     // Catch: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwu -> L2e java.lang.IndexOutOfBoundsException -> L45
            int r3 = r3 - r2
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwv.zbb(r6, r1, r2, r3)     // Catch: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwu -> L2e java.lang.IndexOutOfBoundsException -> L45
            r5.zbd = r1     // Catch: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwu -> L2e java.lang.IndexOutOfBoundsException -> L45
            return
        L45:
            r5 = move-exception
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbti r6 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbti
            r6.<init>(r5)
            throw r6
        L4c:
            r5.zbd = r0
            r5.zbG(r6, r1)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbu(int r1, int r2) {
            r0 = this;
            int r1 = r1 << 3
            r1 = r1 | r2
            r0.zbw(r1)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbv(int r1, int r2) {
            r0 = this;
            int r1 = r1 << 3
            r0.zbw(r1)
            r0.zbw(r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbw(int r4) {
            r3 = this;
        L0:
            r0 = r4 & (-128(0xffffffffffffff80, float:NaN))
            byte[] r1 = r3.zbb
            if (r0 != 0) goto L12
            int r0 = r3.zbd     // Catch: java.lang.IndexOutOfBoundsException -> L10
            int r2 = r0 + 1
            r3.zbd = r2     // Catch: java.lang.IndexOutOfBoundsException -> L10
            byte r4 = (byte) r4     // Catch: java.lang.IndexOutOfBoundsException -> L10
            r1[r0] = r4     // Catch: java.lang.IndexOutOfBoundsException -> L10
            return
        L10:
            r4 = move-exception
            goto L22
        L12:
            int r0 = r3.zbd     // Catch: java.lang.IndexOutOfBoundsException -> L10
            int r2 = r0 + 1
            r3.zbd = r2     // Catch: java.lang.IndexOutOfBoundsException -> L10
            r2 = r4 | 128(0x80, float:1.8E-43)
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2     // Catch: java.lang.IndexOutOfBoundsException -> L10
            r1[r0] = r2     // Catch: java.lang.IndexOutOfBoundsException -> L10
            int r4 = r4 >>> 7
            goto L0
        L22:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbti r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbti
            int r1 = r3.zbd
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r3 = r3.zbc
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r2}
            java.lang.String r1 = "Pos: %d, limit: %d, len: %d"
            java.lang.String r3 = java.lang.String.format(r1, r3)
            r0.<init>(r3, r4)
            throw r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbx(int r1, long r2) {
            r0 = this;
            int r1 = r1 << 3
            r0.zbw(r1)
            r0.zby(r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zby(long r11) {
            r10 = this;
            boolean r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbH()
            r1 = 7
            r2 = 0
            r4 = -128(0xffffffffffffff80, double:NaN)
            if (r0 == 0) goto L3a
            int r0 = r10.zbc
            int r6 = r10.zbd
            int r0 = r0 - r6
            r6 = 10
            if (r0 < r6) goto L3a
        L14:
            long r6 = r11 & r4
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            int r6 = (int) r11
            byte[] r7 = r10.zbb
            if (r0 != 0) goto L29
            int r11 = r10.zbd
            int r12 = r11 + 1
            r10.zbd = r12
            long r10 = (long) r11
            byte r12 = (byte) r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbn(r7, r10, r12)
            return
        L29:
            int r0 = r10.zbd
            int r8 = r0 + 1
            r10.zbd = r8
            long r8 = (long) r0
            r0 = r6 | 128(0x80, float:1.8E-43)
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbn(r7, r8, r0)
            long r11 = r11 >>> r1
            goto L14
        L3a:
            long r6 = r11 & r4
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            byte[] r6 = r10.zbb
            if (r0 != 0) goto L4f
            int r0 = r10.zbd     // Catch: java.lang.IndexOutOfBoundsException -> L4d
            int r1 = r0 + 1
            r10.zbd = r1     // Catch: java.lang.IndexOutOfBoundsException -> L4d
            int r11 = (int) r11     // Catch: java.lang.IndexOutOfBoundsException -> L4d
            byte r11 = (byte) r11     // Catch: java.lang.IndexOutOfBoundsException -> L4d
            r6[r0] = r11     // Catch: java.lang.IndexOutOfBoundsException -> L4d
            return
        L4d:
            r11 = move-exception
            goto L5f
        L4f:
            int r0 = r10.zbd     // Catch: java.lang.IndexOutOfBoundsException -> L4d
            int r7 = r0 + 1
            r10.zbd = r7     // Catch: java.lang.IndexOutOfBoundsException -> L4d
            int r7 = (int) r11     // Catch: java.lang.IndexOutOfBoundsException -> L4d
            r7 = r7 | 128(0x80, float:1.8E-43)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r7 = (byte) r7     // Catch: java.lang.IndexOutOfBoundsException -> L4d
            r6[r0] = r7     // Catch: java.lang.IndexOutOfBoundsException -> L4d
            long r11 = r11 >>> r1
            goto L3a
        L5f:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbti r12 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbti
            int r0 = r10.zbd
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r10 = r10.zbc
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r10 = new java.lang.Object[]{r0, r10, r1}
            java.lang.String r0 = "Pos: %d, limit: %d, len: %d"
            java.lang.String r10 = java.lang.String.format(r0, r10)
            r12.<init>(r10, r11)
            throw r12
    }
}
