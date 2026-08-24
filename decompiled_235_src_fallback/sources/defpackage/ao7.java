package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ao7  reason: default package */
/* loaded from: classes.dex */
public abstract class ao7 {
    public static java.util.WeakHashMap a = null;
    public static java.lang.reflect.Field b = null;
    public static boolean c = false;
    public static final int[] d = null;
    public static final defpackage.nn7 e = null;
    public static final defpackage.pn7 f = null;

    static {
            r0 = 32
            int[] r0 = new int[r0]
            r0 = {x0018: FILL_ARRAY_DATA  , data: [2131427345, 2131427346, 2131427357, 2131427368, 2131427371, 2131427372, 2131427373, 2131427374, 2131427375, 2131427376, 2131427347, 2131427348, 2131427349, 2131427350, 2131427351, 2131427352, 2131427353, 2131427354, 2131427355, 2131427356, 2131427358, 2131427359, 2131427360, 2131427361, 2131427362, 2131427363, 2131427364, 2131427365, 2131427366, 2131427367, 2131427369, 2131427370} // fill-array
            defpackage.ao7.d = r0
            nn7 r0 = new nn7
            r0.<init>()
            defpackage.ao7.e = r0
            pn7 r0 = new pn7
            r0.<init>()
            defpackage.ao7.f = r0
            return
    }

    public static void a(android.view.View r1, android.view.ViewGroup r2) {
            android.view.ViewGroupOverlay r0 = r2.getOverlay()
            r0.add(r1)
            android.view.ViewParent r1 = r1.getParent()
            android.view.View r1 = (android.view.View) r1
            r1.getClass()
            r0 = 2131428075(0x7f0b02eb, float:1.8477784E38)
            r1.setTag(r0, r2)
            return
    }

    public static defpackage.ip7 b(android.view.View r2) {
            java.util.WeakHashMap r0 = defpackage.ao7.a
            if (r0 != 0) goto Lb
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            defpackage.ao7.a = r0
        Lb:
            java.util.WeakHashMap r0 = defpackage.ao7.a
            java.lang.Object r0 = r0.get(r2)
            ip7 r0 = (defpackage.ip7) r0
            if (r0 != 0) goto L1f
            ip7 r0 = new ip7
            r0.<init>(r2)
            java.util.WeakHashMap r1 = defpackage.ao7.a
            r1.put(r2, r0)
        L1f:
            return r0
    }

    public static void c(android.view.View r2, defpackage.vu7 r3) {
            android.view.WindowInsets r3 = r3.f()
            if (r3 == 0) goto L1e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L11
            android.view.WindowInsets r0 = defpackage.xn7.a(r2, r3)
            goto L15
        L11:
            android.view.WindowInsets r0 = defpackage.qn7.a(r2, r3)
        L15:
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L1e
            defpackage.vu7.g(r2, r0)
        L1e:
            return
    }

    public static boolean d(android.view.View r8, android.view.KeyEvent r9) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L8
            goto Lb8
        L8:
            java.util.ArrayList r0 = defpackage.zn7.d
            r0 = 2131427954(0x7f0b0272, float:1.8477539E38)
            java.lang.Object r1 = r8.getTag(r0)
            zn7 r1 = (defpackage.zn7) r1
            if (r1 != 0) goto L24
            zn7 r1 = new zn7
            r1.<init>()
            r2 = 0
            r1.a = r2
            r1.b = r2
            r1.c = r2
            r8.setTag(r0, r1)
        L24:
            int r0 = r9.getAction()
            r2 = 1
            if (r0 != 0) goto L8a
            java.util.WeakHashMap r0 = r1.a
            if (r0 == 0) goto L32
            r0.clear()
        L32:
            java.util.ArrayList r0 = defpackage.zn7.d
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L3b
            goto L8a
        L3b:
            monitor-enter(r0)
            java.util.WeakHashMap r3 = r1.a     // Catch: java.lang.Throwable -> L48
            if (r3 != 0) goto L4a
            java.util.WeakHashMap r3 = new java.util.WeakHashMap     // Catch: java.lang.Throwable -> L48
            r3.<init>()     // Catch: java.lang.Throwable -> L48
            r1.a = r3     // Catch: java.lang.Throwable -> L48
            goto L4a
        L48:
            r8 = move-exception
            goto L88
        L4a:
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L48
            int r3 = r3 - r2
        L4f:
            if (r3 < 0) goto L86
            java.util.ArrayList r4 = defpackage.zn7.d     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r4.get(r3)     // Catch: java.lang.Throwable -> L48
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L48
            android.view.View r5 = (android.view.View) r5     // Catch: java.lang.Throwable -> L48
            if (r5 != 0) goto L65
            r4.remove(r3)     // Catch: java.lang.Throwable -> L48
            goto L83
        L65:
            java.util.WeakHashMap r4 = r1.a     // Catch: java.lang.Throwable -> L48
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L48
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> L48
            android.view.ViewParent r4 = r5.getParent()     // Catch: java.lang.Throwable -> L48
        L70:
            boolean r5 = r4 instanceof android.view.View     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L83
            java.util.WeakHashMap r5 = r1.a     // Catch: java.lang.Throwable -> L48
            r6 = r4
            android.view.View r6 = (android.view.View) r6     // Catch: java.lang.Throwable -> L48
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L48
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L48
            android.view.ViewParent r4 = r4.getParent()     // Catch: java.lang.Throwable -> L48
            goto L70
        L83:
            int r3 = r3 + (-1)
            goto L4f
        L86:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            goto L8a
        L88:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            throw r8
        L8a:
            android.view.View r8 = r1.a(r8)
            int r0 = r9.getAction()
            if (r0 != 0) goto Lb5
            int r9 = r9.getKeyCode()
            if (r8 == 0) goto Lb5
            boolean r0 = android.view.KeyEvent.isModifierKey(r9)
            if (r0 != 0) goto Lb5
            android.util.SparseArray r0 = r1.b
            if (r0 != 0) goto Lab
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.b = r0
        Lab:
            android.util.SparseArray r0 = r1.b
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r8)
            r0.put(r9, r1)
        Lb5:
            if (r8 == 0) goto Lb8
            return r2
        Lb8:
            r8 = 0
            return r8
    }

    public static android.view.View.AccessibilityDelegate e(android.view.View r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            android.view.View$AccessibilityDelegate r3 = defpackage.wn7.a(r3)
            return r3
        Lb:
            boolean r0 = defpackage.ao7.c
            if (r0 == 0) goto L10
            goto L35
        L10:
            java.lang.reflect.Field r0 = defpackage.ao7.b
            r1 = 1
            if (r0 != 0) goto L26
            java.lang.Class<android.view.View> r0 = android.view.View.class
            java.lang.String r2 = "mAccessibilityDelegate"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L23
            defpackage.ao7.b = r0     // Catch: java.lang.Throwable -> L23
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L23
            goto L26
        L23:
            defpackage.ao7.c = r1
            goto L35
        L26:
            java.lang.reflect.Field r0 = defpackage.ao7.b     // Catch: java.lang.Throwable -> L33
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L33
            boolean r0 = r3 instanceof android.view.View.AccessibilityDelegate     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L35
            android.view.View$AccessibilityDelegate r3 = (android.view.View.AccessibilityDelegate) r3     // Catch: java.lang.Throwable -> L33
            return r3
        L33:
            defpackage.ao7.c = r1
        L35:
            r3 = 0
            return r3
    }

    public static java.lang.CharSequence f(android.view.View r2) {
            r0 = 28
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r0) goto Lb
            java.lang.CharSequence r2 = defpackage.vn7.a(r2)
            goto L1c
        Lb:
            r0 = 2131427945(0x7f0b0269, float:1.847752E38)
            java.lang.Object r2 = r2.getTag(r0)
            java.lang.Class<java.lang.CharSequence> r0 = java.lang.CharSequence.class
            boolean r0 = r0.isInstance(r2)
            if (r0 == 0) goto L1b
            goto L1c
        L1b:
            r2 = 0
        L1c:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            return r2
    }

    public static java.util.ArrayList g(android.view.View r2) {
            r0 = 2131427942(0x7f0b0266, float:1.8477514E38)
            java.lang.Object r1 = r2.getTag(r0)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            if (r1 != 0) goto L13
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.setTag(r0, r1)
        L13:
            return r1
    }

    public static java.lang.String[] h(defpackage.kr r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            java.lang.String[] r2 = defpackage.yn7.a(r2)
            return r2
        Lb:
            r0 = 2131427949(0x7f0b026d, float:1.8477529E38)
            java.lang.Object r2 = r2.getTag(r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
            return r2
    }

    public static void i(android.view.View r5, int r6) {
            android.content.Context r0 = r5.getContext()
            java.lang.String r1 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            boolean r1 = r0.isEnabled()
            if (r1 != 0) goto L13
            goto L7e
        L13:
            java.lang.CharSequence r1 = f(r5)
            r2 = 1
            if (r1 == 0) goto L28
            boolean r1 = r5.isShown()
            if (r1 == 0) goto L28
            int r1 = r5.getWindowVisibility()
            if (r1 != 0) goto L28
            r1 = r2
            goto L29
        L28:
            r1 = 0
        L29:
            int r3 = r5.getAccessibilityLiveRegion()
            r4 = 32
            if (r3 != 0) goto L7f
            if (r1 == 0) goto L34
            goto L7f
        L34:
            if (r6 != r4) goto L58
            android.view.accessibility.AccessibilityEvent r1 = android.view.accessibility.AccessibilityEvent.obtain()
            r5.onInitializeAccessibilityEvent(r1)
            r1.setEventType(r4)
            r1.setContentChangeTypes(r6)
            r1.setSource(r5)
            r5.onPopulateAccessibilityEvent(r1)
            java.util.List r6 = r1.getText()
            java.lang.CharSequence r5 = f(r5)
            r6.add(r5)
            r0.sendAccessibilityEvent(r1)
            return
        L58:
            android.view.ViewParent r0 = r5.getParent()
            if (r0 == 0) goto L7e
            android.view.ViewParent r0 = r5.getParent()
            r0.notifySubtreeAccessibilityStateChanged(r5, r5, r6)     // Catch: java.lang.AbstractMethodError -> L66
            return
        L66:
            r6 = move-exception
            android.view.ViewParent r5 = r5.getParent()
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getSimpleName()
            java.lang.String r0 = " does not fully implement ViewParent"
            java.lang.String r5 = r5.concat(r0)
            java.lang.String r0 = "ViewCompat"
            android.util.Log.e(r0, r5, r6)
        L7e:
            return
        L7f:
            android.view.accessibility.AccessibilityEvent r0 = android.view.accessibility.AccessibilityEvent.obtain()
            if (r1 == 0) goto L86
            goto L88
        L86:
            r4 = 2048(0x800, float:2.87E-42)
        L88:
            r0.setEventType(r4)
            r0.setContentChangeTypes(r6)
            if (r1 == 0) goto La4
            java.util.List r6 = r0.getText()
            java.lang.CharSequence r1 = f(r5)
            r6.add(r1)
            int r6 = r5.getImportantForAccessibility()
            if (r6 != 0) goto La4
            r5.setImportantForAccessibility(r2)
        La4:
            r5.sendAccessibilityEventUnchecked(r0)
            return
    }

    public static defpackage.t31 j(android.view.View r3, defpackage.t31 r4) {
            r0 = 3
            java.lang.String r1 = "ViewCompat"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L3b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "performReceiveContent: "
            r0.<init>(r2)
            r0.append(r4)
            java.lang.String r2 = ", view="
            r0.append(r2)
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r0.append(r2)
            java.lang.String r2 = "["
            r0.append(r2)
            int r2 = r3.getId()
            r0.append(r2)
            java.lang.String r2 = "]"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L3b:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L46
            t31 r3 = defpackage.yn7.b(r3, r4)
            return r3
        L46:
            r0 = 2131427948(0x7f0b026c, float:1.8477527E38)
            java.lang.Object r0 = r3.getTag(r0)
            a57 r0 = (defpackage.a57) r0
            nn7 r1 = defpackage.ao7.e
            if (r0 == 0) goto L67
            t31 r4 = defpackage.a57.a(r3, r4)
            if (r4 != 0) goto L5b
            r3 = 0
            return r3
        L5b:
            boolean r0 = r3 instanceof defpackage.tl4
            if (r0 == 0) goto L62
            r1 = r3
            tl4 r1 = (defpackage.tl4) r1
        L62:
            t31 r3 = r1.a(r4)
            return r3
        L67:
            boolean r0 = r3 instanceof defpackage.tl4
            if (r0 == 0) goto L6e
            r1 = r3
            tl4 r1 = (defpackage.tl4) r1
        L6e:
            t31 r3 = r1.a(r4)
            return r3
    }

    public static void k(android.view.View r2, int r3) {
            java.util.ArrayList r2 = g(r2)
            r0 = 0
        L5:
            int r1 = r2.size()
            if (r0 >= r1) goto L1e
            java.lang.Object r1 = r2.get(r0)
            p2 r1 = (defpackage.p2) r1
            int r1 = r1.a()
            if (r1 != r3) goto L1b
            r2.remove(r0)
            return
        L1b:
            int r0 = r0 + 1
            goto L5
        L1e:
            return
    }

    public static void l(android.view.View r6, defpackage.p2 r7, defpackage.f3 r8) {
            p2 r0 = new p2
            int r2 = r7.b
            java.lang.Class r5 = r7.c
            r1 = 0
            r3 = 0
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            android.view.View$AccessibilityDelegate r7 = e(r6)
            if (r7 != 0) goto L14
            r7 = 0
            goto L23
        L14:
            boolean r8 = r7 instanceof defpackage.a2
            if (r8 == 0) goto L1d
            a2 r7 = (defpackage.a2) r7
            b2 r7 = r7.a
            goto L23
        L1d:
            b2 r8 = new b2
            r8.<init>(r7)
            r7 = r8
        L23:
            if (r7 != 0) goto L2a
            b2 r7 = new b2
            r7.<init>()
        L2a:
            n(r6, r7)
            int r7 = r0.a()
            k(r6, r7)
            java.util.ArrayList r7 = g(r6)
            r7.add(r0)
            r7 = 0
            i(r6, r7)
            return
    }

    public static void m(android.view.View r9, android.content.Context r10, int[] r11, android.util.AttributeSet r12, android.content.res.TypedArray r13, int r14) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L10
            r8 = 0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            defpackage.wn7.b(r2, r3, r4, r5, r6, r7, r8)
        L10:
            return
    }

    public static void n(android.view.View r1, defpackage.b2 r2) {
            if (r2 != 0) goto Lf
            android.view.View$AccessibilityDelegate r0 = e(r1)
            boolean r0 = r0 instanceof defpackage.a2
            if (r0 == 0) goto Lf
            b2 r2 = new b2
            r2.<init>()
        Lf:
            int r0 = r1.getImportantForAccessibility()
            if (r0 != 0) goto L19
            r0 = 1
            r1.setImportantForAccessibility(r0)
        L19:
            if (r2 != 0) goto L1d
            r2 = 0
            goto L1f
        L1d:
            a2 r2 = r2.B
        L1f:
            r1.setAccessibilityDelegate(r2)
            return
    }

    public static void o(android.view.View r6, java.lang.CharSequence r7) {
            on7 r0 = new on7
            r4 = 28
            r5 = 1
            r1 = 2131427945(0x7f0b0269, float:1.847752E38)
            java.lang.Class<java.lang.CharSequence> r2 = java.lang.CharSequence.class
            r3 = 8
            r0.<init>(r1, r2, r3, r4, r5)
            r0.f(r6, r7)
            pn7 r0 = defpackage.ao7.f
            if (r7 == 0) goto L3f
            java.util.WeakHashMap r7 = r0.A
            boolean r1 = r6.isShown()
            if (r1 == 0) goto L26
            int r1 = r6.getWindowVisibility()
            if (r1 != 0) goto L26
            r1 = 1
            goto L27
        L26:
            r1 = 0
        L27:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r7.put(r6, r1)
            r6.addOnAttachStateChangeListener(r0)
            boolean r7 = r6.isAttachedToWindow()
            if (r7 == 0) goto L3e
            android.view.ViewTreeObserver r6 = r6.getViewTreeObserver()
            r6.addOnGlobalLayoutListener(r0)
        L3e:
            return
        L3f:
            java.util.WeakHashMap r7 = r0.A
            r7.remove(r6)
            r6.removeOnAttachStateChangeListener(r0)
            android.view.ViewTreeObserver r6 = r6.getViewTreeObserver()
            r6.removeOnGlobalLayoutListener(r0)
            return
    }

    public static void p(android.view.View r3, defpackage.f55 r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            r2 = 0
            if (r0 < r1) goto L12
            if (r4 == 0) goto Le
            xt7 r2 = new xt7
            r2.<init>(r4)
        Le:
            defpackage.zm6.m(r3, r2)
            return
        L12:
            android.view.animation.PathInterpolator r0 = defpackage.wt7.e
            if (r4 == 0) goto L1b
            vt7 r2 = new vt7
            r2.<init>(r3, r4)
        L1b:
            r4 = 2131427956(0x7f0b0274, float:1.8477543E38)
            r3.setTag(r4, r2)
            r4 = 2131427946(0x7f0b026a, float:1.8477523E38)
            java.lang.Object r4 = r3.getTag(r4)
            if (r4 != 0) goto L36
            r4 = 2131427947(0x7f0b026b, float:1.8477525E38)
            java.lang.Object r4 = r3.getTag(r4)
            if (r4 != 0) goto L36
            r3.setOnApplyWindowInsetsListener(r2)
        L36:
            return
    }
}
