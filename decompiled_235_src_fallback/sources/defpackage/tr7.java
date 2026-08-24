package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tr7  reason: default package */
/* loaded from: classes.dex */
public final class tr7 extends android.os.HandlerThread {
    public volatile defpackage.sk1 A;
    public volatile boolean B;
    public boolean L;
    public final defpackage.wr7 R;
    public final /* synthetic */ defpackage.xr7 X;

    public tr7(defpackage.xr7 r1) {
            r0 = this;
            r0.X = r1
            java.lang.String r1 = "VulkanPresentThread"
            r0.<init>(r1)
            r1 = 1
            r0.B = r1
            wr7 r1 = new wr7
            r1.<init>()
            r0.R = r1
            return
    }

    public static final void a(defpackage.tr7 r6, me.magnum.melonds.ui.emulator.EmulatorSurfaceView r7, android.view.Surface r8, int r9, int r10) {
            boolean r0 = r6.B
            if (r0 != 0) goto L6
            goto L78
        L6:
            if (r8 != 0) goto La
            goto L78
        La:
            xr7 r0 = r6.X
            java.lang.Object r1 = r0.c
            monitor-enter(r1)
            java.util.LinkedHashMap r0 = r0.d     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r0 = r0.get(r7)     // Catch: java.lang.Throwable -> L2b
            ur7 r0 = (defpackage.ur7) r0     // Catch: java.lang.Throwable -> L2b
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L2d
            int r4 = r0.a     // Catch: java.lang.Throwable -> L2b
            if (r4 != 0) goto L2d
            android.view.Surface r0 = r0.e     // Catch: java.lang.Throwable -> L2b
            if (r0 != r8) goto L2d
            android.view.Surface r0 = r7.getCurrentSurface()     // Catch: java.lang.Throwable -> L2b
            if (r0 != r8) goto L2d
            r0 = r2
            goto L2e
        L2b:
            r6 = move-exception
            goto L7b
        L2d:
            r0 = r3
        L2e:
            monitor-exit(r1)
            if (r0 != 0) goto L32
            goto L78
        L32:
            me.magnum.melonds.MelonEmulator r0 = me.magnum.melonds.MelonEmulator.a
            int r9 = r0.attachVulkanSurface(r8, r9, r10)
            xr7 r10 = r6.X
            java.lang.Object r1 = r10.c
            monitor-enter(r1)
            java.util.LinkedHashMap r10 = r10.d     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r10 = r10.get(r7)     // Catch: java.lang.Throwable -> L5e
            ur7 r10 = (defpackage.ur7) r10     // Catch: java.lang.Throwable -> L5e
            r4 = 0
            if (r10 == 0) goto L60
            android.view.Surface r5 = r10.e     // Catch: java.lang.Throwable -> L5e
            if (r5 != r8) goto L60
            android.view.Surface r5 = r7.getCurrentSurface()     // Catch: java.lang.Throwable -> L5e
            if (r5 == r8) goto L53
            goto L60
        L53:
            r10.e = r4     // Catch: java.lang.Throwable -> L5e
            r10.a = r9     // Catch: java.lang.Throwable -> L5e
            me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig r8 = r10.b     // Catch: java.lang.Throwable -> L5e
            if (r9 == 0) goto L5c
            goto L63
        L5c:
            r2 = r3
            goto L63
        L5e:
            r6 = move-exception
            goto L79
        L60:
            r2 = r3
            r8 = r4
            r3 = r9
        L63:
            monitor-exit(r1)
            if (r3 == 0) goto L6a
            r0.detachVulkanSurface(r3)
            return
        L6a:
            if (r9 == 0) goto L71
            if (r8 == 0) goto L71
            r0.configureVulkanSurface(r9, r8, r4)
        L71:
            if (r2 == 0) goto L78
            xr7 r6 = r6.X
            r6.f(r7)
        L78:
            return
        L79:
            monitor-exit(r1)
            throw r6
        L7b:
            monitor-exit(r1)
            throw r6
    }

