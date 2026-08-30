package k0;

import a0.j;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import p7.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final RectF f7951a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    public static Matrix a(RectF rectF, RectF rectF2, int i2, boolean z10) {
        Matrix matrix = new Matrix();
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        RectF rectF3 = f7951a;
        matrix.setRectToRect(rectF, rectF3, scaleToFit);
        matrix.postRotate(i2);
        if (z10) {
            matrix.postScale(-1.0f, 1.0f);
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF3, rectF2, scaleToFit);
        matrix.postConcat(matrix2);
        return matrix;
    }

    public static int b(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return i((int) Math.round(Math.atan2(fArr[3], fArr[0]) * 57.29577951308232d));
    }

    public static boolean c(int i2) {
        if (i2 != 90 && i2 != 270) {
            if (i2 != 0 && i2 != 180) {
                j.h(w.d.l(i2, "Invalid rotation degrees: "));
                return false;
            }
            return false;
        }
        return true;
    }

    public static boolean d(Size size, Size size2) {
        float width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
        float width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        float width3 = (size2.getWidth() + 1.0f) / (size2.getHeight() - 1.0f);
        if (width >= (size2.getWidth() - 1.0f) / (size2.getHeight() + 1.0f) && width3 >= width2) {
            return true;
        }
        return false;
    }

    public static boolean e(Matrix matrix) {
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr);
        float f8 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = (f10 * f12) + (f8 * f11);
        float f14 = (f8 * f12) - (f10 * f11);
        double sqrt = Math.sqrt((f10 * f10) + (f8 * f8)) * Math.sqrt((f12 * f12) + (f11 * f11));
        if (((float) Math.toDegrees(Math.atan2(f14 / sqrt, f13 / sqrt))) <= 0.0f) {
            return false;
        }
        return true;
    }

    public static Size f(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    public static Size g(Size size, int i2) {
        boolean z10;
        if (i2 % 90 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        m.g("Invalid rotation degrees: " + i2, z10);
        if (c(i(i2))) {
            return new Size(size.getHeight(), size.getWidth());
        }
        return size;
    }

    public static RectF h(Size size) {
        float f8 = 0;
        return new RectF(f8, f8, size.getWidth(), size.getHeight());
    }

    public static int i(int i2) {
        return ((i2 % 360) + 360) % 360;
    }
}
