package z0;

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
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public float f14849a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f14850b;

    /* renamed from: c  reason: collision with root package name */
    public final RectF f14851c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f14852d;

    /* renamed from: e  reason: collision with root package name */
    public float f14853e;

    /* renamed from: h  reason: collision with root package name */
    public ColorStateList f14856h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuffColorFilter f14857i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f14858j;

    /* renamed from: f  reason: collision with root package name */
    public boolean f14854f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f14855g = true;

    /* renamed from: k  reason: collision with root package name */
    public PorterDuff.Mode f14859k = PorterDuff.Mode.SRC_IN;

    public a(ColorStateList colorStateList, float f8) {
        this.f14849a = f8;
        Paint paint = new Paint(5);
        this.f14850b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f14856h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f14856h.getDefaultColor()));
        this.f14851c = new RectF();
        this.f14852d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    public final void b(Rect rect) {
        float f8;
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f14851c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f14852d;
        rect2.set(rect);
        if (this.f14854f) {
            float f10 = this.f14853e;
            float f11 = this.f14849a;
            boolean z10 = this.f14855g;
            if (z10) {
                f8 = (float) (((1.0d - b.f14860a) * f11) + (1.5f * f10));
            } else {
                int i2 = b.f14861b;
                f8 = 1.5f * f10;
            }
            if (z10) {
                f10 = (float) (((1.0d - b.f14860a) * f11) + f10);
            }
            rect2.inset((int) Math.ceil(f10), (int) Math.ceil(f8));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        PorterDuffColorFilter porterDuffColorFilter = this.f14857i;
        Paint paint = this.f14850b;
        if (porterDuffColorFilter != null && paint.getColorFilter() == null) {
            paint.setColorFilter(this.f14857i);
            z10 = true;
        } else {
            z10 = false;
        }
        RectF rectF = this.f14851c;
        float f8 = this.f14849a;
        canvas.drawRoundRect(rectF, f8, f8, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f14852d, this.f14849a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f14858j;
        if (colorStateList == null || !colorStateList.isStateful()) {
            ColorStateList colorStateList2 = this.f14856h;
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
        boolean z10;
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f14856h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f14850b;
        if (colorForState != paint.getColor()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f14858j;
        if (colorStateList2 != null && (mode = this.f14859k) != null) {
            this.f14857i = a(colorStateList2, mode);
            return true;
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.f14850b.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f14850b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f14858j = colorStateList;
        this.f14857i = a(colorStateList, this.f14859k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f14859k = mode;
        this.f14857i = a(this.f14858j, mode);
        invalidateSelf();
    }
}
