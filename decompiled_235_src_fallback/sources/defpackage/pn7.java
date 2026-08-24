package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pn7  reason: default package */
/* loaded from: classes.dex */
public final class pn7 implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.View.OnAttachStateChangeListener {
    public final java.util.WeakHashMap A;

    public pn7() {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r1.A = r0
            return
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L4f
            java.util.WeakHashMap r4 = r4.A
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L10:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L4f
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r2 = r0.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            boolean r3 = r1.isShown()
            if (r3 == 0) goto L3a
            int r3 = r1.getWindowVisibility()
            if (r3 != 0) goto L3a
            r3 = 1
            goto L3b
        L3a:
            r3 = 0
        L3b:
            if (r2 == r3) goto L10
            if (r3 == 0) goto L42
            r2 = 16
            goto L44
        L42:
            r2 = 32
        L44:
            defpackage.ao7.i(r1, r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r0.setValue(r1)
            goto L10
        L4f:
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r1.addOnGlobalLayoutListener(r0)
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r1) {
            r0 = this;
            return
    }
}
