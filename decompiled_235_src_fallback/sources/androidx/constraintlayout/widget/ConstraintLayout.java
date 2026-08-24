package androidx.constraintlayout.widget;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ConstraintLayout extends android.view.ViewGroup {
    public static defpackage.bh6 o0;
    public final android.util.SparseArray A;
    public final java.util.ArrayList B;
    public final defpackage.m21 L;
    public int R;
    public int d0;
    public int e0;
    public int f0;
    public boolean g0;
    public int h0;
    public defpackage.z11 i0;
    public defpackage.s11 j0;
    public int k0;
    public java.util.HashMap l0;
    public final android.util.SparseArray m0;
    public final defpackage.p11 n0;

    public ConstraintLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r1.A = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 4
            r2.<init>(r0)
            r1.B = r2
            m21 r2 = new m21
            r2.<init>()
            r1.L = r2
            r2 = 0
            r1.R = r2
            r1.d0 = r2
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.e0 = r0
            r1.f0 = r0
            r0 = 1
            r1.g0 = r0
            r0 = 257(0x101, float:3.6E-43)
            r1.h0 = r0
            r0 = 0
            r1.i0 = r0
            r1.j0 = r0
            r0 = -1
            r1.k0 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.l0 = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.m0 = r0
            p11 r0 = new p11
            r0.<init>(r1, r1)
            r1.n0 = r0
            r1.i(r3, r2)
            return
    }

    public ConstraintLayout(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r1.A = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 4
            r2.<init>(r0)
            r1.B = r2
            m21 r2 = new m21
            r2.<init>()
            r1.L = r2
            r2 = 0
            r1.R = r2
            r1.d0 = r2
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1.e0 = r2
            r1.f0 = r2
            r2 = 1
            r1.g0 = r2
            r2 = 257(0x101, float:3.6E-43)
            r1.h0 = r2
            r2 = 0
            r1.i0 = r2
            r1.j0 = r2
            r2 = -1
            r1.k0 = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.l0 = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r1.m0 = r2
            p11 r2 = new p11
            r2.<init>(r1, r1)
            r1.n0 = r2
            r1.i(r3, r4)
            return
    }

    private int getPaddingWidth() {
            r3 = this;
            int r0 = r3.getPaddingLeft()
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            int r2 = r3.getPaddingRight()
            int r2 = java.lang.Math.max(r1, r2)
            int r2 = r2 + r0
            int r0 = r3.getPaddingStart()
            int r0 = java.lang.Math.max(r1, r0)
            int r3 = r3.getPaddingEnd()
            int r3 = java.lang.Math.max(r1, r3)
            int r3 = r3 + r0
            if (r3 <= 0) goto L26
            return r3
        L26:
            return r2
    }

    public static defpackage.bh6 getSharedValues() {
            bh6 r0 = androidx.constraintlayout.widget.ConstraintLayout.o0
            if (r0 != 0) goto L17
            bh6 r0 = new bh6
            r0.<init>()
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.a = r1
            androidx.constraintlayout.widget.ConstraintLayout.o0 = r0
        L17:
            bh6 r0 = androidx.constraintlayout.widget.ConstraintLayout.o0
            return r0
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r0 = r1 instanceof defpackage.o11
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas r18) {
            r17 = this;
            r0 = r17
            r1 = 0
            java.util.ArrayList r2 = r0.B
            if (r2 == 0) goto L1c
            int r3 = r2.size()
            if (r3 <= 0) goto L1c
            r4 = r1
        Le:
            if (r4 >= r3) goto L1c
            java.lang.Object r5 = r2.get(r4)
            l11 r5 = (defpackage.l11) r5
            r5.getClass()
            int r4 = r4 + 1
            goto Le
        L1c:
            super.dispatchDraw(r18)
            boolean r2 = r0.isInEditMode()
            if (r2 == 0) goto Lcb
            int r2 = r0.getWidth()
            float r2 = (float) r2
            int r3 = r0.getHeight()
            float r3 = (float) r3
            int r4 = r0.getChildCount()
            r5 = r1
        L34:
            if (r5 >= r4) goto Lcb
            android.view.View r6 = r0.getChildAt(r5)
            int r7 = r6.getVisibility()
            r8 = 8
            if (r7 != r8) goto L44
            goto Lc7
        L44:
            java.lang.Object r6 = r6.getTag()
            if (r6 == 0) goto Lc7
            boolean r7 = r6 instanceof java.lang.String
            if (r7 == 0) goto Lc7
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = ","
            java.lang.String[] r6 = r6.split(r7)
            int r7 = r6.length
            r8 = 4
            if (r7 != r8) goto Lc7
            r7 = r6[r1]
            int r7 = java.lang.Integer.parseInt(r7)
            r8 = 1
            r8 = r6[r8]
            int r8 = java.lang.Integer.parseInt(r8)
            r9 = 2
            r9 = r6[r9]
            int r9 = java.lang.Integer.parseInt(r9)
            r10 = 3
            r6 = r6[r10]
            int r6 = java.lang.Integer.parseInt(r6)
            float r7 = (float) r7
            r10 = 1149698048(0x44870000, float:1080.0)
            float r7 = r7 / r10
            float r7 = r7 * r2
            int r7 = (int) r7
            float r8 = (float) r8
            r11 = 1156579328(0x44f00000, float:1920.0)
            float r8 = r8 / r11
            float r8 = r8 * r3
            int r8 = (int) r8
            float r9 = (float) r9
            float r9 = r9 / r10
            float r9 = r9 * r2
            int r9 = (int) r9
            float r6 = (float) r6
            float r6 = r6 / r11
            float r6 = r6 * r3
            int r6 = (int) r6
            android.graphics.Paint r15 = new android.graphics.Paint
            r15.<init>()
            r10 = -65536(0xffffffffffff0000, float:NaN)
            r15.setColor(r10)
            float r11 = (float) r7
            float r12 = (float) r8
            int r7 = r7 + r9
            float r13 = (float) r7
            r14 = r12
            r10 = r18
            r10.drawLine(r11, r12, r13, r14, r15)
            r7 = r11
            int r8 = r8 + r6
            float r14 = (float) r8
            r11 = r13
            r10.drawLine(r11, r12, r13, r14, r15)
            r6 = r12
            r12 = r14
            r13 = r7
            r10.drawLine(r11, r12, r13, r14, r15)
            r7 = r11
            r11 = r13
            r14 = r6
            r10.drawLine(r11, r12, r13, r14, r15)
            r16 = r14
            r14 = r12
            r12 = r16
            r6 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r15.setColor(r6)
            r13 = r7
            r10.drawLine(r11, r12, r13, r14, r15)
            r16 = r14
            r14 = r12
            r12 = r16
            r10.drawLine(r11, r12, r13, r14, r15)
        Lc7:
            int r5 = r5 + 1
            goto L34
        Lcb:
            return
    }

    @Override // android.view.View
    public final void forceLayout() {
            r1 = this;
            r0 = 1
            r1.g0 = r0
            super.forceLayout()
            return
    }

    public final void g(boolean r15, android.view.View r16, defpackage.l21 r17, defpackage.o11 r18, android.util.SparseArray r19) {
            r14 = this;
            r0 = r16
            r1 = r17
            r6 = r18
            r7 = r19
            r6.a()
            int r2 = r0.getVisibility()
            r1.h0 = r2
            r1.g0 = r0
            boolean r2 = r0 instanceof defpackage.l11
            if (r2 == 0) goto L20
            l11 r0 = (defpackage.l11) r0
            m21 r2 = r14.L
            boolean r2 = r2.y0
            r0.j(r1, r2)
        L20:
            boolean r0 = r6.d0
            r8 = -1
            if (r0 == 0) goto L53
            r14 = r1
            av2 r14 = (defpackage.av2) r14
            int r0 = r6.m0
            int r1 = r6.n0
            float r2 = r6.o0
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 == 0) goto L3d
            if (r4 <= 0) goto L315
            r14.t0 = r2
            r14.u0 = r8
            r14.v0 = r8
            return
        L3d:
            if (r0 == r8) goto L48
            if (r0 <= r8) goto L315
            r14.t0 = r3
            r14.u0 = r0
            r14.v0 = r8
            return
        L48:
            if (r1 == r8) goto L315
            if (r1 <= r8) goto L315
            r14.t0 = r3
            r14.u0 = r8
            r14.v0 = r1
            return
        L53:
            int r0 = r6.f0
            int r2 = r6.g0
            int r9 = r6.h0
            int r10 = r6.i0
            int r5 = r6.j0
            int r11 = r6.k0
            float r12 = r6.l0
            int r3 = r6.p
            r13 = 0
            if (r3 == r8) goto L83
            java.lang.Object r14 = r7.get(r3)
            r2 = r14
            l21 r2 = (defpackage.l21) r2
            if (r2 == 0) goto L7f
            float r14 = r6.r
            int r4 = r6.q
            g11 r1 = defpackage.g11.CENTER
            r5 = 0
            r3 = r1
            r0 = r17
            r0.w(r1, r2, r3, r4, r5)
            r1 = r0
            r1.D = r14
        L7f:
            r0 = r1
            r2 = r6
            goto L183
        L83:
            if (r0 == r8) goto L99
            java.lang.Object r0 = r7.get(r0)
            r2 = r0
            l21 r2 = (defpackage.l21) r2
            if (r2 == 0) goto Laf
            g11 r1 = defpackage.g11.LEFT
            int r4 = r6.leftMargin
            r3 = r1
            r0 = r17
            r0.w(r1, r2, r3, r4, r5)
            goto Laf
        L99:
            if (r2 == r8) goto Laf
            java.lang.Object r0 = r7.get(r2)
            r2 = r0
            l21 r2 = (defpackage.l21) r2
            if (r2 == 0) goto Laf
            g11 r1 = defpackage.g11.LEFT
            g11 r3 = defpackage.g11.RIGHT
            int r4 = r6.leftMargin
            r0 = r17
            r0.w(r1, r2, r3, r4, r5)
        Laf:
            if (r9 == r8) goto Lc7
            java.lang.Object r0 = r7.get(r9)
            r2 = r0
            l21 r2 = (defpackage.l21) r2
            if (r2 == 0) goto Ldd
            g11 r1 = defpackage.g11.RIGHT
            g11 r3 = defpackage.g11.LEFT
            int r4 = r6.rightMargin
            r0 = r17
            r5 = r11
            r0.w(r1, r2, r3, r4, r5)
            goto Ldd
        Lc7:
            r5 = r11
            if (r10 == r8) goto Ldd
            java.lang.Object r0 = r7.get(r10)
            r2 = r0
            l21 r2 = (defpackage.l21) r2
            if (r2 == 0) goto Ldd
            g11 r1 = defpackage.g11.RIGHT
            int r4 = r6.rightMargin
            r3 = r1
            r0 = r17
            r0.w(r1, r2, r3, r4, r5)
        Ldd:
            int r0 = r6.i
            if (r0 == r8) goto Lf7
            java.lang.Object r0 = r7.get(r0)
            r2 = r0
            l21 r2 = (defpackage.l21) r2
            if (r2 == 0) goto L111
            g11 r1 = defpackage.g11.TOP
            int r4 = r6.topMargin
            int r5 = r6.x
            r3 = r1
            r0 = r17
            r0.w(r1, r2, r3, r4, r5)
            goto L111
        Lf7:
            int r0 = r6.j
            if (r0 == r8) goto L111
            java.lang.Object r0 = r7.get(r0)
            r2 = r0
            l21 r2 = (defpackage.l21) r2
            if (r2 == 0) goto L111
            g11 r1 = defpackage.g11.TOP
            g11 r3 = defpackage.g11.BOTTOM
            int r4 = r6.topMargin
            int r5 = r6.x
            r0 = r17
            r0.w(r1, r2, r3, r4, r5)
        L111:
            int r0 = r6.k
            if (r0 == r8) goto L12c
            java.lang.Object r0 = r7.get(r0)
            r2 = r0
            l21 r2 = (defpackage.l21) r2
            if (r2 == 0) goto L145
            g11 r1 = defpackage.g11.BOTTOM
            g11 r3 = defpackage.g11.TOP
            int r4 = r6.bottomMargin
            int r5 = r6.z
            r0 = r17
            r0.w(r1, r2, r3, r4, r5)
            goto L145
        L12c:
            int r0 = r6.l
            if (r0 == r8) goto L145
            java.lang.Object r0 = r7.get(r0)
            r2 = r0
            l21 r2 = (defpackage.l21) r2
            if (r2 == 0) goto L145
            g11 r1 = defpackage.g11.BOTTOM
            int r4 = r6.bottomMargin
            int r5 = r6.z
            r3 = r1
            r0 = r17
            r0.w(r1, r2, r3, r4, r5)
        L145:
            int r4 = r6.m
            if (r4 == r8) goto L156
            g11 r5 = defpackage.g11.BASELINE
            r0 = r14
            r1 = r17
            r2 = r6
            r3 = r7
            r0.n(r1, r2, r3, r4, r5)
        L153:
            r0 = r17
            goto L175
        L156:
            r2 = r6
            int r4 = r2.n
            if (r4 == r8) goto L166
            g11 r5 = defpackage.g11.TOP
            r0 = r14
            r1 = r17
            r3 = r19
            r0.n(r1, r2, r3, r4, r5)
            goto L153
        L166:
            int r4 = r2.o
            if (r4 == r8) goto L153
            g11 r5 = defpackage.g11.BOTTOM
            r0 = r14
            r1 = r17
            r3 = r19
            r0.n(r1, r2, r3, r4, r5)
            r0 = r1
        L175:
            int r14 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r14 < 0) goto L17b
            r0.e0 = r12
        L17b:
            float r14 = r2.F
            int r1 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r1 < 0) goto L183
            r0.f0 = r14
        L183:
            if (r15 == 0) goto L193
            int r14 = r2.T
            if (r14 != r8) goto L18d
            int r1 = r2.U
            if (r1 == r8) goto L193
        L18d:
            int r1 = r2.U
            r0.Z = r14
            r0.a0 = r1
        L193:
            boolean r14 = r2.a0
            r1 = -2
            r3 = 0
            if (r14 != 0) goto L1ca
            int r14 = r2.width
            if (r14 != r8) goto L1c1
            boolean r14 = r2.W
            if (r14 == 0) goto L1a7
            k21 r14 = defpackage.k21.MATCH_CONSTRAINT
            r0.N(r14)
            goto L1ac
        L1a7:
            k21 r14 = defpackage.k21.MATCH_PARENT
            r0.N(r14)
        L1ac:
            g11 r14 = defpackage.g11.LEFT
            h11 r14 = r0.j(r14)
            int r4 = r2.leftMargin
            r14.g = r4
            g11 r14 = defpackage.g11.RIGHT
            h11 r14 = r0.j(r14)
            int r4 = r2.rightMargin
            r14.g = r4
            goto L1dd
        L1c1:
            k21 r14 = defpackage.k21.MATCH_CONSTRAINT
            r0.N(r14)
            r0.P(r3)
            goto L1dd
        L1ca:
            k21 r14 = defpackage.k21.FIXED
            r0.N(r14)
            int r14 = r2.width
            r0.P(r14)
            int r14 = r2.width
            if (r14 != r1) goto L1dd
            k21 r14 = defpackage.k21.WRAP_CONTENT
            r0.N(r14)
        L1dd:
            boolean r14 = r2.b0
            if (r14 != 0) goto L212
            int r14 = r2.height
            if (r14 != r8) goto L209
            boolean r14 = r2.X
            if (r14 == 0) goto L1ef
            k21 r14 = defpackage.k21.MATCH_CONSTRAINT
            r0.O(r14)
            goto L1f4
        L1ef:
            k21 r14 = defpackage.k21.MATCH_PARENT
            r0.O(r14)
        L1f4:
            g11 r14 = defpackage.g11.TOP
            h11 r14 = r0.j(r14)
            int r1 = r2.topMargin
            r14.g = r1
            g11 r14 = defpackage.g11.BOTTOM
            h11 r14 = r0.j(r14)
            int r1 = r2.bottomMargin
            r14.g = r1
            goto L225
        L209:
            k21 r14 = defpackage.k21.MATCH_CONSTRAINT
            r0.O(r14)
            r0.M(r3)
            goto L225
        L212:
            k21 r14 = defpackage.k21.FIXED
            r0.O(r14)
            int r14 = r2.height
            r0.M(r14)
            int r14 = r2.height
            if (r14 != r1) goto L225
            k21 r14 = defpackage.k21.WRAP_CONTENT
            r0.O(r14)
        L225:
            java.lang.String r14 = r2.G
            r1 = 1
            if (r14 == 0) goto L2b3
            int r4 = r14.length()
            if (r4 != 0) goto L232
            goto L2b3
        L232:
            int r4 = r14.length()
            r5 = 44
            int r5 = r14.indexOf(r5)
            if (r5 <= 0) goto L25b
            int r6 = r4 + (-1)
            if (r5 >= r6) goto L25b
            java.lang.String r6 = r14.substring(r3, r5)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L250
            r8 = r3
            goto L259
        L250:
            java.lang.String r7 = "H"
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L259
            r8 = r1
        L259:
            int r5 = r5 + r1
            goto L25c
        L25b:
            r5 = r3
        L25c:
            r6 = 58
            int r6 = r14.indexOf(r6)
            if (r6 < 0) goto L29a
            int r4 = r4 - r1
            if (r6 >= r4) goto L29a
            java.lang.String r4 = r14.substring(r5, r6)
            int r6 = r6 + r1
            java.lang.String r14 = r14.substring(r6)
            int r5 = r4.length()
            if (r5 <= 0) goto L2a9
            int r5 = r14.length()
            if (r5 <= 0) goto L2a9
            float r4 = java.lang.Float.parseFloat(r4)     // Catch: java.lang.NumberFormatException -> L2a9
            float r14 = java.lang.Float.parseFloat(r14)     // Catch: java.lang.NumberFormatException -> L2a9
            int r5 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r5 <= 0) goto L2a9
            int r5 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r5 <= 0) goto L2a9
            if (r8 != r1) goto L294
            float r14 = r14 / r4
            float r14 = java.lang.Math.abs(r14)     // Catch: java.lang.NumberFormatException -> L2a9
            goto L2aa
        L294:
            float r4 = r4 / r14
            float r14 = java.lang.Math.abs(r4)     // Catch: java.lang.NumberFormatException -> L2a9
            goto L2aa
        L29a:
            java.lang.String r14 = r14.substring(r5)
            int r4 = r14.length()
            if (r4 <= 0) goto L2a9
            float r14 = java.lang.Float.parseFloat(r14)     // Catch: java.lang.NumberFormatException -> L2a9
            goto L2aa
        L2a9:
            r14 = r13
        L2aa:
            int r4 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r4 <= 0) goto L2b5
            r0.X = r14
            r0.Y = r8
            goto L2b5
        L2b3:
            r0.X = r13
        L2b5:
            float r14 = r2.H
            float[] r4 = r0.m0
            r4[r3] = r14
            float r14 = r2.I
            r4[r1] = r14
            int r14 = r2.J
            r0.k0 = r14
            int r14 = r2.K
            r0.l0 = r14
            int r14 = r2.Z
            if (r14 < 0) goto L2d0
            r1 = 3
            if (r14 > r1) goto L2d0
            r0.q = r14
        L2d0:
            int r14 = r2.L
            int r1 = r2.N
            int r4 = r2.P
            float r5 = r2.R
            r0.r = r14
            r0.u = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r1) goto L2e2
            r4 = r3
        L2e2:
            r0.v = r4
            r0.w = r5
            int r4 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            r6 = 2
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r4 <= 0) goto L2f5
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 >= 0) goto L2f5
            if (r14 != 0) goto L2f5
            r0.r = r6
        L2f5:
            int r14 = r2.M
            int r4 = r2.O
            int r5 = r2.Q
            float r2 = r2.S
            r0.s = r14
            r0.x = r4
            if (r5 != r1) goto L304
            goto L305
        L304:
            r3 = r5
        L305:
            r0.y = r3
            r0.z = r2
            int r1 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r1 <= 0) goto L315
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r1 >= 0) goto L315
            if (r14 != 0) goto L315
            r0.s = r6
        L315:
            return
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r0 = this;
            o11 r0 = new o11
            r0.<init>()
            return r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r12) {
            r11 = this;
            o11 r0 = new o11
            android.content.Context r11 = r11.getContext()
            r0.<init>(r11, r12)
            r1 = -1
            r0.a = r1
            r0.b = r1
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.c = r2
            r3 = 1
            r0.d = r3
            r0.e = r1
            r0.f = r1
            r0.g = r1
            r0.h = r1
            r0.i = r1
            r0.j = r1
            r0.k = r1
            r0.l = r1
            r0.m = r1
            r0.n = r1
            r0.o = r1
            r0.p = r1
            r4 = 0
            r0.q = r4
            r5 = 0
            r0.r = r5
            r0.s = r1
            r0.t = r1
            r0.u = r1
            r0.v = r1
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.w = r6
            r0.x = r6
            r0.y = r6
            r0.z = r6
            r0.A = r6
            r0.B = r6
            r0.C = r6
            r0.D = r4
            r7 = 1056964608(0x3f000000, float:0.5)
            r0.E = r7
            r0.F = r7
            r8 = 0
            r0.G = r8
            r0.H = r2
            r0.I = r2
            r0.J = r4
            r0.K = r4
            r0.L = r4
            r0.M = r4
            r0.N = r4
            r0.O = r4
            r0.P = r4
            r0.Q = r4
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.R = r2
            r0.S = r2
            r0.T = r1
            r0.U = r1
            r0.V = r1
            r0.W = r4
            r0.X = r4
            r0.Y = r8
            r0.Z = r4
            r0.a0 = r3
            r0.b0 = r3
            r0.c0 = r4
            r0.d0 = r4
            r0.e0 = r4
            r0.f0 = r1
            r0.g0 = r1
            r0.h0 = r1
            r0.i0 = r1
            r0.j0 = r6
            r0.k0 = r6
            r0.l0 = r7
            l21 r2 = new l21
            r2.<init>()
            r0.p0 = r2
            int[] r2 = defpackage.e75.b
            android.content.res.TypedArray r11 = r11.obtainStyledAttributes(r12, r2)
            int r12 = r11.getIndexCount()
            r2 = r4
        La8:
            if (r2 >= r12) goto L39a
            int r6 = r11.getIndex(r2)
            android.util.SparseIntArray r7 = defpackage.n11.a
            int r7 = r7.get(r6)
            java.lang.String r8 = "ConstraintLayout"
            r9 = 2
            r10 = -2
            switch(r7) {
                case 1: goto L38e;
                case 2: goto L37d;
                case 3: goto L374;
                case 4: goto L35f;
                case 5: goto L356;
                case 6: goto L34d;
                case 7: goto L344;
                case 8: goto L333;
                case 9: goto L322;
                case 10: goto L310;
                case 11: goto L2fe;
                case 12: goto L2ec;
                case 13: goto L2da;
                case 14: goto L2c8;
                case 15: goto L2b6;
                case 16: goto L2a4;
                case 17: goto L292;
                case 18: goto L280;
                case 19: goto L26e;
                case 20: goto L25c;
                case 21: goto L252;
                case 22: goto L248;
                case 23: goto L23e;
                case 24: goto L234;
                case 25: goto L22a;
                case 26: goto L220;
                case 27: goto L216;
                case 28: goto L20c;
                case 29: goto L202;
                case 30: goto L1f8;
                case 31: goto L1e9;
                case 32: goto L1da;
                case 33: goto L1c4;
                case 34: goto L1ae;
                case 35: goto L19e;
                case 36: goto L188;
                case 37: goto L172;
                case 38: goto L162;
                default: goto Lbb;
            }
        Lbb:
            switch(r7) {
                case 44: goto L159;
                case 45: goto L14f;
                case 46: goto L145;
                case 47: goto L13d;
                case 48: goto L135;
                case 49: goto L12b;
                case 50: goto L121;
                case 51: goto L119;
                case 52: goto L107;
                case 53: goto Lf5;
                case 54: goto Leb;
                case 55: goto Le1;
                default: goto Lbe;
            }
        Lbe:
            switch(r7) {
                case 64: goto Ldc;
                case 65: goto Ld7;
                case 66: goto Lcd;
                case 67: goto Lc3;
                default: goto Lc1;
            }
        Lc1:
            goto L396
        Lc3:
            boolean r7 = r0.d
            boolean r6 = r11.getBoolean(r6, r7)
            r0.d = r6
            goto L396
        Lcd:
            int r7 = r0.Z
            int r6 = r11.getInt(r6, r7)
            r0.Z = r6
            goto L396
        Ld7:
            defpackage.z11.m(r0, r11, r6, r3)
            goto L396
        Ldc:
            defpackage.z11.m(r0, r11, r6, r4)
            goto L396
        Le1:
            int r7 = r0.C
            int r6 = r11.getDimensionPixelSize(r6, r7)
            r0.C = r6
            goto L396
        Leb:
            int r7 = r0.D
            int r6 = r11.getDimensionPixelSize(r6, r7)
            r0.D = r6
            goto L396
        Lf5:
            int r7 = r0.o
            int r7 = r11.getResourceId(r6, r7)
            r0.o = r7
            if (r7 != r1) goto L396
            int r6 = r11.getInt(r6, r1)
            r0.o = r6
            goto L396
        L107:
            int r7 = r0.n
            int r7 = r11.getResourceId(r6, r7)
            r0.n = r7
            if (r7 != r1) goto L396
            int r6 = r11.getInt(r6, r1)
            r0.n = r6
            goto L396
        L119:
            java.lang.String r6 = r11.getString(r6)
            r0.Y = r6
            goto L396
        L121:
            int r7 = r0.U
            int r6 = r11.getDimensionPixelOffset(r6, r7)
            r0.U = r6
            goto L396
        L12b:
            int r7 = r0.T
            int r6 = r11.getDimensionPixelOffset(r6, r7)
            r0.T = r6
            goto L396
        L135:
            int r6 = r11.getInt(r6, r4)
            r0.K = r6
            goto L396
        L13d:
            int r6 = r11.getInt(r6, r4)
            r0.J = r6
            goto L396
        L145:
            float r7 = r0.I
            float r6 = r11.getFloat(r6, r7)
            r0.I = r6
            goto L396
        L14f:
            float r7 = r0.H
            float r6 = r11.getFloat(r6, r7)
            r0.H = r6
            goto L396
        L159:
            java.lang.String r6 = r11.getString(r6)
            defpackage.z11.n(r0, r6)
            goto L396
        L162:
            float r7 = r0.S
            float r6 = r11.getFloat(r6, r7)
            float r6 = java.lang.Math.max(r5, r6)
            r0.S = r6
            r0.M = r9
            goto L396
        L172:
            int r7 = r0.Q     // Catch: java.lang.Exception -> L17c
            int r7 = r11.getDimensionPixelSize(r6, r7)     // Catch: java.lang.Exception -> L17c
            r0.Q = r7     // Catch: java.lang.Exception -> L17c
            goto L396
        L17c:
            int r7 = r0.Q
            int r6 = r11.getInt(r6, r7)
            if (r6 != r10) goto L396
            r0.Q = r10
            goto L396
        L188:
            int r7 = r0.O     // Catch: java.lang.Exception -> L192
            int r7 = r11.getDimensionPixelSize(r6, r7)     // Catch: java.lang.Exception -> L192
            r0.O = r7     // Catch: java.lang.Exception -> L192
            goto L396
        L192:
            int r7 = r0.O
            int r6 = r11.getInt(r6, r7)
            if (r6 != r10) goto L396
            r0.O = r10
            goto L396
        L19e:
            float r7 = r0.R
            float r6 = r11.getFloat(r6, r7)
            float r6 = java.lang.Math.max(r5, r6)
            r0.R = r6
            r0.L = r9
            goto L396
        L1ae:
            int r7 = r0.P     // Catch: java.lang.Exception -> L1b8
            int r7 = r11.getDimensionPixelSize(r6, r7)     // Catch: java.lang.Exception -> L1b8
            r0.P = r7     // Catch: java.lang.Exception -> L1b8
            goto L396
        L1b8:
            int r7 = r0.P
            int r6 = r11.getInt(r6, r7)
            if (r6 != r10) goto L396
            r0.P = r10
            goto L396
        L1c4:
            int r7 = r0.N     // Catch: java.lang.Exception -> L1ce
            int r7 = r11.getDimensionPixelSize(r6, r7)     // Catch: java.lang.Exception -> L1ce
            r0.N = r7     // Catch: java.lang.Exception -> L1ce
            goto L396
        L1ce:
            int r7 = r0.N
            int r6 = r11.getInt(r6, r7)
            if (r6 != r10) goto L396
            r0.N = r10
            goto L396
        L1da:
            int r6 = r11.getInt(r6, r4)
            r0.M = r6
            if (r6 != r3) goto L396
            java.lang.String r6 = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead."
            android.util.Log.e(r8, r6)
            goto L396
        L1e9:
            int r6 = r11.getInt(r6, r4)
            r0.L = r6
            if (r6 != r3) goto L396
            java.lang.String r6 = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead."
            android.util.Log.e(r8, r6)
            goto L396
        L1f8:
            float r7 = r0.F
            float r6 = r11.getFloat(r6, r7)
            r0.F = r6
            goto L396
        L202:
            float r7 = r0.E
            float r6 = r11.getFloat(r6, r7)
            r0.E = r6
            goto L396
        L20c:
            boolean r7 = r0.X
            boolean r6 = r11.getBoolean(r6, r7)
            r0.X = r6
            goto L396
        L216:
            boolean r7 = r0.W
            boolean r6 = r11.getBoolean(r6, r7)
            r0.W = r6
            goto L396
        L220:
            int r7 = r0.B
            int r6 = r11.getDimensionPixelSize(r6, r7)
            r0.B = r6
            goto L396
        L22a:
            int r7 = r0.A
            int r6 = r11.getDimensionPixelSize(r6, r7)
            r0.A = r6
            goto L396
        L234:
            int r7 = r0.z
            int r6 = r11.getDimensionPixelSize(r6, r7)
            r0.z = r6
            goto L396
        L23e:
            int r7 = r0.y
            int r6 = r11.getDimensionPixelSize(r6, r7)
            r0.y = r6
            goto L396
        L248:
            int r7 = r0.x
            int r6 = r11.getDimensionPixelSize(r6, r7)
            r0.x = r6
            goto L396
        L252:
            int r7 = r0.w
            int r6 = r11.getDimensionPixelSize(r6, r7)
            r0.w = r6
            goto L396
        L25c:
            int r7 = r0.v
            int r7 = r11.getResourceId(r6, r7)
            r0.v = r7
            if (r7 != r1) goto L396
            int r6 = r11.getInt(r6, r1)
            r0.v = r6
            goto L396
        L26e:
            int r7 = r0.u
            int r7 = r11.getResourceId(r6, r7)
            r0.u = r7
            if (r7 != r1) goto L396
            int r6 = r11.getInt(r6, r1)
            r0.u = r6
            goto L396
        L280:
            int r7 = r0.t
            int r7 = r11.getResourceId(r6, r7)
            r0.t = r7
            if (r7 != r1) goto L396
            int r6 = r11.getInt(r6, r1)
            r0.t = r6
            goto L396
        L292:
            int r7 = r0.s
            int r7 = r11.getResourceId(r6, r7)
            r0.s = r7
            if (r7 != r1) goto L396
            int r6 = r11.getInt(r6, r1)
            r0.s = r6
            goto L396
        L2a4:
            int r7 = r0.m
            int r7 = r11.getResourceId(r6, r7)
            r0.m = r7
            if (r7 != r1) goto L396
            int r6 = r11.getInt(r6, r1)
            r0.m = r6
            goto L396
        L2b6:
            int r7 = r0.l
            int r7 = r11.getResourceId(r6, r7)
            r0.l = r7
            if (r7 != r1) goto L396
            int r6 = r11.getInt(r6, r1)
            r0.l = r6
            goto L396
        L2c8:
            int r7 = r0.k
            int r7 = r11.getResourceId(r6, r7)
            r0.k = r7
            if (r7 != r1) goto L396
            int r6 = r11.getInt(r6, r1)
            r0.k = r6
            goto L396
        L2da:
            int r7 = r0.j
            int r7 = r11.getResourceId(r6, r7)
            r0.j = r7
            if (r7 != r1) goto L396
            int r6 = r11.getInt(r6, r1)
            r0.j = r6
            goto L396
        L2ec:
            int r7 = r0.i
            int r7 = r11.getResourceId(r6, r7)
            r0.i = r7
            if (r7 != r1) goto L396
            int r6 = r11.getInt(r6, r1)
            r0.i = r6
            goto L396
        L2fe:
            int r7 = r0.h
            int r7 = r11.getResourceId(r6, r7)
            r0.h = r7
            if (r7 != r1) goto L396
            int r6 = r11.getInt(r6, r1)
            r0.h = r6
            goto L396
        L310:
            int r7 = r0.g
            int r7 = r11.getResourceId(r6, r7)
            r0.g = r7
            if (r7 != r1) goto L396
            int r6 = r11.getInt(r6, r1)
            r0.g = r6
            goto L396
        L322:
            int r7 = r0.f
            int r7 = r11.getResourceId(r6, r7)
            r0.f = r7
            if (r7 != r1) goto L396
            int r6 = r11.getInt(r6, r1)
            r0.f = r6
            goto L396
        L333:
            int r7 = r0.e
            int r7 = r11.getResourceId(r6, r7)
            r0.e = r7
            if (r7 != r1) goto L396
            int r6 = r11.getInt(r6, r1)
            r0.e = r6
            goto L396
        L344:
            float r7 = r0.c
            float r6 = r11.getFloat(r6, r7)
            r0.c = r6
            goto L396
        L34d:
            int r7 = r0.b
            int r6 = r11.getDimensionPixelOffset(r6, r7)
            r0.b = r6
            goto L396
        L356:
            int r7 = r0.a
            int r6 = r11.getDimensionPixelOffset(r6, r7)
            r0.a = r6
            goto L396
        L35f:
            float r7 = r0.r
            float r6 = r11.getFloat(r6, r7)
            r7 = 1135869952(0x43b40000, float:360.0)
            float r6 = r6 % r7
            r0.r = r6
            int r8 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r8 >= 0) goto L396
            float r6 = r7 - r6
            float r6 = r6 % r7
            r0.r = r6
            goto L396
        L374:
            int r7 = r0.q
            int r6 = r11.getDimensionPixelSize(r6, r7)
            r0.q = r6
            goto L396
        L37d:
            int r7 = r0.p
            int r7 = r11.getResourceId(r6, r7)
            r0.p = r7
            if (r7 != r1) goto L396
            int r6 = r11.getInt(r6, r1)
            r0.p = r6
            goto L396
        L38e:
            int r7 = r0.V
            int r6 = r11.getInt(r6, r7)
            r0.V = r6
        L396:
            int r2 = r2 + 1
            goto La8
        L39a:
            r11.recycle()
            r0.a()
            return r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r8) {
            r7 = this;
            o11 r7 = new o11
            r7.<init>(r8)
            r0 = -1
            r7.a = r0
            r7.b = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r7.c = r1
            r2 = 1
            r7.d = r2
            r7.e = r0
            r7.f = r0
            r7.g = r0
            r7.h = r0
            r7.i = r0
            r7.j = r0
            r7.k = r0
            r7.l = r0
            r7.m = r0
            r7.n = r0
            r7.o = r0
            r7.p = r0
            r3 = 0
            r7.q = r3
            r4 = 0
            r7.r = r4
            r7.s = r0
            r7.t = r0
            r7.u = r0
            r7.v = r0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r7.w = r4
            r7.x = r4
            r7.y = r4
            r7.z = r4
            r7.A = r4
            r7.B = r4
            r7.C = r4
            r7.D = r3
            r5 = 1056964608(0x3f000000, float:0.5)
            r7.E = r5
            r7.F = r5
            r6 = 0
            r7.G = r6
            r7.H = r1
            r7.I = r1
            r7.J = r3
            r7.K = r3
            r7.L = r3
            r7.M = r3
            r7.N = r3
            r7.O = r3
            r7.P = r3
            r7.Q = r3
            r1 = 1065353216(0x3f800000, float:1.0)
            r7.R = r1
            r7.S = r1
            r7.T = r0
            r7.U = r0
            r7.V = r0
            r7.W = r3
            r7.X = r3
            r7.Y = r6
            r7.Z = r3
            r7.a0 = r2
            r7.b0 = r2
            r7.c0 = r3
            r7.d0 = r3
            r7.e0 = r3
            r7.f0 = r0
            r7.g0 = r0
            r7.h0 = r0
            r7.i0 = r0
            r7.j0 = r4
            r7.k0 = r4
            r7.l0 = r5
            l21 r0 = new l21
            r0.<init>()
            r7.p0 = r0
            boolean r0 = r8 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lbe
            r0 = r8
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r0.leftMargin
            r7.leftMargin = r1
            int r1 = r0.rightMargin
            r7.rightMargin = r1
            int r1 = r0.topMargin
            r7.topMargin = r1
            int r1 = r0.bottomMargin
            r7.bottomMargin = r1
            int r1 = r0.getMarginStart()
            r7.setMarginStart(r1)
            int r0 = r0.getMarginEnd()
            r7.setMarginEnd(r0)
        Lbe:
            boolean r0 = r8 instanceof defpackage.o11
            if (r0 != 0) goto Lc3
            return r7
        Lc3:
            o11 r8 = (defpackage.o11) r8
            int r0 = r8.a
            r7.a = r0
            int r0 = r8.b
            r7.b = r0
            float r0 = r8.c
            r7.c = r0
            boolean r0 = r8.d
            r7.d = r0
            int r0 = r8.e
            r7.e = r0
            int r0 = r8.f
            r7.f = r0
            int r0 = r8.g
            r7.g = r0
            int r0 = r8.h
            r7.h = r0
            int r0 = r8.i
            r7.i = r0
            int r0 = r8.j
            r7.j = r0
            int r0 = r8.k
            r7.k = r0
            int r0 = r8.l
            r7.l = r0
            int r0 = r8.m
            r7.m = r0
            int r0 = r8.n
            r7.n = r0
            int r0 = r8.o
            r7.o = r0
            int r0 = r8.p
            r7.p = r0
            int r0 = r8.q
            r7.q = r0
            float r0 = r8.r
            r7.r = r0
            int r0 = r8.s
            r7.s = r0
            int r0 = r8.t
            r7.t = r0
            int r0 = r8.u
            r7.u = r0
            int r0 = r8.v
            r7.v = r0
            int r0 = r8.w
            r7.w = r0
            int r0 = r8.x
            r7.x = r0
            int r0 = r8.y
            r7.y = r0
            int r0 = r8.z
            r7.z = r0
            int r0 = r8.A
            r7.A = r0
            int r0 = r8.B
            r7.B = r0
            int r0 = r8.C
            r7.C = r0
            int r0 = r8.D
            r7.D = r0
            float r0 = r8.E
            r7.E = r0
            float r0 = r8.F
            r7.F = r0
            java.lang.String r0 = r8.G
            r7.G = r0
            float r0 = r8.H
            r7.H = r0
            float r0 = r8.I
            r7.I = r0
            int r0 = r8.J
            r7.J = r0
            int r0 = r8.K
            r7.K = r0
            boolean r0 = r8.W
            r7.W = r0
            boolean r0 = r8.X
            r7.X = r0
            int r0 = r8.L
            r7.L = r0
            int r0 = r8.M
            r7.M = r0
            int r0 = r8.N
            r7.N = r0
            int r0 = r8.P
            r7.P = r0
            int r0 = r8.O
            r7.O = r0
            int r0 = r8.Q
            r7.Q = r0
            float r0 = r8.R
            r7.R = r0
            float r0 = r8.S
            r7.S = r0
            int r0 = r8.T
            r7.T = r0
            int r0 = r8.U
            r7.U = r0
            int r0 = r8.V
            r7.V = r0
            boolean r0 = r8.a0
            r7.a0 = r0
            boolean r0 = r8.b0
            r7.b0 = r0
            boolean r0 = r8.c0
            r7.c0 = r0
            boolean r0 = r8.d0
            r7.d0 = r0
            int r0 = r8.f0
            r7.f0 = r0
            int r0 = r8.g0
            r7.g0 = r0
            int r0 = r8.h0
            r7.h0 = r0
            int r0 = r8.i0
            r7.i0 = r0
            int r0 = r8.j0
            r7.j0 = r0
            int r0 = r8.k0
            r7.k0 = r0
            float r0 = r8.l0
            r7.l0 = r0
            java.lang.String r0 = r8.Y
            r7.Y = r0
            int r0 = r8.Z
            r7.Z = r0
            l21 r8 = r8.p0
            r7.p0 = r8
            return r7
    }

    public int getMaxHeight() {
            r0 = this;
            int r0 = r0.f0
            return r0
    }

    public int getMaxWidth() {
            r0 = this;
            int r0 = r0.e0
            return r0
    }

    public int getMinHeight() {
            r0 = this;
            int r0 = r0.d0
            return r0
    }

    public int getMinWidth() {
            r0 = this;
            int r0 = r0.R
            return r0
    }

    public int getOptimizationLevel() {
            r0 = this;
            m21 r0 = r0.L
            int r0 = r0.G0
            return r0
    }

    public java.lang.String getSceneString() {
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            m21 r1 = r11.L
            java.lang.String r2 = r1.j
            r3 = -1
            if (r2 != 0) goto L25
            int r2 = r11.getId()
            if (r2 == r3) goto L21
            android.content.Context r4 = r11.getContext()
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r2 = r4.getResourceEntryName(r2)
            r1.j = r2
            goto L25
        L21:
            java.lang.String r2 = "parent"
            r1.j = r2
        L25:
            java.lang.String r2 = r1.j0
            java.lang.String r4 = " setDebugName "
            java.lang.String r5 = "ConstraintLayout"
            if (r2 != 0) goto L42
            java.lang.String r2 = r1.j
            r1.j0 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
            java.lang.String r6 = r1.j0
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r5, r2)
        L42:
            java.util.ArrayList r2 = r1.t0
            int r6 = r2.size()
            r7 = 0
        L49:
            if (r7 >= r6) goto L89
            java.lang.Object r8 = r2.get(r7)
            int r7 = r7 + 1
            l21 r8 = (defpackage.l21) r8
            android.view.View r9 = r8.g0
            if (r9 == 0) goto L49
            java.lang.String r10 = r8.j
            if (r10 != 0) goto L6f
            int r9 = r9.getId()
            if (r9 == r3) goto L6f
            android.content.Context r10 = r11.getContext()
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r9 = r10.getResourceEntryName(r9)
            r8.j = r9
        L6f:
            java.lang.String r9 = r8.j0
            if (r9 != 0) goto L49
            java.lang.String r9 = r8.j
            r8.j0 = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r4)
            java.lang.String r8 = r8.j0
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            android.util.Log.v(r5, r8)
            goto L49
        L89:
            r1.o(r0)
            java.lang.String r11 = r0.toString()
            return r11
    }

    public final defpackage.l21 h(android.view.View r2) {
            r1 = this;
            if (r2 != r1) goto L5
            m21 r1 = r1.L
            return r1
        L5:
            if (r2 == 0) goto L34
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            boolean r0 = r0 instanceof defpackage.o11
            if (r0 == 0) goto L18
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            o11 r1 = (defpackage.o11) r1
            l21 r1 = r1.p0
            return r1
        L18:
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            android.view.ViewGroup$LayoutParams r1 = r1.generateLayoutParams(r0)
            r2.setLayoutParams(r1)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            boolean r1 = r1 instanceof defpackage.o11
            if (r1 == 0) goto L34
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            o11 r1 = (defpackage.o11) r1
            l21 r1 = r1.p0
            return r1
        L34:
            r1 = 0
            return r1
    }

    public final void i(android.util.AttributeSet r8, int r9) {
            r7 = this;
            m21 r0 = r7.L
            r0.g0 = r7
            p11 r1 = r7.n0
            r0.x0 = r1
            ai1 r2 = r0.v0
            r2.h = r1
            android.util.SparseArray r1 = r7.A
            int r2 = r7.getId()
            r1.put(r2, r7)
            r1 = 0
            r7.i0 = r1
            if (r8 == 0) goto La3
            android.content.Context r2 = r7.getContext()
            int[] r3 = defpackage.e75.b
            r4 = 0
            android.content.res.TypedArray r8 = r2.obtainStyledAttributes(r8, r3, r9, r4)
            int r9 = r8.getIndexCount()
            r2 = r4
        L2a:
            if (r2 >= r9) goto La0
            int r3 = r8.getIndex(r2)
            r5 = 16
            if (r3 != r5) goto L3d
            int r5 = r7.R
            int r3 = r8.getDimensionPixelOffset(r3, r5)
            r7.R = r3
            goto L9d
        L3d:
            r5 = 17
            if (r3 != r5) goto L4a
            int r5 = r7.d0
            int r3 = r8.getDimensionPixelOffset(r3, r5)
            r7.d0 = r3
            goto L9d
        L4a:
            r5 = 14
            if (r3 != r5) goto L57
            int r5 = r7.e0
            int r3 = r8.getDimensionPixelOffset(r3, r5)
            r7.e0 = r3
            goto L9d
        L57:
            r5 = 15
            if (r3 != r5) goto L64
            int r5 = r7.f0
            int r3 = r8.getDimensionPixelOffset(r3, r5)
            r7.f0 = r3
            goto L9d
        L64:
            r5 = 113(0x71, float:1.58E-43)
            if (r3 != r5) goto L71
            int r5 = r7.h0
            int r3 = r8.getInt(r3, r5)
            r7.h0 = r3
            goto L9d
        L71:
            r5 = 56
            if (r3 != r5) goto L82
            int r3 = r8.getResourceId(r3, r4)
            if (r3 == 0) goto L9d
            r7.k(r3)     // Catch: android.content.res.Resources.NotFoundException -> L7f
            goto L9d
        L7f:
            r7.j0 = r1
            goto L9d
        L82:
            r5 = 34
            if (r3 != r5) goto L9d
            int r3 = r8.getResourceId(r3, r4)
            z11 r5 = new z11     // Catch: android.content.res.Resources.NotFoundException -> L99
            r5.<init>()     // Catch: android.content.res.Resources.NotFoundException -> L99
            r7.i0 = r5     // Catch: android.content.res.Resources.NotFoundException -> L99
            android.content.Context r6 = r7.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L99
            r5.j(r6, r3)     // Catch: android.content.res.Resources.NotFoundException -> L99
            goto L9b
        L99:
            r7.i0 = r1
        L9b:
            r7.k0 = r3
        L9d:
            int r2 = r2 + 1
            goto L2a
        La0:
            r8.recycle()
        La3:
            int r7 = r7.h0
            r0.G0 = r7
            r7 = 512(0x200, float:7.17E-43)
            boolean r7 = r0.X(r7)
            defpackage.jv3.q = r7
            return
    }

    public final boolean j() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.flags
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L17
            int r2 = r2.getLayoutDirection()
            r0 = 1
            if (r0 != r2) goto L17
            return r0
        L17:
            r2 = 0
            return r2
    }

    public void k(int r9) {
            r8 = this;
            s11 r0 = new s11
            android.content.Context r1 = r8.getContext()
            r0.<init>()
            r2 = -1
            r0.a = r2
            r0.b = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.d = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.e = r2
            r0.c = r8
            java.lang.String r2 = "Error parsing resource: "
            java.lang.String r3 = "ConstraintLayoutStates"
            android.content.res.Resources r4 = r1.getResources()
            android.content.res.XmlResourceParser r4 = r4.getXml(r9)
            int r5 = r4.getEventType()     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            r6 = 0
        L2f:
            r7 = 1
            if (r5 == r7) goto Lab
            r7 = 2
            if (r5 == r7) goto L36
            goto L87
        L36:
            java.lang.String r5 = r4.getName()     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            int r7 = r5.hashCode()     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            switch(r7) {
                case -1349929691: goto L7c;
                case 80204913: goto L64;
                case 1382829617: goto L5e;
                case 1657696882: goto L5b;
                case 1901439077: goto L42;
                default: goto L41;
            }     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
        L41:
            goto L87
        L42:
            java.lang.String r7 = "Variant"
            boolean r5 = r5.equals(r7)     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            if (r5 == 0) goto L87
            r11 r5 = new r11     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            r5.<init>(r1, r4)     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            if (r6 == 0) goto L87
            java.util.ArrayList r7 = r6.b     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            r7.add(r5)     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            goto L87
        L57:
            r1 = move-exception
            goto L8c
        L59:
            r1 = move-exception
            goto L9c
        L5b:
            java.lang.String r7 = "layoutDescription"
            goto L60
        L5e:
            java.lang.String r7 = "StateSet"
        L60:
            r5.equals(r7)     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            goto L87
        L64:
            java.lang.String r7 = "State"
            boolean r5 = r5.equals(r7)     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            if (r5 == 0) goto L87
            q11 r5 = new q11     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            r5.<init>(r1, r4)     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            java.lang.Cloneable r6 = r0.d     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            android.util.SparseArray r6 = (android.util.SparseArray) r6     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            int r7 = r5.a     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            r6.put(r7, r5)     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            r6 = r5
            goto L87
        L7c:
            java.lang.String r7 = "ConstraintSet"
            boolean r5 = r5.equals(r7)     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            if (r5 == 0) goto L87
            r0.b(r1, r4)     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
        L87:
            int r5 = r4.next()     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            goto L2f
        L8c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            r4.append(r9)
            java.lang.String r9 = r4.toString()
            android.util.Log.e(r3, r9, r1)
            goto Lab
        L9c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            r4.append(r9)
            java.lang.String r9 = r4.toString()
            android.util.Log.e(r3, r9, r1)
        Lab:
            r8.j0 = r0
            return
    }

    public final void l(int r3, int r4, int r5, int r6, boolean r7, boolean r8) {
            r2 = this;
            p11 r0 = r2.n0
            int r1 = r0.e
            int r0 = r0.d
            int r5 = r5 + r0
            int r6 = r6 + r1
            r0 = 0
            int r3 = android.view.View.resolveSizeAndState(r5, r3, r0)
            int r4 = android.view.View.resolveSizeAndState(r6, r4, r0)
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r5
            r4 = r4 & r5
            int r5 = r2.e0
            int r3 = java.lang.Math.min(r5, r3)
            int r5 = r2.f0
            int r4 = java.lang.Math.min(r5, r4)
            r5 = 16777216(0x1000000, float:2.3509887E-38)
            if (r7 == 0) goto L27
            r3 = r3 | r5
        L27:
            if (r8 == 0) goto L2a
            r4 = r4 | r5
        L2a:
            r2.setMeasuredDimension(r3, r4)
            return
    }

    public final void m(defpackage.m21 r26, int r27, int r28, int r29) {
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            int r3 = android.view.View.MeasureSpec.getMode(r28)
            int r4 = android.view.View.MeasureSpec.getSize(r28)
            int r5 = android.view.View.MeasureSpec.getMode(r29)
            int r6 = android.view.View.MeasureSpec.getSize(r29)
            int r7 = r0.getPaddingTop()
            r8 = 0
            int r7 = java.lang.Math.max(r8, r7)
            int r9 = r0.getPaddingBottom()
            int r9 = java.lang.Math.max(r8, r9)
            int r10 = r7 + r9
            int r11 = r0.getPaddingWidth()
            p11 r12 = r0.n0
            r12.b = r7
            r12.c = r9
            r12.d = r11
            r12.e = r10
            r9 = r28
            r12.f = r9
            r9 = r29
            r12.g = r9
            int r9 = r0.getPaddingStart()
            int r9 = java.lang.Math.max(r8, r9)
            int r13 = r0.getPaddingEnd()
            int r13 = java.lang.Math.max(r8, r13)
            if (r9 > 0) goto L5d
            if (r13 <= 0) goto L54
            goto L5d
        L54:
            int r9 = r0.getPaddingLeft()
            int r9 = java.lang.Math.max(r8, r9)
            goto L64
        L5d:
            boolean r14 = r0.j()
            if (r14 == 0) goto L64
            r9 = r13
        L64:
            int r4 = r4 - r11
            int r6 = r6 - r10
            int r10 = r12.e
            int r11 = r12.d
            k21 r12 = defpackage.k21.FIXED
            int r13 = r0.getChildCount()
            r14 = 1073741824(0x40000000, float:2.0)
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r15) goto L9d
            if (r3 == 0) goto L86
            if (r3 == r14) goto L7e
            r14 = r8
        L7b:
            r8 = r15
            r15 = r12
            goto Lac
        L7e:
            int r14 = r0.e0
            int r14 = r14 - r11
            int r14 = java.lang.Math.min(r14, r4)
            goto L7b
        L86:
            k21 r14 = defpackage.k21.WRAP_CONTENT
            if (r13 != 0) goto L96
            int r15 = r0.R
            int r15 = java.lang.Math.max(r8, r15)
        L90:
            r8 = r15
            r15 = r14
            r14 = r8
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            goto Lac
        L96:
            r24 = r14
            r14 = r8
            r8 = r15
            r15 = r24
            goto Lac
        L9d:
            k21 r14 = defpackage.k21.WRAP_CONTENT
            if (r13 != 0) goto La8
            int r15 = r0.R
            int r15 = java.lang.Math.max(r8, r15)
            goto L90
        La8:
            r15 = r14
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r14 = r4
        Lac:
            if (r5 == r8) goto Lcd
            if (r5 == 0) goto Lbf
            r8 = 1073741824(0x40000000, float:2.0)
            if (r5 == r8) goto Lb6
        Lb4:
            r13 = 0
            goto Lda
        Lb6:
            int r8 = r0.f0
            int r8 = r8 - r10
            int r8 = java.lang.Math.min(r8, r6)
            r13 = r8
            goto Lda
        Lbf:
            k21 r12 = defpackage.k21.WRAP_CONTENT
            if (r13 != 0) goto Lb4
            int r8 = r0.d0
            r13 = 0
            int r16 = java.lang.Math.max(r13, r8)
            r13 = r16
            goto Lda
        Lcd:
            r8 = 0
            k21 r12 = defpackage.k21.WRAP_CONTENT
            if (r13 != 0) goto Ld9
            int r13 = r0.d0
            int r13 = java.lang.Math.max(r8, r13)
            goto Lda
        Ld9:
            r13 = r6
        Lda:
            int r8 = r1.r()
            r29 = r10
            ai1 r10 = r1.v0
            r17 = r11
            r11 = 1
            if (r14 != r8) goto Lf0
            int r8 = r1.l()
            if (r13 == r8) goto Lee
            goto Lf0
        Lee:
            r8 = 0
            goto Lf3
        Lf0:
            r10.c = r11
            goto Lee
        Lf3:
            r1.Z = r8
            r1.a0 = r8
            r18 = r11
            int r11 = r0.e0
            int r11 = r11 - r17
            r16 = r8
            int[] r8 = r1.C
            r8[r16] = r11
            int r11 = r0.f0
            int r11 = r11 - r29
            r8[r18] = r11
            r8 = r16
            r1.c0 = r8
            r1.d0 = r8
            r1.N(r15)
            r1.P(r14)
            r1.O(r12)
            r1.M(r13)
            int r11 = r0.R
            int r11 = r11 - r17
            if (r11 >= 0) goto L124
            r1.c0 = r8
            goto L126
        L124:
            r1.c0 = r11
        L126:
            int r0 = r0.d0
            int r0 = r0 - r29
            if (r0 >= 0) goto L12f
            r1.d0 = r8
            goto L131
        L12f:
            r1.d0 = r0
        L131:
            r1.A0 = r9
            r1.B0 = r7
            bt r0 = r1.u0
            java.lang.Object r7 = r0.R
            m21 r7 = (defpackage.m21) r7
            java.lang.Object r8 = r0.B
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            p11 r9 = r1.x0
            java.util.ArrayList r11 = r1.t0
            int r11 = r11.size()
            int r12 = r1.r()
            int r13 = r1.l()
            r14 = 128(0x80, float:1.8E-43)
            boolean r14 = defpackage.n16.v(r2, r14)
            r15 = 64
            if (r14 != 0) goto L162
            boolean r2 = defpackage.n16.v(r2, r15)
            if (r2 == 0) goto L160
            goto L162
        L160:
            r2 = 0
            goto L164
        L162:
            r2 = r18
        L164:
            r17 = 0
            if (r2 == 0) goto L1ce
            r15 = 0
        L169:
            if (r15 >= r11) goto L1ce
            r27 = r2
            java.util.ArrayList r2 = r1.t0
            java.lang.Object r2 = r2.get(r15)
            l21 r2 = (defpackage.l21) r2
            r29 = r11
            k21[] r11 = r2.T
            r19 = r11
            r16 = 0
            r11 = r19[r16]
            r20 = r15
            k21 r15 = defpackage.k21.MATCH_CONSTRAINT
            if (r11 != r15) goto L188
            r21 = r18
            goto L18a
        L188:
            r21 = 0
        L18a:
            r11 = r19[r18]
            if (r11 != r15) goto L191
            r11 = r18
            goto L192
        L191:
            r11 = 0
        L192:
            if (r21 == 0) goto L19f
            if (r11 == 0) goto L19f
            float r11 = r2.X
            int r11 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r11 <= 0) goto L19f
            r11 = r18
            goto L1a0
        L19f:
            r11 = 0
        L1a0:
            boolean r15 = r2.y()
            if (r15 == 0) goto L1ac
            if (r11 == 0) goto L1ac
        L1a8:
            r2 = 0
        L1a9:
            r11 = 1073741824(0x40000000, float:2.0)
            goto L1d5
        L1ac:
            boolean r15 = r2.z()
            if (r15 == 0) goto L1b5
            if (r11 == 0) goto L1b5
            goto L1a8
        L1b5:
            boolean r11 = r2 instanceof defpackage.rq7
            if (r11 == 0) goto L1ba
            goto L1a8
        L1ba:
            boolean r11 = r2.y()
            if (r11 != 0) goto L1a8
            boolean r2 = r2.z()
            if (r2 == 0) goto L1c7
            goto L1a8
        L1c7:
            int r15 = r20 + 1
            r2 = r27
            r11 = r29
            goto L169
        L1ce:
            r27 = r2
            r29 = r11
            r2 = r27
            goto L1a9
        L1d5:
            if (r3 != r11) goto L1d9
            if (r5 == r11) goto L1db
        L1d9:
            if (r14 == 0) goto L1de
        L1db:
            r11 = r18
            goto L1df
        L1de:
            r11 = 0
        L1df:
            r2 = r2 & r11
            if (r2 == 0) goto L458
            int[] r15 = r1.C
            r16 = 0
            r15 = r15[r16]
            int r4 = java.lang.Math.min(r15, r4)
            int[] r15 = r1.C
            r15 = r15[r18]
            int r6 = java.lang.Math.min(r15, r6)
            r15 = 1073741824(0x40000000, float:2.0)
            if (r3 != r15) goto L206
            int r11 = r1.r()
            if (r11 == r4) goto L206
            r1.P(r4)
            r4 = r18
            r10.b = r4
            goto L208
        L206:
            r4 = r18
        L208:
            if (r5 != r15) goto L215
            int r11 = r1.l()
            if (r11 == r6) goto L215
            r1.M(r6)
            r10.b = r4
        L215:
            if (r3 != r15) goto L3b7
            if (r5 != r15) goto L3b7
            java.lang.Object r4 = r10.f
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.lang.Object r6 = r10.d
            m21 r6 = (defpackage.m21) r6
            boolean r11 = r10.b
            if (r11 != 0) goto L22e
            boolean r11 = r10.c
            if (r11 == 0) goto L22a
            goto L22e
        L22a:
            r19 = r2
            r11 = 0
            goto L26e
        L22e:
            java.util.ArrayList r11 = r6.t0
            int r15 = r11.size()
            r19 = r2
            r2 = 0
        L237:
            if (r2 >= r15) goto L25c
            java.lang.Object r20 = r11.get(r2)
            int r2 = r2 + 1
            r21 = r2
            r2 = r20
            l21 r2 = (defpackage.l21) r2
            r2.i()
            r20 = r11
            r11 = 0
            r2.a = r11
            ly2 r11 = r2.d
            r11.n()
            lm7 r2 = r2.e
            r2.m()
            r11 = r20
            r2 = r21
            goto L237
        L25c:
            r6.i()
            r11 = 0
            r6.a = r11
            ly2 r2 = r6.d
            r2.n()
            lm7 r2 = r6.e
            r2.m()
            r10.c = r11
        L26e:
            java.lang.Object r2 = r10.e
            m21 r2 = (defpackage.m21) r2
            r10.c(r2)
            r6.Z = r11
            r6.a0 = r11
            k21 r2 = r6.k(r11)
            r11 = 1
            k21 r15 = r6.k(r11)
            boolean r11 = r10.b
            if (r11 == 0) goto L289
            r10.d()
        L289:
            int r11 = r6.s()
            r20 = r9
            int r9 = r6.t()
            r21 = r8
            ly2 r8 = r6.d
            ci1 r8 = r8.h
            r8.d(r11)
            lm7 r8 = r6.e
            ci1 r8 = r8.h
            r8.d(r9)
            r10.i()
            k21 r8 = defpackage.k21.WRAP_CONTENT
            if (r2 == r8) goto L2b0
            if (r15 != r8) goto L2ad
            goto L2b0
        L2ad:
            r22 = r9
            goto L309
        L2b0:
            if (r14 == 0) goto L2cb
            int r8 = r4.size()
            r22 = r9
            r9 = 0
        L2b9:
            if (r9 >= r8) goto L2cd
            java.lang.Object r23 = r4.get(r9)
            int r9 = r9 + 1
            ct7 r23 = (defpackage.ct7) r23
            boolean r23 = r23.k()
            if (r23 != 0) goto L2b9
            r14 = 0
            goto L2cd
        L2cb:
            r22 = r9
        L2cd:
            if (r14 == 0) goto L2eb
            k21 r8 = defpackage.k21.WRAP_CONTENT
            if (r2 != r8) goto L2eb
            k21 r8 = defpackage.k21.FIXED
            r6.N(r8)
            r8 = 0
            int r9 = r10.e(r6, r8)
            r6.P(r9)
            ly2 r8 = r6.d
            rj1 r8 = r8.e
            int r9 = r6.r()
            r8.d(r9)
        L2eb:
            if (r14 == 0) goto L309
            k21 r8 = defpackage.k21.WRAP_CONTENT
            if (r15 != r8) goto L309
            k21 r8 = defpackage.k21.FIXED
            r6.O(r8)
            r8 = 1
            int r9 = r10.e(r6, r8)
            r6.M(r9)
            lm7 r8 = r6.e
            rj1 r8 = r8.e
            int r9 = r6.l()
            r8.d(r9)
        L309:
            k21[] r8 = r6.T
            r16 = 0
            r8 = r8[r16]
            k21 r9 = defpackage.k21.FIXED
            if (r8 == r9) goto L31a
            k21 r14 = defpackage.k21.MATCH_PARENT
            if (r8 != r14) goto L318
            goto L31a
        L318:
            r8 = 0
            goto L357
        L31a:
            int r8 = r6.r()
            int r8 = r8 + r11
            ly2 r14 = r6.d
            ci1 r14 = r14.i
            r14.d(r8)
            ly2 r14 = r6.d
            rj1 r14 = r14.e
            int r8 = r8 - r11
            r14.d(r8)
            r10.i()
            k21[] r8 = r6.T
            r18 = 1
            r8 = r8[r18]
            if (r8 == r9) goto L33d
            k21 r9 = defpackage.k21.MATCH_PARENT
            if (r8 != r9) goto L353
        L33d:
            int r8 = r6.l()
            int r8 = r8 + r22
            lm7 r9 = r6.e
            ci1 r9 = r9.i
            r9.d(r8)
            lm7 r9 = r6.e
            rj1 r9 = r9.e
            int r8 = r8 - r22
            r9.d(r8)
        L353:
            r10.i()
            r8 = 1
        L357:
            int r9 = r4.size()
            r10 = 0
        L35c:
            if (r10 >= r9) goto L373
            java.lang.Object r11 = r4.get(r10)
            int r10 = r10 + 1
            ct7 r11 = (defpackage.ct7) r11
            l21 r14 = r11.b
            if (r14 != r6) goto L36f
            boolean r14 = r11.g
            if (r14 != 0) goto L36f
            goto L35c
        L36f:
            r11.e()
            goto L35c
        L373:
            int r9 = r4.size()
            r10 = 0
        L378:
            if (r10 >= r9) goto L3ab
            java.lang.Object r11 = r4.get(r10)
            int r10 = r10 + 1
            ct7 r11 = (defpackage.ct7) r11
            if (r8 != 0) goto L389
            l21 r14 = r11.b
            if (r14 != r6) goto L389
            goto L378
        L389:
            ci1 r14 = r11.h
            boolean r14 = r14.j
            if (r14 != 0) goto L391
        L38f:
            r4 = 0
            goto L3ac
        L391:
            ci1 r14 = r11.i
            boolean r14 = r14.j
            if (r14 != 0) goto L39c
            boolean r14 = r11 instanceof defpackage.bv2
            if (r14 != 0) goto L39c
            goto L38f
        L39c:
            rj1 r14 = r11.e
            boolean r14 = r14.j
            if (r14 != 0) goto L378
            boolean r14 = r11 instanceof defpackage.kl0
            if (r14 != 0) goto L378
            boolean r11 = r11 instanceof defpackage.bv2
            if (r11 != 0) goto L378
            goto L38f
        L3ab:
            r4 = 1
        L3ac:
            r6.N(r2)
            r6.O(r15)
            r2 = 2
            r15 = 1073741824(0x40000000, float:2.0)
            goto L448
        L3b7:
            r19 = r2
            r21 = r8
            r20 = r9
            java.lang.Object r2 = r10.d
            m21 r2 = (defpackage.m21) r2
            boolean r4 = r10.b
            if (r4 == 0) goto L417
            java.util.ArrayList r4 = r2.t0
            int r6 = r4.size()
            r8 = 0
        L3cc:
            if (r8 >= r6) goto L3f7
            java.lang.Object r9 = r4.get(r8)
            int r8 = r8 + 1
            l21 r9 = (defpackage.l21) r9
            r9.i()
            r11 = 0
            r9.a = r11
            ly2 r15 = r9.d
            r16 = r4
            rj1 r4 = r15.e
            r4.j = r11
            r15.g = r11
            r15.n()
            lm7 r4 = r9.e
            rj1 r9 = r4.e
            r9.j = r11
            r4.g = r11
            r4.m()
            r4 = r16
            goto L3cc
        L3f7:
            r11 = 0
            r2.i()
            r2.a = r11
            ly2 r4 = r2.d
            rj1 r6 = r4.e
            r6.j = r11
            r4.g = r11
            r4.n()
            lm7 r4 = r2.e
            rj1 r6 = r4.e
            r6.j = r11
            r4.g = r11
            r4.m()
            r10.d()
            goto L418
        L417:
            r11 = 0
        L418:
            java.lang.Object r4 = r10.e
            m21 r4 = (defpackage.m21) r4
            r10.c(r4)
            r2.Z = r11
            r2.a0 = r11
            ly2 r4 = r2.d
            ci1 r4 = r4.h
            r4.d(r11)
            lm7 r2 = r2.e
            ci1 r2 = r2.h
            r2.d(r11)
            r15 = 1073741824(0x40000000, float:2.0)
            if (r3 != r15) goto L43c
            boolean r2 = r1.U(r11, r14)
            r4 = r2
            r2 = 1
            goto L43e
        L43c:
            r2 = 0
            r4 = 1
        L43e:
            if (r5 != r15) goto L448
            r11 = 1
            boolean r6 = r1.U(r11, r14)
            r4 = r4 & r6
            int r2 = r2 + 1
        L448:
            if (r4 == 0) goto L460
            if (r3 != r15) goto L44e
            r3 = 1
            goto L44f
        L44e:
            r3 = 0
        L44f:
            if (r5 != r15) goto L453
            r5 = 1
            goto L454
        L453:
            r5 = 0
        L454:
            r1.Q(r3, r5)
            goto L460
        L458:
            r19 = r2
            r21 = r8
            r20 = r9
            r2 = 0
            r4 = 0
        L460:
            if (r4 == 0) goto L467
            r3 = 2
            if (r2 == r3) goto L466
            goto L467
        L466:
            return
        L467:
            int r2 = r1.G0
            if (r29 <= 0) goto L52e
            java.util.ArrayList r3 = r1.t0
            int r3 = r3.size()
            r4 = 64
            boolean r4 = r1.X(r4)
            p11 r5 = r1.x0
            r6 = 0
        L47a:
            if (r6 >= r3) goto L508
            java.util.ArrayList r8 = r1.t0
            java.lang.Object r8 = r8.get(r6)
            l21 r8 = (defpackage.l21) r8
            boolean r9 = r8 instanceof defpackage.av2
            if (r9 == 0) goto L48a
            goto L504
        L48a:
            boolean r9 = r8 instanceof defpackage.a20
            if (r9 == 0) goto L490
            goto L504
        L490:
            boolean r9 = r8.F
            if (r9 == 0) goto L496
            goto L504
        L496:
            if (r4 == 0) goto L4ad
            ly2 r9 = r8.d
            if (r9 == 0) goto L4ad
            lm7 r10 = r8.e
            if (r10 == 0) goto L4ad
            rj1 r9 = r9.e
            boolean r9 = r9.j
            if (r9 == 0) goto L4ad
            rj1 r9 = r10.e
            boolean r9 = r9.j
            if (r9 == 0) goto L4ad
            goto L504
        L4ad:
            r11 = 0
            k21 r9 = r8.k(r11)
            r11 = 1
            k21 r10 = r8.k(r11)
            k21 r14 = defpackage.k21.MATCH_CONSTRAINT
            if (r9 != r14) goto L4c7
            int r15 = r8.r
            if (r15 == r11) goto L4c7
            if (r10 != r14) goto L4c7
            int r15 = r8.s
            if (r15 == r11) goto L4c7
            r15 = r11
            goto L4c8
        L4c7:
            r15 = 0
        L4c8:
            if (r15 != 0) goto L4fd
            boolean r22 = r1.X(r11)
            if (r22 == 0) goto L4fd
            boolean r11 = r8 instanceof defpackage.rq7
            if (r11 != 0) goto L4fd
            if (r9 != r14) goto L4e3
            int r11 = r8.r
            if (r11 != 0) goto L4e3
            if (r10 == r14) goto L4e3
            boolean r11 = r8.y()
            if (r11 != 0) goto L4e3
            r15 = 1
        L4e3:
            if (r10 != r14) goto L4f2
            int r11 = r8.s
            if (r11 != 0) goto L4f2
            if (r9 == r14) goto L4f2
            boolean r11 = r8.y()
            if (r11 != 0) goto L4f2
            r15 = 1
        L4f2:
            if (r9 == r14) goto L4f6
            if (r10 != r14) goto L4fd
        L4f6:
            float r9 = r8.X
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 <= 0) goto L4fd
            r15 = 1
        L4fd:
            if (r15 == 0) goto L500
            goto L504
        L500:
            r11 = 0
            r0.P(r11, r5, r8)
        L504:
            int r6 = r6 + 1
            goto L47a
        L508:
            androidx.constraintlayout.widget.ConstraintLayout r3 = r5.a
            int r4 = r3.getChildCount()
            java.util.ArrayList r5 = r3.B
            r6 = 0
        L511:
            if (r6 >= r4) goto L519
            r3.getChildAt(r6)
            int r6 = r6 + 1
            goto L511
        L519:
            int r3 = r5.size()
            if (r3 <= 0) goto L52e
            r4 = 0
        L520:
            if (r4 >= r3) goto L52e
            java.lang.Object r6 = r5.get(r4)
            l11 r6 = (defpackage.l11) r6
            r6.getClass()
            int r4 = r4 + 1
            goto L520
        L52e:
            r0.a0(r1)
            int r3 = r21.size()
            r11 = 0
            if (r29 <= 0) goto L53b
            r0.Z(r1, r11, r12, r13)
        L53b:
            if (r3 <= 0) goto L6ea
            k21[] r4 = r1.T
            r5 = r4[r11]
            k21 r6 = defpackage.k21.WRAP_CONTENT
            if (r5 != r6) goto L549
            r5 = 1
        L546:
            r18 = 1
            goto L54b
        L549:
            r5 = r11
            goto L546
        L54b:
            r4 = r4[r18]
            if (r4 != r6) goto L551
            r4 = 1
            goto L552
        L551:
            r4 = r11
        L552:
            int r6 = r1.r()
            int r8 = r7.c0
            int r6 = java.lang.Math.max(r6, r8)
            int r8 = r1.l()
            int r7 = r7.d0
            int r7 = java.lang.Math.max(r8, r7)
            r8 = r11
            r9 = r8
        L568:
            if (r8 >= r3) goto L604
            r10 = r21
            java.lang.Object r14 = r10.get(r8)
            l21 r14 = (defpackage.l21) r14
            boolean r15 = r14 instanceof defpackage.rq7
            if (r15 != 0) goto L57e
            r25 = r4
            r28 = r5
            r4 = r20
            goto L5f7
        L57e:
            int r15 = r14.r()
            int r11 = r14.l()
            r25 = r4
            r28 = r5
            r4 = r20
            r5 = 1
            boolean r17 = r0.P(r5, r4, r14)
            r5 = r9 | r17
            int r9 = r14.r()
            r29 = r5
            int r5 = r14.l()
            if (r9 == r15) goto L5c6
            r14.P(r9)
            if (r28 == 0) goto L5c3
            int r9 = r14.s()
            int r15 = r14.V
            int r9 = r9 + r15
            if (r9 <= r6) goto L5c3
            int r9 = r14.s()
            int r15 = r14.V
            int r9 = r9 + r15
            g11 r15 = defpackage.g11.RIGHT
            h11 r15 = r14.j(r15)
            int r15 = r15.e()
            int r15 = r15 + r9
            int r6 = java.lang.Math.max(r6, r15)
        L5c3:
            r9 = r6
            r6 = 1
            goto L5c9
        L5c6:
            r9 = r6
            r6 = r29
        L5c9:
            if (r5 == r11) goto L5f0
            r14.M(r5)
            if (r25 == 0) goto L5ef
            int r5 = r14.t()
            int r6 = r14.W
            int r5 = r5 + r6
            if (r5 <= r7) goto L5ef
            int r5 = r14.t()
            int r6 = r14.W
            int r5 = r5 + r6
            g11 r6 = defpackage.g11.BOTTOM
            h11 r6 = r14.j(r6)
            int r6 = r6.e()
            int r6 = r6 + r5
            int r7 = java.lang.Math.max(r7, r6)
        L5ef:
            r6 = 1
        L5f0:
            rq7 r14 = (defpackage.rq7) r14
            boolean r5 = r14.B0
            r5 = r5 | r6
            r6 = r9
            r9 = r5
        L5f7:
            int r8 = r8 + 1
            r5 = r28
            r20 = r4
            r21 = r10
            r11 = 0
            r4 = r25
            goto L568
        L604:
            r25 = r4
            r28 = r5
            r10 = r21
            r8 = 0
        L60b:
            r4 = r20
            r5 = 2
            if (r8 >= r5) goto L6ea
            r11 = 0
        L611:
            if (r11 >= r3) goto L6d6
            java.lang.Object r14 = r10.get(r11)
            l21 r14 = (defpackage.l21) r14
            boolean r15 = r14 instanceof defpackage.gx2
            if (r15 == 0) goto L621
            boolean r15 = r14 instanceof defpackage.rq7
            if (r15 == 0) goto L644
        L621:
            boolean r15 = r14 instanceof defpackage.av2
            if (r15 == 0) goto L626
            goto L644
        L626:
            int r15 = r14.h0
            r5 = 8
            if (r15 != r5) goto L62d
            goto L644
        L62d:
            if (r19 == 0) goto L640
            ly2 r5 = r14.d
            rj1 r5 = r5.e
            boolean r5 = r5.j
            if (r5 == 0) goto L640
            lm7 r5 = r14.e
            rj1 r5 = r5.e
            boolean r5 = r5.j
            if (r5 == 0) goto L640
            goto L644
        L640:
            boolean r5 = r14 instanceof defpackage.rq7
            if (r5 == 0) goto L64c
        L644:
            r29 = r3
            r20 = r4
            r21 = r8
            goto L6cb
        L64c:
            int r5 = r14.r()
            int r15 = r14.l()
            r29 = r3
            int r3 = r14.b0
            r17 = r9
            r9 = 1
            if (r8 != r9) goto L65e
            r9 = 2
        L65e:
            boolean r9 = r0.P(r9, r4, r14)
            r9 = r17 | r9
            r20 = r4
            int r4 = r14.r()
            r21 = r8
            int r8 = r14.l()
            if (r4 == r5) goto L698
            r14.P(r4)
            if (r28 == 0) goto L696
            int r4 = r14.s()
            int r5 = r14.V
            int r4 = r4 + r5
            if (r4 <= r6) goto L696
            int r4 = r14.s()
            int r5 = r14.V
            int r4 = r4 + r5
            g11 r5 = defpackage.g11.RIGHT
            h11 r5 = r14.j(r5)
            int r5 = r5.e()
            int r5 = r5 + r4
            int r6 = java.lang.Math.max(r6, r5)
        L696:
            r4 = 1
            goto L699
        L698:
            r4 = r9
        L699:
            if (r8 == r15) goto L6c0
            r14.M(r8)
            if (r25 == 0) goto L6bf
            int r4 = r14.t()
            int r5 = r14.W
            int r4 = r4 + r5
            if (r4 <= r7) goto L6bf
            int r4 = r14.t()
            int r5 = r14.W
            int r4 = r4 + r5
            g11 r5 = defpackage.g11.BOTTOM
            h11 r5 = r14.j(r5)
            int r5 = r5.e()
            int r5 = r5 + r4
            int r7 = java.lang.Math.max(r7, r5)
        L6bf:
            r4 = 1
        L6c0:
            boolean r5 = r14.E
            if (r5 == 0) goto L6ca
            int r5 = r14.b0
            if (r3 == r5) goto L6ca
            r9 = 1
            goto L6cb
        L6ca:
            r9 = r4
        L6cb:
            int r11 = r11 + 1
            r3 = r29
            r4 = r20
            r8 = r21
            r5 = 2
            goto L611
        L6d6:
            r29 = r3
            r20 = r4
            r21 = r8
            r17 = r9
            if (r17 == 0) goto L6ea
            int r8 = r21 + 1
            r0.Z(r1, r8, r12, r13)
            r3 = r29
            r9 = 0
            goto L60b
        L6ea:
            r1.G0 = r2
            r0 = 512(0x200, float:7.17E-43)
            boolean r0 = r1.X(r0)
            defpackage.jv3.q = r0
            return
    }

    public final void n(defpackage.l21 r2, defpackage.o11 r3, android.util.SparseArray r4, int r5, defpackage.g11 r6) {
            r1 = this;
            android.util.SparseArray r1 = r1.A
            java.lang.Object r1 = r1.get(r5)
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r4 = r4.get(r5)
            l21 r4 = (defpackage.l21) r4
            if (r4 == 0) goto L50
            if (r1 == 0) goto L50
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
            boolean r5 = r5 instanceof defpackage.o11
            if (r5 == 0) goto L50
            r5 = 1
            r3.c0 = r5
            g11 r0 = defpackage.g11.BASELINE
            if (r6 != r0) goto L2d
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            o11 r1 = (defpackage.o11) r1
            r1.c0 = r5
            l21 r1 = r1.p0
            r1.E = r5
        L2d:
            h11 r1 = r2.j(r0)
            h11 r4 = r4.j(r6)
            int r6 = r3.D
            int r3 = r3.C
            r1.b(r4, r6, r3, r5)
            r2.E = r5
            g11 r1 = defpackage.g11.TOP
            h11 r1 = r2.j(r1)
            r1.j()
            g11 r1 = defpackage.g11.BOTTOM
            h11 r1 = r2.j(r1)
            r1.j()
        L50:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
            r4 = this;
            int r5 = r4.getChildCount()
            boolean r6 = r4.isInEditMode()
            r7 = 0
            r8 = r7
        La:
            if (r8 >= r5) goto L43
            android.view.View r9 = r4.getChildAt(r8)
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            o11 r0 = (defpackage.o11) r0
            l21 r1 = r0.p0
            int r2 = r9.getVisibility()
            r3 = 8
            if (r2 != r3) goto L2b
            boolean r2 = r0.d0
            if (r2 != 0) goto L2b
            boolean r0 = r0.e0
            if (r0 != 0) goto L2b
            if (r6 != 0) goto L2b
            goto L40
        L2b:
            int r0 = r1.s()
            int r2 = r1.t()
            int r3 = r1.r()
            int r3 = r3 + r0
            int r1 = r1.l()
            int r1 = r1 + r2
            r9.layout(r0, r2, r3, r1)
        L40:
            int r8 = r8 + 1
            goto La
        L43:
            java.util.ArrayList r4 = r4.B
            int r5 = r4.size()
            if (r5 <= 0) goto L59
        L4b:
            if (r7 >= r5) goto L59
            java.lang.Object r6 = r4.get(r7)
            l11 r6 = (defpackage.l11) r6
            r6.getClass()
            int r7 = r7 + 1
            goto L4b
        L59:
            return
    }

    @Override // android.view.View
    public void onMeasure(int r17, int r18) {
            r16 = this;
            r0 = r16
            boolean r1 = r0.g0
            r0.g0 = r1
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L21
            int r1 = r0.getChildCount()
            r4 = r3
        Lf:
            if (r4 >= r1) goto L21
            android.view.View r5 = r0.getChildAt(r4)
            boolean r5 = r5.isLayoutRequested()
            if (r5 == 0) goto L1e
            r0.g0 = r2
            goto L21
        L1e:
            int r4 = r4 + 1
            goto Lf
        L21:
            boolean r1 = r0.j()
            m21 r6 = r0.L
            r6.y0 = r1
            boolean r1 = r0.g0
            if (r1 == 0) goto L1df
            r0.g0 = r3
            int r1 = r0.getChildCount()
            r4 = r3
        L34:
            if (r4 >= r1) goto L45
            android.view.View r5 = r0.getChildAt(r4)
            boolean r5 = r5.isLayoutRequested()
            if (r5 == 0) goto L42
            r7 = r2
            goto L46
        L42:
            int r4 = r4 + 1
            goto L34
        L45:
            r7 = r3
        L46:
            if (r7 == 0) goto L1d8
            boolean r1 = r0.isInEditMode()
            int r8 = r0.getChildCount()
            r2 = r3
        L51:
            if (r2 >= r8) goto L64
            android.view.View r4 = r0.getChildAt(r2)
            l21 r4 = r0.h(r4)
            if (r4 != 0) goto L5e
            goto L61
        L5e:
            r4.D()
        L61:
            int r2 = r2 + 1
            goto L51
        L64:
            r2 = 0
            android.util.SparseArray r4 = r0.A
            r5 = -1
            if (r1 == 0) goto Lea
            r9 = r3
        L6b:
            if (r9 >= r8) goto Lea
            android.view.View r10 = r0.getChildAt(r9)
            android.content.res.Resources r11 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> Le7
            int r12 = r10.getId()     // Catch: android.content.res.Resources.NotFoundException -> Le7
            java.lang.String r11 = r11.getResourceName(r12)     // Catch: android.content.res.Resources.NotFoundException -> Le7
            int r12 = r10.getId()     // Catch: android.content.res.Resources.NotFoundException -> Le7
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: android.content.res.Resources.NotFoundException -> Le7
            if (r11 == 0) goto La7
            java.util.HashMap r13 = r0.l0     // Catch: android.content.res.Resources.NotFoundException -> Le7
            if (r13 != 0) goto L92
            java.util.HashMap r13 = new java.util.HashMap     // Catch: android.content.res.Resources.NotFoundException -> Le7
            r13.<init>()     // Catch: android.content.res.Resources.NotFoundException -> Le7
            r0.l0 = r13     // Catch: android.content.res.Resources.NotFoundException -> Le7
        L92:
            java.lang.String r13 = "/"
            int r13 = r11.indexOf(r13)     // Catch: android.content.res.Resources.NotFoundException -> Le7
            if (r13 == r5) goto La1
            int r13 = r13 + 1
            java.lang.String r13 = r11.substring(r13)     // Catch: android.content.res.Resources.NotFoundException -> Le7
            goto La2
        La1:
            r13 = r11
        La2:
            java.util.HashMap r14 = r0.l0     // Catch: android.content.res.Resources.NotFoundException -> Le7
            r14.put(r13, r12)     // Catch: android.content.res.Resources.NotFoundException -> Le7
        La7:
            r12 = 47
            int r12 = r11.indexOf(r12)     // Catch: android.content.res.Resources.NotFoundException -> Le7
            if (r12 == r5) goto Lb5
            int r12 = r12 + 1
            java.lang.String r11 = r11.substring(r12)     // Catch: android.content.res.Resources.NotFoundException -> Le7
        Lb5:
            int r10 = r10.getId()     // Catch: android.content.res.Resources.NotFoundException -> Le7
            if (r10 != 0) goto Lbd
        Lbb:
            r10 = r6
            goto Le5
        Lbd:
            java.lang.Object r12 = r4.get(r10)     // Catch: android.content.res.Resources.NotFoundException -> Le7
            android.view.View r12 = (android.view.View) r12     // Catch: android.content.res.Resources.NotFoundException -> Le7
            if (r12 != 0) goto Ld6
            android.view.View r12 = r0.findViewById(r10)     // Catch: android.content.res.Resources.NotFoundException -> Le7
            if (r12 == 0) goto Ld6
            if (r12 == r0) goto Ld6
            android.view.ViewParent r10 = r12.getParent()     // Catch: android.content.res.Resources.NotFoundException -> Le7
            if (r10 != r0) goto Ld6
            r0.onViewAdded(r12)     // Catch: android.content.res.Resources.NotFoundException -> Le7
        Ld6:
            if (r12 != r0) goto Ld9
            goto Lbb
        Ld9:
            if (r12 != 0) goto Ldd
            r10 = r2
            goto Le5
        Ldd:
            android.view.ViewGroup$LayoutParams r10 = r12.getLayoutParams()     // Catch: android.content.res.Resources.NotFoundException -> Le7
            o11 r10 = (defpackage.o11) r10     // Catch: android.content.res.Resources.NotFoundException -> Le7
            l21 r10 = r10.p0     // Catch: android.content.res.Resources.NotFoundException -> Le7
        Le5:
            r10.j0 = r11     // Catch: android.content.res.Resources.NotFoundException -> Le7
        Le7:
            int r9 = r9 + 1
            goto L6b
        Lea:
            int r9 = r0.k0
            if (r9 == r5) goto Lfb
            r5 = r3
        Lef:
            if (r5 >= r8) goto Lfb
            android.view.View r9 = r0.getChildAt(r5)
            r9.getId()
            int r5 = r5 + 1
            goto Lef
        Lfb:
            z11 r5 = r0.i0
            if (r5 == 0) goto L102
            r5.c(r0)
        L102:
            java.util.ArrayList r5 = r6.t0
            r5.clear()
            java.util.ArrayList r5 = r0.B
            int r9 = r5.size()
            if (r9 <= 0) goto L17c
            r10 = r3
        L110:
            if (r10 >= r9) goto L17c
            java.lang.Object r11 = r5.get(r10)
            l11 r11 = (defpackage.l11) r11
            java.util.HashMap r12 = r11.f0
            boolean r13 = r11.isInEditMode()
            if (r13 == 0) goto L125
            java.lang.String r13 = r11.d0
            r11.setIds(r13)
        L125:
            gx2 r13 = r11.R
            if (r13 != 0) goto L12a
            goto L178
        L12a:
            r13.u0 = r3
            l21[] r13 = r13.t0
            java.util.Arrays.fill(r13, r2)
            r13 = r3
        L132:
            int r14 = r11.B
            if (r13 >= r14) goto L173
            int[] r14 = r11.A
            r14 = r14[r13]
            java.lang.Object r15 = r4.get(r14)
            android.view.View r15 = (android.view.View) r15
            if (r15 != 0) goto L164
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Object r14 = r12.get(r14)
            java.lang.String r14 = (java.lang.String) r14
            int r2 = r11.f(r0, r14)
            if (r2 == 0) goto L164
            int[] r15 = r11.A
            r15[r13] = r2
            java.lang.Integer r15 = java.lang.Integer.valueOf(r2)
            r12.put(r15, r14)
            java.lang.Object r2 = r4.get(r2)
            r15 = r2
            android.view.View r15 = (android.view.View) r15
        L164:
            if (r15 == 0) goto L16f
            gx2 r2 = r11.R
            l21 r14 = r0.h(r15)
            r2.S(r14)
        L16f:
            int r13 = r13 + 1
            r2 = 0
            goto L132
        L173:
            gx2 r2 = r11.R
            r2.U()
        L178:
            int r10 = r10 + 1
            r2 = 0
            goto L110
        L17c:
            r2 = r3
        L17d:
            if (r2 >= r8) goto L185
            r0.getChildAt(r2)
            int r2 = r2 + 1
            goto L17d
        L185:
            android.util.SparseArray r5 = r0.m0
            r5.clear()
            r5.put(r3, r6)
            int r2 = r0.getId()
            r5.put(r2, r6)
            r2 = r3
        L195:
            if (r2 >= r8) goto L1a9
            android.view.View r4 = r0.getChildAt(r2)
            l21 r9 = r0.h(r4)
            int r4 = r4.getId()
            r5.put(r4, r9)
            int r2 = r2 + 1
            goto L195
        L1a9:
            r9 = r3
        L1aa:
            if (r9 >= r8) goto L1d8
            android.view.View r2 = r0.getChildAt(r9)
            l21 r3 = r0.h(r2)
            if (r3 != 0) goto L1b7
            goto L1d5
        L1b7:
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            o11 r4 = (defpackage.o11) r4
            java.util.ArrayList r10 = r6.t0
            r10.add(r3)
            l21 r10 = r3.U
            if (r10 == 0) goto L1d0
            m21 r10 = (defpackage.m21) r10
            java.util.ArrayList r10 = r10.t0
            r10.remove(r3)
            r3.D()
        L1d0:
            r3.U = r6
            r0.g(r1, r2, r3, r4, r5)
        L1d5:
            int r9 = r9 + 1
            goto L1aa
        L1d8:
            if (r7 == 0) goto L1df
            bt r1 = r6.u0
            r1.a0(r6)
        L1df:
            jv3 r1 = r6.z0
            r1.getClass()
            int r1 = r0.h0
            r2 = r17
            r3 = r18
            r0.m(r6, r1, r2, r3)
            int r3 = r6.r()
            int r4 = r6.l()
            boolean r5 = r6.H0
            boolean r6 = r6.I0
            r1 = r2
            r2 = r18
            r0.l(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View r5) {
            r4 = this;
            super.onViewAdded(r5)
            l21 r0 = r4.h(r5)
            boolean r1 = r5 instanceof defpackage.zu2
            r2 = 1
            if (r1 == 0) goto L24
            boolean r0 = r0 instanceof defpackage.av2
            if (r0 != 0) goto L24
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            o11 r0 = (defpackage.o11) r0
            av2 r1 = new av2
            r1.<init>()
            r0.p0 = r1
            r0.d0 = r2
            int r0 = r0.V
            r1.T(r0)
        L24:
            boolean r0 = r5 instanceof defpackage.l11
            if (r0 == 0) goto L41
            r0 = r5
            l11 r0 = (defpackage.l11) r0
            r0.k()
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            o11 r1 = (defpackage.o11) r1
            r1.e0 = r2
            java.util.ArrayList r1 = r4.B
            boolean r3 = r1.contains(r0)
            if (r3 != 0) goto L41
            r1.add(r0)
        L41:
            android.util.SparseArray r0 = r4.A
            int r1 = r5.getId()
            r0.put(r1, r5)
            r4.g0 = r2
            return
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View r3) {
            r2 = this;
            super.onViewRemoved(r3)
            android.util.SparseArray r0 = r2.A
            int r1 = r3.getId()
            r0.remove(r1)
            l21 r0 = r2.h(r3)
            m21 r1 = r2.L
            java.util.ArrayList r1 = r1.t0
            r1.remove(r0)
            r0.D()
            java.util.ArrayList r0 = r2.B
            r0.remove(r3)
            r3 = 1
            r2.g0 = r3
            return
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
            r1 = this;
            r0 = 1
            r1.g0 = r0
            super.requestLayout()
            return
    }

    public void setConstraintSet(defpackage.z11 r1) {
            r0 = this;
            r0.i0 = r1
            return
    }

    @Override // android.view.View
    public void setId(int r3) {
            r2 = this;
            int r0 = r2.getId()
            android.util.SparseArray r1 = r2.A
            r1.remove(r0)
            super.setId(r3)
            int r3 = r2.getId()
            r1.put(r3, r2)
            return
    }

    public void setMaxHeight(int r2) {
            r1 = this;
            int r0 = r1.f0
            if (r2 != r0) goto L5
            return
        L5:
            r1.f0 = r2
            r1.requestLayout()
            return
    }

    public void setMaxWidth(int r2) {
            r1 = this;
            int r0 = r1.e0
            if (r2 != r0) goto L5
            return
        L5:
            r1.e0 = r2
            r1.requestLayout()
            return
    }

    public void setMinHeight(int r2) {
            r1 = this;
            int r0 = r1.d0
            if (r2 != r0) goto L5
            return
        L5:
            r1.d0 = r2
            r1.requestLayout()
            return
    }

    public void setMinWidth(int r2) {
            r1 = this;
            int r0 = r1.R
            if (r2 != r0) goto L5
            return
        L5:
            r1.R = r2
            r1.requestLayout()
            return
    }

    public void setOnConstraintsChanged(defpackage.r21 r1) {
            r0 = this;
            s11 r0 = r0.j0
            if (r0 == 0) goto L7
            r0.getClass()
        L7:
            return
    }

    public void setOptimizationLevel(int r1) {
            r0 = this;
            r0.h0 = r1
            m21 r0 = r0.L
            r0.G0 = r1
            r1 = 512(0x200, float:7.17E-43)
            boolean r0 = r0.X(r1)
            defpackage.jv3.q = r0
            return
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
            r0 = this;
            r0 = 0
            return r0
    }
}
