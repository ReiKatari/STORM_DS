package defpackage;

import java.io.InputStream;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b32  reason: default package */
/* loaded from: classes.dex */
public final class b32 extends InputStream {
    public final InputStream A;
    public int B = 1073741824;

    public b32(InputStream inputStream) {
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
