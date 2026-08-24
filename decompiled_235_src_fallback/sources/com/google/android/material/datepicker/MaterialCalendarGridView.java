package com.google.android.material.datepicker;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class MaterialCalendarGridView extends android.widget.GridView {
    public final boolean A;

    public MaterialCalendarGridView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            r2 = 0
            defpackage.uj7.c(r2)
            android.content.Context r2 = r1.getContext()
            r3 = 16843277(0x101020d, float:2.369503E-38)
            boolean r2 = defpackage.k24.k(r2, r3)
            if (r2 == 0) goto L21
            r2 = 2131427484(0x7f0b009c, float:1.8476586E38)
            r1.setNextFocusLeftId(r2)
            r2 = 2131427509(0x7f0b00b5, float:1.8476636E38)
            r1.setNextFocusRightId(r2)
        L21:
            android.content.Context r2 = r1.getContext()
            r3 = 2130969594(0x7f0403fa, float:1.7547874E38)
            boolean r2 = defpackage.k24.k(r2, r3)
            r1.A = r2
            c24 r2 = new c24
            r3 = 2
            r2.<init>(r3)
            defpackage.ao7.n(r1, r2)
            return
    }

    public final defpackage.j74 a() {
            r0 = this;
            android.widget.ListAdapter r0 = super.getAdapter()
            j74 r0 = (defpackage.j74) r0
            return r0
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final android.widget.ListAdapter getAdapter() {
            r0 = this;
            android.widget.ListAdapter r0 = super.getAdapter()
            j74 r0 = (defpackage.j74) r0
            return r0
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter  reason: avoid collision after fix types in other method */
    public final android.widget.ListAdapter getAdapter2() {
            r0 = this;
            android.widget.ListAdapter r0 = super.getAdapter()
            j74 r0 = (defpackage.j74) r0
            return r0
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            android.widget.ListAdapter r0 = super.getAdapter()
            j74 r0 = (defpackage.j74) r0
            r0.notifyDataSetChanged()
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r3) {
            r2 = this;
            super.onDraw(r3)
            android.widget.ListAdapter r3 = super.getAdapter()
            j74 r3 = (defpackage.j74) r3
            r3.getClass()
            int r0 = r3.a()
            int r1 = r2.getFirstVisiblePosition()
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r3.c()
            int r2 = r2.getLastVisiblePosition()
            int r2 = java.lang.Math.min(r1, r2)
            r3.b(r0)
            r3.b(r2)
            r2 = 0
            throw r2
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean r1, int r2, android.graphics.Rect r3) {
            r0 = this;
            if (r1 == 0) goto L2b
            r1 = 33
            if (r2 != r1) goto L14
            android.widget.ListAdapter r1 = super.getAdapter()
            j74 r1 = (defpackage.j74) r1
            int r1 = r1.c()
            r0.setSelection(r1)
            return
        L14:
            r1 = 130(0x82, float:1.82E-43)
            if (r2 != r1) goto L26
            android.widget.ListAdapter r1 = super.getAdapter()
            j74 r1 = (defpackage.j74) r1
            int r1 = r1.a()
            r0.setSelection(r1)
            return
        L26:
            r1 = 1
            super.onFocusChanged(r1, r2, r3)
            return
        L2b:
            r1 = 0
            super.onFocusChanged(r1, r2, r3)
            return
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int r4, android.view.KeyEvent r5) {
            r3 = this;
            boolean r5 = super.onKeyDown(r4, r5)
            r0 = 0
            if (r5 != 0) goto L8
            return r0
        L8:
            int r5 = r3.getSelectedItemPosition()
            r1 = -1
            r2 = 1
            if (r5 == r1) goto L3c
            android.widget.ListAdapter r1 = super.getAdapter()
            j74 r1 = (defpackage.j74) r1
            int r1 = r1.a()
            if (r5 < r1) goto L29
            android.widget.ListAdapter r1 = super.getAdapter()
            j74 r1 = (defpackage.j74) r1
            int r1 = r1.c()
            if (r5 > r1) goto L29
            goto L3c
        L29:
            r5 = 19
            if (r5 != r4) goto L3b
            android.widget.ListAdapter r4 = super.getAdapter()
            j74 r4 = (defpackage.j74) r4
            int r4 = r4.a()
            r3.setSelection(r4)
            return r2
        L3b:
            return r0
        L3c:
            return r2
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.A
            if (r0 == 0) goto L1b
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            super.onMeasure(r2, r3)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            int r1 = r1.getMeasuredHeight()
            r2.height = r1
            return
        L1b:
            super.onMeasure(r2, r3)
            return
    }

    @Override // android.widget.AdapterView
    public final /* bridge */ /* synthetic */ void setAdapter(android.widget.ListAdapter r1) {
            r0 = this;
            android.widget.ListAdapter r1 = (android.widget.ListAdapter) r1
            r0.setAdapter2(r1)
            return
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    /* renamed from: setAdapter  reason: avoid collision after fix types in other method */
    public final void setAdapter2(android.widget.ListAdapter r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.j74
            if (r0 == 0) goto L8
            super.setAdapter(r2)
            return
        L8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.Class<com.google.android.material.datepicker.MaterialCalendarGridView> r2 = com.google.android.material.datepicker.MaterialCalendarGridView.class
            java.lang.String r2 = r2.getCanonicalName()
            java.lang.Class<j74> r0 = defpackage.j74.class
            java.lang.String r0 = r0.getCanonicalName()
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r0}
            java.lang.String r0 = "%1$s must have its Adapter set to a %2$s"
            java.lang.String r2 = java.lang.String.format(r0, r2)
            r1.<init>(r2)
            throw r1
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int r2) {
            r1 = this;
            android.widget.ListAdapter r0 = super.getAdapter()
            j74 r0 = (defpackage.j74) r0
            int r0 = r0.a()
            if (r2 >= r0) goto L1a
            android.widget.ListAdapter r2 = super.getAdapter()
            j74 r2 = (defpackage.j74) r2
            int r2 = r2.a()
            super.setSelection(r2)
            return
        L1a:
            super.setSelection(r2)
            return
    }
}
