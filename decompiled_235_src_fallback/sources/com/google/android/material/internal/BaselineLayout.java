package com.google.android.material.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class BaselineLayout extends android.view.ViewGroup {
    public int A;
    public boolean B;

    public BaselineLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            r2 = -1
            r1.A = r2
            return
    }

    @Override // android.view.View
    public int getBaseline() {
            r0 = this;
            int r0 = r0.A
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
            r6 = this;
            int r7 = r6.getChildCount()
            int r9 = r6.getPaddingLeft()
            int r10 = r10 - r8
            int r8 = r6.getPaddingRight()
            int r10 = r10 - r8
            int r10 = r10 - r9
            int r8 = r6.getPaddingTop()
            r11 = 0
        L14:
            if (r11 >= r7) goto L4d
            android.view.View r0 = r6.getChildAt(r11)
            int r1 = r0.getVisibility()
            r2 = 8
            if (r1 != r2) goto L23
            goto L4a
        L23:
            int r1 = r0.getMeasuredWidth()
            int r2 = r0.getMeasuredHeight()
            int r3 = r10 - r1
            int r3 = r3 / 2
            int r3 = r3 + r9
            int r4 = r6.A
            r5 = -1
            if (r4 == r5) goto L44
            int r4 = r0.getBaseline()
            if (r4 == r5) goto L44
            int r4 = r6.A
            int r4 = r4 + r8
            int r5 = r0.getBaseline()
            int r4 = r4 - r5
            goto L45
        L44:
            r4 = r8
        L45:
            int r1 = r1 + r3
            int r2 = r2 + r4
            r0.layout(r3, r4, r1, r2)
        L4a:
            int r11 = r11 + 1
            goto L14
        L4d:
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r13, int r14) {
            r12 = this;
            int r0 = r12.getChildCount()
            r1 = 0
            r2 = -1
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r2
            r8 = r7
        Lc:
            if (r1 >= r0) goto L54
            android.view.View r9 = r12.getChildAt(r1)
            int r10 = r9.getVisibility()
            r11 = 8
            if (r10 != r11) goto L1b
            goto L51
        L1b:
            r12.measureChild(r9, r13, r14)
            int r10 = r9.getMeasuredHeight()
            int r3 = java.lang.Math.max(r3, r10)
            int r10 = r9.getBaseline()
            if (r10 == r2) goto L39
            int r7 = java.lang.Math.max(r7, r10)
            int r11 = r9.getMeasuredHeight()
            int r11 = r11 - r10
            int r8 = java.lang.Math.max(r8, r11)
        L39:
            int r10 = r9.getMeasuredWidth()
            int r5 = java.lang.Math.max(r5, r10)
            int r10 = r9.getMeasuredHeight()
            int r4 = java.lang.Math.max(r4, r10)
            int r9 = r9.getMeasuredState()
            int r6 = android.view.View.combineMeasuredStates(r6, r9)
        L51:
            int r1 = r1 + 1
            goto Lc
        L54:
            if (r7 == r2) goto L69
            boolean r0 = r12.B
            if (r0 == 0) goto L67
            int r0 = r12.getPaddingBottom()
            int r0 = java.lang.Math.max(r8, r0)
            int r0 = r0 + r7
            int r4 = java.lang.Math.max(r4, r0)
        L67:
            r12.A = r7
        L69:
            boolean r0 = r12.B
            if (r0 == 0) goto L6e
            goto L74
        L6e:
            int r0 = r12.getPaddingBottom()
            int r4 = r0 + r3
        L74:
            int r0 = r12.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r4, r0)
            int r1 = r12.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r5, r1)
            int r13 = android.view.View.resolveSizeAndState(r1, r13, r6)
            int r1 = r6 << 16
            int r14 = android.view.View.resolveSizeAndState(r0, r14, r1)
            r12.setMeasuredDimension(r13, r14)
            return
    }

    public void setMeasurePaddingFromBaseline(boolean r1) {
            r0 = this;
            r0.B = r1
            return
    }
}
