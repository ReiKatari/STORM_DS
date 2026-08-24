package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gl0  reason: default package */
/* loaded from: classes.dex */
public final class gl0 extends defpackage.t44 implements android.view.View.OnKeyListener, android.widget.PopupWindow.OnDismissListener {
    public final android.content.Context B;
    public final int L;
    public final int R;
    public final boolean X;
    public final android.os.Handler Y;
    public final java.util.ArrayList Z;
    public final java.util.ArrayList d0;
    public final defpackage.wr e0;
    public final defpackage.wh f0;
    public final defpackage.os0 g0;
    public int h0;
    public int i0;
    public android.view.View j0;
    public android.view.View k0;
    public int l0;
    public boolean m0;
    public boolean n0;
    public int o0;
    public int p0;
    public boolean q0;
    public boolean r0;
    public defpackage.a54 s0;
    public android.view.ViewTreeObserver t0;
    public android.widget.PopupWindow.OnDismissListener u0;
    public boolean v0;

    public gl0(android.content.Context r5, android.view.View r6, int r7, boolean r8) {
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.Z = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.d0 = r0
            wr r0 = new wr
            r1 = 2
            r0.<init>(r4, r1)
            r4.e0 = r0
            wh r0 = new wh
            r2 = 1
            r0.<init>(r4, r2)
            r4.f0 = r0
            os0 r0 = new os0
            r3 = 21
            r0.<init>(r4, r3)
            r4.g0 = r0
            r0 = 0
            r4.h0 = r0
            r4.i0 = r0
            r4.B = r5
            r4.j0 = r6
            r4.R = r7
            r4.X = r8
            r4.q0 = r0
            int r6 = r6.getLayoutDirection()
            if (r6 != r2) goto L40
            r2 = r0
        L40:
            r4.l0 = r2
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r6 = r5.getDisplayMetrics()
            int r6 = r6.widthPixels
            int r6 = r6 / r1
            r7 = 2131165207(0x7f070017, float:1.7944625E38)
            int r5 = r5.getDimensionPixelSize(r7)
            int r5 = java.lang.Math.max(r6, r5)
            r4.L = r5
            android.os.Handler r5 = new android.os.Handler
            r5.<init>()
            r4.Y = r5
            return
    }

    @Override // defpackage.lh6
    public final boolean a() {
            r2 = this;
            java.util.ArrayList r2 = r2.d0
            int r0 = r2.size()
            r1 = 0
            if (r0 <= 0) goto L1b
            java.lang.Object r2 = r2.get(r1)
            fl0 r2 = (defpackage.fl0) r2
            z44 r2 = r2.a
            pr r2 = r2.v0
            boolean r2 = r2.isShowing()
            if (r2 == 0) goto L1b
            r2 = 1
            return r2
        L1b:
            return r1
    }

    @Override // defpackage.b54
    public final boolean b(defpackage.it6 r8) {
            r7 = this;
            java.util.ArrayList r0 = r7.d0
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L8:
            r4 = 1
            if (r3 >= r1) goto L1f
            java.lang.Object r5 = r0.get(r3)
            int r3 = r3 + 1
            fl0 r5 = (defpackage.fl0) r5
            i44 r6 = r5.b
            if (r8 != r6) goto L8
            z44 r7 = r5.a
            mp1 r7 = r7.L
            r7.requestFocus()
            return r4
        L1f:
            boolean r0 = r8.hasVisibleItems()
            if (r0 == 0) goto L30
            r7.l(r8)
            a54 r7 = r7.s0
            if (r7 == 0) goto L2f
            r7.M(r8)
        L2f:
            return r4
        L30:
            return r2
    }

