package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gk1  reason: default package */
/* loaded from: classes.dex */
public final class gk1 implements java.io.Closeable {
    public final defpackage.ek1 A;
    public boolean B;
    public final /* synthetic */ defpackage.lk1 L;

    public gk1(defpackage.lk1 r1, defpackage.ek1 r2) {
            r0 = this;
            r0.<init>()
            r0.L = r1
            r0.A = r2
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r2 = this;
            boolean r0 = r2.B
            if (r0 != 0) goto L24
            r0 = 1
            r2.B = r0
            lk1 r0 = r2.L
            monitor-enter(r0)
            ek1 r2 = r2.A     // Catch: java.lang.Throwable -> L1e
            int r1 = r2.h     // Catch: java.lang.Throwable -> L1e
            int r1 = r1 + (-1)
            r2.h = r1     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L20
            boolean r1 = r2.f     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L20
            xh5 r1 = defpackage.lk1.m0     // Catch: java.lang.Throwable -> L1e
            r0.A(r2)     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r2 = move-exception
            goto L22
        L20:
            monitor-exit(r0)
            return
        L22:
            monitor-exit(r0)
            throw r2
        L24:
            return
    }
}
