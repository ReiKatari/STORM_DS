package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbvz {
    public static final /* synthetic */ int zba = 0;
    private static final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwl zbb = null;

    static {
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu.zba
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwn r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwn
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbb = r0
            return
    }

    public static void zbA(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy r3, boolean r4) {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zbD(r1, r2, r4)
        Lb:
            return
    }

    public static void zbB(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy r3, boolean r4) {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zbF(r1, r2, r4)
        Lb:
            return
    }

    public static void zbC(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy r3, boolean r4) {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zbK(r1, r2, r4)
        Lb:
            return
    }

    public static void zbD(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy r3, boolean r4) {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zbM(r1, r2, r4)
        Lb:
            return
    }

    public static boolean zbE(java.lang.Object r2, java.lang.Object r3) {
            r0 = 1
            if (r2 == r3) goto Le
            r1 = 0
            if (r2 == 0) goto Ld
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Ld
            return r0
        Ld:
            return r1
        Le:
            return r0
    }

    public static int zba(java.util.List r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug
            if (r2 == 0) goto L1f
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug r5 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug) r5
            r2 = r1
        Lf:
            if (r1 >= r0) goto L1e
            int r3 = r5.zbe(r1)
            long r3 = (long) r3
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbE(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1e:
            return r2
        L1f:
            r2 = r1
        L20:
            if (r1 >= r0) goto L35
            java.lang.Object r3 = r5.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            long r3 = (long) r3
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbE(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L20
        L35:
            return r2
    }

    public static int zbb(int r0, java.util.List r1, boolean r2) {
            int r1 = r1.size()
            if (r1 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r0 << 3
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r0)
            int r0 = r0 + 4
            int r0 = r0 * r1
            return r0
    }

    public static int zbc(java.util.List r0) {
            int r0 = r0.size()
            int r0 = r0 * 4
            return r0
    }

    public static int zbd(int r0, java.util.List r1, boolean r2) {
            int r1 = r1.size()
            if (r1 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r0 << 3
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r0)
            int r0 = r0 + 8
            int r0 = r0 * r1
            return r0
    }

    public static int zbe(java.util.List r0) {
            int r0 = r0.size()
            int r0 = r0 * 8
            return r0
    }

    public static int zbf(java.util.List r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug
            if (r2 == 0) goto L1f
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug r5 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug) r5
            r2 = r1
        Lf:
            if (r1 >= r0) goto L1e
            int r3 = r5.zbe(r1)
            long r3 = (long) r3
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbE(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1e:
            return r2
        L1f:
            r2 = r1
        L20:
            if (r1 >= r0) goto L35
            java.lang.Object r3 = r5.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            long r3 = (long) r3
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbE(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L20
        L35:
            return r2
    }

    public static int zbg(java.util.List r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva
            if (r2 == 0) goto L1e
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva r5 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva) r5
            r2 = r1
        Lf:
            if (r1 >= r0) goto L1d
            long r3 = r5.zbe(r1)
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbE(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1d:
            return r2
        L1e:
            r2 = r1
        L1f:
            if (r1 >= r0) goto L33
            java.lang.Object r3 = r5.get(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbE(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1f
        L33:
            return r2
    }

    public static int zbh(int r1, java.lang.Object r2, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r3) {
            int r1 = r1 << 3
            boolean r0 = r2 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuw
            if (r0 == 0) goto L15
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuw r2 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuw) r2
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r1)
            int r2 = r2.zba()
            int r1 = defpackage.xg6.b(r2, r2, r1)
            return r1
        L15:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r2 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm) r2
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r1)
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbB(r2, r3)
            int r2 = r2 + r1
            return r2
    }

    public static int zbi(java.util.List r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug
            if (r2 == 0) goto L23
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug r5 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug) r5
            r2 = r1
        Lf:
            if (r1 >= r0) goto L22
            int r3 = r5.zbe(r1)
            int r4 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r4
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L22:
            return r2
        L23:
            r2 = r1
        L24:
            if (r1 >= r0) goto L3d
            java.lang.Object r3 = r5.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r4 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r4
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L24
        L3d:
            return r2
    }

    public static int zbj(java.util.List r8) {
            int r0 = r8.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r8 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva
            r3 = 63
            if (r2 == 0) goto L24
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva r8 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva) r8
            r2 = r1
        L11:
            if (r1 >= r0) goto L23
            long r4 = r8.zbe(r1)
            long r6 = r4 + r4
            long r4 = r4 >> r3
            long r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbE(r4)
            int r2 = r2 + r4
            int r1 = r1 + 1
            goto L11
        L23:
            return r2
        L24:
            r2 = r1
        L25:
            if (r1 >= r0) goto L3d
            java.lang.Object r4 = r8.get(r1)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            long r6 = r4 + r4
            long r4 = r4 >> r3
            long r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbE(r4)
            int r2 = r2 + r4
            int r1 = r1 + 1
            goto L25
        L3d:
            return r2
    }

    public static int zbk(java.util.List r4) {
            int r0 = r4.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r4 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug
            if (r2 == 0) goto L1e
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug r4 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug) r4
            r2 = r1
        Lf:
            if (r1 >= r0) goto L1d
            int r3 = r4.zbe(r1)
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1d:
            return r2
        L1e:
            r2 = r1
        L1f:
            if (r1 >= r0) goto L33
            java.lang.Object r3 = r4.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1f
        L33:
            return r2
    }

    public static int zbl(java.util.List r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva
            if (r2 == 0) goto L1e
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva r5 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva) r5
            r2 = r1
        Lf:
            if (r1 >= r0) goto L1d
            long r3 = r5.zbe(r1)
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbE(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1d:
            return r2
        L1e:
            r2 = r1
        L1f:
            if (r1 >= r0) goto L33
            java.lang.Object r3 = r5.get(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbE(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1f
        L33:
            return r2
    }

    public static com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwl zbm() {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwl r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbb
            return r0
    }

    public static java.lang.Object zbn(java.lang.Object r2, int r3, int r4, java.lang.Object r5, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwl r6) {
            if (r5 != 0) goto L6
            java.lang.Object r5 = r6.zba(r2)
        L6:
            long r0 = (long) r4
            int r2 = r3 << 3
            r3 = r5
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r3 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm) r3
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            r3.zbj(r2, r4)
            return r5
    }

    public static void zbo(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtq r0, java.lang.Object r1, java.lang.Object r2) {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub r2 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub) r2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtu r0 = r2.zbb
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh r2 = r0.zba
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L15
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub r1 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub) r1
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtu r1 = r1.zbg()
            r1.zbi(r0)
        L15:
            return
    }

    public static void zbp(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwl r1, java.lang.Object r2, java.lang.Object r3) {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r2 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf) r2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r1 = r2.zbc
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r3 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf) r3
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r3 = r3.zbc
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm.zbc()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L24
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm.zbc()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L21
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm.zbe(r1, r3)
            goto L24
        L21:
            r1.zbd(r3)
        L24:
            r2.zbc = r1
            return
    }

    public static void zbq(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy r3, boolean r4) {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zbc(r1, r2, r4)
        Lb:
            return
    }

    public static void zbr(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy r3, boolean r4) {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zbg(r1, r2, r4)
        Lb:
            return
    }

    public static void zbs(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy r3, boolean r4) {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zbj(r1, r2, r4)
        Lb:
            return
    }

    public static void zbt(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy r3, boolean r4) {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zbl(r1, r2, r4)
        Lb:
            return
    }

    public static void zbu(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy r3, boolean r4) {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zbn(r1, r2, r4)
        Lb:
            return
    }

    public static void zbv(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy r3, boolean r4) {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zbp(r1, r2, r4)
        Lb:
            return
    }

    public static void zbw(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy r3, boolean r4) {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zbs(r1, r2, r4)
        Lb:
            return
    }

    public static void zbx(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy r3, boolean r4) {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zbu(r1, r2, r4)
        Lb:
            return
    }

    public static void zby(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy r3, boolean r4) {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zbz(r1, r2, r4)
        Lb:
            return
    }

    public static void zbz(int r1, java.util.List r2, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy r3, boolean r4) {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zbB(r1, r2, r4)
        Lb:
            return
    }
}