    @Override // defpackage.b54
    public final boolean c() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.b54
    public final void d(defpackage.i44 r7, boolean r8) {
            r6 = this;
            java.util.ArrayList r0 = r6.d0
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r1) goto L18
            java.lang.Object r4 = r0.get(r3)
            fl0 r4 = (defpackage.fl0) r4
            i44 r4 = r4.b
            if (r7 != r4) goto L15
            goto L19
        L15:
            int r3 = r3 + 1
            goto L8
        L18:
            r3 = -1
        L19:
            if (r3 >= 0) goto L1d
            goto La7
        L1d:
            int r1 = r3 + 1
            int r4 = r0.size()
            if (r1 >= r4) goto L30
            java.lang.Object r1 = r0.get(r1)
            fl0 r1 = (defpackage.fl0) r1
            i44 r1 = r1.b
            r1.c(r2)
        L30:
            java.lang.Object r1 = r0.remove(r3)
            fl0 r1 = (defpackage.fl0) r1
            i44 r3 = r1.b
            z44 r1 = r1.a
            pr r4 = r1.v0
            r3.r(r6)
            boolean r3 = r6.v0
            r5 = 0
            if (r3 == 0) goto L4a
            defpackage.w44.b(r4, r5)
            r4.setAnimationStyle(r2)
        L4a:
            r1.dismiss()
            int r1 = r0.size()
            r3 = 1
            if (r1 <= 0) goto L61
            int r4 = r1 + (-1)
            java.lang.Object r4 = r0.get(r4)
            fl0 r4 = (defpackage.fl0) r4
            int r4 = r4.c
            r6.l0 = r4
            goto L6e
        L61:
            android.view.View r4 = r6.j0
            int r4 = r4.getLayoutDirection()
            if (r4 != r3) goto L6b
            r4 = r2
            goto L6c
        L6b:
            r4 = r3
        L6c:
            r6.l0 = r4
        L6e:
            if (r1 != 0) goto L9a
            r6.dismiss()
            a54 r8 = r6.s0
            if (r8 == 0) goto L7a
            r8.d(r7, r3)
        L7a:
            android.view.ViewTreeObserver r7 = r6.t0
            if (r7 == 0) goto L8d
            boolean r7 = r7.isAlive()
            if (r7 == 0) goto L8b
            android.view.ViewTreeObserver r7 = r6.t0
            wr r8 = r6.e0
            r7.removeGlobalOnLayoutListener(r8)
        L8b:
            r6.t0 = r5
        L8d:
            android.view.View r7 = r6.k0
            wh r8 = r6.f0
            r7.removeOnAttachStateChangeListener(r8)
            android.widget.PopupWindow$OnDismissListener r6 = r6.u0
            r6.onDismiss()
            return
        L9a:
            if (r8 == 0) goto La7
            java.lang.Object r6 = r0.get(r2)
            fl0 r6 = (defpackage.fl0) r6
            i44 r6 = r6.b
            r6.c(r2)
        La7:
            return
    }

    @Override // defpackage.lh6
    public final void dismiss() {
            r3 = this;
            java.util.ArrayList r3 = r3.d0
            int r0 = r3.size()
            if (r0 <= 0) goto L28
            fl0[] r1 = new defpackage.fl0[r0]
            java.lang.Object[] r3 = r3.toArray(r1)
            fl0[] r3 = (defpackage.fl0[]) r3
            int r0 = r0 + (-1)
        L12:
            if (r0 < 0) goto L28
            r1 = r3[r0]
            z44 r2 = r1.a
            pr r2 = r2.v0
            boolean r2 = r2.isShowing()
            if (r2 == 0) goto L25
            z44 r1 = r1.a
            r1.dismiss()
        L25:
            int r0 = r0 + (-1)
            goto L12
        L28:
            return
    }

    @Override // defpackage.lh6
    public final void e() {
            r5 = this;
            boolean r0 = r5.a()
            if (r0 == 0) goto L7
            goto L3f
        L7:
            java.util.ArrayList r0 = r5.Z
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        Lf:
            if (r3 >= r1) goto L1d
            java.lang.Object r4 = r0.get(r3)
            int r3 = r3 + 1
            i44 r4 = (defpackage.i44) r4
            r5.u(r4)
            goto Lf
        L1d:
            r0.clear()
            android.view.View r0 = r5.j0
            r5.k0 = r0
            if (r0 == 0) goto L3f
            android.view.ViewTreeObserver r1 = r5.t0
            if (r1 != 0) goto L2b
            r2 = 1
        L2b:
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r5.t0 = r0
            if (r2 == 0) goto L38
            wr r1 = r5.e0
            r0.addOnGlobalLayoutListener(r1)
        L38:
            android.view.View r0 = r5.k0
            wh r5 = r5.f0
            r0.addOnAttachStateChangeListener(r5)
        L3f:
            return
    }

    @Override // defpackage.b54
    public final void g(defpackage.a54 r1) {
            r0 = this;
            r0.s0 = r1
            return
    }

    @Override // defpackage.b54
    public final void i() {
            r4 = this;
            java.util.ArrayList r4 = r4.d0
            int r0 = r4.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L2c
            java.lang.Object r2 = r4.get(r1)
            int r1 = r1 + 1
            fl0 r2 = (defpackage.fl0) r2
            z44 r2 = r2.a
            mp1 r2 = r2.L
            android.widget.ListAdapter r2 = r2.getAdapter()
            boolean r3 = r2 instanceof android.widget.HeaderViewListAdapter
            if (r3 == 0) goto L26
            android.widget.HeaderViewListAdapter r2 = (android.widget.HeaderViewListAdapter) r2
            android.widget.ListAdapter r2 = r2.getWrappedAdapter()
            f44 r2 = (defpackage.f44) r2
            goto L28
        L26:
            f44 r2 = (defpackage.f44) r2
        L28:
            r2.notifyDataSetChanged()
            goto L7
        L2c:
            return
    }

    @Override // defpackage.lh6
    public final defpackage.mp1 j() {
            r1 = this;
            java.util.ArrayList r1 = r1.d0
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto La
            r1 = 0
            return r1
        La:
            int r0 = r1.size()
            int r0 = r0 + (-1)
            java.lang.Object r1 = r1.get(r0)
            fl0 r1 = (defpackage.fl0) r1
            z44 r1 = r1.a
            mp1 r1 = r1.L
            return r1
    }

    @Override // defpackage.t44
    public final void l(defpackage.i44 r2) {
            r1 = this;
            android.content.Context r0 = r1.B
            r2.b(r1, r0)
            boolean r0 = r1.a()
            if (r0 == 0) goto Lf
            r1.u(r2)
            return
        Lf:
            java.util.ArrayList r1 = r1.Z
            r1.add(r2)
            return
    }

    @Override // defpackage.t44
    public final void n(android.view.View r2) {
            r1 = this;
            android.view.View r0 = r1.j0
            if (r0 == r2) goto L12
            r1.j0 = r2
            int r0 = r1.h0
            int r2 = r2.getLayoutDirection()
            int r2 = android.view.Gravity.getAbsoluteGravity(r0, r2)
            r1.i0 = r2
        L12:
            return
    }

    @Override // defpackage.t44
    public final void o(boolean r1) {
            r0 = this;
            r0.q0 = r1
            return
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
            r5 = this;
            java.util.ArrayList r5 = r5.d0
            int r0 = r5.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L1e
            java.lang.Object r3 = r5.get(r2)
            fl0 r3 = (defpackage.fl0) r3
            z44 r4 = r3.a
            pr r4 = r4.v0
            boolean r4 = r4.isShowing()
            if (r4 != 0) goto L1b
            goto L1f
        L1b:
            int r2 = r2 + 1
            goto L8
        L1e:
            r3 = 0
        L1f:
            if (r3 == 0) goto L26
            i44 r5 = r3.b
            r5.c(r1)
        L26:
            return
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(android.view.View r1, int r2, android.view.KeyEvent r3) {
            r0 = this;
            int r1 = r3.getAction()
            r3 = 1
            if (r1 != r3) goto Lf
            r1 = 82
            if (r2 != r1) goto Lf
            r0.dismiss()
            return r3
        Lf:
            r0 = 0
            return r0
    }

    @Override // defpackage.t44
    public final void p(int r2) {
            r1 = this;
            int r0 = r1.h0
            if (r0 == r2) goto L12
            r1.h0 = r2
            android.view.View r0 = r1.j0
            int r0 = r0.getLayoutDirection()
            int r2 = android.view.Gravity.getAbsoluteGravity(r2, r0)
            r1.i0 = r2
        L12:
            return
    }

    @Override // defpackage.t44
    public final void q(int r2) {
            r1 = this;
            r0 = 1
            r1.m0 = r0
            r1.o0 = r2
            return
    }

    @Override // defpackage.t44
    public final void r(android.widget.PopupWindow.OnDismissListener r1) {
            r0 = this;
            r0.u0 = r1
            return
    }

    @Override // defpackage.t44
    public final void s(boolean r1) {
            r0 = this;
            r0.r0 = r1
            return
    }

    @Override // defpackage.t44
    public final void t(int r2) {
            r1 = this;
            r0 = 1
            r1.n0 = r0
            r1.p0 = r2
            return
    }

    public final void u(defpackage.i44 r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            android.content.Context r2 = r0.B
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r2)
            f44 r4 = new f44
            boolean r5 = r0.X
            r6 = 2131623947(0x7f0e000b, float:1.887506E38)
            r4.<init>(r1, r3, r5, r6)
            boolean r5 = r0.a()
            r6 = 1
            r7 = 0
            if (r5 != 0) goto L23
            boolean r5 = r0.q0
            if (r5 == 0) goto L23
            r4.L = r6
            goto L4a
        L23:
            boolean r5 = r0.a()
            if (r5 == 0) goto L4a
            java.util.ArrayList r5 = r1.f
            int r5 = r5.size()
            r8 = r7
        L30:
            if (r8 >= r5) goto L47
            android.view.MenuItem r9 = r1.getItem(r8)
            boolean r10 = r9.isVisible()
            if (r10 == 0) goto L44
            android.graphics.drawable.Drawable r9 = r9.getIcon()
            if (r9 == 0) goto L44
            r5 = r6
            goto L48
        L44:
            int r8 = r8 + 1
            goto L30
        L47:
            r5 = r7
        L48:
            r4.L = r5
        L4a:
            int r5 = r0.L
            int r5 = defpackage.t44.m(r4, r2, r5)
            z44 r8 = new z44
            int r9 = r0.R
            r10 = 0
            r8.<init>(r2, r10, r9, r7)
            os0 r2 = r0.g0
            r8.y0 = r2
            r8.l0 = r0
            pr r2 = r8.v0
            r2.setOnDismissListener(r0)
            android.view.View r9 = r0.j0
            r8.k0 = r9
            int r9 = r0.i0
            r8.h0 = r9
            r8.u0 = r6
            r2.setFocusable(r6)
            r9 = 2
            r2.setInputMethodMode(r9)
            r8.n(r4)
            r8.q(r5)
            int r4 = r0.i0
            r8.h0 = r4
            java.util.ArrayList r4 = r0.d0
            int r11 = r4.size()
            if (r11 <= 0) goto L102
            int r11 = r4.size()
            int r11 = r11 - r6
            java.lang.Object r11 = r4.get(r11)
            fl0 r11 = (defpackage.fl0) r11
            i44 r12 = r11.b
            java.util.ArrayList r13 = r12.f
            int r13 = r13.size()
            r14 = r7
        L9a:
            if (r14 >= r13) goto Lb1
            android.view.MenuItem r15 = r12.getItem(r14)
            boolean r16 = r15.hasSubMenu()
            if (r16 == 0) goto Lad
            android.view.SubMenu r9 = r15.getSubMenu()
            if (r1 != r9) goto Lad
            goto Lb2
        Lad:
            int r14 = r14 + 1
            r9 = 2
            goto L9a
        Lb1:
            r15 = r10
        Lb2:
            if (r15 != 0) goto Lb8
            r17 = r7
            r6 = r10
            goto L106
        Lb8:
            z44 r9 = r11.a
            mp1 r9 = r9.L
            android.widget.ListAdapter r12 = r9.getAdapter()
            boolean r13 = r12 instanceof android.widget.HeaderViewListAdapter
            if (r13 == 0) goto Ld1
            android.widget.HeaderViewListAdapter r12 = (android.widget.HeaderViewListAdapter) r12
            int r13 = r12.getHeadersCount()
            android.widget.ListAdapter r12 = r12.getWrappedAdapter()
            f44 r12 = (defpackage.f44) r12
            goto Ld4
        Ld1:
            f44 r12 = (defpackage.f44) r12
            r13 = r7
        Ld4:
            int r14 = r12.getCount()
            r10 = r7
            r17 = r10
        Ldb:
            r7 = -1
            if (r10 >= r14) goto Le9
            o44 r6 = r12.b(r10)
            if (r15 != r6) goto Le5
            goto Lea
        Le5:
            int r10 = r10 + 1
            r6 = 1
            goto Ldb
        Le9:
            r10 = r7
        Lea:
            if (r10 != r7) goto Lee
        Lec:
            r6 = 0
            goto L106
        Lee:
            int r10 = r10 + r13
            int r6 = r9.getFirstVisiblePosition()
            int r10 = r10 - r6
            if (r10 < 0) goto Lec
            int r6 = r9.getChildCount()
            if (r10 < r6) goto Lfd
            goto Lec
        Lfd:
            android.view.View r6 = r9.getChildAt(r10)
            goto L106
        L102:
            r17 = r7
            r6 = 0
            r11 = 0
        L106:
            if (r6 == 0) goto L1df
            int r7 = android.os.Build.VERSION.SDK_INT
            r9 = 28
            if (r7 > r9) goto L126
            java.lang.reflect.Method r7 = defpackage.z44.z0
            if (r7 == 0) goto L11c
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch: java.lang.Exception -> L11e
            java.lang.Boolean r9 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L11e
            r10[r17] = r9     // Catch: java.lang.Exception -> L11e
            r7.invoke(r2, r10)     // Catch: java.lang.Exception -> L11e
        L11c:
            r7 = 0
            goto L12c
        L11e:
            java.lang.String r7 = "MenuPopupWindow"
            java.lang.String r9 = "Could not invoke setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r7, r9)
            goto L11c
        L126:
            r7 = r17
            defpackage.x44.a(r2, r7)
            goto L11c
        L12c:
            defpackage.w44.a(r2, r7)
            int r2 = r4.size()
            r18 = 1
            int r2 = r2 + (-1)
            java.lang.Object r2 = r4.get(r2)
            fl0 r2 = (defpackage.fl0) r2
            z44 r2 = r2.a
            mp1 r2 = r2.L
            r7 = 2
            int[] r9 = new int[r7]
            r2.getLocationOnScreen(r9)
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            android.view.View r10 = r0.k0
            r10.getWindowVisibleDisplayFrame(r7)
            int r10 = r0.l0
            r12 = 1
            if (r10 != r12) goto L16a
            r17 = 0
            r9 = r9[r17]
            int r2 = r2.getWidth()
            int r2 = r2 + r9
            int r2 = r2 + r5
            int r7 = r7.right
            if (r2 <= r7) goto L168
            r2 = r17
        L166:
            r9 = 1
            goto L174
        L168:
            r2 = 1
            goto L166
        L16a:
            r17 = 0
            r2 = r9[r17]
            int r2 = r2 - r5
            if (r2 >= 0) goto L172
            goto L168
        L172:
            r2 = 0
            goto L166
        L174:
            if (r2 != r9) goto L178
            r9 = 1
            goto L179
        L178:
            r9 = 0
        L179:
            r0.l0 = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r7 = 26
            r10 = 5
            if (r2 < r7) goto L187
            r8.k0 = r6
            r2 = 0
            r7 = 0
            goto L1be
        L187:
            r7 = 2
            int[] r2 = new int[r7]
            android.view.View r12 = r0.j0
            r12.getLocationOnScreen(r2)
            int[] r7 = new int[r7]
            r6.getLocationOnScreen(r7)
            int r12 = r0.i0
            r12 = r12 & 7
            r17 = 0
            if (r12 != r10) goto L1b0
            r12 = r2[r17]
            android.view.View r13 = r0.j0
            int r13 = r13.getWidth()
            int r13 = r13 + r12
            r2[r17] = r13
            r12 = r7[r17]
            int r13 = r6.getWidth()
            int r13 = r13 + r12
            r7[r17] = r13
        L1b0:
            r12 = r7[r17]
            r13 = r2[r17]
            int r12 = r12 - r13
            r18 = 1
            r7 = r7[r18]
            r2 = r2[r18]
            int r7 = r7 - r2
            r2 = r7
            r7 = r12
        L1be:
            int r12 = r0.i0
            r12 = r12 & r10
            if (r12 != r10) goto L1cd
            if (r9 == 0) goto L1c7
            int r7 = r7 + r5
            goto L1d4
        L1c7:
            int r5 = r6.getWidth()
        L1cb:
            int r7 = r7 - r5
            goto L1d4
        L1cd:
            if (r9 == 0) goto L1cb
            int r5 = r6.getWidth()
            int r7 = r7 + r5
        L1d4:
            r8.Y = r7
            r9 = 1
            r8.g0 = r9
            r8.f0 = r9
            r8.i(r2)
            goto L1fd
        L1df:
            boolean r2 = r0.m0
            if (r2 == 0) goto L1e7
            int r2 = r0.o0
            r8.Y = r2
        L1e7:
            boolean r2 = r0.n0
            if (r2 == 0) goto L1f0
            int r2 = r0.p0
            r8.i(r2)
        L1f0:
            android.graphics.Rect r2 = r0.A
            if (r2 == 0) goto L1fa
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>(r2)
            goto L1fb
        L1fa:
            r7 = 0
        L1fb:
            r8.t0 = r7
        L1fd:
            fl0 r2 = new fl0
            int r5 = r0.l0
            r2.<init>(r8, r1, r5)
            r4.add(r2)
            r8.e()
            mp1 r2 = r8.L
            r2.setOnKeyListener(r0)
            if (r11 != 0) goto L23b
            boolean r0 = r0.r0
            if (r0 == 0) goto L23b
            java.lang.CharSequence r0 = r1.m
            if (r0 == 0) goto L23b
            r0 = 2131623954(0x7f0e0012, float:1.8875074E38)
            r7 = 0
            android.view.View r0 = r3.inflate(r0, r2, r7)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r3 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0.setEnabled(r7)
            java.lang.CharSequence r1 = r1.m
            r3.setText(r1)
            r1 = 0
            r2.addHeaderView(r0, r1, r7)
            r8.e()
        L23b:
            return
    }
}
