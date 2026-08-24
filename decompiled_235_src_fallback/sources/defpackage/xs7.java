package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xs7  reason: default package */
/* loaded from: classes.dex */
public final class xs7 implements java.io.Closeable {
    public final defpackage.y80 A;
    public final java.util.Random B;
    public final boolean L;
    public final boolean R;
    public final long X;
    public final defpackage.k80 Y;
    public final defpackage.k80 Z;
    public boolean d0;
    public defpackage.f54 e0;
    public final byte[] f0;
    public final defpackage.i80 g0;

    public xs7(defpackage.y80 r1, java.util.Random r2, boolean r3, boolean r4, long r5) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            r0.X = r5
            k80 r2 = new k80
            r2.<init>()
            r0.Y = r2
            k80 r1 = r1.a()
            r0.Z = r1
            r1 = 4
            byte[] r1 = new byte[r1]
            r0.f0 = r1
            i80 r1 = new i80
            r1.<init>()
            r0.g0 = r1
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            f54 r0 = r1.e0
            if (r0 == 0) goto L7
            defpackage.yy7.b(r0)
        L7:
            y80 r1 = r1.A
            defpackage.yy7.b(r1)
            return
    }

    public final void e(int r6, defpackage.da0 r7) {
            r5 = this;
            boolean r0 = r5.d0
            if (r0 != 0) goto L4d
            int r0 = r7.d()
            long r1 = (long) r0
            r3 = 125(0x7d, double:6.2E-322)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L47
            r6 = r6 | 128(0x80, float:1.8E-43)
            k80 r1 = r5.Z
            r1.n0(r6)
            r6 = r0 | 128(0x80, float:1.8E-43)
            r1.n0(r6)
            byte[] r6 = r5.f0
            r6.getClass()
            java.util.Random r2 = r5.B
            r2.nextBytes(r6)
            int r2 = r6.length
            r1.l0(r6, r2)
            if (r0 <= 0) goto L41
            long r2 = r1.B
            r1.k0(r7)
            i80 r7 = r5.g0
            r7.getClass()
            r1.J(r7)
            r7.h(r2)
            defpackage.vs7.f(r7, r6)
            r7.close()
        L41:
            y80 r5 = r5.A
            r5.flush()
            return
        L47:
            java.lang.String r5 = "Payload size must be less than or equal to 125"
            defpackage.i.h(r5)
            return
        L4d:
            java.lang.String r5 = "closed"
            defpackage.e41.i(r5)
            return
    }

    public final void h(defpackage.da0 r21) {
            r20 = this;
            r0 = r20
            r1 = r21
            boolean r2 = r0.d0
            if (r2 != 0) goto L151
            k80 r2 = r0.Y
            r2.k0(r1)
            boolean r3 = r0.L
            r4 = 0
            if (r3 == 0) goto L88
            byte[] r1 = r1.A
            int r1 = r1.length
            long r6 = (long) r1
            long r8 = r0.X
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L88
            f54 r1 = r0.e0
            r3 = 0
            if (r1 != 0) goto L2b
            f54 r1 = new f54
            boolean r6 = r0.R
            r1.<init>(r6, r3)
            r0.e0 = r1
        L2b:
            java.io.Closeable r6 = r1.X
            tg1 r6 = (defpackage.tg1) r6
            k80 r7 = r1.L
            long r8 = r7.B
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 != 0) goto L82
            boolean r8 = r1.B
            if (r8 == 0) goto L42
            java.lang.Object r1 = r1.R
            java.util.zip.Deflater r1 = (java.util.zip.Deflater) r1
            r1.reset()
        L42:
            long r8 = r2.B
            r6.O(r2, r8)
            r6.flush()
            da0 r1 = defpackage.g54.a
            long r8 = r7.B
            byte[] r6 = r1.A
            int r6 = r6.length
            long r10 = (long) r6
            long r8 = r8 - r10
            int r6 = r1.d()
            boolean r1 = r7.F(r6, r8, r1)
            if (r1 == 0) goto L77
            long r8 = r7.B
            r10 = 4
            long r8 = r8 - r10
            i80 r1 = defpackage.hf.a
            i80 r1 = r7.J(r1)
            r1.e(r8)     // Catch: java.lang.Throwable -> L6f
            r1.close()
            goto L7a
        L6f:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch: java.lang.Throwable -> L72
        L72:
            r0 = move-exception
            defpackage.ge7.t(r1, r2)
            throw r0
        L77:
            r7.n0(r3)
        L7a:
            long r8 = r7.B
            r2.O(r7, r8)
            r1 = 193(0xc1, float:2.7E-43)
            goto L8a
        L82:
            java.lang.String r0 = "Failed requirement."
            defpackage.i.h(r0)
            return
        L88:
            r1 = 129(0x81, float:1.81E-43)
        L8a:
            long r6 = r2.B
            k80 r3 = r0.Z
            r3.n0(r1)
            r8 = 125(0x7d, double:6.2E-322)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 > 0) goto La0
            int r1 = (int) r6
            r8 = 128(0x80, float:1.8E-43)
            r1 = r1 | r8
            r3.n0(r1)
            goto L125
        La0:
            r8 = 65535(0xffff, double:3.23786E-319)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 > 0) goto Lb1
            r1 = 254(0xfe, float:3.56E-43)
            r3.n0(r1)
            int r1 = (int) r6
            r3.r0(r1)
            goto L125
        Lb1:
            r1 = 255(0xff, float:3.57E-43)
            r3.n0(r1)
            r1 = 8
            o96 r8 = r3.j0(r1)
            byte[] r9 = r8.a
            int r10 = r8.c
            int r11 = r10 + 1
            r12 = 56
            long r12 = r6 >>> r12
            r14 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r14
            int r12 = (int) r12
            byte r12 = (byte) r12
            r9[r10] = r12
            int r12 = r10 + 2
            r13 = 48
            long r16 = r6 >>> r13
            r18 = r14
            long r14 = r16 & r18
            int r13 = (int) r14
            byte r13 = (byte) r13
            r9[r11] = r13
            int r11 = r10 + 3
            r13 = 40
            long r13 = r6 >>> r13
            long r13 = r13 & r18
            int r13 = (int) r13
            byte r13 = (byte) r13
            r9[r12] = r13
            int r12 = r10 + 4
            r13 = 32
            long r13 = r6 >>> r13
            long r13 = r13 & r18
            int r13 = (int) r13
            byte r13 = (byte) r13
            r9[r11] = r13
            int r11 = r10 + 5
            r13 = 24
            long r13 = r6 >>> r13
            long r13 = r13 & r18
            int r13 = (int) r13
            byte r13 = (byte) r13
            r9[r12] = r13
            int r12 = r10 + 6
            r13 = 16
            long r13 = r6 >>> r13
            long r13 = r13 & r18
            int r13 = (int) r13
            byte r13 = (byte) r13
            r9[r11] = r13
            int r11 = r10 + 7
            long r13 = r6 >>> r1
            long r13 = r13 & r18
            int r13 = (int) r13
            byte r13 = (byte) r13
            r9[r12] = r13
            int r10 = r10 + r1
            long r12 = r6 & r18
            int r1 = (int) r12
            byte r1 = (byte) r1
            r9[r11] = r1
            r8.c = r10
            long r8 = r3.B
            r10 = 8
            long r8 = r8 + r10
            r3.B = r8
        L125:
            byte[] r1 = r0.f0
            r1.getClass()
            java.util.Random r8 = r0.B
            r8.nextBytes(r1)
            int r8 = r1.length
            r3.l0(r1, r8)
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 <= 0) goto L148
            i80 r8 = r0.g0
            r8.getClass()
            r2.J(r8)
            r8.h(r4)
            defpackage.vs7.f(r8, r1)
            r8.close()
        L148:
            r3.O(r2, r6)
            y80 r0 = r0.A
            r0.flush()
            return
        L151:
            java.lang.String r0 = "closed"
            defpackage.e41.i(r0)
            return
    }
}
