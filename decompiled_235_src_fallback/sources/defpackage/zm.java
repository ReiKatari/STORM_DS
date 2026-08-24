package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zm  reason: default package */
/* loaded from: classes.dex */
public final class zm extends android.view.ViewGroup {
    public final java.util.HashMap A;
    public final java.util.HashMap B;

    public zm(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.setClipChildren(r1)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.A = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.B = r1
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            r0 = 1
            return r0
    }

    public final java.util.HashMap<java.lang.Object, defpackage.sm3> getHolderToLayoutNode() {
            r0 = this;
            java.util.HashMap r0 = r0.A
            return r0
    }

    public final java.util.HashMap<defpackage.sm3, java.lang.Object> getLayoutNodeToHolder() {
            r0 = this;
            java.util.HashMap r0 = r0.B
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ android.view.ViewParent invalidateChildInParent(int[] r1, android.graphics.Rect r2) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(android.view.View r1, android.view.View r2) {
            r0 = this;
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            java.util.HashMap r0 = r0.A
            java.util.Set r0 = r0.keySet()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L13
            return
        L13:
            java.lang.ClassCastException r0 = defpackage.i61.j(r0)
            throw r0
    }

    @Override // android.view.View
    public final void onMeasure(int r3, int r4) {
            r2 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r3)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L9
            goto Le
        L9:
            java.lang.String r0 = "widthMeasureSpec should be EXACTLY"
            defpackage.p53.a(r0)
        Le:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            if (r0 != r1) goto L15
            goto L1a
        L15:
            java.lang.String r0 = "heightMeasureSpec should be EXACTLY"
            defpackage.p53.a(r0)
        L1a:
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r2.setMeasuredDimension(r3, r4)
            java.util.HashMap r2 = r2.A
            java.util.Set r2 = r2.keySet()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
            boolean r3 = r2.hasNext()
            if (r3 != 0) goto L38
            return
        L38:
            java.lang.ClassCastException r2 = defpackage.i61.j(r2)
            throw r2
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
            r5 = this;
            r5.cleanupLayoutState(r5)
            int r0 = r5.getChildCount()
            r1 = 0
            r2 = r1
        L9:
            if (r2 >= r0) goto L26
            android.view.View r3 = r5.getChildAt(r2)
            java.util.HashMap r4 = r5.A
            java.lang.Object r4 = r4.get(r3)
            sm3 r4 = (defpackage.sm3) r4
            boolean r3 = r3.isLayoutRequested()
            if (r3 == 0) goto L23
            if (r4 == 0) goto L23
            r3 = 7
            defpackage.sm3.V(r4, r1, r3)
        L23:
            int r2 = r2 + 1
            goto L9
        L26:
            return
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
            r0 = this;
            r0 = 0
            return r0
    }
}
