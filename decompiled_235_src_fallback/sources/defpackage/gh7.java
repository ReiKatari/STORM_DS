package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gh7  reason: default package */
/* loaded from: classes.dex */
public abstract class gh7 {
    public static final java.util.logging.Logger a = null;
    public static final sun.misc.Unsafe b = null;
    public static final java.lang.Class c = null;
    public static final defpackage.fh7 d = null;
    public static final boolean e = false;
    public static final boolean f = false;
    public static final long g = 0;
    public static final boolean h = false;

    static {
            java.lang.Class<gh7> r0 = defpackage.gh7.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            defpackage.gh7.a = r0
            sun.misc.Unsafe r0 = i()
            defpackage.gh7.b = r0
            java.lang.Class r1 = defpackage.hd.a
            defpackage.gh7.c = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r2 = e(r1)
            java.lang.Class r3 = java.lang.Integer.TYPE
            boolean r4 = e(r3)
            r5 = 0
            r6 = 1
            r7 = 0
            if (r0 != 0) goto L28
            goto L43
        L28:
            boolean r8 = defpackage.hd.a()
            if (r8 == 0) goto L3e
            if (r2 == 0) goto L36
            dh7 r7 = new dh7
            r7.<init>(r0, r6)
            goto L43
        L36:
            if (r4 == 0) goto L43
            dh7 r7 = new dh7
            r7.<init>(r0, r5)
            goto L43
        L3e:
            eh7 r7 = new eh7
            r7.<init>(r0)
        L43:
            defpackage.gh7.d = r7
            java.lang.String r2 = "copyMemory"
            java.lang.String r4 = "platform method missing - proto runtime falling back to safer methods: "
            java.lang.String r7 = "putLong"
            java.lang.String r8 = "putInt"
            java.lang.String r9 = "getInt"
            java.lang.Class r10 = java.lang.Byte.TYPE
            java.lang.String r11 = "putByte"
            java.lang.String r12 = "getByte"
            java.lang.Class<java.lang.reflect.Field> r13 = java.lang.reflect.Field.class
            java.lang.String r14 = "objectFieldOffset"
            java.lang.Class<java.lang.Object> r15 = java.lang.Object.class
            java.lang.String r5 = "getLong"
            if (r0 != 0) goto L64
        L5f:
            r16 = r13
        L61:
            r0 = 0
            goto Ld7
        L64:
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> Lc0
            java.lang.Class[] r6 = new java.lang.Class[]{r13}     // Catch: java.lang.Throwable -> Lc0
            r0.getMethod(r14, r6)     // Catch: java.lang.Throwable -> Lc0
            java.lang.Class[] r6 = new java.lang.Class[]{r15, r1}     // Catch: java.lang.Throwable -> Lc0
            r0.getMethod(r5, r6)     // Catch: java.lang.Throwable -> Lc0
            java.lang.reflect.Field r6 = d()     // Catch: java.lang.Throwable -> Lc0
            if (r6 != 0) goto L7d
            goto L5f
        L7d:
            boolean r6 = defpackage.hd.a()     // Catch: java.lang.Throwable -> Lc0
            if (r6 == 0) goto L87
        L83:
            r16 = r13
            r0 = 1
            goto Ld7
        L87:
            java.lang.Class[] r6 = new java.lang.Class[]{r1}     // Catch: java.lang.Throwable -> Lc0
            r0.getMethod(r12, r6)     // Catch: java.lang.Throwable -> Lc0
            java.lang.Class[] r6 = new java.lang.Class[]{r1, r10}     // Catch: java.lang.Throwable -> Lc0
            r0.getMethod(r11, r6)     // Catch: java.lang.Throwable -> Lc0
            java.lang.Class[] r6 = new java.lang.Class[]{r1}     // Catch: java.lang.Throwable -> Lc0
            r0.getMethod(r9, r6)     // Catch: java.lang.Throwable -> Lc0
            java.lang.Class[] r6 = new java.lang.Class[]{r1, r3}     // Catch: java.lang.Throwable -> Lc0
            r0.getMethod(r8, r6)     // Catch: java.lang.Throwable -> Lc0
            java.lang.Class[] r6 = new java.lang.Class[]{r1}     // Catch: java.lang.Throwable -> Lc0
            r0.getMethod(r5, r6)     // Catch: java.lang.Throwable -> Lc0
            java.lang.Class[] r6 = new java.lang.Class[]{r1, r1}     // Catch: java.lang.Throwable -> Lc0
            r0.getMethod(r7, r6)     // Catch: java.lang.Throwable -> Lc0
            java.lang.Class[] r6 = new java.lang.Class[]{r1, r1, r1}     // Catch: java.lang.Throwable -> Lc0
            r0.getMethod(r2, r6)     // Catch: java.lang.Throwable -> Lc0
            java.lang.Class[] r6 = new java.lang.Class[]{r15, r1, r15, r1, r1}     // Catch: java.lang.Throwable -> Lc0
            r0.getMethod(r2, r6)     // Catch: java.lang.Throwable -> Lc0
            goto L83
        Lc0:
            r0 = move-exception
            java.util.logging.Logger r2 = defpackage.gh7.a
            java.util.logging.Level r6 = java.util.logging.Level.WARNING
            r16 = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r4)
            r13.append(r0)
            java.lang.String r0 = r13.toString()
            r2.log(r6, r0)
            goto L61
        Ld7:
            defpackage.gh7.e = r0
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            sun.misc.Unsafe r2 = defpackage.gh7.b
            if (r2 != 0) goto Le2
        Ldf:
            r0 = 0
            goto L196
        Le2:
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> L180
            java.lang.Class[] r6 = new java.lang.Class[]{r16}     // Catch: java.lang.Throwable -> L180
            r2.getMethod(r14, r6)     // Catch: java.lang.Throwable -> L180
            java.lang.String r6 = "arrayBaseOffset"
            java.lang.Class[] r13 = new java.lang.Class[]{r0}     // Catch: java.lang.Throwable -> L180
            r2.getMethod(r6, r13)     // Catch: java.lang.Throwable -> L180
            java.lang.String r6 = "arrayIndexScale"
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch: java.lang.Throwable -> L180
            r2.getMethod(r6, r0)     // Catch: java.lang.Throwable -> L180
            java.lang.Class[] r0 = new java.lang.Class[]{r15, r1}     // Catch: java.lang.Throwable -> L180
            r2.getMethod(r9, r0)     // Catch: java.lang.Throwable -> L180
            java.lang.Class[] r0 = new java.lang.Class[]{r15, r1, r3}     // Catch: java.lang.Throwable -> L180
            r2.getMethod(r8, r0)     // Catch: java.lang.Throwable -> L180
            java.lang.Class[] r0 = new java.lang.Class[]{r15, r1}     // Catch: java.lang.Throwable -> L180
            r2.getMethod(r5, r0)     // Catch: java.lang.Throwable -> L180
            java.lang.Class[] r0 = new java.lang.Class[]{r15, r1, r1}     // Catch: java.lang.Throwable -> L180
            r2.getMethod(r7, r0)     // Catch: java.lang.Throwable -> L180
            java.lang.String r0 = "getObject"
            java.lang.Class[] r3 = new java.lang.Class[]{r15, r1}     // Catch: java.lang.Throwable -> L180
            r2.getMethod(r0, r3)     // Catch: java.lang.Throwable -> L180
            java.lang.String r0 = "putObject"
            java.lang.Class[] r3 = new java.lang.Class[]{r15, r1, r15}     // Catch: java.lang.Throwable -> L180
            r2.getMethod(r0, r3)     // Catch: java.lang.Throwable -> L180
            boolean r0 = defpackage.hd.a()     // Catch: java.lang.Throwable -> L180
            if (r0 == 0) goto L135
        L133:
            r0 = 1
            goto L196
        L135:
            java.lang.Class[] r0 = new java.lang.Class[]{r15, r1}     // Catch: java.lang.Throwable -> L180
            r2.getMethod(r12, r0)     // Catch: java.lang.Throwable -> L180
            java.lang.Class[] r0 = new java.lang.Class[]{r15, r1, r10}     // Catch: java.lang.Throwable -> L180
            r2.getMethod(r11, r0)     // Catch: java.lang.Throwable -> L180
            java.lang.String r0 = "getBoolean"
            java.lang.Class[] r3 = new java.lang.Class[]{r15, r1}     // Catch: java.lang.Throwable -> L180
            r2.getMethod(r0, r3)     // Catch: java.lang.Throwable -> L180
            java.lang.String r0 = "putBoolean"
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L180
            java.lang.Class[] r3 = new java.lang.Class[]{r15, r1, r3}     // Catch: java.lang.Throwable -> L180
            r2.getMethod(r0, r3)     // Catch: java.lang.Throwable -> L180
            java.lang.String r0 = "getFloat"
            java.lang.Class[] r3 = new java.lang.Class[]{r15, r1}     // Catch: java.lang.Throwable -> L180
            r2.getMethod(r0, r3)     // Catch: java.lang.Throwable -> L180
            java.lang.String r0 = "putFloat"
            java.lang.Class r3 = java.lang.Float.TYPE     // Catch: java.lang.Throwable -> L180
            java.lang.Class[] r3 = new java.lang.Class[]{r15, r1, r3}     // Catch: java.lang.Throwable -> L180
            r2.getMethod(r0, r3)     // Catch: java.lang.Throwable -> L180
            java.lang.String r0 = "getDouble"
            java.lang.Class[] r3 = new java.lang.Class[]{r15, r1}     // Catch: java.lang.Throwable -> L180
            r2.getMethod(r0, r3)     // Catch: java.lang.Throwable -> L180
            java.lang.String r0 = "putDouble"
            java.lang.Class r3 = java.lang.Double.TYPE     // Catch: java.lang.Throwable -> L180
            java.lang.Class[] r1 = new java.lang.Class[]{r15, r1, r3}     // Catch: java.lang.Throwable -> L180
            r2.getMethod(r0, r1)     // Catch: java.lang.Throwable -> L180
            goto L133
        L180:
            r0 = move-exception
            java.util.logging.Logger r1 = defpackage.gh7.a
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.log(r2, r0)
            goto Ldf
        L196:
            defpackage.gh7.f = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = b(r0)
            long r0 = (long) r0
            defpackage.gh7.g = r0
            java.lang.Class<boolean[]> r0 = boolean[].class
            b(r0)
            c(r0)
            java.lang.Class<int[]> r0 = int[].class
            b(r0)
            c(r0)
            java.lang.Class<long[]> r0 = long[].class
            b(r0)
            c(r0)
            java.lang.Class<float[]> r0 = float[].class
            b(r0)
            c(r0)
            java.lang.Class<double[]> r0 = double[].class
            b(r0)
            c(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            b(r0)
            c(r0)
            java.lang.reflect.Field r0 = d()
            if (r0 == 0) goto L1df
            fh7 r1 = defpackage.gh7.d
            if (r1 != 0) goto L1dc
            goto L1df
        L1dc:
            r1.j(r0)
        L1df:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L1e9
            r5 = 1
            goto L1ea
        L1e9:
            r5 = 0
        L1ea:
            defpackage.gh7.h = r5
            return
    }

