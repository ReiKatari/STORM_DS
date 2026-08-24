package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u60  reason: default package */
/* loaded from: classes.dex */
public final class u60 extends defpackage.p55 {
    public static final /* synthetic */ int X = 0;
    public long A;
    public long B;
    public final long L;
    public final boolean R;

    public u60(java.io.InputStream r3, long r4, boolean r6) {
            r2 = this;
            r2.<init>(r3)
            r0 = 0
            r2.A = r0
            r2.L = r4
            r2.R = r6
            return
    }

    @Override // defpackage.p55, java.io.FilterInputStream, java.io.InputStream
    public final int available() {
            r1 = this;
            boolean r0 = r1.k()
            if (r0 == 0) goto Lb
            r1.h()
            r1 = 0
            return r1
        Lb:
            java.io.InputStream r1 = r1.in
            int r1 = r1.available()
            return r1
    }

    @Override // defpackage.p55, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            boolean r0 = r1.R
            if (r0 == 0) goto L9
            java.io.InputStream r1 = r1.in
            r1.close()
        L9:
            return
    }

    @Override // defpackage.p55
    public final synchronized void e(int r5) {
            r4 = this;
            monitor-enter(r4)
            r0 = -1
            if (r5 == r0) goto Le
            long r0 = r4.A     // Catch: java.lang.Throwable -> Lb
            long r2 = (long) r5     // Catch: java.lang.Throwable -> Lb
            long r0 = r0 + r2
            r4.A = r0     // Catch: java.lang.Throwable -> Lb
            goto Le
        Lb:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb
            throw r5
        Le:
            monitor-exit(r4)
            return
    }

    public final synchronized long h() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.A     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final boolean k() {
            r4 = this;
            r0 = 0
            long r2 = r4.L
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L12
            long r0 = r4.h()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L12
            r4 = 1
            return r4
        L12:
            r4 = 0
            return r4
    }

    @Override // defpackage.p55, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int r3) {
            r2 = this;
            monitor-enter(r2)
            java.io.InputStream r0 = r2.in     // Catch: java.lang.Throwable -> Lc
            r0.mark(r3)     // Catch: java.lang.Throwable -> Lc
            long r0 = r2.A     // Catch: java.lang.Throwable -> Lc
            r2.B = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        Lc:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
    }

    @Override // defpackage.p55, java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
            r0 = this;
            java.io.InputStream r0 = r0.in
            boolean r0 = r0.markSupported()
            return r0
    }

    @Override // defpackage.p55, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
            r1 = this;
            boolean r0 = r1.k()
            if (r0 == 0) goto Lb
            r1.h()
            r1 = -1
            return r1
        Lb:
            int r1 = super.read()
            return r1
    }

    @Override // defpackage.p55, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] r3) {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            int r2 = r2.read(r3, r0, r1)
            return r2
    }

    @Override // defpackage.p55, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] r7, int r8, int r9) {
            r6 = this;
            boolean r0 = r6.k()
            if (r0 == 0) goto Lb
            r6.h()
            r6 = -1
            return r6
        Lb:
            long r0 = (long) r9
            r2 = 0
            long r4 = r6.L
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 < 0) goto L1d
            long r2 = r6.h()
            long r4 = r4 - r2
            long r0 = java.lang.Math.min(r0, r4)
        L1d:
            int r9 = (int) r0
            int r6 = super.read(r7, r8, r9)
            return r6
    }

    @Override // defpackage.p55, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
            r2 = this;
            monitor-enter(r2)
            java.io.InputStream r0 = r2.in     // Catch: java.lang.Throwable -> Lc
            r0.reset()     // Catch: java.lang.Throwable -> Lc
            long r0 = r2.B     // Catch: java.lang.Throwable -> Lc
            r2.A = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        Lc:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    @Override // defpackage.p55, java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long r5) {
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.L     // Catch: java.lang.Throwable -> L1f
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L12
            long r2 = r4.h()     // Catch: java.lang.Throwable -> L1f
            long r0 = r0 - r2
            long r5 = java.lang.Math.min(r5, r0)     // Catch: java.lang.Throwable -> L1f
        L12:
            java.io.InputStream r0 = r4.in     // Catch: java.lang.Throwable -> L1f
            long r5 = r0.skip(r5)     // Catch: java.lang.Throwable -> L1f
            long r0 = r4.A     // Catch: java.lang.Throwable -> L1f
            long r0 = r0 + r5
            r4.A = r0     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r4)
            return r5
        L1f:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1f
            throw r5
    }

    public final java.lang.String toString() {
            r0 = this;
            java.io.InputStream r0 = r0.in
            java.lang.String r0 = r0.toString()
            return r0
    }
}
