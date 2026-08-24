package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cs  reason: default package */
/* loaded from: classes.dex */
public final class cs extends ax3 implements es {
    public final Rect A0;
    public int B0;
    public final /* synthetic */ fs C0;
    public CharSequence y0;
    public zr z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs(fs fsVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.C0 = fsVar;
        this.A0 = new Rect();
        this.k0 = fsVar;
        this.u0 = true;
        this.v0.setFocusable(true);
        this.l0 = new as(this, 0);
    }

    @Override // defpackage.es
    public final CharSequence d() {
        return this.y0;
    }

    @Override // defpackage.es
    public final void g(CharSequence charSequence) {
        this.y0 = charSequence;
    }

    @Override // defpackage.es
    public final void k(int i) {
        this.B0 = i;
    }

    @Override // defpackage.es
    public final void l(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        pr prVar = this.v0;
        boolean isShowing = prVar.isShowing();
        r();
        prVar.setInputMethodMode(2);
        e();
        mp1 mp1Var = this.L;
        mp1Var.setChoiceMode(1);
        mp1Var.setTextDirection(i);
        mp1Var.setTextAlignment(i2);
        fs fsVar = this.C0;
        int selectedItemPosition = fsVar.getSelectedItemPosition();
        mp1 mp1Var2 = this.L;
        if (prVar.isShowing() && mp1Var2 != null) {
            mp1Var2.setListSelectionHidden(false);
            mp1Var2.setSelection(selectedItemPosition);
            if (mp1Var2.getChoiceMode() != 0) {
                mp1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = fsVar.getViewTreeObserver()) != null) {
            wr wrVar = new wr(this, 1);
            viewTreeObserver.addOnGlobalLayoutListener(wrVar);
            prVar.setOnDismissListener(new bs(this, wrVar));
        }
    }

    @Override // defpackage.ax3, defpackage.es
    public final void n(ListAdapter listAdapter) {
        super.n(listAdapter);
        this.z0 = (zr) listAdapter;
    }

    public final void r() {
        int i;
        int i2;
        pr prVar = this.v0;
        Drawable background = prVar.getBackground();
        fs fsVar = this.C0;
        Rect rect = fsVar.g0;
        if (background != null) {
            background.getPadding(rect);
            boolean z = eq7.a;
            if (fsVar.getLayoutDirection() == 1) {
                i = rect.right;
            } else {
                i = -rect.left;
            }
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = fsVar.getPaddingLeft();
        int paddingRight = fsVar.getPaddingRight();
        int width = fsVar.getWidth();
        int i3 = fsVar.f0;
        if (i3 == -2) {
            int a = fsVar.a(this.z0, prVar.getBackground());
            int i4 = (fsVar.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a > i4) {
                a = i4;
            }
            q(Math.max(a, (width - paddingLeft) - paddingRight));
        } else if (i3 == -1) {
            q((width - paddingLeft) - paddingRight);
        } else {
            q(i3);
        }
        boolean z2 = eq7.a;
        if (fsVar.getLayoutDirection() == 1) {
            i2 = (((width - paddingRight) - this.X) - this.B0) + i;
        } else {
            i2 = paddingLeft + this.B0 + i;
        }
        this.Y = i2;
    }
}
