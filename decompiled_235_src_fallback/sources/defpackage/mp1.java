package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mp1  reason: default package */
/* loaded from: classes.dex */
public class mp1 extends android.widget.ListView {
    public final android.graphics.Rect A;
    public int B;
    public int L;
    public int R;
    public int d0;
    public int e0;
    public defpackage.kp1 f0;
    public boolean g0;
    public final boolean h0;
    public boolean i0;
    public defpackage.fx3 j0;
    public defpackage.g15 k0;

    public mp1(android.content.Context r3, boolean r4) {
            r2 = this;
            r0 = 0
            r1 = 2130969042(0x7f0401d2, float:1.7546755E38)
            r2.<init>(r3, r0, r1)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r2.A = r3
            r3 = 0
            r2.B = r3
            r2.L = r3
            r2.R = r3
            r2.d0 = r3
            r2.h0 = r4
            r2.setCacheColorHint(r3)
            return
    }

    public final int a(int r12, int r13) {
            r11 = this;
            int r0 = r11.getListPaddingTop()
            int r1 = r11.getListPaddingBottom()
            int r2 = r11.getDividerHeight()
            android.graphics.drawable.Drawable r3 = r11.getDivider()
            android.widget.ListAdapter r4 = r11.getAdapter()
            if (r4 != 0) goto L18
            int r0 = r0 + r1
            return r0
        L18:
            int r0 = r0 + r1
            r1 = 0
            if (r2 <= 0) goto L1f
            if (r3 == 0) goto L1f
            goto L20
        L1f:
            r2 = r1
        L20:
            int r3 = r4.getCount()
            r5 = 0
            r6 = r1
            r7 = r6
            r8 = r5
        L28:
            if (r6 >= r3) goto L66
            int r9 = r4.getItemViewType(r6)
            if (r9 == r7) goto L32
            r8 = r5
            r7 = r9
        L32:
            android.view.View r8 = r4.getView(r6, r8, r11)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            if (r9 != 0) goto L43
            android.view.ViewGroup$LayoutParams r9 = r11.generateDefaultLayoutParams()
            r8.setLayoutParams(r9)
        L43:
            int r9 = r9.height
            if (r9 <= 0) goto L4e
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            goto L52
        L4e:
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
        L52:
            r8.measure(r12, r9)
            r8.forceLayout()
            if (r6 <= 0) goto L5b
            int r0 = r0 + r2
        L5b:
            int r9 = r8.getMeasuredHeight()
            int r0 = r0 + r9
            if (r0 < r13) goto L63
            return r13
        L63:
            int r6 = r6 + 1
            goto L28
        L66:
            return r0
    }

