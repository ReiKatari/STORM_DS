package androidx.fragment.app;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class FragmentContainerView extends android.widget.FrameLayout {
    public final java.util.ArrayList A;
    public final java.util.ArrayList B;
    public android.view.View.OnApplyWindowInsetsListener L;
    public boolean R;

    public FragmentContainerView(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r4.getClass()
            r0 = 0
            r3.<init>(r4, r5, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.A = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.B = r1
            r1 = 1
            r3.R = r1
            if (r5 == 0) goto L5c
            java.lang.String r1 = r5.getClassAttribute()
            int[] r2 = defpackage.h75.b
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r0, r0)
            if (r1 != 0) goto L2d
            java.lang.String r1 = r4.getString(r0)
            java.lang.String r5 = "android:name"
            goto L2f
        L2d:
            java.lang.String r5 = "class"
        L2f:
            r4.recycle()
            if (r1 == 0) goto L5c
            boolean r3 = r3.isInEditMode()
            if (r3 == 0) goto L3b
            goto L5c
        L3b:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "FragmentContainerView must be within a FragmentActivity to use "
            r4.<init>(r0)
            r4.append(r5)
            java.lang.String r5 = "=\""
            r4.append(r5)
            r4.append(r1)
            r5 = 34
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L5c:
            return
    }

    public FragmentContainerView(android.content.Context r8, android.util.AttributeSet r9, androidx.fragment.app.u r10) {
            r7 = this;
            r8.getClass()
            r9.getClass()
            r7.<init>(r8, r9)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.A = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.B = r0
            r0 = 1
            r7.R = r0
            java.lang.String r1 = r9.getClassAttribute()
            int[] r2 = defpackage.h75.b
            r3 = 0
            android.content.res.TypedArray r2 = r8.obtainStyledAttributes(r9, r2, r3, r3)
            if (r1 != 0) goto L2b
            java.lang.String r1 = r2.getString(r3)
        L2b:
            java.lang.String r4 = r2.getString(r0)
            r2.recycle()
            int r2 = r7.getId()
            androidx.fragment.app.o r5 = r10.C(r2)
            if (r1 == 0) goto L98
            if (r5 != 0) goto L98
            r5 = -1
            r6 = 0
            if (r2 != r5) goto L57
            if (r4 == 0) goto L4b
            java.lang.String r7 = " with tag "
            java.lang.String r7 = r7.concat(r4)
            goto L4d
        L4b:
            java.lang.String r7 = ""
        L4d:
            java.lang.String r8 = "FragmentContainerView must have an android:id to add Fragment "
            java.lang.String r7 = defpackage.lb1.A(r8, r1, r7)
            defpackage.i.m(r7)
            throw r6
        L57:
            gl2 r5 = r10.H()
            r8.getClassLoader()
            androidx.fragment.app.o r1 = r5.a(r1)
            r1.getClass()
            r1.mFragmentId = r2
            r1.mContainerId = r2
            r1.mTag = r4
            r1.mFragmentManager = r10
            cl2 r2 = r10.w
            r1.mHost = r2
            r1.onInflate(r8, r9, r6)
            androidx.fragment.app.a r8 = new androidx.fragment.app.a
            r8.<init>(r10)
            r8.r = r0
            r1.mContainer = r7
            r1.mInDynamicContainer = r0
            int r9 = r7.getId()
            r8.d(r9, r1, r4, r0)
            boolean r9 = r8.i
            if (r9 != 0) goto L92
            r8.j = r3
            androidx.fragment.app.u r9 = r8.t
            r9.A(r8, r0)
            goto L98
        L92:
            java.lang.String r7 = "This transaction is already being added to the back stack"
            defpackage.i.m(r7)
            throw r6
        L98:
            androidx.fragment.app.y r8 = r10.c
            java.util.ArrayList r8 = r8.d()
            int r9 = r8.size()
        La2:
            if (r3 >= r9) goto Lc9
            java.lang.Object r10 = r8.get(r3)
            int r3 = r3 + 1
            androidx.fragment.app.x r10 = (androidx.fragment.app.x) r10
            androidx.fragment.app.o r0 = r10.c
            int r1 = r0.mContainerId
            int r2 = r7.getId()
            if (r1 != r2) goto La2
            android.view.View r1 = r0.mView
            if (r1 == 0) goto La2
            android.view.ViewParent r1 = r1.getParent()
            if (r1 != 0) goto La2
            r0.mContainer = r7
            r10.b()
            r10.k()
            goto La2
        Lc9:
            return
    }

    public final void a(android.view.View r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.B
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto Ld
            java.util.ArrayList r1 = r1.A
            r1.add(r2)
        Ld:
            return
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r3, int r4, android.view.ViewGroup.LayoutParams r5) {
            r2 = this;
            r3.getClass()
            r0 = 2131427594(0x7f0b010a, float:1.8476809E38)
            java.lang.Object r0 = r3.getTag(r0)
            boolean r1 = r0 instanceof androidx.fragment.app.o
            if (r1 == 0) goto L11
            androidx.fragment.app.o r0 = (androidx.fragment.app.o) r0
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L18
            super.addView(r3, r4, r5)
            return
        L18:
            java.lang.String r2 = "Views added to a FragmentContainerView must be associated with a Fragment. View "
            java.lang.String r4 = " is not associated with a Fragment."
            defpackage.e41.g(r3, r4, r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final android.view.WindowInsets dispatchApplyWindowInsets(android.view.WindowInsets r5) {
            r4 = this;
            r5.getClass()
            r0 = 0
            vu7 r1 = defpackage.vu7.g(r0, r5)
            android.view.View$OnApplyWindowInsetsListener r2 = r4.L
            if (r2 == 0) goto L18
            android.view.WindowInsets r1 = r2.onApplyWindowInsets(r4, r5)
            r1.getClass()
            vu7 r0 = defpackage.vu7.g(r0, r1)
            goto L2b
        L18:
            java.util.WeakHashMap r0 = defpackage.ao7.a
            android.view.WindowInsets r0 = r1.f()
            if (r0 == 0) goto L2a
            boolean r2 = r0.equals(r0)
            if (r2 != 0) goto L2a
            vu7 r1 = defpackage.vu7.g(r4, r0)
        L2a:
            r0 = r1
        L2b:
            ru7 r1 = r0.a
            boolean r1 = r1.r()
            if (r1 != 0) goto L44
            int r1 = r4.getChildCount()
            r2 = 0
        L38:
            if (r2 >= r1) goto L44
            android.view.View r3 = r4.getChildAt(r2)
            defpackage.ao7.c(r3, r0)
            int r2 = r2 + 1
            goto L38
        L44:
            return r5
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(android.graphics.Canvas r7) {
            r6 = this;
            r7.getClass()
            boolean r0 = r6.R
            if (r0 == 0) goto L20
            java.util.ArrayList r0 = r6.A
            int r1 = r0.size()
            r2 = 0
        Le:
            if (r2 >= r1) goto L20
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            android.view.View r3 = (android.view.View) r3
            long r4 = r6.getDrawingTime()
            super.drawChild(r7, r3, r4)
            goto Le
        L20:
            super.dispatchDraw(r7)
            return
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(android.graphics.Canvas r3, android.view.View r4, long r5) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            boolean r0 = r2.R
            if (r0 == 0) goto L1a
            java.util.ArrayList r0 = r2.A
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L1a
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L1a
            r2 = 0
            return r2
        L1a:
            boolean r2 = super.drawChild(r3, r4, r5)
            return r2
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(android.view.View r2) {
            r1 = this;
            r2.getClass()
            java.util.ArrayList r0 = r1.B
            r0.remove(r2)
            java.util.ArrayList r0 = r1.A
            boolean r0 = r0.remove(r2)
            if (r0 == 0) goto L13
            r0 = 1
            r1.R = r0
        L13:
            super.endViewTransition(r2)
            return
    }

    public final <F extends androidx.fragment.app.o> F getFragment() {
            r4 = this;
            r0 = r4
        L1:
            r1 = 0
            if (r0 == 0) goto L23
            r2 = 2131427594(0x7f0b010a, float:1.8476809E38)
            java.lang.Object r2 = r0.getTag(r2)
            boolean r3 = r2 instanceof androidx.fragment.app.o
            if (r3 == 0) goto L12
            androidx.fragment.app.o r2 = (androidx.fragment.app.o) r2
            goto L13
        L12:
            r2 = r1
        L13:
            if (r2 == 0) goto L16
            goto L24
        L16:
            android.view.ViewParent r0 = r0.getParent()
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L21
            android.view.View r0 = (android.view.View) r0
            goto L1
        L21:
            r0 = r1
            goto L1
        L23:
            r2 = r1
        L24:
            if (r2 == 0) goto L52
            boolean r0 = r2.isAdded()
            if (r0 == 0) goto L31
            androidx.fragment.app.u r0 = r2.getChildFragmentManager()
            goto L6f
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "The Fragment "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r2 = " that owns View "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " has already been destroyed. Nested fragments should always use the child FragmentManager."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L52:
            android.content.Context r0 = r4.getContext()
        L56:
            boolean r2 = r0 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L68
            boolean r2 = r0 instanceof androidx.fragment.app.p
            if (r2 == 0) goto L61
            androidx.fragment.app.p r0 = (androidx.fragment.app.p) r0
            goto L69
        L61:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L56
        L68:
            r0 = r1
        L69:
            if (r0 == 0) goto L78
            ll2 r0 = r0.t()
        L6f:
            int r4 = r4.getId()
            androidx.fragment.app.o r4 = r0.C(r4)
            return r4
        L78:
            java.lang.String r0 = "View "
            java.lang.String r2 = " is not within a subclass of FragmentActivity."
            defpackage.e41.o(r4, r2, r0)
            return r1
    }

    @Override // android.view.View
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r1) {
            r0 = this;
            r1.getClass()
            return r1
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
            r2 = this;
            int r0 = r2.getChildCount()
            int r0 = r0 + (-1)
        L6:
            r1 = -1
            if (r1 >= r0) goto L16
            android.view.View r1 = r2.getChildAt(r0)
            r1.getClass()
            r2.a(r1)
            int r0 = r0 + (-1)
            goto L6
        L16:
            super.removeAllViewsInLayout()
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(android.view.View r1) {
            r0 = this;
            r1.getClass()
            r0.a(r1)
            super.removeView(r1)
            return
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int r2) {
            r1 = this;
            android.view.View r0 = r1.getChildAt(r2)
            r0.getClass()
            r1.a(r0)
            super.removeViewAt(r2)
            return
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(android.view.View r1) {
            r0 = this;
            r1.getClass()
            r0.a(r1)
            super.removeViewInLayout(r1)
            return
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int r4, int r5) {
            r3 = this;
            int r0 = r4 + r5
            r1 = r4
        L3:
            if (r1 >= r0) goto L12
            android.view.View r2 = r3.getChildAt(r1)
            r2.getClass()
            r3.a(r2)
            int r1 = r1 + 1
            goto L3
        L12:
            super.removeViews(r4, r5)
            return
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int r4, int r5) {
            r3 = this;
            int r0 = r4 + r5
            r1 = r4
        L3:
            if (r1 >= r0) goto L12
            android.view.View r2 = r3.getChildAt(r1)
            r2.getClass()
            r3.a(r2)
            int r1 = r1 + 1
            goto L3
        L12:
            super.removeViewsInLayout(r4, r5)
            return
    }

    public final void setDrawDisappearingViewsLast(boolean r1) {
            r0 = this;
            r0.R = r1
            return
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(android.animation.LayoutTransition r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\"."
            r0.<init>(r1)
            throw r0
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(android.view.View.OnApplyWindowInsetsListener r1) {
            r0 = this;
            r0.L = r1
            return
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(android.view.View r2) {
            r1 = this;
            r2.getClass()
            android.view.ViewParent r0 = r2.getParent()
            if (r0 != r1) goto Le
            java.util.ArrayList r0 = r1.B
            r0.add(r2)
        Le:
            super.startViewTransition(r2)
            return
    }
}
