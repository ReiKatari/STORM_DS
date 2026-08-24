package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f42  reason: default package */
/* loaded from: classes.dex */
public final class f42 extends java.io.FileOutputStream {
    public final java.io.OutputStream A;

    public f42(java.io.FileDescriptor r1, java.io.OutputStream r2) {
            r0 = this;
            r0.<init>(r1)
            r0.A = r2
            return
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            java.io.OutputStream r0 = r0.A
            r0.close()
            return
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
            r0 = this;
            java.io.OutputStream r0 = r0.A
            r0.flush()
            return
    }

    @Override // java.io.FileOutputStream
    public final java.nio.channels.FileChannel getChannel() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "For encrypted files, please open the relevant FileInput/FileOutputStream."
            r1.<init>(r0)
            throw r1
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(int r1) {
            r0 = this;
            java.io.OutputStream r0 = r0.A
            r0.write(r1)
            return
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(byte[] r1) {
            r0 = this;
            java.io.OutputStream r0 = r0.A
            r0.write(r1)
            return
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(byte[] r1, int r2, int r3) {
            r0 = this;
            java.io.OutputStream r0 = r0.A
            r0.write(r1, r2, r3)
            return
    }
}
