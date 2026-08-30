package defpackage;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.channels.FileChannel;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pz1  reason: default package */
/* loaded from: classes.dex */
public final class pz1 extends FileInputStream {
    public final InputStream A;

    public pz1(FileDescriptor fileDescriptor, InputStream inputStream) {
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
