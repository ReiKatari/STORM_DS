package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t72  reason: default package */
/* loaded from: classes.dex */
public final class t72 extends java.io.InputStream {
    public final java.io.InputStream A;
    public int B;

    public t72(java.io.InputStream r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r1 = 1073741824(0x40000000, float:2.0)
            r0.B = r1
            return
    }

    @Override // java.io.InputStream
    public final int available() {
            r0 = this;
            int r0 = r0.B
            return r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            java.io.InputStream r0 = r0.A
            r0.close()
            return
    }

    @Override // java.io.InputStream
    public final int read() {
            r2 = this;
            java.io.InputStream r0 = r2.A
            int r0 = r0.read()
            r1 = -1
            if (r0 != r1) goto Lc
            r1 = 0
            r2.B = r1
        Lc:
            return r0
    }

    @Override // java.io.InputStream
    public final int read(byte[] r2) {
            r1 = this;
            java.io.InputStream r0 = r1.A
            int r2 = r0.read(r2)
            r0 = -1
            if (r2 != r0) goto Lc
            r0 = 0
            r1.B = r0
        Lc:
            return r2
    }

    @Override // java.io.InputStream
    public final int read(byte[] r2, int r3, int r4) {
            r1 = this;
            java.io.InputStream r0 = r1.A
            int r2 = r0.read(r2, r3, r4)
            r3 = -1
            if (r2 != r3) goto Lc
            r3 = 0
            r1.B = r3
        Lc:
            return r2
    }

    @Override // java.io.InputStream
    public final long skip(long r1) {
            r0 = this;
            java.io.InputStream r0 = r0.A
            long r0 = r0.skip(r1)
            return r0
    }
}
