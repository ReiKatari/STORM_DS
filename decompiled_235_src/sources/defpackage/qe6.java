package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qe6  reason: default package */
/* loaded from: classes.dex */
public final class qe6 extends ve6 {
    public final se6 c;

    public qe6(se6 se6Var) {
        this.c = se6Var;
    }

    @Override // defpackage.ve6
    public final void a(Matrix matrix, ie6 ie6Var, int i, Canvas canvas) {
        boolean z;
        se6 se6Var = this.c;
        float f = se6Var.f;
        float f2 = se6Var.g;
        RectF rectF = new RectF(se6Var.b, se6Var.c, se6Var.d, se6Var.e);
        Paint paint = ie6Var.b;
        if (f2 < RecyclerView.B1) {
            z = true;
        } else {
            z = false;
        }
        Path path = ie6Var.g;
        int[] iArr = ie6.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = ie6Var.f;
            iArr[2] = ie6Var.e;
            iArr[3] = ie6Var.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = ie6Var.d;
            iArr[2] = ie6Var.e;
            iArr[3] = ie6Var.f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= RecyclerView.B1) {
            return;
        }
        float f4 = 1.0f - (i / width);
        float[] fArr = ie6.l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, ie6Var.h);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
