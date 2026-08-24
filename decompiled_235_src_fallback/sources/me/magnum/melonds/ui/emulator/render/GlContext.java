package me.magnum.melonds.ui.emulator.render;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class GlContext {
    public android.opengl.EGLDisplay a;
    public final android.opengl.EGLConfig b;
    public long c;
    public android.opengl.EGLSurface d;
    public boolean e;

    public GlContext(java.lang.Long r10) {
            r9 = this;
            r9.<init>()
            r0 = 0
            android.opengl.EGLDisplay r1 = android.opengl.EGL14.eglGetDisplay(r0)
            r1.getClass()
            r9.a = r1
            android.opengl.EGLDisplay r2 = android.opengl.EGL14.EGL_NO_DISPLAY
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L6e
            r1 = 2
            int[] r1 = new int[r1]
            android.opengl.EGLDisplay r2 = r9.a
            r3 = 1
            boolean r0 = android.opengl.EGL14.eglInitialize(r2, r1, r0, r1, r3)
            if (r0 == 0) goto L66
            r0 = 5
            android.opengl.EGLConfig r0 = r9.a(r0)
            if (r0 == 0) goto L29
            goto L30
        L29:
            r0 = 4
            android.opengl.EGLConfig r0 = r9.a(r0)
            if (r0 == 0) goto L5e
        L30:
            r9.b = r0
            android.opengl.EGLDisplay r1 = r9.a
            long r3 = r1.getNativeHandle()
            long r5 = r0.getNativeHandle()
            long r7 = r10.longValue()
            r2 = r9
            long r9 = r2.createContext(r3, r5, r7)
            r2.c = r9
            r0 = 0
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 == 0) goto L4e
            return
        L4e:
            se0 r9 = new se0
            int r10 = android.opengl.EGL14.eglGetError()
            java.lang.String r0 = "Failed to create context: "
            java.lang.String r10 = defpackage.lb1.g(r10, r0)
            r9.<init>(r10)
            throw r9
        L5e:
            se0 r9 = new se0
            java.lang.String r10 = "Unable to choose config"
            r9.<init>(r10)
            throw r9
        L66:
            se0 r9 = new se0
            java.lang.String r10 = "Unable to initialize EGL"
            r9.<init>(r10)
            throw r9
        L6e:
            se0 r9 = new se0
            java.lang.String r10 = "No display"
            r9.<init>(r10)
            throw r9
    }

    private final native long createContext(long r1, long r3, long r5);

    private final native void destroyContext(long r1, long r3);

    private final native boolean makeCurrent(long r1, long r3, long r5);

    public final android.opengl.EGLConfig a(int r27) {
            r26 = this;
            r16 = 8
            r17 = 12344(0x3038, float:1.7298E-41)
            r1 = 12352(0x3040, float:1.7309E-41)
            r2 = 64
            r3 = 12339(0x3033, float:1.729E-41)
            r5 = 12324(0x3024, float:1.727E-41)
            r6 = 8
            r7 = 12323(0x3023, float:1.7268E-41)
            r8 = 8
            r9 = 12322(0x3022, float:1.7267E-41)
            r10 = 8
            r11 = 12321(0x3021, float:1.7265E-41)
            r12 = 8
            r13 = 12325(0x3025, float:1.7271E-41)
            r14 = 24
            r15 = 12326(0x3026, float:1.7272E-41)
            r4 = r27
            int[] r19 = new int[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17}
            r0 = 1
            android.opengl.EGLConfig[] r1 = new android.opengl.EGLConfig[r0]
            int[] r2 = new int[r0]
            r3 = r26
            android.opengl.EGLDisplay r3 = r3.a
            r23 = 1
            r25 = 0
            r20 = 0
            r22 = 0
            r21 = r1
            r24 = r2
            r18 = r3
            boolean r1 = android.opengl.EGL14.eglChooseConfig(r18, r19, r20, r21, r22, r23, r24, r25)
            if (r1 != 0) goto L44
            goto L49
        L44:
            r1 = 0
            r2 = r24[r1]
            if (r2 >= r0) goto L4b
        L49:
            r0 = 0
            return r0
        L4b:
            r0 = r21[r1]
            return r0
    }

    public final void b() {
            r4 = this;
            android.opengl.EGLSurface r0 = r4.d
            if (r0 == 0) goto L9
            android.opengl.EGLDisplay r1 = r4.a
            android.opengl.EGL14.eglDestroySurface(r1, r0)
        L9:
            r0 = 0
            r4.d = r0
            android.opengl.EGLDisplay r0 = r4.a
            long r0 = r0.getNativeHandle()
            long r2 = r4.c
            r4.destroyContext(r0, r2)
            android.opengl.EGLDisplay r0 = r4.a
            android.opengl.EGL14.eglTerminate(r0)
            android.opengl.EGL14.eglReleaseThread()
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.EGL_NO_DISPLAY
            r0.getClass()
            r4.a = r0
            r0 = 0
            r4.c = r0
            return
    }

    public final void c(android.opengl.EGLSurface r9) {
            r8 = this;
            r9.getClass()
            android.opengl.EGLDisplay r0 = r8.a
            long r2 = r0.getNativeHandle()
            long r4 = r9.getNativeHandle()
            long r6 = r8.c
            r1 = r8
            boolean r8 = r1.makeCurrent(r2, r4, r6)
            if (r8 == 0) goto L1d
            android.opengl.EGLDisplay r8 = r1.a
            r9 = 0
            android.opengl.EGL14.eglSwapInterval(r8, r9)
            return
        L1d:
            se0 r8 = new se0
            int r9 = android.opengl.EGL14.eglGetError()
            java.lang.String r0 = "Failed to make current: "
            java.lang.String r9 = defpackage.lb1.g(r9, r0)
            r8.<init>(r9)
            throw r8
    }

    public final boolean d() {
            r8 = this;
            boolean r0 = r8.e
            if (r0 == 0) goto L14
            android.opengl.EGLDisplay r0 = r8.a
            long r2 = r0.getNativeHandle()
            r4 = 0
            long r6 = r8.c
            r1 = r8
            boolean r8 = r1.makeCurrent(r2, r4, r6)
            return r8
        L14:
            r0 = r8
            android.opengl.EGLSurface r8 = r0.d
            r1 = 1
            if (r8 != 0) goto L3c
            r8 = 12374(0x3056, float:1.734E-41)
            r2 = 12344(0x3038, float:1.7298E-41)
            r3 = 12375(0x3057, float:1.7341E-41)
            int[] r8 = new int[]{r3, r1, r8, r1, r2}
            android.opengl.EGLDisplay r2 = r0.a
            android.opengl.EGLConfig r3 = r0.b
            r4 = 0
            android.opengl.EGLSurface r8 = android.opengl.EGL14.eglCreatePbufferSurface(r2, r3, r8, r4)
            if (r8 == 0) goto L3b
            android.opengl.EGLSurface r2 = android.opengl.EGL14.EGL_NO_SURFACE
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L38
            goto L3b
        L38:
            r0.d = r8
            goto L3c
        L3b:
            r8 = 0
        L3c:
            if (r8 != 0) goto L4f
            r0.e = r1
            android.opengl.EGLDisplay r8 = r0.a
            long r1 = r8.getNativeHandle()
            r3 = 0
            long r5 = r0.c
            boolean r8 = r0.makeCurrent(r1, r3, r5)
            return r8
        L4f:
            android.opengl.EGLDisplay r1 = r0.a
            long r1 = r1.getNativeHandle()
            long r3 = r8.getNativeHandle()
            long r5 = r0.c
            boolean r8 = r0.makeCurrent(r1, r3, r5)
            return r8
    }
}
