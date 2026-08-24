package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mq0  reason: default package */
/* loaded from: classes.dex */
public final class mq0 extends defpackage.b2 {
    public static final android.graphics.Rect k0 = null;
    public static final defpackage.jd1 l0 = null;
    public static final defpackage.w31 m0 = null;
    public final android.graphics.Rect R;
    public final android.graphics.Rect X;
    public final android.graphics.Rect Y;
    public final int[] Z;
    public final android.view.accessibility.AccessibilityManager d0;
    public final com.google.android.material.chip.Chip e0;
    public defpackage.ue f0;
    public int g0;
    public int h0;
    public int i0;
    public final /* synthetic */ com.google.android.material.chip.Chip j0;

    static {
            android.graphics.Rect r0 = new android.graphics.Rect
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.<init>(r1, r1, r2, r2)
            defpackage.mq0.k0 = r0
            jd1 r0 = new jd1
            r1 = 4
            r0.<init>(r1)
            defpackage.mq0.l0 = r0
            w31 r0 = new w31
            r1 = 5
            r0.<init>(r1)
            defpackage.mq0.m0 = r0
            return
    }

    public mq0(com.google.android.material.chip.Chip r2, com.google.android.material.chip.Chip r3) {
            r1 = this;
            r1.j0 = r2
            r1.<init>()
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.R = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.X = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.Y = r2
            r2 = 2
            int[] r2 = new int[r2]
            r1.Z = r2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.g0 = r2
            r1.h0 = r2
            r1.i0 = r2
            r1.e0 = r3
            android.content.Context r2 = r3.getContext()
            java.lang.String r0 = "accessibility"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r2 = (android.view.accessibility.AccessibilityManager) r2
            r1.d0 = r2
            r1 = 1
            r3.setFocusable(r1)
            java.util.WeakHashMap r2 = defpackage.ao7.a
            int r2 = r3.getImportantForAccessibility()
            if (r2 != 0) goto L46
            r3.setImportantForAccessibility(r1)
        L46:
            return
    }

    @Override // defpackage.b2
    public final defpackage.os0 b(android.view.View r2) {
            r1 = this;
            ue r2 = r1.f0
            if (r2 != 0) goto Lc
            ue r2 = new ue
            r0 = 1
            r2.<init>(r1, r0)
            r1.f0 = r2
        Lc:
            ue r1 = r1.f0
            return r1
    }

    @Override // defpackage.b2
    public final void d(android.view.View r3, defpackage.v2 r4) {
            r2 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r4.a
            android.view.View$AccessibilityDelegate r1 = r2.A
            r1.onInitializeAccessibilityNodeInfo(r3, r0)
            com.google.android.material.chip.Chip r2 = r2.j0
            nq0 r3 = r2.d0
            if (r3 == 0) goto L13
            boolean r3 = r3.V0
            if (r3 == 0) goto L13
            r3 = 1
            goto L14
        L13:
            r3 = 0
        L14:
            r0.setCheckable(r3)
            boolean r3 = r2.isClickable()
            r0.setClickable(r3)
            java.lang.CharSequence r3 = r2.getAccessibilityClassName()
            r4.i(r3)
            java.lang.CharSequence r2 = r2.getText()
            r4.m(r2)
            return
    }

    public final boolean j(int r3) {
            r2 = this;
            int r0 = r2.h0
            r1 = 0
            if (r0 == r3) goto L6
            return r1
        L6:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.h0 = r0
            r2.p(r3, r1)
            r0 = 8
            r2.r(r3, r0)
            r2 = 1
            return r2
    }