    public static java.lang.Object a(java.lang.Class r1) {
            sun.misc.Unsafe r0 = defpackage.gh7.b     // Catch: java.lang.InstantiationException -> L7
            java.lang.Object r1 = r0.allocateInstance(r1)     // Catch: java.lang.InstantiationException -> L7
            return r1
        L7:
            r1 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
    }

    public static int b(java.lang.Class r1) {
            boolean r0 = defpackage.gh7.f
            if (r0 == 0) goto Lb
            fh7 r0 = defpackage.gh7.d
            int r1 = r0.a(r1)
            return r1
        Lb:
            r1 = -1
            return r1
    }

    public static void c(java.lang.Class r1) {
            boolean r0 = defpackage.gh7.f
            if (r0 == 0) goto L9
            fh7 r0 = defpackage.gh7.d
            r0.b(r1)
        L9:
            return
    }

    public static java.lang.reflect.Field d() {
            boolean r0 = defpackage.hd.a()
            java.lang.Class<java.nio.Buffer> r1 = java.nio.Buffer.class
            r2 = 0
            if (r0 == 0) goto L14
            java.lang.String r0 = "effectiveDirectAddress"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L10
            goto L11
        L10:
            r0 = r2
        L11:
            if (r0 == 0) goto L14
            return r0
        L14:
            java.lang.String r0 = "address"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L1b
            goto L1c
        L1b:
            r0 = r2
        L1c:
            if (r0 == 0) goto L27
            java.lang.Class r1 = r0.getType()
            java.lang.Class r3 = java.lang.Long.TYPE
            if (r1 != r3) goto L27
            r2 = r0
        L27:
            return r2
    }

