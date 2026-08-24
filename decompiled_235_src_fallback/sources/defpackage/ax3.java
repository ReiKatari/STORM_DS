package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ax3  reason: default package */
/* loaded from: classes.dex */
public class ax3 implements defpackage.lh6 {
    public static final java.lang.reflect.Method w0 = null;
    public static final java.lang.reflect.Method x0 = null;
    public final android.content.Context A;
    public android.widget.ListAdapter B;
    public defpackage.mp1 L;
    public final int R;
    public int X;
    public int Y;
    public int Z;
    public final int d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public int h0;
    public final int i0;
    public defpackage.y71 j0;
    public android.view.View k0;
    public android.widget.AdapterView.OnItemClickListener l0;
    public android.widget.AdapterView.OnItemSelectedListener m0;
    public final defpackage.xw3 n0;
    public final defpackage.zw3 o0;
    public final defpackage.yw3 p0;
    public final defpackage.xw3 q0;
    public final android.os.Handler r0;
    public final android.graphics.Rect s0;
    public android.graphics.Rect t0;
    public boolean u0;
    public final defpackage.pr v0;

    static {
            java.lang.String r0 = "ListPopupWindow"
            java.lang.Class<android.widget.PopupWindow> r1 = android.widget.PopupWindow.class
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r2 > r3) goto L34
            r2 = 0
            r3 = 1
            java.lang.String r4 = "setClipToScreenEnabled"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L1b
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L1b
            r5[r2] = r6     // Catch: java.lang.NoSuchMethodException -> L1b
            java.lang.reflect.Method r4 = r1.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L1b
            defpackage.ax3.w0 = r4     // Catch: java.lang.NoSuchMethodException -> L1b
            goto L20
        L1b:
            java.lang.String r4 = "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well."
            android.util.Log.i(r0, r4)
        L20:
            java.lang.String r4 = "setEpicenterBounds"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L2f
            java.lang.Class<android.graphics.Rect> r5 = android.graphics.Rect.class
            r3[r2] = r5     // Catch: java.lang.NoSuchMethodException -> L2f
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r4, r3)     // Catch: java.lang.NoSuchMethodException -> L2f
            defpackage.ax3.x0 = r1     // Catch: java.lang.NoSuchMethodException -> L2f
            goto L34
        L2f:
            java.lang.String r1 = "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well."
            android.util.Log.i(r0, r1)
        L34:
            return
    }

    public ax3(android.content.Context r4, android.util.AttributeSet r5, int r6, int r7) {
            r3 = this;
            r3.<init>()
            r7 = -2
            r3.R = r7
            r3.X = r7
            r7 = 1002(0x3ea, float:1.404E-42)
            r3.d0 = r7
            r7 = 0
            r3.h0 = r7
            r0 = 2147483647(0x7fffffff, float:NaN)
            r3.i0 = r0
            xw3 r0 = new xw3
            r1 = 1
            r0.<init>(r3, r1)
            r3.n0 = r0
            zw3 r0 = new zw3
            r0.<init>(r3, r7)
            r3.o0 = r0
            yw3 r0 = new yw3
            r0.<init>(r3)
            r3.p0 = r0
            xw3 r0 = new xw3
            r0.<init>(r3, r7)
            r3.q0 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.s0 = r0
            r3.A = r4
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = r4.getMainLooper()
            r0.<init>(r2)
            r3.r0 = r0
            int[] r0 = defpackage.m75.o
            android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r5, r0, r6, r7)
            int r2 = r0.getDimensionPixelOffset(r7, r7)
            r3.Y = r2
            int r2 = r0.getDimensionPixelOffset(r1, r7)
            r3.Z = r2
            if (r2 == 0) goto L5b
            r3.e0 = r1
        L5b:
            r0.recycle()
            pr r0 = new pr
            r0.<init>(r4, r5, r6, r7)
            int[] r2 = defpackage.m75.s
            android.content.res.TypedArray r5 = r4.obtainStyledAttributes(r5, r2, r6, r7)
            r6 = 2
            boolean r2 = r5.hasValue(r6)
            if (r2 == 0) goto L77
            boolean r6 = r5.getBoolean(r6, r7)
            r0.setOverlapAnchor(r6)
        L77:
            boolean r6 = r5.hasValue(r7)
            if (r6 == 0) goto L88
            int r6 = r5.getResourceId(r7, r7)
            if (r6 == 0) goto L88
            android.graphics.drawable.Drawable r4 = defpackage.hf.S(r4, r6)
            goto L8c
        L88:
            android.graphics.drawable.Drawable r4 = r5.getDrawable(r7)
        L8c:
            r0.setBackgroundDrawable(r4)
            r5.recycle()
            r3.v0 = r0
            r0.setInputMethodMode(r1)
            return
    }

    @Override // defpackage.lh6
    public final boolean a() {
            r0 = this;
            pr r0 = r0.v0
            boolean r0 = r0.isShowing()
            return r0
    }

    public final int b() {
            r0 = this;
            int r0 = r0.Y
            return r0
    }

    public final void c(int r1) {
            r0 = this;
            r0.Y = r1
            return
    }

    @Override // defpackage.lh6
    public final void dismiss() {
            r2 = this;
            pr r0 = r2.v0
            r0.dismiss()
            r1 = 0
            r0.setContentView(r1)
            r2.L = r1
            android.os.Handler r0 = r2.r0
            xw3 r2 = r2.n0
            r0.removeCallbacks(r2)
            return
    }

    @Override // defpackage.lh6
    public final void e() {
            r13 = this;
            mp1 r0 = r13.L
            r1 = 2
            android.content.Context r2 = r13.A
            r3 = 1
            pr r4 = r13.v0
            if (r0 != 0) goto L49
            boolean r0 = r13.u0
            r0 = r0 ^ r3
            mp1 r0 = r13.p(r2, r0)
            r13.L = r0
            android.widget.ListAdapter r5 = r13.B
            r0.setAdapter(r5)
            mp1 r0 = r13.L
            android.widget.AdapterView$OnItemClickListener r5 = r13.l0
            r0.setOnItemClickListener(r5)
            mp1 r0 = r13.L
            r0.setFocusable(r3)
            mp1 r0 = r13.L
            r0.setFocusableInTouchMode(r3)
            mp1 r0 = r13.L
            np1 r5 = new np1
            r5.<init>(r13, r1)
            r0.setOnItemSelectedListener(r5)
            mp1 r0 = r13.L
            yw3 r5 = r13.p0
            r0.setOnScrollListener(r5)
            android.widget.AdapterView$OnItemSelectedListener r0 = r13.m0
            if (r0 == 0) goto L43
            mp1 r5 = r13.L
            r5.setOnItemSelectedListener(r0)
        L43:
            mp1 r0 = r13.L
            r4.setContentView(r0)
            goto L4f
        L49:
            android.view.View r0 = r4.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L4f:
            android.graphics.drawable.Drawable r0 = r4.getBackground()
            android.graphics.Rect r5 = r13.s0
            r6 = 0
            if (r0 == 0) goto L68
            r0.getPadding(r5)
            int r0 = r5.top
            int r7 = r5.bottom
            int r7 = r7 + r0
            boolean r8 = r13.e0
            if (r8 != 0) goto L6c
            int r0 = -r0
            r13.Z = r0
            goto L6c
        L68:
            r5.setEmpty()
            r7 = r6
        L6c:
            int r0 = r4.getInputMethodMode()
            if (r0 != r1) goto L74
            r0 = r3
            goto L75
        L74:
            r0 = r6
        L75:
            android.view.View r8 = r13.k0
            int r9 = r13.Z
            int r0 = defpackage.vw3.a(r4, r8, r9, r0)
            int r8 = r13.R
            r9 = -2
            r10 = -1
            if (r8 != r10) goto L85
            int r0 = r0 + r7
            goto Ld6
        L85:
            int r11 = r13.X
            if (r11 == r9) goto La7
            r12 = 1073741824(0x40000000, float:2.0)
            if (r11 == r10) goto L92
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r12)
            goto Lbd
        L92:
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            int r11 = r5.left
            int r5 = r5.right
            int r11 = r11 + r5
            int r2 = r2 - r11
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r12)
            goto Lbd
        La7:
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            int r11 = r5.left
            int r5 = r5.right
            int r11 = r11 + r5
            int r2 = r2 - r11
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
        Lbd:
            mp1 r5 = r13.L
            int r0 = r5.a(r2, r0)
            if (r0 <= 0) goto Ld4
            mp1 r2 = r13.L
            int r2 = r2.getPaddingTop()
            mp1 r5 = r13.L
            int r5 = r5.getPaddingBottom()
            int r5 = r5 + r2
            int r5 = r5 + r7
            goto Ld5
        Ld4:
            r5 = r6
        Ld5:
            int r0 = r0 + r5
        Ld6:
            int r2 = r4.getInputMethodMode()
            if (r2 != r1) goto Lde
            r1 = r3
            goto Ldf
        Lde:
            r1 = r6
        Ldf:
            int r2 = r13.d0
            r4.setWindowLayoutType(r2)
            boolean r2 = r4.isShowing()
            if (r2 == 0) goto L13d
            android.view.View r2 = r13.k0
            boolean r2 = r2.isAttachedToWindow()
            if (r2 != 0) goto Lf4
            goto L1d7
        Lf4:
            int r2 = r13.X
            if (r2 != r10) goto Lfa
            r2 = r10
            goto L102
        Lfa:
            if (r2 != r9) goto L102
            android.view.View r2 = r13.k0
            int r2 = r2.getWidth()
        L102:
            if (r8 != r10) goto L123
            if (r1 == 0) goto L108
            r8 = r0
            goto L109
        L108:
            r8 = r10
        L109:
            int r0 = r13.X
            if (r1 == 0) goto L119
            if (r0 != r10) goto L111
            r0 = r10
            goto L112
        L111:
            r0 = r6
        L112:
            r4.setWidth(r0)
            r4.setHeight(r6)
            goto L126
        L119:
            if (r0 != r10) goto L11c
            r6 = r10
        L11c:
            r4.setWidth(r6)
            r4.setHeight(r10)
            goto L126
        L123:
            if (r8 != r9) goto L126
            r8 = r0
        L126:
            r4.setOutsideTouchable(r3)
            android.view.View r5 = r13.k0
            int r6 = r13.Y
            int r7 = r13.Z
            if (r2 >= 0) goto L132
            r2 = r10
        L132:
            if (r8 >= 0) goto L137
            r9 = r10
        L135:
            r8 = r2
            goto L139
        L137:
            r9 = r8
            goto L135
        L139:
            r4.update(r5, r6, r7, r8, r9)
            return
        L13d:
            int r1 = r13.X
            if (r1 != r10) goto L143
            r1 = r10
            goto L14b
        L143:
            if (r1 != r9) goto L14b
            android.view.View r1 = r13.k0
            int r1 = r1.getWidth()
        L14b:
            if (r8 != r10) goto L14f
            r8 = r10
            goto L152
        L14f:
            if (r8 != r9) goto L152
            r8 = r0
        L152:
            r4.setWidth(r1)
            r4.setHeight(r8)
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r1 = "ListPopupWindow"
            r2 = 28
            if (r0 > r2) goto L174
            java.lang.reflect.Method r0 = defpackage.ax3.w0
            if (r0 == 0) goto L177
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L16e
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L16e
            r5[r6] = r7     // Catch: java.lang.Exception -> L16e
            r0.invoke(r4, r5)     // Catch: java.lang.Exception -> L16e
            goto L177
        L16e:
            java.lang.String r0 = "Could not call setClipToScreenEnabled() on PopupWindow. Oh well."
            android.util.Log.i(r1, r0)
            goto L177
        L174:
            defpackage.ww3.b(r4, r3)
        L177:
            r4.setOutsideTouchable(r3)
            zw3 r0 = r13.o0
            r4.setTouchInterceptor(r0)
            boolean r0 = r13.g0
            if (r0 == 0) goto L188
            boolean r0 = r13.f0
            r4.setOverlapAnchor(r0)
        L188:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 > r2) goto L1a1
            java.lang.reflect.Method r0 = defpackage.ax3.x0
            if (r0 == 0) goto L1a6
            android.graphics.Rect r2 = r13.t0     // Catch: java.lang.Exception -> L19a
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Exception -> L19a
            r0.invoke(r4, r2)     // Catch: java.lang.Exception -> L19a
            goto L1a6
        L19a:
            r0 = move-exception
            java.lang.String r2 = "Could not invoke setEpicenterBounds on PopupWindow"
            android.util.Log.e(r1, r2, r0)
            goto L1a6
        L1a1:
            android.graphics.Rect r0 = r13.t0
            defpackage.ww3.a(r4, r0)
        L1a6:
            android.view.View r0 = r13.k0
            int r1 = r13.Y
            int r2 = r13.Z
            int r5 = r13.h0
            r4.showAsDropDown(r0, r1, r2, r5)
            mp1 r0 = r13.L
            r0.setSelection(r10)
            boolean r0 = r13.u0
            if (r0 == 0) goto L1c2
            mp1 r0 = r13.L
            boolean r0 = r0.isInTouchMode()
            if (r0 == 0) goto L1cc
        L1c2:
            mp1 r0 = r13.L
            if (r0 == 0) goto L1cc
            r0.setListSelectionHidden(r3)
            r0.requestLayout()
        L1cc:
            boolean r0 = r13.u0
            if (r0 != 0) goto L1d7
            android.os.Handler r0 = r13.r0
            xw3 r13 = r13.q0
            r0.post(r13)
        L1d7:
            return
    }

    public final android.graphics.drawable.Drawable f() {
            r0 = this;
            pr r0 = r0.v0
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            return r0
    }

    public final void h(android.graphics.drawable.Drawable r1) {
            r0 = this;
            pr r0 = r0.v0
            r0.setBackgroundDrawable(r1)
            return
    }

    public final void i(int r1) {
            r0 = this;
            r0.Z = r1
            r1 = 1
            r0.e0 = r1
            return
    }

    @Override // defpackage.lh6
    public final defpackage.mp1 j() {
            r0 = this;
            mp1 r0 = r0.L
            return r0
    }

    public final int m() {
            r1 = this;
            boolean r0 = r1.e0
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            int r1 = r1.Z
            return r1
    }

    public void n(android.widget.ListAdapter r3) {
            r2 = this;
            y71 r0 = r2.j0
            if (r0 != 0) goto Ld
            y71 r0 = new y71
            r1 = 1
            r0.<init>(r2, r1)
            r2.j0 = r0
            goto L14
        Ld:
            android.widget.ListAdapter r1 = r2.B
            if (r1 == 0) goto L14
            r1.unregisterDataSetObserver(r0)
        L14:
            r2.B = r3
            if (r3 == 0) goto L1d
            y71 r0 = r2.j0
            r3.registerDataSetObserver(r0)
        L1d:
            mp1 r3 = r2.L
            if (r3 == 0) goto L26
            android.widget.ListAdapter r2 = r2.B
            r3.setAdapter(r2)
        L26:
            return
    }

    public defpackage.mp1 p(android.content.Context r1, boolean r2) {
            r0 = this;
            mp1 r0 = new mp1
            r0.<init>(r1, r2)
            return r0
    }

    public final void q(int r3) {
            r2 = this;
            pr r0 = r2.v0
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto L16
            android.graphics.Rect r1 = r2.s0
            r0.getPadding(r1)
            int r0 = r1.left
            int r1 = r1.right
            int r0 = r0 + r1
            int r0 = r0 + r3
            r2.X = r0
            return
        L16:
            r2.X = r3
            return
    }
}
