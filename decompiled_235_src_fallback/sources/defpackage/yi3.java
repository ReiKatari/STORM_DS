package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yi3  reason: default package */
/* loaded from: classes.dex */
public final class yi3 extends java.io.InputStream {
    public static final /* synthetic */ int g0 = 0;
    public java.io.InputStream A;
    public final defpackage.mu B;
    public defpackage.ui3 L;
    public final defpackage.pd5 R;
    public final defpackage.xi3 X;
    public boolean Y;
    public boolean Z;
    public final byte[] d0;
    public long e0;
    public java.io.IOException f0;

    public yi3(java.io.InputStream r10, long r11, byte r13, int r14) {
            r9 = this;
            r9.<init>()
            r0 = 0
            r9.Y = r0
            r9.Z = r0
            r0 = 1
            byte[] r0 = new byte[r0]
            r9.d0 = r0
            r0 = 0
            r9.f0 = r0
            mu r0 = defpackage.mu.a
            r1 = -1
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 < 0) goto L8c
            r13 = r13 & 255(0xff, float:3.57E-43)
            r2 = 224(0xe0, float:3.14E-43)
            if (r13 > r2) goto L84
            int r8 = r13 / 45
            int r2 = r8 * 45
            int r13 = r13 - r2
            int r7 = r13 / 9
            int r2 = r7 * 9
            int r6 = r13 - r2
            if (r14 < 0) goto L7c
            r13 = 2147483632(0x7ffffff0, float:NaN)
            if (r14 > r13) goto L7c
            if (r1 < 0) goto L77
            if (r6 < 0) goto L77
            r13 = 8
            if (r6 > r13) goto L77
            if (r7 < 0) goto L77
            r13 = 4
            if (r7 > r13) goto L77
            if (r8 < 0) goto L77
            if (r8 > r13) goto L77
            r9.A = r10
            r9.B = r0
            int r13 = e(r14)
            r1 = 0
            int r14 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r14 < 0) goto L59
            long r1 = (long) r13
            int r14 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r14 <= 0) goto L59
            int r13 = (int) r11
            int r13 = e(r13)
        L59:
            ui3 r14 = new ui3
            int r13 = e(r13)
            r14.<init>(r13, r0)
            r9.L = r14
            pd5 r5 = new pd5
            r5.<init>(r10)
            r9.R = r5
            xi3 r3 = new xi3
            ui3 r4 = r9.L
            r3.<init>(r4, r5, r6, r7, r8)
            r9.X = r3
            r9.e0 = r11
            return
        L77:
            defpackage.u34.t()
            r9 = 0
            throw r9
        L7c:
            lh7 r9 = new lh7
            java.lang.String r10 = "LZMA dictionary is too big for this implementation"
            r9.<init>(r10)
            throw r9
        L84:
            e71 r9 = new e71
            java.lang.String r10 = "Invalid LZMA properties byte"
            r9.<init>(r10)
            throw r9
        L8c:
            lh7 r9 = new lh7
            java.lang.String r10 = "Uncompressed size is too big"
            r9.<init>(r10)
            throw r9
    }

    public static int e(int r1) {
            if (r1 < 0) goto L11
            r0 = 2147483632(0x7ffffff0, float:NaN)
            if (r1 > r0) goto L11
            r0 = 4096(0x1000, float:5.74E-42)
            if (r1 >= r0) goto Lc
            r1 = r0
        Lc:
            int r1 = r1 + 15
            r1 = r1 & (-16)
            return r1
        L11:
            java.lang.String r1 = "LZMA dictionary is too big for this implementation"
            defpackage.i.h(r1)
            r1 = 0
            return r1
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r3 = this;
            java.io.InputStream r0 = r3.A
            if (r0 == 0) goto L1e
            ui3 r0 = r3.L
            r1 = 0
            if (r0 == 0) goto L12
            mu r2 = r3.B
            byte[] r0 = r0.a
            r2.b(r0)
            r3.L = r1
        L12:
            java.io.InputStream r0 = r3.A     // Catch: java.lang.Throwable -> L1a
            r0.close()     // Catch: java.lang.Throwable -> L1a
            r3.A = r1
            return
        L1a:
            r0 = move-exception
            r3.A = r1
            throw r0
        L1e:
            return
    }

    @Override // java.io.InputStream
    public final int read() {
            r3 = this;
            r0 = 1
            byte[] r1 = r3.d0
            r2 = 0
            int r3 = r3.read(r1, r2, r0)
            r0 = -1
            if (r3 != r0) goto Lc
            return r0
        Lc:
            r3 = r1[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            return r3
    }

    @Override // java.io.InputStream
    public final int read(byte[] r19, int r20, int r21) {
            r18 = this;
            r1 = r18
            r2 = r19
            pd5 r3 = r1.R
            xi3 r4 = r1.X
            if (r20 < 0) goto L11a
            if (r21 < 0) goto L11a
            int r0 = r20 + r21
            if (r0 < 0) goto L11a
            int r5 = r2.length
            if (r0 > r5) goto L11a
            r5 = 0
            if (r21 != 0) goto L17
            return r5
        L17:
            java.io.InputStream r0 = r1.A
            if (r0 == 0) goto L112
            java.io.IOException r0 = r1.f0
            if (r0 != 0) goto L111
            boolean r0 = r1.Y
            r6 = -1
            if (r0 == 0) goto L25
            return r6
        L25:
            r7 = r20
            r8 = r21
            r9 = r5
        L2a:
            if (r8 <= 0) goto L110
            long r10 = r1.e0     // Catch: java.io.IOException -> L53
            r12 = 0
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 < 0) goto L3b
            long r14 = (long) r8     // Catch: java.io.IOException -> L53
            int r0 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r0 >= 0) goto L3b
            int r0 = (int) r10     // Catch: java.io.IOException -> L53
            goto L3c
        L3b:
            r0 = r8
        L3c:
            ui3 r10 = r1.L     // Catch: java.io.IOException -> L53
            int r11 = r10.b     // Catch: java.io.IOException -> L53
            int r14 = r10.d     // Catch: java.io.IOException -> L53
            int r15 = r11 - r14
            if (r15 > r0) goto L49
            r10.f = r11     // Catch: java.io.IOException -> L53
            goto L4c
        L49:
            int r14 = r14 + r0
            r10.f = r14     // Catch: java.io.IOException -> L53
        L4c:
            r14 = 1
            r4.a()     // Catch: java.io.IOException -> L53 defpackage.e71 -> L56
            r20 = -1
            goto L6f
        L53:
            r0 = move-exception
            goto L10d
        L56:
            r0 = move-exception
            r20 = -1
            long r10 = r1.e0     // Catch: java.io.IOException -> L53
            int r10 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
            if (r10 != 0) goto L10c
            int[] r10 = r4.b     // Catch: java.io.IOException -> L53
            r10 = r10[r5]     // Catch: java.io.IOException -> L53
            if (r10 != r6) goto L67
            r10 = r14
            goto L68
        L67:
            r10 = r5
        L68:
            if (r10 == 0) goto L10c
            r1.Y = r14     // Catch: java.io.IOException -> L53
            r3.f()     // Catch: java.io.IOException -> L53
        L6f:
            ui3 r0 = r1.L     // Catch: java.io.IOException -> L53
            int r10 = r0.d     // Catch: java.io.IOException -> L53
            int r11 = r0.c     // Catch: java.io.IOException -> L53
            int r15 = r10 - r11
            r16 = r12
            int r12 = r0.b     // Catch: java.io.IOException -> L53
            if (r10 != r12) goto L7f
            r0.d = r5     // Catch: java.io.IOException -> L53
        L7f:
            byte[] r10 = r0.a     // Catch: java.io.IOException -> L53
            java.lang.System.arraycopy(r10, r11, r2, r7, r15)     // Catch: java.io.IOException -> L53
            int r10 = r0.d     // Catch: java.io.IOException -> L53
            r0.c = r10     // Catch: java.io.IOException -> L53
            int r7 = r7 + r15
            int r8 = r8 - r15
            int r9 = r9 + r15
            long r10 = r1.e0     // Catch: java.io.IOException -> L53
            int r0 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r0 < 0) goto L9b
            long r12 = (long) r15     // Catch: java.io.IOException -> L53
            long r10 = r10 - r12
            r1.e0 = r10     // Catch: java.io.IOException -> L53
            int r0 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r0 != 0) goto L9b
            r1.Y = r14     // Catch: java.io.IOException -> L53
        L9b:
            boolean r0 = r1.Y     // Catch: java.io.IOException -> L53
            if (r0 == 0) goto L2a
            ui3 r0 = r1.L     // Catch: java.io.IOException -> L53
            int r2 = r0.g     // Catch: java.io.IOException -> L53
            if (r2 <= 0) goto La7
            r2 = r14
            goto La8
        La7:
            r2 = r5
        La8:
            if (r2 != 0) goto L106
            int r2 = r3.c     // Catch: java.io.IOException -> L53
            if (r2 != 0) goto Lb0
            r2 = r14
            goto Lb1
        Lb0:
            r2 = r5
        Lb1:
            if (r2 != 0) goto Lf3
            long r7 = r1.e0     // Catch: java.io.IOException -> L53
            int r2 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r2 == 0) goto Led
            boolean r2 = r1.Z     // Catch: java.io.IOException -> L53
            if (r2 == 0) goto Led
            int r2 = r0.b     // Catch: java.io.IOException -> L53
            int r7 = r0.d     // Catch: java.io.IOException -> L53
            int r8 = r2 - r7
            if (r8 > r14) goto Lc8
            r0.f = r2     // Catch: java.io.IOException -> L53
            goto Lcb
        Lc8:
            int r7 = r7 + r14
            r0.f = r7     // Catch: java.io.IOException -> L53
        Lcb:
            r4.a()     // Catch: java.io.IOException -> L53 defpackage.e71 -> Lcf
            goto Le6
        Lcf:
            r0 = move-exception
            int[] r2 = r4.b     // Catch: java.io.IOException -> L53
            r2 = r2[r5]     // Catch: java.io.IOException -> L53
            if (r2 != r6) goto Ld8
            r2 = r14
            goto Ld9
        Ld8:
            r2 = r5
        Ld9:
            if (r2 == 0) goto Lec
            r3.f()     // Catch: java.io.IOException -> L53
            int r0 = r3.c     // Catch: java.io.IOException -> L53
            if (r0 != 0) goto Le3
            r5 = r14
        Le3:
            if (r5 == 0) goto Le6
            goto Lf3
        Le6:
            e71 r0 = new e71     // Catch: java.io.IOException -> L53
            r0.<init>()     // Catch: java.io.IOException -> L53
            throw r0     // Catch: java.io.IOException -> L53
        Lec:
            throw r0     // Catch: java.io.IOException -> L53
        Led:
            e71 r0 = new e71     // Catch: java.io.IOException -> L53
            r0.<init>()     // Catch: java.io.IOException -> L53
            throw r0     // Catch: java.io.IOException -> L53
        Lf3:
            ui3 r0 = r1.L     // Catch: java.io.IOException -> L53
            if (r0 == 0) goto L101
            mu r2 = r1.B     // Catch: java.io.IOException -> L53
            byte[] r0 = r0.a     // Catch: java.io.IOException -> L53
            r2.b(r0)     // Catch: java.io.IOException -> L53
            r0 = 0
            r1.L = r0     // Catch: java.io.IOException -> L53
        L101:
            if (r9 != 0) goto L104
            goto L105
        L104:
            r6 = r9
        L105:
            return r6
        L106:
            e71 r0 = new e71     // Catch: java.io.IOException -> L53
            r0.<init>()     // Catch: java.io.IOException -> L53
            throw r0     // Catch: java.io.IOException -> L53
        L10c:
            throw r0     // Catch: java.io.IOException -> L53
        L10d:
            r1.f0 = r0
            throw r0
        L110:
            return r9
        L111:
            throw r0
        L112:
            gb2 r0 = new gb2
            java.lang.String r1 = "Stream closed"
            r0.<init>(r1)
            throw r0
        L11a:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
    }
}
