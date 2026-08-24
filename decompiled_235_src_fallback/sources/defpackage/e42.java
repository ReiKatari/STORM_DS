package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e42  reason: default package */
/* loaded from: classes.dex */
public final class e42 extends java.io.FileInputStream {
    public final java.io.InputStream A;

    public e42(java.io.FileDescriptor r1, java.io.InputStream r2) {
            r0 = this;
            r0.<init>(r1)
            r0.A = r2
            return
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int available() {
            r0 = this;
            java.io.InputStream r0 = r0.A
            int r0 = r0.available()
            return r0
    }

    @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            java.io.InputStream r0 = r0.A
            r0.close()
            return
    }

    @Override // java.io.FileInputStream
    public final java.nio.channels.FileChannel getChannel() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "For encrypted files, please open the relevant FileInput/FileOutputStream."
            r1.<init>(r0)
            throw r1
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int r2) {
            r1 = this;
            monitor-enter(r1)
            java.io.InputStream r0 = r1.A     // Catch: java.lang.Throwable -> L8
            r0.mark(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
            r0 = this;
            java.io.InputStream r0 = r0.A
            boolean r0 = r0.markSupported()
            return r0
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read() {
            r0 = this;
            java.io.InputStream r0 = r0.A
            int r0 = r0.read()
            return r0
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read(byte[] r1) {
            r0 = this;
            java.io.InputStream r0 = r0.A
            int r0 = r0.read(r1)
            return r0
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read(byte[] r1, int r2, int r3) {
            r0 = this;
            java.io.InputStream r0 = r0.A
            int r0 = r0.read(r1, r2, r3)
            return r0
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
            r1 = this;
            monitor-enter(r1)
            java.io.InputStream r0 = r1.A     // Catch: java.lang.Throwable -> L8
            r0.reset()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final long skip(long r1) {
            r0 = this;
            java.io.InputStream r0 = r0.A
            long r0 = r0.skip(r1)
            return r0
    }
}
