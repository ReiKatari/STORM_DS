package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rm  reason: default package */
/* loaded from: classes.dex */
public final class rm implements android.view.Choreographer.FrameCallback, java.lang.Runnable {
    public final /* synthetic */ defpackage.sm A;

    public rm(defpackage.sm r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long r5) {
            r4 = this;
            sm r0 = r4.A
            android.os.Handler r0 = r0.R
            r0.removeCallbacks(r4)
            sm r0 = r4.A
            defpackage.sm.n0(r0)
            sm r4 = r4.A
            java.lang.Object r0 = r4.X
            monitor-enter(r0)
            boolean r1 = r4.f0     // Catch: java.lang.Throwable -> L39
            if (r1 != 0) goto L17
            monitor-exit(r0)
            return
        L17:
            r1 = 0
            r4.f0 = r1     // Catch: java.lang.Throwable -> L39
            java.util.ArrayList r2 = r4.Z     // Catch: java.lang.Throwable -> L39
            java.util.ArrayList r3 = r4.d0     // Catch: java.lang.Throwable -> L39
            r4.Z = r3     // Catch: java.lang.Throwable -> L39
            r4.d0 = r2     // Catch: java.lang.Throwable -> L39
            monitor-exit(r0)
            int r4 = r2.size()
        L27:
            if (r1 >= r4) goto L35
            java.lang.Object r0 = r2.get(r1)
            android.view.Choreographer$FrameCallback r0 = (android.view.Choreographer.FrameCallback) r0
            r0.doFrame(r5)
            int r1 = r1 + 1
            goto L27
        L35:
            r2.clear()
            return
        L39:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            sm r0 = r3.A
            defpackage.sm.n0(r0)
            sm r0 = r3.A
            java.lang.Object r1 = r0.X
            monitor-enter(r1)
            java.util.ArrayList r2 = r0.Z     // Catch: java.lang.Throwable -> L1b
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1d
            android.view.Choreographer r2 = r0.L     // Catch: java.lang.Throwable -> L1b
            r2.removeFrameCallback(r3)     // Catch: java.lang.Throwable -> L1b
            r3 = 0
            r0.f0 = r3     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r3 = move-exception
            goto L1f
        L1d:
            monitor-exit(r1)
            return
        L1f:
            monitor-exit(r1)
            throw r3
    }
}