    public final boolean b(android.view.MotionEvent r18, int r19) {
            r17 = this;
            r1 = r17
            r2 = r18
            int r3 = r2.getActionMasked()
            r4 = 1
            r5 = 0
            if (r3 == r4) goto L1c
            r0 = 2
            if (r3 == r0) goto L1a
            r0 = 3
            if (r3 == r0) goto L16
            r0 = r4
            r4 = r5
            goto L146
        L16:
            r0 = r5
            r4 = r0
            goto L146
        L1a:
            r0 = r4
            goto L1d
        L1c:
            r0 = r5
        L1d:
            int r6 = r18.findPointerIndex(r19)
            if (r6 >= 0) goto L24
            goto L16
        L24:
            float r7 = r2.getX(r6)
            int r7 = (int) r7
            float r6 = r2.getY(r6)
            int r6 = (int) r6
            int r8 = r1.pointToPosition(r7, r6)
            r9 = -1
            if (r8 != r9) goto L37
            goto L146
        L37:
            int r0 = r1.getFirstVisiblePosition()
            int r0 = r8 - r0
            android.view.View r10 = r1.getChildAt(r0)
            float r7 = (float) r7
            float r6 = (float) r6
            r1.i0 = r4
            defpackage.hp1.a(r1, r7, r6)
            boolean r0 = r1.isPressed()
            if (r0 != 0) goto L51
            r1.setPressed(r4)
        L51:
            r1.layoutChildren()
            int r0 = r1.e0
            if (r0 == r9) goto L6e
            int r11 = r1.getFirstVisiblePosition()
            int r0 = r0 - r11
            android.view.View r0 = r1.getChildAt(r0)
            if (r0 == 0) goto L6e
            if (r0 == r10) goto L6e
            boolean r11 = r0.isPressed()
            if (r11 == 0) goto L6e
            r0.setPressed(r5)
        L6e:
            r1.e0 = r8
            int r0 = r10.getLeft()
            float r0 = (float) r0
            float r0 = r7 - r0
            int r11 = r10.getTop()
            float r11 = (float) r11
            float r11 = r6 - r11
            defpackage.hp1.a(r10, r0, r11)
            boolean r0 = r10.isPressed()
            if (r0 != 0) goto L8a
            r10.setPressed(r4)
        L8a:
            android.graphics.drawable.Drawable r11 = r1.getSelector()
            if (r11 == 0) goto L94
            if (r8 == r9) goto L94
            r12 = r4
            goto L95
        L94:
            r12 = r5
        L95:
            if (r12 == 0) goto L9a
            r11.setVisible(r5, r5)
        L9a:
            int r0 = r10.getLeft()
            int r13 = r10.getTop()
            int r14 = r10.getRight()
            int r15 = r10.getBottom()
            r16 = r4
            android.graphics.Rect r4 = r1.A
            r4.set(r0, r13, r14, r15)
            int r0 = r4.left
            int r13 = r1.B
            int r0 = r0 - r13
            r4.left = r0
            int r0 = r4.top
            int r13 = r1.L
            int r0 = r0 - r13
            r4.top = r0
            int r0 = r4.right
            int r13 = r1.R
            int r0 = r0 + r13
            r4.right = r0
            int r0 = r4.bottom
            int r13 = r1.d0
            int r0 = r0 + r13
            r4.bottom = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r13 = 33
            if (r0 < r13) goto Ld8
            boolean r0 = defpackage.jp1.a(r1)
            goto Le6
        Ld8:
            java.lang.reflect.Field r0 = defpackage.lp1.a
            if (r0 == 0) goto Le5
            boolean r0 = r0.getBoolean(r1)     // Catch: java.lang.IllegalAccessException -> Le1
            goto Le6
        Le1:
            r0 = move-exception
            r0.printStackTrace()
        Le5:
            r0 = r5
        Le6:
            boolean r14 = r10.isEnabled()
            if (r14 == r0) goto L10b
            r0 = r0 ^ 1
            int r14 = android.os.Build.VERSION.SDK_INT
            if (r14 < r13) goto Lf6
            defpackage.jp1.b(r1, r0)
            goto L106
        Lf6:
            java.lang.reflect.Field r13 = defpackage.lp1.a
            if (r13 == 0) goto L106
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.IllegalAccessException -> L102
            r13.set(r1, r0)     // Catch: java.lang.IllegalAccessException -> L102
            goto L106
        L102:
            r0 = move-exception
            r0.printStackTrace()
        L106:
            if (r8 == r9) goto L10b
            r1.refreshDrawableState()
        L10b:
            if (r12 == 0) goto L125
            float r0 = r4.exactCenterX()
            float r4 = r4.exactCenterY()
            int r12 = r1.getVisibility()
            if (r12 != 0) goto L11e
            r12 = r16
            goto L11f
        L11e:
            r12 = r5
        L11f:
            r11.setVisible(r12, r5)
            r11.setHotspot(r0, r4)
        L125:
            android.graphics.drawable.Drawable r0 = r1.getSelector()
            if (r0 == 0) goto L130
            if (r8 == r9) goto L130
            r0.setHotspot(r7, r6)
        L130:
            kp1 r0 = r1.f0
            if (r0 == 0) goto L136
            r0.B = r5
        L136:
            r1.refreshDrawableState()
            r4 = r16
            if (r3 != r4) goto L144
            long r3 = r1.getItemIdAtPosition(r8)
            r1.performItemClick(r10, r8, r3)
        L144:
            r4 = r5
            r0 = 1
        L146:
            if (r0 == 0) goto L14a
            if (r4 == 0) goto L162
        L14a:
            r1.i0 = r5
            r1.setPressed(r5)
            r1.drawableStateChanged()
            int r3 = r1.e0
            int r4 = r1.getFirstVisiblePosition()
            int r3 = r3 - r4
            android.view.View r3 = r1.getChildAt(r3)
            if (r3 == 0) goto L162
            r3.setPressed(r5)
        L162:
            fx3 r3 = r1.j0
            if (r0 == 0) goto L17a
            if (r3 != 0) goto L16f
            fx3 r3 = new fx3
            r3.<init>(r1)
            r1.j0 = r3
        L16f:
            fx3 r3 = r1.j0
            boolean r4 = r3.l0
            r4 = 1
            r3.l0 = r4
            r3.onTouch(r1, r2)
            goto L185
        L17a:
            if (r3 == 0) goto L185
            boolean r1 = r3.l0
            if (r1 == 0) goto L183
            r3.d()
        L183:
            r3.l0 = r5
        L185:
            return r0
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(android.graphics.Canvas r3) {
            r2 = this;
            android.graphics.Rect r0 = r2.A
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L14
            android.graphics.drawable.Drawable r1 = r2.getSelector()
            if (r1 == 0) goto L14
            r1.setBounds(r0)
            r1.draw(r3)
        L14:
            super.dispatchDraw(r3)
            return
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
            r2 = this;
            g15 r0 = r2.k0
            if (r0 == 0) goto L5
            goto L26
        L5:
            super.drawableStateChanged()
            kp1 r0 = r2.f0
            if (r0 == 0) goto Lf
            r1 = 1
            r0.B = r1
        Lf:
            android.graphics.drawable.Drawable r0 = r2.getSelector()
            if (r0 == 0) goto L26
            boolean r1 = r2.i0
            if (r1 == 0) goto L26
            boolean r1 = r2.isPressed()
            if (r1 == 0) goto L26
            int[] r2 = r2.getDrawableState()
            r0.setState(r2)
        L26:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
            r1 = this;
            boolean r0 = r1.h0
            if (r0 != 0) goto Ld
            boolean r1 = super.hasFocus()
            if (r1 == 0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            return r1
        Ld:
            r1 = 1
            return r1
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
            r1 = this;
            boolean r0 = r1.h0
            if (r0 != 0) goto Ld
            boolean r1 = super.hasWindowFocus()
            if (r1 == 0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            return r1
        Ld:
            r1 = 1
            return r1
    }

    @Override // android.view.View
    public final boolean isFocused() {
            r1 = this;
            boolean r0 = r1.h0
            if (r0 != 0) goto Ld
            boolean r1 = super.isFocused()
            if (r1 == 0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            return r1
        Ld:
            r1 = 1
            return r1
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
            r1 = this;
            boolean r0 = r1.h0
            if (r0 == 0) goto L8
            boolean r0 = r1.g0
            if (r0 != 0) goto Le
        L8:
            boolean r1 = super.isInTouchMode()
            if (r1 == 0) goto L10
        Le:
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            r0 = 0
            r1.k0 = r0
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent r7) {
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto Lb
            boolean r6 = super.onHoverEvent(r7)
            return r6
        Lb:
            int r1 = r7.getActionMasked()
            r2 = 10
            if (r1 != r2) goto L22
            g15 r2 = r6.k0
            if (r2 != 0) goto L22
            g15 r2 = new g15
            r3 = 5
            r2.<init>(r6, r3)
            r6.k0 = r2
            r6.post(r2)
        L22:
            boolean r2 = super.onHoverEvent(r7)
            r3 = 9
            r4 = -1
            if (r1 == r3) goto L33
            r3 = 7
            if (r1 != r3) goto L2f
            goto L33
        L2f:
            r6.setSelection(r4)
            return r2
        L33:
            float r1 = r7.getX()
            int r1 = (int) r1
            float r7 = r7.getY()
            int r7 = (int) r7
            int r7 = r6.pointToPosition(r1, r7)
            if (r7 == r4) goto Lc1
            int r1 = r6.getSelectedItemPosition()
            if (r7 == r1) goto Lc1
            int r1 = r6.getFirstVisiblePosition()
            int r1 = r7 - r1
            android.view.View r1 = r6.getChildAt(r1)
            boolean r3 = r1.isEnabled()
            if (r3 == 0) goto Laa
            r6.requestFocus()
            r3 = 30
            if (r0 < r3) goto L9e
            boolean r0 = defpackage.ip1.d
            if (r0 == 0) goto L9e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.reflect.Method r3 = defpackage.ip1.a     // Catch: java.lang.reflect.InvocationTargetException -> L92 java.lang.IllegalAccessException -> L94
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L92 java.lang.IllegalAccessException -> L94
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.reflect.InvocationTargetException -> L92 java.lang.IllegalAccessException -> L94
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r1, r5, r0, r0}     // Catch: java.lang.reflect.InvocationTargetException -> L92 java.lang.IllegalAccessException -> L94
            r3.invoke(r6, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L92 java.lang.IllegalAccessException -> L94
            java.lang.reflect.Method r0 = defpackage.ip1.b     // Catch: java.lang.reflect.InvocationTargetException -> L92 java.lang.IllegalAccessException -> L94
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L92 java.lang.IllegalAccessException -> L94
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.reflect.InvocationTargetException -> L92 java.lang.IllegalAccessException -> L94
            r0.invoke(r6, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L92 java.lang.IllegalAccessException -> L94
            java.lang.reflect.Method r0 = defpackage.ip1.c     // Catch: java.lang.reflect.InvocationTargetException -> L92 java.lang.IllegalAccessException -> L94
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L92 java.lang.IllegalAccessException -> L94
            java.lang.Object[] r7 = new java.lang.Object[]{r7}     // Catch: java.lang.reflect.InvocationTargetException -> L92 java.lang.IllegalAccessException -> L94
            r0.invoke(r6, r7)     // Catch: java.lang.reflect.InvocationTargetException -> L92 java.lang.IllegalAccessException -> L94
            goto Laa
        L92:
            r7 = move-exception
            goto L96
        L94:
            r7 = move-exception
            goto L9a
        L96:
            r7.printStackTrace()
            goto Laa
        L9a:
            r7.printStackTrace()
            goto Laa
        L9e:
            int r0 = r1.getTop()
            int r1 = r6.getTop()
            int r0 = r0 - r1
            r6.setSelectionFromTop(r7, r0)
        Laa:
            android.graphics.drawable.Drawable r7 = r6.getSelector()
            if (r7 == 0) goto Lc1
            boolean r0 = r6.i0
            if (r0 == 0) goto Lc1
            boolean r0 = r6.isPressed()
            if (r0 == 0) goto Lc1
            int[] r6 = r6.getDrawableState()
            r7.setState(r6)
        Lc1:
            return r2
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getAction()
            if (r0 == 0) goto L7
            goto L17
        L7:
            float r0 = r4.getX()
            int r0 = (int) r0
            float r1 = r4.getY()
            int r1 = (int) r1
            int r0 = r3.pointToPosition(r0, r1)
            r3.e0 = r0
        L17:
            g15 r0 = r3.k0
            if (r0 == 0) goto L25
            java.lang.Object r1 = r0.B
            mp1 r1 = (defpackage.mp1) r1
            r2 = 0
            r1.k0 = r2
            r1.removeCallbacks(r0)
        L25:
            boolean r3 = super.onTouchEvent(r4)
            return r3
    }

    public void setListSelectionHidden(boolean r1) {
            r0 = this;
            r0.g0 = r1
            return
    }

    @Override // android.widget.AbsListView
    public void setSelector(android.graphics.drawable.Drawable r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L18
            kp1 r1 = new kp1
            r1.<init>()
            android.graphics.drawable.Drawable r2 = r1.A
            if (r2 == 0) goto Lf
            r2.setCallback(r0)
        Lf:
            r1.A = r4
            r4.setCallback(r1)
            r0 = 1
            r1.B = r0
            r0 = r1
        L18:
            r3.f0 = r0
            super.setSelector(r0)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            if (r4 == 0) goto L27
            r4.getPadding(r0)
        L27:
            int r4 = r0.left
            r3.B = r4
            int r4 = r0.top
            r3.L = r4
            int r4 = r0.right
            r3.R = r4
            int r4 = r0.bottom
            r3.d0 = r4
            return
    }
}
