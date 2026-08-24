package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ar6  reason: default package */
/* loaded from: classes.dex */
public final class ar6 implements java.lang.Runnable {
    public final defpackage.o35 A;
    public final defpackage.jp6 B;
    public final boolean L;
    public final int R;

    public ar6(defpackage.o35 r1, defpackage.jp6 r2, boolean r3, int r4) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r8 = this;
            boolean r0 = r8.L
            o35 r1 = r8.A
            jp6 r2 = r8.B
            if (r0 == 0) goto L21
            int r0 = r8.R
            r1.getClass()
            gw7 r2 = r2.a
            java.lang.String r2 = r2.a
            java.lang.Object r3 = r1.k
            monitor-enter(r3)
            rx7 r1 = r1.b(r2)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1e
            boolean r0 = defpackage.o35.d(r2, r1, r0)
            goto L74
        L1e:
            r8 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1e
            throw r8
        L21:
            int r0 = r8.R
            r1.getClass()
            java.lang.String r3 = "Ignored stopWork. WorkerWrapper "
            gw7 r4 = r2.a
            java.lang.String r4 = r4.a
            java.lang.Object r5 = r1.k
            monitor-enter(r5)
            java.util.HashMap r6 = r1.f     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r6.get(r4)     // Catch: java.lang.Throwable -> L55
            r7 = 0
            if (r6 == 0) goto L57
            ga0 r0 = defpackage.ga0.f()     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = defpackage.o35.l     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L55
            r2.append(r4)     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = " is in foreground"
            r2.append(r3)     // Catch: java.lang.Throwable -> L55
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L55
            r0.b(r1, r2)     // Catch: java.lang.Throwable -> L55
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L55
        L53:
            r0 = r7
            goto L74
        L55:
            r8 = move-exception
            goto L9e
        L57:
            java.util.HashMap r3 = r1.h     // Catch: java.lang.Throwable -> L55
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L55
            java.util.Set r3 = (java.util.Set) r3     // Catch: java.lang.Throwable -> L55
            if (r3 == 0) goto L72
            boolean r2 = r3.contains(r2)     // Catch: java.lang.Throwable -> L55
            if (r2 != 0) goto L68
            goto L72
        L68:
            rx7 r1 = r1.b(r4)     // Catch: java.lang.Throwable -> L55
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L55
            boolean r0 = defpackage.o35.d(r4, r1, r0)
            goto L74
        L72:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L55
            goto L53
        L74:
            ga0 r1 = defpackage.ga0.f()
            java.lang.String r2 = "StopWorkRunnable"
            java.lang.String r2 = defpackage.ga0.h(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "StopWorkRunnable for "
            r3.<init>(r4)
            jp6 r8 = r8.B
            gw7 r8 = r8.a
            java.lang.String r8 = r8.a
            r3.append(r8)
            java.lang.String r8 = "; Processor.stopWork = "
            r3.append(r8)
            r3.append(r0)
            java.lang.String r8 = r3.toString()
            r1.b(r2, r8)
            return
        L9e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L55
            throw r8
    }
}
