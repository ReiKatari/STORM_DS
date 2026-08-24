package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ph1  reason: default package */
/* loaded from: classes.dex */
public final class ph1 extends java.io.InputStream {
    public java.io.InputStream A;
    public final defpackage.zb B;
    public java.io.IOException L;
    public final byte[] R;

    public ph1(java.io.InputStream r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.L = r0
            r0 = 1
            byte[] r0 = new byte[r0]
            r1.R = r0
            r2.getClass()
            r1.A = r2
            zb r2 = new zb
            r0 = 5
            r2.<init>(r3, r0)
            r1.B = r2
            return
    }

    @Override // java.io.InputStream
    public final int available() {
            r1 = this;
            java.io.InputStream r0 = r1.A
            if (r0 == 0) goto Le
            java.io.IOException r1 = r1.L
            if (r1 != 0) goto Ld
            int r1 = r0.available()
            return r1
        Ld:
            throw r1
        Le:
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
            byte[] r1 = r3.R
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
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            java.io.InputStream r1 = r7.A
            if (r1 == 0) goto L56
            java.io.IOException r2 = r7.L
            if (r2 != 0) goto L55
            int r10 = r1.read(r8, r9, r10)     // Catch: java.io.IOException -> L51
            r1 = -1
            if (r10 != r1) goto L14
            return r1
        L14:
            zb r7 = r7.B
            java.lang.Object r1 = r7.L
            byte[] r1 = (byte[]) r1
            int r7 = r7.B
            int r2 = java.lang.Math.min(r10, r7)
            r3 = r0
        L21:
            if (r3 >= r2) goto L30
            int r4 = r9 + r3
            r5 = r8[r4]
            r6 = r1[r3]
            int r5 = r5 + r6
            byte r5 = (byte) r5
            r8[r4] = r5
            int r3 = r3 + 1
            goto L21
        L30:
            if (r3 >= r10) goto L41
            int r2 = r9 + r3
            r4 = r8[r2]
            int r5 = r2 - r7
            r5 = r8[r5]
            int r4 = r4 + r5
            byte r4 = (byte) r4
            r8[r2] = r4
            int r3 = r3 + 1
            goto L30
        L41:
            if (r10 < r7) goto L49
            int r9 = r9 + r10
            int r9 = r9 - r7
            java.lang.System.arraycopy(r8, r9, r1, r0, r7)
            return r10
        L49:
            int r7 = r7 - r3
            java.lang.System.arraycopy(r1, r3, r1, r0, r7)
            java.lang.System.arraycopy(r8, r9, r1, r7, r10)
            return r10
        L51:
            r8 = move-exception
            r7.L = r8
            throw r8
        L55:
            throw r2
        L56:
            gb2 r7 = new gb2
            java.lang.String r8 = "Stream closed"
            r7.<init>(r8)
            throw r7
    }
}
