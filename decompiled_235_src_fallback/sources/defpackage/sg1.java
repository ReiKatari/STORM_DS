package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sg1  reason: default package */
/* loaded from: classes.dex */
public final class sg1 extends defpackage.oy0 {
    public java.io.InputStream A;
    public defpackage.n03 B;
    public final byte[] L;

    public sg1(java.io.InputStream r3) {
            r2 = this;
            n03 r0 = new n03
            r0.<init>(r3)
            r2.<init>()
            r1 = 1
            byte[] r1 = new byte[r1]
            r2.L = r1
            r2.B = r0
            r2.A = r3
            return
    }

    @Override // java.io.InputStream
    public final int available() {
            r0 = this;
            n03 r0 = r0.B
            if (r0 == 0) goto Lb
            oi2 r0 = r0.B
            int r0 = r0.j()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r3 = this;
            r0 = 0
            n03 r1 = r3.B     // Catch: java.lang.Throwable -> L16
            a13 r2 = defpackage.b13.a     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto La
            r1.close()     // Catch: java.io.IOException -> La java.lang.Throwable -> L16
        La:
            r3.B = r0     // Catch: java.lang.Throwable -> L16
            java.io.InputStream r1 = r3.A
            if (r1 == 0) goto L15
            r1.close()
            r3.A = r0
        L15:
            return
        L16:
            r1 = move-exception
            java.io.InputStream r2 = r3.A
            if (r2 == 0) goto L20
            r2.close()
            r3.A = r0
        L20:
            throw r1
    }

    @Override // java.io.InputStream
    public final int read() {
            r3 = this;
        L0:
            byte[] r0 = r3.L
            int r1 = r3.read(r0)
            r2 = -1
            if (r1 == r2) goto L1f
            if (r1 == 0) goto L0
            r3 = 1
            if (r1 != r3) goto L14
            r3 = 0
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            return r3
        L14:
            java.lang.String r3 = "Invalid return value from read: "
            java.lang.String r3 = defpackage.lb1.g(r1, r3)
            defpackage.i.m(r3)
            r3 = 0
            return r3
        L1f:
            return r2
    }

    @Override // java.io.InputStream
    public final int read(byte[] r3, int r4, int r5) {
            r2 = this;
            if (r5 != 0) goto L4
            r2 = 0
            return r2
        L4:
            n03 r0 = r2.B
            r1 = -1
            if (r0 == 0) goto L2e
            int r3 = r0.h(r3, r4, r5)     // Catch: java.lang.RuntimeException -> L25
            n03 r4 = r2.B
            n40 r4 = r4.L
            u60 r4 = r4.A
            r4.h()
            if (r3 != r1) goto L24
            n03 r4 = r2.B
            a13 r5 = defpackage.b13.a
            if (r4 == 0) goto L21
            r4.close()     // Catch: java.io.IOException -> L21
        L21:
            r4 = 0
            r2.B = r4
        L24:
            return r3
        L25:
            r2 = move-exception
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "Invalid Deflate64 input"
            r3.<init>(r4, r2)
            throw r3
        L2e:
            return r1
    }
}
