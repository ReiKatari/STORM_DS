package androidx.appcompat.widget;

import a6.f1;
import a6.x0;
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
import com.google.android.material.datepicker.l;
import k7.w;
import me.magnum.melonds.R;
import p.z;
import q.f;
import q.j;
import q.u3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public final lj.b A;
    public final Context B;
    public ActionMenuView L;
    public j R;

    /* renamed from: b0  reason: collision with root package name */
    public int f909b0;

    /* renamed from: c0  reason: collision with root package name */
    public f1 f910c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f911d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f912e0;

    /* renamed from: f0  reason: collision with root package name */
    public CharSequence f913f0;

    /* renamed from: g0  reason: collision with root package name */
    public CharSequence f914g0;

    /* renamed from: h0  reason: collision with root package name */
    public View f915h0;

    /* renamed from: i0  reason: collision with root package name */
    public View f916i0;

    /* renamed from: j0  reason: collision with root package name */
    public View f917j0;

    /* renamed from: k0  reason: collision with root package name */
    public LinearLayout f918k0;

    /* renamed from: l0  reason: collision with root package name */
    public TextView f919l0;

    /* renamed from: m0  reason: collision with root package name */
    public TextView f920m0;

    /* renamed from: n0  reason: collision with root package name */
    public final int f921n0;

    /* renamed from: o0  reason: collision with root package name */
    public final int f922o0;
    public boolean p0;

    /* renamed from: q0  reason: collision with root package name */
    public final int f923q0;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        Drawable drawable;
        int resourceId;
        this.A = new lj.b(this);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.B = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.B = context;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.a.f7914d, R.attr.actionModeStyle, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = w.p(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        setBackground(drawable);
        this.f921n0 = obtainStyledAttributes.getResourceId(5, 0);
        this.f922o0 = obtainStyledAttributes.getResourceId(4, 0);
        this.f909b0 = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f923q0 = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int f(View view, int i2, int i10) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i10);
        return Math.max(0, i2 - view.getMeasuredWidth());
    }

    public static int g(View view, int i2, int i10, int i11, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i12 = ((i11 - measuredHeight) / 2) + i10;
        if (z10) {
            view.layout(i2 - measuredWidth, i12, i2, measuredHeight + i12);
        } else {
            view.layout(i2, i12, i2 + measuredWidth, measuredHeight + i12);
        }
        if (z10) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    public final void c(o.a aVar) {
        View view = this.f915h0;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f923q0, (ViewGroup) this, false);
            this.f915h0 = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f915h0);
        }
        View findViewById = this.f915h0.findViewById(R.id.action_mode_close_button);
        this.f916i0 = findViewById;
        findViewById.setOnClickListener(new l(2, aVar));
        p.l d4 = aVar.d();
        j jVar = this.R;
        if (jVar != null) {
            jVar.c();
            f fVar = jVar.f11925n0;
            if (fVar != null && fVar.b()) {
                fVar.f11172i.dismiss();
            }
        }
        j jVar2 = new j(getContext());
        this.R = jVar2;
        jVar2.f11917f0 = true;
        jVar2.f11918g0 = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        d4.b(this.R, this.B);
        j jVar3 = this.R;
        z zVar = jVar3.f11913b0;
        if (zVar == null) {
            z zVar2 = (z) jVar3.R.inflate(jVar3.Y, (ViewGroup) this, false);
            jVar3.f11913b0 = zVar2;
            zVar2.a(jVar3.L);
            jVar3.d();
        }
        z zVar3 = jVar3.f11913b0;
        if (zVar != zVar3) {
            ((ActionMenuView) zVar3).setPresenter(jVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) zVar3;
        this.L = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.L, layoutParams);
    }

    public final void d() {
        int i2;
        if (this.f918k0 == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f918k0 = linearLayout;
            this.f919l0 = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f920m0 = (TextView) this.f918k0.findViewById(R.id.action_bar_subtitle);
            int i10 = this.f921n0;
            if (i10 != 0) {
                this.f919l0.setTextAppearance(getContext(), i10);
            }
            int i11 = this.f922o0;
            if (i11 != 0) {
                this.f920m0.setTextAppearance(getContext(), i11);
            }
        }
        this.f919l0.setText(this.f913f0);
        this.f920m0.setText(this.f914g0);
        boolean isEmpty = TextUtils.isEmpty(this.f913f0);
        boolean isEmpty2 = TextUtils.isEmpty(this.f914g0);
        TextView textView = this.f920m0;
        int i12 = 8;
        if (!isEmpty2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        textView.setVisibility(i2);
        LinearLayout linearLayout2 = this.f918k0;
        if (!isEmpty || !isEmpty2) {
            i12 = 0;
        }
        linearLayout2.setVisibility(i12);
        if (this.f918k0.getParent() == null) {
            addView(this.f918k0);
        }
    }

    public final void e() {
        removeAllViews();
        this.f917j0 = null;
        this.L = null;
        this.R = null;
        View view = this.f916i0;
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
        if (this.f910c0 != null) {
            return this.A.f9169b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f909b0;
    }

    public CharSequence getSubtitle() {
        return this.f914g0;
    }

    public CharSequence getTitle() {
        return this.f913f0;
    }

    @Override // android.view.View
    /* renamed from: h */
    public final void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            f1 f1Var = this.f910c0;
            if (f1Var != null) {
                f1Var.b();
            }
            super.setVisibility(i2);
        }
    }

    public final f1 i(int i2, long j2) {
        f1 f1Var = this.f910c0;
        if (f1Var != null) {
            f1Var.b();
        }
        lj.b bVar = this.A;
        if (i2 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            f1 b10 = x0.b(this);
            b10.a(1.0f);
            b10.c(j2);
            ((ActionBarContextView) bVar.f9170c).f910c0 = b10;
            bVar.f9169b = i2;
            b10.d(bVar);
            return b10;
        }
        f1 b11 = x0.b(this);
        b11.a(0.0f);
        b11.c(j2);
        ((ActionBarContextView) bVar.f9170c).f910c0 = b11;
        bVar.f9169b = i2;
        b11.d(bVar);
        return b11;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i2;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, k.a.f7911a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        j jVar = this.R;
        if (jVar != null) {
            Configuration configuration2 = jVar.B.getResources().getConfiguration();
            int i10 = configuration2.screenWidthDp;
            int i11 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp <= 600 && i10 <= 600 && ((i10 <= 960 || i11 <= 720) && (i10 <= 720 || i11 <= 960))) {
                if (i10 < 500 && ((i10 <= 640 || i11 <= 480) && (i10 <= 480 || i11 <= 640))) {
                    if (i10 >= 360) {
                        i2 = 3;
                    } else {
                        i2 = 2;
                    }
                } else {
                    i2 = 4;
                }
            } else {
                i2 = 5;
            }
            jVar.f11921j0 = i2;
            p.l lVar = jVar.L;
            if (lVar != null) {
                lVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.R;
        if (jVar != null) {
            jVar.c();
            f fVar = this.R.f11925n0;
            if (fVar != null && fVar.b()) {
                fVar.f11172i.dismiss();
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f912e0 = false;
        }
        if (!this.f912e0) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f912e0 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f912e0 = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i2, int i10, int i11, int i12) {
        boolean z11;
        int paddingLeft;
        int paddingRight;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z12 = u3.f12027a;
        if (getLayoutDirection() == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            paddingLeft = (i11 - i2) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
        View view = this.f915h0;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f915h0.getLayoutParams();
            if (z11) {
                i13 = marginLayoutParams.rightMargin;
            } else {
                i13 = marginLayoutParams.leftMargin;
            }
            if (z11) {
                i14 = marginLayoutParams.leftMargin;
            } else {
                i14 = marginLayoutParams.rightMargin;
            }
            if (z11) {
                i15 = paddingLeft - i13;
            } else {
                i15 = paddingLeft + i13;
            }
            int g10 = g(this.f915h0, i15, paddingTop, paddingTop2, z11) + i15;
            if (z11) {
                i16 = g10 - i14;
            } else {
                i16 = g10 + i14;
            }
            paddingLeft = i16;
        }
        LinearLayout linearLayout = this.f918k0;
        if (linearLayout != null && this.f917j0 == null && linearLayout.getVisibility() != 8) {
            paddingLeft += g(this.f918k0, paddingLeft, paddingTop, paddingTop2, z11);
        }
        View view2 = this.f917j0;
        if (view2 != null) {
            g(view2, paddingLeft, paddingTop, paddingTop2, z11);
        }
        if (z11) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i11 - i2) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.L;
        if (actionMenuView != null) {
            g(actionMenuView, paddingRight, paddingTop, paddingTop2, !z11);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13 = 1073741824;
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            if (View.MeasureSpec.getMode(i10) != 0) {
                int size = View.MeasureSpec.getSize(i2);
                int i14 = this.f909b0;
                if (i14 <= 0) {
                    i14 = View.MeasureSpec.getSize(i10);
                }
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i15 = i14 - paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE);
                View view = this.f915h0;
                if (view != null) {
                    int f8 = f(view, paddingLeft, makeMeasureSpec);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f915h0.getLayoutParams();
                    paddingLeft = f8 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.L;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    paddingLeft = f(this.L, paddingLeft, makeMeasureSpec);
                }
                LinearLayout linearLayout = this.f918k0;
                if (linearLayout != null && this.f917j0 == null) {
                    if (this.p0) {
                        this.f918k0.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.f918k0.getMeasuredWidth();
                        if (measuredWidth <= paddingLeft) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            paddingLeft -= measuredWidth;
                        }
                        LinearLayout linearLayout2 = this.f918k0;
                        if (z10) {
                            i12 = 0;
                        } else {
                            i12 = 8;
                        }
                        linearLayout2.setVisibility(i12);
                    } else {
                        paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
                    }
                }
                View view2 = this.f917j0;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i16 = layoutParams.width;
                    if (i16 != -2) {
                        i11 = 1073741824;
                    } else {
                        i11 = Integer.MIN_VALUE;
                    }
                    if (i16 >= 0) {
                        paddingLeft = Math.min(i16, paddingLeft);
                    }
                    int i17 = layoutParams.height;
                    if (i17 == -2) {
                        i13 = Integer.MIN_VALUE;
                    }
                    if (i17 >= 0) {
                        i15 = Math.min(i17, i15);
                    }
                    this.f917j0.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i11), View.MeasureSpec.makeMeasureSpec(i15, i13));
                }
                if (this.f909b0 <= 0) {
                    int childCount = getChildCount();
                    int i18 = 0;
                    for (int i19 = 0; i19 < childCount; i19++) {
                        int measuredHeight = getChildAt(i19).getMeasuredHeight() + paddingBottom;
                        if (measuredHeight > i18) {
                            i18 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i18);
                    return;
                }
                setMeasuredDimension(size, i14);
                return;
            }
            a0.j.p(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        a0.j.p(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f911d0 = false;
        }
        if (!this.f911d0) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f911d0 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f911d0 = false;
        return true;
    }

    public void setContentHeight(int i2) {
        this.f909b0 = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f917j0;
        if (view2 != null) {
            removeView(view2);
        }
        this.f917j0 = view;
        if (view != null && (linearLayout = this.f918k0) != null) {
            removeView(linearLayout);
            this.f918k0 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f914g0 = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f913f0 = charSequence;
        d();
        x0.p(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.p0) {
            requestLayout();
        }
        this.p0 = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
