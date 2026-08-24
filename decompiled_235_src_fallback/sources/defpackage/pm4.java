package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pm4  reason: default package */
/* loaded from: classes.dex */
public final class pm4 implements defpackage.om2 {
    public final me.magnum.melonds.ui.emulator.render.GlContext a;
    public final defpackage.nm4 b;
    public final defpackage.e25 c;
    public final java.lang.Object d;
    public final java.util.ArrayList e;
    public final java.util.ArrayList f;
    public volatile boolean g;

    public pm4() {
            r4 = this;
            r4.<init>()
            nm4 r0 = new nm4
            r0.<init>(r4)
            r4.b = r0
            e25 r1 = new e25
            r1.<init>()
            r2 = 0
            r1.a = r2
            r1.b = r2
            r4.c = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r4.d = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.e = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.f = r1
            me.magnum.melonds.ui.emulator.render.GlContext r1 = new me.magnum.melonds.ui.emulator.render.GlContext
            me.magnum.melonds.MelonDSAndroidInterface r2 = me.magnum.melonds.MelonDSAndroidInterface.a
            long r2 = r2.getEmulatorGlContext()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.<init>(r2)
            r4.a = r1
            r0.start()
            return
    }

    @Override // defpackage.om2
    public final void a(java.lang.Long r4) {
            r3 = this;
            boolean r0 = r3.g
            if (r0 == 0) goto L5
            goto L44
        L5:
            nm4 r3 = r3.b
            boolean r0 = r3.B
            if (r0 != 0) goto Lc
            goto L44
        Lc:
            sk1 r0 = r3.A
            r1 = 1
            if (r0 == 0) goto L14
            r0.removeMessages(r1)
        L14:
            sk1 r0 = r3.A
            if (r0 == 0) goto L44
            android.os.Message r0 = r0.obtainMessage(r1)
            if (r0 == 0) goto L44
            if (r4 == 0) goto L25
            long r1 = r4.longValue()
            goto L27
        L25:
            r1 = 0
        L27:
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            vr4 r1 = new vr4
            java.lang.String r2 = "frame-deadline"
            r1.<init>(r2, r4)
            vr4[] r4 = new defpackage.vr4[]{r1}
            android.os.Bundle r4 = defpackage.jw2.l(r4)
            r0.setData(r4)
            sk1 r3 = r3.A
            if (r3 == 0) goto L44
            r3.sendMessage(r0)
        L44:
            return
    }

    @Override // defpackage.om2
    public final long b(int r6, int r7) {
            r5 = this;
            boolean r0 = r5.g
            r1 = 0
            if (r0 == 0) goto L7
            goto L29
        L7:
            nm4 r5 = r5.b
            sk1 r0 = r5.A
            if (r0 != 0) goto Le
            goto L29
        Le:
            boolean r5 = r5.B
            if (r5 != 0) goto L13
            goto L29
        L13:
            om4 r5 = new om4
            java.util.concurrent.CountDownLatch r3 = new java.util.concurrent.CountDownLatch
            r4 = 1
            r3.<init>(r4)
            r5.<init>(r3)
            r4 = 4
            android.os.Message r6 = android.os.Message.obtain(r0, r4, r6, r7, r5)
            boolean r6 = r0.sendMessageAtFrontOfQueue(r6)
            if (r6 != 0) goto L2a
        L29:
            return r1
        L2a:
            r6 = 10
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES
            boolean r6 = r3.await(r6, r0)
            if (r6 != 0) goto L3c
            java.lang.String r5 = "OpenGlFrameRenderCoordinator"
            java.lang.String r6 = "Shader prewarm timed out; the first frames may stutter while it finishes"
            android.util.Log.w(r5, r6)
            return r1
        L3c:
            long r5 = r5.b
            return r5
    }

    @Override // defpackage.om2
    public final void c(me.magnum.melonds.ui.emulator.EmulatorSurfaceView r2) {
            r1 = this;
            boolean r0 = r1.g
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.Object r0 = r1.d
            monitor-enter(r0)
            java.util.ArrayList r1 = r1.e     // Catch: java.lang.Throwable -> Lf
            r1.add(r2)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return
        Lf:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // defpackage.om2
    public final void d(me.magnum.melonds.ui.emulator.EmulatorSurfaceView r3) {
            r2 = this;
            r3.getClass()
            boolean r0 = r2.g
            if (r0 == 0) goto L8
            return
        L8:
            java.lang.Object r0 = r2.d
            monitor-enter(r0)
            java.util.ArrayList r1 = r2.e     // Catch: java.lang.Throwable -> L2d
            r1.remove(r3)     // Catch: java.lang.Throwable -> L2d
            java.util.ArrayList r1 = r2.f     // Catch: java.lang.Throwable -> L2d
            r1.add(r3)     // Catch: java.lang.Throwable -> L2d
            nm4 r2 = r2.b     // Catch: java.lang.Throwable -> L2d
            boolean r3 = r2.B     // Catch: java.lang.Throwable -> L2d
            if (r3 != 0) goto L1c
            goto L2b
        L1c:
            sk1 r3 = r2.A     // Catch: java.lang.Throwable -> L2d
            r1 = 2
            if (r3 == 0) goto L24
            r3.removeMessages(r1)     // Catch: java.lang.Throwable -> L2d
        L24:
            sk1 r2 = r2.A     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L2b
            r2.sendEmptyMessage(r1)     // Catch: java.lang.Throwable -> L2d
        L2b:
            monitor-exit(r0)
            return
        L2d:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    @Override // defpackage.om2
    public final void e(me.magnum.melonds.ui.emulator.EmulatorSurfaceView r1, me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig r2, defpackage.t26 r3) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            return
    }

    @Override // defpackage.om2
    public final void stop() {
            r2 = this;
            boolean r0 = r2.g
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.g = r0
            nm4 r0 = r2.b
            r1 = 0
            r0.B = r1
            sk1 r0 = r0.A
            if (r0 == 0) goto L19
            r1 = 3
            android.os.Message r1 = android.os.Message.obtain(r0, r1)
            r0.sendMessageAtFrontOfQueue(r1)
        L19:
            nm4 r0 = r2.b
            r0.quitSafely()
            nm4 r2 = r2.b
            r2.join()
            return
    }
}
