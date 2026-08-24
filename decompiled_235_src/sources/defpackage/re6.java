package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: re6  reason: default package */
/* loaded from: classes.dex */
public final class re6 extends ve6 {
    public final te6 c;
    public final float d;
    public final float e;

    public re6(te6 te6Var, float f, float f2) {
        this.c = te6Var;
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.ve6
    public final void a(Matrix matrix, ie6 ie6Var, int i, Canvas canvas) {
        te6 te6Var = this.c;
        float f = te6Var.c;
        float f2 = this.e;
        float f3 = te6Var.b;
        float f4 = this.d;
        RectF rectF = new RectF(RecyclerView.B1, RecyclerView.B1, (float) Math.hypot(f - f2, f3 - f4), RecyclerView.B1);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        ie6Var.getClass();
        rectF.bottom += i;
        rectF.offset(RecyclerView.B1, -i);
        int i2 = ie6Var.f;
        int[] iArr = ie6.i;
        iArr[0] = i2;
        iArr[1] = ie6Var.e;
        iArr[2] = ie6Var.d;
        Paint paint = ie6Var.c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, ie6.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        te6 te6Var = this.c;
        return (float) Math.toDegrees(Math.atan((te6Var.c - this.e) / (te6Var.b - this.d)));
    }
}
