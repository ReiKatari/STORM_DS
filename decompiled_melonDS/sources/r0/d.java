package r0;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import d0.a0;
import d0.n1;
import d0.r1;
import d1.e2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import k7.w;
import yb.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d implements n, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a  reason: collision with root package name */
    public final e2 f12565a;

    /* renamed from: b  reason: collision with root package name */
    public final HandlerThread f12566b;

    /* renamed from: c  reason: collision with root package name */
    public final l0.d f12567c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f12568d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f12569e;

    /* renamed from: f  reason: collision with root package name */
    public final float[] f12570f;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f12571g;

    /* renamed from: h  reason: collision with root package name */
    public final LinkedHashMap f12572h;

    /* renamed from: i  reason: collision with root package name */
    public int f12573i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f12574j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f12575k;

    public d(a0 a0Var) {
        Map map = Collections.EMPTY_MAP;
        this.f12569e = new AtomicBoolean(false);
        this.f12570f = new float[16];
        this.f12571g = new float[16];
        this.f12572h = new LinkedHashMap();
        this.f12573i = 0;
        this.f12574j = false;
        this.f12575k = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.f12566b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f12568d = handler;
        this.f12567c = new l0.d(handler);
        this.f12565a = new e2();
        try {
            h(a0Var);
        } catch (RuntimeException e6) {
            a();
            throw e6;
        }
    }

    @Override // r0.n
    public final void a() {
        if (this.f12569e.getAndSet(true)) {
            return;
        }
        e(new b(1, this), new b4.l(2));
    }

    @Override // r0.n
    public final void b(m mVar) {
        if (this.f12569e.get()) {
            mVar.close();
            return;
        }
        ad.c cVar = new ad.c(21, this, mVar);
        Objects.requireNonNull(mVar);
        e(cVar, new b(0, mVar));
    }

    @Override // r0.n
    public final void c(r1 r1Var) {
        if (this.f12569e.get()) {
            r1Var.b();
        } else {
            e(new ad.c(22, this, r1Var), new n1(r1Var, 1));
        }
    }

    public final void d() {
        if (this.f12574j && this.f12573i == 0) {
            LinkedHashMap linkedHashMap = this.f12572h;
            for (m mVar : linkedHashMap.keySet()) {
                mVar.close();
            }
            ArrayList arrayList = this.f12575k;
            if (arrayList.size() <= 0) {
                linkedHashMap.clear();
                e2 e2Var = this.f12565a;
                if (((AtomicBoolean) e2Var.L).getAndSet(false)) {
                    t0.i.c((Thread) e2Var.X);
                    e2Var.m();
                }
                this.f12566b.quit();
                return;
            }
            ((a) arrayList.get(0)).getClass();
            new Exception("Failed to snapshot: DefaultSurfaceProcessor is released.");
            throw null;
        }
    }

    public final void e(Runnable runnable, Runnable runnable2) {
        try {
            this.f12567c.execute(new a0.i(this, runnable2, runnable, 11));
        } catch (RejectedExecutionException e6) {
            aj.g.z0("DefaultSurfaceProcessor", "Unable to executor runnable", e6);
            runnable2.run();
        }
    }

    public final void f(Exception exc) {
        ArrayList arrayList = this.f12575k;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            ((a) arrayList.get(0)).getClass();
            throw null;
        }
    }

    public final Bitmap g(Size size, float[] fArr, int i2) {
        boolean z10;
        float[] fArr2 = (float[]) fArr.clone();
        w.C(i2, fArr2);
        w.D(fArr2);
        Size g10 = k0.h.g(size, i2);
        e2 e2Var = this.f12565a;
        e2Var.getClass();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(g10.getHeight() * g10.getWidth() * 4);
        if (allocateDirect.capacity() == g10.getHeight() * g10.getWidth() * 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        p7.m.g("ByteBuffer capacity is not equal to width * height * 4.", z10);
        p7.m.g("ByteBuffer is not direct.", allocateDirect.isDirect());
        int[] iArr = t0.i.f13063a;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        t0.i.b("glGenTextures");
        int i10 = iArr2[0];
        GLES20.glActiveTexture(33985);
        t0.i.b("glActiveTexture");
        GLES20.glBindTexture(3553, i10);
        t0.i.b("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, g10.getWidth(), g10.getHeight(), 0, 6407, 5121, null);
        t0.i.b("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        t0.i.b("glGenFramebuffers");
        int i11 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i11);
        t0.i.b("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i10, 0);
        t0.i.b("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        t0.i.b("glActiveTexture");
        GLES20.glBindTexture(36197, e2Var.B);
        t0.i.b("glBindTexture");
        e2Var.f3562d0 = null;
        GLES20.glViewport(0, 0, g10.getWidth(), g10.getHeight());
        GLES20.glScissor(0, 0, g10.getWidth(), g10.getHeight());
        t0.g gVar = (t0.g) e2Var.f3564f0;
        gVar.getClass();
        if (gVar instanceof t0.h) {
            GLES20.glUniformMatrix4fv(((t0.h) gVar).f13061f, 1, false, fArr2, 0);
            t0.i.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        t0.i.b("glDrawArrays");
        GLES20.glReadPixels(0, 0, g10.getWidth(), g10.getHeight(), 6408, 5121, allocateDirect);
        t0.i.b("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i10}, 0);
        t0.i.b("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i11}, 0);
        t0.i.b("glDeleteFramebuffers");
        int i12 = e2Var.B;
        GLES20.glActiveTexture(33984);
        t0.i.b("glActiveTexture");
        GLES20.glBindTexture(36197, i12);
        t0.i.b("glBindTexture");
        Bitmap createBitmap = Bitmap.createBitmap(g10.getWidth(), g10.getHeight(), Bitmap.Config.ARGB_8888);
        allocateDirect.rewind();
        ImageProcessingUtil.c(createBitmap, allocateDirect, g10.getWidth() * 4);
        return createBitmap;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [b5.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, b5.n] */
    public final void h(a0 a0Var) {
        Map map = Collections.EMPTY_MAP;
        ?? obj = new Object();
        obj.f2053c = new Object();
        b5.l lVar = new b5.l(obj);
        obj.f2052b = lVar;
        obj.f2051a = w.d.class;
        try {
            e(new a0.i(this, a0Var, (b5.i) obj), new b4.l(2));
            obj.f2051a = "Init GlRenderer";
        } catch (Exception e6) {
            lVar.b(e6);
        }
        try {
            lVar.get();
        } catch (InterruptedException | ExecutionException e10) {
            e = e10;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
        }
    }

    public final void i(o oVar) {
        ArrayList arrayList = this.f12575k;
        if (arrayList.isEmpty()) {
            return;
        }
        if (oVar == null) {
            f(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                byteArrayOutputStream.close();
                return;
            }
            ((a) it.next()).getClass();
            Bitmap g10 = g((Size) oVar.B, (float[]) oVar.L, 0);
            byteArrayOutputStream.reset();
            g10.compress(Bitmap.CompressFormat.JPEG, 0, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Objects.requireNonNull(byteArray);
            ImageProcessingUtil.h(byteArray, (Surface) oVar.A);
            throw null;
        } catch (IOException e6) {
            f(e6);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        boolean z10;
        if (!this.f12569e.get()) {
            surfaceTexture.updateTexImage();
            float[] fArr = this.f12570f;
            surfaceTexture.getTransformMatrix(fArr);
            o oVar = null;
            for (Map.Entry entry : this.f12572h.entrySet()) {
                Surface surface = (Surface) entry.getValue();
                m mVar = (m) entry.getKey();
                float[] fArr2 = mVar.X;
                float[] fArr3 = this.f12571g;
                Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
                int i2 = mVar.L;
                if (i2 == 34) {
                    try {
                        this.f12565a.o(surfaceTexture.getTimestamp(), fArr3, surface);
                    } catch (RuntimeException e6) {
                        aj.g.t("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e6);
                    }
                } else {
                    boolean z11 = false;
                    if (i2 == 256) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    p7.m.o("Unsupported format: " + i2, z10);
                    if (oVar == null) {
                        z11 = true;
                    }
                    p7.m.o("Only one JPEG output is supported.", z11);
                    oVar = new o(surface, mVar.R, (float[]) fArr3.clone());
                }
            }
            try {
                i(oVar);
            } catch (RuntimeException e10) {
                f(e10);
            }
        }
    }
}
