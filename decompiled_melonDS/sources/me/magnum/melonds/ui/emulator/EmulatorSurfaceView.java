package me.magnum.melonds.ui.emulator;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import ih.d;
import me.magnum.melonds.ui.emulator.render.GlContext;
import nc.k;
import q8.r;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class EmulatorSurfaceView extends SurfaceView implements SurfaceHolder.Callback {
    public final Object A;
    public int B;
    public int L;
    public a R;

    /* renamed from: b0  reason: collision with root package name */
    public Surface f9506b0;

    /* renamed from: c0  reason: collision with root package name */
    public EGLSurface f9507c0;

    /* renamed from: d0  reason: collision with root package name */
    public d f9508d0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public static final class a {
        private static final /* synthetic */ fc.a $ENTRIES;
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
            $ENTRIES = r.x($values);
        }

        private a(String str, int i2) {
        }

        public static fc.a getEntries() {
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
        Surface surface = this.f9506b0;
        if (surface == null) {
            return false;
        }
        glContext.getClass();
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(glContext.f9517a, glContext.f9518b, surface, new int[]{12344}, 0);
        if (!k.a(eglCreateWindowSurface, EGL14.EGL_NO_SURFACE)) {
            eglCreateWindowSurface.getClass();
            this.f9507c0 = eglCreateWindowSurface;
            return true;
        }
        throw new Exception(w.d.l(EGL14.eglGetError(), "Failed to create window surface: "));
    }

    public final void b(GlContext glContext) {
        glContext.getClass();
        synchronized (this.A) {
            EGLSurface eGLSurface = this.f9507c0;
            if (eGLSurface != null) {
                EGL14.eglDestroySurface(glContext.f9517a, eGLSurface);
                this.f9507c0 = null;
            }
        }
    }

    public final void setRenderer(d dVar) {
        dVar.getClass();
        this.f9508d0 = dVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i10, int i11) {
        surfaceHolder.getClass();
        synchronized (this.A) {
            this.B = i10;
            this.L = i11;
            if (this.R == a.READY) {
                this.R = a.DIRTY;
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        surfaceHolder.getClass();
        synchronized (this.A) {
            this.f9506b0 = surfaceHolder.getSurface();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        surfaceHolder.getClass();
        synchronized (this.A) {
            this.f9506b0 = null;
        }
    }
}
