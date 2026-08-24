package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.BitSet;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oe6  reason: default package */
/* loaded from: classes.dex */
public final class oe6 {
    public final we6[] a = new we6[4];
    public final Matrix[] b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();
    public final Path f = new Path();
    public final we6 g = new we6();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public final Path j = new Path();
    public final Path k = new Path();
    public final boolean l = true;

    public oe6() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new we6();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public final void a(me6 me6Var, float[] fArr, float f, RectF rectF, m24 m24Var, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i;
        we6[] we6VarArr;
        Matrix[] matrixArr2;
        ?? r16;
        float f2;
        cs1 cs1Var;
        boolean z;
        f61 xq0Var;
        q60 q60Var;
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
            we6VarArr = this.a;
            matrixArr2 = this.b;
            r16 = 0;
            if (i3 >= 4) {
                break;
            }
            if (fArr == null) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            xq0Var = me6Var.f;
                        } else {
                            xq0Var = me6Var.e;
                        }
                    } else {
                        xq0Var = me6Var.h;
                    }
                } else {
                    xq0Var = me6Var.g;
                }
            } else {
                xq0Var = new xq0(fArr[i3]);
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        q60Var = me6Var.b;
                    } else {
                        q60Var = me6Var.a;
                    }
                } else {
                    q60Var = me6Var.d;
                }
            } else {
                q60Var = me6Var.c;
            }
            we6 we6Var = we6VarArr[i3];
            q60Var.getClass();
            q60Var.C(we6Var, f, xq0Var.a(rectF));
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
            we6 we6Var2 = we6VarArr[i2];
            fArr2[0] = we6Var2.b;
            fArr2[1] = we6Var2.c;
            matrixArr2[i2].mapPoints(fArr2);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i2].preRotate(f3);
            i3 = i4;
        }
        int i5 = 0;
        for (i = 4; i5 < i; i = 4) {
            we6 we6Var3 = we6VarArr[i5];
            we6Var3.getClass();
            fArr2[r16] = 0.0f;
            fArr2[1] = we6Var3.a;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 == 0) {
                path.moveTo(fArr2[r16], fArr2[1]);
            } else {
                path.lineTo(fArr2[r16], fArr2[1]);
            }
            we6VarArr[i5].b(matrixArr2[i5], path);
            if (m24Var != null) {
                we6 we6Var4 = we6VarArr[i5];
                Matrix matrix = matrixArr2[i5];
                p24 p24Var = m24Var.a;
                f2 = 0.0f;
                BitSet bitSet = p24Var.X;
                we6Var4.getClass();
                bitSet.set(i5, (boolean) r16);
                ve6[] ve6VarArr = p24Var.L;
                we6Var4.a(we6Var4.e);
                ve6VarArr[i5] = new pe6(new ArrayList(we6Var4.g), new Matrix(matrix));
            } else {
                f2 = 0.0f;
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            we6 we6Var5 = we6VarArr[i5];
            fArr2[0] = we6Var5.b;
            fArr2[1] = we6Var5.c;
            matrixArr2[i5].mapPoints(fArr2);
            we6 we6Var6 = we6VarArr[i7];
            we6Var6.getClass();
            float[] fArr3 = this.i;
            fArr3[0] = f2;
            fArr3[1] = we6Var6.a;
            matrixArr2[i7].mapPoints(fArr3);
            Matrix[] matrixArr3 = matrixArr;
            we6[] we6VarArr2 = we6VarArr;
            float max = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f2);
            we6 we6Var7 = we6VarArr2[i5];
            fArr2[0] = we6Var7.b;
            fArr2[1] = we6Var7.c;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 != 1 && i5 != 3) {
                Math.abs(rectF.centerY() - fArr2[1]);
            } else {
                Math.abs(rectF.centerX() - fArr2[0]);
            }
            we6 we6Var8 = this.g;
            we6Var8.d(RecyclerView.B1, 270.0f, RecyclerView.B1);
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        cs1Var = me6Var.j;
                    } else {
                        cs1Var = me6Var.i;
                    }
                } else {
                    cs1Var = me6Var.l;
                }
            } else {
                cs1Var = me6Var.k;
            }
            cs1Var.getClass();
            we6Var8.c(max, RecyclerView.B1);
            Path path4 = this.j;
            path4.reset();
            we6Var8.b(matrixArr3[i5], path4);
            if (this.l && (b(path4, i5) || b(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = we6Var8.a;
                matrixArr3[i5].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                we6Var8.b(matrixArr3[i5], path2);
            } else {
                we6Var8.b(matrixArr3[i5], path);
            }
            if (m24Var != null) {
                Matrix matrix2 = matrixArr3[i5];
                p24 p24Var2 = m24Var.a;
                z = false;
                p24Var2.X.set(i5 + 4, false);
                ve6[] ve6VarArr2 = p24Var2.R;
                we6Var8.a(we6Var8.e);
                ve6VarArr2[i5] = new pe6(new ArrayList(we6Var8.g), new Matrix(matrix2));
            } else {
                z = false;
            }
            matrixArr = matrixArr3;
            i5 = i6;
            r16 = z;
            we6VarArr = we6VarArr2;
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
