package defpackage;

import java.io.InputStream;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t72  reason: default package */
/* loaded from: classes.dex */
public final class t72 extends InputStream {
    public final InputStream A;
    public int B = 1073741824;

    public t72(InputStream inputStream) {
        this.A = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.B;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        int read = this.A.read();
        if (read == -1) {
            this.B = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.A.skip(j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        int read = this.A.read(bArr);
        if (read == -1) {
            this.B = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.A.read(bArr, i, i2);
        if (read == -1) {
            this.B = 0;
        }
        return read;
    }
}
