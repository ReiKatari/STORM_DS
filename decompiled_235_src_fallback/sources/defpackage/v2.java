package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v2  reason: default package */
/* loaded from: classes.dex */
public final class v2 {
    public static int d;
    public final android.view.accessibility.AccessibilityNodeInfo a;
    public int b;
    public int c;

    public v2(android.view.accessibility.AccessibilityNodeInfo r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.b = r0
            r1.c = r0
            r1.a = r2
            return
    }

    public static java.lang.String d(int r1) {
            r0 = 1
            if (r1 == r0) goto L96
            r0 = 2
            if (r1 == r0) goto L93
            switch(r1) {
                case 4: goto L90;
                case 8: goto L8d;
                case 16: goto L8a;
                case 32: goto L87;
                case 64: goto L84;
                case 128: goto L81;
                case 256: goto L7e;
                case 512: goto L7b;
                case 1024: goto L78;
                case 2048: goto L75;
                case 4096: goto L72;
                case 8192: goto L6f;
                case 16384: goto L6c;
                case 32768: goto L69;
                case 65536: goto L66;
                case 131072: goto L63;
                case 262144: goto L60;
                case 524288: goto L5d;
                case 2097152: goto L5a;
                case 16908354: goto L57;
                default: goto L9;
            }
        L9:
            switch(r1) {
                case 16908342: goto L54;
                case 16908343: goto L51;
                case 16908344: goto L4e;
                case 16908345: goto L4b;
                case 16908346: goto L48;
                case 16908347: goto L45;
                case 16908348: goto L42;
                case 16908349: goto L3f;
                default: goto Lc;
            }
        Lc:
            switch(r1) {
                case 16908356: goto L3c;
                case 16908357: goto L39;
                case 16908358: goto L36;
                case 16908359: goto L33;
                case 16908360: goto L30;
                case 16908361: goto L2d;
                case 16908362: goto L2a;
                default: goto Lf;
            }
        Lf:
            switch(r1) {
                case 16908372: goto L27;
                case 16908373: goto L24;
                case 16908374: goto L21;
                case 16908375: goto L1e;
                default: goto L12;
            }
        L12:
            switch(r1) {
                case 16908382: goto L1b;
                case 16908383: goto L18;
                default: goto L15;
            }
        L15:
            java.lang.String r1 = "ACTION_UNKNOWN"
            return r1
        L18:
            java.lang.String r1 = "ACTION_SET_EXTENDED_SELECTION"
            return r1
        L1b:
            java.lang.String r1 = "ACTION_SCROLL_IN_DIRECTION"
            return r1
        L1e:
            java.lang.String r1 = "ACTION_DRAG_CANCEL"
            return r1
        L21:
            java.lang.String r1 = "ACTION_DRAG_DROP"
            return r1
        L24:
            java.lang.String r1 = "ACTION_DRAG_START"
            return r1
        L27:
            java.lang.String r1 = "ACTION_IME_ENTER"
            return r1
        L2a:
            java.lang.String r1 = "ACTION_PRESS_AND_HOLD"
            return r1
        L2d:
            java.lang.String r1 = "ACTION_PAGE_RIGHT"
            return r1
        L30:
            java.lang.String r1 = "ACTION_PAGE_LEFT"
            return r1
        L33:
            java.lang.String r1 = "ACTION_PAGE_DOWN"
            return r1
        L36:
            java.lang.String r1 = "ACTION_PAGE_UP"
            return r1
        L39:
            java.lang.String r1 = "ACTION_HIDE_TOOLTIP"
            return r1
        L3c:
            java.lang.String r1 = "ACTION_SHOW_TOOLTIP"
            return r1
        L3f:
            java.lang.String r1 = "ACTION_SET_PROGRESS"
            return r1
        L42:
            java.lang.String r1 = "ACTION_CONTEXT_CLICK"
            return r1
        L45:
            java.lang.String r1 = "ACTION_SCROLL_RIGHT"
            return r1
        L48:
            java.lang.String r1 = "ACTION_SCROLL_DOWN"
            return r1
        L4b:
            java.lang.String r1 = "ACTION_SCROLL_LEFT"
            return r1
        L4e:
            java.lang.String r1 = "ACTION_SCROLL_UP"
            return r1
        L51:
            java.lang.String r1 = "ACTION_SCROLL_TO_POSITION"
            return r1
        L54:
            java.lang.String r1 = "ACTION_SHOW_ON_SCREEN"
            return r1
        L57:
            java.lang.String r1 = "ACTION_MOVE_WINDOW"
            return r1
        L5a:
            java.lang.String r1 = "ACTION_SET_TEXT"
            return r1
        L5d:
            java.lang.String r1 = "ACTION_COLLAPSE"
            return r1
        L60:
            java.lang.String r1 = "ACTION_EXPAND"
            return r1
        L63:
            java.lang.String r1 = "ACTION_SET_SELECTION"
            return r1
        L66:
            java.lang.String r1 = "ACTION_CUT"
            return r1
        L69:
            java.lang.String r1 = "ACTION_PASTE"
            return r1
        L6c:
            java.lang.String r1 = "ACTION_COPY"
            return r1
        L6f:
            java.lang.String r1 = "ACTION_SCROLL_BACKWARD"
            return r1
        L72:
            java.lang.String r1 = "ACTION_SCROLL_FORWARD"
            return r1
        L75:
            java.lang.String r1 = "ACTION_PREVIOUS_HTML_ELEMENT"
            return r1
        L78:
            java.lang.String r1 = "ACTION_NEXT_HTML_ELEMENT"
            return r1
        L7b:
            java.lang.String r1 = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY"
            return r1
        L7e:
            java.lang.String r1 = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY"
            return r1
        L81:
            java.lang.String r1 = "ACTION_CLEAR_ACCESSIBILITY_FOCUS"
            return r1
        L84:
            java.lang.String r1 = "ACTION_ACCESSIBILITY_FOCUS"
            return r1
        L87:
            java.lang.String r1 = "ACTION_LONG_CLICK"
            return r1
        L8a:
            java.lang.String r1 = "ACTION_CLICK"
            return r1
        L8d:
            java.lang.String r1 = "ACTION_CLEAR_SELECTION"
            return r1
        L90:
            java.lang.String r1 = "ACTION_SELECT"
            return r1
        L93:
            java.lang.String r1 = "ACTION_CLEAR_FOCUS"
            return r1
        L96:
            java.lang.String r1 = "ACTION_FOCUS"
            return r1
    }

