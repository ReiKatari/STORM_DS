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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sb1  reason: default package */
/* loaded from: classes.dex */
public final class sb1 implements dk6, SurfaceTexture.OnFrameAvailableListener {
    public final pd4 a;
    public final HandlerThread b;
    public final np2 c;
    public final Handler d;
    public final AtomicBoolean e;
    public final float[] f;
    public final float[] g;
    public final LinkedHashMap h;
    public int i;
    public boolean j;
    public final ArrayList k;

    /* JADX WARN: Type inference failed for: r1v11, types: [i90, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [pb5, java.lang.Object] */
    public sb1(sm1 sm1Var) {
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
        this.c = new np2(handler);
        this.a = new pd4();
        try {
            Map map2 = Collections.EMPTY_MAP;
            ?? obj = new Object();
            obj.c = new Object();
            l90 l90Var = new l90(obj);
            obj.b = l90Var;
            obj.a = b31.class;
            try {
                Map map3 = Collections.EMPTY_MAP;
                e(new u(this, sm1Var, (i90) obj), new rd(4));
                obj.a = "Init GlRenderer";
            } catch (Exception e) {
                l90Var.b(e);
            }
            try {
                l90Var.get();
            } catch (InterruptedException | ExecutionException e2) {
                e = e2;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (e instanceof RuntimeException) {
                    throw ((RuntimeException) e);
                }
                throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
            }
        } catch (RuntimeException e3) {
            a();
            throw e3;
        }
    }

    @Override // defpackage.dk6
    public final void a() {
        if (this.e.getAndSet(true)) {
            return;
        }
        e(new m0(18, this), new rd(4));
    }

    @Override // defpackage.dk6
    public final void b(ck6 ck6Var) {
        if (this.e.get()) {
            ck6Var.close();
            return;
        }
        we weVar = new we(16, this, ck6Var);
        Objects.requireNonNull(ck6Var);
        e(weVar, new m0(17, ck6Var));
    }

    @Override // defpackage.dk6
    public final void c(hk6 hk6Var) {
        if (this.e.get()) {
            hk6Var.b();
        } else {
            e(new we(17, this, hk6Var), new qb1(hk6Var, 0));
        }
    }

    public final void d() {
        if (this.j && this.i == 0) {
            LinkedHashMap linkedHashMap = this.h;
            for (ck6 ck6Var : linkedHashMap.keySet()) {
                ck6Var.close();
            }
            ArrayList arrayList = this.k;
            if (arrayList.size() <= 0) {
                linkedHashMap.clear();
                pd4 pd4Var = this.a;
                if (((AtomicBoolean) pd4Var.L).getAndSet(false)) {
                    xj2.c((Thread) pd4Var.X);
                    pd4Var.r();
                }
                this.b.quit();
                return;
            }
            ((vw) arrayList.get(0)).getClass();
            new Exception("Failed to snapshot: DefaultSurfaceProcessor is released.");
            throw null;
        }
    }

