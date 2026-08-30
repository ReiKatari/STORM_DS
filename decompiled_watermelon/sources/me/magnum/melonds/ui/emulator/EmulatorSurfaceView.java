package me.magnum.melonds.ui.emulator;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import me.magnum.melonds.ui.emulator.render.GlContext;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class EmulatorSurfaceView extends SurfaceView implements SurfaceHolder.Callback {
    public final Object A;
    public int B;
    public int L;
    public a R;
    public Surface c0;
    public EGLSurface d0;
    public us1 e0;
    public xt1 f0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* loaded from: classes.dex */
    public static final class a {
        private static final /* synthetic */ e12 $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a UNINITIALIZED = new a("UNINITIALIZED", 0);
        public static final a DIRTY = new a("DIRTY", 1);
        public static final a READY = new a("READY", 2);

        private static final /* synthetic */ a[] $values() {
            return new a[]{UNINITIALIZED, DIRTY, READY};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = l.C($values);
        }

        private a(String str, int i) {
        }

        public static e12 getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmulatorSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.A = new Object();
        this.R = a.UNINITIALIZED;
        getHolder().addCallback(this);
    }

    public final boolean a(GlContext glContext) {
        Surface surface = this.c0;
        if (surface == null) {
            return false;
        }
        glContext.getClass();
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(glContext.a, glContext.b, surface, new int[]{12344}, 0);
        if (!b53.x(eglCreateWindowSurface, EGL14.EGL_NO_SURFACE)) {
            eglCreateWindowSurface.getClass();
            this.d0 = eglCreateWindowSurface;
            return true;
        }
        throw new Exception(wh1.g(EGL14.eglGetError(), "Failed to create window surface: "));
    }

    public final void b(GlContext glContext) {
        glContext.getClass();
        synchronized (this.A) {
            EGLSurface eGLSurface = this.d0;
            if (eGLSurface != null) {
                EGL14.eglDestroySurface(glContext.a, eGLSurface);
                this.d0 = null;
            }
        }
    }

    public final Surface getCurrentSurface() {
        Surface surface;
        synchronized (this.A) {
            surface = this.c0;
        }
        return surface;
    }

    public final ti4 getCurrentSurfaceSize() {
        ti4 ti4Var;
        synchronized (this.A) {
            ti4Var = new ti4(Integer.valueOf(this.B), Integer.valueOf(this.L));
        }
        return ti4Var;
    }

    public final void setRenderer(us1 us1Var) {
        us1Var.getClass();
        this.e0 = us1Var;
    }

    public final void setSurfaceLifecycleListener(xt1 xt1Var) {
        synchronized (this.A) {
            this.f0 = xt1Var;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        Surface surface;
        xt1 xt1Var;
        int i4;
        Handler c;
        surfaceHolder.getClass();
        synchronized (this.A) {
            try {
                this.B = i2;
                this.L = i3;
                if (this.R == a.READY) {
                    this.R = a.DIRTY;
                }
                surface = this.c0;
                xt1Var = this.f0;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (surface != null && xt1Var != null) {
            dd7 dd7Var = (dd7) xt1Var;
            if (!dd7Var.g) {
                synchronized (dd7Var.c) {
                    ad7 ad7Var = (ad7) dd7Var.d.get(this);
                    if (ad7Var != null) {
                        i4 = ad7Var.a;
                    } else {
                        i4 = 0;
                    }
                }
                if (i4 == 0) {
                    dd7Var.g(this, surface, i2, i3);
                } else {
                    zc7 zc7Var = dd7Var.f;
                    zc7Var.getClass();
                    if (zc7Var.B && (c = zc7Var.c()) != null) {
                        Message obtainMessage = c.obtainMessage(2, this);
                        obtainMessage.setData(dk7.k(new ti4("width", Integer.valueOf(i2)), new ti4("height", Integer.valueOf(i3))));
                        try {
                            c.sendMessage(obtainMessage);
                        } catch (IllegalStateException unused) {
                            if (zc7Var.A == c) {
                                c.removeCallbacksAndMessages(null);
                                zc7Var.A = null;
                            }
                            obtainMessage.recycle();
                        }
                    }
                }
                dd7Var.f(this);
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        Surface surface;
        xt1 xt1Var;
        surfaceHolder.getClass();
        synchronized (this.A) {
            surface = surfaceHolder.getSurface();
            this.c0 = surface;
            xt1Var = this.f0;
        }
        if (surface != null && xt1Var != null) {
            dd7 dd7Var = (dd7) xt1Var;
            if (!dd7Var.g) {
                ti4 currentSurfaceSize = getCurrentSurfaceSize();
                dd7Var.g(this, surface, ((Number) currentSurfaceSize.A).intValue(), ((Number) currentSurfaceSize.B).intValue());
                dd7Var.f(this);
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        xt1 xt1Var;
        int i;
        surfaceHolder.getClass();
        synchronized (this.A) {
            this.c0 = null;
            xt1Var = this.f0;
        }
        if (xt1Var != null) {
            dd7 dd7Var = (dd7) xt1Var;
            if (!dd7Var.g) {
                synchronized (dd7Var.c) {
                    dd7Var.e.remove(this);
                    ad7 ad7Var = (ad7) dd7Var.d.get(this);
                    if (ad7Var != null) {
                        ad7Var.e = null;
                        i = ad7Var.a;
                    } else {
                        i = 0;
                    }
                }
                dd7Var.f.d(i);
                synchronized (dd7Var.c) {
                    ad7 ad7Var2 = (ad7) dd7Var.d.get(this);
                    if (ad7Var2 != null) {
                        ad7Var2.a = 0;
                        ad7Var2.e = null;
                    }
                }
            }
        }
    }
}