    public static boolean e(java.lang.Class r7) {
            java.lang.Class<byte[]> r0 = byte[].class
            boolean r1 = defpackage.hd.a()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.lang.Class r1 = defpackage.gh7.c     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = "peekLong"
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L5e
            java.lang.Class[] r5 = new java.lang.Class[]{r7, r4}     // Catch: java.lang.Throwable -> L5e
            r1.getMethod(r3, r5)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = "pokeLong"
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L5e
            java.lang.Class[] r5 = new java.lang.Class[]{r7, r5, r4}     // Catch: java.lang.Throwable -> L5e
            r1.getMethod(r3, r5)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = "pokeInt"
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L5e
            java.lang.Class[] r6 = new java.lang.Class[]{r7, r5, r4}     // Catch: java.lang.Throwable -> L5e
            r1.getMethod(r3, r6)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = "peekInt"
            java.lang.Class[] r4 = new java.lang.Class[]{r7, r4}     // Catch: java.lang.Throwable -> L5e
            r1.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = "pokeByte"
            java.lang.Class r4 = java.lang.Byte.TYPE     // Catch: java.lang.Throwable -> L5e
            java.lang.Class[] r4 = new java.lang.Class[]{r7, r4}     // Catch: java.lang.Throwable -> L5e
            r1.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = "peekByte"
            java.lang.Class[] r4 = new java.lang.Class[]{r7}     // Catch: java.lang.Throwable -> L5e
            r1.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = "pokeByteArray"
            java.lang.Class[] r4 = new java.lang.Class[]{r7, r0, r5, r5}     // Catch: java.lang.Throwable -> L5e
            r1.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = "peekByteArray"
            java.lang.Class[] r7 = new java.lang.Class[]{r7, r0, r5, r5}     // Catch: java.lang.Throwable -> L5e
            r1.getMethod(r3, r7)     // Catch: java.lang.Throwable -> L5e
            r7 = 1
            return r7
        L5e:
            return r2
    }