    public final defpackage.v2 k(int r12) {
            r11 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = android.view.accessibility.AccessibilityNodeInfo.obtain()
            v2 r1 = new v2
            r1.<init>(r0)
            r2 = 1
            r0.setEnabled(r2)
            r0.setFocusable(r2)
            java.lang.String r3 = "android.view.View"
            r1.i(r3)
            android.graphics.Rect r3 = defpackage.mq0.k0
            r0.setBoundsInParent(r3)
            r0.setBoundsInScreen(r3)
            r4 = -1
            r1.b = r4
            com.google.android.material.chip.Chip r5 = r11.e0
            r0.setParent(r5)
            r11.o(r12, r1)
            java.lang.CharSequence r6 = r1.g()
            r7 = 0
            if (r6 != 0) goto L3c
            java.lang.CharSequence r6 = r0.getContentDescription()
            if (r6 == 0) goto L36
            goto L3c
        L36:
            java.lang.String r11 = "Callbacks must add text or a content description in populateNodeForVirtualViewId()"
            defpackage.u34.j(r11)
            return r7
        L3c:
            android.graphics.Rect r6 = r11.X
            r1.f(r6)
            boolean r8 = r6.equals(r3)
            if (r8 != 0) goto L144
            int r8 = r0.getActions()
            r9 = r8 & 64
            if (r9 != 0) goto L13e
            r9 = 128(0x80, float:1.8E-43)
            r8 = r8 & r9
            if (r8 != 0) goto L138
            android.content.Context r7 = r5.getContext()
            java.lang.String r7 = r7.getPackageName()
            r0.setPackageName(r7)
            r1.c = r12
            r0.setSource(r5, r12)
            int r7 = r11.g0
            r8 = 0
            if (r7 != r12) goto L70
            r0.setAccessibilityFocused(r2)
            r1.a(r9)
            goto L78
        L70:
            r0.setAccessibilityFocused(r8)
            r7 = 64
            r1.a(r7)
        L78:
            int r7 = r11.h0
            if (r7 != r12) goto L7e
            r12 = r2
            goto L7f
        L7e:
            r12 = r8
        L7f:
            if (r12 == 0) goto L86
            r7 = 2
            r1.a(r7)
            goto L8f
        L86:
            boolean r7 = r0.isFocusable()
            if (r7 == 0) goto L8f
            r1.a(r2)
        L8f:
            r0.setFocused(r12)
            int[] r12 = r11.Z
            r5.getLocationOnScreen(r12)
            android.graphics.Rect r7 = r11.R
            r0.getBoundsInScreen(r7)
            boolean r0 = r7.equals(r3)
            if (r0 == 0) goto Le1
            r1.f(r7)
            int r0 = r1.b
            if (r0 == r4) goto Ld0
            android.view.accessibility.AccessibilityNodeInfo r0 = android.view.accessibility.AccessibilityNodeInfo.obtain()
            v2 r9 = new v2
            r9.<init>(r0)
            int r0 = r1.b
        Lb4:
            if (r0 == r4) goto Ld0
            r9.b = r4
            android.view.accessibility.AccessibilityNodeInfo r10 = r9.a
            r10.setParent(r5, r4)
            r10.setBoundsInParent(r3)
            r11.o(r0, r9)
            r9.f(r6)
            int r0 = r6.left
            int r10 = r6.top
            r7.offset(r0, r10)
            int r0 = r9.b
            goto Lb4
        Ld0:
            r0 = r12[r8]
            int r3 = r5.getScrollX()
            int r0 = r0 - r3
            r3 = r12[r2]
            int r4 = r5.getScrollY()
            int r3 = r3 - r4
            r7.offset(r0, r3)
        Le1:
            android.graphics.Rect r11 = r11.Y
            boolean r0 = r5.getLocalVisibleRect(r11)
            if (r0 == 0) goto L137
            r0 = r12[r8]
            int r3 = r5.getScrollX()
            int r0 = r0 - r3
            r12 = r12[r2]
            int r3 = r5.getScrollY()
            int r12 = r12 - r3
            r11.offset(r0, r12)
            boolean r11 = r7.intersect(r11)
            if (r11 == 0) goto L137
            android.view.accessibility.AccessibilityNodeInfo r11 = r1.a
            r11.setBoundsInScreen(r7)
            boolean r12 = r7.isEmpty()
            if (r12 == 0) goto L10c
            goto L137
        L10c:
            int r12 = r5.getWindowVisibility()
            if (r12 == 0) goto L113
            goto L137
        L113:
            android.view.ViewParent r12 = r5.getParent()
        L117:
            boolean r0 = r12 instanceof android.view.View
            if (r0 == 0) goto L132
            android.view.View r12 = (android.view.View) r12
            float r0 = r12.getAlpha()
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L137
            int r0 = r12.getVisibility()
            if (r0 == 0) goto L12d
            goto L137
        L12d:
            android.view.ViewParent r12 = r12.getParent()
            goto L117
        L132:
            if (r12 == 0) goto L137
            r11.setVisibleToUser(r2)
        L137:
            return r1
        L138:
            java.lang.String r11 = "Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()"
            defpackage.u34.j(r11)
            return r7
        L13e:
            java.lang.String r11 = "Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()"
            defpackage.u34.j(r11)
            return r7
        L144:
            java.lang.String r11 = "Callbacks must set parent bounds in populateNodeForVirtualViewId()"
            defpackage.u34.j(r11)
            return r7
    }

