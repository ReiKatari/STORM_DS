package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u60  reason: default package */
/* loaded from: classes.dex */
public final class u60 extends p55 {
    public static final /* synthetic */ int X = 0;
    public long A;
    public long B;
    public final long L;
    public final boolean R;

    public u60(InputStream inputStream, long j, boolean z) {
        super(inputStream);
        this.A = 0L;
        this.L = j;
        this.R = z;
    }

    @Override // defpackage.p55, java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        if (k()) {
            h();
            return 0;
        }
        return ((FilterInputStream) this).in.available();
    }

    @Override // defpackage.p55, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.R) {
            ((FilterInputStream) this).in.close();
        }
    }

    @Override // defpackage.p55
    public final synchronized void e(int i) {
        if (i != -1) {
            this.A += i;
        }
    }

    public final synchronized long h() {
        return this.A;
    }

    public final boolean k() {
        long j = this.L;
        if (j >= 0 && h() >= j) {
            return true;
        }
        return false;
    }

    @Override // defpackage.p55, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.B = this.A;
    }

    @Override // defpackage.p55, java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return ((FilterInputStream) this).in.markSupported();
    }

    @Override // defpackage.p55, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (k()) {
            h();
            return -1;
        }
        long j = i2;
        long j2 = this.L;
        if (j2 >= 0) {
            j = Math.min(j, j2 - h());
        }
        return super.read(bArr, i, (int) j);
    }

    @Override // defpackage.p55, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        ((FilterInputStream) this).in.reset();
        this.A = this.B;
    }

    @Override // defpackage.p55, java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        long skip;
        long j2 = this.L;
        if (j2 >= 0) {
            j = Math.min(j, j2 - h());
        }
        skip = ((FilterInputStream) this).in.skip(j);
        this.A += skip;
        return skip;
    }

    public final String toString() {
        return ((FilterInputStream) this).in.toString();
    }

    @Override // defpackage.p55, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // defpackage.p55, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (k()) {
            h();
            return -1;
        }
        return super.read();
    }
}
