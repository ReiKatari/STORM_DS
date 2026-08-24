package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qf1  reason: default package */
/* loaded from: classes.dex */
public final class qf1 implements xv6, SurfaceTexture.OnFrameAvailableListener {
    public final qm4 a;
    public final HandlerThread b;
    public final ov2 c;
    public final Handler d;
    public final AtomicBoolean e;
    public final float[] f;
    public final float[] g;
    public final LinkedHashMap h;
    public int i;
    public boolean j;
    public final ArrayList k;

    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, qb0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [hl5, java.lang.Object] */
    public qf1(yq1 yq1Var) {
        Map map = Collections.EMPTY_MAP;
        this.e = new AtomicBoolean(false);
        this.f = new float[16];
        this.g = new float[16];
        this.h = new LinkedHashMap();
        this.i = 0;
        this.j = false;
        this.k = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.d = handler;
        this.c = new ov2(handler);
        this.a = new qm4();
        try {
            Map map2 = Collections.EMPTY_MAP;
            ?? obj = new Object();
            obj.c = new Object();
            tb0 tb0Var = new tb0(obj);
            obj.b = tb0Var;
            obj.a = i61.class;
            try {
                Map map3 = Collections.EMPTY_MAP;
                d(new v(this, yq1Var, (qb0) obj), new ge(4));
                obj.a = "Init GlRenderer";
            } catch (Exception e) {
                tb0Var.b(e);
            }
            try {
                tb0Var.get();
            } catch (InterruptedException | ExecutionException e2) {
                e = e2;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (e instanceof RuntimeException) {
                    throw ((RuntimeException) e);
                }
                throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
            }
        } catch (RuntimeException e3) {
            release();
            throw e3;
        }
    }

    @Override // defpackage.xv6
    public final void a(bw6 bw6Var) {
        if (this.e.get()) {
            bw6Var.b();
        } else {
            d(new mf(17, this, bw6Var), new of1(bw6Var, 0));
        }
    }

    @Override // defpackage.xv6
    public final void b(wv6 wv6Var) {
        if (this.e.get()) {
            wv6Var.close();
            return;
        }
        mf mfVar = new mf(16, this, wv6Var);
        Objects.requireNonNull(wv6Var);
        d(mfVar, new n0(wv6Var, 17));
    }

    public final void c() {
        if (this.j && this.i == 0) {
            LinkedHashMap linkedHashMap = this.h;
            for (wv6 wv6Var : linkedHashMap.keySet()) {
                wv6Var.close();
            }
            ArrayList arrayList = this.k;
            if (arrayList.size() <= 0) {
                linkedHashMap.clear();
                qm4 qm4Var = this.a;
                if (((AtomicBoolean) qm4Var.L).getAndSet(false)) {
                    bp2.c((Thread) qm4Var.X);
                    qm4Var.n();
                }
                this.b.quit();
                return;
            }
            ((zx) arrayList.get(0)).getClass();
            new Exception("Failed to snapshot: DefaultSurfaceProcessor is released.");
            throw null;
        }
    }

