package me.magnum.melonds.ui.emulator.render;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import w.d;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class GlContext {

    /* renamed from: a  reason: collision with root package name */
    public EGLDisplay f9517a;

    /* renamed from: b  reason: collision with root package name */
    public final EGLConfig f9518b;

    /* renamed from: c  reason: collision with root package name */
    public long f9519c;

    public GlContext(Long l10) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        eglGetDisplay.getClass();
        this.f9517a = eglGetDisplay;
        if (!eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(this.f9517a, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EGL14.eglChooseConfig(this.f9517a, new int[]{12352, 64, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 24, 12326, 8, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    eGLConfig.getClass();
                    this.f9518b = eGLConfig;
                    long createContext = createContext(this.f9517a.getNativeHandle(), eGLConfig.getNativeHandle(), l10.longValue());
                    this.f9519c = createContext;
                    if (createContext != 0) {
                        return;
                    }
                    throw new Exception(d.l(EGL14.eglGetError(), "Failed to create context: "));
                }
                throw new Exception("Unable to choose config");
            }
            throw new Exception("Unable to initialize EGL");
        }
        throw new Exception("No display");
    }

    private final native long createContext(long j2, long j10, long j11);

    private final native void destroyContext(long j2, long j10);

    private final native boolean makeCurrent(long j2, long j10, long j11);

    public final void a() {
        destroyContext(this.f9517a.getNativeHandle(), this.f9519c);
        EGL14.eglTerminate(this.f9517a);
        EGL14.eglReleaseThread();
        EGLDisplay eGLDisplay = EGL14.EGL_NO_DISPLAY;
        eGLDisplay.getClass();
        this.f9517a = eGLDisplay;
        this.f9519c = 0L;
    }

    public final void b(EGLSurface eGLSurface) {
        eGLSurface.getClass();
        if (makeCurrent(this.f9517a.getNativeHandle(), eGLSurface.getNativeHandle(), this.f9519c)) {
            EGL14.eglSwapInterval(this.f9517a, 0);
            return;
        }
        throw new Exception(d.l(EGL14.eglGetError(), "Failed to make current: "));
    }
}
