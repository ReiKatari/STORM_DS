package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b2  reason: default package */
/* loaded from: classes.dex */
public class b2 {
    public static final android.view.View.AccessibilityDelegate L = null;
    public final android.view.View.AccessibilityDelegate A;
    public final defpackage.a2 B;

    static {
            android.view.View$AccessibilityDelegate r0 = new android.view.View$AccessibilityDelegate
            r0.<init>()
            defpackage.b2.L = r0
            return
    }

    public b2() {
            r1 = this;
            android.view.View$AccessibilityDelegate r0 = defpackage.b2.L
            r1.<init>(r0)
            return
    }

    public b2(android.view.View.AccessibilityDelegate r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            a2 r1 = new a2
            r1.<init>(r0)
            r0.B = r1
            return
    }

    public boolean a(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            android.view.View$AccessibilityDelegate r0 = r0.A
            boolean r0 = r0.dispatchPopulateAccessibilityEvent(r1, r2)
            return r0
    }

    public defpackage.os0 b(android.view.View r2) {
            r1 = this;
            android.view.View$AccessibilityDelegate r1 = r1.A
            android.view.accessibility.AccessibilityNodeProvider r1 = r1.getAccessibilityNodeProvider(r2)
            if (r1 == 0) goto Lf
            os0 r2 = new os0
            r0 = 4
            r2.<init>(r1, r0)
            return r2
        Lf:
            r1 = 0
            return r1
    }

    public void c(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            android.view.View$AccessibilityDelegate r0 = r0.A
            r0.onInitializeAccessibilityEvent(r1, r2)
            return
    }

    public void d(android.view.View r1, defpackage.v2 r2) {
            r0 = this;
            android.view.View$AccessibilityDelegate r0 = r0.A
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.a
            r0.onInitializeAccessibilityNodeInfo(r1, r2)
            return
    }

    public void e(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            android.view.View$AccessibilityDelegate r0 = r0.A
            r0.onPopulateAccessibilityEvent(r1, r2)
            return
    }

    public boolean f(android.view.ViewGroup r1, android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r0 = this;
            android.view.View$AccessibilityDelegate r0 = r0.A
            boolean r0 = r0.onRequestSendAccessibilityEvent(r1, r2, r3)
            return r0
    }

    public boolean g(android.view.View r7, int r8, android.os.Bundle r9) {
            r6 = this;
            r0 = 2131427942(0x7f0b0266, float:1.8477514E38)
            java.lang.Object r0 = r7.getTag(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto Ld
            java.util.List r0 = java.util.Collections.EMPTY_LIST
        Ld:
            r1 = 0
            r2 = r1
        Lf:
            int r3 = r0.size()
            r4 = 0
            if (r2 >= r3) goto L55
            java.lang.Object r3 = r0.get(r2)
            p2 r3 = (defpackage.p2) r3
            int r5 = r3.a()
            if (r5 != r8) goto L52
            java.lang.Class r0 = r3.c
            f3 r2 = r3.d
            if (r2 == 0) goto L55
            if (r0 != 0) goto L2b
            goto L4d
        L2b:
            java.lang.reflect.Constructor r3 = r0.getDeclaredConstructor(r4)     // Catch: java.lang.Exception -> L36
            java.lang.Object r3 = r3.newInstance(r4)     // Catch: java.lang.Exception -> L36
            if (r3 != 0) goto L38
            throw r4     // Catch: java.lang.Exception -> L36
        L36:
            r3 = move-exception
            goto L3e
        L38:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException     // Catch: java.lang.Exception -> L36
            r3.<init>()     // Catch: java.lang.Exception -> L36
            throw r3     // Catch: java.lang.Exception -> L36
        L3e:
            java.lang.String r0 = r0.getName()
            java.lang.String r5 = "Failed to execute command with argument class ViewCommandArgument: "
            java.lang.String r0 = r5.concat(r0)
            java.lang.String r5 = "A11yActionCompat"
            android.util.Log.e(r5, r0, r3)
        L4d:
            boolean r0 = r2.c(r7)
            goto L56
        L52:
            int r2 = r2 + 1
            goto Lf
        L55:
            r0 = r1
        L56:
            if (r0 != 0) goto L5e
            android.view.View$AccessibilityDelegate r6 = r6.A
            boolean r0 = r6.performAccessibilityAction(r7, r8, r9)
        L5e:
            if (r0 != 0) goto Lbc
            r6 = 2131427344(0x7f0b0010, float:1.8476302E38)
            if (r8 != r6) goto Lbc
            if (r9 == 0) goto Lbc
            java.lang.String r6 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            r8 = -1
            int r6 = r9.getInt(r6, r8)
            r8 = 2131427943(0x7f0b0267, float:1.8477517E38)
            java.lang.Object r8 = r7.getTag(r8)
            android.util.SparseArray r8 = (android.util.SparseArray) r8
            if (r8 == 0) goto Lbb
            java.lang.Object r6 = r8.get(r6)
            java.lang.ref.WeakReference r6 = (java.lang.ref.WeakReference) r6
            if (r6 == 0) goto Lbb
            java.lang.Object r6 = r6.get()
            android.text.style.ClickableSpan r6 = (android.text.style.ClickableSpan) r6
            if (r6 == 0) goto Lbb
            android.view.accessibility.AccessibilityNodeInfo r8 = r7.createAccessibilityNodeInfo()
            java.lang.CharSequence r8 = r8.getText()
            boolean r9 = r8 instanceof android.text.Spanned
            if (r9 == 0) goto La5
            r9 = r8
            android.text.Spanned r9 = (android.text.Spanned) r9
            int r8 = r8.length()
            java.lang.Class<android.text.style.ClickableSpan> r0 = android.text.style.ClickableSpan.class
            java.lang.Object[] r8 = r9.getSpans(r1, r8, r0)
            r4 = r8
            android.text.style.ClickableSpan[] r4 = (android.text.style.ClickableSpan[]) r4
        La5:
            r8 = r1
        La6:
            if (r4 == 0) goto Lbb
            int r9 = r4.length
            if (r8 >= r9) goto Lbb
            r9 = r4[r8]
            boolean r9 = r6.equals(r9)
            if (r9 == 0) goto Lb8
            r6.onClick(r7)
            r1 = 1
            goto Lbb
        Lb8:
            int r8 = r8 + 1
            goto La6
        Lbb:
            r0 = r1
        Lbc:
            return r0
    }

    public void h(android.view.View r1, int r2) {
            r0 = this;
            android.view.View$AccessibilityDelegate r0 = r0.A
            r0.sendAccessibilityEvent(r1, r2)
            return
    }

    public void i(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            android.view.View$AccessibilityDelegate r0 = r0.A
            r0.sendAccessibilityEventUnchecked(r1, r2)
            return
    }
}