    public final void d(Runnable runnable, Runnable runnable2) {
        try {
            this.c.execute(new v(this, runnable2, runnable, 12));
        } catch (RejectedExecutionException e) {
            kj2.g0("DefaultSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    public final void e(Exception exc) {
        ArrayList arrayList = this.k;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            ((zx) arrayList.get(0)).getClass();
            throw null;
        }
    }

    public final Bitmap f(Size size, float[] fArr, int i) {
        boolean z;
        float[] fArr2 = (float[]) fArr.clone();
        kj2.T(i, fArr2);
        kj2.U(fArr2);
        Size g = k97.g(i, size);
        qm4 qm4Var = this.a;
        qm4Var.getClass();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(g.getHeight() * g.getWidth() * 4);
        if (allocateDirect.capacity() == g.getHeight() * g.getWidth() * 4) {
            z = true;
        } else {
            z = false;
        }
        np2.s("ByteBuffer capacity is not equal to width * height * 4.", z);
        np2.s("ByteBuffer is not direct.", allocateDirect.isDirect());
        int[] iArr = bp2.a;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        bp2.b("glGenTextures");
        int i2 = iArr2[0];
        GLES20.glActiveTexture(33985);
        bp2.b("glActiveTexture");
        GLES20.glBindTexture(3553, i2);
        bp2.b("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, g.getWidth(), g.getHeight(), 0, 6407, 5121, null);
        bp2.b("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        bp2.b("glGenFramebuffers");
        int i3 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i3);
        bp2.b("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
        bp2.b("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        bp2.b("glActiveTexture");
        GLES20.glBindTexture(36197, qm4Var.A);
        bp2.b("glBindTexture");
        qm4Var.f0 = null;
        GLES20.glViewport(0, 0, g.getWidth(), g.getHeight());
        GLES20.glScissor(0, 0, g.getWidth(), g.getHeight());
        zo2 zo2Var = (zo2) qm4Var.h0;
        zo2Var.getClass();
        if (zo2Var instanceof ap2) {
            GLES20.glUniformMatrix4fv(((ap2) zo2Var).f, 1, false, fArr2, 0);
            bp2.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        bp2.b("glDrawArrays");
        GLES20.glReadPixels(0, 0, g.getWidth(), g.getHeight(), 6408, 5121, allocateDirect);
        bp2.b("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        bp2.b("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i3}, 0);
        bp2.b("glDeleteFramebuffers");
        int i4 = qm4Var.A;
        GLES20.glActiveTexture(33984);
        bp2.b("glActiveTexture");
        GLES20.glBindTexture(36197, i4);
        bp2.b("glBindTexture");
        Bitmap createBitmap = Bitmap.createBitmap(g.getWidth(), g.getHeight(), Bitmap.Config.ARGB_8888);
        allocateDirect.rewind();
        ImageProcessingUtil.c(createBitmap, allocateDirect, g.getWidth() * 4);
        return createBitmap;
    }

    public final void g(oc7 oc7Var) {
        ArrayList arrayList = this.k;
        if (arrayList.isEmpty()) {
            return;
        }
        if (oc7Var == null) {
            e(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                byteArrayOutputStream.close();
                return;
            }
            ((zx) it.next()).getClass();
            Bitmap f = f((Size) oc7Var.B, (float[]) oc7Var.L, 0);
            byteArrayOutputStream.reset();
            f.compress(Bitmap.CompressFormat.JPEG, 0, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Objects.requireNonNull(byteArray);
            ImageProcessingUtil.h(byteArray, (Surface) oc7Var.A);
            throw null;
        } catch (IOException e) {
            e(e);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        boolean z;
        if (!this.e.get()) {
            surfaceTexture.updateTexImage();
            float[] fArr = this.f;
            surfaceTexture.getTransformMatrix(fArr);
            oc7 oc7Var = null;
            for (Map.Entry entry : this.h.entrySet()) {
                Surface surface = (Surface) entry.getValue();
                wv6 wv6Var = (wv6) entry.getKey();
                float[] fArr2 = wv6Var.X;
                float[] fArr3 = this.g;
                Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
                int i = wv6Var.L;
                if (i == 34) {
                    try {
                        this.a.t(surfaceTexture.getTimestamp(), fArr3, surface);
                    } catch (RuntimeException e) {
                        kj2.w("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e);
                    }
                } else {
                    boolean z2 = false;
                    if (i == 256) {
                        z = true;
                    } else {
                        z = false;
                    }
                    np2.A("Unsupported format: " + i, z);
                    if (oc7Var == null) {
                        z2 = true;
                    }
                    np2.A("Only one JPEG output is supported.", z2);
                    oc7Var = new oc7(surface, wv6Var.R, (float[]) fArr3.clone());
                }
            }
            try {
                g(oc7Var);
            } catch (RuntimeException e2) {
                e(e2);
            }
        }
    }

    @Override // defpackage.xv6
    public final void release() {
        if (this.e.getAndSet(true)) {
            return;
        }
        d(new n0(this, 18), new ge(4));
    }
}
