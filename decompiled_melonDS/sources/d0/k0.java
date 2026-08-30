package d0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class k0 implements j0.c1 {
    public ah.e A;
    public volatile int B;
    public volatile int L;
    public volatile boolean X;
    public volatile boolean Y;
    public Executor Z;

    /* renamed from: b0  reason: collision with root package name */
    public i1 f3414b0;

    /* renamed from: c0  reason: collision with root package name */
    public ImageWriter f3415c0;

    /* renamed from: h0  reason: collision with root package name */
    public ByteBuffer f3420h0;

    /* renamed from: i0  reason: collision with root package name */
    public ByteBuffer f3421i0;

    /* renamed from: j0  reason: collision with root package name */
    public ByteBuffer f3422j0;

    /* renamed from: k0  reason: collision with root package name */
    public ByteBuffer f3423k0;

    /* renamed from: l0  reason: collision with root package name */
    public ByteBuffer f3424l0;

    /* renamed from: m0  reason: collision with root package name */
    public ByteBuffer f3425m0;
    public volatile int R = 1;

    /* renamed from: d0  reason: collision with root package name */
    public Rect f3416d0 = new Rect();

    /* renamed from: e0  reason: collision with root package name */
    public Rect f3417e0 = new Rect();

    /* renamed from: f0  reason: collision with root package name */
    public Matrix f3418f0 = new Matrix();

    /* renamed from: g0  reason: collision with root package name */
    public Matrix f3419g0 = new Matrix();

    /* renamed from: n0  reason: collision with root package name */
    public final Object f3426n0 = new Object();

    /* renamed from: o0  reason: collision with root package name */
    public boolean f3427o0 = true;

    public abstract y0 a(j0.d1 d1Var);

    /* JADX WARN: Can't wrap try/catch for region: R(7:(5:6|7|(1:100)(1:11)|(1:13)|14)|(6:(11:16|(1:18)|19|20|21|22|23|24|25|26|27)|23|24|25|26|27)|98|19|20|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0121, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0122, code lost:
        r14 = r3;
     */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, b5.n] */
    /* JADX WARN: Type inference failed for: r7v2, types: [b5.i, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ta.a b(final d0.y0 r18) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.k0.b(d0.y0):ta.a");
    }

    @Override // j0.c1
    public final void c(j0.d1 d1Var) {
        try {
            y0 a10 = a(d1Var);
            if (a10 != null) {
                f(a10);
            }
        } catch (IllegalStateException e6) {
            aj.g.t("ImageAnalysisAnalyzer", "Failed to acquire image.", e6);
        }
    }

    public abstract void d();

    public final void e(y0 y0Var) {
        if (this.R != 1 && this.R != 3) {
            if (this.R == 2 && this.f3420h0 == null) {
                this.f3420h0 = ByteBuffer.allocateDirect(y0Var.a() * y0Var.c() * 4);
                return;
            }
            return;
        }
        if (this.f3421i0 == null) {
            this.f3421i0 = ByteBuffer.allocateDirect(y0Var.a() * y0Var.c());
        }
        this.f3421i0.position(0);
        if (this.f3422j0 == null) {
            this.f3422j0 = ByteBuffer.allocateDirect((y0Var.a() * y0Var.c()) / 4);
        }
        this.f3422j0.position(0);
        if (this.f3423k0 == null) {
            this.f3423k0 = ByteBuffer.allocateDirect((y0Var.a() * y0Var.c()) / 4);
        }
        this.f3423k0.position(0);
        if (this.R == 3) {
            if (this.f3424l0 == null) {
                this.f3424l0 = ByteBuffer.allocateDirect(y0Var.a() * y0Var.c());
            }
            this.f3424l0.position(0);
            if (this.f3425m0 == null) {
                this.f3425m0 = ByteBuffer.allocateDirect((y0Var.a() * y0Var.c()) / 2);
            }
            this.f3425m0.position(0);
        }
    }

    public abstract void f(y0 y0Var);

    public final void g(int i2, int i10, int i11, int i12) {
        int i13 = this.B;
        Matrix matrix = new Matrix();
        if (i13 > 0) {
            RectF rectF = new RectF(0.0f, 0.0f, i2, i10);
            RectF rectF2 = k0.h.f7951a;
            Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            matrix.postRotate(i13);
            RectF rectF3 = new RectF(0.0f, 0.0f, i11, i12);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(rectF2, rectF3, scaleToFit);
            matrix.postConcat(matrix2);
        }
        RectF rectF4 = new RectF(this.f3416d0);
        matrix.mapRect(rectF4);
        Rect rect = new Rect();
        rectF4.round(rect);
        this.f3417e0 = rect;
        this.f3419g0.setConcat(this.f3418f0, matrix);
    }

    public final void h(y0 y0Var, int i2) {
        boolean z10;
        int i10;
        i1 i1Var = this.f3414b0;
        if (i1Var != null) {
            i1Var.o();
            int c4 = y0Var.c();
            int a10 = y0Var.a();
            int f8 = this.f3414b0.f();
            int n10 = this.f3414b0.n();
            if (i2 != 90 && i2 != 270) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                i10 = a10;
            } else {
                i10 = c4;
            }
            if (!z10) {
                c4 = a10;
            }
            this.f3414b0 = new i1(a.a.n(i10, c4, f8, n10));
            if (this.R == 1) {
                ImageWriter imageWriter = this.f3415c0;
                if (imageWriter != null) {
                    imageWriter.close();
                }
                this.f3415c0 = ImageWriter.newInstance(this.f3414b0.getSurface(), this.f3414b0.n());
            }
        }
    }

    public final void i(Matrix matrix) {
        synchronized (this.f3426n0) {
            this.f3418f0 = matrix;
            this.f3419g0 = new Matrix(this.f3418f0);
        }
    }

    public final void j(Rect rect) {
        synchronized (this.f3426n0) {
            this.f3416d0 = rect;
            this.f3417e0 = new Rect(this.f3416d0);
        }
    }
}
