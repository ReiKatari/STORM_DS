package androidx.appcompat.widget;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ButtonBarLayout extends android.widget.LinearLayout {
    public boolean A;
    public boolean B;
    public int L;

    public ButtonBarLayout(android.content.Context r8, android.util.AttributeSet r9) {
            r7 = this;
            r7.<init>(r8, r9)
            r0 = -1
            r7.L = r0
            int[] r3 = defpackage.m75.k
            android.content.res.TypedArray r5 = r8.obtainStyledAttributes(r9, r3)
            r6 = 0
            r1 = r7
            r2 = r8
            r4 = r9
            defpackage.ao7.m(r1, r2, r3, r4, r5, r6)
            r7 = 0
            r8 = 1
            boolean r7 = r5.getBoolean(r7, r8)
            r1.A = r7
            r5.recycle()
            int r7 = r1.getOrientation()
            if (r7 != r8) goto L29
            boolean r7 = r1.A
            r1.setStacked(r7)
        L29:
            return
    }

    private void setStacked(boolean r2) {
            r1 = this;
            boolean r0 = r1.B
            if (r0 == r2) goto L3e
            if (r2 == 0) goto La
            boolean r0 = r1.A
            if (r0 == 0) goto L3e
        La:
            r1.B = r2
            r1.setOrientation(r2)
            if (r2 == 0) goto L15
            r0 = 8388613(0x800005, float:1.175495E-38)
            goto L17
        L15:
            r0 = 80
        L17:
            r1.setGravity(r0)
            r0 = 2131427900(0x7f0b023c, float:1.847743E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L2c
            if (r2 == 0) goto L28
            r2 = 8
            goto L29
        L28:
            r2 = 4
        L29:
            r0.setVisibility(r2)
        L2c:
            int r2 = r1.getChildCount()
            int r2 = r2 + (-2)
        L32:
            if (r2 < 0) goto L3e
            android.view.View r0 = r1.getChildAt(r2)
            r1.bringChildToFront(r0)
            int r2 = r2 + (-1)
            goto L32
        L3e:
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r7, int r8) {
            r6 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            boolean r1 = r6.A
            r2 = 0
            if (r1 == 0) goto L16
            int r1 = r6.L
            if (r0 <= r1) goto L14
            boolean r1 = r6.B
            if (r1 == 0) goto L14
            r6.setStacked(r2)
        L14:
            r6.L = r0
        L16:
            boolean r1 = r6.B
            r3 = 1
            if (r1 != 0) goto L2b
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r1 != r4) goto L2b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r1 = r3
            goto L2d
        L2b:
            r0 = r7
            r1 = r2
        L2d:
            super.onMeasure(r0, r8)
            boolean r0 = r6.A
            if (r0 == 0) goto L47
            boolean r0 = r6.B
            if (r0 != 0) goto L47
            int r0 = r6.getMeasuredWidthAndState()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r4
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            if (r0 != r4) goto L47
            r6.setStacked(r3)
            r1 = r3
        L47:
            if (r1 == 0) goto L4c
            super.onMeasure(r7, r8)
        L4c:
            int r0 = r6.getChildCount()
            r1 = r2
        L51:
            r4 = -1
            if (r1 >= r0) goto L62
            android.view.View r5 = r6.getChildAt(r1)
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L5f
            goto L63
        L5f:
            int r1 = r1 + 1
            goto L51
        L62:
            r1 = r4
        L63:
            if (r1 < 0) goto Lbc
            android.view.View r0 = r6.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            int r5 = r6.getPaddingTop()
            int r0 = r0.getMeasuredHeight()
            int r0 = r0 + r5
            int r5 = r2.topMargin
            int r0 = r0 + r5
            int r2 = r2.bottomMargin
            int r0 = r0 + r2
            boolean r2 = r6.B
            if (r2 == 0) goto Lb6
            int r1 = r1 + r3
            int r2 = r6.getChildCount()
        L87:
            if (r1 >= r2) goto L98
            android.view.View r3 = r6.getChildAt(r1)
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L95
            r4 = r1
            goto L98
        L95:
            int r1 = r1 + 1
            goto L87
        L98:
            if (r4 < 0) goto Lb4
            android.view.View r1 = r6.getChildAt(r4)
            int r1 = r1.getPaddingTop()
            android.content.res.Resources r2 = r6.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r3 = 1098907648(0x41800000, float:16.0)
            float r2 = r2 * r3
            int r2 = (int) r2
            int r1 = r1 + r2
            int r1 = r1 + r0
            r2 = r1
            goto Lbc
        Lb4:
            r2 = r0
            goto Lbc
        Lb6:
            int r1 = r6.getPaddingBottom()
            int r2 = r1 + r0
        Lbc:
            java.util.WeakHashMap r0 = defpackage.ao7.a
            int r0 = r6.getMinimumHeight()
            if (r0 == r2) goto Lcc
            r6.setMinimumHeight(r2)
            if (r8 != 0) goto Lcc
            super.onMeasure(r7, r8)
        Lcc:
            return
    }

    public void setAllowStacking(boolean r2) {
            r1 = this;
            boolean r0 = r1.A
            if (r0 == r2) goto L13
            r1.A = r2
            if (r2 != 0) goto L10
            boolean r2 = r1.B
            if (r2 == 0) goto L10
            r2 = 0
            r1.setStacked(r2)
        L10:
            r1.requestLayout()
        L13:
            return
    }
}
