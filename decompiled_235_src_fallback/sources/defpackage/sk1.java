package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sk1  reason: default package */
/* loaded from: classes.dex */
public final class sk1 extends android.os.Handler {
    public final /* synthetic */ int a;
    public java.lang.Object b;

    public /* synthetic */ sk1() {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.<init>()
            return
    }

    public /* synthetic */ sk1(android.os.Looper r1, java.lang.Object r2, int r3) {
            r0 = this;
            r0.a = r3
            r0.<init>(r1)
            r0.b = r2
            return
    }

    public /* synthetic */ sk1(java.lang.Object r1, android.os.Looper r2, int r3) {
            r0 = this;
            r0.a = r3
            r0.b = r1
            r0.<init>(r2)
            return
    }

    private final void a(android.os.Message r10) {
            r9 = this;
            r10.getClass()
            int r0 = r10.what
            r1 = 0
            r3 = 1
            if (r0 == r3) goto L14c
            r4 = 2
            r5 = 0
            if (r0 == r4) goto L122
            r4 = 3
            if (r0 == r4) goto Laf
            r3 = 4
            if (r0 == r3) goto L16
            goto L15e
        L16:
            java.lang.Object r9 = r9.b
            nm4 r9 = (defpackage.nm4) r9
            int r0 = r10.arg1
            int r3 = r10.arg2
            java.lang.Object r10 = r10.obj
            r10.getClass()
            om4 r10 = (defpackage.om4) r10
            java.lang.String r4 = "Shader prewarm "
            boolean r5 = r9.B     // Catch: java.lang.Throwable -> L6f
            if (r5 == 0) goto La6
            pm4 r9 = r9.Y     // Catch: java.lang.Throwable -> L6f
            me.magnum.melonds.ui.emulator.render.GlContext r9 = r9.a     // Catch: java.lang.Throwable -> L6f
            boolean r9 = r9.d()     // Catch: java.lang.Throwable -> L6f
            if (r9 != 0) goto L37
            goto La6
        L37:
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L6f
            me.magnum.melonds.MelonEmulator r9 = me.magnum.melonds.MelonEmulator.a     // Catch: java.lang.Throwable -> L46
            boolean r9 = r9.prewarmOpenGlRetroArchFilter(r0, r3)     // Catch: java.lang.Throwable -> L46
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L46
            goto L4d
        L46:
            r9 = move-exception
            em5 r7 = new em5     // Catch: java.lang.Throwable -> L6f
            r7.<init>(r9)     // Catch: java.lang.Throwable -> L6f
            r9 = r7
        L4d:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L6f
            boolean r8 = r9 instanceof defpackage.em5     // Catch: java.lang.Throwable -> L6f
            if (r8 == 0) goto L54
            r9 = r7
        L54:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L6f
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L6f
            long r7 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L6f
            long r7 = r7 - r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r7 / r5
            if (r9 == 0) goto L66
            r1 = r7
        L66:
            r10.b = r1     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = "OpenGlFrameRenderCoordinator"
            if (r9 == 0) goto L71
            java.lang.String r9 = "ready"
            goto L73
        L6f:
            r9 = move-exception
            goto La9
        L71:
            java.lang.String r9 = "failed"
        L73:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L6f
            r2.append(r9)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r9 = " in "
            r2.append(r9)     // Catch: java.lang.Throwable -> L6f
            r2.append(r7)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r9 = "ms (atlas "
            r2.append(r9)     // Catch: java.lang.Throwable -> L6f
            r2.append(r0)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r9 = "x"
            r2.append(r9)     // Catch: java.lang.Throwable -> L6f
            r2.append(r3)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r9 = ")"
            r2.append(r9)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r9 = r2.toString()     // Catch: java.lang.Throwable -> L6f
            android.util.Log.i(r1, r9)     // Catch: java.lang.Throwable -> L6f
            java.util.concurrent.CountDownLatch r9 = r10.a
        La1:
            r9.countDown()
            goto L15e
        La6:
            java.util.concurrent.CountDownLatch r9 = r10.a
            goto La1
        La9:
            java.util.concurrent.CountDownLatch r10 = r10.a
            r10.countDown()
            throw r9
        Laf:
            java.lang.Object r9 = r9.b
            nm4 r9 = (defpackage.nm4) r9
            boolean r10 = r9.L
            if (r10 == 0) goto Lb9
            goto L15e
        Lb9:
            r9.L = r3
            r9.B = r5
            pm4 r10 = r9.Y
            java.lang.Object r0 = r10.d
            monitor-enter(r0)
            java.util.ArrayList r1 = r10.e     // Catch: java.lang.Throwable -> Ld9
            int r2 = r1.size()     // Catch: java.lang.Throwable -> Ld9
            r3 = r5
        Lc9:
            if (r3 >= r2) goto Ldb
            java.lang.Object r4 = r1.get(r3)     // Catch: java.lang.Throwable -> Ld9
            int r3 = r3 + 1
            me.magnum.melonds.ui.emulator.EmulatorSurfaceView r4 = (me.magnum.melonds.ui.emulator.EmulatorSurfaceView) r4     // Catch: java.lang.Throwable -> Ld9
            me.magnum.melonds.ui.emulator.render.GlContext r6 = r10.a     // Catch: java.lang.Throwable -> Ld9
            r4.b(r6)     // Catch: java.lang.Throwable -> Ld9
            goto Lc9
        Ld9:
            r9 = move-exception
            goto L120
        Ldb:
            java.util.ArrayList r1 = r10.f     // Catch: java.lang.Throwable -> Ld9
            int r2 = r1.size()     // Catch: java.lang.Throwable -> Ld9
        Le1:
            if (r5 >= r2) goto Lf1
            java.lang.Object r3 = r1.get(r5)     // Catch: java.lang.Throwable -> Ld9
            int r5 = r5 + 1
            me.magnum.melonds.ui.emulator.EmulatorSurfaceView r3 = (me.magnum.melonds.ui.emulator.EmulatorSurfaceView) r3     // Catch: java.lang.Throwable -> Ld9
            me.magnum.melonds.ui.emulator.render.GlContext r4 = r10.a     // Catch: java.lang.Throwable -> Ld9
            r3.b(r4)     // Catch: java.lang.Throwable -> Ld9
            goto Le1
        Lf1:
            java.util.ArrayList r1 = r10.e     // Catch: java.lang.Throwable -> Ld9
            r1.clear()     // Catch: java.lang.Throwable -> Ld9
            java.util.ArrayList r10 = r10.f     // Catch: java.lang.Throwable -> Ld9
            r10.clear()     // Catch: java.lang.Throwable -> Ld9
            monitor-exit(r0)
            pm4 r10 = r9.Y
            me.magnum.melonds.ui.emulator.render.GlContext r10 = r10.a
            boolean r10 = r10.d()
            if (r10 == 0) goto L10b
            me.magnum.melonds.MelonEmulator r10 = me.magnum.melonds.MelonEmulator.a     // Catch: java.lang.Throwable -> L10b
            r10.releaseOpenGlRetroArchFilter()     // Catch: java.lang.Throwable -> L10b
        L10b:
            pm4 r10 = r9.Y
            me.magnum.melonds.ui.emulator.render.GlContext r10 = r10.a
            android.opengl.EGLDisplay r10 = r10.a
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE
            android.opengl.EGLContext r1 = android.opengl.EGL14.EGL_NO_CONTEXT
            android.opengl.EGL14.eglMakeCurrent(r10, r0, r0, r1)
            pm4 r9 = r9.Y
            me.magnum.melonds.ui.emulator.render.GlContext r9 = r9.a
            r9.b()
            goto L15e
        L120:
            monitor-exit(r0)
            throw r9
        L122:
            java.lang.Object r9 = r9.b
            nm4 r9 = (defpackage.nm4) r9
            pm4 r9 = r9.Y
            java.lang.Object r10 = r9.d
            monitor-enter(r10)
            java.util.ArrayList r0 = r9.f     // Catch: java.lang.Throwable -> L141
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L141
        L131:
            if (r5 >= r1) goto L143
            java.lang.Object r2 = r0.get(r5)     // Catch: java.lang.Throwable -> L141
            int r5 = r5 + 1
            me.magnum.melonds.ui.emulator.EmulatorSurfaceView r2 = (me.magnum.melonds.ui.emulator.EmulatorSurfaceView) r2     // Catch: java.lang.Throwable -> L141
            me.magnum.melonds.ui.emulator.render.GlContext r3 = r9.a     // Catch: java.lang.Throwable -> L141
            r2.b(r3)     // Catch: java.lang.Throwable -> L141
            goto L131
        L141:
            r9 = move-exception
            goto L14a
        L143:
            java.util.ArrayList r9 = r9.f     // Catch: java.lang.Throwable -> L141
            r9.clear()     // Catch: java.lang.Throwable -> L141
            monitor-exit(r10)
            return
        L14a:
            monitor-exit(r10)
            throw r9
        L14c:
            java.lang.Object r9 = r9.b
            nm4 r9 = (defpackage.nm4) r9
            android.os.Bundle r10 = r10.getData()
            java.lang.String r0 = "frame-deadline"
            long r3 = r10.getLong(r0)
            boolean r10 = r9.B
            if (r10 != 0) goto L15f
        L15e:
            return
        L15f:
            pm4 r10 = r9.Y
            java.lang.Object r0 = r10.d
            monitor-enter(r0)
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 <= 0) goto L176
            w83 r1 = r9.R     // Catch: java.lang.Throwable -> L174
            long r1 = r1.A     // Catch: java.lang.Throwable -> L174
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L174
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r2
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L174
            long r1 = r3 - r1
            goto L176
        L174:
            r9 = move-exception
            goto L184
        L176:
            me.magnum.melonds.ui.emulator.render.GlContext r10 = r10.a     // Catch: java.lang.Throwable -> L174
            r10.d()     // Catch: java.lang.Throwable -> L174
            me.magnum.melonds.MelonEmulator r10 = me.magnum.melonds.MelonEmulator.a     // Catch: java.lang.Throwable -> L174
            ap3 r9 = r9.X     // Catch: java.lang.Throwable -> L174
            r10.presentFrame(r1, r9)     // Catch: java.lang.Throwable -> L174
            monitor-exit(r0)
            return
        L184:
            monitor-exit(r0)
            throw r9
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message r13) {
            r12 = this;
            int r0 = r12.a
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 0
            r6 = 1
            switch(r0) {
                case 0: goto L288;
                case 1: goto L25e;
                case 2: goto L25a;
                case 3: goto L24d;
                case 4: goto L1e5;
                default: goto Lb;
            }
        Lb:
            r13.getClass()
            int r0 = r13.what
            switch(r0) {
                case 1: goto L1af;
                case 2: goto L16b;
                case 3: goto L13e;
                case 4: goto L127;
                case 5: goto Lac;
                case 6: goto L15;
                default: goto L13;
            }
        L13:
            goto L1e4
        L15:
            java.lang.Object r12 = r12.b
            tr7 r12 = (defpackage.tr7) r12
            boolean r13 = r12.L
            if (r13 == 0) goto L1f
            goto L1e4
        L1f:
            r12.L = r6
            r12.B = r5
            sk1 r13 = r12.A
            if (r13 == 0) goto L2a
            r13.removeCallbacksAndMessages(r4)
        L2a:
            r12.A = r4
            xr7 r13 = r12.X
            java.lang.Object r1 = r13.c
            monitor-enter(r1)
            java.util.LinkedHashMap r13 = r13.d     // Catch: java.lang.Throwable -> L5e
            java.util.Collection r13 = r13.values()     // Catch: java.lang.Throwable -> L5e
            java.lang.Iterable r13 = (java.lang.Iterable) r13     // Catch: java.lang.Throwable -> L5e
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5e
            r0.<init>()     // Catch: java.lang.Throwable -> L5e
            java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> L5e
        L42:
            boolean r2 = r13.hasNext()     // Catch: java.lang.Throwable -> L5e
            if (r2 == 0) goto L61
            java.lang.Object r2 = r13.next()     // Catch: java.lang.Throwable -> L5e
            ur7 r2 = (defpackage.ur7) r2     // Catch: java.lang.Throwable -> L5e
            int r2 = r2.a     // Catch: java.lang.Throwable -> L5e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L5e
            if (r2 == 0) goto L57
            goto L58
        L57:
            r3 = r4
        L58:
            if (r3 == 0) goto L42
            r0.add(r3)     // Catch: java.lang.Throwable -> L5e
            goto L42
        L5e:
            r0 = move-exception
            r12 = r0
            goto Laa
        L61:
            monitor-exit(r1)
            int r13 = r0.size()
            r1 = r5
        L67:
            if (r1 >= r13) goto L7b
            java.lang.Object r2 = r0.get(r1)
            int r1 = r1 + 1
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            me.magnum.melonds.MelonEmulator r3 = me.magnum.melonds.MelonEmulator.a
            r3.detachVulkanSurface(r2)
            goto L67
        L7b:
            xr7 r12 = r12.X
            java.lang.Object r13 = r12.c
            monitor-enter(r13)
            java.util.LinkedHashMap r0 = r12.d     // Catch: java.lang.Throwable -> L9d
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L9d
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L9d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L9d
        L8c:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L9d
            if (r1 == 0) goto La0
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L9d
            ur7 r1 = (defpackage.ur7) r1     // Catch: java.lang.Throwable -> L9d
            r1.a = r5     // Catch: java.lang.Throwable -> L9d
            r1.e = r4     // Catch: java.lang.Throwable -> L9d
            goto L8c
        L9d:
            r0 = move-exception
            r12 = r0
            goto La8
        La0:
            java.util.LinkedHashMap r12 = r12.e     // Catch: java.lang.Throwable -> L9d
            r12.clear()     // Catch: java.lang.Throwable -> L9d
            monitor-exit(r13)
            goto L1e4
        La8:
            monitor-exit(r13)
            throw r12
        Laa:
            monitor-exit(r1)
            throw r12
        Lac:
            java.lang.Object r12 = r12.b
            tr7 r12 = (defpackage.tr7) r12
            android.os.Bundle r13 = r13.getData()
            java.lang.String r0 = "frame-deadline"
            long r0 = r13.getLong(r0)
            boolean r13 = r12.B
            if (r13 != 0) goto Lc0
            goto L1e4
        Lc0:
            java.lang.Long r13 = java.lang.Long.valueOf(r0)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto Lcb
            r4 = r13
        Lcb:
            if (r4 == 0) goto Ld2
            long r0 = r4.longValue()
            goto Ld3
        Ld2:
            r0 = r2
        Ld3:
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 <= 0) goto Lfb
            wr7 r13 = r12.R
            long r4 = r13.a
            int r13 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r13 <= 0) goto Le7
            r6 = 5
            long r4 = r4 * r6
            r6 = 4
            long r4 = r4 / r6
        Le5:
            r6 = r4
            goto Leb
        Le7:
            r4 = 1000000(0xf4240, double:4.940656E-318)
            goto Le5
        Leb:
            r8 = 500000(0x7a120, double:2.47033E-318)
            r10 = 2000000(0x1e8480, double:9.881313E-318)
            long r4 = defpackage.gi2.s(r6, r8, r10)
            long r4 = r0 - r4
            int r13 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r13 >= 0) goto Lfc
        Lfb:
            r4 = r2
        Lfc:
            long r6 = java.lang.System.nanoTime()
            me.magnum.melonds.MelonEmulator r13 = me.magnum.melonds.MelonEmulator.a
            r13.presentVulkanFrame(r0, r4)
            wr7 r12 = r12.R
            long r0 = java.lang.System.nanoTime()
            long r0 = r0 - r6
            r12.getClass()
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 >= 0) goto L114
            r0 = r2
        L114:
            long r4 = r12.a
            int r13 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r13 != 0) goto L11b
            goto L123
        L11b:
            r2 = 7
            long r4 = r4 * r2
            long r4 = r4 + r0
            r0 = 8
            long r0 = r4 / r0
        L123:
            r12.a = r0
            goto L1e4
        L127:
            java.lang.Object r12 = r12.b
            tr7 r12 = (defpackage.tr7) r12
            int r13 = r13.arg1
            boolean r0 = r12.B
            if (r0 != 0) goto L137
            boolean r12 = r12.L
            if (r12 == 0) goto L137
            goto L1e4
        L137:
            me.magnum.melonds.MelonEmulator r12 = me.magnum.melonds.MelonEmulator.a
            r12.detachVulkanSurface(r13)
            goto L1e4
        L13e:
            java.lang.Object r12 = r12.b
            tr7 r12 = (defpackage.tr7) r12
            java.lang.Object r0 = r13.obj
            r0.getClass()
            me.magnum.melonds.ui.emulator.EmulatorSurfaceView r0 = (me.magnum.melonds.ui.emulator.EmulatorSurfaceView) r0
            android.os.Bundle r1 = r13.getData()
            java.lang.String r2 = "generation"
            int r1 = r1.getInt(r2)
            android.os.Bundle r13 = r13.getData()
            r13.getClass()
            java.lang.String r2 = "background-bitmap"
            java.lang.Class<android.graphics.Bitmap> r3 = android.graphics.Bitmap.class
            java.lang.Object r13 = defpackage.nc1.R(r13, r2, r3)
            android.os.Parcelable r13 = (android.os.Parcelable) r13
            android.graphics.Bitmap r13 = (android.graphics.Bitmap) r13
            defpackage.tr7.b(r12, r0, r1, r13)
            goto L1e4
        L16b:
            java.lang.Object r12 = r12.b
            tr7 r12 = (defpackage.tr7) r12
            java.lang.Object r0 = r13.obj
            r0.getClass()
            me.magnum.melonds.ui.emulator.EmulatorSurfaceView r0 = (me.magnum.melonds.ui.emulator.EmulatorSurfaceView) r0
            android.os.Bundle r1 = r13.getData()
            java.lang.String r2 = "width"
            int r1 = r1.getInt(r2)
            android.os.Bundle r13 = r13.getData()
            java.lang.String r2 = "height"
            int r13 = r13.getInt(r2)
            boolean r2 = r12.B
            if (r2 != 0) goto L18f
            goto L1e4
        L18f:
            xr7 r12 = r12.X
            java.lang.Object r2 = r12.c
            monitor-enter(r2)
            java.util.LinkedHashMap r12 = r12.d     // Catch: java.lang.Throwable -> L1a1
            java.lang.Object r12 = r12.get(r0)     // Catch: java.lang.Throwable -> L1a1
            ur7 r12 = (defpackage.ur7) r12     // Catch: java.lang.Throwable -> L1a1
            if (r12 == 0) goto L1a4
            int r5 = r12.a     // Catch: java.lang.Throwable -> L1a1
            goto L1a4
        L1a1:
            r0 = move-exception
            r12 = r0
            goto L1ad
        L1a4:
            monitor-exit(r2)
            if (r5 == 0) goto L1e4
            me.magnum.melonds.MelonEmulator r12 = me.magnum.melonds.MelonEmulator.a
            r12.resizeVulkanSurface(r5, r1, r13)
            goto L1e4
        L1ad:
            monitor-exit(r2)
            throw r12
        L1af:
            java.lang.Object r12 = r12.b
            tr7 r12 = (defpackage.tr7) r12
            java.lang.Object r0 = r13.obj
            r0.getClass()
            me.magnum.melonds.ui.emulator.EmulatorSurfaceView r0 = (me.magnum.melonds.ui.emulator.EmulatorSurfaceView) r0
            android.os.Bundle r1 = r13.getData()
            r1.getClass()
            java.lang.String r2 = "surface"
            java.lang.Class<android.view.Surface> r3 = android.view.Surface.class
            java.lang.Object r1 = defpackage.nc1.R(r1, r2, r3)
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            android.view.Surface r1 = (android.view.Surface) r1
            android.os.Bundle r2 = r13.getData()
            java.lang.String r3 = "width"
            int r2 = r2.getInt(r3)
            android.os.Bundle r13 = r13.getData()
            java.lang.String r3 = "height"
            int r13 = r13.getInt(r3)
            defpackage.tr7.a(r12, r0, r1, r2, r13)
        L1e4:
            return
        L1e5:
            java.lang.Object r12 = r12.b
            pq6 r12 = (defpackage.pq6) r12
            int r0 = r13.what
            r4 = 1
            if (r0 == 0) goto L247
            if (r0 == r6) goto L241
            if (r0 == r3) goto L22f
            if (r0 == r2) goto L21b
            if (r0 == r1) goto L202
            ow4 r12 = defpackage.sw4.i
            rk1 r0 = new rk1
            r0.<init>(r13, r6)
            r12.post(r0)
            goto L24c
        L202:
            java.lang.Object r13 = r13.obj
            java.lang.Long r13 = (java.lang.Long) r13
            int r0 = r12.k
            int r0 = r0 + r6
            r12.k = r0
            long r0 = r12.e
            long r2 = r13.longValue()
            long r2 = r2 + r0
            r12.e = r2
            int r13 = r12.k
            long r0 = (long) r13
            long r2 = r2 / r0
            r12.h = r2
            goto L24c
        L21b:
            int r13 = r13.arg1
            long r0 = (long) r13
            int r13 = r12.m
            int r13 = r13 + r6
            r12.m = r13
            long r2 = r12.g
            long r2 = r2 + r0
            r12.g = r2
            int r13 = r12.l
            long r0 = (long) r13
            long r2 = r2 / r0
            r12.j = r2
            goto L24c
        L22f:
            int r13 = r13.arg1
            long r0 = (long) r13
            int r13 = r12.l
            int r13 = r13 + r6
            r12.l = r13
            long r2 = r12.f
            long r2 = r2 + r0
            r12.f = r2
            long r0 = (long) r13
            long r2 = r2 / r0
            r12.i = r2
            goto L24c
        L241:
            long r0 = r12.d
            long r0 = r0 + r4
            r12.d = r0
            goto L24c
        L247:
            long r0 = r12.c
            long r0 = r0 + r4
            r12.c = r0
        L24c:
            return
        L24d:
            int r13 = r13.what
            if (r13 == r6) goto L252
            goto L259
        L252:
            java.lang.Object r12 = r12.b
            k15 r12 = (defpackage.k15) r12
            r12.bindPreferences()
        L259:
            return
        L25a:
            r12.a(r13)
            return
        L25e:
            int r0 = r13.what
            r1 = -3
            if (r0 == r1) goto L274
            r1 = -2
            if (r0 == r1) goto L274
            r1 = -1
            if (r0 == r1) goto L274
            if (r0 == r6) goto L26c
            goto L287
        L26c:
            java.lang.Object r12 = r13.obj
            android.content.DialogInterface r12 = (android.content.DialogInterface) r12
            r12.dismiss()
            goto L287
        L274:
            java.lang.Object r0 = r13.obj
            android.content.DialogInterface$OnClickListener r0 = (android.content.DialogInterface.OnClickListener) r0
            java.lang.Object r12 = r12.b
            java.lang.ref.WeakReference r12 = (java.lang.ref.WeakReference) r12
            java.lang.Object r12 = r12.get()
            android.content.DialogInterface r12 = (android.content.DialogInterface) r12
            int r13 = r13.what
            r0.onClick(r12, r13)
        L287:
            return
        L288:
            java.lang.Object r12 = r12.b
            uk1 r12 = (defpackage.uk1) r12
            int r0 = r13.what
            switch(r0) {
                case 1: goto L57d;
                case 2: goto L527;
                case 3: goto L291;
                case 4: goto L4cf;
                case 5: goto L428;
                case 6: goto L41f;
                case 7: goto L3ee;
                case 8: goto L291;
                case 9: goto L375;
                case 10: goto L370;
                case 11: goto L2ea;
                case 12: goto L29d;
                default: goto L291;
            }
        L291:
            ow4 r12 = defpackage.sw4.i
            rk1 r0 = new rk1
            r0.<init>(r13, r5)
            r12.post(r0)
            goto L584
        L29d:
            java.lang.Object r13 = r13.obj
            java.lang.Cloneable r0 = r12.i
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0
            boolean r0 = r0.remove(r13)
            if (r0 != 0) goto L2ab
            goto L584
        L2ab:
            java.lang.Object r0 = r12.h
            java.util.WeakHashMap r0 = (java.util.WeakHashMap) r0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L2b7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d9
            java.lang.Object r1 = r0.next()
            i33 r1 = (defpackage.i33) r1
            i33 r2 = r1.e
            boolean r2 = r2.equals(r13)
            if (r2 == 0) goto L2b7
            if (r4 != 0) goto L2d2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L2d2:
            r4.add(r1)
            r0.remove()
            goto L2b7
        L2d9:
            if (r4 == 0) goto L584
            java.lang.Object r12 = r12.k
            android.os.Handler r12 = (android.os.Handler) r12
            r13 = 13
            android.os.Message r13 = r12.obtainMessage(r13, r4)
            r12.sendMessage(r13)
            goto L584
        L2ea:
            java.lang.Object r13 = r13.obj
            java.lang.Cloneable r0 = r12.i
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0
            java.lang.Object r1 = r12.h
            java.util.WeakHashMap r1 = (java.util.WeakHashMap) r1
            boolean r0 = r0.add(r13)
            if (r0 != 0) goto L2fc
            goto L584
        L2fc:
            java.io.Serializable r12 = r12.f
            java.util.LinkedHashMap r12 = (java.util.LinkedHashMap) r12
            java.util.Collection r12 = r12.values()
            java.util.Iterator r12 = r12.iterator()
        L308:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L584
            java.lang.Object r0 = r12.next()
            v40 r0 = (defpackage.v40) r0
            sw4 r2 = r0.B
            r2.getClass()
            i33 r2 = r0.f0
            java.util.ArrayList r3 = r0.g0
            if (r3 == 0) goto L327
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L327
            r4 = r6
            goto L328
        L327:
            r4 = r5
        L328:
            if (r2 != 0) goto L32d
            if (r4 != 0) goto L32d
            goto L308
        L32d:
            if (r2 == 0) goto L341
            i33 r7 = r2.e
            boolean r7 = r7.equals(r13)
            if (r7 == 0) goto L341
            r0.b(r2)
            java.lang.Object r7 = r2.a()
            r1.put(r7, r2)
        L341:
            if (r4 == 0) goto L366
            int r2 = r3.size()
            int r2 = r2 - r6
        L348:
            if (r2 < 0) goto L366
            java.lang.Object r4 = r3.get(r2)
            i33 r4 = (defpackage.i33) r4
            i33 r7 = r4.e
            boolean r7 = r7.equals(r13)
            if (r7 != 0) goto L359
            goto L363
        L359:
            r0.b(r4)
            java.lang.Object r7 = r4.a()
            r1.put(r7, r4)
        L363:
            int r2 = r2 + (-1)
            goto L348
        L366:
            boolean r0 = r0.a()
            if (r0 == 0) goto L308
            r12.remove()
            goto L308
        L370:
            r12.getClass()
            goto L584
        L375:
            java.lang.Object r13 = r13.obj
            android.net.NetworkInfo r13 = (android.net.NetworkInfo) r13
            java.lang.Object r0 = r12.d
            vw4 r0 = (defpackage.vw4) r0
            java.lang.Object r4 = r12.g
            java.util.WeakHashMap r4 = (java.util.WeakHashMap) r4
            if (r0 == 0) goto L3c0
            if (r13 == 0) goto L3bd
            boolean r7 = r13.isConnectedOrConnecting()
            if (r7 != 0) goto L38c
            goto L3bd
        L38c:
            int r7 = r13.getType()
            if (r7 == 0) goto L3a3
            if (r7 == r6) goto L39f
            r3 = 6
            if (r7 == r3) goto L39f
            r3 = 9
            if (r7 == r3) goto L39f
            r0.e(r2)
            goto L3c0
        L39f:
            r0.e(r1)
            goto L3c0
        L3a3:
            int r1 = r13.getSubtype()
            switch(r1) {
                case 1: goto L3b9;
                case 2: goto L3b9;
                case 3: goto L3b5;
                case 4: goto L3b5;
                case 5: goto L3b5;
                case 6: goto L3b5;
                default: goto L3aa;
            }
        L3aa:
            switch(r1) {
                case 12: goto L3b5;
                case 13: goto L3b1;
                case 14: goto L3b1;
                case 15: goto L3b1;
                default: goto L3ad;
            }
        L3ad:
            r0.e(r2)
            goto L3c0
        L3b1:
            r0.e(r2)
            goto L3c0
        L3b5:
            r0.e(r3)
            goto L3c0
        L3b9:
            r0.e(r6)
            goto L3c0
        L3bd:
            r0.e(r2)
        L3c0:
            if (r13 == 0) goto L584
            boolean r13 = r13.isConnected()
            if (r13 == 0) goto L584
            boolean r13 = r4.isEmpty()
            if (r13 != 0) goto L584
            java.util.Collection r13 = r4.values()
            java.util.Iterator r13 = r13.iterator()
        L3d6:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L584
            java.lang.Object r0 = r13.next()
            i33 r0 = (defpackage.i33) r0
            r13.remove()
            sw4 r1 = r0.a
            r1.getClass()
            r12.e(r0, r5)
            goto L3d6
        L3ee:
            r12.getClass()
            java.io.Serializable r13 = r12.n
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r13)
            r13.clear()
            java.lang.Object r12 = r12.k
            android.os.Handler r12 = (android.os.Handler) r12
            r13 = 8
            android.os.Message r13 = r12.obtainMessage(r13, r0)
            r12.sendMessage(r13)
            boolean r12 = r0.isEmpty()
            if (r12 == 0) goto L412
            goto L584
        L412:
            java.lang.Object r12 = r0.get(r5)
            v40 r12 = (defpackage.v40) r12
            sw4 r12 = r12.B
            r12.getClass()
            goto L584
        L41f:
            java.lang.Object r13 = r13.obj
            v40 r13 = (defpackage.v40) r13
            r12.d(r13, r5)
            goto L584
        L428:
            java.lang.Object r13 = r13.obj
            v40 r13 = (defpackage.v40) r13
            r12.getClass()
            java.lang.Object r0 = r12.g
            java.util.WeakHashMap r0 = (java.util.WeakHashMap) r0
            boolean r1 = r12.b
            java.lang.Object r2 = r12.d
            vw4 r2 = (defpackage.vw4) r2
            java.util.concurrent.Future r3 = r13.i0
            xk5 r7 = r13.e0
            if (r3 == 0) goto L447
            boolean r3 = r3.isCancelled()
            if (r3 == 0) goto L447
            goto L584
        L447:
            boolean r3 = r2.isShutdown()
            if (r3 == 0) goto L452
            r12.d(r13, r5)
            goto L584
        L452:
            if (r1 == 0) goto L466
            java.lang.Object r3 = r12.c
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r4 = "connectivity"
            java.lang.StringBuilder r8 = defpackage.ck7.a
            java.lang.Object r3 = r3.getSystemService(r4)
            android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3
            android.net.NetworkInfo r4 = r3.getActiveNetworkInfo()
        L466:
            int r3 = r13.m0
            if (r3 <= 0) goto L472
            int r3 = r3 - r6
            r13.m0 = r3
            boolean r3 = r7.d(r4)
            goto L473
        L472:
            r3 = r5
        L473:
            if (r3 == 0) goto L491
            sw4 r12 = r13.B
            r12.getClass()
            java.lang.Exception r12 = r13.k0
            boolean r12 = r12 instanceof defpackage.df4
            if (r12 == 0) goto L489
            int r12 = r13.d0
            ze4 r0 = defpackage.ze4.NO_CACHE
            int r0 = r0.index
            r12 = r12 | r0
            r13.d0 = r12
        L489:
            java.util.concurrent.Future r12 = r2.submit(r13)
            r13.i0 = r12
            goto L584
        L491:
            if (r1 == 0) goto L49c
            r7.getClass()
            boolean r1 = r7 instanceof defpackage.ff4
            if (r1 == 0) goto L49c
            r1 = r6
            goto L49d
        L49c:
            r1 = r5
        L49d:
            r12.d(r13, r1)
            if (r1 == 0) goto L584
            i33 r12 = r13.f0
            if (r12 == 0) goto L4b1
            java.lang.Object r1 = r12.a()
            if (r1 == 0) goto L4b1
            r12.f = r6
            r0.put(r1, r12)
        L4b1:
            java.util.ArrayList r12 = r13.g0
            if (r12 == 0) goto L584
            int r13 = r12.size()
        L4b9:
            if (r5 >= r13) goto L584
            java.lang.Object r1 = r12.get(r5)
            i33 r1 = (defpackage.i33) r1
            java.lang.Object r2 = r1.a()
            if (r2 == 0) goto L4cc
            r1.f = r6
            r0.put(r2, r1)
        L4cc:
            int r5 = r5 + 1
            goto L4b9
        L4cf:
            java.lang.Object r13 = r13.obj
            v40 r13 = (defpackage.v40) r13
            r12.getClass()
            r13.getClass()
            java.lang.String r0 = r13.Y
            boolean r1 = defpackage.e44.shouldWriteToMemoryCache(r5)
            if (r1 == 0) goto L517
            java.lang.Object r1 = r12.l
            s63 r1 = (defpackage.s63) r1
            android.graphics.Bitmap r2 = r13.h0
            java.lang.Object r1 = r1.B
            nr1 r1 = (defpackage.nr1) r1
            if (r0 == 0) goto L511
            if (r2 == 0) goto L511
            java.lang.StringBuilder r3 = defpackage.ck7.a
            int r3 = r2.getAllocationByteCount()
            if (r3 < 0) goto L50a
            int r4 = r1.maxSize()
            if (r3 <= r4) goto L501
            r1.remove(r0)
            goto L517
        L501:
            xz3 r4 = new xz3
            r4.<init>(r2, r3)
            r1.put(r0, r4)
            goto L517
        L50a:
            java.lang.String r12 = "Negative size: "
            defpackage.e41.y(r2, r12)
            goto L584
        L511:
            java.lang.String r12 = "key == null || bitmap == null"
            defpackage.u34.x(r12)
            goto L584
        L517:
            java.io.Serializable r1 = r12.f
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            r1.remove(r0)
            r12.a(r13)
            sw4 r12 = r13.B
            r12.getClass()
            goto L584
        L527:
            java.lang.Object r13 = r13.obj
            i33 r13 = (defpackage.i33) r13
            r12.getClass()
            java.io.Serializable r0 = r12.f
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.String r1 = r13.d
            sw4 r2 = r13.a
            java.lang.Object r3 = r0.get(r1)
            v40 r3 = (defpackage.v40) r3
            if (r3 == 0) goto L54d
            r3.b(r13)
            boolean r3 = r3.a()
            if (r3 == 0) goto L54d
            r0.remove(r1)
            r2.getClass()
        L54d:
            java.lang.Cloneable r0 = r12.i
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0
            i33 r1 = r13.e
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L567
            java.lang.Object r0 = r12.h
            java.util.WeakHashMap r0 = (java.util.WeakHashMap) r0
            java.lang.Object r1 = r13.a()
            r0.remove(r1)
            r2.getClass()
        L567:
            java.lang.Object r12 = r12.g
            java.util.WeakHashMap r12 = (java.util.WeakHashMap) r12
            java.lang.Object r13 = r13.a()
            java.lang.Object r12 = r12.remove(r13)
            i33 r12 = (defpackage.i33) r12
            if (r12 == 0) goto L584
            sw4 r12 = r12.a
            r12.getClass()
            goto L584
        L57d:
            java.lang.Object r13 = r13.obj
            i33 r13 = (defpackage.i33) r13
            r12.e(r13, r6)
        L584:
            return
    }
}
