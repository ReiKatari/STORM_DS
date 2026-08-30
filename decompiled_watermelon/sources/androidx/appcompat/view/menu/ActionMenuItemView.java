package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class ActionMenuItemView extends ds implements nx3, View.OnClickListener, g8 {
    public zw3 f0;
    public CharSequence g0;
    public Drawable h0;
    public tw3 i0;
    public a8 j0;
    public b8 k0;
    public boolean l0;
    public boolean m0;
    public final int n0;
    public int o0;
    public final int p0;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.l0 = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, by4.c, 0, 0);
        this.n0 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.p0 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.o0 = -1;
        setSaveEnabled(false);
    }

    @Override // defpackage.g8
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // defpackage.g8
    public final boolean b() {
        if (!TextUtils.isEmpty(getText()) && this.f0.getIcon() == null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.nx3
    public final void c(zw3 zw3Var) {
        int i;
        this.f0 = zw3Var;
        setIcon(zw3Var.getIcon());
        setTitle(zw3Var.getTitleCondensed());
        setId(zw3Var.a);
        if (zw3Var.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        setEnabled(zw3Var.isEnabled());
        if (zw3Var.hasSubMenu() && this.j0 == null) {
            this.j0 = new a8(this);
        }
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            if ((i < 640 || i2 < 480) && configuration.orientation != 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // defpackage.nx3
    public zw3 getItemData() {
        return this.f0;
    }

    public final void h() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.g0);
        if (this.h0 != null && ((this.f0.y & 4) != 4 || (!this.l0 && !this.m0))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence3 = null;
        if (z3) {
            charSequence = this.g0;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence4 = this.f0.q;
        if (TextUtils.isEmpty(charSequence4)) {
            if (z3) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f0.e;
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(charSequence4);
        }
        CharSequence charSequence5 = this.f0.r;
        if (TextUtils.isEmpty(charSequence5)) {
            if (!z3) {
                charSequence3 = this.f0.e;
            }
            sn2.N(this, charSequence3);
            return;
        }
        sn2.N(this, charSequence5);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        tw3 tw3Var = this.i0;
        if (tw3Var != null) {
            tw3Var.a(this.f0);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.l0 = g();
        h();
    }

    @Override // defpackage.ds, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i4 = this.o0) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i5 = this.n0;
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, i5);
        } else {
            i3 = i5;
        }
        if (mode != 1073741824 && i5 > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (isEmpty && this.h0 != null) {
            super.setPadding((getMeasuredWidth() - this.h0.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a8 a8Var;
        if (this.f0.hasSubMenu() && (a8Var = this.j0) != null && a8Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z) {
        if (this.m0 != z) {
            this.m0 = z;
            zw3 zw3Var = this.f0;
            if (zw3Var != null) {
                uw3 uw3Var = zw3Var.n;
                uw3Var.k = true;
                uw3Var.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.h0 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.p0;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(tw3 tw3Var) {
        this.i0 = tw3Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.o0 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(b8 b8Var) {
        this.k0 = b8Var;
    }

    public void setTitle(CharSequence charSequence) {
        this.g0 = charSequence;
        h();
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }
}
