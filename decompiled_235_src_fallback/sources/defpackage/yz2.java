package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yz2  reason: default package */
/* loaded from: classes.dex */
public final class yz2 implements java.io.Closeable {
    public static final java.util.logging.Logger Y = null;
    public final defpackage.y80 A;
    public final defpackage.k80 B;
    public int L;
    public boolean R;
    public final defpackage.wy2 X;

    static {
            java.lang.Class<iz2> r0 = defpackage.iz2.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            defpackage.yz2.Y = r0
            return
    }

    public yz2(defpackage.ee5 r2) {
            r1 = this;
            r2.getClass()
            r1.<init>()
            r1.A = r2
            k80 r2 = new k80
            r2.<init>()
            r1.B = r2
            r0 = 16384(0x4000, float:2.2959E-41)
            r1.L = r0
            wy2 r0 = new wy2
            r0.<init>(r2)
            r1.X = r0
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.R = r0     // Catch: java.lang.Throwable -> Lb
            y80 r0 = r1.A     // Catch: java.lang.Throwable -> Lb
            r0.close()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final void e(defpackage.fd6 r6) {
            r5 = this;
            r6.getClass()
            monitor-enter(r5)
            boolean r0 = r5.R     // Catch: java.lang.Throwable -> L69
            if (r0 != 0) goto L76
            int r0 = r5.L     // Catch: java.lang.Throwable -> L69
            int r1 = r6.a     // Catch: java.lang.Throwable -> L69
            r2 = r1 & 32
            if (r2 == 0) goto L15
            int[] r0 = r6.b     // Catch: java.lang.Throwable -> L69
            r2 = 5
            r0 = r0[r2]     // Catch: java.lang.Throwable -> L69
        L15:
            r5.L = r0     // Catch: java.lang.Throwable -> L69
            r0 = r1 & 2
            r2 = -1
            r3 = 1
            if (r0 == 0) goto L22
            int[] r0 = r6.b     // Catch: java.lang.Throwable -> L69
            r0 = r0[r3]     // Catch: java.lang.Throwable -> L69
            goto L23
        L22:
            r0 = r2
        L23:
            r4 = 0
            if (r0 == r2) goto L6b
            wy2 r0 = r5.X     // Catch: java.lang.Throwable -> L69
            r1 = r1 & 2
            if (r1 == 0) goto L30
            int[] r6 = r6.b     // Catch: java.lang.Throwable -> L69
            r2 = r6[r3]     // Catch: java.lang.Throwable -> L69
        L30:
            r0.getClass()     // Catch: java.lang.Throwable -> L69
            r6 = 16384(0x4000, float:2.2959E-41)
            int r6 = java.lang.Math.min(r2, r6)     // Catch: java.lang.Throwable -> L69
            int r1 = r0.d     // Catch: java.lang.Throwable -> L69
            if (r1 != r6) goto L3e
            goto L6b
        L3e:
            if (r6 >= r1) goto L48
            int r1 = r0.b     // Catch: java.lang.Throwable -> L69
            int r1 = java.lang.Math.min(r1, r6)     // Catch: java.lang.Throwable -> L69
            r0.b = r1     // Catch: java.lang.Throwable -> L69
        L48:
            r0.c = r3     // Catch: java.lang.Throwable -> L69
            r0.d = r6     // Catch: java.lang.Throwable -> L69
            int r1 = r0.h     // Catch: java.lang.Throwable -> L69
            if (r6 >= r1) goto L6b
            if (r6 != 0) goto L64
            uw2[] r6 = r0.e     // Catch: java.lang.Throwable -> L69
            int r1 = r6.length     // Catch: java.lang.Throwable -> L69
            r2 = 0
            defpackage.fv.z0(r4, r1, r2, r6)     // Catch: java.lang.Throwable -> L69
            uw2[] r6 = r0.e     // Catch: java.lang.Throwable -> L69
            int r6 = r6.length     // Catch: java.lang.Throwable -> L69
            int r6 = r6 - r3
            r0.f = r6     // Catch: java.lang.Throwable -> L69
            r0.g = r4     // Catch: java.lang.Throwable -> L69
            r0.h = r4     // Catch: java.lang.Throwable -> L69
            goto L6b
        L64:
            int r1 = r1 - r6
            r0.a(r1)     // Catch: java.lang.Throwable -> L69
            goto L6b
        L69:
            r6 = move-exception
            goto L7e
        L6b:
            r6 = 4
            r5.k(r4, r4, r6, r3)     // Catch: java.lang.Throwable -> L69
            y80 r6 = r5.A     // Catch: java.lang.Throwable -> L69
            r6.flush()     // Catch: java.lang.Throwable -> L69
            monitor-exit(r5)
            return
        L76:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = "closed"
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L69
            throw r6     // Catch: java.lang.Throwable -> L69
        L7e:
            monitor-exit(r5)
            throw r6
    }

    public final void flush() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.R     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto Le
            y80 r0 = r2.A     // Catch: java.lang.Throwable -> Lc
            r0.flush()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        Lc:
            r0 = move-exception
            goto L16
        Le:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc
            throw r0     // Catch: java.lang.Throwable -> Lc
        L16:
            monitor-exit(r2)
            throw r0
    }

