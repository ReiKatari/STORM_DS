package com.google.android.material.internal;

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
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class NavigationMenuItemView extends ye2 implements nx3 {
    public static final int[] E0 = {16842912};
    public ColorStateList A0;
    public boolean B0;
    public Drawable C0;
    public final rn0 D0;
    public int t0;
    public boolean u0;
    public boolean v0;
    public final boolean w0;
    public final CheckedTextView x0;
    public FrameLayout y0;
    public zw3 z0;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w0 = true;
        rn0 rn0Var = new rn0(3, this);
        this.D0 = rn0Var;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.x0 = checkedTextView;
        aa7.n(checkedTextView, rn0Var);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.y0 == null) {
                this.y0 = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.y0.removeAllViews();
            this.y0.addView(view);
        }
    }

    @Override // defpackage.nx3
    public final void c(zw3 zw3Var) {
        int i;
        StateListDrawable stateListDrawable;
        this.z0 = zw3Var;
        int i2 = zw3Var.a;
        if (i2 > 0) {
            setId(i2);
        }
        if (zw3Var.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(E0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(zw3Var.isCheckable());
        setChecked(zw3Var.isChecked());
        setEnabled(zw3Var.isEnabled());
        setTitle(zw3Var.e);
        setIcon(zw3Var.getIcon());
        setActionView(zw3Var.getActionView());
        setContentDescription(zw3Var.q);
        sn2.N(this, zw3Var.r);
        zw3 zw3Var2 = this.z0;
        CharSequence charSequence = zw3Var2.e;
        CheckedTextView checkedTextView = this.x0;
        if (charSequence == null && zw3Var2.getIcon() == null && this.z0.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.y0;
            if (frameLayout != null) {
                ao3 ao3Var = (ao3) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) ao3Var).width = -1;
                this.y0.setLayoutParams(ao3Var);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.y0;
        if (frameLayout2 != null) {
            ao3 ao3Var2 = (ao3) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) ao3Var2).width = -2;
            this.y0.setLayoutParams(ao3Var2);
        }
    }

    @Override // defpackage.nx3
    public zw3 getItemData() {
        return this.z0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        zw3 zw3Var = this.z0;
        if (zw3Var != null && zw3Var.isCheckable() && this.z0.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, E0);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.v0 != z) {
            this.v0 = z;
            this.D0.h(this.x0, 2048);
        }
    }

    public void setChecked(boolean z) {
        int i;
        refreshDrawableState();
        CheckedTextView checkedTextView = this.x0;
        checkedTextView.setChecked(z);
        Typeface typeface = checkedTextView.getTypeface();
        if (z && this.w0) {
            i = 1;
        } else {
            i = 0;
        }
        checkedTextView.setTypeface(typeface, i);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.B0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.A0);
            }
            int i = this.t0;
            drawable.setBounds(0, 0, i, i);
        } else if (this.u0) {
            if (this.C0 == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = ac5.a;
                Drawable drawable2 = resources.getDrawable(R.drawable.navigation_empty_icon, theme);
                this.C0 = drawable2;
                if (drawable2 != null) {
                    int i2 = this.t0;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.C0;
        }
        this.x0.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.x0.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.t0 = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        boolean z;
        this.A0 = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        this.B0 = z;
        zw3 zw3Var = this.z0;
        if (zw3Var != null) {
            setIcon(zw3Var.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.x0.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.u0 = z;
    }

    public void setTextAppearance(int i) {
        this.x0.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.x0.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.x0.setText(charSequence);
    }
}
