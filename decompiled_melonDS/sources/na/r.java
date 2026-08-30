package na;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r extends w {

    /* renamed from: c  reason: collision with root package name */
    public final t f10225c;

    public r(t tVar) {
        this.f10225c = tVar;
    }

    @Override // na.w
    public final void a(Matrix matrix, ma.a aVar, int i2, Canvas canvas) {
        boolean z10;
        float f8;
        t tVar = this.f10225c;
        float f10 = tVar.f10234f;
        float f11 = tVar.f10235g;
        RectF rectF = new RectF(tVar.f10230b, tVar.f10231c, tVar.f10232d, tVar.f10233e);
        Paint paint = aVar.f9457b;
        if (f11 < 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Path path = aVar.f9462g;
        int[] iArr = ma.a.f9454k;
        if (z10) {
            iArr[0] = 0;
            iArr[1] = aVar.f9461f;
            iArr[2] = aVar.f9460e;
            iArr[3] = aVar.f9459d;
            f8 = 0.0f;
        } else {
            path.rewind();
            f8 = 0.0f;
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f10, f11);
            path.close();
            float f12 = -i2;
            rectF.inset(f12, f12);
            iArr[0] = 0;
            iArr[1] = aVar.f9459d;
            iArr[2] = aVar.f9460e;
            iArr[3] = aVar.f9461f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= f8) {
            return;
        }
        float f13 = 1.0f - (i2 / width);
        float[] fArr = ma.a.f9455l;
        fArr[1] = f13;
        fArr[2] = ((1.0f - f13) / 2.0f) + f13;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.f9463h);
        }
        canvas.drawArc(rectF, f10, f11, true, paint);
        canvas.restore();
    }
}
