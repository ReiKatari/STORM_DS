package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zbtk extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbst {
    private static final java.util.logging.Logger zbb = null;
    private static final boolean zbc = false;
    com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtl zba;

    static {
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk> r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbb = r0
            boolean r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbx()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbc = r0
            return
    }

    private zbtk() {
            r0 = this;
            r0 = 0
            throw r0
    }

    public /* synthetic */ zbtk(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtj r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static int zbA(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r1) {
            int r1 = r1.zbo()
            int r0 = zbD(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int zbB(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r0, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r1) {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsj r0 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsj) r0
            int r0 = r0.zbj(r1)
            int r1 = zbD(r0)
            int r1 = r1 + r0
            return r1
    }

    public static int zbC(java.lang.String r1) {
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwv.zbc(r1)     // Catch: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwu -> L5
            goto Lc
        L5:
            java.nio.charset.Charset r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zba
            byte[] r1 = r1.getBytes(r0)
            int r1 = r1.length
        Lc:
            int r0 = zbD(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int zbD(int r0) {
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)
            int r0 = r0 * 9
            int r0 = 352 - r0
            int r0 = r0 >>> 6
            return r0
    }

    public static int zbE(long r0) {
            int r0 = java.lang.Long.numberOfLeadingZeros(r0)
            int r0 = r0 * 9
            int r0 = 640 - r0
            int r0 = r0 >>> 6
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean zbH() {
            boolean r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbc
            return r0
    }

    @java.lang.Deprecated
    public static int zbz(int r0, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r1, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r2) {
            int r0 = r0 << 3
            int r0 = zbD(r0)
            int r0 = r0 + r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsj r1 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsj) r1
            int r1 = r1.zbj(r2)
            int r1 = r1 + r0
            return r1
    }

    public final void zbF() {
            r0 = this;
            int r0 = r0.zba()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r0 = "Did not write as much data as expected."
            defpackage.i.m(r0)
            return
    }

    public final void zbG(java.lang.String r7, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwu r8) {
            r6 = this;
            java.util.logging.Logger r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbb
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            java.lang.String r3 = "inefficientWriteStringNoTag"
            java.lang.String r4 = "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!"
            java.lang.String r2 = "com.google.protobuf.CodedOutputStream"
            r5 = r8
            r0.logp(r1, r2, r3, r4, r5)
            java.nio.charset.Charset r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zba
            byte[] r7 = r7.getBytes(r8)
            int r8 = r7.length     // Catch: java.lang.IndexOutOfBoundsException -> L1d
            r6.zbw(r8)     // Catch: java.lang.IndexOutOfBoundsException -> L1d
            r0 = 0
            r6.zbn(r7, r0, r8)     // Catch: java.lang.IndexOutOfBoundsException -> L1d
            return
        L1d:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbti r7 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbti
            r7.<init>(r6)
            throw r7
    }

    public abstract int zba();

    public abstract void zbb(byte r1);

    public abstract void zbd(int r1, boolean r2);

    public abstract void zbe(byte[] r1, int r2, int r3);

    public abstract void zbf(int r1, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r2);

    public abstract void zbg(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r1);

    public abstract void zbh(int r1, int r2);

    public abstract void zbi(int r1);

    public abstract void zbj(int r1, long r2);

    public abstract void zbk(long r1);

    public abstract void zbl(int r1, int r2);

    public abstract void zbm(int r1);

    public abstract void zbn(byte[] r1, int r2, int r3);

    public abstract void zbo(int r1, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r2, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r3);

    public abstract void zbp(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r1);

    public abstract void zbq(int r1, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r2);

    public abstract void zbr(int r1, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r2);

    public abstract void zbs(int r1, java.lang.String r2);

    public abstract void zbt(java.lang.String r1);

    public abstract void zbu(int r1, int r2);

    public abstract void zbv(int r1, int r2);

    public abstract void zbw(int r1);

    public abstract void zbx(int r1, long r2);

    public abstract void zby(long r1);
}
