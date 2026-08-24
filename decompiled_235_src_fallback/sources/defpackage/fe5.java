package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fe5  reason: default package */
/* loaded from: classes.dex */
public final class fe5 implements defpackage.z80 {
    public final defpackage.in6 A;
    public final defpackage.k80 B;
    public boolean L;

    public fe5(defpackage.in6 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.A = r1
            k80 r1 = new k80
            r1.<init>()
            r0.B = r1
            return
    }

    @Override // defpackage.z80
    public final long C(defpackage.y80 r11) {
            r10 = this;
            r0 = 0
            r2 = r0
        L3:
            in6 r4 = r10.A
            r5 = 8192(0x2000, double:4.0474E-320)
            k80 r7 = r10.B
            long r4 = r4.b0(r7, r5)
            r8 = -1
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 == 0) goto L20
            long r4 = r7.k()
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 <= 0) goto L3
            long r2 = r2 + r4
            r11.O(r7, r4)
            goto L3
        L20:
            long r4 = r7.B
            int r10 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r10 <= 0) goto L2a
            long r2 = r2 + r4
            r11.O(r7, r4)
        L2a:
            return r2
    }

    @Override // defpackage.z80
    public final void K(defpackage.k80 r2, long r3) {
            r1 = this;
            k80 r0 = r1.B
            r1.g0(r3)     // Catch: java.io.EOFException -> L9
            r0.K(r2, r3)
            return
        L9:
            r1 = move-exception
            r2.m0(r0)
            throw r1
    }

    @Override // defpackage.z80
    public final java.lang.String M(java.nio.charset.Charset r3) {
            r2 = this;
            r3.getClass()
            in6 r0 = r2.A
            k80 r2 = r2.B
            r2.m0(r0)
            long r0 = r2.B
            java.lang.String r2 = r2.a0(r0, r3)
            return r2
    }

    @Override // defpackage.z80
    public final boolean T(long r7) {
            r6 = this;
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r1 = 0
            if (r0 < 0) goto L2a
            boolean r0 = r6.L
            if (r0 != 0) goto L24
        Lb:
            k80 r0 = r6.B
            long r2 = r0.B
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 >= 0) goto L22
            in6 r2 = r6.A
            r3 = 8192(0x2000, double:4.0474E-320)
            long r2 = r2.b0(r0, r3)
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto Lb
            return r1
        L22:
            r6 = 1
            return r6
        L24:
            java.lang.String r6 = "closed"
            defpackage.i.m(r6)
            return r1
        L2a:
            java.lang.String r6 = "byteCount < 0: "
            java.lang.String r6 = defpackage.lb1.h(r7, r6)
            defpackage.i.f(r6)
            return r1
    }

    @Override // defpackage.z80
    public final defpackage.k80 a() {
            r0 = this;
            k80 r0 = r0.B
            return r0
    }

    @Override // defpackage.in6
    public final defpackage.b67 b() {
            r0 = this;
            in6 r0 = r0.A
            b67 r0 = r0.b()
            return r0
    }

    @Override // defpackage.in6
    public final long b0(defpackage.k80 r7, long r8) {
            r6 = this;
            r7.getClass()
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 < 0) goto L38
            boolean r3 = r6.L
            if (r3 != 0) goto L32
            k80 r3 = r6.B
            long r4 = r3.B
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L27
            if (r2 != 0) goto L18
            return r0
        L18:
            in6 r6 = r6.A
            r0 = 8192(0x2000, double:4.0474E-320)
            long r0 = r6.b0(r3, r0)
            r4 = -1
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L27
            return r4
        L27:
            long r0 = r3.B
            long r8 = java.lang.Math.min(r8, r0)
            long r6 = r3.b0(r7, r8)
            return r6
        L32:
            java.lang.String r6 = "closed"
            defpackage.i.m(r6)
            return r0
        L38:
            java.lang.String r6 = "byteCount < 0: "
            java.lang.String r6 = defpackage.lb1.h(r8, r6)
            defpackage.i.f(r6)
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
            r1 = this;
            boolean r0 = r1.L
            if (r0 != 0) goto L11
            r0 = 1
            r1.L = r0
            in6 r0 = r1.A
            r0.close()
            k80 r1 = r1.B
            r1.e()
        L11:
            return
    }

    public final boolean e() {
            r6 = this;
            boolean r0 = r6.L
            r1 = 0
            if (r0 != 0) goto L1e
            k80 r0 = r6.B
            boolean r2 = r0.u()
            if (r2 == 0) goto L1d
            in6 r6 = r6.A
            r2 = 8192(0x2000, double:4.0474E-320)
            long r2 = r6.b0(r0, r2)
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L1d
            r6 = 1
            return r6
        L1d:
            return r1
        L1e:
            java.lang.String r6 = "closed"
            defpackage.i.m(r6)
            return r1
    }

    @Override // defpackage.z80
    public final void g0(long r1) {
            r0 = this;
            boolean r0 = r0.T(r1)
            if (r0 == 0) goto L7
            return
        L7:
            defpackage.i.n()
            return
    }

    public final long h(byte r9, long r10, long r12) {
            r8 = this;
            boolean r10 = r8.L
            r0 = 0
            if (r10 != 0) goto L44
            int r10 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r10 > 0) goto L39
            r4 = r0
        Lb:
            int r10 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            r0 = -1
            if (r10 >= 0) goto L38
            k80 r2 = r8.B
            r3 = r9
            r6 = r12
            long r9 = r2.A(r3, r4, r6)
            int r11 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r11 == 0) goto L1e
            return r9
        L1e:
            long r9 = r2.B
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 >= 0) goto L38
            in6 r11 = r8.A
            r12 = 8192(0x2000, double:4.0474E-320)
            long r11 = r11.b0(r2, r12)
            int r11 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r11 != 0) goto L31
            goto L38
        L31:
            long r4 = java.lang.Math.max(r4, r9)
            r9 = r3
            r12 = r6
            goto Lb
        L38:
            return r0
        L39:
            r6 = r12
            java.lang.String r8 = "fromIndex=0 toIndex="
            java.lang.String r8 = defpackage.lb1.h(r6, r8)
            defpackage.i.f(r8)
            return r0
        L44:
            java.lang.String r8 = "closed"
            defpackage.i.m(r8)
            return r0
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
            r0 = this;
            boolean r0 = r0.L
            r0 = r0 ^ 1
            return r0
    }

    public final boolean k(long r23, defpackage.da0 r25) {
            r22 = this;
            r0 = r22
            r25.getClass()
            int r7 = r25.d()
            boolean r1 = r0.L
            java.lang.String r2 = "closed"
            if (r1 != 0) goto Lba
            if (r7 >= 0) goto L15
        L11:
            r20 = 0
            goto Lb3
        L15:
            r3 = 0
            int r1 = (r23 > r3 ? 1 : (r23 == r3 ? 0 : -1))
            if (r1 >= 0) goto L1c
            goto L11
        L1c:
            int r1 = r25.d()
            if (r7 <= r1) goto L23
            goto L11
        L23:
            if (r7 != 0) goto L29
            r21 = 1
            goto Lb2
        L29:
            r10 = 1
            long r5 = r23 + r10
            int r1 = r25.d()
            long r12 = (long) r1
            long r3 = (long) r7
            r14 = 0
            r16 = r3
            defpackage.hf.D(r12, r14, r16)
            r12 = r16
            boolean r1 = r0.L
            if (r1 != 0) goto Lb4
            r3 = r23
        L42:
            k80 r1 = r0.B
            r2 = r25
            long r14 = defpackage.b.a(r1, r2, r3, r5, r7)
            r16 = -1
            int r2 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r2 == 0) goto L55
            r20 = 0
            r21 = 1
            goto Lae
        L55:
            long r14 = r1.B
            long r18 = r14 - r12
            r20 = 0
            r21 = 1
            long r8 = r18 + r10
            int r2 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r2 < 0) goto L66
        L63:
            r14 = r16
            goto Lae
        L66:
            int r2 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r2 >= 0) goto L6f
            r23 = r5
            r5 = r25
            goto L91
        L6f:
            long r14 = r14 - r5
            long r14 = r14 + r10
            long r14 = java.lang.Math.max(r10, r14)
            int r2 = (int) r14
            long r14 = r1.B
            long r14 = r14 - r3
            long r14 = r14 + r10
            long r14 = java.lang.Math.min(r12, r14)
            int r14 = (int) r14
            int r14 = r14 + (-1)
            if (r2 > r14) goto L63
        L83:
            long r10 = r1.B
            r23 = r5
            long r5 = (long) r14
            long r10 = r10 - r5
            r5 = r25
            boolean r6 = r1.F(r14, r10, r5)
            if (r6 == 0) goto La7
        L91:
            in6 r2 = r0.A
            r10 = 8192(0x2000, double:4.0474E-320)
            long r1 = r2.b0(r1, r10)
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 != 0) goto L9e
            goto L63
        L9e:
            long r3 = java.lang.Math.max(r3, r8)
            r5 = r23
            r10 = 1
            goto L42
        La7:
            if (r14 == r2) goto L63
            int r14 = r14 + (-1)
            r5 = r23
            goto L83
        Lae:
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 == 0) goto Lb3
        Lb2:
            return r21
        Lb3:
            return r20
        Lb4:
            r20 = 0
            defpackage.i.m(r2)
            return r20
        Lba:
            r20 = 0
            defpackage.i.m(r2)
            return r20
    }

    @Override // defpackage.z80
    public final defpackage.da0 l(long r1) {
            r0 = this;
            r0.g0(r1)
            k80 r0 = r0.B
            da0 r0 = r0.l(r1)
            return r0
    }

    public final int n() {
            r2 = this;
            r0 = 4
            r2.g0(r0)
            k80 r2 = r2.B
            int r2 = r2.readInt()
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r2
            int r0 = r0 >>> 24
            r1 = 16711680(0xff0000, float:2.3418052E-38)
            r1 = r1 & r2
            int r1 = r1 >>> 8
            r0 = r0 | r1
            r1 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r2
            int r1 = r1 << 8
            r0 = r0 | r1
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            r2 = r2 | r0
            return r2
    }

    @Override // defpackage.z80
    public final byte[] q() {
            r2 = this;
            in6 r0 = r2.A
            k80 r2 = r2.B
            r2.m0(r0)
            long r0 = r2.B
            byte[] r2 = r2.N(r0)
            return r2
    }

    public final long r() {
            r9 = this;
            r0 = 8
            r9.g0(r0)
            k80 r9 = r9.B
            long r0 = r9.readLong()
            r2 = -72057594037927936(0xff00000000000000, double:-5.486124068793689E303)
            long r2 = r2 & r0
            r9 = 56
            long r2 = r2 >>> r9
            r4 = 71776119061217280(0xff000000000000, double:7.06327445644526E-304)
            long r4 = r4 & r0
            r6 = 40
            long r4 = r4 >>> r6
            long r2 = r2 | r4
            r4 = 280375465082880(0xff0000000000, double:1.38523885234213E-309)
            long r4 = r4 & r0
            r7 = 24
            long r4 = r4 >>> r7
            long r2 = r2 | r4
            r4 = 1095216660480(0xff00000000, double:5.41108926696E-312)
            long r4 = r4 & r0
            r8 = 8
            long r4 = r4 >>> r8
            long r2 = r2 | r4
            r4 = 4278190080(0xff000000, double:2.113706745E-314)
            long r4 = r4 & r0
            long r4 = r4 << r8
            long r2 = r2 | r4
            r4 = 16711680(0xff0000, double:8.256667E-317)
            long r4 = r4 & r0
            long r4 = r4 << r7
            long r2 = r2 | r4
            r4 = 65280(0xff00, double:3.22526E-319)
            long r4 = r4 & r0
            long r4 = r4 << r6
            long r2 = r2 | r4
            r4 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r4
            long r0 = r0 << r9
            long r0 = r0 | r2
            return r0
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(java.nio.ByteBuffer r6) {
            r5 = this;
            r6.getClass()
            k80 r0 = r5.B
            long r1 = r0.B
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L1d
            in6 r5 = r5.A
            r1 = 8192(0x2000, double:4.0474E-320)
            long r1 = r5.b0(r0, r1)
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L1d
            r5 = -1
            return r5
        L1d:
            int r5 = r0.read(r6)
            return r5
    }

    @Override // defpackage.z80
    public final byte readByte() {
            r2 = this;
            r0 = 1
            r2.g0(r0)
            k80 r2 = r2.B
            byte r2 = r2.readByte()
            return r2
    }

    @Override // defpackage.z80
    public final void readFully(byte[] r7) {
            r6 = this;
            k80 r0 = r6.B
            r7.getClass()
            int r1 = r7.length     // Catch: java.io.EOFException -> Le
            long r1 = (long) r1     // Catch: java.io.EOFException -> Le
            r6.g0(r1)     // Catch: java.io.EOFException -> Le
            r0.readFully(r7)
            return
        Le:
            r6 = move-exception
            r1 = 0
        L10:
            long r2 = r0.B
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L28
            int r2 = (int) r2
            int r2 = r0.read(r7, r1, r2)
            r3 = -1
            if (r2 == r3) goto L22
            int r1 = r1 + r2
            goto L10
        L22:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>()
            throw r6
        L28:
            throw r6
    }

    @Override // defpackage.z80
    public final int readInt() {
            r2 = this;
            r0 = 4
            r2.g0(r0)
            k80 r2 = r2.B
            int r2 = r2.readInt()
            return r2
    }

    @Override // defpackage.z80
    public final long readLong() {
            r2 = this;
            r0 = 8
            r2.g0(r0)
            k80 r2 = r2.B
            long r0 = r2.readLong()
            return r0
    }

    @Override // defpackage.z80
    public final short readShort() {
            r2 = this;
            r0 = 2
            r2.g0(r0)
            k80 r2 = r2.B
            short r2 = r2.readShort()
            return r2
    }

    @Override // defpackage.z80
    public final void skip(long r6) {
            r5 = this;
            boolean r0 = r5.L
            if (r0 != 0) goto L31
        L4:
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L30
            k80 r2 = r5.B
            long r3 = r2.B
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L25
            in6 r0 = r5.A
            r3 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.b0(r2, r3)
            r3 = -1
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L21
            goto L25
        L21:
            defpackage.i.n()
            return
        L25:
            long r0 = r2.B
            long r0 = java.lang.Math.min(r6, r0)
            r2.skip(r0)
            long r6 = r6 - r0
            goto L4
        L30:
            return
        L31:
            java.lang.String r5 = "closed"
            defpackage.i.m(r5)
            return
    }

    @Override // defpackage.z80
    public final int t(defpackage.eo4 r7) {
            r6 = this;
            r7.getClass()
            boolean r0 = r6.L
            if (r0 != 0) goto L30
        L7:
            r0 = 1
            k80 r1 = r6.B
            int r0 = defpackage.b.d(r1, r7, r0)
            r2 = -2
            r3 = -1
            if (r0 == r2) goto L21
            if (r0 == r3) goto L2f
            da0[] r6 = r7.A
            r6 = r6[r0]
            int r6 = r6.d()
            long r6 = (long) r6
            r1.skip(r6)
            return r0
        L21:
            in6 r0 = r6.A
            r4 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.b0(r1, r4)
            r4 = -1
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L7
        L2f:
            return r3
        L30:
            java.lang.String r6 = "closed"
            defpackage.i.m(r6)
            r6 = 0
            return r6
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "buffer("
            r0.<init>(r1)
            in6 r2 = r2.A
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public final short u() {
            r2 = this;
            r0 = 2
            r2.g0(r0)
            k80 r2 = r2.B
            short r2 = r2.Z()
            return r2
    }

    public final java.lang.String v(long r2) {
            r1 = this;
            r1.g0(r2)
            k80 r1 = r1.B
            java.nio.charset.Charset r0 = defpackage.qm0.a
            java.lang.String r1 = r1.a0(r2, r0)
            return r1
    }

    @Override // defpackage.z80
    public final java.lang.String y(long r19) {
            r18 = this;
            r6 = r19
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L9b
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r10 = 1
            if (r0 != 0) goto L15
            r4 = r8
            goto L18
        L15:
            long r0 = r6 + r10
            r4 = r0
        L18:
            r1 = 10
            r2 = 0
            r0 = r18
            long r1 = r0.h(r1, r2, r4)
            r12 = -1
            int r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            k80 r12 = r0.B
            if (r3 == 0) goto L2f
            java.lang.String r0 = defpackage.b.c(r12, r1)
            return r0
        L2f:
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 >= 0) goto L58
            boolean r1 = r0.T(r4)
            if (r1 == 0) goto L58
            long r1 = r4 - r10
            byte r1 = r12.v(r1)
            r2 = 13
            if (r1 != r2) goto L58
            long r1 = r4 + r10
            boolean r0 = r0.T(r1)
            if (r0 == 0) goto L58
            byte r0 = r12.v(r4)
            r1 = 10
            if (r0 != r1) goto L58
            java.lang.String r0 = defpackage.b.c(r12, r4)
            return r0
        L58:
            k80 r13 = new k80
            r13.<init>()
            long r0 = r12.B
            r2 = 32
            long r16 = java.lang.Math.min(r2, r0)
            r14 = 0
            r12.n(r13, r14, r16)
            java.io.EOFException r0 = new java.io.EOFException
            long r1 = r12.B
            long r1 = java.lang.Math.min(r1, r6)
            long r3 = r13.B
            da0 r3 = r13.l(r3)
            java.lang.String r3 = r3.e()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "\\n not found: limit="
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = " content="
            r4.append(r1)
            r4.append(r3)
            r1 = 8230(0x2026, float:1.1533E-41)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            throw r0
        L9b:
            java.lang.String r0 = "limit < 0: "
            java.lang.String r0 = defpackage.lb1.h(r6, r0)
            defpackage.i.f(r0)
            r0 = 0
            return r0
    }
}
