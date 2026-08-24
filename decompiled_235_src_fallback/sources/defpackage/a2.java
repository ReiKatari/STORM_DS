package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a2  reason: default package */
/* loaded from: classes.dex */
public final class a2 extends android.view.View.AccessibilityDelegate {
    public final defpackage.b2 a;

    public a2(defpackage.b2 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            b2 r0 = r0.a
            boolean r0 = r0.a(r1, r2)
            return r0
    }

    @Override // android.view.View.AccessibilityDelegate
    public final android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View r1) {
            r0 = this;
            b2 r0 = r0.a
            os0 r0 = r0.b(r1)
            if (r0 == 0) goto Ld
            java.lang.Object r0 = r0.B
            android.view.accessibility.AccessibilityNodeProvider r0 = (android.view.accessibility.AccessibilityNodeProvider) r0
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            b2 r0 = r0.a
            r0.c(r1, r2)
            return
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(android.view.View r14, android.view.accessibility.AccessibilityNodeInfo r15) {
            r13 = this;
            v2 r0 = new v2
            r0.<init>(r15)
            java.util.WeakHashMap r1 = defpackage.ao7.a
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            r4 = 28
            if (r1 < r4) goto L19
            boolean r1 = defpackage.vn7.c(r14)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L28
        L19:
            r1 = 2131427950(0x7f0b026e, float:1.847753E38)
            java.lang.Object r1 = r14.getTag(r1)
            boolean r5 = r3.isInstance(r1)
            if (r5 == 0) goto L27
            goto L28
        L27:
            r1 = r2
        L28:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L36
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L36
            r1 = r6
            goto L37
        L36:
            r1 = r5
        L37:
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r4) goto L3f
            defpackage.j2.v(r15, r1)
            goto L42
        L3f:
            r0.h(r6, r1)
        L42:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r4) goto L4f
            boolean r1 = defpackage.vn7.b(r14)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L5e
        L4f:
            r1 = 2131427944(0x7f0b0268, float:1.8477519E38)
            java.lang.Object r1 = r14.getTag(r1)
            boolean r3 = r3.isInstance(r1)
            if (r3 == 0) goto L5d
            goto L5e
        L5d:
            r1 = r2
        L5e:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L69
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L69
            goto L6a
        L69:
            r6 = r5
        L6a:
            if (r7 < r4) goto L70
            defpackage.j2.A(r15, r6)
            goto L74
        L70:
            r1 = 2
            r0.h(r1, r6)
        L74:
            java.lang.CharSequence r1 = defpackage.ao7.f(r14)
            if (r7 < r4) goto L7e
            defpackage.j2.u(r15, r1)
            goto L87
        L7e:
            android.os.Bundle r3 = r15.getExtras()
            java.lang.String r4 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"
            r3.putCharSequence(r4, r1)
        L87:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r1 < r3) goto L92
            java.lang.CharSequence r1 = defpackage.xn7.b(r14)
            goto La3
        L92:
            r1 = 2131427951(0x7f0b026f, float:1.8477533E38)
            java.lang.Object r1 = r14.getTag(r1)
            java.lang.Class<java.lang.CharSequence> r4 = java.lang.CharSequence.class
            boolean r4 = r4.isInstance(r1)
            if (r4 == 0) goto La2
            goto La3
        La2:
            r1 = r2
        La3:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r7 < r3) goto Lab
            defpackage.q2.l(r15, r1)
            goto Lb4
        Lab:
            android.os.Bundle r3 = r15.getExtras()
            java.lang.String r4 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"
            r3.putCharSequence(r4, r1)
        Lb4:
            b2 r13 = r13.a
            r13.d(r14, r0)
            java.lang.CharSequence r13 = r15.getText()
            r1 = 26
            if (r7 >= r1) goto L1d4
            android.os.Bundle r1 = r15.getExtras()
            java.lang.String r3 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY"
            r1.remove(r3)
            android.os.Bundle r1 = r15.getExtras()
            java.lang.String r4 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY"
            r1.remove(r4)
            android.os.Bundle r1 = r15.getExtras()
            java.lang.String r6 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY"
            r1.remove(r6)
            android.os.Bundle r1 = r15.getExtras()
            java.lang.String r7 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY"
            r1.remove(r7)
            r1 = 2131427943(0x7f0b0267, float:1.8477517E38)
            java.lang.Object r8 = r14.getTag(r1)
            android.util.SparseArray r8 = (android.util.SparseArray) r8
            if (r8 == 0) goto L129
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r10 = r5
        Lf6:
            int r11 = r8.size()
            if (r10 >= r11) goto L112
            java.lang.Object r11 = r8.valueAt(r10)
            java.lang.ref.WeakReference r11 = (java.lang.ref.WeakReference) r11
            java.lang.Object r11 = r11.get()
            if (r11 != 0) goto L10f
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r9.add(r11)
        L10f:
            int r10 = r10 + 1
            goto Lf6
        L112:
            r10 = r5
        L113:
            int r11 = r9.size()
            if (r10 >= r11) goto L129
            java.lang.Object r11 = r9.get(r10)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r8.remove(r11)
            int r10 = r10 + 1
            goto L113
        L129:
            boolean r8 = r13 instanceof android.text.Spanned
            if (r8 == 0) goto L13c
            r2 = r13
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r8 = r13.length()
            java.lang.Class<android.text.style.ClickableSpan> r9 = android.text.style.ClickableSpan.class
            java.lang.Object[] r2 = r2.getSpans(r5, r8, r9)
            android.text.style.ClickableSpan[] r2 = (android.text.style.ClickableSpan[]) r2
        L13c:
            if (r2 == 0) goto L1d4
            int r8 = r2.length
            if (r8 <= 0) goto L1d4
            android.os.Bundle r15 = r15.getExtras()
            java.lang.String r8 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY"
            r9 = 2131427344(0x7f0b0010, float:1.8476302E38)
            r15.putInt(r8, r9)
            java.lang.Object r15 = r14.getTag(r1)
            android.util.SparseArray r15 = (android.util.SparseArray) r15
            if (r15 != 0) goto L15d
            android.util.SparseArray r15 = new android.util.SparseArray
            r15.<init>()
            r14.setTag(r1, r15)
        L15d:
            r1 = r5
        L15e:
            int r8 = r2.length
            if (r1 >= r8) goto L1d4
            r8 = r2[r1]
            r9 = r5
        L164:
            int r10 = r15.size()
            if (r9 >= r10) goto L184
            java.lang.Object r10 = r15.valueAt(r9)
            java.lang.ref.WeakReference r10 = (java.lang.ref.WeakReference) r10
            java.lang.Object r10 = r10.get()
            android.text.style.ClickableSpan r10 = (android.text.style.ClickableSpan) r10
            boolean r10 = r8.equals(r10)
            if (r10 == 0) goto L181
            int r8 = r15.keyAt(r9)
            goto L18a
        L181:
            int r9 = r9 + 1
            goto L164
        L184:
            int r8 = defpackage.v2.d
            int r9 = r8 + 1
            defpackage.v2.d = r9
        L18a:
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
            r10 = r2[r1]
            r9.<init>(r10)
            r15.put(r8, r9)
            r9 = r2[r1]
            r10 = r13
            android.text.Spanned r10 = (android.text.Spanned) r10
            java.util.ArrayList r11 = r0.c(r3)
            int r12 = r10.getSpanStart(r9)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11.add(r12)
            java.util.ArrayList r11 = r0.c(r4)
            int r12 = r10.getSpanEnd(r9)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11.add(r12)
            java.util.ArrayList r11 = r0.c(r6)
            int r9 = r10.getSpanFlags(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r11.add(r9)
            java.util.ArrayList r9 = r0.c(r7)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9.add(r8)
            int r1 = r1 + 1
            goto L15e
        L1d4:
            r13 = 2131427942(0x7f0b0266, float:1.8477514E38)
            java.lang.Object r13 = r14.getTag(r13)
            java.util.List r13 = (java.util.List) r13
            if (r13 != 0) goto L1e1
            java.util.List r13 = java.util.Collections.EMPTY_LIST
        L1e1:
            int r14 = r13.size()
            if (r5 >= r14) goto L1f3
            java.lang.Object r14 = r13.get(r5)
            p2 r14 = (defpackage.p2) r14
            r0.b(r14)
            int r5 = r5 + 1
            goto L1e1
        L1f3:
            return
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            b2 r0 = r0.a
            r0.e(r1, r2)
            return
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(android.view.ViewGroup r1, android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r0 = this;
            b2 r0 = r0.a
            boolean r0 = r0.f(r1, r2, r3)
            return r0
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(android.view.View r1, int r2, android.os.Bundle r3) {
            r0 = this;
            b2 r0 = r0.a
            boolean r0 = r0.g(r1, r2, r3)
            return r0
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(android.view.View r1, int r2) {
            r0 = this;
            b2 r0 = r0.a
            r0.h(r1, r2)
            return
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            b2 r0 = r0.a
            r0.i(r1, r2)
            return
    }
}