    public static final void b(defpackage.tr7 r4, me.magnum.melonds.ui.emulator.EmulatorSurfaceView r5, int r6, android.graphics.Bitmap r7) {
            boolean r0 = r4.B
            if (r0 != 0) goto La
            if (r7 == 0) goto L76
            r7.recycle()
            return
        La:
            xr7 r0 = r4.X
            java.lang.Object r1 = r0.c
            monitor-enter(r1)
            java.util.LinkedHashMap r0 = r0.d     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L1c
            ur7 r0 = (defpackage.ur7) r0     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1e
            int r2 = r0.a     // Catch: java.lang.Throwable -> L1c
            goto L1f
        L1c:
            r4 = move-exception
            goto L7a
        L1e:
            r2 = 0
        L1f:
            if (r0 == 0) goto L24
            int r0 = r0.d     // Catch: java.lang.Throwable -> L1c
            goto L25
        L24:
            r0 = -1
        L25:
            monitor-exit(r1)
            xr7 r1 = r4.X
            java.lang.Object r3 = r1.c
            monitor-enter(r3)
            java.util.LinkedHashMap r1 = r1.e     // Catch: java.lang.Throwable -> L77
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L77
            vr7 r1 = (defpackage.vr7) r1     // Catch: java.lang.Throwable -> L77
            monitor-exit(r3)
            if (r2 == 0) goto L71
            if (r0 != r6) goto L71
            if (r1 == 0) goto L71
            int r0 = r1.a
            if (r0 != r6) goto L71
            xr7 r4 = r4.X
            java.lang.Object r0 = r4.c
            monitor-enter(r0)
            java.util.LinkedHashMap r3 = r4.e     // Catch: java.lang.Throwable -> L57
            java.lang.Object r3 = r3.get(r5)     // Catch: java.lang.Throwable -> L57
            vr7 r3 = (defpackage.vr7) r3     // Catch: java.lang.Throwable -> L57
            if (r3 == 0) goto L59
            int r3 = r3.a     // Catch: java.lang.Throwable -> L57
            if (r3 != r6) goto L59
            java.util.LinkedHashMap r4 = r4.e     // Catch: java.lang.Throwable -> L57
            r4.remove(r5)     // Catch: java.lang.Throwable -> L57
            goto L59
        L57:
            r4 = move-exception
            goto L6f
        L59:
            monitor-exit(r0)
            me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig r4 = r1.b
            if (r4 != 0) goto L64
            if (r7 == 0) goto L76
            r7.recycle()
            return
        L64:
            me.magnum.melonds.MelonEmulator r5 = me.magnum.melonds.MelonEmulator.a
            r5.configureVulkanSurface(r2, r4, r7)
            if (r7 == 0) goto L76
            r7.recycle()
            return
        L6f:
            monitor-exit(r0)
            throw r4
        L71:
            if (r7 == 0) goto L76
            r7.recycle()
        L76:
            return
        L77:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L7a:
            monitor-exit(r1)
            throw r4
    }

    public final android.os.Handler c() {
            r3 = this;
            sk1 r0 = r3.A
            r1 = 0
            if (r0 != 0) goto L6
            goto L1b
        L6:
            android.os.Looper r2 = r0.getLooper()
            java.lang.Thread r2 = r2.getThread()
            boolean r2 = r2.isAlive()
            if (r2 == 0) goto L15
            return r0
        L15:
            sk1 r2 = r3.A
            if (r2 != r0) goto L1b
            r3.A = r1
        L1b:
            return r1
    }

    public final void d(int r4) {
            r3 = this;
            boolean r0 = r3.B
            if (r0 != 0) goto L5
            goto Le
        L5:
            if (r4 != 0) goto L8
            goto Le
        L8:
            android.os.Handler r0 = r3.c()
            if (r0 != 0) goto Lf
        Le:
            return
        Lf:
            r1 = 4
            r2 = 0
            android.os.Message r4 = r0.obtainMessage(r1, r4, r2)
            r0.sendMessage(r4)     // Catch: java.lang.IllegalStateException -> L19
            return
        L19:
            sk1 r1 = r3.A
            if (r1 != r0) goto L23
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            r3.A = r1
        L23:
            r4.recycle()
            return
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
            r3 = this;
            android.os.Looper r0 = r3.getLooper()
            sk1 r1 = new sk1
            r2 = 5
            r1.<init>(r3, r0, r2)
            r3.A = r1
            return
    }
}