    public final void a(int r1) {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.a
            r0.addAction(r1)
            return
    }

    public final void b(defpackage.p2 r1) {
            r0 = this;
            java.lang.Object r1 = r1.a
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r1 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r1
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.a
            r0.addAction(r1)
            return
    }

    public final java.util.ArrayList c(java.lang.String r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r1 = r1.a
            android.os.Bundle r0 = r1.getExtras()
            java.util.ArrayList r0 = r0.getIntegerArrayList(r2)
            if (r0 != 0) goto L18
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.os.Bundle r1 = r1.getExtras()
            r1.putIntegerArrayList(r2, r0)
        L18:
            return r0
    }

    public final boolean e(int r3) {
            r2 = this;
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.a
            android.os.Bundle r2 = r2.getExtras()
            r0 = 0
            if (r2 != 0) goto La
            goto L15
        La:
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY"
            int r2 = r2.getInt(r1, r0)
            r2 = r2 & r3
            if (r2 != r3) goto L15
            r2 = 1
            return r2
        L15:
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof defpackage.v2
            if (r2 != 0) goto Ld
            return r1
        Ld:
            v2 r5 = (defpackage.v2) r5
            android.view.accessibility.AccessibilityNodeInfo r2 = r5.a
            android.view.accessibility.AccessibilityNodeInfo r3 = r4.a
            if (r3 != 0) goto L18
            if (r2 == 0) goto L1f
            return r1
        L18:
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L1f
            return r1
        L1f:
            int r2 = r4.c
            int r3 = r5.c
            if (r2 == r3) goto L26
            return r1
        L26:
            int r4 = r4.b
            int r5 = r5.b
            if (r4 == r5) goto L2d
            return r1
        L2d:
            return r0
    }

    public final void f(android.graphics.Rect r1) {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.a
            r0.getBoundsInParent(r1)
            return
    }

