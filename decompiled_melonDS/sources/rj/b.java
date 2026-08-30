package rj;

import java.io.FilterInputStream;
import java.io.InputStream;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends g {
    public static final /* synthetic */ int X = 0;
    public long A;
    public long B;
    public final long L;
    public final boolean R;

    public b(InputStream inputStream, long j2, boolean z10) {
        super(inputStream);
        this.A = 0L;
        this.L = j2;
        this.R = z10;
    }

    @Override // rj.g, java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        if (m()) {
            i();
            return 0;
        }
        return ((FilterInputStream) this).in.available();
    }

    @Override // rj.g, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.R) {
            ((FilterInputStream) this).in.close();
        }
    }

    @Override // rj.g
    public final synchronized void d(int i2) {
        if (i2 != -1) {
            this.A += i2;
        }
    }

    public final synchronized long i() {
        return this.A;
    }

    public final boolean m() {
        long j2 = this.L;
        if (j2 >= 0 && i() >= j2) {
            return true;
        }
        return false;
    }

    @Override // rj.g, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i2) {
        ((FilterInputStream) this).in.mark(i2);
        this.B = this.A;
    }

    @Override // rj.g, java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return ((FilterInputStream) this).in.markSupported();
    }

    @Override // rj.g, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i10) {
        if (m()) {
            i();
            return -1;
        }
        long j2 = i10;
        long j10 = this.L;
        if (j10 >= 0) {
            j2 = Math.min(j2, j10 - i());
        }
        return super.read(bArr, i2, (int) j2);
    }

    @Override // rj.g, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        ((FilterInputStream) this).in.reset();
        this.A = this.B;
    }

    @Override // rj.g, java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j2) {
        long skip;
        long j10 = this.L;
        if (j10 >= 0) {
            j2 = Math.min(j2, j10 - i());
        }
        skip = ((FilterInputStream) this).in.skip(j2);
        this.A += skip;
        return skip;
    }

    public final String toString() {
        return ((FilterInputStream) this).in.toString();
    }

    @Override // rj.g, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // rj.g, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (m()) {
            i();
            return -1;
        }
        return super.read();
    }
}
