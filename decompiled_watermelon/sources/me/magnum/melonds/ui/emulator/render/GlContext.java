package me.magnum.melonds.ui.emulator.render;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class GlContext {
    public EGLDisplay a;
    public final EGLConfig b;
    public long c;
    public EGLSurface d;
    public boolean e;

    public GlContext(Long l) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        eglGetDisplay.getClass();
        this.a = eglGetDisplay;
        if (!eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(this.a, iArr, 0, iArr, 1)) {
                EGLConfig a = a(5);
                if (a != null || (a = a(4)) != null) {
                    this.b = a;
                    long createContext = createContext(this.a.getNativeHandle(), a.getNativeHandle(), l.longValue());
                    this.c = createContext;
                    if (createContext != 0) {
                        return;
                    }
                    throw new Exception(wh1.g(EGL14.eglGetError(), "Failed to create context: "));
                }
                throw new Exception("Unable to choose config");
            }
            throw new Exception("Unable to initialize EGL");
        }
        throw new Exception("No display");
    }

    private final native long createContext(long j, long j2, long j3);

    private final native void destroyContext(long j, long j2);

    private final native boolean makeCurrent(long j, long j2, long j3);

    public final EGLConfig a(int i) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        if (!EGL14.eglChooseConfig(this.a, new int[]{12352, 64, 12339, i, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 24, 12326, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr, 0) || iArr[0] < 1) {
            return null;
        }
        return eGLConfigArr[0];
    }

    public final void b() {
        EGLSurface eGLSurface = this.d;
        if (eGLSurface != null) {
            EGL14.eglDestroySurface(this.a, eGLSurface);
        }
        this.d = null;
        destroyContext(this.a.getNativeHandle(), this.c);
        EGL14.eglTerminate(this.a);
        EGL14.eglReleaseThread();
        EGLDisplay eGLDisplay = EGL14.EGL_NO_DISPLAY;
        eGLDisplay.getClass();
        this.a = eGLDisplay;
        this.c = 0L;
    }

    public final void c(EGLSurface eGLSurface) {
        eGLSurface.getClass();
        if (makeCurrent(this.a.getNativeHandle(), eGLSurface.getNativeHandle(), this.c)) {
            EGL14.eglSwapInterval(this.a, 0);
            return;
        }
        throw new Exception(wh1.g(EGL14.eglGetError(), "Failed to make current: "));
    }

    public final boolean d() {
        if (this.e) {
            return makeCurrent(this.a.getNativeHandle(), 0L, this.c);
        }
        EGLSurface eGLSurface = this.d;
        if (eGLSurface == null) {
            eGLSurface = EGL14.eglCreatePbufferSurface(this.a, this.b, new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eGLSurface != null && !eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
                this.d = eGLSurface;
            } else {
                eGLSurface = null;
            }
        }
        if (eGLSurface == null) {
            this.e = true;
            return makeCurrent(this.a.getNativeHandle(), 0L, this.c);
        }
        return makeCurrent(this.a.getNativeHandle(), eGLSurface.getNativeHandle(), this.c);
    }
}
