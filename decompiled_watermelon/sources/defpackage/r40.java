package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r40  reason: default package */
/* loaded from: classes.dex */
public final class r40 extends hw4 {
    public static final /* synthetic */ int X = 0;
    public long A;
    public long B;
    public final long L;
    public final boolean R;

    public r40(InputStream inputStream, long j, boolean z) {
        super(inputStream);
        this.A = 0L;
        this.L = j;
        this.R = z;
    }

    @Override // defpackage.hw4, java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        if (p()) {
            i();
            return 0;
        }
        return ((FilterInputStream) this).in.available();
    }

    @Override // defpackage.hw4, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.R) {
            ((FilterInputStream) this).in.close();
        }
    }

    @Override // defpackage.hw4
    public final synchronized void d(int i) {
        if (i != -1) {
            this.A += i;
        }
    }

    public final synchronized long i() {
        return this.A;
    }

    @Override // defpackage.hw4, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.B = this.A;
    }

    @Override // defpackage.hw4, java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return ((FilterInputStream) this).in.markSupported();
    }

    public final boolean p() {
        long j = this.L;
        if (j >= 0 && i() >= j) {
            return true;
        }
        return false;
    }

    @Override // defpackage.hw4, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (p()) {
            i();
            return -1;
        }
        long j = i2;
        long j2 = this.L;
        if (j2 >= 0) {
            j = Math.min(j, j2 - i());
        }
        return super.read(bArr, i, (int) j);
    }

    @Override // defpackage.hw4, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        ((FilterInputStream) this).in.reset();
        this.A = this.B;
    }

    @Override // defpackage.hw4, java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        long skip;
        long j2 = this.L;
        if (j2 >= 0) {
            j = Math.min(j, j2 - i());
        }
        skip = ((FilterInputStream) this).in.skip(j);
        this.A += skip;
        return skip;
    }

    public final String toString() {
        return ((FilterInputStream) this).in.toString();
    }

    @Override // defpackage.hw4, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // defpackage.hw4, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (p()) {
            i();
            return -1;
        }
        return super.read();
    }
}
