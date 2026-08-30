package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import me.magnum.melonds.R;
import q.n2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public boolean A;
    public View B;
    public View L;
    public Drawable R;

    /* renamed from: b0  reason: collision with root package name */
    public Drawable f904b0;

    /* renamed from: c0  reason: collision with root package name */
    public Drawable f905c0;

    /* renamed from: d0  reason: collision with root package name */
    public final boolean f906d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f907e0;

    /* renamed from: f0  reason: collision with root package name */
    public final int f908f0;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new q.a(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.a.f7911a);
        boolean z10 = false;
        this.R = obtainStyledAttributes.getDrawable(0);
        this.f904b0 = obtainStyledAttributes.getDrawable(2);
        this.f908f0 = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f906d0 = true;
            this.f905c0 = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f906d0 ? !(this.R != null || this.f904b0 != null) : this.f905c0 == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.R;
        if (drawable != null && drawable.isStateful()) {
            this.R.setState(getDrawableState());
        }
        Drawable drawable2 = this.f904b0;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f904b0.setState(getDrawableState());
        }
        Drawable drawable3 = this.f905c0;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f905c0.setState(getDrawableState());
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
        Drawable drawable2 = this.f904b0;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f905c0;
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
    public final void onLayout(boolean z10, int i2, int i10, int i11, int i12) {
        super.onLayout(z10, i2, i10, i11, i12);
        boolean z11 = true;
        if (this.f906d0) {
            Drawable drawable = this.f905c0;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z11 = false;
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
                z11 = false;
            }
            this.f907e0 = false;
        }
        if (z11) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i10) {
        int i11;
        if (this.B == null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE && (i11 = this.f908f0) >= 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i11, View.MeasureSpec.getSize(i10)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i10);
        if (this.B == null) {
            return;
        }
        View.MeasureSpec.getMode(i10);
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
        boolean z10 = false;
        if (!this.f906d0 ? !(this.R != null || this.f904b0 != null) : this.f905c0 == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f905c0;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f905c0);
        }
        this.f905c0 = drawable;
        boolean z10 = this.f906d0;
        boolean z11 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z10 && (drawable2 = this.f905c0) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z10 ? !(this.R != null || this.f904b0 != null) : this.f905c0 == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f904b0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f904b0);
        }
        this.f904b0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f907e0 && this.f904b0 != null) {
                throw null;
            }
        }
        boolean z10 = false;
        if (!this.f906d0 ? !(this.R != null || this.f904b0 != null) : this.f905c0 == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z10) {
        int i2;
        this.A = z10;
        if (z10) {
            i2 = 393216;
        } else {
            i2 = 262144;
        }
        setDescendantFocusability(i2);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        boolean z10;
        super.setVisibility(i2);
        if (i2 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.R;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f904b0;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f905c0;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.R;
        boolean z10 = this.f906d0;
        if (drawable != drawable2 || z10) {
            if (drawable != this.f904b0 || !this.f907e0) {
                if ((drawable == this.f905c0 && z10) || super.verifyDrawable(drawable)) {
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

    public void setTabContainer(n2 n2Var) {
    }
}
