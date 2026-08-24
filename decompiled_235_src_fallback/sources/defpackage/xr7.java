package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xr7  reason: default package */
/* loaded from: classes.dex */
public final class xr7 implements defpackage.om2, defpackage.iy1 {
    public final me.magnum.melonds.ui.emulator.EmulatorActivity a;
    public final defpackage.o41 b;
    public final java.lang.Object c;
    public final java.util.LinkedHashMap d;
    public final java.util.LinkedHashMap e;
    public final defpackage.tr7 f;
    public volatile boolean g;

    public xr7(me.magnum.melonds.ui.emulator.EmulatorActivity r2) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            gu6 r2 = defpackage.oi2.c()
            xe1 r0 = defpackage.xk1.a
            jv2 r0 = defpackage.e04.a
            jv2 r0 = r0.Y
            l61 r2 = defpackage.jw2.y(r2, r0)
            o41 r2 = defpackage.g04.i(r2)
            r1.b = r2
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.c = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r1.d = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r1.e = r2
            tr7 r2 = new tr7
            r2.<init>(r1)
            r1.f = r2
            r2.start()
            return
    }

    @Override // defpackage.om2
    public final void a(java.lang.Long r5) {
            r4 = this;
            boolean r0 = r4.g
            if (r0 == 0) goto L5
            goto L12
        L5:
            tr7 r4 = r4.f
            boolean r0 = r4.B
            if (r0 != 0) goto Lc
            goto L12
        Lc:
            android.os.Handler r0 = r4.c()
            if (r0 != 0) goto L13
        L12:
            return
        L13:
            r1 = 5
            r0.removeMessages(r1)
            android.os.Message r1 = r0.obtainMessage(r1)
            if (r5 == 0) goto L22
            long r2 = r5.longValue()
            goto L24
        L22:
            r2 = 0
        L24:
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            vr4 r2 = new vr4
            java.lang.String r3 = "frame-deadline"
            r2.<init>(r3, r5)
            vr4[] r5 = new defpackage.vr4[]{r2}
            android.os.Bundle r5 = defpackage.jw2.l(r5)
            r1.setData(r5)
            r0.sendMessage(r1)     // Catch: java.lang.IllegalStateException -> L3e
            return
        L3e:
            sk1 r5 = r4.A
            if (r5 != r0) goto L48
            r5 = 0
            r0.removeCallbacksAndMessages(r5)
            r4.A = r5
        L48:
            r1.recycle()
            return
    }

    @Override // defpackage.om2
    public final void c(me.magnum.melonds.ui.emulator.EmulatorSurfaceView r4) {
            r3 = this;
            boolean r0 = r3.g
            if (r0 == 0) goto L5
            goto L39
        L5:
            java.lang.Object r0 = r3.c
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = r3.d     // Catch: java.lang.Throwable -> L3a
            ur7 r2 = new ur7     // Catch: java.lang.Throwable -> L3a
            r2.<init>()     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r1 = r1.putIfAbsent(r4, r2)     // Catch: java.lang.Throwable -> L3a
            ur7 r1 = (defpackage.ur7) r1     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)
            r4.setSurfaceLifecycleListener(r3)
            android.view.Surface r0 = r4.getCurrentSurface()
            if (r0 == 0) goto L39
            vr4 r1 = r4.getCurrentSurfaceSize()
            java.lang.Object r2 = r1.A
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r1 = r1.B
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r3.g(r4, r0, r2, r1)
            r3.f(r4)
        L39:
            return
        L3a:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    @Override // defpackage.om2
    public final void d(me.magnum.melonds.ui.emulator.EmulatorSurfaceView r4) {
            r3 = this;
            r4.getClass()
            r0 = 0
            r4.setSurfaceLifecycleListener(r0)
            boolean r1 = r3.g
            if (r1 == 0) goto Lc
            return
        Lc:
            java.lang.Object r1 = r3.c
            monitor-enter(r1)
            java.util.LinkedHashMap r2 = r3.e     // Catch: java.lang.Throwable -> L23
            r2.remove(r4)     // Catch: java.lang.Throwable -> L23
            java.util.LinkedHashMap r2 = r3.d     // Catch: java.lang.Throwable -> L23
            java.lang.Object r4 = r2.remove(r4)     // Catch: java.lang.Throwable -> L23
            ur7 r4 = (defpackage.ur7) r4     // Catch: java.lang.Throwable -> L23
            if (r4 == 0) goto L25
            r4.e = r0     // Catch: java.lang.Throwable -> L23
            int r4 = r4.a     // Catch: java.lang.Throwable -> L23
            goto L26
        L23:
            r3 = move-exception
            goto L2d
        L25:
            r4 = 0
        L26:
            monitor-exit(r1)
            tr7 r3 = r3.f
            r3.d(r4)
            return
        L2d:
            monitor-exit(r1)
            throw r3
    }

    @Override // defpackage.om2
    public final void e(me.magnum.melonds.ui.emulator.EmulatorSurfaceView r11, me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig r12, defpackage.t26 r13) {
            r10 = this;
            r11.getClass()
            r13.getClass()
            boolean r0 = r10.g
            if (r0 == 0) goto Lb
            return
        Lb:
            java.lang.Object r1 = r10.c
            monitor-enter(r1)
            java.util.LinkedHashMap r0 = r10.d     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r2 = r0.get(r11)     // Catch: java.lang.Throwable -> L1f
            if (r2 != 0) goto L23
            ur7 r2 = new ur7     // Catch: java.lang.Throwable -> L1f
            r2.<init>()     // Catch: java.lang.Throwable -> L1f
            r0.put(r11, r2)     // Catch: java.lang.Throwable -> L1f
            goto L23
        L1f:
            r0 = move-exception
            r10 = r0
            goto L90
        L23:
            ur7 r2 = (defpackage.ur7) r2     // Catch: java.lang.Throwable -> L1f
            r2.b = r12     // Catch: java.lang.Throwable -> L1f
            r2.c = r13     // Catch: java.lang.Throwable -> L1f
            int r0 = r2.d     // Catch: java.lang.Throwable -> L1f
            int r6 = r0 + 1
            r2.d = r6     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)
            java.lang.Object r1 = r10.c
            monitor-enter(r1)
            java.util.LinkedHashMap r0 = r10.d     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = r0.get(r11)     // Catch: java.lang.Throwable -> L54
            ur7 r0 = (defpackage.ur7) r0     // Catch: java.lang.Throwable -> L54
            vr4 r2 = r11.getCurrentSurfaceSize()     // Catch: java.lang.Throwable -> L54
            java.lang.Object r3 = r2.A     // Catch: java.lang.Throwable -> L54
            java.lang.Number r3 = (java.lang.Number) r3     // Catch: java.lang.Throwable -> L54
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L54
            java.lang.Object r2 = r2.B     // Catch: java.lang.Throwable -> L54
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.Throwable -> L54
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L57
            int r0 = r0.a     // Catch: java.lang.Throwable -> L54
            goto L58
        L54:
            r0 = move-exception
            r10 = r0
            goto L8e
        L57:
            r0 = 0
        L58:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L54
            android.view.Surface r4 = r11.getCurrentSurface()     // Catch: java.lang.Throwable -> L54
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L54
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r1)
            int r0 = r0.intValue()
            int r1 = r3.intValue()
            int r2 = r2.intValue()
            if (r0 != 0) goto L7c
            if (r4 == 0) goto L7c
            r10.g(r11, r4, r1, r2)
        L7c:
            o41 r0 = r10.b
            zv1 r3 = new zv1
            r9 = 0
            r4 = r10
            r5 = r11
            r7 = r12
            r8 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r10 = 3
            r11 = 0
            defpackage.hv.L(r0, r11, r11, r3, r10)
            return
        L8e:
            monitor-exit(r1)
            throw r10
        L90:
            monitor-exit(r1)
            throw r10
    }

    public final void f(me.magnum.melonds.ui.emulator.EmulatorSurfaceView r9) {
            r8 = this;
            boolean r0 = r8.g
            if (r0 == 0) goto L5
            goto L29
        L5:
            java.lang.Object r1 = r8.c
            monitor-enter(r1)
            java.util.LinkedHashMap r0 = r8.d     // Catch: java.lang.Throwable -> L32
            java.lang.Object r0 = r0.get(r9)     // Catch: java.lang.Throwable -> L32
            ur7 r0 = (defpackage.ur7) r0     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L25
            int r3 = r0.a     // Catch: java.lang.Throwable -> L32
            me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig r4 = r0.b     // Catch: java.lang.Throwable -> L32
            t26 r5 = r0.c     // Catch: java.lang.Throwable -> L32
            int r6 = r0.d     // Catch: java.lang.Throwable -> L32
            android.view.Surface r7 = r0.e     // Catch: java.lang.Throwable -> L32
            r5.getClass()     // Catch: java.lang.Throwable -> L32
            ur7 r2 = new ur7     // Catch: java.lang.Throwable -> L32
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L32
            goto L26
        L25:
            r2 = 0
        L26:
            monitor-exit(r1)
            if (r2 != 0) goto L2a
        L29:
            return
        L2a:
            me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig r0 = r2.b
            t26 r1 = r2.c
            r8.e(r9, r0, r1)
            return
        L32:
            r0 = move-exception
            r8 = r0
            monitor-exit(r1)
            throw r8
    }

    public final void g(me.magnum.melonds.ui.emulator.EmulatorSurfaceView r6, android.view.Surface r7, int r8, int r9) {
            r5 = this;
            boolean r0 = r5.g
            if (r0 == 0) goto L6
            goto L7c
        L6:
            java.lang.Object r0 = r5.c
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = r5.d     // Catch: java.lang.Throwable -> L23
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L23
            ur7 r1 = (defpackage.ur7) r1     // Catch: java.lang.Throwable -> L23
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L16
            goto L25
        L16:
            int r4 = r1.a     // Catch: java.lang.Throwable -> L23
            if (r4 != 0) goto L25
            android.view.Surface r4 = r1.e     // Catch: java.lang.Throwable -> L23
            if (r4 == 0) goto L1f
            goto L25
        L1f:
            r1.e = r7     // Catch: java.lang.Throwable -> L23
            r3 = r2
            goto L25
        L23:
            r5 = move-exception
            goto L7d
        L25:
            monitor-exit(r0)
            if (r3 == 0) goto L7c
            tr7 r5 = r5.f
            r5.getClass()
            r6.getClass()
            r7.getClass()
            boolean r0 = r5.B
            if (r0 != 0) goto L38
            goto L7c
        L38:
            android.os.Handler r0 = r5.c()
            if (r0 != 0) goto L3f
            goto L7c
        L3f:
            android.os.Message r6 = r0.obtainMessage(r2, r6)
            java.lang.String r1 = "surface"
            vr4 r2 = new vr4
            r2.<init>(r1, r7)
            java.lang.String r7 = "width"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            vr4 r1 = new vr4
            r1.<init>(r7, r8)
            java.lang.String r7 = "height"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            vr4 r9 = new vr4
            r9.<init>(r7, r8)
            vr4[] r7 = new defpackage.vr4[]{r2, r1, r9}
            android.os.Bundle r7 = defpackage.jw2.l(r7)
            r6.setData(r7)
            r0.sendMessage(r6)     // Catch: java.lang.IllegalStateException -> L6f
            return
        L6f:
            sk1 r7 = r5.A
            if (r7 != r0) goto L79
            r7 = 0
            r0.removeCallbacksAndMessages(r7)
            r5.A = r7
        L79:
            r6.recycle()
        L7c:
            return
        L7d:
            monitor-exit(r0)
            throw r5
    }

    @Override // defpackage.om2
    public final void stop() {
            r4 = this;
            boolean r0 = r4.g
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.g = r0
            java.lang.Object r0 = r4.c
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = r4.d     // Catch: java.lang.Throwable -> L5b
            java.util.Set r1 = r1.keySet()     // Catch: java.lang.Throwable -> L5b
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L5b
            java.util.List r1 = defpackage.gt0.k1(r1)     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r0)
            java.util.Iterator r0 = r1.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            me.magnum.melonds.ui.emulator.EmulatorSurfaceView r1 = (me.magnum.melonds.ui.emulator.EmulatorSurfaceView) r1
            r1.setSurfaceLifecycleListener(r2)
            goto L1c
        L2d:
            o41 r0 = r4.b
            defpackage.g04.x(r0, r2)
            tr7 r0 = r4.f
            r1 = 0
            r0.B = r1
            android.os.Handler r1 = r0.c()
            if (r1 != 0) goto L3e
            goto L50
        L3e:
            r3 = 6
            android.os.Message r3 = android.os.Message.obtain(r1, r3)     // Catch: java.lang.IllegalStateException -> L47
            r1.sendMessageAtFrontOfQueue(r3)     // Catch: java.lang.IllegalStateException -> L47
            goto L50
        L47:
            sk1 r3 = r0.A
            if (r3 != r1) goto L50
            r1.removeCallbacksAndMessages(r2)
            r0.A = r2
        L50:
            tr7 r0 = r4.f
            r0.quitSafely()
            tr7 r4 = r4.f
            r4.join()
            return
        L5b:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }
}
