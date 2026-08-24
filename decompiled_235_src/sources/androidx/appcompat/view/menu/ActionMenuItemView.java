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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ActionMenuItemView extends qs implements c54, View.OnClickListener, h8 {
    public o44 g0;
    public CharSequence h0;
    public Drawable i0;
    public h44 j0;
    public b8 k0;
    public c8 l0;
    public boolean m0;
    public boolean n0;
    public final int o0;
    public int p0;
    public final int q0;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.m0 = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m75.c, 0, 0);
        this.o0 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.q0 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.p0 = -1;
        setSaveEnabled(false);
    }

    @Override // defpackage.h8
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // defpackage.h8
    public final boolean b() {
        if (!TextUtils.isEmpty(getText()) && this.g0.getIcon() == null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.c54
    public final void c(o44 o44Var) {
        int i;
        this.g0 = o44Var;
        setIcon(o44Var.getIcon());
        setTitle(o44Var.getTitleCondensed());
        setId(o44Var.a);
        if (o44Var.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        setEnabled(o44Var.isEnabled());
        if (o44Var.hasSubMenu() && this.k0 == null) {
            this.k0 = new b8(this);
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

    @Override // defpackage.c54
    public o44 getItemData() {
        return this.g0;
    }

    public final void h() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.h0);
        if (this.i0 != null && ((this.g0.y & 4) != 4 || (!this.m0 && !this.n0))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence3 = null;
        if (z3) {
            charSequence = this.h0;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence4 = this.g0.q;
        if (TextUtils.isEmpty(charSequence4)) {
            if (z3) {
                charSequence2 = null;
            } else {
                charSequence2 = this.g0.e;
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(charSequence4);
        }
        CharSequence charSequence5 = this.g0.r;
        if (TextUtils.isEmpty(charSequence5)) {
            if (!z3) {
                charSequence3 = this.g0.e;
            }
            bl2.R(this, charSequence3);
            return;
        }
        bl2.R(this, charSequence5);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h44 h44Var = this.j0;
        if (h44Var != null) {
            h44Var.a(this.g0);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.m0 = g();
        h();
    }

    @Override // defpackage.qs, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i4 = this.p0) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i5 = this.o0;
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, i5);
        } else {
            i3 = i5;
        }
        if (mode != 1073741824 && i5 > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (isEmpty && this.i0 != null) {
            super.setPadding((getMeasuredWidth() - this.i0.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b8 b8Var;
        if (this.g0.hasSubMenu() && (b8Var = this.k0) != null && b8Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z) {
        if (this.n0 != z) {
            this.n0 = z;
            o44 o44Var = this.g0;
            if (o44Var != null) {
                i44 i44Var = o44Var.n;
                i44Var.k = true;
                i44Var.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.i0 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.q0;
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

    public void setItemInvoker(h44 h44Var) {
        this.j0 = h44Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.p0 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(c8 c8Var) {
        this.l0 = c8Var;
    }

    public void setTitle(CharSequence charSequence) {
        this.h0 = charSequence;
        h();
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }
}
