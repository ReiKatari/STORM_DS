package defpackage;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f42  reason: default package */
/* loaded from: classes.dex */
public final class f42 extends FileOutputStream {
    public final OutputStream A;

    public f42(FileDescriptor fileDescriptor, OutputStream outputStream) {
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
