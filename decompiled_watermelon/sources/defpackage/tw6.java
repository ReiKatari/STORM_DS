package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tw6  reason: default package */
/* loaded from: classes.dex */
public abstract class tw6 {
    public static final RectF a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    public static Matrix a(RectF rectF, RectF rectF2, int i, boolean z) {
        Matrix matrix = new Matrix();
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        RectF rectF3 = a;
        matrix.setRectToRect(rectF, rectF3, scaleToFit);
        matrix.postRotate(i);
        if (z) {
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

    public static boolean c(int i) {
        if (i != 90 && i != 270) {
            if (i != 0 && i != 180) {
                i.i(wh1.g(i, "Invalid rotation degrees: "));
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
        float[] fArr = {RecyclerView.A1, 1.0f, 1.0f, RecyclerView.A1};
        matrix.mapVectors(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = (f2 * f4) + (f * f3);
        float f6 = (f * f4) - (f2 * f3);
        double sqrt = Math.sqrt((f2 * f2) + (f * f)) * Math.sqrt((f4 * f4) + (f3 * f3));
        if (((float) Math.toDegrees(Math.atan2(f6 / sqrt, f5 / sqrt))) <= RecyclerView.A1) {
            return false;
        }
        return true;
    }

    public static Size f(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    public static Size g(int i, Size size) {
        boolean z;
        if (i % 90 == 0) {
            z = true;
        } else {
            z = false;
        }
        nl2.y("Invalid rotation degrees: " + i, z);
        if (c(i(i))) {
            return new Size(size.getHeight(), size.getWidth());
        }
        return size;
    }

    public static RectF h(Size size) {
        return new RectF(RecyclerView.A1, RecyclerView.A1, size.getWidth(), size.getHeight());
    }

    public static int i(int i) {
        return ((i % 360) + 360) % 360;
    }
}
