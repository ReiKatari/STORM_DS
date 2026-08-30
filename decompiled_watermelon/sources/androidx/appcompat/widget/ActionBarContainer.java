package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public boolean A;
    public View B;
    public View L;
    public Drawable R;
    public Drawable c0;
    public Drawable d0;
    public final boolean e0;
    public boolean f0;
    public final int g0;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new p7(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, by4.a);
        boolean z = false;
        this.R = obtainStyledAttributes.getDrawable(0);
        this.c0 = obtainStyledAttributes.getDrawable(2);
        this.g0 = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.e0 = true;
            this.d0 = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.e0 ? !(this.R != null || this.c0 != null) : this.d0 == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.R;
        if (drawable != null && drawable.isStateful()) {
            this.R.setState(getDrawableState());
        }
        Drawable drawable2 = this.c0;
        if (drawable2 != null && drawable2.isStateful()) {
            this.c0.setState(getDrawableState());
        }
        Drawable drawable3 = this.d0;
        if (drawable3 != null && drawable3.isStateful()) {
            this.d0.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.R;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.c0;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.d0;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.B = findViewById(R.id.action_bar);
        this.L = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.A && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.e0) {
            Drawable drawable = this.d0;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.R != null) {
                if (this.B.getVisibility() == 0) {
                    this.R.setBounds(this.B.getLeft(), this.B.getTop(), this.B.getRight(), this.B.getBottom());
                } else {
                    View view = this.L;
                    if (view != null && view.getVisibility() == 0) {
                        this.R.setBounds(this.L.getLeft(), this.L.getTop(), this.L.getRight(), this.L.getBottom());
                    } else {
                        this.R.setBounds(0, 0, 0, 0);
                    }
                }
            } else {
                z2 = false;
            }
            this.f0 = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.B == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.g0) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.B == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.R;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.R);
        }
        this.R = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.B;
            if (view != null) {
                this.R.setBounds(view.getLeft(), this.B.getTop(), this.B.getRight(), this.B.getBottom());
            }
        }
        boolean z = false;
        if (!this.e0 ? !(this.R != null || this.c0 != null) : this.d0 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.d0;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.d0);
        }
        this.d0 = drawable;
        boolean z = this.e0;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.d0) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.R != null || this.c0 != null) : this.d0 == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.c0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.c0);
        }
        this.c0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f0 && this.c0 != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.e0 ? !(this.R != null || this.c0 != null) : this.d0 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z) {
        int i;
        this.A = z;
        if (z) {
            i = 393216;
        } else {
            i = 262144;
        }
        setDescendantFocusability(i);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.R;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.c0;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.d0;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.R;
        boolean z = this.e0;
        if (drawable != drawable2 || z) {
            if (drawable != this.c0 || !this.f0) {
                if ((drawable == this.d0 && z) || super.verifyDrawable(drawable)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public void setTabContainer(bx5 bx5Var) {
    }
}
