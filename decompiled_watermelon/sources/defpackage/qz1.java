package defpackage;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qz1  reason: default package */
/* loaded from: classes.dex */
public final class qz1 extends FileOutputStream {
    public final OutputStream A;

    public qz1(FileDescriptor fileDescriptor, OutputStream outputStream) {
        super(fileDescriptor);
        this.A = outputStream;
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.A.flush();
    }

    @Override // java.io.FileOutputStream
    public final FileChannel getChannel() {
        throw new UnsupportedOperationException("For encrypted files, please open the relevant FileInput/FileOutputStream.");
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        this.A.write(bArr);
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(int i) {
        this.A.write(i);
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.A.write(bArr, i, i2);
    }
}
