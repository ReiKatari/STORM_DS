package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vi3  reason: default package */
/* loaded from: classes.dex */
public final class vi3 extends java.io.InputStream {
    public final defpackage.mu A;
    public java.io.DataInputStream B;
    public defpackage.ui3 L;
    public defpackage.od5 R;
    public defpackage.xi3 X;
    public int Y;
    public boolean Z;
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public java.io.IOException g0;
    public final byte[] h0;

    public vi3(java.io.InputStream r3, int r4, defpackage.mu r5) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.Y = r0
            r2.Z = r0
            r1 = 1
            r2.d0 = r1
            r2.e0 = r1
            r2.f0 = r0
            r0 = 0
            r2.g0 = r0
            byte[] r0 = new byte[r1]
            r2.h0 = r0
            r3.getClass()
            r2.A = r5
            java.io.DataInputStream r0 = new java.io.DataInputStream
            r0.<init>(r3)
            r2.B = r0
            od5 r3 = new od5
            r3.<init>(r5)
            r2.R = r3
            ui3 r3 = new ui3
            int r4 = h(r4)
            r3.<init>(r4, r5)
            r2.L = r3
            return
    }

    public static int h(int r1) {
            r0 = 4096(0x1000, float:5.74E-42)
            if (r1 < r0) goto Le
            r0 = 2147483632(0x7ffffff0, float:NaN)
            if (r1 > r0) goto Le
            int r1 = r1 + 15
            r1 = r1 & (-16)
            return r1
        Le:
            java.lang.String r0 = "Unsupported dictionary size "
            java.lang.String r1 = defpackage.lb1.g(r1, r0)
            defpackage.i.h(r1)
            r1 = 0
            return r1
    }

    @Override // java.io.InputStream
    public final int available() {
            r2 = this;
            java.io.DataInputStream r0 = r2.B
            if (r0 == 0) goto L19
            java.io.IOException r1 = r2.g0
            if (r1 != 0) goto L18
            boolean r1 = r2.Z
            int r2 = r2.Y
            if (r1 == 0) goto Lf
            return r2
        Lf:
            int r0 = r0.available()
            int r2 = java.lang.Math.min(r2, r0)
            return r2
        L18:
            throw r1
        L19:
            gb2 r2 = new gb2
            java.lang.String r0 = "Stream closed"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r3 = this;
            java.io.DataInputStream r0 = r3.B
            if (r0 == 0) goto L27
            ui3 r0 = r3.L
            r1 = 0
            if (r0 == 0) goto L1b
            byte[] r0 = r0.a
            mu r2 = r3.A
            r2.b(r0)
            r3.L = r1
            od5 r0 = r3.R
            byte[] r0 = r0.d
            r2.b(r0)
            r3.R = r1
        L1b:
            java.io.DataInputStream r0 = r3.B     // Catch: java.lang.Throwable -> L23
            r0.close()     // Catch: java.lang.Throwable -> L23
            r3.B = r1
            return
        L23:
            r0 = move-exception
            r3.B = r1
            throw r0
        L27:
            return
    }

    public final void e() {
            r11 = this;
            java.io.DataInputStream r0 = r11.B
            int r0 = r0.readUnsignedByte()
            r1 = 1
            if (r0 != 0) goto L23
            r11.f0 = r1
            ui3 r0 = r11.L
            if (r0 == 0) goto L22
            byte[] r0 = r0.a
            mu r1 = r11.A
            r1.b(r0)
            r0 = 0
            r11.L = r0
            od5 r2 = r11.R
            byte[] r2 = r2.d
            r1.b(r2)
            r11.R = r0
        L22:
            return
        L23:
            r2 = 224(0xe0, float:3.14E-43)
            r3 = 0
            if (r0 >= r2) goto L36
            if (r0 != r1) goto L2b
            goto L36
        L2b:
            boolean r4 = r11.d0
            if (r4 != 0) goto L30
            goto L4b
        L30:
            e71 r11 = new e71
            r11.<init>()
            throw r11
        L36:
            r11.e0 = r1
            r11.d0 = r3
            ui3 r4 = r11.L
            r4.c = r3
            r4.d = r3
            r4.e = r3
            r4.f = r3
            byte[] r5 = r4.a
            int r4 = r4.b
            int r4 = r4 - r1
            r5[r4] = r3
        L4b:
            r4 = 128(0x80, float:1.8E-43)
            if (r0 < r4) goto Le3
            r11.Z = r1
            r4 = r0 & 31
            int r4 = r4 << 16
            r11.Y = r4
            java.io.DataInputStream r5 = r11.B
            int r5 = r5.readUnsignedShort()
            int r5 = r5 + r1
            int r5 = r5 + r4
            r11.Y = r5
            java.io.DataInputStream r1 = r11.B
            int r1 = r1.readUnsignedShort()
            int r4 = r1 + 1
            r5 = 192(0xc0, float:2.69E-43)
            if (r0 < r5) goto L9f
            r11.e0 = r3
            java.io.DataInputStream r0 = r11.B
            int r0 = r0.readUnsignedByte()
            if (r0 > r2) goto L99
            int r10 = r0 / 45
            int r2 = r10 * 45
            int r0 = r0 - r2
            int r9 = r0 / 9
            int r2 = r9 * 9
            int r8 = r0 - r2
            int r0 = r8 + r9
            r2 = 4
            if (r0 > r2) goto L93
            xi3 r5 = new xi3
            ui3 r6 = r11.L
            od5 r7 = r11.R
            r5.<init>(r6, r7, r8, r9, r10)
            r11.X = r5
            goto Lac
        L93:
            e71 r11 = new e71
            r11.<init>()
            throw r11
        L99:
            e71 r11 = new e71
            r11.<init>()
            throw r11
        L9f:
            boolean r2 = r11.e0
            if (r2 != 0) goto Ldd
            r2 = 160(0xa0, float:2.24E-43)
            if (r0 < r2) goto Lac
            xi3 r0 = r11.X
            r0.b()
        Lac:
            od5 r0 = r11.R
            java.io.DataInputStream r11 = r11.B
            r0.getClass()
            r2 = 5
            if (r4 < r2) goto Ld7
            int r2 = r11.readUnsignedByte()
            if (r2 != 0) goto Ld1
            int r2 = r11.readInt()
            r0.c = r2
            r2 = -1
            r0.b = r2
            int r1 = r1 + (-4)
            byte[] r2 = r0.d
            int r3 = r2.length
            int r3 = r3 - r1
            r0.e = r3
            r11.readFully(r2, r3, r1)
            return
        Ld1:
            e71 r11 = new e71
            r11.<init>()
            throw r11
        Ld7:
            e71 r11 = new e71
            r11.<init>()
            throw r11
        Ldd:
            e71 r11 = new e71
            r11.<init>()
            throw r11
        Le3:
            r2 = 2
            if (r0 > r2) goto Lf2
            r11.Z = r3
            java.io.DataInputStream r0 = r11.B
            int r0 = r0.readUnsignedShort()
            int r0 = r0 + r1
            r11.Y = r0
            return
        Lf2:
            e71 r11 = new e71
            r11.<init>()
            throw r11
    }

    @Override // java.io.InputStream
    public final int read() {
            r3 = this;
            r0 = 1
            byte[] r1 = r3.h0
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
    public final int read(byte[] r8, int r9, int r10) {
            r7 = this;
            if (r9 < 0) goto Lbc
            if (r10 < 0) goto Lbc
            int r0 = r9 + r10
            if (r0 < 0) goto Lbc
            int r1 = r8.length
            if (r0 > r1) goto Lbc
            r0 = 0
            if (r10 != 0) goto Lf
            return r0
        Lf:
            java.io.DataInputStream r1 = r7.B
            if (r1 == 0) goto Lb4
            java.io.IOException r1 = r7.g0
            if (r1 != 0) goto Lb3
            boolean r1 = r7.f0
            if (r1 == 0) goto L1c
            goto L2c
        L1c:
            r1 = r0
        L1d:
            if (r10 <= 0) goto Lb2
            int r2 = r7.Y     // Catch: java.io.IOException -> L2e
            if (r2 != 0) goto L31
            r7.e()     // Catch: java.io.IOException -> L2e
            boolean r2 = r7.f0     // Catch: java.io.IOException -> L2e
            if (r2 == 0) goto L31
            if (r1 != 0) goto Lb2
        L2c:
            r7 = -1
            return r7
        L2e:
            r8 = move-exception
            goto Laf
        L31:
            int r2 = r7.Y     // Catch: java.io.IOException -> L2e
            int r2 = java.lang.Math.min(r2, r10)     // Catch: java.io.IOException -> L2e
            boolean r3 = r7.Z     // Catch: java.io.IOException -> L2e
            ui3 r4 = r7.L
            if (r3 != 0) goto L5b
            java.io.DataInputStream r3 = r7.B     // Catch: java.io.IOException -> L2e
            int r5 = r4.b     // Catch: java.io.IOException -> L2e
            int r6 = r4.d     // Catch: java.io.IOException -> L2e
            int r5 = r5 - r6
            int r2 = java.lang.Math.min(r5, r2)     // Catch: java.io.IOException -> L2e
            byte[] r5 = r4.a     // Catch: java.io.IOException -> L2e
            int r6 = r4.d     // Catch: java.io.IOException -> L2e
            r3.readFully(r5, r6, r2)     // Catch: java.io.IOException -> L2e
            int r3 = r4.d     // Catch: java.io.IOException -> L2e
            int r3 = r3 + r2
            r4.d = r3     // Catch: java.io.IOException -> L2e
            int r2 = r4.e     // Catch: java.io.IOException -> L2e
            if (r2 >= r3) goto L6e
            r4.e = r3     // Catch: java.io.IOException -> L2e
            goto L6e
        L5b:
            int r3 = r4.b     // Catch: java.io.IOException -> L2e
            int r5 = r4.d     // Catch: java.io.IOException -> L2e
            int r6 = r3 - r5
            if (r6 > r2) goto L66
            r4.f = r3     // Catch: java.io.IOException -> L2e
            goto L69
        L66:
            int r5 = r5 + r2
            r4.f = r5     // Catch: java.io.IOException -> L2e
        L69:
            xi3 r2 = r7.X     // Catch: java.io.IOException -> L2e
            r2.a()     // Catch: java.io.IOException -> L2e
        L6e:
            ui3 r2 = r7.L     // Catch: java.io.IOException -> L2e
            int r3 = r2.d     // Catch: java.io.IOException -> L2e
            int r4 = r2.c     // Catch: java.io.IOException -> L2e
            int r5 = r3 - r4
            int r6 = r2.b     // Catch: java.io.IOException -> L2e
            if (r3 != r6) goto L7c
            r2.d = r0     // Catch: java.io.IOException -> L2e
        L7c:
            byte[] r3 = r2.a     // Catch: java.io.IOException -> L2e
            java.lang.System.arraycopy(r3, r4, r8, r9, r5)     // Catch: java.io.IOException -> L2e
            int r3 = r2.d     // Catch: java.io.IOException -> L2e
            r2.c = r3     // Catch: java.io.IOException -> L2e
            int r9 = r9 + r5
            int r10 = r10 - r5
            int r1 = r1 + r5
            int r2 = r7.Y     // Catch: java.io.IOException -> L2e
            int r2 = r2 - r5
            r7.Y = r2     // Catch: java.io.IOException -> L2e
            if (r2 != 0) goto L1d
            od5 r2 = r7.R     // Catch: java.io.IOException -> L2e
            int r3 = r2.e     // Catch: java.io.IOException -> L2e
            byte[] r4 = r2.d     // Catch: java.io.IOException -> L2e
            int r4 = r4.length     // Catch: java.io.IOException -> L2e
            if (r3 != r4) goto La9
            int r2 = r2.c     // Catch: java.io.IOException -> L2e
            if (r2 != 0) goto La9
            ui3 r2 = r7.L     // Catch: java.io.IOException -> L2e
            int r2 = r2.g     // Catch: java.io.IOException -> L2e
            if (r2 <= 0) goto La4
            r2 = 1
            goto La5
        La4:
            r2 = r0
        La5:
            if (r2 != 0) goto La9
            goto L1d
        La9:
            e71 r8 = new e71     // Catch: java.io.IOException -> L2e
            r8.<init>()     // Catch: java.io.IOException -> L2e
            throw r8     // Catch: java.io.IOException -> L2e
        Laf:
            r7.g0 = r8
            throw r8
        Lb2:
            return r1
        Lb3:
            throw r1
        Lb4:
            gb2 r7 = new gb2
            java.lang.String r8 = "Stream closed"
            r7.<init>(r8)
            throw r7
        Lbc:
            java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException
            r7.<init>()
            throw r7
    }
}
