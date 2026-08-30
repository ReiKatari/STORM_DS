package rj;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class g extends FilterInputStream {
    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return super.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InputStream inputStream = ((FilterInputStream) this).in;
        nj.b bVar = nj.c.f10450a;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i2) {
        ((FilterInputStream) this).in.mark(i2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return ((FilterInputStream) this).in.markSupported();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int read = ((FilterInputStream) this).in.read();
        int i2 = -1;
        if (read != -1) {
            i2 = 1;
        }
        d(i2);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        try {
            ((FilterInputStream) this).in.reset();
        } catch (IOException e6) {
            throw e6;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j2) {
        return ((FilterInputStream) this).in.skip(j2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        nj.b bVar = nj.c.f10450a;
        int read = ((FilterInputStream) this).in.read(bArr);
        d(read);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i10) {
        int read = ((FilterInputStream) this).in.read(bArr, i2, i10);
        d(read);
        return read;
    }

    public void d(int i2) {
    }
}
