package q;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l0 extends d2 implements o0 {
    public final /* synthetic */ p0 A0;

    /* renamed from: w0  reason: collision with root package name */
    public CharSequence f11948w0;

    /* renamed from: x0  reason: collision with root package name */
    public i0 f11949x0;

    /* renamed from: y0  reason: collision with root package name */
    public final Rect f11950y0;

    /* renamed from: z0  reason: collision with root package name */
    public int f11951z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(p0 p0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.A0 = p0Var;
        this.f11950y0 = new Rect();
        this.f11872i0 = p0Var;
        this.f11881s0 = true;
        this.f11882t0.setFocusable(true);
        this.f11873j0 = new j0(0, this);
    }

    @Override // q.o0
    public final void f(CharSequence charSequence) {
        this.f11948w0 = charSequence;
    }

    @Override // q.o0
    public final void i(int i2) {
        this.f11951z0 = i2;
    }

    @Override // q.o0
    public final void k(int i2, int i10) {
        ViewTreeObserver viewTreeObserver;
        y yVar = this.f11882t0;
        boolean isShowing = yVar.isShowing();
        s();
        yVar.setInputMethodMode(2);
        c();
        r1 r1Var = this.L;
        r1Var.setChoiceMode(1);
        r1Var.setTextDirection(i2);
        r1Var.setTextAlignment(i10);
        p0 p0Var = this.A0;
        int selectedItemPosition = p0Var.getSelectedItemPosition();
        r1 r1Var2 = this.L;
        if (yVar.isShowing() && r1Var2 != null) {
            r1Var2.setListSelectionHidden(false);
            r1Var2.setSelection(selectedItemPosition);
            if (r1Var2.getChoiceMode() != 0) {
                r1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = p0Var.getViewTreeObserver()) != null) {
            p.d dVar = new p.d(3, this);
            viewTreeObserver.addOnGlobalLayoutListener(dVar);
            yVar.setOnDismissListener(new k0(this, dVar));
        }
    }

    @Override // q.o0
    public final CharSequence m() {
        return this.f11948w0;
    }

    @Override // q.d2, q.o0
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.f11949x0 = (i0) listAdapter;
    }

    public final void s() {
        int i2;
        int i10;
        y yVar = this.f11882t0;
        Drawable background = yVar.getBackground();
        p0 p0Var = this.A0;
        Rect rect = p0Var.f11986e0;
        if (background != null) {
            background.getPadding(rect);
            boolean z10 = u3.f12027a;
            if (p0Var.getLayoutDirection() == 1) {
                i2 = rect.right;
            } else {
                i2 = -rect.left;
            }
        } else {
            i2 = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = p0Var.getPaddingLeft();
        int paddingRight = p0Var.getPaddingRight();
        int width = p0Var.getWidth();
        int i11 = p0Var.f11985d0;
        if (i11 == -2) {
            int a10 = p0Var.a(this.f11949x0, yVar.getBackground());
            int i12 = (p0Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a10 > i12) {
                a10 = i12;
            }
            r(Math.max(a10, (width - paddingLeft) - paddingRight));
        } else if (i11 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i11);
        }
        boolean z11 = u3.f12027a;
        if (p0Var.getLayoutDirection() == 1) {
            i10 = (((width - paddingRight) - this.X) - this.f11951z0) + i2;
        } else {
            i10 = paddingLeft + this.f11951z0 + i2;
        }
        this.Y = i10;
    }
}
