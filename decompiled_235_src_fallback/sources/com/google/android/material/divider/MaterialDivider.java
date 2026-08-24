package com.google.android.material.divider;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class MaterialDivider extends android.view.View {
    public final defpackage.p24 A;
    public int B;
    public int L;
    public int R;
    public int d0;

    public MaterialDivider(android.content.Context r8, android.util.AttributeSet r9) {
            r7 = this;
            r0 = 2132018417(0x7f1404f1, float:1.967514E38)
            r4 = 2130969467(0x7f04037b, float:1.7547617E38)
            android.content.Context r8 = defpackage.q60.e0(r8, r9, r4, r0)
            r7.<init>(r8, r9, r4)
            android.content.Context r1 = r7.getContext()
            p24 r8 = new p24
            r8.<init>()
            r7.A = r8
            r8 = 0
            int[] r6 = new int[r8]
            int[] r3 = defpackage.a75.p
            r5 = 2132018417(0x7f1404f1, float:1.967514E38)
            r2 = r9
            android.content.res.TypedArray r9 = defpackage.f04.K(r1, r2, r3, r4, r5, r6)
            android.content.res.Resources r0 = r7.getResources()
            r2 = 2131165975(0x7f070317, float:1.7946182E38)
            int r0 = r0.getDimensionPixelSize(r2)
            r2 = 3
            int r0 = r9.getDimensionPixelSize(r2, r0)
            r7.B = r0
            r0 = 2
            int r0 = r9.getDimensionPixelOffset(r0, r8)
            r7.R = r0
            r0 = 1
            int r0 = r9.getDimensionPixelOffset(r0, r8)
            r7.d0 = r0
            android.content.res.ColorStateList r8 = defpackage.np2.S(r1, r9, r8)
            int r8 = r8.getDefaultColor()
            r7.setDividerColor(r8)
            r9.recycle()
            return
    }

    public int getDividerColor() {
            r0 = this;
            int r0 = r0.L
            return r0
    }

    public int getDividerInsetEnd() {
            r0 = this;
            int r0 = r0.d0
            return r0
    }

    public int getDividerInsetStart() {
            r0 = this;
            int r0 = r0.R
            return r0
    }

    public int getDividerThickness() {
            r0 = this;
            int r0 = r0.B
            return r0
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r6) {
            r5 = this;
            super.onDraw(r6)
            int r0 = r5.getLayoutDirection()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto Lc
            goto Ld
        Lc:
            r2 = r1
        Ld:
            if (r2 == 0) goto L12
            int r0 = r5.d0
            goto L14
        L12:
            int r0 = r5.R
        L14:
            if (r2 == 0) goto L1e
            int r2 = r5.getWidth()
            int r3 = r5.R
        L1c:
            int r2 = r2 - r3
            goto L25
        L1e:
            int r2 = r5.getWidth()
            int r3 = r5.d0
            goto L1c
        L25:
            int r3 = r5.getBottom()
            int r4 = r5.getTop()
            int r3 = r3 - r4
            p24 r5 = r5.A
            r5.setBounds(r0, r1, r2, r3)
            r5.draw(r6)
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r2, int r3) {
            r1 = this;
            super.onMeasure(r2, r3)
            int r2 = android.view.View.MeasureSpec.getMode(r3)
            int r3 = r1.getMeasuredHeight()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r0) goto L13
            if (r2 != 0) goto L12
            goto L13
        L12:
            return
        L13:
            int r2 = r1.B
            if (r2 <= 0) goto L1a
            if (r3 == r2) goto L1a
            r3 = r2
        L1a:
            int r2 = r1.getMeasuredWidth()
            r1.setMeasuredDimension(r2, r3)
            return
    }

    public void setDividerColor(int r2) {
            r1 = this;
            int r0 = r1.L
            if (r0 == r2) goto L12
            r1.L = r2
            p24 r0 = r1.A
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r0.n(r2)
            r1.invalidate()
        L12:
            return
    }

    public void setDividerColorResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            int r2 = r0.getColor(r2)
            r1.setDividerColor(r2)
            return
    }

    public void setDividerInsetEnd(int r1) {
            r0 = this;
            r0.d0 = r1
            return
    }

    public void setDividerInsetEndResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r2 = r0.getDimensionPixelOffset(r2)
            r1.setDividerInsetEnd(r2)
            return
    }

    public void setDividerInsetStart(int r1) {
            r0 = this;
            r0.R = r1
            return
    }

    public void setDividerInsetStartResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r2 = r0.getDimensionPixelOffset(r2)
            r1.setDividerInsetStart(r2)
            return
    }

    public void setDividerThickness(int r2) {
            r1 = this;
            int r0 = r1.B
            if (r0 == r2) goto L9
            r1.B = r2
            r1.requestLayout()
        L9:
            return
    }

    public void setDividerThicknessResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setDividerThickness(r2)
            return
    }
}