    public final void h(boolean r3, int r4, defpackage.k80 r5, int r6) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.R     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L16
            r0 = 0
            r2.k(r4, r6, r0, r3)     // Catch: java.lang.Throwable -> L1e
            if (r6 <= 0) goto L14
            y80 r3 = r2.A     // Catch: java.lang.Throwable -> L1e
            r5.getClass()     // Catch: java.lang.Throwable -> L1e
            long r0 = (long) r6     // Catch: java.lang.Throwable -> L1e
            r3.O(r5, r0)     // Catch: java.lang.Throwable -> L1e
        L14:
            monitor-exit(r2)
            return
        L16:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L1e
            java.lang.String r4 = "closed"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L1e
            throw r3     // Catch: java.lang.Throwable -> L1e
        L1e:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public final void k(int r3, int r4, int r5, int r6) {
            r2 = this;
            r0 = 8
            if (r5 == r0) goto L16
            java.util.logging.Level r0 = java.util.logging.Level.FINE
            java.util.logging.Logger r1 = defpackage.yz2.Y
            boolean r0 = r1.isLoggable(r0)
            if (r0 == 0) goto L16
            r0 = 0
            java.lang.String r0 = defpackage.iz2.b(r0, r3, r4, r5, r6)
            r1.fine(r0)
        L16:
            int r0 = r2.L
            if (r4 > r0) goto L55
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r3
            if (r0 != 0) goto L4b
            byte[] r0 = defpackage.yy7.a
            y80 r2 = r2.A
            r2.getClass()
            int r0 = r4 >>> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2.writeByte(r0)
            int r0 = r4 >>> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2.writeByte(r0)
            r4 = r4 & 255(0xff, float:3.57E-43)
            r2.writeByte(r4)
            r4 = r5 & 255(0xff, float:3.57E-43)
            r2.writeByte(r4)
            r4 = r6 & 255(0xff, float:3.57E-43)
            r2.writeByte(r4)
            r4 = 2147483647(0x7fffffff, float:NaN)
            r3 = r3 & r4
            r2.writeInt(r3)
            return
        L4b:
            java.lang.String r2 = "reserved bit set: "
            java.lang.String r2 = defpackage.lb1.g(r3, r2)
            defpackage.i.f(r2)
            return
        L55:
            int r2 = r2.L
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "FRAME_SIZE_ERROR length > "
            r3.<init>(r5)
            r3.append(r2)
            java.lang.String r2 = ": "
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = r3.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public final void n(int r4, defpackage.a62 r5, byte[] r6) {
            r3 = this;
            r5.getClass()
            monitor-enter(r3)
            boolean r0 = r3.R     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L3f
            int r0 = r5.getHttpCode()     // Catch: java.lang.Throwable -> L35
            r1 = -1
            if (r0 == r1) goto L37
            int r0 = r6.length     // Catch: java.lang.Throwable -> L35
            int r0 = r0 + 8
            r1 = 7
            r2 = 0
            r3.k(r2, r0, r1, r2)     // Catch: java.lang.Throwable -> L35
            y80 r0 = r3.A     // Catch: java.lang.Throwable -> L35
            r0.writeInt(r4)     // Catch: java.lang.Throwable -> L35
            y80 r4 = r3.A     // Catch: java.lang.Throwable -> L35
            int r5 = r5.getHttpCode()     // Catch: java.lang.Throwable -> L35
            r4.writeInt(r5)     // Catch: java.lang.Throwable -> L35
            int r4 = r6.length     // Catch: java.lang.Throwable -> L35
            if (r4 != 0) goto L29
            goto L2e
        L29:
            y80 r4 = r3.A     // Catch: java.lang.Throwable -> L35
            r4.write(r6)     // Catch: java.lang.Throwable -> L35
        L2e:
            y80 r4 = r3.A     // Catch: java.lang.Throwable -> L35
            r4.flush()     // Catch: java.lang.Throwable -> L35
            monitor-exit(r3)
            return
        L35:
            r4 = move-exception
            goto L47
        L37:
            java.lang.String r4 = "errorCode.httpCode == -1"
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L35
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L35
            throw r5     // Catch: java.lang.Throwable -> L35
        L3f:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L35
            java.lang.String r5 = "closed"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L35
            throw r4     // Catch: java.lang.Throwable -> L35
        L47:
            monitor-exit(r3)
            throw r4
    }

    public final void r(boolean r9, int r10, java.util.ArrayList r11) {
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.R     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L58
            wy2 r0 = r8.X     // Catch: java.lang.Throwable -> L56
            r0.d(r11)     // Catch: java.lang.Throwable -> L56
            k80 r11 = r8.B     // Catch: java.lang.Throwable -> L56
            long r0 = r11.B     // Catch: java.lang.Throwable -> L56
            int r11 = r8.L     // Catch: java.lang.Throwable -> L56
            long r2 = (long) r11     // Catch: java.lang.Throwable -> L56
            long r2 = java.lang.Math.min(r2, r0)     // Catch: java.lang.Throwable -> L56
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r4 = 0
            r5 = 4
            if (r11 != 0) goto L1d
            r6 = r5
            goto L1e
        L1d:
            r6 = r4
        L1e:
            if (r9 == 0) goto L22
            r6 = r6 | 1
        L22:
            int r9 = (int) r2     // Catch: java.lang.Throwable -> L56
            r7 = 1
            r8.k(r10, r9, r7, r6)     // Catch: java.lang.Throwable -> L56
            y80 r9 = r8.A     // Catch: java.lang.Throwable -> L56
            k80 r6 = r8.B     // Catch: java.lang.Throwable -> L56
            r9.O(r6, r2)     // Catch: java.lang.Throwable -> L56
            if (r11 <= 0) goto L54
            long r0 = r0 - r2
        L31:
            r2 = 0
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 <= 0) goto L54
            int r9 = r8.L     // Catch: java.lang.Throwable -> L56
            long r6 = (long) r9     // Catch: java.lang.Throwable -> L56
            long r6 = java.lang.Math.min(r6, r0)     // Catch: java.lang.Throwable -> L56
            long r0 = r0 - r6
            int r9 = (int) r6     // Catch: java.lang.Throwable -> L56
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 != 0) goto L46
            r11 = r5
            goto L47
        L46:
            r11 = r4
        L47:
            r2 = 9
            r8.k(r10, r9, r2, r11)     // Catch: java.lang.Throwable -> L56
            y80 r9 = r8.A     // Catch: java.lang.Throwable -> L56
            k80 r11 = r8.B     // Catch: java.lang.Throwable -> L56
            r9.O(r11, r6)     // Catch: java.lang.Throwable -> L56
            goto L31
        L54:
            monitor-exit(r8)
            return
        L56:
            r9 = move-exception
            goto L60
        L58:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L56
            java.lang.String r10 = "closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L56
            throw r9     // Catch: java.lang.Throwable -> L56
        L60:
            monitor-exit(r8)
            throw r9
    }

    public final void u(int r4, boolean r5, int r6) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.R     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L1f
            r0 = 8
            r1 = 6
            r2 = 0
            r3.k(r2, r0, r1, r5)     // Catch: java.lang.Throwable -> L1d
            y80 r5 = r3.A     // Catch: java.lang.Throwable -> L1d
            r5.writeInt(r4)     // Catch: java.lang.Throwable -> L1d
            y80 r4 = r3.A     // Catch: java.lang.Throwable -> L1d
            r4.writeInt(r6)     // Catch: java.lang.Throwable -> L1d
            y80 r4 = r3.A     // Catch: java.lang.Throwable -> L1d
            r4.flush()     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)
            return
        L1d:
            r4 = move-exception
            goto L27
        L1f:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L1d
            java.lang.String r5 = "closed"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L1d
            throw r4     // Catch: java.lang.Throwable -> L1d
        L27:
            monitor-exit(r3)
            throw r4
    }

    public final void v(int r4, defpackage.a62 r5) {
            r3 = this;
            r5.getClass()
            monitor-enter(r3)
            boolean r0 = r3.R     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L2f
            int r0 = r5.getHttpCode()     // Catch: java.lang.Throwable -> L25
            r1 = -1
            if (r0 == r1) goto L27
            r0 = 3
            r1 = 0
            r2 = 4
            r3.k(r4, r2, r0, r1)     // Catch: java.lang.Throwable -> L25
            y80 r4 = r3.A     // Catch: java.lang.Throwable -> L25
            int r5 = r5.getHttpCode()     // Catch: java.lang.Throwable -> L25
            r4.writeInt(r5)     // Catch: java.lang.Throwable -> L25
            y80 r4 = r3.A     // Catch: java.lang.Throwable -> L25
            r4.flush()     // Catch: java.lang.Throwable -> L25
            monitor-exit(r3)
            return
        L25:
            r4 = move-exception
            goto L37
        L27:
            java.lang.String r4 = "Failed requirement."
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L25
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L25
            throw r5     // Catch: java.lang.Throwable -> L25
        L2f:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L25
            java.lang.String r5 = "closed"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L25
            throw r4     // Catch: java.lang.Throwable -> L25
        L37:
            monitor-exit(r3)
            throw r4
    }

    public final void x(int r5, long r6) {
            r4 = this;
            java.lang.String r0 = "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: "
            monitor-enter(r4)
            boolean r1 = r4.R     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L52
            r1 = 0
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 == 0) goto L3c
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 > 0) goto L3c
            java.util.logging.Logger r0 = defpackage.yz2.Y     // Catch: java.lang.Throwable -> L28
            java.util.logging.Level r1 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L28
            boolean r1 = r0.isLoggable(r1)     // Catch: java.lang.Throwable -> L28
            r2 = 4
            r3 = 0
            if (r1 == 0) goto L2a
            java.lang.String r1 = defpackage.iz2.c(r3, r5, r2, r6)     // Catch: java.lang.Throwable -> L28
            r0.fine(r1)     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r5 = move-exception
            goto L5a
        L2a:
            r0 = 8
            r4.k(r5, r2, r0, r3)     // Catch: java.lang.Throwable -> L28
            y80 r5 = r4.A     // Catch: java.lang.Throwable -> L28
            int r6 = (int) r6     // Catch: java.lang.Throwable -> L28
            r5.writeInt(r6)     // Catch: java.lang.Throwable -> L28
            y80 r5 = r4.A     // Catch: java.lang.Throwable -> L28
            r5.flush()     // Catch: java.lang.Throwable -> L28
            monitor-exit(r4)
            return
        L3c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L28
            r5.append(r6)     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L28
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L28
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L28
            throw r6     // Catch: java.lang.Throwable -> L28
        L52:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L28
            java.lang.String r6 = "closed"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L28
            throw r5     // Catch: java.lang.Throwable -> L28
        L5a:
            monitor-exit(r4)
            throw r5
    }
}
