package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uj0  reason: default package */
/* loaded from: classes.dex */
public final class uj0 {
    public boolean a;
    public defpackage.em2 b;
    public boolean c;

    public final void a() {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.a     // Catch: java.lang.Throwable -> L7
            if (r0 == 0) goto L9
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r0 = move-exception
            goto L45
        L9:
            r0 = 1
            r4.a = r0     // Catch: java.lang.Throwable -> L7
            r4.c = r0     // Catch: java.lang.Throwable -> L7
            em2 r0 = r4.b     // Catch: java.lang.Throwable -> L7
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7
            r1 = 0
            if (r0 == 0) goto L3a
            java.lang.Object r2 = r0.B     // Catch: java.lang.Throwable -> L29
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch: java.lang.Throwable -> L29
            java.lang.Object r3 = r0.R     // Catch: java.lang.Throwable -> L29
            ea7 r3 = (defpackage.ea7) r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r0 = r0.L     // Catch: java.lang.Throwable -> L29
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L29
            if (r2 != 0) goto L2b
            r3.cancel()     // Catch: java.lang.Throwable -> L29
            r0.run()     // Catch: java.lang.Throwable -> L29
            goto L3a
        L29:
            r0 = move-exception
            goto L2f
        L2b:
            r2.run()     // Catch: java.lang.Throwable -> L29
            goto L3a
        L2f:
            monitor-enter(r4)
            r4.c = r1     // Catch: java.lang.Throwable -> L37
            r4.notifyAll()     // Catch: java.lang.Throwable -> L37
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L37
            throw r0
        L37:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L37
            throw r0
        L3a:
            monitor-enter(r4)
            r4.c = r1     // Catch: java.lang.Throwable -> L42
            r4.notifyAll()     // Catch: java.lang.Throwable -> L42
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            return
        L42:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            throw r0
        L45:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7
            throw r0
    }
}
