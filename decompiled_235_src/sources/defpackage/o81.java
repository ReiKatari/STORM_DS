package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o81  reason: default package */
/* loaded from: classes.dex */
public final class o81 extends p24 {
    public static final /* synthetic */ int D0 = 0;
    public n81 C0;

    @Override // defpackage.p24
    public final void f(Canvas canvas) {
        if (this.C0.r.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        int i = Build.VERSION.SDK_INT;
        n81 n81Var = this.C0;
        if (i >= 26) {
            canvas.clipOutRect(n81Var.r);
        } else {
            canvas.clipRect(n81Var.r, Region.Op.DIFFERENCE);
        }
        super.f(canvas);
        canvas.restore();
    }

    @Override // defpackage.p24, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.C0 = new n81(this.C0);
        return this;
    }

    public final void t(float f, float f2, float f3, float f4) {
        RectF rectF = this.C0.r;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
