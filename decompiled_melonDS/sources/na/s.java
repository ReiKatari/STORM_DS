package na;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s extends w {

    /* renamed from: c  reason: collision with root package name */
    public final u f10226c;

    /* renamed from: d  reason: collision with root package name */
    public final float f10227d;

    /* renamed from: e  reason: collision with root package name */
    public final float f10228e;

    public s(u uVar, float f8, float f10) {
        this.f10226c = uVar;
        this.f10227d = f8;
        this.f10228e = f10;
    }

    @Override // na.w
    public final void a(Matrix matrix, ma.a aVar, int i2, Canvas canvas) {
        u uVar = this.f10226c;
        float f8 = uVar.f10237c;
        float f10 = this.f10228e;
        float f11 = uVar.f10236b;
        float f12 = this.f10227d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f8 - f10, f11 - f12), 0.0f);
        Matrix matrix2 = this.f10240a;
        matrix2.set(matrix);
        matrix2.preTranslate(f12, f10);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i2;
        rectF.offset(0.0f, -i2);
        int i10 = aVar.f9461f;
        int[] iArr = ma.a.f9452i;
        iArr[0] = i10;
        iArr[1] = aVar.f9460e;
        iArr[2] = aVar.f9459d;
        Paint paint = aVar.f9458c;
        float f13 = rectF.left;
        paint.setShader(new LinearGradient(f13, rectF.top, f13, rectF.bottom, iArr, ma.a.f9453j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        u uVar = this.f10226c;
        return (float) Math.toDegrees(Math.atan((uVar.f10237c - this.f10228e) / (uVar.f10236b - this.f10227d)));
    }
}
