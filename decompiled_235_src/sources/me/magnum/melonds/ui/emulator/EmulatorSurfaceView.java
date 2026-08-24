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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class EmulatorSurfaceView extends SurfaceView implements SurfaceHolder.Callback {
    public final Object A;
    public int B;
    public int L;
    public a R;
    public Surface d0;
    public EGLSurface e0;
    public fx1 f0;
    public iy1 g0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static final class a {
        private static final /* synthetic */ t52 $ENTRIES;
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
            $ENTRIES = nc1.L($values);
        }

        private a(String str, int i) {
        }

        public static t52 getEntries() {
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
        Surface surface = this.d0;
        if (surface == null) {
            return false;
        }
        glContext.getClass();
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(glContext.a, glContext.b, surface, new int[]{12344}, 0);
        if (!nb3.k(eglCreateWindowSurface, EGL14.EGL_NO_SURFACE)) {
            eglCreateWindowSurface.getClass();
            this.e0 = eglCreateWindowSurface;
            return true;
        }
        throw new Exception(lb1.g(EGL14.eglGetError(), "Failed to create window surface: "));
    }

    public final void b(GlContext glContext) {
        glContext.getClass();
        synchronized (this.A) {
            EGLSurface eGLSurface = this.e0;
            if (eGLSurface != null) {
                EGL14.eglDestroySurface(glContext.a, eGLSurface);
                this.e0 = null;
            }
        }
    }

    public final Surface getCurrentSurface() {
        Surface surface;
        synchronized (this.A) {
            surface = this.d0;
        }
        return surface;
    }

    public final vr4 getCurrentSurfaceSize() {
        vr4 vr4Var;
        synchronized (this.A) {
            vr4Var = new vr4(Integer.valueOf(this.B), Integer.valueOf(this.L));
        }
        return vr4Var;
    }

    public final void setRenderer(fx1 fx1Var) {
        fx1Var.getClass();
        this.f0 = fx1Var;
    }

    public final void setSurfaceLifecycleListener(iy1 iy1Var) {
        synchronized (this.A) {
            this.g0 = iy1Var;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        Surface surface;
        iy1 iy1Var;
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
                surface = this.d0;
                iy1Var = this.g0;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (surface != null && iy1Var != null) {
            xr7 xr7Var = (xr7) iy1Var;
            if (!xr7Var.g) {
                synchronized (xr7Var.c) {
                    ur7 ur7Var = (ur7) xr7Var.d.get(this);
                    if (ur7Var != null) {
                        i4 = ur7Var.a;
                    } else {
                        i4 = 0;
                    }
                }
                if (i4 == 0) {
                    xr7Var.g(this, surface, i2, i3);
                } else {
                    tr7 tr7Var = xr7Var.f;
                    tr7Var.getClass();
                    if (tr7Var.B && (c = tr7Var.c()) != null) {
                        Message obtainMessage = c.obtainMessage(2, this);
                        obtainMessage.setData(jw2.l(new vr4("width", Integer.valueOf(i2)), new vr4("height", Integer.valueOf(i3))));
                        try {
                            c.sendMessage(obtainMessage);
                        } catch (IllegalStateException unused) {
                            if (tr7Var.A == c) {
                                c.removeCallbacksAndMessages(null);
                                tr7Var.A = null;
                            }
                            obtainMessage.recycle();
                        }
                    }
                }
                xr7Var.f(this);
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        Surface surface;
        iy1 iy1Var;
        surfaceHolder.getClass();
        synchronized (this.A) {
            surface = surfaceHolder.getSurface();
            this.d0 = surface;
            iy1Var = this.g0;
        }
        if (surface != null && iy1Var != null) {
            xr7 xr7Var = (xr7) iy1Var;
            if (!xr7Var.g) {
                vr4 currentSurfaceSize = getCurrentSurfaceSize();
                xr7Var.g(this, surface, ((Number) currentSurfaceSize.A).intValue(), ((Number) currentSurfaceSize.B).intValue());
                xr7Var.f(this);
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        iy1 iy1Var;
        int i;
        surfaceHolder.getClass();
        synchronized (this.A) {
            this.d0 = null;
            iy1Var = this.g0;
        }
        if (iy1Var != null) {
            xr7 xr7Var = (xr7) iy1Var;
            if (!xr7Var.g) {
                synchronized (xr7Var.c) {
                    xr7Var.e.remove(this);
                    ur7 ur7Var = (ur7) xr7Var.d.get(this);
                    if (ur7Var != null) {
                        ur7Var.e = null;
                        i = ur7Var.a;
                    } else {
                        i = 0;
                    }
                }
                xr7Var.f.d(i);
                synchronized (xr7Var.c) {
                    ur7 ur7Var2 = (ur7) xr7Var.d.get(this);
                    if (ur7Var2 != null) {
                        ur7Var2.a = 0;
                        ur7Var2.e = null;
                    }
                }
            }
        }
    }
}
