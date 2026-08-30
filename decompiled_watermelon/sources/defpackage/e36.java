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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e36  reason: default package */
/* loaded from: classes.dex */
public final class e36 extends j36 {
    public final g36 c;

    public e36(g36 g36Var) {
        this.c = g36Var;
    }

    @Override // defpackage.j36
    public final void a(Matrix matrix, w26 w26Var, int i, Canvas canvas) {
        boolean z;
        g36 g36Var = this.c;
        float f = g36Var.f;
        float f2 = g36Var.g;
        RectF rectF = new RectF(g36Var.b, g36Var.c, g36Var.d, g36Var.e);
        Paint paint = w26Var.b;
        if (f2 < RecyclerView.A1) {
            z = true;
        } else {
            z = false;
        }
        Path path = w26Var.g;
        int[] iArr = w26.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = w26Var.f;
            iArr[2] = w26Var.e;
            iArr[3] = w26Var.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = w26Var.d;
            iArr[2] = w26Var.e;
            iArr[3] = w26Var.f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= RecyclerView.A1) {
            return;
        }
        float f4 = 1.0f - (i / width);
        float[] fArr = w26.l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, w26Var.h);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
