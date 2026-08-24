package defpackage;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.channels.FileChannel;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e42  reason: default package */
/* loaded from: classes.dex */
public final class e42 extends FileInputStream {
    public final InputStream A;

    public e42(FileDescriptor fileDescriptor, InputStream inputStream) {
        super(fileDescriptor);
        this.A = inputStream;
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int available() {
        return this.A.available();
    }

    @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A.close();
    }

    @Override // java.io.FileInputStream
    public final FileChannel getChannel() {
        throw new UnsupportedOperationException("For encrypted files, please open the relevant FileInput/FileOutputStream.");
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.A.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.A.markSupported();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read() {
        return this.A.read();
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.A.reset();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final long skip(long j) {
        return this.A.skip(j);
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return this.A.read(bArr);
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return this.A.read(bArr, i, i2);
    }
}
