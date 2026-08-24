package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wf3  reason: default package */
/* loaded from: classes.dex */
public final class wf3 implements java.io.Closeable {
    public boolean A;
    public int B;
    public final java.util.concurrent.locks.ReentrantLock L;
    public final java.io.RandomAccessFile R;

    public wf3(java.io.RandomAccessFile r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r1.L = r0
            r1.R = r2
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.L
            r0.lock()
            boolean r1 = r2.A     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto Ld
            r0.unlock()
            return
        Ld:
            r1 = 1
            r2.A = r1     // Catch: java.lang.Throwable -> L26
            int r1 = r2.B     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L18
            r0.unlock()
            return
        L18:
            r0.unlock()
            monitor-enter(r2)
            java.io.RandomAccessFile r0 = r2.R     // Catch: java.lang.Throwable -> L23
            r0.close()     // Catch: java.lang.Throwable -> L23
            monitor-exit(r2)
            return
        L23:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L23
            throw r0
        L26:
            r2 = move-exception
            r0.unlock()
            throw r2
    }

    public final defpackage.va2 e(long r3) {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.L
            r0.lock()
            boolean r1 = r2.A     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            int r1 = r2.B     // Catch: java.lang.Throwable -> L18
            int r1 = r1 + 1
            r2.B = r1     // Catch: java.lang.Throwable -> L18
            r0.unlock()
            va2 r0 = new va2
            r0.<init>(r2, r3)
            return r0
        L18:
            r2 = move-exception
            goto L22
        L1a:
            java.lang.String r2 = "closed"
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L18
            throw r3     // Catch: java.lang.Throwable -> L18
        L22:
            r0.unlock()
            throw r2
    }

    public final long size() {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.L
            r0.lock()
            boolean r1 = r2.A     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L18
            r0.unlock()
            monitor-enter(r2)
            java.io.RandomAccessFile r0 = r2.R     // Catch: java.lang.Throwable -> L15
            long r0 = r0.length()     // Catch: java.lang.Throwable -> L15
            monitor-exit(r2)
            return r0
        L15:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            throw r0
        L18:
            java.lang.String r2 = "closed"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L20
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L20
            throw r1     // Catch: java.lang.Throwable -> L20
        L20:
            r2 = move-exception
            r0.unlock()
            throw r2
    }
}
