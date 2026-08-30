package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vi  reason: default package */
/* loaded from: classes.dex */
public final class vi {
    public final Path a;
    public RectF b;
    public float[] c;
    public Matrix d;

    public vi(Path path) {
        this.a = path;
    }

    public static void a(vi viVar, vi viVar2) {
        viVar.a.addPath(viVar2.a, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
    }

    public static void b(vi viVar, y55 y55Var) {
        Path.Direction direction;
        ik4 ik4Var = ik4.CounterClockwise;
        float f = y55Var.a;
        float f2 = y55Var.d;
        float f3 = y55Var.c;
        float f4 = y55Var.b;
        if (Float.isNaN(f) || Float.isNaN(f4) || Float.isNaN(f3) || Float.isNaN(f2)) {
            zi.b("Invalid rectangle, make sure no value is NaN");
        }
        if (viVar.b == null) {
            viVar.b = new RectF();
        }
        RectF rectF = viVar.b;
        rectF.getClass();
        rectF.set(f, f4, f3, f2);
        Path path = viVar.a;
        RectF rectF2 = viVar.b;
        rectF2.getClass();
        int i = yi.a[ik4Var.ordinal()];
        if (i != 1) {
            if (i == 2) {
                direction = Path.Direction.CW;
            } else {
                i.c();
                return;
            }
        } else {
            direction = Path.Direction.CCW;
        }
        path.addRect(rectF2, direction);
    }

    public static void c(vi viVar, ar5 ar5Var) {
        Path.Direction direction;
        ik4 ik4Var = ik4.CounterClockwise;
        if (viVar.b == null) {
            viVar.b = new RectF();
        }
        RectF rectF = viVar.b;
        rectF.getClass();
        float f = ar5Var.a;
        long j = ar5Var.h;
        long j2 = ar5Var.g;
        long j3 = ar5Var.f;
        long j4 = ar5Var.e;
        rectF.set(f, ar5Var.b, ar5Var.c, ar5Var.d);
        if (viVar.c == null) {
            viVar.c = new float[8];
        }
        float[] fArr = viVar.c;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = viVar.a;
        RectF rectF2 = viVar.b;
        rectF2.getClass();
        float[] fArr2 = viVar.c;
        fArr2.getClass();
        int i = yi.a[ik4Var.ordinal()];
        if (i != 1) {
            if (i == 2) {
                direction = Path.Direction.CW;
            } else {
                i.c();
                return;
            }
        } else {
            direction = Path.Direction.CCW;
        }
        path.addRoundRect(rectF2, fArr2, direction);
    }

    public final y55 d() {
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        rectF.getClass();
        this.a.computeBounds(rectF, true);
        return new y55(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void e(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    public final boolean f(vi viVar, vi viVar2, int i) {
        Path.Op op;
        if (i == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i == 1) {
            op = Path.Op.INTERSECT;
        } else if (i == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else if (i == 2) {
            op = Path.Op.UNION;
        } else {
            op = Path.Op.XOR;
        }
        if (viVar instanceof vi) {
            Path path = viVar.a;
            if (viVar2 instanceof vi) {
                return this.a.op(path, viVar2.a, op);
            }
            vd6.i("Unable to obtain android.graphics.Path");
            return false;
        }
        vd6.i("Unable to obtain android.graphics.Path");
        return false;
    }

    public final void g() {
        this.a.reset();
    }

    public final void h(int i) {
        Path.FillType fillType;
        if (i == 1) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        this.a.setFillType(fillType);
    }

    public final void i(long j) {
        Matrix matrix = this.d;
        if (matrix == null) {
            this.d = new Matrix();
        } else {
            matrix.reset();
        }
        Matrix matrix2 = this.d;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        Matrix matrix3 = this.d;
        matrix3.getClass();
        this.a.transform(matrix3);
    }
}
