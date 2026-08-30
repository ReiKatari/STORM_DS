package d8;

import a1.w0;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import c8.c0;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: p  reason: collision with root package name */
    public static final Matrix f3982p = new Matrix();

    /* renamed from: a  reason: collision with root package name */
    public final Path f3983a;

    /* renamed from: b  reason: collision with root package name */
    public final Path f3984b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f3985c;

    /* renamed from: d  reason: collision with root package name */
    public Paint f3986d;

    /* renamed from: e  reason: collision with root package name */
    public Paint f3987e;

    /* renamed from: f  reason: collision with root package name */
    public PathMeasure f3988f;

    /* renamed from: g  reason: collision with root package name */
    public final j f3989g;

    /* renamed from: h  reason: collision with root package name */
    public float f3990h;

    /* renamed from: i  reason: collision with root package name */
    public float f3991i;

    /* renamed from: j  reason: collision with root package name */
    public float f3992j;

    /* renamed from: k  reason: collision with root package name */
    public float f3993k;

    /* renamed from: l  reason: collision with root package name */
    public int f3994l;
    public String m;

    /* renamed from: n  reason: collision with root package name */
    public Boolean f3995n;

    /* renamed from: o  reason: collision with root package name */
    public final a1.e f3996o;

    /* JADX WARN: Type inference failed for: r0v4, types: [a1.w0, a1.e] */
    public m(m mVar) {
        this.f3985c = new Matrix();
        this.f3990h = 0.0f;
        this.f3991i = 0.0f;
        this.f3992j = 0.0f;
        this.f3993k = 0.0f;
        this.f3994l = 255;
        this.m = null;
        this.f3995n = null;
        ?? w0Var = new w0(0);
        this.f3996o = w0Var;
        this.f3989g = new j(mVar.f3989g, w0Var);
        this.f3983a = new Path(mVar.f3983a);
        this.f3984b = new Path(mVar.f3984b);
        this.f3990h = mVar.f3990h;
        this.f3991i = mVar.f3991i;
        this.f3992j = mVar.f3992j;
        this.f3993k = mVar.f3993k;
        this.f3994l = mVar.f3994l;
        this.m = mVar.m;
        String str = mVar.m;
        if (str != null) {
            w0Var.put(str, this);
        }
        this.f3995n = mVar.f3995n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(j jVar, Matrix matrix, Canvas canvas, int i2, int i10) {
        int i11;
        float f8;
        float f10;
        int i12;
        float f11;
        Path.FillType fillType;
        Path.FillType fillType2;
        Matrix matrix2 = jVar.f3968a;
        ArrayList arrayList = jVar.f3969b;
        matrix2.set(matrix);
        Matrix matrix3 = jVar.f3968a;
        matrix3.preConcat(jVar.f3977j);
        canvas.save();
        char c4 = 0;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            k kVar = (k) arrayList.get(i13);
            if (kVar instanceof j) {
                a((j) kVar, matrix3, canvas, i2, i10);
            } else if (kVar instanceof l) {
                l lVar = (l) kVar;
                float f12 = i2 / this.f3992j;
                float f13 = i10 / this.f3993k;
                float min = Math.min(f12, f13);
                Matrix matrix4 = this.f3985c;
                matrix4.set(matrix3);
                matrix4.postScale(f12, f13);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                boolean z10 = c4;
                i11 = i13;
                float f14 = (fArr[z10 ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max((float) Math.hypot(fArr[c4], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
                if (max > 0.0f) {
                    f8 = Math.abs(f14) / max;
                } else {
                    f8 = 0.0f;
                }
                if (f8 != 0.0f) {
                    Path path = this.f3983a;
                    path.reset();
                    q5.d[] dVarArr = lVar.f3979a;
                    if (dVarArr != null) {
                        q5.d.b(dVarArr, path);
                    }
                    Path path2 = this.f3984b;
                    path2.reset();
                    if (lVar instanceof h) {
                        if (lVar.f3981c == 0) {
                            fillType2 = Path.FillType.WINDING;
                        } else {
                            fillType2 = Path.FillType.EVEN_ODD;
                        }
                        path2.setFillType(fillType2);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        i iVar = (i) lVar;
                        float f15 = iVar.f3963i;
                        if (f15 != 0.0f || iVar.f3964j != 1.0f) {
                            float f16 = iVar.f3965k;
                            float f17 = (f15 + f16) % 1.0f;
                            float f18 = (iVar.f3964j + f16) % 1.0f;
                            if (this.f3988f == null) {
                                this.f3988f = new PathMeasure();
                            }
                            this.f3988f.setPath(path, z10);
                            float length = this.f3988f.getLength();
                            float f19 = f17 * length;
                            float f20 = f18 * length;
                            path.reset();
                            int i14 = (f19 > f20 ? 1 : (f19 == f20 ? 0 : -1));
                            PathMeasure pathMeasure = this.f3988f;
                            if (i14 > 0) {
                                pathMeasure.getSegment(f19, length, path, true);
                                f10 = 0.0f;
                                this.f3988f.getSegment(0.0f, f20, path, true);
                            } else {
                                f10 = 0.0f;
                                pathMeasure.getSegment(f19, f20, path, true);
                            }
                            path.rLineTo(f10, f10);
                        }
                        path2.addPath(path, matrix4);
                        c0 c0Var = iVar.f3960f;
                        if (((Shader) c0Var.f2625c) != null || c0Var.f2624b != 0) {
                            if (this.f3987e == null) {
                                i12 = 16777215;
                                Paint paint = new Paint(1);
                                this.f3987e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i12 = 16777215;
                            }
                            Paint paint2 = this.f3987e;
                            Shader shader = (Shader) c0Var.f2625c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(iVar.f3962h * 255.0f));
                                f11 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i15 = c0Var.f2624b;
                                float f21 = iVar.f3962h;
                                PorterDuff.Mode mode = p.f4010d0;
                                f11 = 255.0f;
                                paint2.setColor((i15 & i12) | (((int) (Color.alpha(i15) * f21)) << 24));
                            }
                            paint2.setColorFilter(null);
                            if (iVar.f3981c == 0) {
                                fillType = Path.FillType.WINDING;
                            } else {
                                fillType = Path.FillType.EVEN_ODD;
                            }
                            path2.setFillType(fillType);
                            canvas.drawPath(path2, paint2);
                        } else {
                            f11 = 255.0f;
                            i12 = 16777215;
                        }
                        c0 c0Var2 = iVar.f3958d;
                        if (((Shader) c0Var2.f2625c) != null || c0Var2.f2624b != 0) {
                            if (this.f3986d == null) {
                                Paint paint3 = new Paint(1);
                                this.f3986d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f3986d;
                            Paint.Join join = iVar.m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = iVar.f3966l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(iVar.f3967n);
                            Shader shader2 = (Shader) c0Var2.f2625c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(iVar.f3961g * f11));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i16 = c0Var2.f2624b;
                                float f22 = iVar.f3961g;
                                PorterDuff.Mode mode2 = p.f4010d0;
                                paint4.setColor((i16 & i12) | (((int) (Color.alpha(i16) * f22)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(iVar.f3959e * min * f8);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i13 = i11 + 1;
                c4 = 0;
            }
            i11 = i13;
            i13 = i11 + 1;
            c4 = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f3994l;
    }

    public void setAlpha(float f8) {
        setRootAlpha((int) (f8 * 255.0f));
    }

    public void setRootAlpha(int i2) {
        this.f3994l = i2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [a1.w0, a1.e] */
    public m() {
        this.f3985c = new Matrix();
        this.f3990h = 0.0f;
        this.f3991i = 0.0f;
        this.f3992j = 0.0f;
        this.f3993k = 0.0f;
        this.f3994l = 255;
        this.m = null;
        this.f3995n = null;
        this.f3996o = new w0(0);
        this.f3989g = new j();
        this.f3983a = new Path();
        this.f3984b = new Path();
    }
}
