package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: br5  reason: default package */
/* loaded from: classes.dex */
public final class br5 extends Drawable {
    public float a;
    public final Paint b;
    public final RectF c;
    public final Rect d;
    public float e;
    public ColorStateList h;
    public PorterDuffColorFilter i;
    public ColorStateList j;
    public boolean f = false;
    public boolean g = true;
    public PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    public br5(ColorStateList colorStateList, float f) {
        this.a = f;
        Paint paint = new Paint(5);
        this.b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.h.getDefaultColor()));
        this.c = new RectF();
        this.d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    public final void b(Rect rect) {
        float f;
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.d;
        rect2.set(rect);
        if (this.f) {
            float f2 = this.e;
            float f3 = this.a;
            boolean z = this.g;
            if (z) {
                f = (float) (((1.0d - cr5.a) * f3) + (1.5f * f2));
            } else {
                int i = cr5.b;
                f = 1.5f * f2;
            }
            if (z) {
                f2 = (float) (((1.0d - cr5.a) * f3) + f2);
            }
            rect2.inset((int) Math.ceil(f2), (int) Math.ceil(f));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        PorterDuffColorFilter porterDuffColorFilter = this.i;
        Paint paint = this.b;
        if (porterDuffColorFilter != null && paint.getColorFilter() == null) {
            paint.setColorFilter(this.i);
            z = true;
        } else {
            z = false;
        }
        RectF rectF = this.c;
        float f = this.a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.d, this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.j;
        if (colorStateList == null || !colorStateList.isStateful()) {
            ColorStateList colorStateList2 = this.h;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful()) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.b;
        if (colorForState != paint.getColor()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.j;
        if (colorStateList2 != null && (mode = this.k) != null) {
            this.i = a(colorStateList2, mode);
            return true;
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.i = a(colorStateList, this.k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.k = mode;
        this.i = a(this.j, mode);
        invalidateSelf();
    }
}
