package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z14  reason: default package */
/* loaded from: classes.dex */
public abstract class z14 extends android.widget.LinearLayout {
    public final java.util.ArrayList A;
    public final java.util.ArrayList B;
    public final defpackage.s63 L;
    public final defpackage.su0 R;
    public java.lang.Integer[] d0;
    public defpackage.wp6 e0;
    public defpackage.xp6 f0;
    public int g0;
    public defpackage.aq6 h0;
    public boolean i0;

    public z14(android.content.Context r13, android.util.AttributeSet r14) {
            r12 = this;
            r0 = 2132018252(0x7f14044c, float:1.9674805E38)
            r4 = 2130969442(0x7f040362, float:1.7547566E38)
            android.content.Context r13 = defpackage.q60.e0(r13, r14, r4, r0)
            r12.<init>(r13, r14, r4)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r12.A = r13
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r12.B = r13
            s63 r13 = new s63
            r0 = r12
            com.google.android.material.button.MaterialButtonToggleGroup r0 = (com.google.android.material.button.MaterialButtonToggleGroup) r0
            r1 = 16
            r13.<init>(r0, r1)
            r12.L = r13
            su0 r13 = new su0
            r7 = 1
            r13.<init>(r0, r7)
            r12.R = r13
            r12.i0 = r7
            android.content.Context r1 = r12.getContext()
            r13 = 0
            int[] r6 = new int[r13]
            int[] r3 = defpackage.a75.k
            r5 = 2132018252(0x7f14044c, float:1.9674805E38)
            r2 = r14
            android.content.res.TypedArray r14 = defpackage.f04.K(r1, r2, r3, r4, r5, r6)
            r2 = 2
            boolean r0 = r14.hasValue(r2)
            java.lang.String r3 = "No start tag found"
            java.lang.String r4 = "selector"
            java.lang.String r5 = "xml"
            r6 = 0
            if (r0 == 0) goto Lb9
            int r0 = r14.getResourceId(r2, r13)
            if (r0 != 0) goto L58
        L56:
            r0 = r6
            goto Lb7
        L58:
            android.content.res.Resources r8 = r1.getResources()
            java.lang.String r8 = r8.getResourceTypeName(r0)
            boolean r8 = r8.equals(r5)
            if (r8 != 0) goto L67
            goto L56
        L67:
            android.content.res.Resources r8 = r1.getResources()     // Catch: java.lang.Throwable -> L56
            android.content.res.XmlResourceParser r8 = r8.getXml(r0)     // Catch: java.lang.Throwable -> L56
            aq6 r0 = new aq6     // Catch: java.lang.Throwable -> L9f
            r0.<init>()     // Catch: java.lang.Throwable -> L9f
            r9 = 10
            int[][] r10 = new int[r9]     // Catch: java.lang.Throwable -> L9f
            r0.c = r10     // Catch: java.lang.Throwable -> L9f
            s35[] r9 = new defpackage.s35[r9]     // Catch: java.lang.Throwable -> L9f
            r0.d = r9     // Catch: java.lang.Throwable -> L9f
            android.util.AttributeSet r9 = android.util.Xml.asAttributeSet(r8)     // Catch: java.lang.Throwable -> L9f
        L82:
            int r10 = r8.next()     // Catch: java.lang.Throwable -> L9f
            if (r10 == r2) goto L8b
            if (r10 == r7) goto L8b
            goto L82
        L8b:
            if (r10 != r2) goto La6
            java.lang.String r10 = r8.getName()     // Catch: java.lang.Throwable -> L9f
            boolean r10 = r10.equals(r4)     // Catch: java.lang.Throwable -> L9f
            if (r10 == 0) goto La2
            android.content.res.Resources$Theme r10 = r1.getTheme()     // Catch: java.lang.Throwable -> L9f
            r0.a(r1, r8, r9, r10)     // Catch: java.lang.Throwable -> L9f
            goto La2
        L9f:
            r0 = move-exception
            r9 = r0
            goto Lac
        La2:
            r8.close()     // Catch: java.lang.Throwable -> L56
            goto Lb7
        La6:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Throwable -> L9f
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L9f
            throw r0     // Catch: java.lang.Throwable -> L9f
        Lac:
            if (r8 == 0) goto Lb6
            r8.close()     // Catch: java.lang.Throwable -> Lb2
            goto Lb6
        Lb2:
            r0 = move-exception
            r9.addSuppressed(r0)     // Catch: java.lang.Throwable -> L56
        Lb6:
            throw r9     // Catch: java.lang.Throwable -> L56
        Lb7:
            r12.h0 = r0
        Lb9:
            r0 = 4
            boolean r8 = r14.hasValue(r0)
            r9 = 0
            if (r8 == 0) goto Lf0
            xp6 r8 = defpackage.xp6.b(r1, r14, r0)
            r12.f0 = r8
            if (r8 != 0) goto Lf0
            h03 r8 = new h03
            int r0 = r14.getResourceId(r0, r13)
            r10 = 5
            int r10 = r14.getResourceId(r10, r13)
            t r11 = new t
            r11.<init>(r9)
            le6 r0 = defpackage.me6.a(r1, r0, r10, r11)
            me6 r0 = r0.a()
            r8.<init>(r0)
            int r0 = r8.b
            if (r0 != 0) goto Le9
            goto Lee
        Le9:
            xp6 r6 = new xp6
            r6.<init>(r8)
        Lee:
            r12.f0 = r6
        Lf0:
            r0 = 3
            boolean r6 = r14.hasValue(r0)
            if (r6 == 0) goto L16e
            t r6 = new t
            r6.<init>(r9)
            int r8 = r14.getResourceId(r0, r13)
            if (r8 != 0) goto L10b
            f61 r0 = defpackage.me6.c(r14, r0, r6)
            wp6 r0 = defpackage.wp6.b(r0)
            goto L16c
        L10b:
            android.content.res.Resources r9 = r1.getResources()
            java.lang.String r9 = r9.getResourceTypeName(r8)
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L122
            f61 r0 = defpackage.me6.c(r14, r0, r6)
            wp6 r0 = defpackage.wp6.b(r0)
            goto L16c
        L122:
            android.content.res.Resources r0 = r1.getResources()     // Catch: java.lang.Throwable -> L168
            android.content.res.XmlResourceParser r5 = r0.getXml(r8)     // Catch: java.lang.Throwable -> L168
            wp6 r0 = new wp6     // Catch: java.lang.Throwable -> L150
            r0.<init>()     // Catch: java.lang.Throwable -> L150
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r5)     // Catch: java.lang.Throwable -> L150
        L133:
            int r9 = r5.next()     // Catch: java.lang.Throwable -> L150
            if (r9 == r2) goto L13c
            if (r9 == r7) goto L13c
            goto L133
        L13c:
            if (r9 != r2) goto L157
            java.lang.String r2 = r5.getName()     // Catch: java.lang.Throwable -> L150
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Throwable -> L150
            if (r2 == 0) goto L153
            android.content.res.Resources$Theme r2 = r1.getTheme()     // Catch: java.lang.Throwable -> L150
            r0.d(r1, r5, r8, r2)     // Catch: java.lang.Throwable -> L150
            goto L153
        L150:
            r0 = move-exception
            r1 = r0
            goto L15d
        L153:
            r5.close()     // Catch: java.lang.Throwable -> L168
            goto L16c
        L157:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Throwable -> L150
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L150
            throw r0     // Catch: java.lang.Throwable -> L150
        L15d:
            if (r5 == 0) goto L167
            r5.close()     // Catch: java.lang.Throwable -> L163
            goto L167
        L163:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L168
        L167:
            throw r1     // Catch: java.lang.Throwable -> L168
        L168:
            wp6 r0 = defpackage.wp6.b(r6)
        L16c:
            r12.e0 = r0
        L16e:
            int r0 = r14.getDimensionPixelSize(r7, r13)
            r12.g0 = r0
            r12.setChildrenDrawingOrderEnabled(r7)
            boolean r13 = r14.getBoolean(r13, r7)
            r12.setEnabled(r13)
            r14.recycle()
            return
    }

    private int getFirstVisibleChildIndex() {
            r3 = this;
            int r0 = r3.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L11
            boolean r2 = r3.c(r1)
            if (r2 == 0) goto Le
            return r1
        Le:
            int r1 = r1 + 1
            goto L5
        L11:
            r3 = -1
            return r3
    }

    private int getLastVisibleChildIndex() {
            r2 = this;
            int r0 = r2.getChildCount()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L12
            boolean r1 = r2.c(r0)
            if (r1 == 0) goto Lf
            return r0
        Lf:
            int r0 = r0 + (-1)
            goto L6
        L12:
            r2 = -1
            return r2
    }

    private void setGeneratedIdIfNeeded(com.google.android.material.button.MaterialButton r2) {
            r1 = this;
            int r1 = r2.getId()
            r0 = -1
            if (r1 != r0) goto Le
            int r1 = android.view.View.generateViewId()
            r2.setId(r1)
        Le:
            return
    }

    public final void a() {
            r9 = this;
            int r0 = r9.getFirstVisibleChildIndex()
            r1 = -1
            if (r0 != r1) goto L9
            goto La0
        L9:
            int r2 = r0 + 1
        Lb:
            int r3 = r9.getChildCount()
            r4 = 1
            r5 = 0
            if (r2 >= r3) goto L76
            android.view.View r3 = r9.getChildAt(r2)
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            int r6 = r2 + (-1)
            android.view.View r6 = r9.getChildAt(r6)
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            int r7 = r9.g0
            if (r7 > 0) goto L38
            int r7 = r3.getStrokeWidth()
            int r8 = r6.getStrokeWidth()
            int r7 = java.lang.Math.min(r7, r8)
            r3.setShouldDrawSurfaceColorStroke(r4)
            r6.setShouldDrawSurfaceColorStroke(r4)
            goto L3f
        L38:
            r3.setShouldDrawSurfaceColorStroke(r5)
            r6.setShouldDrawSurfaceColorStroke(r5)
            r7 = r5
        L3f:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            boolean r6 = r4 instanceof android.widget.LinearLayout.LayoutParams
            if (r6 == 0) goto L4a
            android.widget.LinearLayout$LayoutParams r4 = (android.widget.LinearLayout.LayoutParams) r4
            goto L54
        L4a:
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            int r8 = r4.width
            int r4 = r4.height
            r6.<init>(r8, r4)
            r4 = r6
        L54:
            int r6 = r9.getOrientation()
            if (r6 != 0) goto L66
            r4.setMarginEnd(r5)
            int r6 = r9.g0
            int r6 = r6 - r7
            r4.setMarginStart(r6)
            r4.topMargin = r5
            goto L70
        L66:
            r4.bottomMargin = r5
            int r6 = r9.g0
            int r6 = r6 - r7
            r4.topMargin = r6
            r4.setMarginStart(r5)
        L70:
            r3.setLayoutParams(r4)
            int r2 = r2 + 1
            goto Lb
        L76:
            int r2 = r9.getChildCount()
            if (r2 == 0) goto La0
            if (r0 != r1) goto L7f
            goto La0
        L7f:
            android.view.View r0 = r9.getChildAt(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r9 = r9.getOrientation()
            if (r9 != r4) goto L96
            r0.topMargin = r5
            r0.bottomMargin = r5
            return
        L96:
            r0.setMarginEnd(r5)
            r0.setMarginStart(r5)
            r0.leftMargin = r5
            r0.rightMargin = r5
        La0:
            return
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r2, int r3, android.view.ViewGroup.LayoutParams r4) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.button.MaterialButton
            if (r0 != 0) goto Lc
            java.lang.String r1 = "MButtonGroup"
            java.lang.String r2 = "Child views must be of type MaterialButton."
            android.util.Log.e(r1, r2)
            return
        Lc:
            r1.d()
            r0 = 1
            r1.i0 = r0
            super.addView(r2, r3, r4)
            com.google.android.material.button.MaterialButton r2 = (com.google.android.material.button.MaterialButton) r2
            r1.setGeneratedIdIfNeeded(r2)
            s63 r3 = r1.L
            r2.setOnPressedChangeListenerInternal(r3)
            java.util.ArrayList r3 = r1.A
            me6 r4 = r2.getShapeAppearanceModel()
            r3.add(r4)
            java.util.ArrayList r3 = r1.B
            xp6 r4 = r2.getStateListShapeAppearanceModel()
            r3.add(r4)
            boolean r1 = r1.isEnabled()
            r2.setEnabled(r1)
            return
    }

    public final void b() {
            r12 = this;
            aq6 r0 = r12.h0
            if (r0 == 0) goto Le5
            int r0 = r12.getChildCount()
            if (r0 != 0) goto Lc
            goto Le5
        Lc:
            int r0 = r12.getFirstVisibleChildIndex()
            int r1 = r12.getLastVisibleChildIndex()
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = r0
        L18:
            if (r3 > r1) goto Lbb
            boolean r4 = r12.c(r3)
            if (r4 != 0) goto L22
            goto Lb7
        L22:
            boolean r4 = r12.c(r3)
            r5 = 0
            if (r4 == 0) goto Lad
            aq6 r4 = r12.h0
            if (r4 != 0) goto L2f
            goto Lad
        L2f:
            android.view.View r4 = r12.getChildAt(r3)
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            aq6 r6 = r12.h0
            int r4 = r4.getWidth()
            int r7 = -r4
            r8 = r5
        L3d:
            int r9 = r6.a
            if (r8 >= r9) goto L67
            s35[] r9 = r6.d
            r9 = r9[r8]
            java.lang.Object r9 = r9.A
            yp6 r9 = (defpackage.yp6) r9
            zp6 r10 = r9.a
            float r9 = r9.b
            zp6 r11 = defpackage.zp6.PIXELS
            if (r10 != r11) goto L58
            float r7 = (float) r7
            float r7 = java.lang.Math.max(r7, r9)
        L56:
            int r7 = (int) r7
            goto L64
        L58:
            zp6 r11 = defpackage.zp6.PERCENT
            if (r10 != r11) goto L64
            float r7 = (float) r7
            float r10 = (float) r4
            float r10 = r10 * r9
            float r7 = java.lang.Math.max(r7, r10)
            goto L56
        L64:
            int r8 = r8 + 1
            goto L3d
        L67:
            int r4 = java.lang.Math.max(r5, r7)
            int r6 = r3 + (-1)
        L6d:
            r7 = 0
            if (r6 < 0) goto L80
            boolean r8 = r12.c(r6)
            if (r8 == 0) goto L7d
            android.view.View r6 = r12.getChildAt(r6)
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            goto L81
        L7d:
            int r6 = r6 + (-1)
            goto L6d
        L80:
            r6 = r7
        L81:
            if (r6 != 0) goto L85
            r6 = r5
            goto L89
        L85:
            int r6 = r6.getAllowedWidthDecrease()
        L89:
            int r8 = r12.getChildCount()
            int r9 = r3 + 1
        L8f:
            if (r9 >= r8) goto La1
            boolean r10 = r12.c(r9)
            if (r10 == 0) goto L9e
            android.view.View r7 = r12.getChildAt(r9)
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            goto La1
        L9e:
            int r9 = r9 + 1
            goto L8f
        La1:
            if (r7 != 0) goto La4
            goto La8
        La4:
            int r5 = r7.getAllowedWidthDecrease()
        La8:
            int r6 = r6 + r5
            int r5 = java.lang.Math.min(r4, r6)
        Lad:
            if (r3 == r0) goto Lb3
            if (r3 == r1) goto Lb3
            int r5 = r5 / 2
        Lb3:
            int r2 = java.lang.Math.min(r2, r5)
        Lb7:
            int r3 = r3 + 1
            goto L18
        Lbb:
            r3 = r0
        Lbc:
            if (r3 > r1) goto Le5
            boolean r4 = r12.c(r3)
            if (r4 != 0) goto Lc5
            goto Le2
        Lc5:
            android.view.View r4 = r12.getChildAt(r3)
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            aq6 r5 = r12.h0
            r4.setSizeChange(r5)
            android.view.View r4 = r12.getChildAt(r3)
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            if (r3 == r0) goto Lde
            if (r3 != r1) goto Ldb
            goto Lde
        Ldb:
            int r5 = r2 * 2
            goto Ldf
        Lde:
            r5 = r2
        Ldf:
            r4.setWidthChangeMax(r5)
        Le2:
            int r3 = r3 + 1
            goto Lbc
        Le5:
            return
    }

    public final boolean c(int r1) {
            r0 = this;
            android.view.View r0 = r0.getChildAt(r1)
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 == r1) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public final void d() {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L1e
            android.view.View r1 = r3.getChildAt(r0)
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            android.widget.LinearLayout$LayoutParams r2 = r1.u0
            if (r2 == 0) goto L1b
            r1.setLayoutParams(r2)
            r2 = 0
            r1.u0 = r2
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.r0 = r2
        L1b:
            int r0 = r0 + 1
            goto L1
        L1e:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(android.graphics.Canvas r7) {
            r6 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            su0 r1 = r6.R
            r0.<init>(r1)
            int r1 = r6.getChildCount()
            r2 = 0
            r3 = r2
        Ld:
            if (r3 >= r1) goto L1f
            android.view.View r4 = r6.getChildAt(r3)
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r0.put(r4, r5)
            int r3 = r3 + 1
            goto Ld
        L1f:
            java.util.Collection r0 = r0.values()
            java.lang.Integer[] r1 = new java.lang.Integer[r2]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.Integer[] r0 = (java.lang.Integer[]) r0
            r6.d0 = r0
            super.dispatchDraw(r7)
            return
    }

    public final void e() {
            r17 = this;
            r0 = r17
            wp6 r1 = r0.e0
            if (r1 != 0) goto La
            xp6 r1 = r0.f0
            if (r1 == 0) goto L106
        La:
            boolean r1 = r0.i0
            if (r1 != 0) goto L10
            goto L106
        L10:
            r1 = 0
            r0.i0 = r1
            int r2 = r0.getChildCount()
            int r3 = r0.getFirstVisibleChildIndex()
            int r4 = r0.getLastVisibleChildIndex()
            r5 = r1
        L20:
            if (r5 >= r2) goto L106
            android.view.View r6 = r0.getChildAt(r5)
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            int r7 = r6.getVisibility()
            r8 = 8
            if (r7 != r8) goto L32
            goto L102
        L32:
            r7 = 1
            if (r5 != r3) goto L37
            r8 = r7
            goto L38
        L37:
            r8 = r1
        L38:
            if (r5 != r4) goto L3c
            r9 = r7
            goto L3d
        L3c:
            r9 = r1
        L3d:
            xp6 r10 = r0.f0
            if (r10 == 0) goto L46
            if (r8 != 0) goto L4e
            if (r9 == 0) goto L46
            goto L4e
        L46:
            java.util.ArrayList r10 = r0.B
            java.lang.Object r10 = r10.get(r5)
            xp6 r10 = (defpackage.xp6) r10
        L4e:
            if (r10 != 0) goto L5e
            h03 r10 = new h03
            java.util.ArrayList r11 = r0.A
            java.lang.Object r11 = r11.get(r5)
            me6 r11 = (defpackage.me6) r11
            r10.<init>(r11)
            goto L96
        L5e:
            h03 r11 = new h03
            r11.<init>(r7)
            int r12 = r10.a
            r11.b = r12
            me6 r13 = r10.b
            r11.c = r13
            int[][] r13 = r10.c
            int r14 = r13.length
            int[][] r14 = new int[r14]
            r11.d = r14
            me6[] r15 = r10.d
            int r7 = r15.length
            me6[] r7 = new defpackage.me6[r7]
            r11.e = r7
            java.lang.System.arraycopy(r13, r1, r14, r1, r12)
            java.io.Serializable r7 = r11.e
            me6[] r7 = (defpackage.me6[]) r7
            int r12 = r11.b
            java.lang.System.arraycopy(r15, r1, r7, r1, r12)
            wp6 r7 = r10.e
            r11.f = r7
            wp6 r7 = r10.f
            r11.g = r7
            wp6 r7 = r10.g
            r11.h = r7
            wp6 r7 = r10.h
            r11.i = r7
            r10 = r11
        L96:
            int r7 = r0.getOrientation()
            if (r7 != 0) goto L9e
            r7 = 1
            goto L9f
        L9e:
            r7 = r1
        L9f:
            int r11 = r0.getLayoutDirection()
            r12 = 1
            if (r11 != r12) goto La8
            r12 = 1
            goto La9
        La8:
            r12 = r1
        La9:
            if (r7 == 0) goto Lc2
            if (r8 == 0) goto Laf
            r7 = 5
            goto Lb0
        Laf:
            r7 = r1
        Lb0:
            if (r9 == 0) goto Lb4
            r7 = r7 | 10
        Lb4:
            if (r12 == 0) goto Lcb
            r8 = r7 & 5
            r7 = r7 & 10
            r16 = 1
            int r8 = r8 << 1
            int r7 = r7 >> 1
            r7 = r7 | r8
            goto Lcb
        Lc2:
            if (r8 == 0) goto Lc6
            r7 = 3
            goto Lc7
        Lc6:
            r7 = r1
        Lc7:
            if (r9 == 0) goto Lcb
            r7 = r7 | 12
        Lcb:
            int r7 = ~r7
            wp6 r8 = r0.e0
            r9 = r7 | 1
            if (r9 != r7) goto Ld4
            r10.f = r8
        Ld4:
            r9 = r7 | 2
            if (r9 != r7) goto Lda
            r10.g = r8
        Lda:
            r9 = r7 | 4
            if (r9 != r7) goto Le0
            r10.h = r8
        Le0:
            r9 = r7 | 8
            if (r9 != r7) goto Le6
            r10.i = r8
        Le6:
            int r7 = r10.b
            if (r7 != 0) goto Lec
            r7 = 0
            goto Lf1
        Lec:
            xp6 r7 = new xp6
            r7.<init>(r10)
        Lf1:
            boolean r8 = r7.d()
            if (r8 == 0) goto Lfb
            r6.setStateListShapeAppearanceModel(r7)
            goto L102
        Lfb:
            me6 r7 = r7.c()
            r6.setShapeAppearanceModel(r7)
        L102:
            int r5 = r5 + 1
            goto L20
        L106:
            return
    }

    public defpackage.aq6 getButtonSizeChange() {
            r0 = this;
            aq6 r0 = r0.h0
            return r0
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int r1, int r2) {
            r0 = this;
            java.lang.Integer[] r0 = r0.d0
            if (r0 == 0) goto Lf
            int r1 = r0.length
            if (r2 < r1) goto L8
            goto Lf
        L8:
            r0 = r0[r2]
            int r0 = r0.intValue()
            return r0
        Lf:
            java.lang.String r0 = "MButtonGroup"
            java.lang.String r1 = "Child order wasn't updated"
            android.util.Log.w(r0, r1)
            return r2
    }

    public defpackage.f61 getInnerCornerSize() {
            r0 = this;
            wp6 r0 = r0.e0
            f61 r0 = r0.b
            return r0
    }

    public defpackage.wp6 getInnerCornerSizeStateList() {
            r0 = this;
            wp6 r0 = r0.e0
            return r0
    }

    public defpackage.me6 getShapeAppearance() {
            r0 = this;
            xp6 r0 = r0.f0
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            me6 r0 = r0.c()
            return r0
    }

    public int getSpacing() {
            r0 = this;
            int r0 = r0.g0
            return r0
    }

    public defpackage.xp6 getStateListShapeAppearance() {
            r0 = this;
            xp6 r0 = r0.f0
            return r0
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            if (r1 == 0) goto Lb
            r0.d()
            r0.b()
        Lb:
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r1, int r2) {
            r0 = this;
            r0.e()
            r0.a()
            super.onMeasure(r1, r2)
            return
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(android.view.View r3) {
            r2 = this;
            super.onViewRemoved(r3)
            boolean r0 = r3 instanceof com.google.android.material.button.MaterialButton
            if (r0 == 0) goto Le
            r0 = r3
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            r1 = 0
            r0.setOnPressedChangeListenerInternal(r1)
        Le:
            int r3 = r2.indexOfChild(r3)
            if (r3 < 0) goto L1e
            java.util.ArrayList r0 = r2.A
            r0.remove(r3)
            java.util.ArrayList r0 = r2.B
            r0.remove(r3)
        L1e:
            r3 = 1
            r2.i0 = r3
            r2.e()
            r2.d()
            r2.a()
            return
    }

    public void setButtonSizeChange(defpackage.aq6 r2) {
            r1 = this;
            aq6 r0 = r1.h0
            if (r0 == r2) goto Lf
            r1.h0 = r2
            r1.b()
            r1.requestLayout()
            r1.invalidate()
        Lf:
            return
    }

    @Override // android.view.View
    public void setEnabled(boolean r3) {
            r2 = this;
            super.setEnabled(r3)
            r0 = 0
        L4:
            int r1 = r2.getChildCount()
            if (r0 >= r1) goto L16
            android.view.View r1 = r2.getChildAt(r0)
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            r1.setEnabled(r3)
            int r0 = r0 + 1
            goto L4
        L16:
            return
    }

    public void setInnerCornerSize(defpackage.f61 r1) {
            r0 = this;
            wp6 r1 = defpackage.wp6.b(r1)
            r0.e0 = r1
            r1 = 1
            r0.i0 = r1
            r0.e()
            r0.invalidate()
            return
    }

    public void setInnerCornerSizeStateList(defpackage.wp6 r1) {
            r0 = this;
            r0.e0 = r1
            r1 = 1
            r0.i0 = r1
            r0.e()
            r0.invalidate()
            return
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int r2) {
            r1 = this;
            int r0 = r1.getOrientation()
            if (r0 == r2) goto L9
            r0 = 1
            r1.i0 = r0
        L9:
            super.setOrientation(r2)
            return
    }

    public void setShapeAppearance(defpackage.me6 r2) {
            r1 = this;
            h03 r0 = new h03
            r0.<init>(r2)
            int r2 = r0.b
            if (r2 != 0) goto Lb
            r2 = 0
            goto L10
        Lb:
            xp6 r2 = new xp6
            r2.<init>(r0)
        L10:
            r1.f0 = r2
            r2 = 1
            r1.i0 = r2
            r1.e()
            r1.invalidate()
            return
    }

    public void setSpacing(int r1) {
            r0 = this;
            r0.g0 = r1
            r0.invalidate()
            r0.requestLayout()
            return
    }

    public void setStateListShapeAppearance(defpackage.xp6 r1) {
            r0 = this;
            r0.f0 = r1
            r1 = 1
            r0.i0 = r1
            r0.e()
            r0.invalidate()
            return
    }
}
