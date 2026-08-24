package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hj  reason: default package */
/* loaded from: classes.dex */
public final class hj {
    public final Path a;
    public RectF b;
    public float[] c;
    public Matrix d;

    public hj(Path path) {
        this.a = path;
    }

    public static void a(hj hjVar, hj hjVar2) {
        hjVar.a.addPath(hjVar2.a, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
    }

    public static void b(hj hjVar, of5 of5Var) {
        Path.Direction direction;
        kt4 kt4Var = kt4.CounterClockwise;
        float f = of5Var.a;
        float f2 = of5Var.d;
        float f3 = of5Var.c;
        float f4 = of5Var.b;
        if (Float.isNaN(f) || Float.isNaN(f4) || Float.isNaN(f3) || Float.isNaN(f2)) {
            lj.b("Invalid rectangle, make sure no value is NaN");
        }
        if (hjVar.b == null) {
            hjVar.b = new RectF();
        }
        RectF rectF = hjVar.b;
        rectF.getClass();
        rectF.set(f, f4, f3, f2);
        Path path = hjVar.a;
        RectF rectF2 = hjVar.b;
        rectF2.getClass();
        int i = kj.a[kt4Var.ordinal()];
        if (i != 1) {
            if (i == 2) {
                direction = Path.Direction.CW;
            } else {
                i.d();
                return;
            }
        } else {
            direction = Path.Direction.CCW;
        }
        path.addRect(rectF2, direction);
    }

    public static void c(hj hjVar, u16 u16Var) {
        Path.Direction direction;
        kt4 kt4Var = kt4.CounterClockwise;
        if (hjVar.b == null) {
            hjVar.b = new RectF();
        }
        RectF rectF = hjVar.b;
        rectF.getClass();
        float f = u16Var.a;
        long j = u16Var.h;
        long j2 = u16Var.g;
        long j3 = u16Var.f;
        long j4 = u16Var.e;
        rectF.set(f, u16Var.b, u16Var.c, u16Var.d);
        if (hjVar.c == null) {
            hjVar.c = new float[8];
        }
        float[] fArr = hjVar.c;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = hjVar.a;
        RectF rectF2 = hjVar.b;
        rectF2.getClass();
        float[] fArr2 = hjVar.c;
        fArr2.getClass();
        int i = kj.a[kt4Var.ordinal()];
        if (i != 1) {
            if (i == 2) {
                direction = Path.Direction.CW;
            } else {
                i.d();
                return;
            }
        } else {
            direction = Path.Direction.CCW;
        }
        path.addRoundRect(rectF2, fArr2, direction);
    }

    public final of5 d() {
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        rectF.getClass();
        this.a.computeBounds(rectF, true);
        return new of5(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void e(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    public final boolean f(hj hjVar, hj hjVar2, int i) {
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
        if (hjVar instanceof hj) {
            Path path = hjVar.a;
            if (hjVar2 instanceof hj) {
                return this.a.op(path, hjVar2.a, op);
            }
            fa6.h("Unable to obtain android.graphics.Path");
            return false;
        }
        fa6.h("Unable to obtain android.graphics.Path");
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
