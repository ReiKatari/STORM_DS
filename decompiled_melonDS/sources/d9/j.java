package d9;

import java.io.InputStream;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j extends InputStream {
    public final InputStream A;
    public int B = 1073741824;

    public j(InputStream inputStream) {
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
    public final long skip(long j2) {
        return this.A.skip(j2);
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
    public final int read(byte[] bArr, int i2, int i10) {
        int read = this.A.read(bArr, i2, i10);
        if (read == -1) {
            this.B = 0;
        }
        return read;
    }
}
