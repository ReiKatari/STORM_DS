package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p55  reason: default package */
/* loaded from: classes.dex */
public abstract class p55 extends java.io.FilterInputStream {
    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
            r0 = this;
            int r0 = super.available()
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            java.io.InputStream r1 = r1.in
            a13 r0 = defpackage.b13.a
            if (r1 == 0) goto L9
            r1.close()
        L9:
            return
    }

    public void e(int r1) {
            r0 = this;
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int r2) {
            r1 = this;
            monitor-enter(r1)
            java.io.InputStream r0 = r1.in     // Catch: java.lang.Throwable -> L8
            r0.mark(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
            r0 = this;
            java.io.InputStream r0 = r0.in
            boolean r0 = r0.markSupported()
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
            r2 = this;
            java.io.InputStream r0 = r2.in
            int r0 = r0.read()
            r1 = -1
            if (r0 == r1) goto La
            r1 = 1
        La:
            r2.e(r1)
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r2) {
            r1 = this;
            a13 r0 = defpackage.b13.a
            java.io.InputStream r0 = r1.in
            int r2 = r0.read(r2)
            r1.e(r2)
            return r2
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r2, int r3, int r4) {
            r1 = this;
            java.io.InputStream r0 = r1.in
            int r2 = r0.read(r2, r3, r4)
            r1.e(r2)
            return r2
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
            r1 = this;
            monitor-enter(r1)
            java.io.InputStream r0 = r1.in     // Catch: java.lang.Throwable -> L8 java.io.IOException -> La
            r0.reset()     // Catch: java.lang.Throwable -> L8 java.io.IOException -> La
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            goto Lc
        La:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L8
        Lc:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long r1) {
            r0 = this;
            java.io.InputStream r0 = r0.in
            long r0 = r0.skip(r1)
            return r0
    }
}
