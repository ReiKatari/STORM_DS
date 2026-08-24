package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: az7  reason: default package */
/* loaded from: classes.dex */
public abstract class az7 {
    public static final java.util.TimeZone a = null;
    public static final java.lang.String b = null;

    static {
            java.lang.String r0 = "GMT"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            r0.getClass()
            defpackage.az7.a = r0
            java.lang.Class<xk4> r0 = defpackage.xk4.class
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "okhttp3."
            java.lang.String r0 = defpackage.qs6.D0(r0, r1)
            java.lang.String r1 = "Client"
            java.lang.String r0 = defpackage.qs6.E0(r0, r1)
            defpackage.az7.b = r0
            return
    }

    public static final boolean a(defpackage.i03 r2, defpackage.i03 r3) {
            r2.getClass()
            r3.getClass()
            java.lang.String r0 = r2.d
            java.lang.String r1 = r3.d
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L22
            int r0 = r2.e
            int r1 = r3.e
            if (r0 != r1) goto L22
            java.lang.String r2 = r2.a
            java.lang.String r3 = r3.a
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 == 0) goto L22
            r2 = 1
            return r2
        L22:
            r2 = 0
            return r2
    }

    public static final int b(long r8) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r0.getClass()
            r1 = 0
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            r4 = 0
            java.lang.String r5 = "timeout"
            if (r3 < 0) goto L36
            long r8 = r0.toMillis(r8)
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 > 0) goto L2c
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L2a
            if (r3 > 0) goto L20
            goto L2a
        L20:
            java.lang.String r8 = " too small"
            java.lang.String r8 = r5.concat(r8)
            defpackage.i.f(r8)
            return r4
        L2a:
            int r8 = (int) r8
            return r8
        L2c:
            java.lang.String r8 = " too large"
            java.lang.String r8 = r5.concat(r8)
            defpackage.i.f(r8)
            return r4
        L36:
            java.lang.String r8 = " < 0"
            java.lang.String r8 = r5.concat(r8)
            defpackage.u34.f(r8)
            return r4
    }

    public static final void c(java.net.Socket r2) {
            r2.getClass()
            r2.close()     // Catch: java.lang.Exception -> L6 java.lang.RuntimeException -> L7 java.lang.AssertionError -> L16
        L6:
            return
        L7:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            java.lang.String r1 = "bio == null"
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L15
            return
        L15:
            throw r2
        L16:
            r2 = move-exception
            throw r2
    }

    public static final java.lang.String d(java.lang.String r2, java.lang.Object... r3) {
            java.util.Locale r0 = java.util.Locale.US
            int r1 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
            int r1 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
            java.lang.String r2 = java.lang.String.format(r0, r2, r3)
            return r2
    }

    public static final long e(defpackage.wl5 r3) {
            yw2 r3 = r3.Y
            java.lang.String r0 = "Content-Length"
            java.lang.String r3 = r3.a(r0)
            r0 = -1
            if (r3 == 0) goto L12
            byte[] r2 = defpackage.yy7.a
            long r0 = java.lang.Long.parseLong(r3)     // Catch: java.lang.NumberFormatException -> L12
        L12:
            return r0
    }

    public static final java.nio.charset.Charset f(defpackage.z80 r1, java.nio.charset.Charset r2) {
            r1.getClass()
            r2.getClass()
            eo4 r0 = defpackage.yy7.b
            int r1 = r1.t(r0)
            r0 = -1
            if (r1 == r0) goto L50
            if (r1 == 0) goto L4d
            r2 = 1
            if (r1 == r2) goto L4a
            r2 = 2
            if (r1 == r2) goto L38
            r2 = 3
            if (r1 == r2) goto L35
            r2 = 4
            if (r1 != r2) goto L2f
            java.nio.charset.Charset r1 = defpackage.qm0.a
            java.nio.charset.Charset r1 = defpackage.qm0.f
            if (r1 != 0) goto L2e
            java.lang.String r1 = "UTF-32BE"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            r1.getClass()
            defpackage.qm0.f = r1
        L2e:
            return r1
        L2f:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L35:
            java.nio.charset.Charset r1 = defpackage.qm0.c
            return r1
        L38:
            java.nio.charset.Charset r1 = defpackage.qm0.a
            java.nio.charset.Charset r1 = defpackage.qm0.e
            if (r1 != 0) goto L49
            java.lang.String r1 = "UTF-32LE"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            r1.getClass()
            defpackage.qm0.e = r1
        L49:
            return r1
        L4a:
            java.nio.charset.Charset r1 = defpackage.qm0.b
            return r1
        L4d:
            java.nio.charset.Charset r1 = defpackage.qm0.a
            return r1
        L50:
            return r2
    }

    public static final boolean g(defpackage.in6 r12, int r13) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.getClass()
            long r1 = java.lang.System.nanoTime()
            b67 r3 = r12.b()
            boolean r3 = r3.e()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == 0) goto L22
            b67 r3 = r12.b()
            long r6 = r3.c()
            long r6 = r6 - r1
            goto L23
        L22:
            r6 = r4
        L23:
            b67 r3 = r12.b()
            long r8 = (long) r13
            long r8 = r0.toNanos(r8)
            long r8 = java.lang.Math.min(r6, r8)
            long r8 = r8 + r1
            r3.d(r8)
            k80 r13 = new k80     // Catch: java.lang.Throwable -> L49 java.io.InterruptedIOException -> L76
            r13.<init>()     // Catch: java.lang.Throwable -> L49 java.io.InterruptedIOException -> L76
        L39:
            r8 = 8192(0x2000, double:4.0474E-320)
            long r8 = r12.b0(r13, r8)     // Catch: java.lang.Throwable -> L49 java.io.InterruptedIOException -> L76
            r10 = -1
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 == 0) goto L4b
            r13.e()     // Catch: java.lang.Throwable -> L49 java.io.InterruptedIOException -> L76
            goto L39
        L49:
            r13 = move-exception
            goto L61
        L4b:
            int r13 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r0 = 1
            if (r13 != 0) goto L58
            b67 r12 = r12.b()
            r12.a()
            return r0
        L58:
            b67 r12 = r12.b()
            long r1 = r1 + r6
            r12.d(r1)
            return r0
        L61:
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L6d
            b67 r12 = r12.b()
            r12.a()
            goto L75
        L6d:
            b67 r12 = r12.b()
            long r1 = r1 + r6
            r12.d(r1)
        L75:
            throw r13
        L76:
            int r13 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r13 != 0) goto L82
            b67 r12 = r12.b()
            r12.a()
            goto L8a
        L82:
            b67 r12 = r12.b()
            long r1 = r1 + r6
            r12.d(r1)
        L8a:
            r12 = 0
            return r12
    }

    public static final defpackage.yw2 h(java.util.List r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 20
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        Lb:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r3.next()
            uw2 r1 = (defpackage.uw2) r1
            da0 r2 = r1.a
            da0 r1 = r1.b
            java.lang.String r2 = r2.s()
            java.lang.String r1 = r1.s()
            r0.add(r2)
            java.lang.CharSequence r1 = defpackage.qs6.T0(r1)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            goto Lb
        L32:
            yw2 r3 = new yw2
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r3.<init>(r0)
            return r3
    }

    public static final java.lang.String i(defpackage.i03 r4, boolean r5) {
            r4.getClass()
            int r0 = r4.e
            java.lang.String r1 = r4.d
            java.lang.String r2 = ":"
            r3 = 0
            boolean r2 = defpackage.qs6.j0(r1, r2, r3)
            if (r2 == 0) goto L18
            java.lang.String r2 = "["
            r3 = 93
            java.lang.String r1 = defpackage.i61.k(r3, r2, r1)
        L18:
            if (r5 != 0) goto L3a
            java.lang.String r4 = r4.a
            r4.getClass()
            java.lang.String r5 = "http"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L2a
            r4 = 80
            goto L36
        L2a:
            java.lang.String r5 = "https"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L35
            r4 = 443(0x1bb, float:6.21E-43)
            goto L36
        L35:
            r4 = -1
        L36:
            if (r0 == r4) goto L39
            goto L3a
        L39:
            return r1
        L3a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r5 = 58
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            return r4
    }

    public static final java.util.List j(java.util.List r2) {
            r2.getClass()
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lc
            yt1 r2 = defpackage.yt1.A
            return r2
        Lc:
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto L20
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r2.getClass()
            return r2
        L20:
            java.lang.Object[] r2 = r2.toArray()
            r2.getClass()
            java.util.List r2 = java.util.Arrays.asList(r2)
            r2.getClass()
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r2.getClass()
            return r2
    }

    public static final java.util.List k(java.lang.Object[] r2) {
            if (r2 == 0) goto L27
            int r0 = r2.length
            if (r0 != 0) goto L6
            goto L27
        L6:
            int r0 = r2.length
            r1 = 1
            if (r0 != r1) goto L15
            r0 = 0
            r2 = r2[r0]
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r2.getClass()
            return r2
        L15:
            java.lang.Object r2 = r2.clone()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.util.List r2 = defpackage.fv.l0(r2)
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r2.getClass()
            return r2
        L27:
            yt1 r2 = defpackage.yt1.A
            return r2
    }
}
