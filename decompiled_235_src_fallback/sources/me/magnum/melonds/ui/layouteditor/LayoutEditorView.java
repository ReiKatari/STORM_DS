package me.magnum.melonds.ui.layouteditor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class LayoutEditorView extends defpackage.un3 {
    public static final /* synthetic */ int p0 = 0;
    public defpackage.io2 R;
    public defpackage.qn2 d0;
    public android.view.View.OnClickListener e0;
    public final defpackage.ex6 f0;
    public final defpackage.ex6 g0;
    public defpackage.zj3 h0;
    public me.magnum.melonds.ui.layouteditor.LayoutEditorView.a i0;
    public boolean j0;
    public defpackage.fo2 k0;
    public defpackage.qn2 l0;
    public android.graphics.Rect m0;
    public final android.graphics.Paint n0;
    public final android.graphics.Paint o0;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public enum a extends java.lang.Enum {
        private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
        private static final /* synthetic */ me.magnum.melonds.ui.layouteditor.LayoutEditorView.a[] $VALUES = null;
        public static final me.magnum.melonds.ui.layouteditor.LayoutEditorView.a BOTTOM_LEFT = null;
        public static final me.magnum.melonds.ui.layouteditor.LayoutEditorView.a BOTTOM_RIGHT = null;
        public static final me.magnum.melonds.ui.layouteditor.LayoutEditorView.a TOP_LEFT = null;
        public static final me.magnum.melonds.ui.layouteditor.LayoutEditorView.a TOP_RIGHT = null;

        private static final /* synthetic */ me.magnum.melonds.ui.layouteditor.LayoutEditorView.a[] $values() {
                me.magnum.melonds.ui.layouteditor.LayoutEditorView$a r0 = me.magnum.melonds.ui.layouteditor.LayoutEditorView.a.TOP_LEFT
                me.magnum.melonds.ui.layouteditor.LayoutEditorView$a r1 = me.magnum.melonds.ui.layouteditor.LayoutEditorView.a.TOP_RIGHT
                me.magnum.melonds.ui.layouteditor.LayoutEditorView$a r2 = me.magnum.melonds.ui.layouteditor.LayoutEditorView.a.BOTTOM_LEFT
                me.magnum.melonds.ui.layouteditor.LayoutEditorView$a r3 = me.magnum.melonds.ui.layouteditor.LayoutEditorView.a.BOTTOM_RIGHT
                me.magnum.melonds.ui.layouteditor.LayoutEditorView$a[] r0 = new me.magnum.melonds.ui.layouteditor.LayoutEditorView.a[]{r0, r1, r2, r3}
                return r0
        }

        static {
                me.magnum.melonds.ui.layouteditor.LayoutEditorView$a r0 = new me.magnum.melonds.ui.layouteditor.LayoutEditorView$a
                java.lang.String r1 = "TOP_LEFT"
                r2 = 0
                r0.<init>(r1, r2)
                me.magnum.melonds.ui.layouteditor.LayoutEditorView.a.TOP_LEFT = r0
                me.magnum.melonds.ui.layouteditor.LayoutEditorView$a r0 = new me.magnum.melonds.ui.layouteditor.LayoutEditorView$a
                java.lang.String r1 = "TOP_RIGHT"
                r2 = 1
                r0.<init>(r1, r2)
                me.magnum.melonds.ui.layouteditor.LayoutEditorView.a.TOP_RIGHT = r0
                me.magnum.melonds.ui.layouteditor.LayoutEditorView$a r0 = new me.magnum.melonds.ui.layouteditor.LayoutEditorView$a
                java.lang.String r1 = "BOTTOM_LEFT"
                r2 = 2
                r0.<init>(r1, r2)
                me.magnum.melonds.ui.layouteditor.LayoutEditorView.a.BOTTOM_LEFT = r0
                me.magnum.melonds.ui.layouteditor.LayoutEditorView$a r0 = new me.magnum.melonds.ui.layouteditor.LayoutEditorView$a
                java.lang.String r1 = "BOTTOM_RIGHT"
                r2 = 3
                r0.<init>(r1, r2)
                me.magnum.melonds.ui.layouteditor.LayoutEditorView.a.BOTTOM_RIGHT = r0
                me.magnum.melonds.ui.layouteditor.LayoutEditorView$a[] r0 = $values()
                me.magnum.melonds.ui.layouteditor.LayoutEditorView.a.$VALUES = r0
                u52 r0 = defpackage.nc1.L(r0)
                me.magnum.melonds.ui.layouteditor.LayoutEditorView.a.$ENTRIES = r0
                return
        }

        a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static defpackage.t52 getEntries() {
                t52 r0 = me.magnum.melonds.ui.layouteditor.LayoutEditorView.a.$ENTRIES
                return r0
        }

        public static me.magnum.melonds.ui.layouteditor.LayoutEditorView.a valueOf(java.lang.String r1) {
                java.lang.Class<me.magnum.melonds.ui.layouteditor.LayoutEditorView$a> r0 = me.magnum.melonds.ui.layouteditor.LayoutEditorView.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                me.magnum.melonds.ui.layouteditor.LayoutEditorView$a r1 = (me.magnum.melonds.ui.layouteditor.LayoutEditorView.a) r1
                return r1
        }

        public static me.magnum.melonds.ui.layouteditor.LayoutEditorView.a[] values() {
                me.magnum.melonds.ui.layouteditor.LayoutEditorView$a[] r0 = me.magnum.melonds.ui.layouteditor.LayoutEditorView.a.$VALUES
                java.lang.Object r0 = r0.clone()
                me.magnum.melonds.ui.layouteditor.LayoutEditorView$a[] r0 = (me.magnum.melonds.ui.layouteditor.LayoutEditorView.a[]) r0
                return r0
        }
    }

    public LayoutEditorView(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            r5.getClass()
            r4.<init>(r5, r6)
            ej0 r6 = new ej0
            r0 = 3
            r6.<init>(r5, r0)
            ex6 r0 = new ex6
            r0.<init>(r6)
            r4.f0 = r0
            ej0 r6 = new ej0
            r0 = 4
            r6.<init>(r5, r0)
            ex6 r5 = new ex6
            r5.<init>(r6)
            r4.g0 = r5
            me.magnum.melonds.ui.layouteditor.LayoutEditorView$a r5 = me.magnum.melonds.ui.layouteditor.LayoutEditorView.a.TOP_LEFT
            r4.i0 = r5
            android.graphics.Rect r5 = new android.graphics.Rect
            r6 = 0
            r5.<init>(r6, r6, r6, r6)
            r4.m0 = r5
            android.graphics.Paint r5 = new android.graphics.Paint
            r0 = 1
            r5.<init>(r0)
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r5.setStyle(r1)
            r2 = 1065353216(0x3f800000, float:1.0)
            r5.setStrokeWidth(r2)
            java.lang.String r2 = "#15FFFFFF"
            int r2 = android.graphics.Color.parseColor(r2)
            r5.setColor(r2)
            r4.n0 = r5
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>(r0)
            r5.setStyle(r1)
            r0 = 1069547520(0x3fc00000, float:1.5)
            r5.setStrokeWidth(r0)
            java.lang.String r0 = "#3300E5FF"
            int r0 = android.graphics.Color.parseColor(r0)
            r5.setColor(r0)
            android.graphics.DashPathEffect r0 = new android.graphics.DashPathEffect
            r1 = 2
            float[] r2 = new float[r1]
            r2 = {x007a: FILL_ARRAY_DATA  , data: [1092616192, 1092616192} // fill-array
            r3 = 0
            r0.<init>(r2, r3)
            r5.setPathEffect(r0)
            r4.o0 = r5
            r4.setWillNotDraw(r6)
            hr0 r5 = new hr0
            r5.<init>(r4, r1)
            super.setOnClickListener(r5)
            return
    }

    private final int getDefaultComponentWidth() {
            r0 = this;
            ex6 r0 = r0.f0
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
    }

    private final int getMinComponentSize() {
            r0 = this;
            ex6 r0 = r0.g0
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
    }

    private final void setupDragHandler(defpackage.zj3 r4) {
            r3 = this;
            android.view.GestureDetector r0 = new android.view.GestureDetector
            android.content.Context r1 = r3.getContext()
            nl3 r2 = new nl3
            r2.<init>(r3, r4)
            r0.<init>(r1, r2)
            android.view.View r1 = r4.a
            ml3 r2 = new ml3
            r2.<init>(r3, r4, r0)
            r1.setOnTouchListener(r2)
            return
    }

    @Override // defpackage.un3
    public final void e(defpackage.ff7 r2, defpackage.sn3 r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            r0 = 0
            r1.h0 = r0
            super.e(r2, r3)
            r2 = 0
            r1.j0 = r2
            r1.p()
            return
    }

    @Override // defpackage.un3
    public final void f(defpackage.zj3 r2) {
            r1 = this;
            r1.setupDragHandler(r2)
            android.view.View r1 = r2.a
            r0 = 1056964608(0x3f000000, float:0.5)
            r1.setAlpha(r0)
            r1 = 0
            r2.c(r1)
            return
    }

    public final void g(defpackage.nj3 r8) {
            r7 = this;
            r8.getClass()
            int[] r0 = defpackage.ll3.a
            int r1 = r8.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L4a;
                case 2: goto L4a;
                case 3: goto L3c;
                case 4: goto L3c;
                case 5: goto L2e;
                case 6: goto L2e;
                case 7: goto L1d;
                case 8: goto L1d;
                default: goto Le;
            }
        Le:
            android.content.Context r0 = r7.getContext()
            r0.getClass()
            r1 = 1109393408(0x42200000, float:40.0)
            float r0 = defpackage.np2.K(r0, r1)
        L1b:
            int r0 = (int) r0
            goto L58
        L1d:
            int r0 = r7.getWidth()
            float r0 = (float) r0
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            int r0 = (int) r0
            int r1 = r7.getDefaultComponentWidth()
            if (r0 >= r1) goto L58
            r0 = r1
            goto L58
        L2e:
            android.content.Context r0 = r7.getContext()
            r0.getClass()
            r1 = 1113063424(0x42580000, float:54.0)
            float r0 = defpackage.np2.K(r0, r1)
            goto L1b
        L3c:
            android.content.Context r0 = r7.getContext()
            r0.getClass()
            r1 = 1113587712(0x42600000, float:56.0)
            float r0 = defpackage.np2.K(r0, r1)
            goto L1b
        L4a:
            android.content.Context r0 = r7.getContext()
            r0.getClass()
            r1 = 1124859904(0x430c0000, float:140.0)
            float r0 = defpackage.np2.K(r0, r1)
            goto L1b
        L58:
            bk3 r1 = r7.getViewBuilderFactory()
            ak3 r1 = r1.a(r8)
            float r2 = (float) r0
            float r1 = r1.b()
            float r2 = r2 / r1
            int r1 = (int) r2
            int r2 = r7.getMinComponentSize()
            if (r1 >= r2) goto L6e
            r1 = r2
        L6e:
            int r2 = r7.getWidth()
            int r2 = r2 - r0
            int r2 = r2 / 2
            r3 = 0
            if (r2 >= 0) goto L79
            r2 = r3
        L79:
            int r4 = r7.getHeight()
            int r4 = r4 - r1
            int r4 = r4 / 2
            if (r4 >= 0) goto L83
            r4 = r3
        L83:
            j05 r5 = new j05
            me.magnum.melonds.domain.model.Rect r6 = new me.magnum.melonds.domain.model.Rect
            r6.<init>(r2, r4, r0, r1)
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r6, r8, r0, r3)
            zj3 r0 = r7.a(r5)
            java.util.Map r1 = r7.getViews()
            r1.put(r8, r0)
            r8 = 1
            r7.j0 = r8
            r7.p()
            return
    }

    public final android.graphics.Rect getSafeAreaInsets() {
            r0 = this;
            android.graphics.Rect r0 = r0.m0
            return r0
    }

    public final defpackage.nj3 getSelectedComponent() {
            r0 = this;
            zj3 r0 = r0.h0
            if (r0 == 0) goto L7
            nj3 r0 = r0.b
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final java.util.ArrayList h() {
            r6 = this;
            java.util.Map r6 = r6.getViews()
            java.util.Collection r6 = r6.values()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.ht0.v0(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L19:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r6.next()
            zj3 r1 = (defpackage.zj3) r1
            j05 r2 = new j05
            me.magnum.melonds.domain.model.Rect r3 = r1.b()
            nj3 r4 = r1.b
            float r5 = r1.c
            boolean r1 = r1.d
            r2.<init>(r3, r4, r5, r1)
            r0.add(r2)
            goto L19
        L38:
            return r0
    }

    public final defpackage.uj3 i(defpackage.zj3 r8) {
            r7 = this;
            my4 r0 = r8.a()
            uj3 r1 = new uj3
            nj3 r2 = r8.b
            int r3 = r0.a
            int r4 = r0.b
            int r0 = r7.getWidth()
            android.view.View r8 = r8.a
            int r5 = r8.getWidth()
            int r0 = r0 - r5
            r5 = 0
            int r0 = java.lang.Math.max(r0, r5)
            int r7 = r7.getHeight()
            int r8 = r8.getHeight()
            int r7 = r7 - r8
            int r6 = java.lang.Math.max(r7, r5)
            r5 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    public final void j() {
            r5 = this;
            zj3 r0 = r5.h0
            if (r0 != 0) goto L5
            return
        L5:
            android.view.View r1 = r0.a
            int r2 = r5.getWidth()
            android.graphics.Rect r3 = r5.m0
            int r4 = r3.left
            int r2 = r2 - r4
            int r3 = r3.right
            int r2 = r2 - r3
            int r3 = r1.getWidth()
            int r2 = r2 - r3
            int r2 = r2 / 2
            int r2 = r2 + r4
            my4 r0 = r0.a()
            int r0 = r0.b
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            if (r3 == 0) goto L37
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            r3.leftMargin = r2
            r3.topMargin = r0
            r1.setLayoutParams(r3)
            r0 = 1
            r5.j0 = r0
            r5.p()
            return
        L37:
            java.lang.String r5 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            defpackage.u34.x(r5)
            return
    }

    public final void k() {
            r5 = this;
            zj3 r0 = r5.h0
            if (r0 != 0) goto L5
            return
        L5:
            android.view.View r1 = r0.a
            int r2 = r5.getHeight()
            android.graphics.Rect r3 = r5.m0
            int r4 = r3.top
            int r2 = r2 - r4
            int r3 = r3.bottom
            int r2 = r2 - r3
            int r3 = r1.getHeight()
            int r2 = r2 - r3
            int r2 = r2 / 2
            int r2 = r2 + r4
            my4 r0 = r0.a()
            int r0 = r0.a
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            if (r3 == 0) goto L37
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            r3.leftMargin = r0
            r3.topMargin = r2
            r1.setLayoutParams(r3)
            r0 = 1
            r5.j0 = r0
            r5.p()
            return
        L37:
            java.lang.String r5 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            defpackage.u34.x(r5)
            return
    }

    public final boolean l(boolean r6) {
            r5 = this;
            java.util.Map r0 = r5.getViews()
            java.util.Collection r0 = r0.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = defpackage.gt0.k1(r0)
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto L16
            return r2
        L16:
            zj3 r1 = r5.h0
            r3 = -1
            if (r1 == 0) goto L20
            int r1 = r0.indexOf(r1)
            goto L21
        L20:
            r1 = r3
        L21:
            r4 = 1
            if (r1 >= 0) goto L2e
            if (r6 == 0) goto L28
            r6 = r2
            goto L3c
        L28:
            int r6 = r0.size()
            int r6 = r6 - r4
            goto L3c
        L2e:
            if (r6 == 0) goto L31
            r3 = r4
        L31:
            int r1 = r1 + r3
            int r6 = r0.size()
            int r6 = r6 + r1
            int r1 = r0.size()
            int r6 = r6 % r1
        L3c:
            java.lang.Object r6 = r0.get(r6)
            zj3 r6 = (defpackage.zj3) r6
            zj3 r0 = r5.h0
            if (r0 == 0) goto L56
            if (r0 == r6) goto L49
            goto L4a
        L49:
            r0 = 0
        L4a:
            if (r0 == 0) goto L56
            android.view.View r1 = r0.a
            r3 = 1056964608(0x3f000000, float:0.5)
            r1.setAlpha(r3)
            r0.c(r2)
        L56:
            r5.v(r6)
            android.view.View r5 = r6.a
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.setAlpha(r0)
            r6.c(r4)
            return r4
    }

    public final void m() {
            r2 = this;
            zj3 r0 = r2.h0
            if (r0 != 0) goto L5
            return
        L5:
            android.view.View r1 = r0.a
            r2.removeView(r1)
            java.util.Map r1 = r2.getViews()
            nj3 r0 = r0.b
            r1.remove(r0)
            r2.n()
            r0 = 1
            r2.j0 = r0
            r2.p()
            return
    }

    public final void n() {
            r3 = this;
            zj3 r0 = r3.h0
            if (r0 == 0) goto L16
            android.view.View r1 = r0.a
            r2 = 1056964608(0x3f000000, float:0.5)
            r1.setAlpha(r2)
            r1 = 0
            r0.c(r1)
            qn2 r1 = r3.d0
            if (r1 == 0) goto L16
            r1.g(r0)
        L16:
            r0 = 0
            r3.h0 = r0
            return
    }

    public final void o(defpackage.zj3 r6, float r7, float r8) {
            r5 = this;
            my4 r0 = r6.a()
            int r1 = r5.getWidth()
            android.view.View r6 = r6.a
            int r2 = r6.getWidth()
            int r1 = r1 - r2
            float r1 = (float) r1
            r2 = 0
            float r1 = java.lang.Math.max(r2, r1)
            int r3 = r5.getHeight()
            int r4 = r6.getHeight()
            int r3 = r3 - r4
            float r3 = (float) r3
            float r3 = java.lang.Math.max(r2, r3)
            int r4 = r0.a
            float r4 = (float) r4
            float r4 = r4 + r7
            float r7 = java.lang.Math.max(r4, r2)
            float r7 = java.lang.Math.min(r7, r1)
            int r0 = r0.b
            float r0 = (float) r0
            float r0 = r0 + r8
            float r8 = java.lang.Math.max(r0, r2)
            float r8 = java.lang.Math.min(r8, r3)
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            if (r0 == 0) goto L53
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            r0.leftMargin = r7
            r0.topMargin = r8
            r6.setLayoutParams(r0)
            r6 = 1
            r5.j0 = r6
            r5.p()
            return
        L53:
            java.lang.String r5 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            defpackage.u34.x(r5)
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r14) {
            r13 = this;
            r14.getClass()
            super.onDraw(r14)
            int r0 = r13.getWidth()
            float r4 = (float) r0
            int r0 = r13.getHeight()
            float r9 = (float) r0
            r0 = 0
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 <= 0) goto L75
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r1 > 0) goto L1b
            goto L75
        L1b:
            r1 = 1073741824(0x40000000, float:2.0)
            float r6 = r4 / r1
            float r3 = r9 / r1
            r7 = 0
            android.graphics.Paint r10 = r13.o0
            r8 = r6
            r5 = r14
            r5.drawLine(r6, r7, r8, r9, r10)
            r1 = r5
            r14 = r6
            r6 = r10
            r2 = 0
            r5 = r3
            r1.drawLine(r2, r3, r4, r5, r6)
            r11 = r3
            android.content.Context r2 = r13.getContext()
            r2.getClass()
            r3 = 1107296256(0x42000000, float:32.0)
            float r12 = defpackage.np2.K(r2, r3)
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 <= 0) goto L75
            r6 = r12
        L44:
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            android.graphics.Paint r10 = r13.n0
            r7 = 1082130432(0x40800000, float:4.0)
            if (r0 >= 0) goto L5e
            float r0 = r6 - r14
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 <= 0) goto L5c
            r7 = 0
            r8 = r6
            r5 = r1
            r5.drawLine(r6, r7, r8, r9, r10)
        L5c:
            float r6 = r6 + r12
            goto L44
        L5e:
            r6 = r10
            r3 = r12
        L60:
            int r13 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r13 >= 0) goto L75
            float r13 = r3 - r11
            float r13 = java.lang.Math.abs(r13)
            int r13 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r13 <= 0) goto L73
            r2 = 0
            r5 = r3
            r1.drawLine(r2, r3, r4, r5, r6)
        L73:
            float r3 = r3 + r12
            goto L60
        L75:
            return
    }

    @Override // android.view.View
    public final void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            if (r1 <= 0) goto Le
            if (r2 <= 0) goto Le
            if (r1 != r3) goto Lb
            if (r2 == r4) goto Le
        Lb:
            r0.p()
        Le:
            return
    }

    public final void p() {
            r3 = this;
            int r0 = r3.getWidth()
            if (r0 <= 0) goto L28
            int r0 = r3.getHeight()
            if (r0 > 0) goto Ld
            goto L28
        Ld:
            java.util.ArrayList r0 = r3.h()
            fo2 r1 = r3.k0
            if (r1 == 0) goto L28
            int r2 = r3.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r3.getHeight()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.e(r0, r2, r3)
        L28:
            return
    }

    public final boolean q(defpackage.nj3 r6, float r7) {
            r5 = this;
            java.util.Map r0 = r5.getViews()
            java.lang.Object r0 = r0.get(r6)
            zj3 r0 = (defpackage.zj3) r0
            if (r0 != 0) goto Le
            r5 = 0
            return r5
        Le:
            android.view.View r0 = r0.a
            int r1 = r0.getWidth()
            float r1 = (float) r1
            int r2 = r5.getMinComponentSize()
            float r2 = (float) r2
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto L1f
            r1 = r2
        L1f:
            int r0 = r0.getHeight()
            float r0 = (float) r0
            int r2 = r5.getMinComponentSize()
            float r2 = (float) r2
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 >= 0) goto L2e
            r0 = r2
        L2e:
            float r1 = r1 / r0
            int r0 = r5.getWidth()
            int r2 = r5.getHeight()
            int r0 = java.lang.Math.min(r0, r2)
            int r2 = r5.getMinComponentSize()
            int r0 = r0 - r2
            float r0 = (float) r0
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 >= 0) goto L48
            r0 = r2
        L48:
            float r0 = r0 * r7
            int r7 = r5.getMinComponentSize()
            float r7 = (float) r7
            float r0 = r0 + r7
            int r7 = r5.getMinComponentSize()
            float r7 = (float) r7
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 >= 0) goto L59
            r0 = r7
        L59:
            float r1 = r1 * r0
            int r7 = r5.getMinComponentSize()
            float r7 = (float) r7
            int r3 = r5.getWidth()
            int r4 = r5.getMinComponentSize()
            int r3 = r3 - r4
            float r3 = (float) r3
            float r7 = defpackage.gi2.p(r1, r7, r3)
            int r1 = r5.getMinComponentSize()
            float r1 = (float) r1
            float r7 = r7 - r1
            int r1 = r5.getWidth()
            int r3 = r5.getMinComponentSize()
            int r1 = r1 - r3
            float r1 = (float) r1
            float r7 = r7 / r1
            r1 = 0
            float r7 = defpackage.gi2.p(r7, r1, r2)
            int r3 = r5.getMinComponentSize()
            float r3 = (float) r3
            float r0 = r0 - r3
            int r3 = r5.getHeight()
            int r4 = r5.getMinComponentSize()
            int r3 = r3 - r4
            float r3 = (float) r3
            float r0 = r0 / r3
            float r0 = defpackage.gi2.p(r0, r1, r2)
            boolean r5 = r5.r(r6, r7, r0)
            return r5
    }

    public final boolean r(defpackage.nj3 r14, float r15, float r16) {
            r13 = this;
            java.util.Map r0 = r13.getViews()
            java.lang.Object r0 = r0.get(r14)
            zj3 r0 = (defpackage.zj3) r0
            if (r0 != 0) goto Le
            r13 = 0
            return r13
        Le:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            me.magnum.melonds.ui.layouteditor.LayoutEditorView$a r2 = me.magnum.melonds.ui.layouteditor.LayoutEditorView.a.TOP_LEFT
            my4 r3 = r0.a()
            int r3 = r3.a
            double r3 = (double) r3
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = java.lang.Math.pow(r3, r5)
            my4 r7 = r0.a()
            int r7 = r7.b
            double r7 = (double) r7
            double r7 = java.lang.Math.pow(r7, r5)
            double r7 = r7 + r3
            java.lang.Double r3 = java.lang.Double.valueOf(r7)
            r1.put(r2, r3)
            me.magnum.melonds.ui.layouteditor.LayoutEditorView$a r3 = me.magnum.melonds.ui.layouteditor.LayoutEditorView.a.TOP_RIGHT
            int r4 = r13.getWidth()
            my4 r7 = r0.a()
            int r7 = r7.a
            android.view.View r8 = r0.a
            int r9 = r8.getWidth()
            int r9 = r9 + r7
            int r4 = r4 - r9
            double r9 = (double) r4
            double r9 = java.lang.Math.pow(r9, r5)
            my4 r4 = r0.a()
            int r4 = r4.b
            double r11 = (double) r4
            double r11 = java.lang.Math.pow(r11, r5)
            double r11 = r11 + r9
            java.lang.Double r4 = java.lang.Double.valueOf(r11)
            r1.put(r3, r4)
            me.magnum.melonds.ui.layouteditor.LayoutEditorView$a r3 = me.magnum.melonds.ui.layouteditor.LayoutEditorView.a.BOTTOM_LEFT
            my4 r4 = r0.a()
            int r4 = r4.a
            double r9 = (double) r4
            double r9 = java.lang.Math.pow(r9, r5)
            int r4 = r13.getHeight()
            my4 r7 = r0.a()
            int r7 = r7.b
            int r11 = r8.getHeight()
            int r11 = r11 + r7
            int r4 = r4 - r11
            double r11 = (double) r4
            double r11 = java.lang.Math.pow(r11, r5)
            double r11 = r11 + r9
            java.lang.Double r4 = java.lang.Double.valueOf(r11)
            r1.put(r3, r4)
            me.magnum.melonds.ui.layouteditor.LayoutEditorView$a r3 = me.magnum.melonds.ui.layouteditor.LayoutEditorView.a.BOTTOM_RIGHT
            int r4 = r13.getWidth()
            my4 r7 = r0.a()
            int r7 = r7.a
            int r9 = r8.getWidth()
            int r9 = r9 + r7
            int r4 = r4 - r9
            double r9 = (double) r4
            double r9 = java.lang.Math.pow(r9, r5)
            int r4 = r13.getHeight()
            my4 r0 = r0.a()
            int r0 = r0.b
            int r7 = r8.getHeight()
            int r7 = r7 + r0
            int r4 = r4 - r7
            double r7 = (double) r4
            double r4 = java.lang.Math.pow(r7, r5)
            double r4 = r4 + r9
            java.lang.Double r0 = java.lang.Double.valueOf(r4)
            r1.put(r3, r0)
            java.util.Set r0 = r1.keySet()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r3 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
        Lce:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto Lfb
            java.lang.Object r5 = r0.next()
            me.magnum.melonds.ui.layouteditor.LayoutEditorView$a r5 = (me.magnum.melonds.ui.layouteditor.LayoutEditorView.a) r5
            java.lang.Object r6 = r1.get(r5)
            r6.getClass()
            java.lang.Number r6 = (java.lang.Number) r6
            double r6 = r6.doubleValue()
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 >= 0) goto Lce
            java.lang.Object r2 = r1.get(r5)
            r2.getClass()
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            r3 = r2
            r2 = r5
            goto Lce
        Lfb:
            r4 = r16
            boolean r13 = r13.s(r14, r15, r4, r2)
            return r13
    }

    public final boolean s(defpackage.nj3 r5, float r6, float r7, me.magnum.melonds.ui.layouteditor.LayoutEditorView.a r8) {
            r4 = this;
            java.util.Map r0 = r4.getViews()
            java.lang.Object r5 = r0.get(r5)
            zj3 r5 = (defpackage.zj3) r5
            r0 = 0
            if (r5 != 0) goto Le
            return r0
        Le:
            android.view.View r1 = r5.a
            int r2 = r4.getWidth()
            int r3 = r4.getMinComponentSize()
            int r2 = r2 - r3
            float r2 = (float) r2
            float r2 = r2 * r6
            int r6 = r4.getMinComponentSize()
            float r6 = (float) r6
            float r2 = r2 + r6
            int r6 = defpackage.u24.E(r2)
            int r2 = r4.getHeight()
            int r3 = r4.getMinComponentSize()
            int r2 = r2 - r3
            float r2 = (float) r2
            float r2 = r2 * r7
            int r7 = r4.getMinComponentSize()
            float r7 = (float) r7
            float r2 = r2 + r7
            int r7 = defpackage.u24.E(r2)
            my4 r5 = r5.a()
            me.magnum.melonds.ui.layouteditor.LayoutEditorView$a r2 = me.magnum.melonds.ui.layouteditor.LayoutEditorView.a.TOP_LEFT
            if (r8 != r2) goto L61
            int r8 = r5.a
            int r5 = r5.b
            int r2 = r8 + r6
            int r3 = r4.getWidth()
            if (r2 <= r3) goto L53
            int r8 = r4.getWidth()
            int r8 = r8 - r6
        L53:
            int r2 = r5 + r7
            int r3 = r4.getHeight()
            if (r2 <= r3) goto Lb8
            int r5 = r4.getHeight()
        L5f:
            int r5 = r5 - r7
            goto Lb8
        L61:
            me.magnum.melonds.ui.layouteditor.LayoutEditorView$a r2 = me.magnum.melonds.ui.layouteditor.LayoutEditorView.a.TOP_RIGHT
            if (r8 != r2) goto L81
            int r8 = r5.a
            int r2 = r1.getWidth()
            int r2 = r2 + r8
            int r2 = r2 - r6
            int r5 = r5.b
            if (r2 >= 0) goto L73
            r8 = r0
            goto L74
        L73:
            r8 = r2
        L74:
            int r2 = r5 + r7
            int r3 = r4.getHeight()
            if (r2 <= r3) goto Lb8
            int r5 = r4.getHeight()
            goto L5f
        L81:
            me.magnum.melonds.ui.layouteditor.LayoutEditorView$a r2 = me.magnum.melonds.ui.layouteditor.LayoutEditorView.a.BOTTOM_LEFT
            int r3 = r5.a
            if (r8 != r2) goto La3
            int r5 = r5.b
            int r8 = r1.getHeight()
            int r8 = r8 + r5
            int r5 = r8 - r7
            int r8 = r3 + r6
            int r2 = r4.getWidth()
            if (r8 <= r2) goto L9e
            int r8 = r4.getWidth()
            int r8 = r8 - r6
            goto L9f
        L9e:
            r8 = r3
        L9f:
            if (r5 >= 0) goto Lb8
        La1:
            r5 = r0
            goto Lb8
        La3:
            int r8 = r1.getWidth()
            int r8 = r8 + r3
            int r8 = r8 - r6
            int r5 = r5.b
            int r2 = r1.getHeight()
            int r2 = r2 + r5
            int r5 = r2 - r7
            if (r8 >= 0) goto Lb5
            r8 = r0
        Lb5:
            if (r5 >= 0) goto Lb8
            goto La1
        Lb8:
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            if (r2 == 0) goto Ld2
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            r2.width = r6
            r2.height = r7
            r2.leftMargin = r8
            r2.topMargin = r5
            r1.setLayoutParams(r2)
            r5 = 1
            r4.j0 = r5
            r4.p()
            return r5
        Ld2:
            java.lang.String r4 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            defpackage.u34.x(r4)
            return r0
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener r1) {
            r0 = this;
            r0.e0 = r1
            return
    }

    public final void setOnLayoutChangedListener(defpackage.fo2 r1) {
            r0 = this;
            r0.k0 = r1
            return
    }

    public final void setOnViewDeselectedListener(defpackage.qn2 r1) {
            r0 = this;
            r1.getClass()
            r0.d0 = r1
            return
    }

    public final void setOnViewPositionEditRequestedListener(defpackage.qn2 r1) {
            r0 = this;
            r0.l0 = r1
            return
    }

    public final void setOnViewSelectedListener(defpackage.io2 r1) {
            r0 = this;
            r1.getClass()
            r0.R = r1
            return
    }

    public final void setSafeAreaInsets(android.graphics.Rect r1) {
            r0 = this;
            r1.getClass()
            r0.m0 = r1
            r0.invalidate()
            return
    }

    public final void setSelectedScreenOnTop(boolean r5) {
            r4 = this;
            zj3 r0 = r4.h0
            if (r0 == 0) goto L4f
            r0.d = r5
            java.util.Map r5 = r4.getViews()
            nj3 r0 = defpackage.nj3.TOP_SCREEN
            java.lang.Object r5 = r5.get(r0)
            zj3 r5 = (defpackage.zj3) r5
            java.util.Map r0 = r4.getViews()
            nj3 r1 = defpackage.nj3.BOTTOM_SCREEN
            java.lang.Object r0 = r0.get(r1)
            zj3 r0 = (defpackage.zj3) r0
            if (r5 == 0) goto L49
            android.view.View r1 = r5.a
            if (r0 == 0) goto L49
            android.view.View r2 = r0.a
            r4.removeView(r1)
            r4.removeView(r2)
            boolean r5 = r5.d
            r3 = 0
            if (r5 == 0) goto L38
            r4.addView(r2, r3)
            r4.addView(r1, r3)
            goto L49
        L38:
            boolean r5 = r0.d
            if (r5 == 0) goto L43
            r4.addView(r1, r3)
            r4.addView(r2, r3)
            goto L49
        L43:
            r4.addView(r2, r3)
            r4.addView(r1, r3)
        L49:
            r5 = 1
            r4.j0 = r5
            r4.p()
        L4f:
            return
    }

    public final void setSelectedViewAlpha(float r2) {
            r1 = this;
            zj3 r0 = r1.h0
            if (r0 == 0) goto L11
            r0.c = r2
            android.view.View r0 = r0.a
            r0.setAlpha(r2)
            r2 = 1
            r1.j0 = r2
            r1.p()
        L11:
            return
    }

    public final void t(float r6) {
            r5 = this;
            zj3 r0 = r5.h0
            if (r0 != 0) goto L5
            return
        L5:
            android.view.View r0 = r0.a
            int r1 = r0.getWidth()
            float r1 = (float) r1
            int r2 = r5.getMinComponentSize()
            float r2 = (float) r2
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto L16
            r1 = r2
        L16:
            int r0 = r0.getHeight()
            float r0 = (float) r0
            int r2 = r5.getMinComponentSize()
            float r2 = (float) r2
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 >= 0) goto L25
            r0 = r2
        L25:
            float r1 = r1 / r0
            int r0 = r5.getWidth()
            int r2 = r5.getHeight()
            int r0 = java.lang.Math.min(r0, r2)
            int r2 = r5.getMinComponentSize()
            int r0 = r0 - r2
            float r0 = (float) r0
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 >= 0) goto L3f
            r0 = r2
        L3f:
            float r0 = r0 * r6
            int r6 = r5.getMinComponentSize()
            float r6 = (float) r6
            float r0 = r0 + r6
            int r6 = r5.getMinComponentSize()
            float r6 = (float) r6
            int r3 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r3 >= 0) goto L50
            r0 = r6
        L50:
            float r1 = r1 * r0
            int r6 = r5.getMinComponentSize()
            float r6 = (float) r6
            int r3 = r5.getWidth()
            int r4 = r5.getMinComponentSize()
            int r3 = r3 - r4
            float r3 = (float) r3
            float r6 = defpackage.gi2.p(r1, r6, r3)
            int r1 = r5.getMinComponentSize()
            float r1 = (float) r1
            float r6 = r6 - r1
            int r1 = r5.getWidth()
            int r3 = r5.getMinComponentSize()
            int r1 = r1 - r3
            float r1 = (float) r1
            float r6 = r6 / r1
            r1 = 0
            float r6 = defpackage.gi2.p(r6, r1, r2)
            int r3 = r5.getMinComponentSize()
            float r3 = (float) r3
            float r0 = r0 - r3
            int r3 = r5.getHeight()
            int r4 = r5.getMinComponentSize()
            int r3 = r3 - r4
            float r3 = (float) r3
            float r0 = r0 / r3
            float r0 = defpackage.gi2.p(r0, r1, r2)
            r5.u(r6, r0)
            return
    }

    public final void u(float r3, float r4) {
            r2 = this;
            zj3 r0 = r2.h0
            if (r0 != 0) goto L5
            return
        L5:
            nj3 r0 = r0.b
            me.magnum.melonds.ui.layouteditor.LayoutEditorView$a r1 = r2.i0
            r2.s(r0, r3, r4, r1)
            return
    }

    public final void v(defpackage.zj3 r13) {
            r12 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            me.magnum.melonds.ui.layouteditor.LayoutEditorView$a r1 = me.magnum.melonds.ui.layouteditor.LayoutEditorView.a.TOP_LEFT
            my4 r2 = r13.a()
            int r2 = r2.a
            double r2 = (double) r2
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = java.lang.Math.pow(r2, r4)
            my4 r6 = r13.a()
            int r6 = r6.b
            double r6 = (double) r6
            double r6 = java.lang.Math.pow(r6, r4)
            double r6 = r6 + r2
            java.lang.Double r2 = java.lang.Double.valueOf(r6)
            r0.put(r1, r2)
            me.magnum.melonds.ui.layouteditor.LayoutEditorView$a r2 = me.magnum.melonds.ui.layouteditor.LayoutEditorView.a.TOP_RIGHT
            int r3 = r12.getWidth()
            my4 r6 = r13.a()
            int r6 = r6.a
            android.view.View r7 = r13.a
            int r8 = r7.getWidth()
            int r8 = r8 + r6
            int r3 = r3 - r8
            double r8 = (double) r3
            double r8 = java.lang.Math.pow(r8, r4)
            my4 r3 = r13.a()
            int r3 = r3.b
            double r10 = (double) r3
            double r10 = java.lang.Math.pow(r10, r4)
            double r10 = r10 + r8
            java.lang.Double r3 = java.lang.Double.valueOf(r10)
            r0.put(r2, r3)
            me.magnum.melonds.ui.layouteditor.LayoutEditorView$a r2 = me.magnum.melonds.ui.layouteditor.LayoutEditorView.a.BOTTOM_LEFT
            my4 r3 = r13.a()
            int r3 = r3.a
            double r8 = (double) r3
            double r8 = java.lang.Math.pow(r8, r4)
            int r3 = r12.getHeight()
            my4 r6 = r13.a()
            int r6 = r6.b
            int r10 = r7.getHeight()
            int r10 = r10 + r6
            int r3 = r3 - r10
            double r10 = (double) r3
            double r10 = java.lang.Math.pow(r10, r4)
            double r10 = r10 + r8
            java.lang.Double r3 = java.lang.Double.valueOf(r10)
            r0.put(r2, r3)
            me.magnum.melonds.ui.layouteditor.LayoutEditorView$a r2 = me.magnum.melonds.ui.layouteditor.LayoutEditorView.a.BOTTOM_RIGHT
            int r3 = r12.getWidth()
            my4 r6 = r13.a()
            int r6 = r6.a
            int r8 = r7.getWidth()
            int r8 = r8 + r6
            int r3 = r3 - r8
            double r8 = (double) r3
            double r8 = java.lang.Math.pow(r8, r4)
            int r3 = r12.getHeight()
            my4 r6 = r13.a()
            int r6 = r6.b
            int r10 = r7.getHeight()
            int r10 = r10 + r6
            int r3 = r3 - r10
            double r10 = (double) r3
            double r3 = java.lang.Math.pow(r10, r4)
            double r3 = r3 + r8
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r0.put(r2, r3)
            java.util.Set r2 = r0.keySet()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
            r3 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
        Lc0:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto Lec
            java.lang.Object r5 = r2.next()
            me.magnum.melonds.ui.layouteditor.LayoutEditorView$a r5 = (me.magnum.melonds.ui.layouteditor.LayoutEditorView.a) r5
            java.lang.Object r6 = r0.get(r5)
            r6.getClass()
            java.lang.Number r6 = (java.lang.Number) r6
            double r8 = r6.doubleValue()
            int r6 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r6 >= 0) goto Lc0
            java.lang.Object r1 = r0.get(r5)
            r1.getClass()
            java.lang.Number r1 = (java.lang.Number) r1
            double r3 = r1.doubleValue()
            r1 = r5
            goto Lc0
        Lec:
            r12.i0 = r1
            r12.h0 = r13
            int r0 = r7.getWidth()
            int r1 = r12.getMinComponentSize()
            int r0 = r0 - r1
            float r0 = (float) r0
            int r1 = r12.getWidth()
            int r2 = r12.getMinComponentSize()
            int r1 = r1 - r2
            float r1 = (float) r1
            float r0 = r0 / r1
            int r1 = r7.getHeight()
            int r2 = r12.getMinComponentSize()
            int r1 = r1 - r2
            float r1 = (float) r1
            int r2 = r12.getHeight()
            int r3 = r12.getMinComponentSize()
            int r2 = r2 - r3
            float r2 = (float) r2
            float r1 = r1 / r2
            io2 r2 = r12.R
            if (r2 == 0) goto L142
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            java.lang.Float r5 = java.lang.Float.valueOf(r1)
            int r0 = r12.getWidth()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            int r0 = r12.getHeight()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            int r12 = r12.getMinComponentSize()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)
            r3 = r13
            r2.n(r3, r4, r5, r6, r7, r8)
        L142:
            return
    }
}
