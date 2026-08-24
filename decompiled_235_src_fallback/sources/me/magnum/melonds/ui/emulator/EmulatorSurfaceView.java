package me.magnum.melonds.ui.emulator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class EmulatorSurfaceView extends android.view.SurfaceView implements android.view.SurfaceHolder.Callback {
    public final java.lang.Object A;
    public int B;
    public int L;
    public me.magnum.melonds.ui.emulator.EmulatorSurfaceView.a R;
    public android.view.Surface d0;
    public android.opengl.EGLSurface e0;
    public defpackage.fx1 f0;
    public defpackage.iy1 g0;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public enum a extends java.lang.Enum {
        private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
        private static final /* synthetic */ me.magnum.melonds.ui.emulator.EmulatorSurfaceView.a[] $VALUES = null;
        public static final me.magnum.melonds.ui.emulator.EmulatorSurfaceView.a DIRTY = null;
        public static final me.magnum.melonds.ui.emulator.EmulatorSurfaceView.a READY = null;
        public static final me.magnum.melonds.ui.emulator.EmulatorSurfaceView.a UNINITIALIZED = null;

        private static final /* synthetic */ me.magnum.melonds.ui.emulator.EmulatorSurfaceView.a[] $values() {
                me.magnum.melonds.ui.emulator.EmulatorSurfaceView$a r0 = me.magnum.melonds.ui.emulator.EmulatorSurfaceView.a.UNINITIALIZED
                me.magnum.melonds.ui.emulator.EmulatorSurfaceView$a r1 = me.magnum.melonds.ui.emulator.EmulatorSurfaceView.a.DIRTY
                me.magnum.melonds.ui.emulator.EmulatorSurfaceView$a r2 = me.magnum.melonds.ui.emulator.EmulatorSurfaceView.a.READY
                me.magnum.melonds.ui.emulator.EmulatorSurfaceView$a[] r0 = new me.magnum.melonds.ui.emulator.EmulatorSurfaceView.a[]{r0, r1, r2}
                return r0
        }

        static {
                me.magnum.melonds.ui.emulator.EmulatorSurfaceView$a r0 = new me.magnum.melonds.ui.emulator.EmulatorSurfaceView$a
                java.lang.String r1 = "UNINITIALIZED"
                r2 = 0
                r0.<init>(r1, r2)
                me.magnum.melonds.ui.emulator.EmulatorSurfaceView.a.UNINITIALIZED = r0
                me.magnum.melonds.ui.emulator.EmulatorSurfaceView$a r0 = new me.magnum.melonds.ui.emulator.EmulatorSurfaceView$a
                java.lang.String r1 = "DIRTY"
                r2 = 1
                r0.<init>(r1, r2)
                me.magnum.melonds.ui.emulator.EmulatorSurfaceView.a.DIRTY = r0
                me.magnum.melonds.ui.emulator.EmulatorSurfaceView$a r0 = new me.magnum.melonds.ui.emulator.EmulatorSurfaceView$a
                java.lang.String r1 = "READY"
                r2 = 2
                r0.<init>(r1, r2)
                me.magnum.melonds.ui.emulator.EmulatorSurfaceView.a.READY = r0
                me.magnum.melonds.ui.emulator.EmulatorSurfaceView$a[] r0 = $values()
                me.magnum.melonds.ui.emulator.EmulatorSurfaceView.a.$VALUES = r0
                u52 r0 = defpackage.nc1.L(r0)
                me.magnum.melonds.ui.emulator.EmulatorSurfaceView.a.$ENTRIES = r0
                return
        }

        a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static defpackage.t52 getEntries() {
                t52 r0 = me.magnum.melonds.ui.emulator.EmulatorSurfaceView.a.$ENTRIES
                return r0
        }

        public static me.magnum.melonds.ui.emulator.EmulatorSurfaceView.a valueOf(java.lang.String r1) {
                java.lang.Class<me.magnum.melonds.ui.emulator.EmulatorSurfaceView$a> r0 = me.magnum.melonds.ui.emulator.EmulatorSurfaceView.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                me.magnum.melonds.ui.emulator.EmulatorSurfaceView$a r1 = (me.magnum.melonds.ui.emulator.EmulatorSurfaceView.a) r1
                return r1
        }

        public static me.magnum.melonds.ui.emulator.EmulatorSurfaceView.a[] values() {
                me.magnum.melonds.ui.emulator.EmulatorSurfaceView$a[] r0 = me.magnum.melonds.ui.emulator.EmulatorSurfaceView.a.$VALUES
                java.lang.Object r0 = r0.clone()
                me.magnum.melonds.ui.emulator.EmulatorSurfaceView$a[] r0 = (me.magnum.melonds.ui.emulator.EmulatorSurfaceView.a[]) r0
                return r0
        }
    }

    public EmulatorSurfaceView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r1.getClass()
            r0.<init>(r1, r2)
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.A = r1
            me.magnum.melonds.ui.emulator.EmulatorSurfaceView$a r1 = me.magnum.melonds.ui.emulator.EmulatorSurfaceView.a.UNINITIALIZED
            r0.R = r1
            android.view.SurfaceHolder r1 = r0.getHolder()
            r1.addCallback(r0)
            return
    }

    public final boolean a(me.magnum.melonds.ui.emulator.render.GlContext r5) {
            r4 = this;
            android.view.Surface r0 = r4.d0
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r5.getClass()
            android.opengl.EGLDisplay r2 = r5.a
            android.opengl.EGLConfig r5 = r5.b
            r3 = 12344(0x3038, float:1.7298E-41)
            int[] r3 = new int[]{r3}
            android.opengl.EGLSurface r5 = android.opengl.EGL14.eglCreateWindowSurface(r2, r5, r0, r3, r1)
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE
            boolean r0 = defpackage.nb3.k(r5, r0)
            if (r0 != 0) goto L26
            r5.getClass()
            r4.e0 = r5
            r4 = 1
            return r4
        L26:
            se0 r4 = new se0
            int r5 = android.opengl.EGL14.eglGetError()
            java.lang.String r0 = "Failed to create window surface: "
            java.lang.String r5 = defpackage.lb1.g(r5, r0)
            r4.<init>(r5)
            throw r4
    }

    public final void b(me.magnum.melonds.ui.emulator.render.GlContext r3) {
            r2 = this;
            r3.getClass()
            java.lang.Object r0 = r2.A
            monitor-enter(r0)
            android.opengl.EGLSurface r1 = r2.e0     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L15
            android.opengl.EGLDisplay r3 = r3.a     // Catch: java.lang.Throwable -> L13
            android.opengl.EGL14.eglDestroySurface(r3, r1)     // Catch: java.lang.Throwable -> L13
            r3 = 0
            r2.e0 = r3     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)
            return
        L17:
            monitor-exit(r0)
            throw r2
    }

    public final android.view.Surface getCurrentSurface() {
            r1 = this;
            java.lang.Object r0 = r1.A
            monitor-enter(r0)
            android.view.Surface r1 = r1.d0     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final defpackage.vr4 getCurrentSurfaceSize() {
            r3 = this;
            java.lang.Object r0 = r3.A
            monitor-enter(r0)
            int r1 = r3.B     // Catch: java.lang.Throwable -> L16
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L16
            int r3 = r3.L     // Catch: java.lang.Throwable -> L16
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L16
            vr4 r2 = new vr4     // Catch: java.lang.Throwable -> L16
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            return r2
        L16:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    public final void setRenderer(defpackage.fx1 r1) {
            r0 = this;
            r1.getClass()
            r0.f0 = r1
            return
    }

    public final void setSurfaceLifecycleListener(defpackage.iy1 r2) {
            r1 = this;
            java.lang.Object r0 = r1.A
            monitor-enter(r0)
            r1.g0 = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return
        L7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(android.view.SurfaceHolder r5, int r6, int r7, int r8) {
            r4 = this;
            r5.getClass()
            java.lang.Object r5 = r4.A
            monitor-enter(r5)
            r4.B = r7     // Catch: java.lang.Throwable -> L15
            r4.L = r8     // Catch: java.lang.Throwable -> L15
            me.magnum.melonds.ui.emulator.EmulatorSurfaceView$a r6 = r4.R     // Catch: java.lang.Throwable -> L15
            me.magnum.melonds.ui.emulator.EmulatorSurfaceView$a r0 = me.magnum.melonds.ui.emulator.EmulatorSurfaceView.a.READY     // Catch: java.lang.Throwable -> L15
            if (r6 != r0) goto L18
            me.magnum.melonds.ui.emulator.EmulatorSurfaceView$a r6 = me.magnum.melonds.ui.emulator.EmulatorSurfaceView.a.DIRTY     // Catch: java.lang.Throwable -> L15
            r4.R = r6     // Catch: java.lang.Throwable -> L15
            goto L18
        L15:
            r4 = move-exception
            goto L91
        L18:
            android.view.Surface r6 = r4.d0     // Catch: java.lang.Throwable -> L15
            iy1 r0 = r4.g0     // Catch: java.lang.Throwable -> L15
            monitor-exit(r5)
            if (r6 == 0) goto L90
            if (r0 == 0) goto L90
            xr7 r0 = (defpackage.xr7) r0
            boolean r5 = r0.g
            if (r5 == 0) goto L28
            goto L90
        L28:
            java.lang.Object r5 = r0.c
            monitor-enter(r5)
            java.util.LinkedHashMap r1 = r0.d     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L38
            ur7 r1 = (defpackage.ur7) r1     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L3a
            int r1 = r1.a     // Catch: java.lang.Throwable -> L38
            goto L3b
        L38:
            r4 = move-exception
            goto L8e
        L3a:
            r1 = 0
        L3b:
            monitor-exit(r5)
            if (r1 != 0) goto L42
            r0.g(r4, r6, r7, r8)
            goto L8a
        L42:
            tr7 r5 = r0.f
            r5.getClass()
            boolean r6 = r5.B
            if (r6 != 0) goto L4c
            goto L8a
        L4c:
            android.os.Handler r6 = r5.c()
            if (r6 != 0) goto L53
            goto L8a
        L53:
            r1 = 2
            android.os.Message r1 = r6.obtainMessage(r1, r4)
            java.lang.String r2 = "width"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            vr4 r3 = new vr4
            r3.<init>(r2, r7)
            java.lang.String r7 = "height"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            vr4 r2 = new vr4
            r2.<init>(r7, r8)
            vr4[] r7 = new defpackage.vr4[]{r3, r2}
            android.os.Bundle r7 = defpackage.jw2.l(r7)
            r1.setData(r7)
            r6.sendMessage(r1)     // Catch: java.lang.IllegalStateException -> L7d
            goto L8a
        L7d:
            sk1 r7 = r5.A
            if (r7 != r6) goto L87
            r7 = 0
            r6.removeCallbacksAndMessages(r7)
            r5.A = r7
        L87:
            r1.recycle()
        L8a:
            r0.f(r4)
            goto L90
        L8e:
            monitor-exit(r5)
            throw r4
        L90:
            return
        L91:
            monitor-exit(r5)
            throw r4
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(android.view.SurfaceHolder r4) {
            r3 = this;
            r4.getClass()
            java.lang.Object r0 = r3.A
            monitor-enter(r0)
            android.view.Surface r4 = r4.getSurface()     // Catch: java.lang.Throwable -> L35
            r3.d0 = r4     // Catch: java.lang.Throwable -> L35
            iy1 r1 = r3.g0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r0)
            if (r4 == 0) goto L34
            if (r1 == 0) goto L34
            xr7 r1 = (defpackage.xr7) r1
            boolean r0 = r1.g
            if (r0 == 0) goto L1a
            goto L34
        L1a:
            vr4 r0 = r3.getCurrentSurfaceSize()
            java.lang.Object r2 = r0.A
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.B
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1.g(r3, r4, r2, r0)
            r1.f(r3)
        L34:
            return
        L35:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(android.view.SurfaceHolder r5) {
            r4 = this;
            r5.getClass()
            java.lang.Object r5 = r4.A
            monitor-enter(r5)
            r0 = 0
            r4.d0 = r0     // Catch: java.lang.Throwable -> L51
            iy1 r1 = r4.g0     // Catch: java.lang.Throwable -> L51
            monitor-exit(r5)
            if (r1 == 0) goto L50
            xr7 r1 = (defpackage.xr7) r1
            boolean r5 = r1.g
            if (r5 == 0) goto L15
            goto L50
        L15:
            java.lang.Object r5 = r1.c
            monitor-enter(r5)
            java.util.LinkedHashMap r2 = r1.e     // Catch: java.lang.Throwable -> L2d
            r2.remove(r4)     // Catch: java.lang.Throwable -> L2d
            java.util.LinkedHashMap r2 = r1.d     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.Throwable -> L2d
            ur7 r2 = (defpackage.ur7) r2     // Catch: java.lang.Throwable -> L2d
            r3 = 0
            if (r2 == 0) goto L2f
            r2.e = r0     // Catch: java.lang.Throwable -> L2d
            int r2 = r2.a     // Catch: java.lang.Throwable -> L2d
            goto L30
        L2d:
            r4 = move-exception
            goto L4e
        L2f:
            r2 = r3
        L30:
            monitor-exit(r5)
            tr7 r5 = r1.f
            r5.d(r2)
            java.lang.Object r5 = r1.c
            monitor-enter(r5)
            java.util.LinkedHashMap r1 = r1.d     // Catch: java.lang.Throwable -> L48
            java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Throwable -> L48
            ur7 r4 = (defpackage.ur7) r4     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L4a
            r4.a = r3     // Catch: java.lang.Throwable -> L48
            r4.e = r0     // Catch: java.lang.Throwable -> L48
            goto L4a
        L48:
            r4 = move-exception
            goto L4c
        L4a:
            monitor-exit(r5)
            return
        L4c:
            monitor-exit(r5)
            throw r4
        L4e:
            monitor-exit(r5)
            throw r4
        L50:
            return
        L51:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
    }
}
