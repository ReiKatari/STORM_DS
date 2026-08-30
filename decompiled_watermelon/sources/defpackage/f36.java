package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f36  reason: default package */
/* loaded from: classes.dex */
public final class f36 extends j36 {
    public final h36 c;
    public final float d;
    public final float e;

    public f36(h36 h36Var, float f, float f2) {
        this.c = h36Var;
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.j36
    public final void a(Matrix matrix, w26 w26Var, int i, Canvas canvas) {
        h36 h36Var = this.c;
        float f = h36Var.c;
        float f2 = this.e;
        float f3 = h36Var.b;
        float f4 = this.d;
        RectF rectF = new RectF(RecyclerView.A1, RecyclerView.A1, (float) Math.hypot(f - f2, f3 - f4), RecyclerView.A1);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        w26Var.getClass();
        rectF.bottom += i;
        rectF.offset(RecyclerView.A1, -i);
        int i2 = w26Var.f;
        int[] iArr = w26.i;
        iArr[0] = i2;
        iArr[1] = w26Var.e;
        iArr[2] = w26Var.d;
        Paint paint = w26Var.c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, w26.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        h36 h36Var = this.c;
        return (float) Math.toDegrees(Math.atan((h36Var.c - this.e) / (h36Var.b - this.d)));
    }
}
