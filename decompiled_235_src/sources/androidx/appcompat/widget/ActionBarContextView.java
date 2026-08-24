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
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public final q A;
    public final Context B;
    public ActionMenuView L;
    public g8 R;
    public int d0;
    public ip7 e0;
    public boolean f0;
    public boolean g0;
    public CharSequence h0;
    public CharSequence i0;
    public View j0;
    public View k0;
    public View l0;
    public LinearLayout m0;
    public TextView n0;
    public TextView o0;
    public final int p0;
    public final int q0;
    public boolean r0;
    public final int s0;

    /* JADX WARN: Type inference failed for: r1v0, types: [q, java.lang.Object] */
    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        Drawable drawable;
        int resourceId;
        ?? obj = new Object();
        obj.c = this;
        obj.b = false;
        this.A = obj;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.B = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.B = context;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m75.d, R.attr.actionModeStyle, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = hf.S(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        setBackground(drawable);
        this.p0 = obtainStyledAttributes.getResourceId(5, 0);
        this.q0 = obtainStyledAttributes.getResourceId(4, 0);
        this.d0 = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.s0 = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void a(ActionBarContextView actionBarContextView) {
        super.setVisibility(0);
    }

    public static /* synthetic */ void b(ActionBarContextView actionBarContextView, int i) {
        super.setVisibility(i);
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

    public final void c(k8 k8Var) {
        View view = this.j0;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.s0, (ViewGroup) this, false);
            this.j0 = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.j0);
        }
        View findViewById = this.j0.findViewById(R.id.action_mode_close_button);
        this.k0 = findViewById;
        findViewById.setOnClickListener(new r7(k8Var, 0));
        i44 c = k8Var.c();
        g8 g8Var = this.R;
        if (g8Var != null) {
            g8Var.e();
            d8 d8Var = g8Var.p0;
            if (d8Var != null && d8Var.b()) {
                d8Var.i.dismiss();
            }
        }
        g8 g8Var2 = new g8(getContext());
        this.R = g8Var2;
        g8Var2.h0 = true;
        g8Var2.i0 = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c.b(this.R, this.B);
        g8 g8Var3 = this.R;
        d54 d54Var = g8Var3.d0;
        if (d54Var == null) {
            d54 d54Var2 = (d54) g8Var3.R.inflate(g8Var3.Y, (ViewGroup) this, false);
            g8Var3.d0 = d54Var2;
            d54Var2.b(g8Var3.L);
            g8Var3.i();
        }
        d54 d54Var3 = g8Var3.d0;
        if (d54Var != d54Var3) {
            ((ActionMenuView) d54Var3).setPresenter(g8Var3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) d54Var3;
        this.L = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.L, layoutParams);
    }

    public final void d() {
        int i;
        if (this.m0 == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.m0 = linearLayout;
            this.n0 = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.o0 = (TextView) this.m0.findViewById(R.id.action_bar_subtitle);
            int i2 = this.p0;
            if (i2 != 0) {
                this.n0.setTextAppearance(getContext(), i2);
            }
            int i3 = this.q0;
            if (i3 != 0) {
                this.o0.setTextAppearance(getContext(), i3);
            }
        }
        this.n0.setText(this.h0);
        this.o0.setText(this.i0);
        boolean isEmpty = TextUtils.isEmpty(this.h0);
        boolean isEmpty2 = TextUtils.isEmpty(this.i0);
        TextView textView = this.o0;
        int i4 = 8;
        if (!isEmpty2) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        LinearLayout linearLayout2 = this.m0;
        if (!isEmpty || !isEmpty2) {
            i4 = 0;
        }
        linearLayout2.setVisibility(i4);
        if (this.m0.getParent() == null) {
            addView(this.m0);
        }
    }

    public final void e() {
        removeAllViews();
        this.l0 = null;
        this.L = null;
        this.R = null;
        View view = this.k0;
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
        if (this.e0 != null) {
            return this.A.a;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.d0;
    }

    public CharSequence getSubtitle() {
        return this.i0;
    }

    public CharSequence getTitle() {
        return this.h0;
    }

    @Override // android.view.View
    /* renamed from: h */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            ip7 ip7Var = this.e0;
            if (ip7Var != null) {
                ip7Var.b();
            }
            super.setVisibility(i);
        }
    }

    public final ip7 i(int i, long j) {
        ip7 ip7Var = this.e0;
        if (ip7Var != null) {
            ip7Var.b();
        }
        q qVar = this.A;
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(RecyclerView.B1);
            }
            ip7 b = ao7.b(this);
            b.a(1.0f);
            b.c(j);
            ((ActionBarContextView) qVar.c).e0 = b;
            qVar.a = i;
            b.d(qVar);
            return b;
        }
        ip7 b2 = ao7.b(this);
        b2.a(RecyclerView.B1);
        b2.c(j);
        ((ActionBarContextView) qVar.c).e0 = b2;
        qVar.a = i;
        b2.d(qVar);
        return b2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, m75.a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        g8 g8Var = this.R;
        if (g8Var != null) {
            Configuration configuration2 = g8Var.B.getResources().getConfiguration();
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
            g8Var.l0 = i;
            i44 i44Var = g8Var.L;
            if (i44Var != null) {
                i44Var.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g8 g8Var = this.R;
        if (g8Var != null) {
            g8Var.e();
            d8 d8Var = this.R.p0;
            if (d8Var != null && d8Var.b()) {
                d8Var.i.dismiss();
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.g0 = false;
        }
        if (!this.g0) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.g0 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.g0 = false;
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
        boolean z3 = eq7.a;
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
        View view = this.j0;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.j0.getLayoutParams();
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
            int g = g(this.j0, i7, paddingTop, paddingTop2, z2) + i7;
            if (z2) {
                i8 = g - i6;
            } else {
                i8 = g + i6;
            }
            paddingLeft = i8;
        }
        LinearLayout linearLayout = this.m0;
        if (linearLayout != null && this.l0 == null && linearLayout.getVisibility() != 8) {
            paddingLeft += g(this.m0, paddingLeft, paddingTop, paddingTop2, z2);
        }
        View view2 = this.l0;
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
                int i6 = this.d0;
                if (i6 <= 0) {
                    i6 = View.MeasureSpec.getSize(i2);
                }
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i7 = i6 - paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
                View view = this.j0;
                if (view != null) {
                    int f = f(view, paddingLeft, makeMeasureSpec);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.j0.getLayoutParams();
                    paddingLeft = f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.L;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    paddingLeft = f(this.L, paddingLeft, makeMeasureSpec);
                }
                LinearLayout linearLayout = this.m0;
                if (linearLayout != null && this.l0 == null) {
                    if (this.r0) {
                        this.m0.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.m0.getMeasuredWidth();
                        if (measuredWidth <= paddingLeft) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            paddingLeft -= measuredWidth;
                        }
                        LinearLayout linearLayout2 = this.m0;
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
                View view2 = this.l0;
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
                    this.l0.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i3), View.MeasureSpec.makeMeasureSpec(i7, i5));
                }
                if (this.d0 <= 0) {
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
            i.m(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        i.m(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f0 = false;
        }
        if (!this.f0) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f0 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f0 = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.d0 = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.l0;
        if (view2 != null) {
            removeView(view2);
        }
        this.l0 = view;
        if (view != null && (linearLayout = this.m0) != null) {
            removeView(linearLayout);
            this.m0 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.i0 = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.h0 = charSequence;
        d();
        ao7.o(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.r0) {
            requestLayout();
        }
        this.r0 = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
