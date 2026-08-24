package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.ImageProcessingUtil;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t13  reason: default package */
/* loaded from: classes.dex */
public abstract class t13 implements u23 {
    public h61 A;
    public volatile int B;
    public volatile int L;
    public volatile boolean X;
    public volatile boolean Y;
    public Executor Z;
    public re5 d0;
    public ImageWriter e0;
    public ByteBuffer j0;
    public ByteBuffer k0;
    public ByteBuffer l0;
    public ByteBuffer m0;
    public ByteBuffer n0;
    public ByteBuffer o0;
    public volatile int R = 1;
    public Rect f0 = new Rect();
    public Rect g0 = new Rect();
    public Matrix h0 = new Matrix();
    public Matrix i0 = new Matrix();
    public final Object p0 = new Object();
    public boolean q0 = true;

    public abstract s23 a(v23 v23Var);

    @Override // defpackage.u23
    public final void b(v23 v23Var) {
        try {
            s23 a = a(v23Var);
            if (a != null) {
                f(a);
            }
        } catch (IllegalStateException e) {
            kj2.w("ImageAnalysisAnalyzer", "Failed to acquire image.", e);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(5:6|7|(1:100)(1:11)|(1:13)|14)|(6:(11:16|(1:18)|19|20|21|22|23|24|25|26|27)|23|24|25|26|27)|98|19|20|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0120, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0121, code lost:
        r14 = r3;
     */
    /* JADX WARN: Type inference failed for: r2v6, types: [hl5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, qb0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final gx3 c(final s23 s23Var) {
        int i;
        Object obj;
        Executor executor;
        final h61 h61Var;
        boolean z;
        re5 re5Var;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        ByteBuffer byteBuffer5;
        ByteBuffer byteBuffer6;
        x13 g;
        x13 x13Var;
        boolean z2;
        final x13 x13Var2;
        if (this.X) {
            i = this.B;
        } else {
            i = 0;
        }
        Object obj2 = this.p0;
        synchronized (obj2) {
            try {
                try {
                    executor = this.Z;
                    h61Var = this.A;
                    if (this.X && i != this.L) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        h(s23Var, i);
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (!this.X) {
                        if (this.R == 3) {
                        }
                        re5Var = this.d0;
                        imageWriter = this.e0;
                        byteBuffer = this.j0;
                        byteBuffer2 = this.k0;
                        byteBuffer3 = this.l0;
                        byteBuffer4 = this.m0;
                        byteBuffer5 = this.n0;
                        byteBuffer6 = this.o0;
                    }
                    imageWriter = this.e0;
                    byteBuffer = this.j0;
                    byteBuffer2 = this.k0;
                    byteBuffer3 = this.l0;
                    byteBuffer4 = this.m0;
                    byteBuffer5 = this.n0;
                    byteBuffer6 = this.o0;
                } catch (Throwable th2) {
                    th = th2;
                    obj = obj2;
                    throw th;
                }
                e(s23Var);
                re5Var = this.d0;
            } catch (Throwable th3) {
                th = th3;
                obj = obj2;
            }
        }
        if (h61Var != null && executor != null && this.q0) {
            int i2 = this.R;
            if (re5Var != null) {
                if (i2 == 2) {
                    g = ImageProcessingUtil.b(s23Var, re5Var, byteBuffer, i, this.Y);
                } else {
                    if (this.R == 1) {
                        if (this.Y) {
                            ImageProcessingUtil.a(s23Var);
                        }
                        if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
                            g = ImageProcessingUtil.f(s23Var, re5Var, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i);
                        }
                    }
                    x13Var = null;
                }
                x13Var = g;
            } else {
                if (i2 == 3) {
                    if (this.Y) {
                        ImageProcessingUtil.a(s23Var);
                    }
                    if (byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null && byteBuffer5 != null && byteBuffer6 != null) {
                        g = ImageProcessingUtil.g(s23Var, byteBuffer2, byteBuffer3, byteBuffer4, byteBuffer5, byteBuffer6, i);
                        x13Var = g;
                    }
                }
                x13Var = null;
            }
            if (x13Var == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                x13Var2 = s23Var;
            } else {
                x13Var2 = x13Var;
            }
            final Rect rect = new Rect();
            final Matrix matrix = new Matrix();
            synchronized (this.p0) {
                if (z && !z2) {
                    try {
                        g(s23Var.getWidth(), s23Var.getHeight(), x13Var2.getWidth(), x13Var2.getHeight());
                    } finally {
                    }
                }
                this.L = i;
                rect.set(this.g0);
                matrix.set(this.i0);
            }
            final ?? obj3 = new Object();
            obj3.c = new Object();
            tb0 tb0Var = new tb0(obj3);
            obj3.b = tb0Var;
            obj3.a = i61.class;
            try {
                executor.execute(new Runnable() { // from class: s13
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3;
                        t13 t13Var = t13.this;
                        s23 s23Var2 = s23Var;
                        Matrix matrix2 = matrix;
                        s23 s23Var3 = x13Var2;
                        Rect rect2 = rect;
                        h61 h61Var2 = h61Var;
                        qb0 qb0Var = obj3;
                        if (t13Var.q0) {
                            sy6 a = s23Var2.S().a();
                            long c = s23Var2.S().c();
                            if (t13Var.X) {
                                i3 = 0;
                            } else {
                                i3 = t13Var.B;
                            }
                            ed6 ed6Var = new ed6(s23Var3, null, new ly(a, c, i3, matrix2, s23Var2.S().b()));
                            if (!rect2.isEmpty()) {
                                Rect rect3 = new Rect(rect2);
                                if (!rect3.intersect(0, 0, ed6Var.Y, ed6Var.Z)) {
                                    rect3.setEmpty();
                                }
                                synchronized (ed6Var.R) {
                                }
                            }
                            h61Var2.c(ed6Var);
                            qb0Var.a(null);
                            return;
                        }
                        qb0Var.c(new ug("ImageAnalysis is detached"));
                    }
                });
                obj3.a = "analyzeImage";
                return tb0Var;
            } catch (Exception e) {
                tb0Var.b(e);
                return tb0Var;
            }
        }
        return new n33(new ug("No analyzer or executor currently set."), 1);
    }

    public abstract void d();

    public final void e(s23 s23Var) {
        if (this.R != 1 && this.R != 3) {
            if (this.R == 2 && this.j0 == null) {
                this.j0 = ByteBuffer.allocateDirect(s23Var.getHeight() * s23Var.getWidth() * 4);
                return;
            }
            return;
        }
        if (this.k0 == null) {
            this.k0 = ByteBuffer.allocateDirect(s23Var.getHeight() * s23Var.getWidth());
        }
        this.k0.position(0);
        if (this.l0 == null) {
            this.l0 = ByteBuffer.allocateDirect((s23Var.getHeight() * s23Var.getWidth()) / 4);
        }
        this.l0.position(0);
        if (this.m0 == null) {
            this.m0 = ByteBuffer.allocateDirect((s23Var.getHeight() * s23Var.getWidth()) / 4);
        }
        this.m0.position(0);
        if (this.R == 3) {
            if (this.n0 == null) {
                this.n0 = ByteBuffer.allocateDirect(s23Var.getHeight() * s23Var.getWidth());
            }
            this.n0.position(0);
            if (this.o0 == null) {
                this.o0 = ByteBuffer.allocateDirect((s23Var.getHeight() * s23Var.getWidth()) / 2);
            }
            this.o0.position(0);
        }
    }

    public abstract void f(s23 s23Var);

    public final void g(int i, int i2, int i3, int i4) {
        int i5 = this.B;
        Matrix matrix = new Matrix();
        if (i5 > 0) {
            RectF rectF = new RectF(RecyclerView.B1, RecyclerView.B1, i, i2);
            RectF rectF2 = k97.a;
            Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            matrix.postRotate(i5);
            RectF rectF3 = new RectF(RecyclerView.B1, RecyclerView.B1, i3, i4);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(rectF2, rectF3, scaleToFit);
            matrix.postConcat(matrix2);
        }
        RectF rectF4 = new RectF(this.f0);
        matrix.mapRect(rectF4);
        Rect rect = new Rect();
        rectF4.round(rect);
        this.g0 = rect;
        this.i0.setConcat(this.h0, matrix);
    }

    public final void h(s23 s23Var, int i) {
        boolean z;
        int i2;
        re5 re5Var = this.d0;
        if (re5Var != null) {
            re5Var.i();
            int width = s23Var.getWidth();
            int height = s23Var.getHeight();
            int b = this.d0.b();
            int f = this.d0.f();
            if (i != 90 && i != 270) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i2 = height;
            } else {
                i2 = width;
            }
            if (!z) {
                width = height;
            }
            this.d0 = new re5(ln2.l(i2, width, b, f));
            if (this.R == 1) {
                ImageWriter imageWriter = this.e0;
                if (imageWriter != null) {
                    imageWriter.close();
                }
                this.e0 = ImageWriter.newInstance(this.d0.getSurface(), this.d0.f());
            }
        }
    }

    public final void i(Matrix matrix) {
        synchronized (this.p0) {
            this.h0 = matrix;
            this.i0 = new Matrix(this.h0);
        }
    }

    public final void j(Rect rect) {
        synchronized (this.p0) {
            this.f0 = rect;
            this.g0 = new Rect(this.f0);
        }
    }
}