    public final java.lang.CharSequence g() {
            r11 = this;
            java.lang.String r0 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY"
            java.util.ArrayList r1 = r11.c(r0)
            boolean r1 = r1.isEmpty()
            android.view.accessibility.AccessibilityNodeInfo r2 = r11.a
            if (r1 != 0) goto L7e
            java.util.ArrayList r0 = r11.c(r0)
            java.lang.String r1 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY"
            java.util.ArrayList r1 = r11.c(r1)
            java.lang.String r3 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY"
            java.util.ArrayList r3 = r11.c(r3)
            java.lang.String r4 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY"
            java.util.ArrayList r4 = r11.c(r4)
            android.text.SpannableString r5 = new android.text.SpannableString
            java.lang.CharSequence r6 = r2.getText()
            java.lang.CharSequence r7 = r2.getText()
            int r7 = r7.length()
            r8 = 0
            java.lang.String r6 = android.text.TextUtils.substring(r6, r8, r7)
            r5.<init>(r6)
        L3a:
            int r6 = r0.size()
            if (r8 >= r6) goto L7d
            z1 r6 = new z1
            java.lang.Object r7 = r4.get(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            android.os.Bundle r9 = r2.getExtras()
            java.lang.String r10 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY"
            int r9 = r9.getInt(r10)
            r6.<init>(r7, r11, r9)
            java.lang.Object r7 = r0.get(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r9 = r1.get(r8)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            java.lang.Object r10 = r3.get(r8)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r5.setSpan(r6, r7, r9, r10)
            int r8 = r8 + 1
            goto L3a
        L7d:
            return r5
        L7e:
            java.lang.CharSequence r11 = r2.getText()
            return r11
    }

    public final void h(int r5, boolean r6) {
            r4 = this;
            android.view.accessibility.AccessibilityNodeInfo r4 = r4.a
            android.os.Bundle r4 = r4.getExtras()
            if (r4 == 0) goto L19
            java.lang.String r0 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY"
            r1 = 0
            int r2 = r4.getInt(r0, r1)
            int r3 = ~r5
            r2 = r2 & r3
            if (r6 == 0) goto L14
            goto L15
        L14:
            r5 = r1
        L15:
            r5 = r5 | r2
            r4.putInt(r0, r5)
        L19:
            return
    }

    public final int hashCode() {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.hashCode()
            return r0
    }

    public final void i(java.lang.CharSequence r1) {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.a
            r0.setClassName(r1)
            return
    }

    public final void j(defpackage.jw2 r1) {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.a
            r1 = 0
            r0.setCollectionInfo(r1)
            return
    }

    public final void k(defpackage.u2 r1) {
            r0 = this;
            java.lang.Object r1 = r1.b
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r1 = (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) r1
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.a
            r0.setCollectionItemInfo(r1)
            return
    }

    public final void l(boolean r1) {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.a
            r0.setScrollable(r1)
            return
    }

    public final void m(java.lang.CharSequence r1) {
            r0 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.a
            r0.setText(r1)
            return
    }

    public final java.lang.String toString() {
            r17 = this;
            r0 = r17
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = super.toString()
            r1.append(r2)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.f(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "; boundsInParent: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r1.append(r3)
            android.view.accessibility.AccessibilityNodeInfo r3 = r0.a
            r3.getBoundsInScreen(r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "; boundsInScreen: "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r1.append(r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 34
            if (r4 < r5) goto L47
            defpackage.c2.d(r3, r2)
            goto L60
        L47:
            android.os.Bundle r6 = r3.getExtras()
            java.lang.String r7 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY"
            android.os.Parcelable r6 = r6.getParcelable(r7)
            android.graphics.Rect r6 = (android.graphics.Rect) r6
            if (r6 == 0) goto L60
            int r7 = r6.left
            int r8 = r6.top
            int r9 = r6.right
            int r6 = r6.bottom
            r2.set(r7, r8, r9, r6)
        L60:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "; boundsInWindow: "
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r1.append(r2)
            java.lang.String r2 = "; packageName: "
            r1.append(r2)
            java.lang.CharSequence r2 = r3.getPackageName()
            r1.append(r2)
            java.lang.String r2 = "; className: "
            r1.append(r2)
            java.lang.CharSequence r2 = r3.getClassName()
            r1.append(r2)
            java.lang.String r2 = "; text: "
            r1.append(r2)
            java.lang.CharSequence r2 = r0.g()
            r1.append(r2)
            java.lang.String r2 = "; error: "
            r1.append(r2)
            java.lang.CharSequence r2 = r3.getError()
            r1.append(r2)
            java.lang.String r2 = "; maxTextLength: "
            r1.append(r2)
            int r2 = r3.getMaxTextLength()
            r1.append(r2)
            java.lang.String r2 = "; stateDescription: "
            r1.append(r2)
            r2 = 30
            if (r4 < r2) goto Lbb
            java.lang.CharSequence r2 = defpackage.q2.f(r3)
            goto Lc5
        Lbb:
            android.os.Bundle r2 = r3.getExtras()
            java.lang.String r6 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"
            java.lang.CharSequence r2 = r2.getCharSequence(r6)
        Lc5:
            r1.append(r2)
            java.lang.String r2 = "; contentDescription: "
            r1.append(r2)
            java.lang.CharSequence r2 = r3.getContentDescription()
            r1.append(r2)
            java.lang.String r2 = "; supplementalDescription: "
            r1.append(r2)
            r2 = 36
            if (r4 < r2) goto Le2
            java.lang.CharSequence r6 = defpackage.s2.c(r3)
            goto Lec
        Le2:
            android.os.Bundle r6 = r3.getExtras()
            java.lang.String r7 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY"
            java.lang.CharSequence r6 = r6.getCharSequence(r7)
        Lec:
            r1.append(r6)
            java.lang.String r6 = "; tooltipText: "
            r1.append(r6)
            r6 = 28
            if (r4 < r6) goto Lfd
            java.lang.CharSequence r6 = defpackage.j2.h(r3)
            goto L107
        Lfd:
            android.os.Bundle r6 = r3.getExtras()
            java.lang.String r7 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY"
            java.lang.CharSequence r6 = r6.getCharSequence(r7)
        L107:
            r1.append(r6)
            java.lang.String r6 = "; viewIdResName: "
            r1.append(r6)
            java.lang.String r6 = r3.getViewIdResourceName()
            r1.append(r6)
            java.lang.String r6 = "; uniqueId: "
            r1.append(r6)
            r6 = 33
            if (r4 < r6) goto L124
            java.lang.String r7 = defpackage.r2.g(r3)
            goto L12e
        L124:
            android.os.Bundle r7 = r3.getExtras()
            java.lang.String r8 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"
            java.lang.String r7 = r7.getString(r8)
        L12e:
            r1.append(r7)
            java.lang.String r7 = "; checkable: "
            r1.append(r7)
            boolean r7 = r3.isCheckable()
            r1.append(r7)
            java.lang.String r7 = "; checked: "
            r1.append(r7)
            if (r4 < r2) goto L149
            int r7 = defpackage.s2.a(r3)
            goto L157
        L149:
            android.os.Bundle r7 = r3.getExtras()
            java.lang.String r8 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY"
            boolean r9 = r3.isChecked()
            int r7 = r7.getInt(r8, r9)
        L157:
            java.lang.String r8 = "PARTIAL"
            r9 = 2
            r10 = 1
            if (r7 != r10) goto L160
            java.lang.String r7 = "TRUE"
            goto L166
        L160:
            if (r7 != r9) goto L164
            r7 = r8
            goto L166
        L164:
            java.lang.String r7 = "FALSE"
        L166:
            r1.append(r7)
            java.lang.String r7 = "; fieldRequired: "
            r1.append(r7)
            if (r4 < r2) goto L175
            boolean r7 = defpackage.s2.d(r3)
            goto L17f
        L175:
            android.os.Bundle r7 = r3.getExtras()
            java.lang.String r11 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY"
            boolean r7 = r7.getBoolean(r11)
        L17f:
            r1.append(r7)
            java.lang.String r7 = "; focusable: "
            r1.append(r7)
            boolean r7 = r3.isFocusable()
            r1.append(r7)
            java.lang.String r7 = "; focused: "
            r1.append(r7)
            boolean r7 = r3.isFocused()
            r1.append(r7)
            java.lang.String r7 = "; selected: "
            r1.append(r7)
            boolean r7 = r3.isSelected()
            r1.append(r7)
            java.lang.String r7 = "; clickable: "
            r1.append(r7)
            boolean r7 = r3.isClickable()
            r1.append(r7)
            java.lang.String r7 = "; longClickable: "
            r1.append(r7)
            boolean r7 = r3.isLongClickable()
            r1.append(r7)
            java.lang.String r7 = "; contextClickable: "
            r1.append(r7)
            boolean r7 = r3.isContextClickable()
            r1.append(r7)
            java.lang.String r7 = "; expandedState: "
            r1.append(r7)
            r7 = 0
            if (r4 < r2) goto L1d7
            int r2 = defpackage.s2.b(r3)
            goto L1e1
        L1d7:
            android.os.Bundle r2 = r3.getExtras()
            java.lang.String r11 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY"
            int r2 = r2.getInt(r11, r7)
        L1e1:
            if (r2 == 0) goto L1f3
            if (r2 == r10) goto L1f0
            if (r2 == r9) goto L1f5
            r8 = 3
            if (r2 == r8) goto L1ed
            java.lang.String r8 = "UNKNOWN"
            goto L1f5
        L1ed:
            java.lang.String r8 = "FULL"
            goto L1f5
        L1f0:
            java.lang.String r8 = "COLLAPSED"
            goto L1f5
        L1f3:
            java.lang.String r8 = "UNDEFINED"
        L1f5:
            r1.append(r8)
            java.lang.String r2 = "; enabled: "
            r1.append(r2)
            boolean r2 = r3.isEnabled()
            r1.append(r2)
            java.lang.String r2 = "; password: "
            r1.append(r2)
            boolean r2 = r3.isPassword()
            r1.append(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r8 = "; scrollable: "
            r2.<init>(r8)
            boolean r8 = r3.isScrollable()
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r2 = "; containerTitle: "
            r1.append(r2)
            if (r4 < r5) goto L231
            java.lang.CharSequence r2 = defpackage.c2.e(r3)
            goto L23b
        L231:
            android.os.Bundle r2 = r3.getExtras()
            java.lang.String r8 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"
            java.lang.CharSequence r2 = r2.getCharSequence(r8)
        L23b:
            r1.append(r2)
            java.lang.String r2 = "; granularScrollingSupported: "
            r1.append(r2)
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            boolean r2 = r0.e(r2)
            r1.append(r2)
            java.lang.String r2 = "; importantForAccessibility: "
            r1.append(r2)
            boolean r2 = r3.isImportantForAccessibility()
            r1.append(r2)
            java.lang.String r2 = "; visible: "
            r1.append(r2)
            boolean r2 = r3.isVisibleToUser()
            r1.append(r2)
            java.lang.String r2 = "; isTextSelectable: "
            r1.append(r2)
            if (r4 < r6) goto L270
            boolean r2 = defpackage.r2.h(r3)
            goto L276
        L270:
            r2 = 8388608(0x800000, float:1.1754944E-38)
            boolean r2 = r0.e(r2)
        L276:
            r1.append(r2)
            java.lang.String r2 = "; accessibilityDataSensitive: "
            r1.append(r2)
            if (r4 < r5) goto L285
            boolean r0 = defpackage.c2.i(r3)
            goto L28b
        L285:
            r2 = 64
            boolean r0 = r0.e(r2)
        L28b:
            r1.append(r0)
            java.lang.String r0 = "; ["
            r1.append(r0)
            java.util.List r0 = r3.getActionList()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r0.size()
            r4 = r7
        L2a1:
            if (r4 >= r3) goto L2b7
            java.lang.Object r12 = r0.get(r4)
            p2 r11 = new p2
            r15 = 0
            r16 = 0
            r13 = 0
            r14 = 0
            r11.<init>(r12, r13, r14, r15, r16)
            r2.add(r11)
            int r4 = r4 + 1
            goto L2a1
        L2b7:
            int r0 = r2.size()
            if (r7 >= r0) goto L2fa
            java.lang.Object r0 = r2.get(r7)
            p2 r0 = (defpackage.p2) r0
            int r3 = r0.a()
            java.lang.Object r0 = r0.a
            java.lang.String r3 = d(r3)
            java.lang.String r4 = "ACTION_UNKNOWN"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L2e8
            r4 = r0
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r4 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r4
            java.lang.CharSequence r4 = r4.getLabel()
            if (r4 == 0) goto L2e8
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r0
            java.lang.CharSequence r0 = r0.getLabel()
            java.lang.String r3 = r0.toString()
        L2e8:
            r1.append(r3)
            int r0 = r2.size()
            int r0 = r0 - r10
            if (r7 == r0) goto L2f7
            java.lang.String r0 = ", "
            r1.append(r0)
        L2f7:
            int r7 = r7 + 1
            goto L2b7
        L2fa:
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
