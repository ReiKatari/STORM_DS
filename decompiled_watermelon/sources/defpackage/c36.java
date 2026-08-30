package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.BitSet;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c36  reason: default package */
/* loaded from: classes.dex */
public final class c36 {
    public final k36[] a = new k36[4];
    public final Matrix[] b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();
    public final Path f = new Path();
    public final k36 g = new k36();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public final Path j = new Path();
    public final Path k = new Path();
    public final boolean l = true;

    public c36() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new k36();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public final void a(a36 a36Var, float[] fArr, float f, RectF rectF, dv3 dv3Var, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i;
        k36[] k36VarArr;
        Matrix[] matrixArr2;
        ?? r16;
        float f2;
        sn1 sn1Var;
        boolean z;
        y21 no0Var;
        dk7 dk7Var;
        int i2;
        path.rewind();
        Path path2 = this.e;
        path2.rewind();
        Path path3 = this.f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            matrixArr = this.c;
            fArr2 = this.h;
            k36VarArr = this.a;
            matrixArr2 = this.b;
            r16 = 0;
            if (i3 >= 4) {
                break;
            }
            if (fArr == null) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            no0Var = a36Var.f;
                        } else {
                            no0Var = a36Var.e;
                        }
                    } else {
                        no0Var = a36Var.h;
                    }
                } else {
                    no0Var = a36Var.g;
                }
            } else {
                no0Var = new no0(fArr[i3]);
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        dk7Var = a36Var.b;
                    } else {
                        dk7Var = a36Var.a;
                    }
                } else {
                    dk7Var = a36Var.d;
                }
            } else {
                dk7Var = a36Var.c;
            }
            k36 k36Var = k36VarArr[i3];
            dk7Var.getClass();
            dk7Var.w(k36Var, f, no0Var.a(rectF));
            int i4 = i3 + 1;
            float f3 = (i4 % 4) * 90;
            matrixArr2[i3].reset();
            PointF pointF = this.d;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        i2 = i3;
                        pointF.set(rectF.right, rectF.top);
                    } else {
                        i2 = i3;
                        pointF.set(rectF.left, rectF.top);
                    }
                } else {
                    i2 = i3;
                    pointF.set(rectF.left, rectF.bottom);
                }
            } else {
                i2 = i3;
                pointF.set(rectF.right, rectF.bottom);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f3);
            k36 k36Var2 = k36VarArr[i2];
            fArr2[0] = k36Var2.b;
            fArr2[1] = k36Var2.c;
            matrixArr2[i2].mapPoints(fArr2);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i2].preRotate(f3);
            i3 = i4;
        }
        int i5 = 0;
        for (i = 4; i5 < i; i = 4) {
            k36 k36Var3 = k36VarArr[i5];
            k36Var3.getClass();
            fArr2[r16] = 0.0f;
            fArr2[1] = k36Var3.a;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 == 0) {
                path.moveTo(fArr2[r16], fArr2[1]);
            } else {
                path.lineTo(fArr2[r16], fArr2[1]);
            }
            k36VarArr[i5].b(matrixArr2[i5], path);
            if (dv3Var != null) {
                k36 k36Var4 = k36VarArr[i5];
                Matrix matrix = matrixArr2[i5];
                gv3 gv3Var = dv3Var.a;
                f2 = 0.0f;
                BitSet bitSet = gv3Var.X;
                k36Var4.getClass();
                bitSet.set(i5, (boolean) r16);
                j36[] j36VarArr = gv3Var.L;
                k36Var4.a(k36Var4.e);
                j36VarArr[i5] = new d36(new ArrayList(k36Var4.g), new Matrix(matrix));
            } else {
                f2 = 0.0f;
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            k36 k36Var5 = k36VarArr[i5];
            fArr2[0] = k36Var5.b;
            fArr2[1] = k36Var5.c;
            matrixArr2[i5].mapPoints(fArr2);
            k36 k36Var6 = k36VarArr[i7];
            k36Var6.getClass();
            float[] fArr3 = this.i;
            fArr3[0] = f2;
            fArr3[1] = k36Var6.a;
            matrixArr2[i7].mapPoints(fArr3);
            Matrix[] matrixArr3 = matrixArr;
            k36[] k36VarArr2 = k36VarArr;
            float max = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f2);
            k36 k36Var7 = k36VarArr2[i5];
            fArr2[0] = k36Var7.b;
            fArr2[1] = k36Var7.c;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 != 1 && i5 != 3) {
                Math.abs(rectF.centerY() - fArr2[1]);
            } else {
                Math.abs(rectF.centerX() - fArr2[0]);
            }
            k36 k36Var8 = this.g;
            k36Var8.d(RecyclerView.A1, 270.0f, RecyclerView.A1);
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        sn1Var = a36Var.j;
                    } else {
                        sn1Var = a36Var.i;
                    }
                } else {
                    sn1Var = a36Var.l;
                }
            } else {
                sn1Var = a36Var.k;
            }
            sn1Var.getClass();
            k36Var8.c(max, RecyclerView.A1);
            Path path4 = this.j;
            path4.reset();
            k36Var8.b(matrixArr3[i5], path4);
            if (this.l && (b(path4, i5) || b(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = k36Var8.a;
                matrixArr3[i5].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                k36Var8.b(matrixArr3[i5], path2);
            } else {
                k36Var8.b(matrixArr3[i5], path);
            }
            if (dv3Var != null) {
                Matrix matrix2 = matrixArr3[i5];
                gv3 gv3Var2 = dv3Var.a;
                z = false;
                gv3Var2.X.set(i5 + 4, false);
                j36[] j36VarArr2 = gv3Var2.R;
                k36Var8.a(k36Var8.e);
                j36VarArr2[i5] = new d36(new ArrayList(k36Var8.g), new Matrix(matrix2));
            } else {
                z = false;
            }
            matrixArr = matrixArr3;
            i5 = i6;
            r16 = z;
            k36VarArr = k36VarArr2;
        }
        path.close();
        path2.close();
        if (!path2.isEmpty()) {
            path.op(path2, Path.Op.UNION);
        }
    }

    public final boolean b(Path path, int i) {
        Path path2 = this.k;
        path2.reset();
        this.a[i].b(this.b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f)) {
            return true;
        }
        return false;
    }
}