    public final void l(java.util.ArrayList r2) {
            r1 = this;
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
            android.graphics.Rect r0 = com.google.android.material.chip.Chip.v0
            com.google.android.material.chip.Chip r1 = r1.j0
            boolean r0 = r1.c()
            if (r0 == 0) goto L26
            nq0 r0 = r1.d0
            if (r0 == 0) goto L26
            boolean r0 = r0.P0
            if (r0 == 0) goto L26
            android.view.View$OnClickListener r1 = r1.g0
            if (r1 == 0) goto L26
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
        L26:
            return
    }

    public final boolean m(int r21, android.graphics.Rect r22) {
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.l(r3)
            un6 r4 = new un6
            r5 = 0
            r4.<init>(r5)
            r6 = r5
        L15:
            int r7 = r3.size()
            if (r6 >= r7) goto L39
            java.lang.Object r7 = r3.get(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            v2 r7 = r0.k(r7)
            java.lang.Object r8 = r3.get(r6)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r4.e(r8, r7)
            int r6 = r6 + 1
            goto L15
        L39:
            int r3 = r0.h0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r7) goto L41
            r3 = 0
            goto L47
        L41:
            java.lang.Object r3 = r4.c(r3)
            v2 r3 = (defpackage.v2) r3
        L47:
            jd1 r8 = defpackage.mq0.l0
            w31 r9 = defpackage.mq0.m0
            com.google.android.material.chip.Chip r10 = r0.e0
            r11 = 2
            r12 = -1
            r13 = 1
            if (r1 == r13) goto L155
            if (r1 == r11) goto L155
            r11 = 130(0x82, float:1.82E-43)
            r14 = 66
            r15 = 33
            r6 = 17
            if (r1 == r6) goto L64
            if (r1 == r15) goto L64
            if (r1 == r14) goto L64
            if (r1 != r11) goto L67
        L64:
            r17 = r13
            goto L6d
        L67:
            java.lang.String r0 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            defpackage.i.h(r0)
            return r5
        L6d:
            android.graphics.Rect r13 = new android.graphics.Rect
            r13.<init>()
            int r5 = r0.h0
            java.lang.String r19 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            if (r5 == r7) goto L80
            v2 r2 = r0.n(r5)
            r2.f(r13)
            goto Lae
        L80:
            if (r2 == 0) goto L86
            r13.set(r2)
            goto Lae
        L86:
            int r2 = r10.getWidth()
            int r5 = r10.getHeight()
            if (r1 == r6) goto Laa
            if (r1 == r15) goto La5
            if (r1 == r14) goto La0
            if (r1 != r11) goto L9b
            r10 = 0
            r13.set(r10, r12, r2, r12)
            goto Lae
        L9b:
            r10 = 0
            defpackage.i.h(r19)
            return r10
        La0:
            r10 = 0
            r13.set(r12, r10, r12, r5)
            goto Lae
        La5:
            r10 = 0
            r13.set(r10, r5, r2, r5)
            goto Lae
        Laa:
            r10 = 0
            r13.set(r2, r10, r2, r5)
        Lae:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r13)
            if (r1 == r6) goto Le3
            if (r1 == r15) goto Ld8
            if (r1 == r14) goto Lcc
            if (r1 != r11) goto Lc7
            int r5 = r13.height()
            int r5 = r5 + 1
            int r5 = -r5
            r10 = 0
            r2.offset(r10, r5)
            goto Led
        Lc7:
            r10 = 0
            defpackage.i.h(r19)
            return r10
        Lcc:
            r10 = 0
            int r5 = r13.width()
            int r5 = r5 + 1
            int r5 = -r5
            r2.offset(r5, r10)
            goto Led
        Ld8:
            r10 = 0
            int r5 = r13.height()
            int r5 = r5 + 1
            r2.offset(r10, r5)
            goto Led
        Le3:
            r10 = 0
            int r5 = r13.width()
            int r5 = r5 + 1
            r2.offset(r5, r10)
        Led:
            r9.getClass()
            int r5 = r4.f()
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            r10 = 0
            r16 = 0
        Lfc:
            if (r10 >= r5) goto L14f
            java.lang.Object r9 = r4.g(r10)
            v2 r9 = (defpackage.v2) r9
            if (r9 != r3) goto L107
            goto L14c
        L107:
            r8.getClass()
            r9.f(r6)
            boolean r11 = defpackage.vw7.d(r1, r13, r6)
            if (r11 != 0) goto L114
            goto L14c
        L114:
            boolean r11 = defpackage.vw7.d(r1, r13, r2)
            if (r11 != 0) goto L11b
            goto L147
        L11b:
            boolean r11 = defpackage.vw7.a(r1, r13, r6, r2)
            if (r11 == 0) goto L122
            goto L147
        L122:
            boolean r11 = defpackage.vw7.a(r1, r13, r2, r6)
            if (r11 == 0) goto L129
            goto L14c
        L129:
            int r11 = defpackage.vw7.e(r1, r13, r6)
            int r14 = defpackage.vw7.f(r1, r13, r6)
            int r15 = r11 * 13
            int r15 = r15 * r11
            int r14 = r14 * r14
            int r14 = r14 + r15
            int r11 = defpackage.vw7.e(r1, r13, r2)
            int r15 = defpackage.vw7.f(r1, r13, r2)
            int r17 = r11 * 13
            int r17 = r17 * r11
            int r15 = r15 * r15
            int r15 = r15 + r17
            if (r14 >= r15) goto L14c
        L147:
            r2.set(r6)
            r16 = r9
        L14c:
            int r10 = r10 + 1
            goto Lfc
        L14f:
            r18 = 0
        L151:
            r1 = r16
            goto L1cb
        L155:
            r17 = r13
            java.util.WeakHashMap r2 = defpackage.ao7.a
            int r2 = r10.getLayoutDirection()
            r5 = r17
            if (r2 != r5) goto L163
            r2 = 1
            goto L164
        L163:
            r2 = 0
        L164:
            r9.getClass()
            int r5 = r4.f()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r5)
            r10 = 0
        L171:
            if (r10 >= r5) goto L17f
            java.lang.Object r9 = r4.g(r10)
            v2 r9 = (defpackage.v2) r9
            r6.add(r9)
            int r10 = r10 + 1
            goto L171
        L17f:
            th2 r5 = new th2
            r5.<init>(r2, r8)
            java.util.Collections.sort(r6, r5)
            r5 = 1
            if (r1 == r5) goto L1ac
            if (r1 != r11) goto L1a4
            int r1 = r6.size()
            if (r3 != 0) goto L194
            r2 = r12
            goto L198
        L194:
            int r2 = r6.lastIndexOf(r3)
        L198:
            int r2 = r2 + r5
            if (r2 >= r1) goto L1a2
            java.lang.Object r6 = r6.get(r2)
        L19f:
            r18 = 0
            goto L1c6
        L1a2:
            r6 = 0
            goto L19f
        L1a4:
            java.lang.String r0 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}."
            defpackage.i.h(r0)
            r18 = 0
            return r18
        L1ac:
            r18 = 0
            int r1 = r6.size()
            if (r3 != 0) goto L1b7
        L1b4:
            r17 = 1
            goto L1bc
        L1b7:
            int r1 = r6.indexOf(r3)
            goto L1b4
        L1bc:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L1c5
            java.lang.Object r6 = r6.get(r1)
            goto L1c6
        L1c5:
            r6 = 0
        L1c6:
            r16 = r6
            v2 r16 = (defpackage.v2) r16
            goto L151
        L1cb:
            if (r1 != 0) goto L1ce
            goto L1ea
        L1ce:
            boolean r2 = r4.A
            if (r2 == 0) goto L1d5
            defpackage.vy7.I(r4)
        L1d5:
            int r2 = r4.R
            r5 = r18
        L1d9:
            if (r5 >= r2) goto L1e6
            java.lang.Object[] r3 = r4.L
            r3 = r3[r5]
            if (r3 != r1) goto L1e3
            r12 = r5
            goto L1e6
        L1e3:
            int r5 = r5 + 1
            goto L1d9
        L1e6:
            int r7 = r4.d(r12)
        L1ea:
            boolean r0 = r0.q(r7)
            return r0
    }

    public final defpackage.v2 n(int r6) {
            r5 = this;
            r0 = -1
            if (r6 != r0) goto L49
            com.google.android.material.chip.Chip r6 = r5.e0
            android.view.accessibility.AccessibilityNodeInfo r0 = android.view.accessibility.AccessibilityNodeInfo.obtain(r6)
            v2 r1 = new v2
            r1.<init>(r0)
            java.util.WeakHashMap r2 = defpackage.ao7.a
            r6.onInitializeAccessibilityNodeInfo(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5.l(r2)
            int r5 = r0.getChildCount()
            if (r5 <= 0) goto L2f
            int r5 = r2.size()
            if (r5 > 0) goto L28
            goto L2f
        L28:
            java.lang.String r5 = "Views cannot have both real and virtual children"
            defpackage.u34.j(r5)
            r5 = 0
            return r5
        L2f:
            int r5 = r2.size()
            r0 = 0
        L34:
            if (r0 >= r5) goto L48
            java.lang.Object r3 = r2.get(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            android.view.accessibility.AccessibilityNodeInfo r4 = r1.a
            r4.addChild(r6, r3)
            int r0 = r0 + 1
            goto L34
        L48:
            return r1
        L49:
            v2 r5 = r5.k(r6)
            return r5
    }

    public final void o(int r5, defpackage.v2 r6) {
            r4 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r6.a
            r1 = 1
            java.lang.String r2 = ""
            if (r5 != r1) goto L51
            com.google.android.material.chip.Chip r4 = r4.j0
            java.lang.CharSequence r5 = r4.getCloseIconContentDescription()
            if (r5 == 0) goto L13
            r0.setContentDescription(r5)
            goto L34
        L13:
            java.lang.CharSequence r5 = r4.getText()
            android.content.Context r1 = r4.getContext()
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 != 0) goto L22
            r2 = r5
        L22:
            java.lang.Object[] r5 = new java.lang.Object[]{r2}
            r2 = 2131952231(0x7f130267, float:1.9540899E38)
            java.lang.String r5 = r1.getString(r2, r5)
            java.lang.String r5 = r5.trim()
            r0.setContentDescription(r5)
        L34:
            android.graphics.Rect r5 = com.google.android.material.chip.Chip.a(r4)
            r0.setBoundsInParent(r5)
            p2 r5 = defpackage.p2.e
            r6.b(r5)
            boolean r4 = r4.isEnabled()
            r0.setEnabled(r4)
            java.lang.Class<android.widget.Button> r4 = android.widget.Button.class
            java.lang.String r4 = r4.getName()
            r6.i(r4)
            return
        L51:
            r0.setContentDescription(r2)
            android.graphics.Rect r4 = com.google.android.material.chip.Chip.v0
            r0.setBoundsInParent(r4)
            return
    }

    public final void p(int r4, boolean r5) {
            r3 = this;
            com.google.android.material.chip.Chip r3 = r3.j0
            r0 = 1
            if (r4 != r0) goto L7
            r3.l0 = r5
        L7:
            nq0 r4 = r3.d0
            boolean r5 = r3.l0
            android.graphics.drawable.Drawable r1 = r4.Q0
            r2 = 0
            if (r1 == 0) goto L26
            if (r5 == 0) goto L20
            r5 = 2
            int[] r5 = new int[r5]
            r1 = 16842919(0x10100a7, float:2.3694026E-38)
            r5[r2] = r1
            r1 = 16842910(0x101009e, float:2.3694E-38)
            r5[r0] = r1
            goto L22
        L20:
            int[] r5 = defpackage.nq0.K1
        L22:
            boolean r2 = r4.R(r5)
        L26:
            if (r2 == 0) goto L2b
            r3.refreshDrawableState()
        L2b:
            return
    }

    public final boolean q(int r3) {
            r2 = this;
            com.google.android.material.chip.Chip r0 = r2.e0
            boolean r1 = r0.isFocused()
            if (r1 != 0) goto Lf
            boolean r0 = r0.requestFocus()
            if (r0 != 0) goto Lf
            goto L1d
        Lf:
            int r0 = r2.h0
            if (r0 != r3) goto L14
            goto L1d
        L14:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L1b
            r2.j(r0)
        L1b:
            if (r3 != r1) goto L1f
        L1d:
            r2 = 0
            return r2
        L1f:
            r2.h0 = r3
            r0 = 1
            r2.p(r3, r0)
            r1 = 8
            r2.r(r3, r1)
            return r0
    }

    public final void r(int r5, int r6) {
            r4 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r0) goto L89
            android.view.accessibility.AccessibilityManager r0 = r4.d0
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto Le
            goto L89
        Le:
            com.google.android.material.chip.Chip r0 = r4.e0
            android.view.ViewParent r1 = r0.getParent()
            if (r1 != 0) goto L17
            goto L89
        L17:
            r2 = -1
            if (r5 == r2) goto L7f
            android.view.accessibility.AccessibilityEvent r6 = android.view.accessibility.AccessibilityEvent.obtain(r6)
            v2 r4 = r4.n(r5)
            java.util.List r2 = r6.getText()
            java.lang.CharSequence r3 = r4.g()
            r2.add(r3)
            android.view.accessibility.AccessibilityNodeInfo r4 = r4.a
            java.lang.CharSequence r2 = r4.getContentDescription()
            r6.setContentDescription(r2)
            boolean r2 = r4.isScrollable()
            r6.setScrollable(r2)
            boolean r2 = r4.isPassword()
            r6.setPassword(r2)
            boolean r2 = r4.isEnabled()
            r6.setEnabled(r2)
            boolean r2 = r4.isChecked()
            r6.setChecked(r2)
            java.util.List r2 = r6.getText()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L69
            java.lang.CharSequence r2 = r6.getContentDescription()
            if (r2 == 0) goto L63
            goto L69
        L63:
            java.lang.String r4 = "Callbacks must add text or a content description in populateEventForVirtualViewId()"
            defpackage.u34.j(r4)
            return
        L69:
            java.lang.CharSequence r4 = r4.getClassName()
            r6.setClassName(r4)
            r6.setSource(r0, r5)
            android.content.Context r4 = r0.getContext()
            java.lang.String r4 = r4.getPackageName()
            r6.setPackageName(r4)
            goto L86
        L7f:
            android.view.accessibility.AccessibilityEvent r6 = android.view.accessibility.AccessibilityEvent.obtain(r6)
            r0.onInitializeAccessibilityEvent(r6)
        L86:
            r1.requestSendAccessibilityEvent(r0, r6)
        L89:
            return
    }
}
