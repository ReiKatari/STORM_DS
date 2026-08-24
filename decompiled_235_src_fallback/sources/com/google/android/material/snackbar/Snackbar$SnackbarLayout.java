package com.google.android.material.snackbar;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class Snackbar$SnackbarLayout extends defpackage.u20 {
    public Snackbar$SnackbarLayout(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.u20, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r6, int r7) {
            r5 = this;
            super.onMeasure(r6, r7)
            int r6 = r5.getChildCount()
            int r7 = r5.getMeasuredWidth()
            int r0 = r5.getPaddingLeft()
            int r7 = r7 - r0
            int r0 = r5.getPaddingRight()
            int r7 = r7 - r0
            r0 = 0
        L16:
            if (r0 >= r6) goto L39
            android.view.View r1 = r5.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            int r2 = r2.width
            r3 = -1
            if (r2 != r3) goto L36
            r2 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r2)
            int r4 = r1.getMeasuredHeight()
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            r1.measure(r3, r2)
        L36:
            int r0 = r0 + 1
            goto L16
        L39:
            return
    }

    @Override // defpackage.u20, android.view.View
    public /* bridge */ /* synthetic */ void setBackground(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackground(r1)
            return
    }

    @Override // defpackage.u20, android.view.View
    public /* bridge */ /* synthetic */ void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            return
    }

    @Override // defpackage.u20, android.view.View
    public /* bridge */ /* synthetic */ void setBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            super.setBackgroundTintList(r1)
            return
    }

    @Override // defpackage.u20, android.view.View
    public /* bridge */ /* synthetic */ void setBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            super.setBackgroundTintMode(r1)
            return
    }

    @Override // defpackage.u20, android.view.View
    public /* bridge */ /* synthetic */ void setLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            super.setLayoutParams(r1)
            return
    }

    @Override // defpackage.u20, android.view.View
    public /* bridge */ /* synthetic */ void setOnClickListener(android.view.View.OnClickListener r1) {
            r0 = this;
            super.setOnClickListener(r1)
            return
    }
}
