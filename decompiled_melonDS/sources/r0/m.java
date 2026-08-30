package r0;

import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import j0.d0;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import k7.w;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m implements Closeable {
    public final Surface B;
    public final int L;
    public final Size R;
    public final float[] X;
    public final float[] Y;
    public z5.a Z;

    /* renamed from: b0  reason: collision with root package name */
    public Executor f12596b0;

    /* renamed from: e0  reason: collision with root package name */
    public final b5.l f12599e0;

    /* renamed from: f0  reason: collision with root package name */
    public final b5.i f12600f0;
    public final Object A = new Object();

    /* renamed from: c0  reason: collision with root package name */
    public boolean f12597c0 = false;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f12598d0 = false;

    /* JADX WARN: Type inference failed for: r7v1, types: [b5.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, b5.n] */
    public m(Surface surface, int i2, Size size, d0.h hVar, d0.h hVar2) {
        float[] fArr = new float[16];
        this.X = fArr;
        float[] fArr2 = new float[16];
        this.Y = fArr2;
        this.B = surface;
        this.L = i2;
        this.R = size;
        d(fArr, new float[16], hVar);
        d(fArr2, new float[16], hVar2);
        ?? obj = new Object();
        obj.f2053c = new Object();
        b5.l lVar = new b5.l(obj);
        obj.f2052b = lVar;
        try {
            this.f12600f0 = obj;
            obj.f2051a = "SurfaceOutputImpl close future complete";
        } catch (Exception e6) {
            lVar.b(e6);
        }
        this.f12599e0 = lVar;
    }

    public static void d(float[] fArr, float[] fArr2, d0.h hVar) {
        Matrix.setIdentityM(fArr, 0);
        if (hVar == null) {
            return;
        }
        Size size = hVar.f3388a;
        boolean z10 = hVar.f3392e;
        int i2 = hVar.f3391d;
        w.D(fArr);
        w.C(i2, fArr);
        if (z10) {
            Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size g10 = k0.h.g(size, i2);
        android.graphics.Matrix a10 = k0.h.a(k0.h.h(size), k0.h.h(g10), i2, z10);
        RectF rectF = new RectF(hVar.f3389b);
        a10.mapRect(rectF);
        Matrix.translateM(fArr, 0, rectF.left / g10.getWidth(), ((g10.getHeight() - rectF.height()) - rectF.top) / g10.getHeight(), 0.0f);
        Matrix.scaleM(fArr, 0, rectF.width() / g10.getWidth(), rectF.height() / g10.getHeight(), 1.0f);
        d0 d0Var = hVar.f3390c;
        Matrix.setIdentityM(fArr2, 0);
        w.D(fArr2);
        if (d0Var != null) {
            p7.m.o("Camera has no transform.", d0Var.i());
            w.C(d0Var.b().b(), fArr2);
            if (d0Var.f()) {
                Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
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
                if (!this.f12598d0) {
                    this.f12598d0 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f12600f0.b(null);
    }

    public final Surface i(l0.d dVar, z5.a aVar) {
        boolean z10;
        synchronized (this.A) {
            this.f12596b0 = dVar;
            this.Z = aVar;
            z10 = this.f12597c0;
        }
        if (z10) {
            m();
        }
        return this.B;
    }

    public final void m() {
        Executor executor;
        z5.a aVar;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.A) {
            try {
                if (this.f12596b0 != null && (aVar = this.Z) != null) {
                    if (!this.f12598d0) {
                        atomicReference.set(aVar);
                        executor = this.f12596b0;
                        this.f12597c0 = false;
                    }
                    executor = null;
                }
                this.f12597c0 = true;
                executor = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new ad.c(23, this, atomicReference));
            } catch (RejectedExecutionException e6) {
                aj.g.p("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e6);
            }
        }
    }
}
