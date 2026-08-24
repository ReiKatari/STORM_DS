package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cv2  reason: default package */
/* loaded from: classes.dex */
public final class cv2 implements defpackage.in6 {
    public byte A;
    public final defpackage.fe5 B;
    public final java.util.zip.Inflater L;
    public final defpackage.h53 R;
    public final java.util.zip.CRC32 X;

    public cv2(defpackage.z80 r3) {
            r2 = this;
            r3.getClass()
            r2.<init>()
            fe5 r0 = new fe5
            r0.<init>(r3)
            r2.B = r0
            java.util.zip.Inflater r3 = new java.util.zip.Inflater
            r1 = 1
            r3.<init>(r1)
            r2.L = r3
            h53 r1 = new h53
            r1.<init>(r0, r3)
            r2.R = r1
            java.util.zip.CRC32 r3 = new java.util.zip.CRC32
            r3.<init>()
            r2.X = r3
            return
    }

    public static void e(int r2, int r3, java.lang.String r4) {
            if (r3 != r2) goto L3
            return
        L3:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = ": actual 0x"
            java.lang.StringBuilder r4 = defpackage.i61.r(r4, r1)
            java.lang.String r3 = defpackage.hf.t0(r3)
            r1 = 8
            java.lang.String r3 = defpackage.qs6.B0(r1, r3)
            r4.append(r3)
            java.lang.String r3 = " != expected 0x"
            r4.append(r3)
            java.lang.String r2 = defpackage.hf.t0(r2)
            java.lang.String r2 = defpackage.qs6.B0(r1, r2)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r0.<init>(r2)
            throw r0
    }

    @Override // defpackage.in6
    public final defpackage.b67 b() {
            r0 = this;
            fe5 r0 = r0.B
            in6 r0 = r0.A
            b67 r0 = r0.b()
            return r0
    }

    @Override // defpackage.in6
    public final long b0(defpackage.k80 r26, long r27) {
            r25 = this;
            r0 = r25
            r6 = r26
            r7 = r27
            r6.getClass()
            r9 = 0
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 < 0) goto L137
            if (r1 != 0) goto L12
            return r9
        L12:
            byte r1 = r0.A
            java.util.zip.CRC32 r11 = r0.X
            r12 = 1
            fe5 r13 = r0.B
            r19 = -1
            if (r1 != 0) goto Lec
            r1 = 10
            r13.g0(r1)
            k80 r1 = r13.B
            r2 = 3
            byte r21 = r1.v(r2)
            int r2 = r21 >> 1
            r2 = r2 & r12
            if (r2 != r12) goto L32
            r22 = r12
            goto L35
        L32:
            r2 = 0
            r22 = r2
        L35:
            if (r22 == 0) goto L3e
            r2 = 0
            r4 = 10
            r0.h(r1, r2, r4)
        L3e:
            short r0 = r13.readShort()
            java.lang.String r2 = "ID1ID2"
            r3 = 8075(0x1f8b, float:1.1315E-41)
            e(r3, r0, r2)
            r2 = 8
            r13.skip(r2)
            int r0 = r21 >> 2
            r0 = r0 & r12
            if (r0 != r12) goto L7b
            r2 = 2
            r13.g0(r2)
            if (r22 == 0) goto L63
            r2 = 0
            r4 = 2
            r0 = r25
            r0.h(r1, r2, r4)
        L63:
            short r0 = r1.Z()
            r2 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r2
            long r4 = (long) r0
            r13.g0(r4)
            if (r22 == 0) goto L78
            r2 = 0
            r0 = r25
            r0.h(r1, r2, r4)
        L78:
            r13.skip(r4)
        L7b:
            int r0 = r21 >> 3
            r0 = r0 & r12
            r23 = 1
            if (r0 != r12) goto La7
            r15 = 0
            r17 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r14 = 0
            long r14 = r13.h(r14, r15, r17)
            int r0 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r0 == 0) goto La3
            if (r22 == 0) goto L9d
            r2 = 0
            long r4 = r14 + r23
            r0 = r25
            r0.h(r1, r2, r4)
        L9d:
            long r14 = r14 + r23
            r13.skip(r14)
            goto La7
        La3:
            defpackage.i.n()
            return r9
        La7:
            int r0 = r21 >> 4
            r0 = r0 & r12
            if (r0 != r12) goto Ld4
            r15 = 0
            r17 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r14 = 0
            long r14 = r13.h(r14, r15, r17)
            int r0 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r0 == 0) goto Ld0
            if (r22 == 0) goto Lc8
            r2 = 0
            long r4 = r14 + r23
            r0 = r25
            r0.h(r1, r2, r4)
            goto Lca
        Lc8:
            r0 = r25
        Lca:
            long r14 = r14 + r23
            r13.skip(r14)
            goto Ld6
        Ld0:
            defpackage.i.n()
            return r9
        Ld4:
            r0 = r25
        Ld6:
            if (r22 == 0) goto Lea
            short r1 = r13.u()
            long r2 = r11.getValue()
            int r2 = (int) r2
            short r2 = (short) r2
            java.lang.String r3 = "FHCRC"
            e(r1, r2, r3)
            r11.reset()
        Lea:
            r0.A = r12
        Lec:
            byte r1 = r0.A
            r14 = 2
            if (r1 != r12) goto L104
            long r2 = r6.B
            h53 r1 = r0.R
            long r4 = r1.b0(r6, r7)
            int r1 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r1 == 0) goto L102
            r1 = r6
            r0.h(r1, r2, r4)
            return r4
        L102:
            r0.A = r14
        L104:
            byte r1 = r0.A
            if (r1 != r14) goto L136
            int r1 = r13.n()
            long r2 = r11.getValue()
            int r2 = (int) r2
            java.lang.String r3 = "CRC"
            e(r1, r2, r3)
            int r1 = r13.n()
            java.util.zip.Inflater r2 = r0.L
            long r2 = r2.getBytesWritten()
            int r2 = (int) r2
            java.lang.String r3 = "ISIZE"
            e(r1, r2, r3)
            r1 = 3
            r0.A = r1
            boolean r0 = r13.e()
            if (r0 == 0) goto L130
            goto L136
        L130:
            java.lang.String r0 = "gzip finished without exhausting source"
            defpackage.e41.i(r0)
            return r9
        L136:
            return r19
        L137:
            java.lang.String r0 = "byteCount < 0: "
            java.lang.String r0 = defpackage.lb1.h(r7, r0)
            defpackage.i.f(r0)
            return r9
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            h53 r0 = r0.R
            r0.close()
            return
    }

    public final void h(defpackage.k80 r5, long r6, long r8) {
            r4 = this;
            o96 r5 = r5.A
            r5.getClass()
        L5:
            int r0 = r5.c
            int r1 = r5.b
            int r2 = r0 - r1
            long r2 = (long) r2
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 < 0) goto L19
            int r0 = r0 - r1
            long r0 = (long) r0
            long r6 = r6 - r0
            o96 r5 = r5.f
            r5.getClass()
            goto L5
        L19:
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L3d
            int r2 = r5.b
            long r2 = (long) r2
            long r2 = r2 + r6
            int r6 = (int) r2
            int r7 = r5.c
            int r7 = r7 - r6
            long r2 = (long) r7
            long r2 = java.lang.Math.min(r2, r8)
            int r7 = (int) r2
            java.util.zip.CRC32 r2 = r4.X
            byte[] r3 = r5.a
            r2.update(r3, r6, r7)
            long r6 = (long) r7
            long r8 = r8 - r6
            o96 r5 = r5.f
            r5.getClass()
            r6 = r0
            goto L19
        L3d:
            return
    }
}
