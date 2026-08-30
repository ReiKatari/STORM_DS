package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c51  reason: default package */
/* loaded from: classes.dex */
public final class c51 extends gv3 {
    public static final /* synthetic */ int C0 = 0;
    public b51 B0;

    @Override // defpackage.gv3
    public final void f(Canvas canvas) {
        if (this.B0.r.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        int i = Build.VERSION.SDK_INT;
        b51 b51Var = this.B0;
        if (i >= 26) {
            canvas.clipOutRect(b51Var.r);
        } else {
            canvas.clipRect(b51Var.r, Region.Op.DIFFERENCE);
        }
        super.f(canvas);
        canvas.restore();
    }

    @Override // defpackage.gv3, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.B0 = new b51(this.B0);
        return this;
    }

    public final void t(float f, float f2, float f3, float f4) {
        RectF rectF = this.B0.r;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
