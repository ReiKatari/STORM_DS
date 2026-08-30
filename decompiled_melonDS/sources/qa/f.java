package qa;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends na.j {
    public static final /* synthetic */ int B0 = 0;
    public e A0;

    @Override // na.j
    public final void f(Canvas canvas) {
        if (this.A0.f12423r.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        int i2 = Build.VERSION.SDK_INT;
        e eVar = this.A0;
        if (i2 >= 26) {
            canvas.clipOutRect(eVar.f12423r);
        } else {
            canvas.clipRect(eVar.f12423r, Region.Op.DIFFERENCE);
        }
        super.f(canvas);
        canvas.restore();
    }

    @Override // na.j, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.A0 = new e(this.A0);
        return this;
    }

    public final void t(float f8, float f10, float f11, float f12) {
        RectF rectF = this.A0.f12423r;
        if (f8 == rectF.left && f10 == rectF.top && f11 == rectF.right && f12 == rectF.bottom) {
            return;
        }
        rectF.set(f8, f10, f11, f12);
        invalidateSelf();
    }
}
