package com.google.android.material.internal;

import a6.x0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.preference.g0;
import ha.d;
import me.magnum.melonds.R;
import p.n;
import p.y;
import p5.k;
import p7.t;
import q.v1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class NavigationMenuItemView extends d implements y {
    public static final int[] D0 = {16842912};
    public boolean A0;
    public Drawable B0;
    public final g0 C0;

    /* renamed from: s0  reason: collision with root package name */
    public int f3071s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f3072t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f3073u0;

    /* renamed from: v0  reason: collision with root package name */
    public final boolean f3074v0;

    /* renamed from: w0  reason: collision with root package name */
    public final CheckedTextView f3075w0;

    /* renamed from: x0  reason: collision with root package name */
    public FrameLayout f3076x0;

    /* renamed from: y0  reason: collision with root package name */
    public n f3077y0;

    /* renamed from: z0  reason: collision with root package name */
    public ColorStateList f3078z0;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3074v0 = true;
        g0 g0Var = new g0(3, this);
        this.C0 = g0Var;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.f3075w0 = checkedTextView;
        x0.o(checkedTextView, g0Var);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f3076x0 == null) {
                this.f3076x0 = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f3076x0.removeAllViews();
            this.f3076x0.addView(view);
        }
    }

    @Override // p.y
    public final void b(n nVar) {
        int i2;
        StateListDrawable stateListDrawable;
        this.f3077y0 = nVar;
        int i10 = nVar.f11133a;
        if (i10 > 0) {
            setId(i10);
        }
        if (nVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(D0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(nVar.isCheckable());
        setChecked(nVar.isChecked());
        setEnabled(nVar.isEnabled());
        setTitle(nVar.f11137e);
        setIcon(nVar.getIcon());
        setActionView(nVar.getActionView());
        setContentDescription(nVar.f11148q);
        t.E(this, nVar.f11149r);
        n nVar2 = this.f3077y0;
        CharSequence charSequence = nVar2.f11137e;
        CheckedTextView checkedTextView = this.f3075w0;
        if (charSequence == null && nVar2.getIcon() == null && this.f3077y0.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f3076x0;
            if (frameLayout != null) {
                v1 v1Var = (v1) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) v1Var).width = -1;
                this.f3076x0.setLayoutParams(v1Var);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f3076x0;
        if (frameLayout2 != null) {
            v1 v1Var2 = (v1) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) v1Var2).width = -2;
            this.f3076x0.setLayoutParams(v1Var2);
        }
    }

    @Override // p.y
    public n getItemData() {
        return this.f3077y0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        n nVar = this.f3077y0;
        if (nVar != null && nVar.isCheckable() && this.f3077y0.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, D0);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f3073u0 != z10) {
            this.f3073u0 = z10;
            this.C0.h(this.f3075w0, 2048);
        }
    }

    public void setChecked(boolean z10) {
        int i2;
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f3075w0;
        checkedTextView.setChecked(z10);
        Typeface typeface = checkedTextView.getTypeface();
        if (z10 && this.f3074v0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        checkedTextView.setTypeface(typeface, i2);
    }

    public void setHorizontalPadding(int i2) {
        setPadding(i2, getPaddingTop(), i2, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.A0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.f3078z0);
            }
            int i2 = this.f3071s0;
            drawable.setBounds(0, 0, i2, i2);
        } else if (this.f3072t0) {
            if (this.B0 == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = k.f11352a;
                Drawable drawable2 = resources.getDrawable(R.drawable.navigation_empty_icon, theme);
                this.B0 = drawable2;
                if (drawable2 != null) {
                    int i10 = this.f3071s0;
                    drawable2.setBounds(0, 0, i10, i10);
                }
            }
            drawable = this.B0;
        }
        this.f3075w0.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i2) {
        this.f3075w0.setCompoundDrawablePadding(i2);
    }

    public void setIconSize(int i2) {
        this.f3071s0 = i2;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        boolean z10;
        this.f3078z0 = colorStateList;
        if (colorStateList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.A0 = z10;
        n nVar = this.f3077y0;
        if (nVar != null) {
            setIcon(nVar.getIcon());
        }
    }

    public void setMaxLines(int i2) {
        this.f3075w0.setMaxLines(i2);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f3072t0 = z10;
    }

    public void setTextAppearance(int i2) {
        this.f3075w0.setTextAppearance(i2);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f3075w0.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f3075w0.setText(charSequence);
    }
}
