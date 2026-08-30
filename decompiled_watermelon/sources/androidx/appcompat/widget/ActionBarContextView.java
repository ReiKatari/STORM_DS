package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public final p A;
    public final Context B;
    public ActionMenuView L;
    public f8 R;
    public int c0;
    public hb7 d0;
    public boolean e0;
    public boolean f0;
    public CharSequence g0;
    public CharSequence h0;
    public View i0;
    public View j0;
    public View k0;
    public LinearLayout l0;
    public TextView m0;
    public TextView n0;
    public final int o0;
    public final int p0;
    public boolean q0;
    public final int r0;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        Drawable drawable;
        int resourceId;
        this.A = new p(this);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.B = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.B = context;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, by4.d, R.attr.actionModeStyle, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = l07.M(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        setBackground(drawable);
        this.o0 = obtainStyledAttributes.getResourceId(5, 0);
        this.p0 = obtainStyledAttributes.getResourceId(4, 0);
        this.c0 = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.r0 = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int g(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        if (z) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    public final void c(j8 j8Var) {
        View view = this.i0;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.r0, (ViewGroup) this, false);
            this.i0 = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.i0);
        }
        View findViewById = this.i0.findViewById(R.id.action_mode_close_button);
        this.j0 = findViewById;
        findViewById.setOnClickListener(new q7(0, j8Var));
        uw3 c = j8Var.c();
        f8 f8Var = this.R;
        if (f8Var != null) {
            f8Var.c();
            c8 c8Var = f8Var.o0;
            if (c8Var != null && c8Var.b()) {
                c8Var.i.dismiss();
            }
        }
        f8 f8Var2 = new f8(getContext());
        this.R = f8Var2;
        f8Var2.g0 = true;
        f8Var2.h0 = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c.b(this.R, this.B);
        f8 f8Var3 = this.R;
        ox3 ox3Var = f8Var3.c0;
        if (ox3Var == null) {
            ox3 ox3Var2 = (ox3) f8Var3.R.inflate(f8Var3.Y, (ViewGroup) this, false);
            f8Var3.c0 = ox3Var2;
            ox3Var2.b(f8Var3.L);
            f8Var3.g();
        }
        ox3 ox3Var3 = f8Var3.c0;
        if (ox3Var != ox3Var3) {
            ((ActionMenuView) ox3Var3).setPresenter(f8Var3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) ox3Var3;
        this.L = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.L, layoutParams);
    }

    public final void d() {
        int i;
        if (this.l0 == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.l0 = linearLayout;
            this.m0 = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.n0 = (TextView) this.l0.findViewById(R.id.action_bar_subtitle);
            int i2 = this.o0;
            if (i2 != 0) {
                this.m0.setTextAppearance(getContext(), i2);
            }
            int i3 = this.p0;
            if (i3 != 0) {
                this.n0.setTextAppearance(getContext(), i3);
            }
        }
        this.m0.setText(this.g0);
        this.n0.setText(this.h0);
        boolean isEmpty = TextUtils.isEmpty(this.g0);
        boolean isEmpty2 = TextUtils.isEmpty(this.h0);
        TextView textView = this.n0;
        int i4 = 8;
        if (!isEmpty2) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        LinearLayout linearLayout2 = this.l0;
        if (!isEmpty || !isEmpty2) {
            i4 = 0;
        }
        linearLayout2.setVisibility(i4);
        if (this.l0.getParent() == null) {
            addView(this.l0);
        }
    }

    public final void e() {
        removeAllViews();
        this.k0 = null;
        this.L = null;
        this.R = null;
        View view = this.j0;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        if (this.d0 != null) {
            return this.A.a;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.c0;
    }

    public CharSequence getSubtitle() {
        return this.h0;
    }

    public CharSequence getTitle() {
        return this.g0;
    }

    @Override // android.view.View
    /* renamed from: h */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            hb7 hb7Var = this.d0;
            if (hb7Var != null) {
                hb7Var.b();
            }
            super.setVisibility(i);
        }
    }

    public final hb7 i(int i, long j) {
        hb7 hb7Var = this.d0;
        if (hb7Var != null) {
            hb7Var.b();
        }
        p pVar = this.A;
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(RecyclerView.A1);
            }
            hb7 b = aa7.b(this);
            b.a(1.0f);
            b.c(j);
            ((ActionBarContextView) pVar.c).d0 = b;
            pVar.a = i;
            b.d(pVar);
            return b;
        }
        hb7 b2 = aa7.b(this);
        b2.a(RecyclerView.A1);
        b2.c(j);
        ((ActionBarContextView) pVar.c).d0 = b2;
        pVar.a = i;
        b2.d(pVar);
        return b2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, by4.a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        f8 f8Var = this.R;
        if (f8Var != null) {
            Configuration configuration2 = f8Var.B.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp <= 600 && i2 <= 600 && ((i2 <= 960 || i3 <= 720) && (i2 <= 720 || i3 <= 960))) {
                if (i2 < 500 && ((i2 <= 640 || i3 <= 480) && (i2 <= 480 || i3 <= 640))) {
                    if (i2 >= 360) {
                        i = 3;
                    } else {
                        i = 2;
                    }
                } else {
                    i = 4;
                }
            } else {
                i = 5;
            }
            f8Var.k0 = i;
            uw3 uw3Var = f8Var.L;
            if (uw3Var != null) {
                uw3Var.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f8 f8Var = this.R;
        if (f8Var != null) {
            f8Var.c();
            c8 c8Var = this.R.o0;
            if (c8Var != null && c8Var.b()) {
                c8Var.i.dismiss();
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f0 = false;
        }
        if (!this.f0) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f0 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f0 = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int paddingLeft;
        int paddingRight;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3 = dc7.a;
        if (getLayoutDirection() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            paddingLeft = (i3 - i) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.i0;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.i0.getLayoutParams();
            if (z2) {
                i5 = marginLayoutParams.rightMargin;
            } else {
                i5 = marginLayoutParams.leftMargin;
            }
            if (z2) {
                i6 = marginLayoutParams.leftMargin;
            } else {
                i6 = marginLayoutParams.rightMargin;
            }
            if (z2) {
                i7 = paddingLeft - i5;
            } else {
                i7 = paddingLeft + i5;
            }
            int g = g(this.i0, i7, paddingTop, paddingTop2, z2) + i7;
            if (z2) {
                i8 = g - i6;
            } else {
                i8 = g + i6;
            }
            paddingLeft = i8;
        }
        LinearLayout linearLayout = this.l0;
        if (linearLayout != null && this.k0 == null && linearLayout.getVisibility() != 8) {
            paddingLeft += g(this.l0, paddingLeft, paddingTop, paddingTop2, z2);
        }
        View view2 = this.k0;
        if (view2 != null) {
            g(view2, paddingLeft, paddingTop, paddingTop2, z2);
        }
        if (z2) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i3 - i) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.L;
        if (actionMenuView != null) {
            g(actionMenuView, paddingRight, paddingTop, paddingTop2, !z2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5 = 1073741824;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            if (View.MeasureSpec.getMode(i2) != 0) {
                int size = View.MeasureSpec.getSize(i);
                int i6 = this.c0;
                if (i6 <= 0) {
                    i6 = View.MeasureSpec.getSize(i2);
                }
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i7 = i6 - paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
                View view = this.i0;
                if (view != null) {
                    int f = f(view, paddingLeft, makeMeasureSpec);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.i0.getLayoutParams();
                    paddingLeft = f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.L;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    paddingLeft = f(this.L, paddingLeft, makeMeasureSpec);
                }
                LinearLayout linearLayout = this.l0;
                if (linearLayout != null && this.k0 == null) {
                    if (this.q0) {
                        this.l0.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.l0.getMeasuredWidth();
                        if (measuredWidth <= paddingLeft) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            paddingLeft -= measuredWidth;
                        }
                        LinearLayout linearLayout2 = this.l0;
                        if (z) {
                            i4 = 0;
                        } else {
                            i4 = 8;
                        }
                        linearLayout2.setVisibility(i4);
                    } else {
                        paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
                    }
                }
                View view2 = this.k0;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i8 = layoutParams.width;
                    if (i8 != -2) {
                        i3 = 1073741824;
                    } else {
                        i3 = Integer.MIN_VALUE;
                    }
                    if (i8 >= 0) {
                        paddingLeft = Math.min(i8, paddingLeft);
                    }
                    int i9 = layoutParams.height;
                    if (i9 == -2) {
                        i5 = Integer.MIN_VALUE;
                    }
                    if (i9 >= 0) {
                        i7 = Math.min(i9, i7);
                    }
                    this.k0.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i3), View.MeasureSpec.makeMeasureSpec(i7, i5));
                }
                if (this.c0 <= 0) {
                    int childCount = getChildCount();
                    int i10 = 0;
                    for (int i11 = 0; i11 < childCount; i11++) {
                        int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingBottom;
                        if (measuredHeight > i10) {
                            i10 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i10);
                    return;
                }
                setMeasuredDimension(size, i6);
                return;
            }
            i.n(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        i.n(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.e0 = false;
        }
        if (!this.e0) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.e0 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.e0 = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.c0 = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.k0;
        if (view2 != null) {
            removeView(view2);
        }
        this.k0 = view;
        if (view != null && (linearLayout = this.l0) != null) {
            removeView(linearLayout);
            this.l0 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.h0 = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.g0 = charSequence;
        d();
        aa7.o(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.q0) {
            requestLayout();
        }
        this.q0 = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
