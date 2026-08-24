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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wv6  reason: default package */
/* loaded from: classes.dex */
public final class wv6 implements Closeable {
    public final Surface B;
    public final int L;
    public final Size R;
    public final float[] X;
    public final float[] Y;
    public b31 Z;
    public Executor d0;
    public final tb0 g0;
    public final qb0 h0;
    public final Object A = new Object();
    public boolean e0 = false;
    public boolean f0 = false;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, qb0] */
    /* JADX WARN: Type inference failed for: r8v1, types: [hl5, java.lang.Object] */
    public wv6(Surface surface, int i, Size size, zy zyVar, zy zyVar2) {
        float[] fArr = new float[16];
        this.X = fArr;
        float[] fArr2 = new float[16];
        this.Y = fArr2;
        this.B = surface;
        this.L = i;
        this.R = size;
        e(fArr, new float[16], zyVar);
        e(fArr2, new float[16], zyVar2);
        ?? obj = new Object();
        obj.c = new Object();
        tb0 tb0Var = new tb0(obj);
        obj.b = tb0Var;
        try {
            this.h0 = obj;
            obj.a = "SurfaceOutputImpl close future complete";
        } catch (Exception e) {
            tb0Var.b(e);
        }
        this.g0 = tb0Var;
    }

    public static void e(float[] fArr, float[] fArr2, zy zyVar) {
        Matrix.setIdentityM(fArr, 0);
        if (zyVar == null) {
            return;
        }
        Size size = zyVar.a;
        boolean z = zyVar.e;
        int i = zyVar.d;
        kj2.U(fArr);
        kj2.T(i, fArr);
        if (z) {
            Matrix.translateM(fArr, 0, 1.0f, RecyclerView.B1, RecyclerView.B1);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size g = k97.g(i, size);
        android.graphics.Matrix a = k97.a(k97.h(size), k97.h(g), i, z);
        RectF rectF = new RectF(zyVar.b);
        a.mapRect(rectF);
        Matrix.translateM(fArr, 0, rectF.left / g.getWidth(), ((g.getHeight() - rectF.height()) - rectF.top) / g.getHeight(), RecyclerView.B1);
        Matrix.scaleM(fArr, 0, rectF.width() / g.getWidth(), rectF.height() / g.getHeight(), 1.0f);
        eg0 eg0Var = zyVar.c;
        Matrix.setIdentityM(fArr2, 0);
        kj2.U(fArr2);
        if (eg0Var != null) {
            np2.A("Camera has no transform.", eg0Var.o());
            kj2.T(eg0Var.a().b(), fArr2);
            if (eg0Var.c()) {
                Matrix.translateM(fArr2, 0, 1.0f, RecyclerView.B1, RecyclerView.B1);
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
                if (!this.f0) {
                    this.f0 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.h0.a(null);
    }

    public final Surface h(ov2 ov2Var, b31 b31Var) {
        boolean z;
        synchronized (this.A) {
            this.d0 = ov2Var;
            this.Z = b31Var;
            z = this.e0;
        }
        if (z) {
            k();
        }
        return this.B;
    }

    public final void k() {
        Executor executor;
        b31 b31Var;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.A) {
            try {
                if (this.d0 != null && (b31Var = this.Z) != null) {
                    if (!this.f0) {
                        atomicReference.set(b31Var);
                        executor = this.d0;
                        this.e0 = false;
                    }
                    executor = null;
                }
                this.e0 = true;
                executor = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new q64(7, this, atomicReference));
            } catch (RejectedExecutionException e) {
                String c0 = kj2.c0("SurfaceOutputImpl");
                if (kj2.J(3, c0)) {
                    Log.d(c0, "Processor executor closed. Close request not posted.", e);
                }
            }
        }
    }
}
