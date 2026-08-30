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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: z67  reason: default package */
/* loaded from: classes.dex */
public final class z67 {
    public static final Matrix p = new Matrix();
    public final Path a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final w67 g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;
    public final eu o;

    /* JADX WARN: Type inference failed for: r0v4, types: [eu, m66] */
    public z67(z67 z67Var) {
        this.c = new Matrix();
        this.h = RecyclerView.A1;
        this.i = RecyclerView.A1;
        this.j = RecyclerView.A1;
        this.k = RecyclerView.A1;
        this.l = 255;
        this.m = null;
        this.n = null;
        ?? m66Var = new m66(0);
        this.o = m66Var;
        this.g = new w67(z67Var.g, m66Var);
        this.a = new Path(z67Var.a);
        this.b = new Path(z67Var.b);
        this.h = z67Var.h;
        this.i = z67Var.i;
        this.j = z67Var.j;
        this.k = z67Var.k;
        this.l = z67Var.l;
        this.m = z67Var.m;
        String str = z67Var.m;
        if (str != null) {
            m66Var.put(str, this);
        }
        this.n = z67Var.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(w67 w67Var, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        float f2;
        int i4;
        float f3;
        Path.FillType fillType;
        Path.FillType fillType2;
        Matrix matrix2 = w67Var.a;
        ArrayList arrayList = w67Var.b;
        matrix2.set(matrix);
        Matrix matrix3 = w67Var.a;
        matrix3.preConcat(w67Var.j);
        canvas.save();
        char c = 0;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            x67 x67Var = (x67) arrayList.get(i5);
            if (x67Var instanceof w67) {
                a((w67) x67Var, matrix3, canvas, i, i2);
            } else if (x67Var instanceof y67) {
                y67 y67Var = (y67) x67Var;
                float f4 = i / this.j;
                float f5 = i2 / this.k;
                float min = Math.min(f4, f5);
                Matrix matrix4 = this.c;
                matrix4.set(matrix3);
                matrix4.postScale(f4, f5);
                float[] fArr = {RecyclerView.A1, 1.0f, 1.0f, RecyclerView.A1};
                matrix3.mapVectors(fArr);
                boolean z = c;
                i3 = i5;
                float f6 = (fArr[z ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max((float) Math.hypot(fArr[c], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
                if (max > RecyclerView.A1) {
                    f = Math.abs(f6) / max;
                } else {
                    f = 0.0f;
                }
                if (f != RecyclerView.A1) {
                    Path path = this.a;
                    path.reset();
                    gl4[] gl4VarArr = y67Var.a;
                    if (gl4VarArr != null) {
                        gl4.b(gl4VarArr, path);
                    }
                    Path path2 = this.b;
                    path2.reset();
                    if (y67Var instanceof u67) {
                        if (y67Var.c == 0) {
                            fillType2 = Path.FillType.WINDING;
                        } else {
                            fillType2 = Path.FillType.EVEN_ODD;
                        }
                        path2.setFillType(fillType2);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        v67 v67Var = (v67) y67Var;
                        float f7 = v67Var.i;
                        if (f7 != RecyclerView.A1 || v67Var.j != 1.0f) {
                            float f8 = v67Var.k;
                            float f9 = (f7 + f8) % 1.0f;
                            float f10 = (v67Var.j + f8) % 1.0f;
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
                                f2 = RecyclerView.A1;
                                pathMeasure2.getSegment(RecyclerView.A1, f12, path, true);
                            } else {
                                f2 = 0.0f;
                                pathMeasure.getSegment(f11, f12, path, true);
                            }
                            path.rLineTo(f2, f2);
                        }
                        path2.addPath(path, matrix4);
                        sh shVar = v67Var.f;
                        if (((Shader) shVar.c) != null || shVar.b != 0) {
                            if (this.e == null) {
                                i4 = 16777215;
                                Paint paint = new Paint(1);
                                this.e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i4 = 16777215;
                            }
                            Paint paint2 = this.e;
                            Shader shader = (Shader) shVar.c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(v67Var.h * 255.0f));
                                f3 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i7 = shVar.b;
                                float f13 = v67Var.h;
                                PorterDuff.Mode mode = c77.e0;
                                f3 = 255.0f;
                                paint2.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                            }
                            paint2.setColorFilter(null);
                            if (v67Var.c == 0) {
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
                        sh shVar2 = v67Var.d;
                        if (((Shader) shVar2.c) != null || shVar2.b != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = v67Var.m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = v67Var.l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(v67Var.n);
                            Shader shader2 = (Shader) shVar2.c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(v67Var.g * f3));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i8 = shVar2.b;
                                float f14 = v67Var.g;
                                PorterDuff.Mode mode2 = c77.e0;
                                paint4.setColor((i8 & i4) | (((int) (Color.alpha(i8) * f14)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(v67Var.e * min * f);
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

    /* JADX WARN: Type inference failed for: r0v4, types: [eu, m66] */
    public z67() {
        this.c = new Matrix();
        this.h = RecyclerView.A1;
        this.i = RecyclerView.A1;
        this.j = RecyclerView.A1;
        this.k = RecyclerView.A1;
        this.l = 255;
        this.m = null;
        this.n = null;
        this.o = new m66(0);
        this.g = new w67();
        this.a = new Path();
        this.b = new Path();
    }
}