    public final void e(Runnable runnable, Runnable runnable2) {
        try {
            this.c.execute(new u(this, runnable2, runnable, 11));
        } catch (RejectedExecutionException e) {
            ve2.d0("DefaultSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    public final void f(Exception exc) {
        ArrayList arrayList = this.k;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            ((vw) arrayList.get(0)).getClass();
            throw null;
        }
    }

    public final Bitmap g(Size size, float[] fArr, int i) {
        boolean z;
        float[] fArr2 = (float[]) fArr.clone();
        ve2.L(i, fArr2);
        ve2.M(fArr2);
        Size g = tw6.g(i, size);
        pd4 pd4Var = this.a;
        pd4Var.getClass();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(g.getHeight() * g.getWidth() * 4);
        if (allocateDirect.capacity() == g.getHeight() * g.getWidth() * 4) {
            z = true;
        } else {
            z = false;
        }
        nl2.y("ByteBuffer capacity is not equal to width * height * 4.", z);
        nl2.y("ByteBuffer is not direct.", allocateDirect.isDirect());
        int[] iArr = xj2.a;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        xj2.b("glGenTextures");
        int i2 = iArr2[0];
        GLES20.glActiveTexture(33985);
        xj2.b("glActiveTexture");
        GLES20.glBindTexture(3553, i2);
        xj2.b("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, g.getWidth(), g.getHeight(), 0, 6407, 5121, null);
        xj2.b("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        xj2.b("glGenFramebuffers");
        int i3 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i3);
        xj2.b("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
        xj2.b("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        xj2.b("glActiveTexture");
        GLES20.glBindTexture(36197, pd4Var.A);
        xj2.b("glBindTexture");
        pd4Var.e0 = null;
        GLES20.glViewport(0, 0, g.getWidth(), g.getHeight());
        GLES20.glScissor(0, 0, g.getWidth(), g.getHeight());
        vj2 vj2Var = (vj2) pd4Var.g0;
        vj2Var.getClass();
        if (vj2Var instanceof wj2) {
            GLES20.glUniformMatrix4fv(((wj2) vj2Var).f, 1, false, fArr2, 0);
            xj2.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        xj2.b("glDrawArrays");
        GLES20.glReadPixels(0, 0, g.getWidth(), g.getHeight(), 6408, 5121, allocateDirect);
        xj2.b("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        xj2.b("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i3}, 0);
        xj2.b("glDeleteFramebuffers");
        int i4 = pd4Var.A;
        GLES20.glActiveTexture(33984);
        xj2.b("glActiveTexture");
        GLES20.glBindTexture(36197, i4);
        xj2.b("glBindTexture");
        Bitmap createBitmap = Bitmap.createBitmap(g.getWidth(), g.getHeight(), Bitmap.Config.ARGB_8888);
        allocateDirect.rewind();
        ImageProcessingUtil.c(createBitmap, allocateDirect, g.getWidth() * 4);
        return createBitmap;
    }

    public final void h(ty6 ty6Var) {
        ArrayList arrayList = this.k;
        if (arrayList.isEmpty()) {
            return;
        }
        if (ty6Var == null) {
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
            ((vw) it.next()).getClass();
            Bitmap g = g((Size) ty6Var.B, (float[]) ty6Var.L, 0);
            byteArrayOutputStream.reset();
            g.compress(Bitmap.CompressFormat.JPEG, 0, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Objects.requireNonNull(byteArray);
            ImageProcessingUtil.h(byteArray, (Surface) ty6Var.A);
            throw null;
        } catch (IOException e) {
            f(e);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        boolean z;
        if (!this.e.get()) {
            surfaceTexture.updateTexImage();
            float[] fArr = this.f;
            surfaceTexture.getTransformMatrix(fArr);
            ty6 ty6Var = null;
            for (Map.Entry entry : this.h.entrySet()) {
                Surface surface = (Surface) entry.getValue();
                ck6 ck6Var = (ck6) entry.getKey();
                float[] fArr2 = ck6Var.X;
                float[] fArr3 = this.g;
                Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
                int i = ck6Var.L;
                if (i == 34) {
                    try {
                        this.a.t(surfaceTexture.getTimestamp(), fArr3, surface);
                    } catch (RuntimeException e) {
                        ve2.x("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e);
                    }
                } else {
                    boolean z2 = false;
                    if (i == 256) {
                        z = true;
                    } else {
                        z = false;
                    }
                    nl2.D("Unsupported format: " + i, z);
                    if (ty6Var == null) {
                        z2 = true;
                    }
                    nl2.D("Only one JPEG output is supported.", z2);
                    ty6Var = new ty6(surface, ck6Var.R, (float[]) fArr3.clone());
                }
            }
            try {
                h(ty6Var);
            } catch (RuntimeException e2) {
                f(e2);
            }
        }
    }
}
