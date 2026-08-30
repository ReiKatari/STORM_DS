package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pv2  reason: default package */
/* loaded from: classes.dex */
public abstract class pv2 implements qw2 {
    public a31 A;
    public volatile int B;
    public volatile int L;
    public volatile boolean X;
    public volatile boolean Y;
    public Executor Z;
    public e55 c0;
    public ImageWriter d0;
    public ByteBuffer i0;
    public ByteBuffer j0;
    public ByteBuffer k0;
    public ByteBuffer l0;
    public ByteBuffer m0;
    public ByteBuffer n0;
    public volatile int R = 1;
    public Rect e0 = new Rect();
    public Rect f0 = new Rect();
    public Matrix g0 = new Matrix();
    public Matrix h0 = new Matrix();
    public final Object o0 = new Object();
    public boolean p0 = true;

    public abstract ow2 a(rw2 rw2Var);

    @Override // defpackage.qw2
    public final void b(rw2 rw2Var) {
        try {
            ow2 a = a(rw2Var);
            if (a != null) {
                f(a);
            }
        } catch (IllegalStateException e) {
            ve2.x("ImageAnalysisAnalyzer", "Failed to acquire image.", e);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(5:6|7|(1:100)(1:11)|(1:13)|14)|(6:(11:16|(1:18)|19|20|21|22|23|24|25|26|27)|23|24|25|26|27)|98|19|20|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0120, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0121, code lost:
        r14 = r3;
     */
    /* JADX WARN: Type inference failed for: r2v6, types: [pb5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [i90, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fq3 c(final defpackage.ow2 r18) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pv2.c(ow2):fq3");
    }

    public abstract void d();

    public final void e(ow2 ow2Var) {
        if (this.R != 1 && this.R != 3) {
            if (this.R == 2 && this.i0 == null) {
                this.i0 = ByteBuffer.allocateDirect(ow2Var.a() * ow2Var.c() * 4);
                return;
            }
            return;
        }
        if (this.j0 == null) {
            this.j0 = ByteBuffer.allocateDirect(ow2Var.a() * ow2Var.c());
        }
        this.j0.position(0);
        if (this.k0 == null) {
            this.k0 = ByteBuffer.allocateDirect((ow2Var.a() * ow2Var.c()) / 4);
        }
        this.k0.position(0);
        if (this.l0 == null) {
            this.l0 = ByteBuffer.allocateDirect((ow2Var.a() * ow2Var.c()) / 4);
        }
        this.l0.position(0);
        if (this.R == 3) {
            if (this.m0 == null) {
                this.m0 = ByteBuffer.allocateDirect(ow2Var.a() * ow2Var.c());
            }
            this.m0.position(0);
            if (this.n0 == null) {
                this.n0 = ByteBuffer.allocateDirect((ow2Var.a() * ow2Var.c()) / 2);
            }
            this.n0.position(0);
        }
    }

    public abstract void f(ow2 ow2Var);

    public final void g(int i, int i2, int i3, int i4) {
        int i5 = this.B;
        Matrix matrix = new Matrix();
        if (i5 > 0) {
            RectF rectF = new RectF(RecyclerView.A1, RecyclerView.A1, i, i2);
            RectF rectF2 = tw6.a;
            Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            matrix.postRotate(i5);
            RectF rectF3 = new RectF(RecyclerView.A1, RecyclerView.A1, i3, i4);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(rectF2, rectF3, scaleToFit);
            matrix.postConcat(matrix2);
        }
        RectF rectF4 = new RectF(this.e0);
        matrix.mapRect(rectF4);
        Rect rect = new Rect();
        rectF4.round(rect);
        this.f0 = rect;
        this.h0.setConcat(this.g0, matrix);
    }

    public final void h(ow2 ow2Var, int i) {
        boolean z;
        int i2;
        e55 e55Var = this.c0;
        if (e55Var != null) {
            e55Var.j();
            int c = ow2Var.c();
            int a = ow2Var.a();
            int d = this.c0.d();
            int n = this.c0.n();
            if (i != 90 && i != 270) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i2 = a;
            } else {
                i2 = c;
            }
            if (!z) {
                c = a;
            }
            this.c0 = new e55(mj2.q(i2, c, d, n));
            if (this.R == 1) {
                ImageWriter imageWriter = this.d0;
                if (imageWriter != null) {
                    imageWriter.close();
                }
                this.d0 = ImageWriter.newInstance(this.c0.getSurface(), this.c0.n());
            }
        }
    }

    public final void i(Matrix matrix) {
        synchronized (this.o0) {
            this.g0 = matrix;
            this.h0 = new Matrix(this.g0);
        }
    }

    public final void j(Rect rect) {
        synchronized (this.o0) {
            this.e0 = rect;
            this.f0 = new Rect(this.e0);
        }
    }
}
