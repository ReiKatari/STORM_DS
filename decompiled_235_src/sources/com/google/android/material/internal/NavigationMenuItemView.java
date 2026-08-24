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
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class NavigationMenuItemView extends xj2 implements c54 {
    public static final int[] F0 = {16842912};
    public o44 A0;
    public ColorStateList B0;
    public boolean C0;
    public Drawable D0;
    public final l60 E0;
    public int u0;
    public boolean v0;
    public boolean w0;
    public final boolean x0;
    public final CheckedTextView y0;
    public FrameLayout z0;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.x0 = true;
        l60 l60Var = new l60(this, 4);
        this.E0 = l60Var;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.y0 = checkedTextView;
        ao7.n(checkedTextView, l60Var);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.z0 == null) {
                this.z0 = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.z0.removeAllViews();
            this.z0.addView(view);
        }
    }

    @Override // defpackage.c54
    public final void c(o44 o44Var) {
        int i;
        StateListDrawable stateListDrawable;
        this.A0 = o44Var;
        int i2 = o44Var.a;
        if (i2 > 0) {
            setId(i2);
        }
        if (o44Var.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(F0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(o44Var.isCheckable());
        setChecked(o44Var.isChecked());
        setEnabled(o44Var.isEnabled());
        setTitle(o44Var.e);
        setIcon(o44Var.getIcon());
        setActionView(o44Var.getActionView());
        setContentDescription(o44Var.q);
        bl2.R(this, o44Var.r);
        o44 o44Var2 = this.A0;
        CharSequence charSequence = o44Var2.e;
        CheckedTextView checkedTextView = this.y0;
        if (charSequence == null && o44Var2.getIcon() == null && this.A0.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.z0;
            if (frameLayout != null) {
                cv3 cv3Var = (cv3) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) cv3Var).width = -1;
                this.z0.setLayoutParams(cv3Var);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.z0;
        if (frameLayout2 != null) {
            cv3 cv3Var2 = (cv3) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) cv3Var2).width = -2;
            this.z0.setLayoutParams(cv3Var2);
        }
    }

    @Override // defpackage.c54
    public o44 getItemData() {
        return this.A0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        o44 o44Var = this.A0;
        if (o44Var != null && o44Var.isCheckable() && this.A0.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, F0);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.w0 != z) {
            this.w0 = z;
            this.E0.h(this.y0, 2048);
        }
    }

    public void setChecked(boolean z) {
        int i;
        refreshDrawableState();
        CheckedTextView checkedTextView = this.y0;
        checkedTextView.setChecked(z);
        Typeface typeface = checkedTextView.getTypeface();
        if (z && this.x0) {
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
            if (this.C0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.B0);
            }
            int i = this.u0;
            drawable.setBounds(0, 0, i, i);
        } else if (this.v0) {
            if (this.D0 == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = sl5.a;
                Drawable drawable2 = resources.getDrawable(R.drawable.navigation_empty_icon, theme);
                this.D0 = drawable2;
                if (drawable2 != null) {
                    int i2 = this.u0;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.D0;
        }
        this.y0.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.y0.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.u0 = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        boolean z;
        this.B0 = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        this.C0 = z;
        o44 o44Var = this.A0;
        if (o44Var != null) {
            setIcon(o44Var.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.y0.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.v0 = z;
    }

    public void setTextAppearance(int i) {
        this.y0.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.y0.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.y0.setText(charSequence);
    }
}
