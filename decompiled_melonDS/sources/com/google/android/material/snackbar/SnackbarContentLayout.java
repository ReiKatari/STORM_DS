package com.google.android.material.snackbar;

import a.a;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {
    public TextView A;
    public Button B;
    public int L;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a.U(context, R.attr.motionEasingEmphasizedInterpolator, u9.a.f13511b);
    }

    public final boolean a(int i2, int i10, int i11) {
        boolean z10;
        if (i2 != getOrientation()) {
            setOrientation(i2);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.A.getPaddingTop() == i10 && this.A.getPaddingBottom() == i11) {
            return z10;
        }
        TextView textView = this.A;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i10, textView.getPaddingEnd(), i11);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i10, textView.getPaddingRight(), i11);
        return true;
    }

    public Button getActionView() {
        return this.B;
    }

    public TextView getMessageView() {
        return this.A;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.A = (TextView) findViewById(R.id.snackbar_text);
        this.B = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i10) {
        boolean z10;
        super.onMeasure(i2, i10);
        if (getOrientation() != 1) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
            Layout layout = this.A.getLayout();
            if (layout != null && layout.getLineCount() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && this.L > 0 && this.B.getMeasuredWidth() > this.L) {
                if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                    return;
                }
            } else {
                if (!z10) {
                    dimensionPixelSize = dimensionPixelSize2;
                }
                if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                    return;
                }
            }
            super.onMeasure(i2, i10);
        }
    }

    public void setMaxInlineActionWidth(int i2) {
        this.L = i2;
    }
}
