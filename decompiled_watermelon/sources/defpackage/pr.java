package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pr  reason: default package */
/* loaded from: classes.dex */
public final class pr extends yp3 implements rr {
    public int A0;
    public final /* synthetic */ sr B0;
    public CharSequence x0;
    public mr y0;
    public final Rect z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr(sr srVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.B0 = srVar;
        this.z0 = new Rect();
        this.j0 = srVar;
        this.t0 = true;
        this.u0.setFocusable(true);
        this.k0 = new nr(0, this);
    }

    @Override // defpackage.rr
    public final void e(CharSequence charSequence) {
        this.x0 = charSequence;
    }

    @Override // defpackage.rr
    public final void i(int i) {
        this.A0 = i;
    }

    @Override // defpackage.rr
    public final void k(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        cr crVar = this.u0;
        boolean isShowing = crVar.isShowing();
        q();
        crVar.setInputMethodMode(2);
        c();
        fl1 fl1Var = this.L;
        fl1Var.setChoiceMode(1);
        fl1Var.setTextDirection(i);
        fl1Var.setTextAlignment(i2);
        sr srVar = this.B0;
        int selectedItemPosition = srVar.getSelectedItemPosition();
        fl1 fl1Var2 = this.L;
        if (crVar.isShowing() && fl1Var2 != null) {
            fl1Var2.setListSelectionHidden(false);
            fl1Var2.setSelection(selectedItemPosition);
            if (fl1Var2.getChoiceMode() != 0) {
                fl1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = srVar.getViewTreeObserver()) != null) {
            jr jrVar = new jr(1, this);
            viewTreeObserver.addOnGlobalLayoutListener(jrVar);
            crVar.setOnDismissListener(new or(this, jrVar));
        }
    }

    @Override // defpackage.rr
    public final CharSequence m() {
        return this.x0;
    }

    @Override // defpackage.yp3, defpackage.rr
    public final void n(ListAdapter listAdapter) {
        super.n(listAdapter);
        this.y0 = (mr) listAdapter;
    }

    public final void q() {
        int i;
        int i2;
        cr crVar = this.u0;
        Drawable background = crVar.getBackground();
        sr srVar = this.B0;
        Rect rect = srVar.f0;
        if (background != null) {
            background.getPadding(rect);
            boolean z = dc7.a;
            if (srVar.getLayoutDirection() == 1) {
                i = rect.right;
            } else {
                i = -rect.left;
            }
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = srVar.getPaddingLeft();
        int paddingRight = srVar.getPaddingRight();
        int width = srVar.getWidth();
        int i3 = srVar.e0;
        if (i3 == -2) {
            int a = srVar.a(this.y0, crVar.getBackground());
            int i4 = (srVar.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a > i4) {
                a = i4;
            }
            p(Math.max(a, (width - paddingLeft) - paddingRight));
        } else if (i3 == -1) {
            p((width - paddingLeft) - paddingRight);
        } else {
            p(i3);
        }
        boolean z2 = dc7.a;
        if (srVar.getLayoutDirection() == 1) {
            i2 = (((width - paddingRight) - this.X) - this.A0) + i;
        } else {
            i2 = paddingLeft + this.A0 + i;
        }
        this.Y = i2;
    }
}
