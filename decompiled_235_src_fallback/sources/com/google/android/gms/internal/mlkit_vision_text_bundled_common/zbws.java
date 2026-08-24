package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbws {
    static final long zba = 0;
    static final boolean zbb = false;
    private static final sun.misc.Unsafe zbc = null;
    private static final java.lang.Class zbd = null;
    private static final boolean zbe = false;
    private static final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr zbf = null;
    private static final boolean zbg = false;
    private static final boolean zbh = false;

    static {
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            sun.misc.Unsafe r1 = zbg()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc = r1
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsm.zba
            java.lang.Class<libcore.io.Memory> r2 = libcore.io.Memory.class
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbd = r2
            java.lang.Class r2 = java.lang.Long.TYPE
            boolean r3 = zbv(r2)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbe = r3
            java.lang.Class r4 = java.lang.Integer.TYPE
            boolean r5 = zbv(r4)
            r6 = 0
            if (r1 != 0) goto L20
            goto L2f
        L20:
            if (r3 == 0) goto L28
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwq r6 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwq
            r6.<init>(r1)
            goto L2f
        L28:
            if (r5 == 0) goto L2f
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp r6 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp
            r6.<init>(r1)
        L2f:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf = r6
            java.lang.String r1 = "getLong"
            java.lang.Class<java.lang.reflect.Field> r3 = java.lang.reflect.Field.class
            java.lang.String r5 = "objectFieldOffset"
            r7 = 1
            r8 = 0
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            if (r6 != 0) goto L3f
        L3d:
            r6 = r8
            goto L61
        L3f:
            sun.misc.Unsafe r6 = r6.zba
            java.lang.Class r6 = r6.getClass()     // Catch: java.lang.Throwable -> L5c
            java.lang.Class[] r10 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> L5c
            r6.getMethod(r5, r10)     // Catch: java.lang.Throwable -> L5c
            java.lang.Class[] r10 = new java.lang.Class[]{r9, r2}     // Catch: java.lang.Throwable -> L5c
            r6.getMethod(r1, r10)     // Catch: java.lang.Throwable -> L5c
            java.lang.reflect.Field r6 = zbB()     // Catch: java.lang.Throwable -> L5c
            if (r6 != 0) goto L5a
            goto L3d
        L5a:
            r6 = r7
            goto L61
        L5c:
            r6 = move-exception
            zbh(r6)
            goto L3d
        L61:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbg = r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf
            if (r6 != 0) goto L69
        L67:
            r0 = r8
            goto Lc3
        L69:
            sun.misc.Unsafe r6 = r6.zba
            java.lang.Class r6 = r6.getClass()     // Catch: java.lang.Throwable -> Lbe
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> Lbe
            r6.getMethod(r5, r3)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r3 = "arrayBaseOffset"
            java.lang.Class[] r5 = new java.lang.Class[]{r0}     // Catch: java.lang.Throwable -> Lbe
            r6.getMethod(r3, r5)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r3 = "arrayIndexScale"
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch: java.lang.Throwable -> Lbe
            r6.getMethod(r3, r0)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r0 = "getInt"
            java.lang.Class[] r3 = new java.lang.Class[]{r9, r2}     // Catch: java.lang.Throwable -> Lbe
            r6.getMethod(r0, r3)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r0 = "putInt"
            java.lang.Class[] r3 = new java.lang.Class[]{r9, r2, r4}     // Catch: java.lang.Throwable -> Lbe
            r6.getMethod(r0, r3)     // Catch: java.lang.Throwable -> Lbe
            java.lang.Class[] r0 = new java.lang.Class[]{r9, r2}     // Catch: java.lang.Throwable -> Lbe
            r6.getMethod(r1, r0)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r0 = "putLong"
            java.lang.Class[] r1 = new java.lang.Class[]{r9, r2, r2}     // Catch: java.lang.Throwable -> Lbe
            r6.getMethod(r0, r1)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r0 = "getObject"
            java.lang.Class[] r1 = new java.lang.Class[]{r9, r2}     // Catch: java.lang.Throwable -> Lbe
            r6.getMethod(r0, r1)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r0 = "putObject"
            java.lang.Class[] r1 = new java.lang.Class[]{r9, r2, r9}     // Catch: java.lang.Throwable -> Lbe
            r6.getMethod(r0, r1)     // Catch: java.lang.Throwable -> Lbe
            r0 = r7
            goto Lc3
        Lbe:
            r0 = move-exception
            zbh(r0)
            goto L67
        Lc3:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbh = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = zbz(r0)
            long r0 = (long) r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zba = r0
            java.lang.Class<boolean[]> r0 = boolean[].class
            zbz(r0)
            zbA(r0)
            java.lang.Class<int[]> r0 = int[].class
            zbz(r0)
            zbA(r0)
            java.lang.Class<long[]> r0 = long[].class
            zbz(r0)
            zbA(r0)
            java.lang.Class<float[]> r0 = float[].class
            zbz(r0)
            zbA(r0)
            java.lang.Class<double[]> r0 = double[].class
            zbz(r0)
            zbA(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            zbz(r0)
            zbA(r0)
            java.lang.reflect.Field r0 = zbB()
            if (r0 == 0) goto L10d
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf
            if (r1 == 0) goto L10d
            sun.misc.Unsafe r1 = r1.zba
            r1.objectFieldOffset(r0)
        L10d:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L116
            goto L117
        L116:
            r7 = r8
        L117:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbb = r7
            return
    }

    private zbws() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int zbA(java.lang.Class r1) {
            boolean r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbh
            if (r0 == 0) goto Ld
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf
            sun.misc.Unsafe r0 = r0.zba
            int r1 = r0.arrayIndexScale(r1)
            return r1
        Ld:
            r1 = -1
            return r1
    }

    private static java.lang.reflect.Field zbB() {
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsm.zba
            java.lang.String r0 = "effectiveDirectAddress"
            java.lang.Class<java.nio.Buffer> r1 = java.nio.Buffer.class
            java.lang.reflect.Field r0 = zbC(r1, r0)
            if (r0 != 0) goto L1e
            java.lang.String r0 = "address"
            java.lang.reflect.Field r0 = zbC(r1, r0)
            if (r0 == 0) goto L1d
            java.lang.Class r1 = r0.getType()
            java.lang.Class r2 = java.lang.Long.TYPE
            if (r1 != r2) goto L1d
            return r0
        L1d:
            r0 = 0
        L1e:
            return r0
    }

    private static java.lang.reflect.Field zbC(java.lang.Class r0, java.lang.String r1) {
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    private static void zbD(java.lang.Object r5, long r6, byte r8) {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf
            sun.misc.Unsafe r1 = r0.zba
            r2 = -4
            long r2 = r2 & r6
            int r1 = r1.getInt(r5, r2)
            int r6 = (int) r6
            int r6 = ~r6
            r6 = r6 & 3
            int r6 = r6 << 3
            r7 = 255(0xff, float:3.57E-43)
            int r4 = r7 << r6
            int r4 = ~r4
            r1 = r1 & r4
            sun.misc.Unsafe r0 = r0.zba
            r7 = r7 & r8
            int r6 = r7 << r6
            r6 = r6 | r1
            r0.putInt(r5, r2, r6)
            return
    }

    private static void zbE(java.lang.Object r5, long r6, byte r8) {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf
            sun.misc.Unsafe r1 = r0.zba
            r2 = -4
            long r2 = r2 & r6
            int r1 = r1.getInt(r5, r2)
            int r6 = (int) r6
            r6 = r6 & 3
            int r6 = r6 << 3
            r7 = 255(0xff, float:3.57E-43)
            int r4 = r7 << r6
            int r4 = ~r4
            r1 = r1 & r4
            sun.misc.Unsafe r0 = r0.zba
            r7 = r7 & r8
            int r6 = r7 << r6
            r6 = r6 | r1
            r0.putInt(r5, r2, r6)
            return
    }

    public static double zba(java.lang.Object r1, long r2) {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf
            double r1 = r0.zba(r1, r2)
            return r1
    }

    public static float zbb(java.lang.Object r1, long r2) {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf
            float r1 = r0.zbb(r1, r2)
            return r1
    }

    public static int zbc(java.lang.Object r1, long r2) {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf
            sun.misc.Unsafe r0 = r0.zba
            int r1 = r0.getInt(r1, r2)
            return r1
    }

    public static long zbd(java.lang.Object r1, long r2) {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf
            sun.misc.Unsafe r0 = r0.zba
            long r1 = r0.getLong(r1, r2)
            return r1
    }

    public static java.lang.Object zbe(java.lang.Class r1) {
            sun.misc.Unsafe r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc     // Catch: java.lang.InstantiationException -> L7
            java.lang.Object r1 = r0.allocateInstance(r1)     // Catch: java.lang.InstantiationException -> L7
            return r1
        L7:
            r1 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
    }

    public static java.lang.Object zbf(java.lang.Object r1, long r2) {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf
            sun.misc.Unsafe r0 = r0.zba
            java.lang.Object r1 = r0.getObject(r1, r2)
            return r1
    }

    public static sun.misc.Unsafe zbg() {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwo r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwo     // Catch: java.lang.Throwable -> Lc
            r0.<init>()     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch: java.lang.Throwable -> Lc
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch: java.lang.Throwable -> Lc
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public static /* bridge */ /* synthetic */ void zbh(java.lang.Throwable r4) {
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws> r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            java.lang.String r4 = r4.toString()
            java.lang.String r2 = "platform method missing - proto runtime falling back to safer methods: "
            java.lang.String r4 = r2.concat(r4)
            java.lang.String r2 = "com.google.protobuf.UnsafeUtil"
            java.lang.String r3 = "logMissingMethod"
            r0.logp(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void zbi(java.lang.Object r0, long r1, boolean r3) {
            zbD(r0, r1, r3)
            return
    }

    public static /* synthetic */ void zbj(java.lang.Object r0, long r1, boolean r3) {
            zbE(r0, r1, r3)
            return
    }

    public static /* bridge */ /* synthetic */ void zbk(java.lang.Object r0, long r1, byte r3) {
            zbD(r0, r1, r3)
            return
    }

    public static /* bridge */ /* synthetic */ void zbl(java.lang.Object r0, long r1, byte r3) {
            zbE(r0, r1, r3)
            return
    }

    public static void zbm(java.lang.Object r1, long r2, boolean r4) {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf
            r0.zbc(r1, r2, r4)
            return
    }

    public static void zbn(byte[] r3, long r4, byte r6) {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf
            long r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zba
            long r1 = r1 + r4
            r0.zbd(r3, r1, r6)
            return
    }

    public static void zbo(java.lang.Object r6, long r7, double r9) {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf
            r1 = r6
            r2 = r7
            r4 = r9
            r0.zbe(r1, r2, r4)
            return
    }

    public static void zbp(java.lang.Object r1, long r2, float r4) {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf
            r0.zbf(r1, r2, r4)
            return
    }

    public static void zbq(java.lang.Object r1, long r2, int r4) {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf
            sun.misc.Unsafe r0 = r0.zba
            r0.putInt(r1, r2, r4)
            return
    }

    public static void zbr(java.lang.Object r7, long r8, long r10) {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf
            sun.misc.Unsafe r1 = r0.zba
            r2 = r7
            r3 = r8
            r5 = r10
            r1.putLong(r2, r3, r5)
            return
    }

    public static void zbs(java.lang.Object r1, long r2, java.lang.Object r4) {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf
            sun.misc.Unsafe r0 = r0.zba
            r0.putObject(r1, r2, r4)
            return
    }

    public static /* bridge */ /* synthetic */ boolean zbt(java.lang.Object r3, long r4) {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf
            sun.misc.Unsafe r0 = r0.zba
            r1 = -4
            long r1 = r1 & r4
            int r3 = r0.getInt(r3, r1)
            long r4 = ~r4
            r0 = 3
            long r4 = r4 & r0
            r0 = 3
            long r4 = r4 << r0
            int r4 = (int) r4
            int r3 = r3 >>> r4
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            if (r3 == 0) goto L1a
            r3 = 1
            return r3
        L1a:
            r3 = 0
            return r3
    }

    public static /* bridge */ /* synthetic */ boolean zbu(java.lang.Object r3, long r4) {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf
            sun.misc.Unsafe r0 = r0.zba
            r1 = -4
            long r1 = r1 & r4
            int r3 = r0.getInt(r3, r1)
            r0 = 3
            long r4 = r4 & r0
            r0 = 3
            long r4 = r4 << r0
            int r4 = (int) r4
            int r3 = r3 >>> r4
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            if (r3 == 0) goto L19
            r3 = 1
            return r3
        L19:
            r3 = 0
            return r3
    }

    public static boolean zbv(java.lang.Class r6) {
            java.lang.Class<byte[]> r0 = byte[].class
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsm.zba
            java.lang.Class r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbd     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = "peekLong"
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L58
            java.lang.Class[] r4 = new java.lang.Class[]{r6, r3}     // Catch: java.lang.Throwable -> L58
            r1.getMethod(r2, r4)     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = "pokeLong"
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L58
            java.lang.Class[] r4 = new java.lang.Class[]{r6, r4, r3}     // Catch: java.lang.Throwable -> L58
            r1.getMethod(r2, r4)     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = "pokeInt"
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L58
            java.lang.Class[] r5 = new java.lang.Class[]{r6, r4, r3}     // Catch: java.lang.Throwable -> L58
            r1.getMethod(r2, r5)     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = "peekInt"
            java.lang.Class[] r3 = new java.lang.Class[]{r6, r3}     // Catch: java.lang.Throwable -> L58
            r1.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = "pokeByte"
            java.lang.Class r3 = java.lang.Byte.TYPE     // Catch: java.lang.Throwable -> L58
            java.lang.Class[] r3 = new java.lang.Class[]{r6, r3}     // Catch: java.lang.Throwable -> L58
            r1.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = "peekByte"
            java.lang.Class[] r3 = new java.lang.Class[]{r6}     // Catch: java.lang.Throwable -> L58
            r1.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = "pokeByteArray"
            java.lang.Class[] r3 = new java.lang.Class[]{r6, r0, r4, r4}     // Catch: java.lang.Throwable -> L58
            r1.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = "peekByteArray"
            java.lang.Class[] r6 = new java.lang.Class[]{r6, r0, r4, r4}     // Catch: java.lang.Throwable -> L58
            r1.getMethod(r2, r6)     // Catch: java.lang.Throwable -> L58
            r6 = 1
            return r6
        L58:
            r6 = 0
            return r6
    }

    public static boolean zbw(java.lang.Object r1, long r2) {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf
            boolean r1 = r0.zbg(r1, r2)
            return r1
    }

    public static boolean zbx() {
            boolean r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbh
            return r0
    }

    public static boolean zby() {
            boolean r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbg
            return r0
    }

    private static int zbz(java.lang.Class r1) {
            boolean r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbh
            if (r0 == 0) goto Ld
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf
            sun.misc.Unsafe r0 = r0.zba
            int r1 = r0.arrayBaseOffset(r1)
            return r1
        Ld:
            r1 = -1
            return r1
    }
}
