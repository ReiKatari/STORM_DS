package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yk7  reason: default package */
/* loaded from: classes.dex */
public final class yk7 {
    public static final Matrix p = new Matrix();
    public final Path a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final vk7 g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;
    public final wu o;

    /* JADX WARN: Type inference failed for: r0v4, types: [ci6, wu] */
    public yk7(yk7 yk7Var) {
        this.c = new Matrix();
        this.h = RecyclerView.B1;
        this.i = RecyclerView.B1;
        this.j = RecyclerView.B1;
        this.k = RecyclerView.B1;
        this.l = 255;
        this.m = null;
        this.n = null;
        ?? ci6Var = new ci6(0);
        this.o = ci6Var;
        this.g = new vk7(yk7Var.g, ci6Var);
        this.a = new Path(yk7Var.a);
        this.b = new Path(yk7Var.b);
        this.h = yk7Var.h;
        this.i = yk7Var.i;
        this.j = yk7Var.j;
        this.k = yk7Var.k;
        this.l = yk7Var.l;
        this.m = yk7Var.m;
        String str = yk7Var.m;
        if (str != null) {
            ci6Var.put(str, this);
        }
        this.n = yk7Var.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(vk7 vk7Var, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        float f2;
        int i4;
        float f3;
        Path.FillType fillType;
        Path.FillType fillType2;
        Matrix matrix2 = vk7Var.a;
        ArrayList arrayList = vk7Var.b;
        matrix2.set(matrix);
        Matrix matrix3 = vk7Var.a;
        matrix3.preConcat(vk7Var.j);
        canvas.save();
        char c = 0;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            wk7 wk7Var = (wk7) arrayList.get(i5);
            if (wk7Var instanceof vk7) {
                a((vk7) wk7Var, matrix3, canvas, i, i2);
            } else if (wk7Var instanceof xk7) {
                xk7 xk7Var = (xk7) wk7Var;
                float f4 = i / this.j;
                float f5 = i2 / this.k;
                float min = Math.min(f4, f5);
                Matrix matrix4 = this.c;
                matrix4.set(matrix3);
                matrix4.postScale(f4, f5);
                float[] fArr = {RecyclerView.B1, 1.0f, 1.0f, RecyclerView.B1};
                matrix3.mapVectors(fArr);
                boolean z = c;
                i3 = i5;
                float f6 = (fArr[z ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max((float) Math.hypot(fArr[c], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
                if (max > RecyclerView.B1) {
                    f = Math.abs(f6) / max;
                } else {
                    f = 0.0f;
                }
                if (f != RecyclerView.B1) {
                    Path path = this.a;
                    path.reset();
                    iu4[] iu4VarArr = xk7Var.a;
                    if (iu4VarArr != null) {
                        iu4.b(iu4VarArr, path);
                    }
                    Path path2 = this.b;
                    path2.reset();
                    if (xk7Var instanceof tk7) {
                        if (xk7Var.c == 0) {
                            fillType2 = Path.FillType.WINDING;
                        } else {
                            fillType2 = Path.FillType.EVEN_ODD;
                        }
                        path2.setFillType(fillType2);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        uk7 uk7Var = (uk7) xk7Var;
                        float f7 = uk7Var.i;
                        if (f7 != RecyclerView.B1 || uk7Var.j != 1.0f) {
                            float f8 = uk7Var.k;
                            float f9 = (f7 + f8) % 1.0f;
                            float f10 = (uk7Var.j + f8) % 1.0f;
                            if (this.f == null) {
                                this.f = new PathMeasure();
                            }
                            this.f.setPath(path, z);
                            float length = this.f.getLength();
                            float f11 = f9 * length;
                            float f12 = f10 * length;
                            path.reset();
                            int i6 = (f11 > f12 ? 1 : (f11 == f12 ? 0 : -1));
                            PathMeasure pathMeasure = this.f;
                            if (i6 > 0) {
                                pathMeasure.getSegment(f11, length, path, true);
                                PathMeasure pathMeasure2 = this.f;
                                f2 = RecyclerView.B1;
                                pathMeasure2.getSegment(RecyclerView.B1, f12, path, true);
                            } else {
                                f2 = 0.0f;
                                pathMeasure.getSegment(f11, f12, path, true);
                            }
                            path.rLineTo(f2, f2);
                        }
                        path2.addPath(path, matrix4);
                        ei eiVar = uk7Var.f;
                        if (((Shader) eiVar.L) != null || eiVar.B != 0) {
                            if (this.e == null) {
                                i4 = 16777215;
                                Paint paint = new Paint(1);
                                this.e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i4 = 16777215;
                            }
                            Paint paint2 = this.e;
                            Shader shader = (Shader) eiVar.L;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(uk7Var.h * 255.0f));
                                f3 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i7 = eiVar.B;
                                float f13 = uk7Var.h;
                                PorterDuff.Mode mode = bl7.f0;
                                f3 = 255.0f;
                                paint2.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                            }
                            paint2.setColorFilter(null);
                            if (uk7Var.c == 0) {
                                fillType = Path.FillType.WINDING;
                            } else {
                                fillType = Path.FillType.EVEN_ODD;
                            }
                            path2.setFillType(fillType);
                            canvas.drawPath(path2, paint2);
                        } else {
                            f3 = 255.0f;
                            i4 = 16777215;
                        }
                        ei eiVar2 = uk7Var.d;
                        if (((Shader) eiVar2.L) != null || eiVar2.B != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = uk7Var.m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = uk7Var.l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(uk7Var.n);
                            Shader shader2 = (Shader) eiVar2.L;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(uk7Var.g * f3));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i8 = eiVar2.B;
                                float f14 = uk7Var.g;
                                PorterDuff.Mode mode2 = bl7.f0;
                                paint4.setColor((i8 & i4) | (((int) (Color.alpha(i8) * f14)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(uk7Var.e * min * f);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i5 = i3 + 1;
                c = 0;
            }
            i3 = i5;
            i5 = i3 + 1;
            c = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.l = i;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [ci6, wu] */
    public yk7() {
        this.c = new Matrix();
        this.h = RecyclerView.B1;
        this.i = RecyclerView.B1;
        this.j = RecyclerView.B1;
        this.k = RecyclerView.B1;
        this.l = 255;
        this.m = null;
        this.n = null;
        this.o = new ci6(0);
        this.g = new vk7();
        this.a = new Path();
        this.b = new Path();
    }
}
