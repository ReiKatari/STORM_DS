package androidx.appcompat.widget;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class ViewStubCompat extends android.view.View {
    public int A;
    public int B;
    public java.lang.ref.WeakReference L;
    public android.view.LayoutInflater R;

    public ViewStubCompat(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r0 = 0
            r3.<init>(r4, r5, r0)
            r3.A = r0
            int[] r1 = defpackage.m75.B
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r0)
            r5 = 2
            r1 = -1
            int r5 = r4.getResourceId(r5, r1)
            r3.B = r5
            r5 = 1
            int r2 = r4.getResourceId(r5, r0)
            r3.A = r2
            int r0 = r4.getResourceId(r0, r1)
            r3.setId(r0)
            r4.recycle()
            r4 = 8
            r3.setVisibility(r4)
            r3.setWillNotDraw(r5)
            return
    }

    public final android.view.View a() {
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            r2 = 0
            if (r1 == 0) goto L4d
            int r1 = r4.A
            if (r1 == 0) goto L47
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.LayoutInflater r1 = r4.R
            if (r1 == 0) goto L14
            goto L1c
        L14:
            android.content.Context r1 = r4.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
        L1c:
            int r2 = r4.A
            r3 = 0
            android.view.View r1 = r1.inflate(r2, r0, r3)
            int r2 = r4.B
            r3 = -1
            if (r2 == r3) goto L2b
            r1.setId(r2)
        L2b:
            int r2 = r0.indexOfChild(r4)
            r0.removeViewInLayout(r4)
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            if (r3 == 0) goto L3c
            r0.addView(r1, r2, r3)
            goto L3f
        L3c:
            r0.addView(r1, r2)
        L3f:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r4.L = r0
            return r1
        L47:
            java.lang.String r4 = "ViewStub must have a valid layoutResource"
            defpackage.i.h(r4)
            return r2
        L4d:
            java.lang.String r4 = "ViewStub must have a non-null ViewGroup viewParent"
            defpackage.i.m(r4)
            return r2
    }

    @Override // android.view.View
    public final void dispatchDraw(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    public int getInflatedId() {
            r0 = this;
            int r0 = r0.B
            return r0
    }

    public android.view.LayoutInflater getLayoutInflater() {
            r0 = this;
            android.view.LayoutInflater r0 = r0.R
            return r0
    }

    public int getLayoutResource() {
            r0 = this;
            int r0 = r0.A
            return r0
    }

    @Override // android.view.View
    public final void onMeasure(int r1, int r2) {
            r0 = this;
            r1 = 0
            r0.setMeasuredDimension(r1, r1)
            return
    }

    public void setInflatedId(int r1) {
            r0 = this;
            r0.B = r1
            return
    }

    public void setLayoutInflater(android.view.LayoutInflater r1) {
            r0 = this;
            r0.R = r1
            return
    }

    public void setLayoutResource(int r1) {
            r0 = this;
            r0.A = r1
            return
    }

    public void setOnInflateListener(defpackage.rp7 r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public void setVisibility(int r2) {
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.L
            if (r0 == 0) goto L16
            java.lang.Object r1 = r0.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L10
            r1.setVisibility(r2)
            return
        L10:
            java.lang.String r1 = "setVisibility called on un-referenced view"
            defpackage.i.m(r1)
            return
        L16:
            super.setVisibility(r2)
            if (r2 == 0) goto L20
            r0 = 4
            if (r2 != r0) goto L1f
            goto L20
        L1f:
            return
        L20:
            r1.a()
            return
    }
}
