package ha;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import q.w1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class d extends w1 {

    /* renamed from: m0  reason: collision with root package name */
    public Drawable f6414m0;

    /* renamed from: n0  reason: collision with root package name */
    public final Rect f6415n0;

    /* renamed from: o0  reason: collision with root package name */
    public final Rect f6416o0;
    public int p0;

    /* renamed from: q0  reason: collision with root package name */
    public final boolean f6417q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f6418r0;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f6415n0 = new Rect();
        this.f6416o0 = new Rect();
        this.p0 = 119;
        this.f6417q0 = true;
        this.f6418r0 = false;
        i.a(context, attributeSet, 0, 0);
        int[] iArr = t9.a.f13157h;
        i.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.p0 = obtainStyledAttributes.getInt(1, this.p0);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f6417q0 = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f6414m0;
        if (drawable != null) {
            if (this.f6418r0) {
                this.f6418r0 = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z10 = this.f6417q0;
                Rect rect = this.f6415n0;
                if (z10) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i2 = this.p0;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f6416o0;
                Gravity.apply(i2, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f8, float f10) {
        super.drawableHotspotChanged(f8, f10);
        Drawable drawable = this.f6414m0;
        if (drawable != null) {
            drawable.setHotspot(f8, f10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f6414m0;
        if (drawable != null && drawable.isStateful()) {
            this.f6414m0.setState(getDrawableState());
        }
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f6414m0;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.p0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f6414m0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // q.w1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i2, int i10, int i11, int i12) {
        super.onLayout(z10, i2, i10, i11, i12);
        this.f6418r0 = z10 | this.f6418r0;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i10, int i11, int i12) {
        super.onSizeChanged(i2, i10, i11, i12);
        this.f6418r0 = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f6414m0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f6414m0);
            }
            this.f6414m0 = drawable;
            this.f6418r0 = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.p0 == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i2) {
        if (this.p0 != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.p0 = i2;
            if (i2 == 119 && this.f6414m0 != null) {
                this.f6414m0.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f6414m0) {
            return false;
        }
        return true;
    }
}
