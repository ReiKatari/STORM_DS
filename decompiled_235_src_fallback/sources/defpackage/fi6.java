package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fi6  reason: default package */
/* loaded from: classes.dex */
public final class fi6 extends java.io.InputStream {
    public java.io.InputStream A;
    public final defpackage.di6 B;
    public final byte[] L;
    public int R;
    public int X;
    public int Y;
    public boolean Z;
    public java.io.IOException d0;
    public final byte[] e0;

    public fi6(java.io.InputStream r2, defpackage.di6 r3) {
            r1 = this;
            r1.<init>()
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]
            r1.L = r0
            r0 = 0
            r1.R = r0
            r1.X = r0
            r1.Y = r0
            r1.Z = r0
            r0 = 0
            r1.d0 = r0
            r0 = 1
            byte[] r0 = new byte[r0]
            r1.e0 = r0
            r2.getClass()
            r1.A = r2
            r1.B = r3
            return
    }

    @Override // java.io.InputStream
    public final int available() {
            r1 = this;
            java.io.InputStream r0 = r1.A
            if (r0 == 0) goto Lc
            java.io.IOException r0 = r1.d0
            if (r0 != 0) goto Lb
            int r1 = r1.X
            return r1
        Lb:
            throw r0
        Lc:
            gb2 r1 = new gb2
            java.lang.String r0 = "Stream closed"
            r1.<init>(r0)
            throw r1
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r2 = this;
            java.io.InputStream r0 = r2.A
            if (r0 == 0) goto Lf
            r1 = 0
            r0.close()     // Catch: java.lang.Throwable -> Lb
            r2.A = r1
            return
        Lb:
            r0 = move-exception
            r2.A = r1
            throw r0
        Lf:
            return
    }

    @Override // java.io.InputStream
    public final int read() {
            r3 = this;
            r0 = 1
            byte[] r1 = r3.e0
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
    public final int read(byte[] r9, int r10, int r11) {
            r8 = this;
            byte[] r0 = r8.L
            if (r10 < 0) goto L8d
            if (r11 < 0) goto L8d
            int r1 = r10 + r11
            if (r1 < 0) goto L8d
            int r2 = r9.length
            if (r1 > r2) goto L8d
            r1 = 0
            if (r11 != 0) goto L11
            return r1
        L11:
            java.io.InputStream r2 = r8.A
            if (r2 == 0) goto L85
            java.io.IOException r2 = r8.d0
            if (r2 != 0) goto L84
            r2 = r1
        L1a:
            int r3 = r8.X     // Catch: java.io.IOException -> L42
            int r3 = java.lang.Math.min(r3, r11)     // Catch: java.io.IOException -> L42
            int r4 = r8.R     // Catch: java.io.IOException -> L42
            java.lang.System.arraycopy(r0, r4, r9, r10, r3)     // Catch: java.io.IOException -> L42
            int r4 = r8.R     // Catch: java.io.IOException -> L42
            int r4 = r4 + r3
            r8.R = r4     // Catch: java.io.IOException -> L42
            int r5 = r8.X     // Catch: java.io.IOException -> L42
            int r5 = r5 - r3
            r8.X = r5     // Catch: java.io.IOException -> L42
            int r10 = r10 + r3
            int r11 = r11 - r3
            int r2 = r2 + r3
            int r3 = r4 + r5
            int r6 = r8.Y     // Catch: java.io.IOException -> L42
            int r3 = r3 + r6
            r7 = 4096(0x1000, float:5.74E-42)
            if (r3 != r7) goto L44
            int r5 = r5 + r6
            java.lang.System.arraycopy(r0, r4, r0, r1, r5)     // Catch: java.io.IOException -> L42
            r8.R = r1     // Catch: java.io.IOException -> L42
            goto L44
        L42:
            r9 = move-exception
            goto L81
        L44:
            r3 = -1
            if (r11 == 0) goto L7d
            boolean r4 = r8.Z     // Catch: java.io.IOException -> L42
            if (r4 == 0) goto L4c
            goto L7d
        L4c:
            int r4 = r8.R     // Catch: java.io.IOException -> L42
            int r5 = r8.X     // Catch: java.io.IOException -> L42
            int r4 = r4 + r5
            int r5 = r8.Y     // Catch: java.io.IOException -> L42
            int r4 = r4 + r5
            int r5 = 4096 - r4
            java.io.InputStream r6 = r8.A     // Catch: java.io.IOException -> L42
            int r4 = r6.read(r0, r4, r5)     // Catch: java.io.IOException -> L42
            if (r4 != r3) goto L68
            r3 = 1
            r8.Z = r3     // Catch: java.io.IOException -> L42
            int r3 = r8.Y     // Catch: java.io.IOException -> L42
            r8.X = r3     // Catch: java.io.IOException -> L42
            r8.Y = r1     // Catch: java.io.IOException -> L42
            goto L1a
        L68:
            int r3 = r8.Y     // Catch: java.io.IOException -> L42
            int r3 = r3 + r4
            r8.Y = r3     // Catch: java.io.IOException -> L42
            di6 r4 = r8.B     // Catch: java.io.IOException -> L42
            int r5 = r8.R     // Catch: java.io.IOException -> L42
            int r3 = r4.a(r0, r5, r3)     // Catch: java.io.IOException -> L42
            r8.X = r3     // Catch: java.io.IOException -> L42
            int r4 = r8.Y     // Catch: java.io.IOException -> L42
            int r4 = r4 - r3
            r8.Y = r4     // Catch: java.io.IOException -> L42
            goto L1a
        L7d:
            if (r2 <= 0) goto L80
            return r2
        L80:
            return r3
        L81:
            r8.d0 = r9
            throw r9
        L84:
            throw r2
        L85:
            gb2 r8 = new gb2
            java.lang.String r9 = "Stream closed"
            r8.<init>(r9)
            throw r8
        L8d:
            java.lang.IndexOutOfBoundsException r8 = new java.lang.IndexOutOfBoundsException
            r8.<init>()
            throw r8
    }
}
