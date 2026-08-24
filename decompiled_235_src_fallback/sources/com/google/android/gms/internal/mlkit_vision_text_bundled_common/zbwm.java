package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbwm {
    private static final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm zba = null;
    private int zbb;
    private int[] zbc;
    private java.lang.Object[] zbd;
    private int zbe;
    private boolean zbf;

    static {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm
            r1 = 0
            int[] r2 = new int[r1]
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r0.<init>(r1, r2, r3, r1)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm.zba = r0
            return
    }

    private zbwm() {
            r4 = this;
            r0 = 8
            int[] r1 = new int[r0]
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 1
            r3 = 0
            r4.<init>(r3, r1, r0, r2)
            return
    }

    private zbwm(int r2, int[] r3, java.lang.Object[] r4, boolean r5) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.zbe = r0
            r1.zbb = r2
            r1.zbc = r3
            r1.zbd = r4
            r1.zbf = r5
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm zbc() {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm.zba
            return r0
    }

    public static com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm zbe(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r6, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r7) {
            int r0 = r6.zbb
            int r1 = r7.zbb
            int r0 = r0 + r1
            int[] r1 = r6.zbc
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            int[] r2 = r7.zbc
            int r3 = r6.zbb
            int r4 = r7.zbb
            r5 = 0
            java.lang.System.arraycopy(r2, r5, r1, r3, r4)
            java.lang.Object[] r2 = r6.zbd
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.lang.Object[] r3 = r7.zbd
            int r6 = r6.zbb
            int r7 = r7.zbb
            java.lang.System.arraycopy(r3, r5, r2, r6, r7)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r6 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm
            r7 = 1
            r6.<init>(r0, r1, r2, r7)
            return r6
    }

    public static com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm zbf() {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm
            r1 = 8
            int[] r2 = new int[r1]
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 1
            r4 = 0
            r0.<init>(r4, r2, r1, r3)
            return r0
    }

    private final void zbm(int r4) {
            r3 = this;
            int[] r0 = r3.zbc
            int r1 = r0.length
            if (r4 <= r1) goto L20
            int r1 = r3.zbb
            int r2 = r1 / 2
            int r2 = r2 + r1
            if (r2 < r4) goto Ld
            r4 = r2
        Ld:
            r1 = 8
            if (r4 >= r1) goto L12
            r4 = r1
        L12:
            int[] r0 = java.util.Arrays.copyOf(r0, r4)
            r3.zbc = r0
            java.lang.Object[] r0 = r3.zbd
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r0, r4)
            r3.zbd = r4
        L20:
            return
    }

    public final boolean equals(java.lang.Object r9) {
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            r1 = 0
            if (r9 != 0) goto L8
            return r1
        L8:
            boolean r2 = r9 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm
            if (r2 != 0) goto Ld
            return r1
        Ld:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r9 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm) r9
            int r2 = r8.zbb
            int r3 = r9.zbb
            if (r2 != r3) goto L3d
            int[] r3 = r8.zbc
            int[] r4 = r9.zbc
            r5 = r1
        L1a:
            if (r5 >= r2) goto L26
            r6 = r3[r5]
            r7 = r4[r5]
            if (r6 == r7) goto L23
            goto L3d
        L23:
            int r5 = r5 + 1
            goto L1a
        L26:
            java.lang.Object[] r2 = r8.zbd
            java.lang.Object[] r9 = r9.zbd
            int r8 = r8.zbb
            r3 = r1
        L2d:
            if (r3 >= r8) goto L3c
            r4 = r2[r3]
            r5 = r9[r3]
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L3d
            int r3 = r3 + 1
            goto L2d
        L3c:
            return r0
        L3d:
            return r1
    }

    public final int hashCode() {
            r8 = this;
            int r0 = r8.zbb
            int r1 = r0 + 527
            int[] r2 = r8.zbc
            r3 = 0
            r4 = 17
            r5 = r3
            r6 = r4
        Lb:
            if (r5 >= r0) goto L15
            int r6 = r6 * 31
            r7 = r2[r5]
            int r6 = r6 + r7
            int r5 = r5 + 1
            goto Lb
        L15:
            int r1 = r1 * 31
            int r1 = r1 + r6
            int r1 = r1 * 31
            java.lang.Object[] r0 = r8.zbd
            int r8 = r8.zbb
        L1e:
            if (r3 >= r8) goto L2c
            int r4 = r4 * 31
            r2 = r0[r3]
            int r2 = r2.hashCode()
            int r4 = r4 + r2
            int r3 = r3 + 1
            goto L1e
        L2c:
            int r1 = r1 + r4
            return r1
    }

    public final int zba() {
            r5 = this;
            int r0 = r5.zbe
            r1 = -1
            if (r0 != r1) goto L9e
            r0 = 0
            r1 = r0
        L7:
            int r2 = r5.zbb
            if (r0 >= r2) goto L9b
            int[] r2 = r5.zbc
            r2 = r2[r0]
            int r3 = r2 >>> 3
            r2 = r2 & 7
            if (r2 == 0) goto L82
            r4 = 1
            if (r2 == r4) goto L70
            r4 = 2
            if (r2 == r4) goto L57
            r4 = 3
            if (r2 == r4) goto L42
            r4 = 5
            if (r2 != r4) goto L35
            int r2 = r3 << 3
            java.lang.Object[] r3 = r5.zbd
            r3 = r3[r0]
            java.lang.Integer r3 = (java.lang.Integer) r3
            r3.getClass()
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r2)
            int r2 = r2 + 4
        L32:
            int r2 = r2 + r1
            r1 = r2
            goto L97
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbup r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbup
            java.lang.String r1 = "Protocol message tag had invalid wire type."
            r0.<init>(r1)
            r5.<init>(r0)
            throw r5
        L42:
            int r2 = r3 << 3
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r2)
            int r2 = r2 + r2
            java.lang.Object[] r3 = r5.zbd
            r3 = r3[r0]
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r3 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm) r3
            int r3 = r3.zba()
        L53:
            int r3 = r3 + r2
            int r3 = r3 + r1
            r1 = r3
            goto L97
        L57:
            int r2 = r3 << 3
            java.lang.Object[] r3 = r5.zbd
            r3 = r3[r0]
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r3 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc) r3
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r2)
            int r3 = r3.zbd()
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r3)
            int r4 = r4 + r3
            int r4 = r4 + r2
            int r4 = r4 + r1
            r1 = r4
            goto L97
        L70:
            int r2 = r3 << 3
            java.lang.Object[] r3 = r5.zbd
            r3 = r3[r0]
            java.lang.Long r3 = (java.lang.Long) r3
            r3.getClass()
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r2)
            int r2 = r2 + 8
            goto L32
        L82:
            int r2 = r3 << 3
            java.lang.Object[] r3 = r5.zbd
            r3 = r3[r0]
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r2)
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbE(r3)
            goto L53
        L97:
            int r0 = r0 + 1
            goto L7
        L9b:
            r5.zbe = r1
            return r1
        L9e:
            return r0
    }

    public final int zbb() {
            r6 = this;
            int r0 = r6.zbe
            r1 = -1
            if (r0 != r1) goto L40
            r0 = 0
            r1 = r0
        L7:
            int r2 = r6.zbb
            if (r0 >= r2) goto L3d
            int[] r2 = r6.zbc
            r2 = r2[r0]
            int r2 = r2 >>> 3
            java.lang.Object[] r3 = r6.zbd
            r3 = r3[r0]
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r3 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc) r3
            r4 = 8
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r4)
            int r4 = r4 + r4
            r5 = 16
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r5)
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r2)
            int r2 = r2 + r5
            r5 = 24
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r5)
            int r3 = r3.zbd()
            int r3 = defpackage.xg6.b(r3, r3, r5)
            int r4 = r4 + r2
            int r4 = r4 + r3
            int r1 = r1 + r4
            int r0 = r0 + 1
            goto L7
        L3d:
            r6.zbe = r1
            return r1
        L40:
            return r0
    }

    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm zbd(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r7) {
            r6 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm.zba
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L9
            return r6
        L9:
            r6.zbg()
            int r0 = r6.zbb
            int r1 = r7.zbb
            int r0 = r0 + r1
            r6.zbm(r0)
            int[] r1 = r7.zbc
            int[] r2 = r6.zbc
            int r3 = r6.zbb
            int r4 = r7.zbb
            r5 = 0
            java.lang.System.arraycopy(r1, r5, r2, r3, r4)
            java.lang.Object[] r1 = r7.zbd
            java.lang.Object[] r2 = r6.zbd
            int r3 = r6.zbb
            int r7 = r7.zbb
            java.lang.System.arraycopy(r1, r5, r2, r3, r7)
            r6.zbb = r0
            return r6
    }

    public final void zbg() {
            r0 = this;
            boolean r0 = r0.zbf
            if (r0 == 0) goto L5
            return
        L5:
            defpackage.e41.t()
            return
    }

    public final void zbh() {
            r1 = this;
            boolean r0 = r1.zbf
            if (r0 == 0) goto L7
            r0 = 0
            r1.zbf = r0
        L7:
            return
    }

    public final void zbi(java.lang.StringBuilder r4, int r5) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.zbb
            if (r0 >= r1) goto L19
            int[] r1 = r3.zbc
            r1 = r1[r0]
            int r1 = r1 >>> 3
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.Object[] r2 = r3.zbd
            r2 = r2[r0]
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvo.zbb(r4, r5, r1, r2)
            int r0 = r0 + 1
            goto L1
        L19:
            return
    }

    public final void zbj(int r3, java.lang.Object r4) {
            r2 = this;
            r2.zbg()
            int r0 = r2.zbb
            int r0 = r0 + 1
            r2.zbm(r0)
            int[] r0 = r2.zbc
            int r1 = r2.zbb
            r0[r1] = r3
            java.lang.Object[] r3 = r2.zbd
            r3[r1] = r4
            int r1 = r1 + 1
            r2.zbb = r1
            return
    }

    public final void zbk(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy r4) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.zbb
            if (r0 >= r1) goto L15
            int[] r1 = r3.zbc
            r1 = r1[r0]
            int r1 = r1 >>> 3
            java.lang.Object[] r2 = r3.zbd
            r2 = r2[r0]
            r4.zbx(r1, r2)
            int r0 = r0 + 1
            goto L1
        L15:
            return
    }

    public final void zbl(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy r7) {
            r6 = this;
            int r0 = r6.zbb
            if (r0 == 0) goto L61
            r0 = 0
        L5:
            int r1 = r6.zbb
            if (r0 >= r1) goto L61
            int[] r1 = r6.zbc
            r1 = r1[r0]
            java.lang.Object[] r2 = r6.zbd
            r2 = r2[r0]
            r3 = r1 & 7
            r4 = 3
            int r1 = r1 >>> r4
            if (r3 == 0) goto L55
            r5 = 1
            if (r3 == r5) goto L4b
            r5 = 2
            if (r3 == r5) goto L45
            if (r3 == r4) goto L39
            r4 = 5
            if (r3 != r4) goto L2c
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r7.zbk(r1, r2)
            goto L5e
        L2c:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbup r7 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbup
            java.lang.String r0 = "Protocol message tag had invalid wire type."
            r7.<init>(r0)
            r6.<init>(r7)
            throw r6
        L39:
            r7.zbG(r1)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r2 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm) r2
            r2.zbl(r7)
            r7.zbh(r1)
            goto L5e
        L45:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r2 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc) r2
            r7.zbd(r1, r2)
            goto L5e
        L4b:
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r7.zbm(r1, r2)
            goto L5e
        L55:
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r7.zbt(r1, r2)
        L5e:
            int r0 = r0 + 1
            goto L5
        L61:
            return
    }
}
