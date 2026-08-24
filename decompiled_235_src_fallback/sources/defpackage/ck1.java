package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ck1  reason: default package */
/* loaded from: classes.dex */
public final class ck1 extends defpackage.kk2 {
    public boolean B;
    public final /* synthetic */ defpackage.kk1 L;
    public final /* synthetic */ defpackage.dk1 R;

    public ck1(defpackage.in6 r1, defpackage.kk1 r2, defpackage.dk1 r3) {
            r0 = this;
            r0.L = r2
            r0.R = r3
            r0.<init>(r1)
            return
    }

    @Override // defpackage.kk2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r2 = this;
            super.close()
            boolean r0 = r2.B
            if (r0 != 0) goto L25
            r0 = 1
            r2.B = r0
            kk1 r0 = r2.L
            dk1 r2 = r2.R
            monitor-enter(r0)
            int r1 = r2.h     // Catch: java.lang.Throwable -> L1f
            int r1 = r1 + (-1)
            r2.h = r1     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L21
            boolean r1 = r2.f     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L21
            r0.F(r2)     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r2 = move-exception
            goto L23
        L21:
            monitor-exit(r0)
            return
        L23:
            monitor-exit(r0)
            throw r2
        L25:
            return
    }
}