    public static byte f(byte[] r2, long r3) {
            long r0 = defpackage.gh7.g
            long r0 = r0 + r3
            fh7 r3 = defpackage.gh7.d
            byte r2 = r3.d(r0, r2)
            return r2
    }

    public static byte g(long r3, java.lang.Object r5) {
            r0 = -4
            long r0 = r0 & r3
            fh7 r2 = defpackage.gh7.d
            int r5 = r2.g(r0, r5)
            long r3 = ~r3
            r0 = 3
            long r3 = r3 & r0
            r0 = 3
            long r3 = r3 << r0
            int r3 = (int) r3
            int r3 = r5 >>> r3
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            return r3
    }

    public static byte h(long r3, java.lang.Object r5) {
            r0 = -4
            long r0 = r0 & r3
            fh7 r2 = defpackage.gh7.d
            int r5 = r2.g(r0, r5)
            r0 = 3
            long r3 = r3 & r0
            r0 = 3
            long r3 = r3 << r0
            int r3 = (int) r3
            int r3 = r5 >>> r3
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            return r3
    }

    public static sun.misc.Unsafe i() {
            ch7 r0 = new ch7     // Catch: java.lang.Throwable -> Lc
            r0.<init>()     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch: java.lang.Throwable -> Lc
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch: java.lang.Throwable -> Lc
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public static void j(byte[] r2, long r3, byte r5) {
            long r0 = defpackage.gh7.g
            long r0 = r0 + r3
            fh7 r3 = defpackage.gh7.d
            r3.l(r2, r0, r5)
            return
    }

    public static void k(java.lang.Object r4, long r5, byte r7) {
            r0 = -4
            long r0 = r0 & r5
            fh7 r2 = defpackage.gh7.d
            int r2 = r2.g(r0, r4)
            int r5 = (int) r5
            int r5 = ~r5
            r5 = r5 & 3
            int r5 = r5 << 3
            r6 = 255(0xff, float:3.57E-43)
            int r3 = r6 << r5
            int r3 = ~r3
            r2 = r2 & r3
            r6 = r6 & r7
            int r5 = r6 << r5
            r5 = r5 | r2
            m(r4, r0, r5)
            return
    }

    public static void l(java.lang.Object r4, long r5, byte r7) {
            r0 = -4
            long r0 = r0 & r5
            fh7 r2 = defpackage.gh7.d
            int r2 = r2.g(r0, r4)
            int r5 = (int) r5
            r5 = r5 & 3
            int r5 = r5 << 3
            r6 = 255(0xff, float:3.57E-43)
            int r3 = r6 << r5
            int r3 = ~r3
            r2 = r2 & r3
            r6 = r6 & r7
            int r5 = r6 << r5
            r5 = r5 | r2
            m(r4, r0, r5)
            return
    }

    public static void m(java.lang.Object r1, long r2, int r4) {
            fh7 r0 = defpackage.gh7.d
            r0.o(r1, r2, r4)
            return
    }

    public static void n(java.lang.Object r6, long r7, long r9) {
            fh7 r0 = defpackage.gh7.d
            r1 = r6
            r2 = r7
            r4 = r9
            r0.p(r1, r2, r4)
            return
    }

    public static void o(java.lang.Object r1, long r2, java.lang.Object r4) {
            fh7 r0 = defpackage.gh7.d
            r0.q(r1, r2, r4)
            return
    }
}
