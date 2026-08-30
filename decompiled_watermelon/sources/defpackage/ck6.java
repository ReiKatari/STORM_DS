package defpackage;

import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ck6  reason: default package */
/* loaded from: classes.dex */
public final class ck6 implements Closeable {
    public final Surface B;
    public final int L;
    public final Size R;
    public final float[] X;
    public final float[] Y;
    public wz0 Z;
    public Executor c0;
    public final l90 f0;
    public final i90 g0;
    public final Object A = new Object();
    public boolean d0 = false;
    public boolean e0 = false;

    /* JADX WARN: Type inference failed for: r7v1, types: [i90, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [pb5, java.lang.Object] */
    public ck6(Surface surface, int i, Size size, kx kxVar, kx kxVar2) {
        float[] fArr = new float[16];
        this.X = fArr;
        float[] fArr2 = new float[16];
        this.Y = fArr2;
        this.B = surface;
        this.L = i;
        this.R = size;
        d(fArr, new float[16], kxVar);
        d(fArr2, new float[16], kxVar2);
        ?? obj = new Object();
        obj.c = new Object();
        l90 l90Var = new l90(obj);
        obj.b = l90Var;
        try {
            this.g0 = obj;
            obj.a = "SurfaceOutputImpl close future complete";
        } catch (Exception e) {
            l90Var.b(e);
        }
        this.f0 = l90Var;
    }

    public static void d(float[] fArr, float[] fArr2, kx kxVar) {
        Matrix.setIdentityM(fArr, 0);
        if (kxVar == null) {
            return;
        }
        Size size = kxVar.a;
        boolean z = kxVar.e;
        int i = kxVar.d;
        ve2.M(fArr);
        ve2.L(i, fArr);
        if (z) {
            Matrix.translateM(fArr, 0, 1.0f, RecyclerView.A1, RecyclerView.A1);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size g = tw6.g(i, size);
        android.graphics.Matrix a = tw6.a(tw6.h(size), tw6.h(g), i, z);
        RectF rectF = new RectF(kxVar.b);
        a.mapRect(rectF);
        Matrix.translateM(fArr, 0, rectF.left / g.getWidth(), ((g.getHeight() - rectF.height()) - rectF.top) / g.getHeight(), RecyclerView.A1);
        Matrix.scaleM(fArr, 0, rectF.width() / g.getWidth(), rectF.height() / g.getHeight(), 1.0f);
        vd0 vd0Var = kxVar.c;
        Matrix.setIdentityM(fArr2, 0);
        ve2.M(fArr2);
        if (vd0Var != null) {
            nl2.D("Camera has no transform.", vd0Var.j());
            ve2.L(vd0Var.b().b(), fArr2);
            if (vd0Var.g()) {
                Matrix.translateM(fArr2, 0, 1.0f, RecyclerView.A1, RecyclerView.A1);
                Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        Matrix.invertM(fArr2, 0, fArr2, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.A) {
            try {
                if (!this.e0) {
                    this.e0 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.g0.a(null);
    }

    public final Surface i(np2 np2Var, wz0 wz0Var) {
        boolean z;
        synchronized (this.A) {
            this.c0 = np2Var;
            this.Z = wz0Var;
            z = this.d0;
        }
        if (z) {
            p();
        }
        return this.B;
    }

    public final void p() {
        Executor executor;
        wz0 wz0Var;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.A) {
            try {
                if (this.c0 != null && (wz0Var = this.Z) != null) {
                    if (!this.e0) {
                        atomicReference.set(wz0Var);
                        executor = this.c0;
                        this.d0 = false;
                    }
                    executor = null;
                }
                this.d0 = true;
                executor = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new xc4(5, this, atomicReference));
            } catch (RejectedExecutionException e) {
                String a0 = ve2.a0("SurfaceOutputImpl");
                if (ve2.G(3, a0)) {
                    Log.d(a0, "Processor executor closed. Close request not posted.", e);
                }
            }
        }
    }
}
