package androidx.fragment.app;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class x {
    public final defpackage.yc1 a;
    public final androidx.fragment.app.y b;
    public final androidx.fragment.app.o c;
    public boolean d;
    public int e;

    public x(defpackage.yc1 r2, androidx.fragment.app.y r3, androidx.fragment.app.o r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.d = r0
            r0 = -1
            r1.e = r0
            r1.a = r2
            r1.b = r3
            r1.c = r4
            return
    }

    public x(defpackage.yc1 r3, androidx.fragment.app.y r4, androidx.fragment.app.o r5, android.os.Bundle r6) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.d = r0
            r1 = -1
            r2.e = r1
            r2.a = r3
            r2.b = r4
            r2.c = r5
            r2 = 0
            r5.mSavedViewState = r2
            r5.mSavedViewRegistryState = r2
            r5.mBackStackNesting = r0
            r5.mInLayout = r0
            r5.mAdded = r0
            androidx.fragment.app.o r3 = r5.mTarget
            if (r3 == 0) goto L21
            java.lang.String r3 = r3.mWho
            goto L22
        L21:
            r3 = r2
        L22:
            r5.mTargetWho = r3
            r5.mTarget = r2
            r5.mSavedFragmentState = r6
            java.lang.String r2 = "arguments"
            android.os.Bundle r2 = r6.getBundle(r2)
            r5.mArguments = r2
            return
    }

    public x(defpackage.yc1 r2, androidx.fragment.app.y r3, java.lang.ClassLoader r4, defpackage.gl2 r5, android.os.Bundle r6) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.d = r0
            r0 = -1
            r1.e = r0
            r1.a = r2
            r1.b = r3
            java.lang.String r2 = "state"
            android.os.Parcelable r2 = r6.getParcelable(r2)
            androidx.fragment.app.w r2 = (androidx.fragment.app.w) r2
            java.lang.String r3 = r2.A
            androidx.fragment.app.o r3 = r5.a(r3)
            java.lang.String r5 = r2.B
            r3.mWho = r5
            boolean r5 = r2.L
            r3.mFromLayout = r5
            boolean r5 = r2.R
            r3.mInDynamicContainer = r5
            r5 = 1
            r3.mRestored = r5
            int r5 = r2.X
            r3.mFragmentId = r5
            int r5 = r2.Y
            r3.mContainerId = r5
            java.lang.String r5 = r2.Z
            r3.mTag = r5
            boolean r5 = r2.d0
            r3.mRetainInstance = r5
            boolean r5 = r2.e0
            r3.mRemoving = r5
            boolean r5 = r2.f0
            r3.mDetached = r5
            boolean r5 = r2.g0
            r3.mHidden = r5
            tt3[] r5 = defpackage.tt3.values()
            int r0 = r2.h0
            r5 = r5[r0]
            r3.mMaxState = r5
            java.lang.String r5 = r2.i0
            r3.mTargetWho = r5
            int r5 = r2.j0
            r3.mTargetRequestCode = r5
            boolean r2 = r2.k0
            r3.mUserVisibleHint = r2
            r1.c = r3
            r3.mSavedFragmentState = r6
            java.lang.String r1 = "arguments"
            android.os.Bundle r1 = r6.getBundle(r1)
            if (r1 == 0) goto L6b
            r1.setClassLoader(r4)
        L6b:
            r3.setArguments(r1)
            r1 = 2
            boolean r1 = androidx.fragment.app.u.K(r1)
            if (r1 == 0) goto L88
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Instantiated fragment "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.v(r2, r1)
        L88:
            return
    }

    public final void a() {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.u.K(r0)
            androidx.fragment.app.o r1 = r3.c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "moveto ACTIVITY_CREATED: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r0)
        L1c:
            android.os.Bundle r0 = r1.mSavedFragmentState
            if (r0 == 0) goto L27
            java.lang.String r2 = "savedInstanceState"
            android.os.Bundle r0 = r0.getBundle(r2)
            goto L28
        L27:
            r0 = 0
        L28:
            r1.performActivityCreated(r0)
            yc1 r3 = r3.a
            r0 = 0
            r3.p(r1, r0)
            return
    }

    public final void b() {
            r7 = this;
            androidx.fragment.app.o r0 = r7.c
            android.view.ViewGroup r1 = r0.mContainer
        L4:
            r2 = 0
            if (r1 == 0) goto L27
            r3 = 2131427594(0x7f0b010a, float:1.8476809E38)
            java.lang.Object r3 = r1.getTag(r3)
            boolean r4 = r3 instanceof androidx.fragment.app.o
            if (r4 == 0) goto L15
            androidx.fragment.app.o r3 = (androidx.fragment.app.o) r3
            goto L16
        L15:
            r3 = r2
        L16:
            if (r3 == 0) goto L1a
            r2 = r3
            goto L27
        L1a:
            android.view.ViewParent r1 = r1.getParent()
            boolean r3 = r1 instanceof android.view.View
            if (r3 == 0) goto L25
            android.view.View r1 = (android.view.View) r1
            goto L4
        L25:
            r1 = r2
            goto L4
        L27:
            androidx.fragment.app.o r1 = r0.getParentFragment()
            if (r2 == 0) goto L65
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L65
            int r1 = r0.mContainerId
            sl2 r3 = defpackage.tl2.a
            pl2 r3 = new pl2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Attempting to nest fragment "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r5 = " within the view of parent fragment "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = " via container with ID "
            r4.append(r2)
            java.lang.String r2 = " without using parent's childFragmentManager"
            java.lang.String r1 = defpackage.lb1.o(r4, r1, r2)
            r3.<init>(r0, r1)
            defpackage.tl2.b(r3)
            sl2 r1 = defpackage.tl2.a(r0)
            r1.getClass()
            rl2 r1 = defpackage.rl2.PENALTY_LOG
        L65:
            androidx.fragment.app.y r7 = r7.b
            java.util.ArrayList r7 = r7.a
            android.view.ViewGroup r1 = r0.mContainer
            r2 = -1
            if (r1 != 0) goto L6f
            goto Lab
        L6f:
            int r3 = r7.indexOf(r0)
            int r4 = r3 + (-1)
        L75:
            if (r4 < 0) goto L8f
            java.lang.Object r5 = r7.get(r4)
            androidx.fragment.app.o r5 = (androidx.fragment.app.o) r5
            android.view.ViewGroup r6 = r5.mContainer
            if (r6 != r1) goto L8c
            android.view.View r5 = r5.mView
            if (r5 == 0) goto L8c
            int r7 = r1.indexOfChild(r5)
            int r2 = r7 + 1
            goto Lab
        L8c:
            int r4 = r4 + (-1)
            goto L75
        L8f:
            int r3 = r3 + 1
            int r4 = r7.size()
            if (r3 >= r4) goto Lab
            java.lang.Object r4 = r7.get(r3)
            androidx.fragment.app.o r4 = (androidx.fragment.app.o) r4
            android.view.ViewGroup r5 = r4.mContainer
            if (r5 != r1) goto Laa
            android.view.View r4 = r4.mView
            if (r4 == 0) goto Laa
            int r2 = r1.indexOfChild(r4)
            goto Lab
        Laa:
            goto L8f
        Lab:
            android.view.ViewGroup r7 = r0.mContainer
            android.view.View r0 = r0.mView
            r7.addView(r0, r2)
            return
    }

    public final void c() {
            r7 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.u.K(r0)
            androidx.fragment.app.o r1 = r7.c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "moveto ATTACHED: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r0)
        L1c:
            androidx.fragment.app.o r0 = r1.mTarget
            r2 = 0
            java.lang.String r3 = " that does not belong to this FragmentManager!"
            java.lang.String r4 = " declared target fragment "
            java.lang.String r5 = "Fragment "
            androidx.fragment.app.y r6 = r7.b
            if (r0 == 0) goto L5c
            java.lang.String r0 = r0.mWho
            java.util.HashMap r6 = r6.b
            java.lang.Object r0 = r6.get(r0)
            androidx.fragment.app.x r0 = (androidx.fragment.app.x) r0
            if (r0 == 0) goto L3f
            androidx.fragment.app.o r3 = r1.mTarget
            java.lang.String r3 = r3.mWho
            r1.mTargetWho = r3
            r1.mTarget = r2
            r2 = r0
            goto L81
        L3f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r0.append(r1)
            androidx.fragment.app.o r1 = r1.mTarget
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L5c:
            java.lang.String r0 = r1.mTargetWho
            if (r0 == 0) goto L81
            java.util.HashMap r2 = r6.b
            java.lang.Object r0 = r2.get(r0)
            r2 = r0
            androidx.fragment.app.x r2 = (androidx.fragment.app.x) r2
            if (r2 == 0) goto L6c
            goto L81
        L6c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r5)
            r7.append(r1)
            r7.append(r4)
            java.lang.String r0 = r1.mTargetWho
            java.lang.String r7 = defpackage.i61.n(r7, r0, r3)
            defpackage.i.m(r7)
            return
        L81:
            if (r2 == 0) goto L86
            r2.k()
        L86:
            androidx.fragment.app.u r0 = r1.mFragmentManager
            cl2 r2 = r0.w
            r1.mHost = r2
            androidx.fragment.app.o r0 = r0.y
            r1.mParentFragment = r0
            yc1 r7 = r7.a
            r0 = 0
            r7.v(r1, r0)
            r1.performAttach()
            r7.q(r1, r0)
            return
    }

    public final int d() {
            r11 = this;
            androidx.fragment.app.o r0 = r11.c
            androidx.fragment.app.u r1 = r0.mFragmentManager
            if (r1 != 0) goto L9
            int r11 = r0.mState
            return r11
        L9:
            int r1 = r11.e
            int[] r2 = defpackage.ql2.a
            tt3 r3 = r0.mMaxState
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 5
            r4 = -1
            r5 = 3
            r6 = 4
            r7 = 2
            r8 = 1
            if (r2 == r8) goto L37
            if (r2 == r7) goto L33
            if (r2 == r5) goto L2e
            if (r2 == r6) goto L28
            int r1 = java.lang.Math.min(r1, r4)
            goto L37
        L28:
            r2 = 0
            int r1 = java.lang.Math.min(r1, r2)
            goto L37
        L2e:
            int r1 = java.lang.Math.min(r1, r8)
            goto L37
        L33:
            int r1 = java.lang.Math.min(r1, r3)
        L37:
            boolean r2 = r0.mFromLayout
            if (r2 == 0) goto L61
            boolean r2 = r0.mInLayout
            int r11 = r11.e
            if (r2 == 0) goto L54
            int r1 = java.lang.Math.max(r11, r7)
            android.view.View r11 = r0.mView
            if (r11 == 0) goto L61
            android.view.ViewParent r11 = r11.getParent()
            if (r11 != 0) goto L61
            int r1 = java.lang.Math.min(r1, r7)
            goto L61
        L54:
            if (r11 >= r6) goto L5d
            int r11 = r0.mState
            int r1 = java.lang.Math.min(r1, r11)
            goto L61
        L5d:
            int r1 = java.lang.Math.min(r1, r8)
        L61:
            boolean r11 = r0.mInDynamicContainer
            if (r11 == 0) goto L6d
            android.view.ViewGroup r11 = r0.mContainer
            if (r11 != 0) goto L6d
            int r1 = java.lang.Math.min(r1, r6)
        L6d:
            boolean r11 = r0.mAdded
            if (r11 != 0) goto L75
            int r1 = java.lang.Math.min(r1, r8)
        L75:
            android.view.ViewGroup r11 = r0.mContainer
            r2 = 0
            if (r11 == 0) goto La5
            androidx.fragment.app.u r9 = r0.getParentFragmentManager()
            androidx.fragment.app.h r11 = androidx.fragment.app.h.j(r11, r9)
            androidx.fragment.app.b0 r9 = r11.g(r0)
            if (r9 == 0) goto L8b
            xn6 r9 = r9.b
            goto L8c
        L8b:
            r9 = r2
        L8c:
            androidx.fragment.app.b0 r11 = r11.h(r0)
            if (r11 == 0) goto L94
            xn6 r2 = r11.b
        L94:
            if (r9 != 0) goto L98
            r11 = r4
            goto La0
        L98:
            int[] r11 = defpackage.co6.a
            int r10 = r9.ordinal()
            r11 = r11[r10]
        La0:
            if (r11 == r4) goto La5
            if (r11 == r8) goto La5
            r2 = r9
        La5:
            xn6 r11 = defpackage.xn6.ADDING
            if (r2 != r11) goto Laf
            r11 = 6
            int r1 = java.lang.Math.min(r1, r11)
            goto Lcb
        Laf:
            xn6 r11 = defpackage.xn6.REMOVING
            if (r2 != r11) goto Lb8
            int r1 = java.lang.Math.max(r1, r5)
            goto Lcb
        Lb8:
            boolean r11 = r0.mRemoving
            if (r11 == 0) goto Lcb
            boolean r11 = r0.isInBackStack()
            if (r11 == 0) goto Lc7
            int r1 = java.lang.Math.min(r1, r8)
            goto Lcb
        Lc7:
            int r1 = java.lang.Math.min(r1, r4)
        Lcb:
            boolean r11 = r0.mDeferStart
            if (r11 == 0) goto Ld7
            int r11 = r0.mState
            if (r11 >= r3) goto Ld7
            int r1 = java.lang.Math.min(r1, r6)
        Ld7:
            boolean r11 = r0.mTransitioning
            if (r11 == 0) goto Ldf
            int r1 = java.lang.Math.max(r1, r5)
        Ldf:
            boolean r11 = androidx.fragment.app.u.K(r7)
            if (r11 == 0) goto L100
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r2 = "computeExpectedState() of "
            r11.<init>(r2)
            r11.append(r1)
            java.lang.String r2 = " for "
            r11.append(r2)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.v(r0, r11)
        L100:
            return r1
    }

    public final void e() {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.u.K(r0)
            androidx.fragment.app.o r1 = r3.c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "moveto CREATED: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r0)
        L1c:
            android.os.Bundle r0 = r1.mSavedFragmentState
            if (r0 == 0) goto L27
            java.lang.String r2 = "savedInstanceState"
            android.os.Bundle r0 = r0.getBundle(r2)
            goto L28
        L27:
            r0 = 0
        L28:
            boolean r2 = r1.mIsCreated
            if (r2 != 0) goto L39
            yc1 r3 = r3.a
            r2 = 0
            r3.w(r1, r2)
            r1.performCreate(r0)
            r3.r(r1, r2)
            return
        L39:
            r3 = 1
            r1.mState = r3
            r1.restoreChildFragmentState()
            return
    }

    public final void f() {
            r9 = this;
            androidx.fragment.app.o r0 = r9.c
            boolean r1 = r0.mFromLayout
            if (r1 == 0) goto L7
            return
        L7:
            r1 = 3
            boolean r2 = androidx.fragment.app.u.K(r1)
            java.lang.String r3 = "FragmentManager"
            if (r2 == 0) goto L21
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "moveto CREATE_VIEW: "
            r2.<init>(r4)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r3, r2)
        L21:
            android.os.Bundle r2 = r0.mSavedFragmentState
            r4 = 0
            if (r2 == 0) goto L2d
            java.lang.String r5 = "savedInstanceState"
            android.os.Bundle r2 = r2.getBundle(r5)
            goto L2e
        L2d:
            r2 = r4
        L2e:
            android.view.LayoutInflater r5 = r0.performGetLayoutInflater(r2)
            android.view.ViewGroup r6 = r0.mContainer
            if (r6 == 0) goto L39
            r4 = r6
            goto Lcb
        L39:
            int r6 = r0.mContainerId
            if (r6 == 0) goto Lcb
            r4 = -1
            if (r6 == r4) goto Lbf
            androidx.fragment.app.u r4 = r0.mFragmentManager
            zk2 r4 = r4.x
            android.view.View r4 = r4.c(r6)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r4 != 0) goto L8c
            boolean r6 = r0.mRestored
            if (r6 != 0) goto Lcb
            boolean r6 = r0.mInDynamicContainer
            if (r6 == 0) goto L55
            goto Lcb
        L55:
            android.content.res.Resources r9 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L60
            int r1 = r0.mContainerId     // Catch: android.content.res.Resources.NotFoundException -> L60
            java.lang.String r9 = r9.getResourceName(r1)     // Catch: android.content.res.Resources.NotFoundException -> L60
            goto L62
        L60:
            java.lang.String r9 = "unknown"
        L62:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            int r2 = r0.mContainerId
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "No view found for id 0x"
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = " ("
            r3.append(r2)
            r3.append(r9)
            java.lang.String r9 = ") for fragment "
            r3.append(r9)
            r3.append(r0)
            java.lang.String r9 = r3.toString()
            r1.<init>(r9)
            throw r1
        L8c:
            boolean r6 = r4 instanceof androidx.fragment.app.FragmentContainerView
            if (r6 != 0) goto Lcb
            sl2 r6 = defpackage.tl2.a
            pl2 r6 = new pl2
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Attempting to add fragment "
            r7.<init>(r8)
            r7.append(r0)
            java.lang.String r8 = " to container "
            r7.append(r8)
            r7.append(r4)
            java.lang.String r8 = " which is not a FragmentContainerView"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r0, r7)
            defpackage.tl2.b(r6)
            sl2 r6 = defpackage.tl2.a(r0)
            r6.getClass()
            rl2 r6 = defpackage.rl2.PENALTY_LOG
            goto Lcb
        Lbf:
            java.lang.String r9 = "Cannot create fragment "
            java.lang.String r1 = " for a container view with no id"
            java.lang.String r9 = defpackage.lb1.l(r9, r0, r1)
            defpackage.i.h(r9)
            return
        Lcb:
            r0.mContainer = r4
            r0.performCreateView(r5, r4, r2)
            android.view.View r2 = r0.mView
            r5 = 2
            if (r2 == 0) goto L171
            boolean r2 = androidx.fragment.app.u.K(r1)
            if (r2 == 0) goto Lec
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "moveto VIEW_CREATED: "
            r2.<init>(r6)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r3, r2)
        Lec:
            android.view.View r2 = r0.mView
            r6 = 0
            r2.setSaveFromParentEnabled(r6)
            android.view.View r2 = r0.mView
            r7 = 2131427594(0x7f0b010a, float:1.8476809E38)
            r2.setTag(r7, r0)
            if (r4 == 0) goto Lff
            r9.b()
        Lff:
            boolean r2 = r0.mHidden
            if (r2 == 0) goto L10a
            android.view.View r2 = r0.mView
            r4 = 8
            r2.setVisibility(r4)
        L10a:
            android.view.View r2 = r0.mView
            boolean r2 = r2.isAttachedToWindow()
            android.view.View r4 = r0.mView
            if (r2 == 0) goto L11a
            java.util.WeakHashMap r1 = defpackage.ao7.a
            r4.requestApplyInsets()
            goto L122
        L11a:
            wh r2 = new wh
            r2.<init>(r4, r1)
            r4.addOnAttachStateChangeListener(r2)
        L122:
            r0.performViewCreated()
            yc1 r9 = r9.a
            android.view.View r1 = r0.mView
            r9.B(r0, r1, r6)
            android.view.View r9 = r0.mView
            int r9 = r9.getVisibility()
            android.view.View r1 = r0.mView
            float r1 = r1.getAlpha()
            r0.setPostOnViewCreatedAlpha(r1)
            android.view.ViewGroup r1 = r0.mContainer
            if (r1 == 0) goto L171
            if (r9 != 0) goto L171
            android.view.View r9 = r0.mView
            android.view.View r9 = r9.findFocus()
            if (r9 == 0) goto L16b
            r0.setFocusedView(r9)
            boolean r1 = androidx.fragment.app.u.K(r5)
            if (r1 == 0) goto L16b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "requestFocus: Saved focused view "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = " for Fragment "
            r1.append(r9)
            r1.append(r0)
            java.lang.String r9 = r1.toString()
            android.util.Log.v(r3, r9)
        L16b:
            android.view.View r9 = r0.mView
            r1 = 0
            r9.setAlpha(r1)
        L171:
            r0.mState = r5
            return
    }

    public final void g() {
            r9 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.u.K(r0)
            androidx.fragment.app.o r1 = r9.c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "movefrom CREATED: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r0)
        L1c:
            boolean r0 = r1.mRemoving
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L2a
            boolean r0 = r1.isInBackStack()
            if (r0 != 0) goto L2a
            r0 = r2
            goto L2b
        L2a:
            r0 = r3
        L2b:
            r4 = 0
            androidx.fragment.app.y r5 = r9.b
            if (r0 == 0) goto L39
            boolean r6 = r1.mBeingSaved
            if (r6 != 0) goto L39
            java.lang.String r6 = r1.mWho
            r5.i(r4, r6)
        L39:
            if (r0 != 0) goto L66
            androidx.fragment.app.v r6 = r5.d
            java.util.HashMap r7 = r6.b
            java.lang.String r8 = r1.mWho
            boolean r7 = r7.containsKey(r8)
            if (r7 != 0) goto L48
            goto L4f
        L48:
            boolean r7 = r6.e
            if (r7 == 0) goto L4f
            boolean r6 = r6.f
            goto L50
        L4f:
            r6 = r2
        L50:
            if (r6 == 0) goto L53
            goto L66
        L53:
            java.lang.String r9 = r1.mTargetWho
            if (r9 == 0) goto L63
            androidx.fragment.app.o r9 = r5.b(r9)
            if (r9 == 0) goto L63
            boolean r0 = r9.mRetainInstance
            if (r0 == 0) goto L63
            r1.mTarget = r9
        L63:
            r1.mState = r3
            return
        L66:
            cl2 r6 = r1.mHost
            boolean r7 = r6 instanceof defpackage.bp7
            if (r7 == 0) goto L71
            androidx.fragment.app.v r2 = r5.d
            boolean r2 = r2.f
            goto L7a
        L71:
            jq r6 = r6.B
            if (r6 == 0) goto L7a
            boolean r6 = r6.isChangingConfigurations()
            r2 = r2 ^ r6
        L7a:
            if (r0 == 0) goto L80
            boolean r0 = r1.mBeingSaved
            if (r0 == 0) goto L82
        L80:
            if (r2 == 0) goto L87
        L82:
            androidx.fragment.app.v r0 = r5.d
            r0.f(r1, r3)
        L87:
            r1.performDestroy()
            yc1 r0 = r9.a
            r0.s(r1, r3)
            java.util.ArrayList r0 = r5.d()
            int r2 = r0.size()
        L97:
            if (r3 >= r2) goto Lb4
            java.lang.Object r6 = r0.get(r3)
            int r3 = r3 + 1
            androidx.fragment.app.x r6 = (androidx.fragment.app.x) r6
            if (r6 == 0) goto L97
            androidx.fragment.app.o r6 = r6.c
            java.lang.String r7 = r1.mWho
            java.lang.String r8 = r6.mTargetWho
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L97
            r6.mTarget = r1
            r6.mTargetWho = r4
            goto L97
        Lb4:
            java.lang.String r0 = r1.mTargetWho
            if (r0 == 0) goto Lbe
            androidx.fragment.app.o r0 = r5.b(r0)
            r1.mTarget = r0
        Lbe:
            r5.h(r9)
            return
    }

    public final void h() {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.u.K(r0)
            androidx.fragment.app.o r1 = r3.c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "movefrom CREATE_VIEW: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r0)
        L1c:
            android.view.ViewGroup r0 = r1.mContainer
            if (r0 == 0) goto L27
            android.view.View r2 = r1.mView
            if (r2 == 0) goto L27
            r0.removeView(r2)
        L27:
            r1.performDestroyView()
            yc1 r3 = r3.a
            r0 = 0
            r3.C(r1, r0)
            r3 = 0
            r1.mContainer = r3
            r1.mView = r3
            r1.mViewLifecycleOwner = r3
            s94 r2 = r1.mViewLifecycleOwnerLiveData
            r2.f(r3)
            r1.mInLayout = r0
            return
    }

    public final void i() {
            r5 = this;
            r0 = 3
            boolean r1 = androidx.fragment.app.u.K(r0)
            java.lang.String r2 = "FragmentManager"
            androidx.fragment.app.o r3 = r5.c
            if (r1 == 0) goto L1c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "movefrom ATTACHED: "
            r1.<init>(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r2, r1)
        L1c:
            r3.performDetach()
            yc1 r1 = r5.a
            r4 = 0
            r1.t(r3, r4)
            r1 = -1
            r3.mState = r1
            r1 = 0
            r3.mHost = r1
            r3.mParentFragment = r1
            r3.mFragmentManager = r1
            boolean r1 = r3.mRemoving
            if (r1 == 0) goto L3a
            boolean r1 = r3.isInBackStack()
            if (r1 != 0) goto L3a
            goto L53
        L3a:
            androidx.fragment.app.y r5 = r5.b
            androidx.fragment.app.v r5 = r5.d
            java.util.HashMap r1 = r5.b
            java.lang.String r4 = r3.mWho
            boolean r1 = r1.containsKey(r4)
            if (r1 != 0) goto L49
            goto L50
        L49:
            boolean r1 = r5.e
            if (r1 == 0) goto L50
            boolean r5 = r5.f
            goto L51
        L50:
            r5 = 1
        L51:
            if (r5 == 0) goto L6d
        L53:
            boolean r5 = androidx.fragment.app.u.K(r0)
            if (r5 == 0) goto L6a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "initState called for fragment: "
            r5.<init>(r0)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r2, r5)
        L6a:
            r3.initState()
        L6d:
            return
    }

    public final void j() {
            r4 = this;
            androidx.fragment.app.o r0 = r4.c
            boolean r1 = r0.mFromLayout
            if (r1 == 0) goto L64
            boolean r1 = r0.mInLayout
            if (r1 == 0) goto L64
            boolean r1 = r0.mPerformedCreateView
            if (r1 != 0) goto L64
            r1 = 3
            boolean r1 = androidx.fragment.app.u.K(r1)
            if (r1 == 0) goto L28
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "moveto CREATE_VIEW: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r1)
        L28:
            android.os.Bundle r1 = r0.mSavedFragmentState
            r2 = 0
            if (r1 == 0) goto L34
            java.lang.String r3 = "savedInstanceState"
            android.os.Bundle r1 = r1.getBundle(r3)
            goto L35
        L34:
            r1 = r2
        L35:
            android.view.LayoutInflater r3 = r0.performGetLayoutInflater(r1)
            r0.performCreateView(r3, r2, r1)
            android.view.View r1 = r0.mView
            if (r1 == 0) goto L64
            r2 = 0
            r1.setSaveFromParentEnabled(r2)
            android.view.View r1 = r0.mView
            r3 = 2131427594(0x7f0b010a, float:1.8476809E38)
            r1.setTag(r3, r0)
            boolean r1 = r0.mHidden
            if (r1 == 0) goto L57
            android.view.View r1 = r0.mView
            r3 = 8
            r1.setVisibility(r3)
        L57:
            r0.performViewCreated()
            yc1 r4 = r4.a
            android.view.View r1 = r0.mView
            r4.B(r0, r1, r2)
            r4 = 2
            r0.mState = r4
        L64:
            return
    }

    public final void k() {
            r10 = this;
            boolean r0 = r10.d
            r1 = 2
            java.lang.String r2 = "FragmentManager"
            androidx.fragment.app.o r3 = r10.c
            if (r0 == 0) goto L21
            boolean r10 = androidx.fragment.app.u.K(r1)
            if (r10 == 0) goto L20
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Ignoring re-entrant call to moveToExpectedState() for "
            r10.<init>(r0)
            r10.append(r3)
            java.lang.String r10 = r10.toString()
            android.util.Log.v(r2, r10)
        L20:
            return
        L21:
            r0 = 1
            r4 = 0
            r10.d = r0     // Catch: java.lang.Throwable -> L41
            r5 = r4
        L26:
            int r6 = r10.d()     // Catch: java.lang.Throwable -> L41
            int r7 = r3.mState     // Catch: java.lang.Throwable -> L41
            androidx.fragment.app.y r8 = r10.b
            r9 = 3
            if (r6 == r7) goto L199
            yc1 r5 = r10.a
            if (r6 <= r7) goto Lbd
            int r7 = r7 + 1
            switch(r7) {
                case 0: goto Lb8;
                case 1: goto Lb3;
                case 2: goto Lab;
                case 3: goto La6;
                case 4: goto L68;
                case 5: goto L49;
                case 6: goto L44;
                case 7: goto L3c;
                default: goto L3a;
            }
        L3a:
            goto L196
        L3c:
            r10.m()     // Catch: java.lang.Throwable -> L41
            goto L196
        L41:
            r0 = move-exception
            goto L25f
        L44:
            r5 = 6
            r3.mState = r5     // Catch: java.lang.Throwable -> L41
            goto L196
        L49:
            boolean r6 = androidx.fragment.app.u.K(r9)     // Catch: java.lang.Throwable -> L41
            if (r6 == 0) goto L60
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            java.lang.String r7 = "moveto STARTED: "
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L41
            r6.append(r3)     // Catch: java.lang.Throwable -> L41
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L41
            android.util.Log.d(r2, r6)     // Catch: java.lang.Throwable -> L41
        L60:
            r3.performStart()     // Catch: java.lang.Throwable -> L41
            r5.z(r3, r4)     // Catch: java.lang.Throwable -> L41
            goto L196
        L68:
            android.view.View r5 = r3.mView     // Catch: java.lang.Throwable -> L41
            if (r5 == 0) goto La1
            android.view.ViewGroup r5 = r3.mContainer     // Catch: java.lang.Throwable -> L41
            if (r5 == 0) goto La1
            androidx.fragment.app.u r6 = r3.getParentFragmentManager()     // Catch: java.lang.Throwable -> L41
            androidx.fragment.app.h r5 = androidx.fragment.app.h.j(r5, r6)     // Catch: java.lang.Throwable -> L41
            android.view.View r6 = r3.mView     // Catch: java.lang.Throwable -> L41
            int r6 = r6.getVisibility()     // Catch: java.lang.Throwable -> L41
            ao6 r6 = defpackage.ao6.from(r6)     // Catch: java.lang.Throwable -> L41
            r6.getClass()     // Catch: java.lang.Throwable -> L41
            boolean r7 = androidx.fragment.app.u.K(r1)     // Catch: java.lang.Throwable -> L41
            if (r7 == 0) goto L9c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            java.lang.String r8 = "SpecialEffectsController: Enqueuing add operation for fragment "
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L41
            r7.append(r3)     // Catch: java.lang.Throwable -> L41
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L41
            android.util.Log.v(r2, r7)     // Catch: java.lang.Throwable -> L41
        L9c:
            xn6 r7 = defpackage.xn6.ADDING     // Catch: java.lang.Throwable -> L41
            r5.d(r6, r7, r10)     // Catch: java.lang.Throwable -> L41
        La1:
            r5 = 4
            r3.mState = r5     // Catch: java.lang.Throwable -> L41
            goto L196
        La6:
            r10.a()     // Catch: java.lang.Throwable -> L41
            goto L196
        Lab:
            r10.j()     // Catch: java.lang.Throwable -> L41
            r10.f()     // Catch: java.lang.Throwable -> L41
            goto L196
        Lb3:
            r10.e()     // Catch: java.lang.Throwable -> L41
            goto L196
        Lb8:
            r10.c()     // Catch: java.lang.Throwable -> L41
            goto L196
        Lbd:
            int r7 = r7 + (-1)
            switch(r7) {
                case -1: goto L193;
                case 0: goto L176;
                case 1: goto L170;
                case 2: goto L16b;
                case 3: goto L107;
                case 4: goto Le8;
                case 5: goto Le3;
                case 6: goto Lc4;
                default: goto Lc2;
            }     // Catch: java.lang.Throwable -> L41
        Lc2:
            goto L196
        Lc4:
            boolean r6 = androidx.fragment.app.u.K(r9)     // Catch: java.lang.Throwable -> L41
            if (r6 == 0) goto Ldb
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            java.lang.String r7 = "movefrom RESUMED: "
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L41
            r6.append(r3)     // Catch: java.lang.Throwable -> L41
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L41
            android.util.Log.d(r2, r6)     // Catch: java.lang.Throwable -> L41
        Ldb:
            r3.performPause()     // Catch: java.lang.Throwable -> L41
            r5.u(r3, r4)     // Catch: java.lang.Throwable -> L41
            goto L196
        Le3:
            r5 = 5
            r3.mState = r5     // Catch: java.lang.Throwable -> L41
            goto L196
        Le8:
            boolean r6 = androidx.fragment.app.u.K(r9)     // Catch: java.lang.Throwable -> L41
            if (r6 == 0) goto Lff
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            java.lang.String r7 = "movefrom STARTED: "
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L41
            r6.append(r3)     // Catch: java.lang.Throwable -> L41
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L41
            android.util.Log.d(r2, r6)     // Catch: java.lang.Throwable -> L41
        Lff:
            r3.performStop()     // Catch: java.lang.Throwable -> L41
            r5.A(r3, r4)     // Catch: java.lang.Throwable -> L41
            goto L196
        L107:
            boolean r5 = androidx.fragment.app.u.K(r9)     // Catch: java.lang.Throwable -> L41
            if (r5 == 0) goto L121
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            r5.<init>()     // Catch: java.lang.Throwable -> L41
            java.lang.String r6 = "movefrom ACTIVITY_CREATED: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L41
            r5.append(r3)     // Catch: java.lang.Throwable -> L41
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L41
            android.util.Log.d(r2, r5)     // Catch: java.lang.Throwable -> L41
        L121:
            boolean r5 = r3.mBeingSaved     // Catch: java.lang.Throwable -> L41
            if (r5 == 0) goto L12f
            java.lang.String r5 = r3.mWho     // Catch: java.lang.Throwable -> L41
            android.os.Bundle r6 = r10.n()     // Catch: java.lang.Throwable -> L41
            r8.i(r6, r5)     // Catch: java.lang.Throwable -> L41
            goto L13a
        L12f:
            android.view.View r5 = r3.mView     // Catch: java.lang.Throwable -> L41
            if (r5 == 0) goto L13a
            android.util.SparseArray<android.os.Parcelable> r5 = r3.mSavedViewState     // Catch: java.lang.Throwable -> L41
            if (r5 != 0) goto L13a
            r10.o()     // Catch: java.lang.Throwable -> L41
        L13a:
            android.view.View r5 = r3.mView     // Catch: java.lang.Throwable -> L41
            if (r5 == 0) goto L168
            android.view.ViewGroup r5 = r3.mContainer     // Catch: java.lang.Throwable -> L41
            if (r5 == 0) goto L168
            androidx.fragment.app.u r6 = r3.getParentFragmentManager()     // Catch: java.lang.Throwable -> L41
            androidx.fragment.app.h r5 = androidx.fragment.app.h.j(r5, r6)     // Catch: java.lang.Throwable -> L41
            boolean r6 = androidx.fragment.app.u.K(r1)     // Catch: java.lang.Throwable -> L41
            if (r6 == 0) goto L161
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            java.lang.String r7 = "SpecialEffectsController: Enqueuing remove operation for fragment "
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L41
            r6.append(r3)     // Catch: java.lang.Throwable -> L41
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L41
            android.util.Log.v(r2, r6)     // Catch: java.lang.Throwable -> L41
        L161:
            ao6 r6 = defpackage.ao6.REMOVED     // Catch: java.lang.Throwable -> L41
            xn6 r7 = defpackage.xn6.REMOVING     // Catch: java.lang.Throwable -> L41
            r5.d(r6, r7, r10)     // Catch: java.lang.Throwable -> L41
        L168:
            r3.mState = r9     // Catch: java.lang.Throwable -> L41
            goto L196
        L16b:
            r3.mInLayout = r4     // Catch: java.lang.Throwable -> L41
            r3.mState = r1     // Catch: java.lang.Throwable -> L41
            goto L196
        L170:
            r10.h()     // Catch: java.lang.Throwable -> L41
            r3.mState = r0     // Catch: java.lang.Throwable -> L41
            goto L196
        L176:
            boolean r5 = r3.mBeingSaved     // Catch: java.lang.Throwable -> L41
            if (r5 == 0) goto L18f
            java.lang.String r5 = r3.mWho     // Catch: java.lang.Throwable -> L41
            java.util.HashMap r6 = r8.c     // Catch: java.lang.Throwable -> L41
            java.lang.Object r5 = r6.get(r5)     // Catch: java.lang.Throwable -> L41
            android.os.Bundle r5 = (android.os.Bundle) r5     // Catch: java.lang.Throwable -> L41
            if (r5 != 0) goto L18f
            java.lang.String r5 = r3.mWho     // Catch: java.lang.Throwable -> L41
            android.os.Bundle r6 = r10.n()     // Catch: java.lang.Throwable -> L41
            r8.i(r6, r5)     // Catch: java.lang.Throwable -> L41
        L18f:
            r10.g()     // Catch: java.lang.Throwable -> L41
            goto L196
        L193:
            r10.i()     // Catch: java.lang.Throwable -> L41
        L196:
            r5 = r0
            goto L26
        L199:
            if (r5 != 0) goto L1eb
            r5 = -1
            if (r7 != r5) goto L1eb
            boolean r5 = r3.mRemoving     // Catch: java.lang.Throwable -> L41
            if (r5 == 0) goto L1eb
            boolean r5 = r3.isInBackStack()     // Catch: java.lang.Throwable -> L41
            if (r5 != 0) goto L1eb
            boolean r5 = r3.mBeingSaved     // Catch: java.lang.Throwable -> L41
            if (r5 != 0) goto L1eb
            boolean r5 = androidx.fragment.app.u.K(r9)     // Catch: java.lang.Throwable -> L41
            if (r5 == 0) goto L1c6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            r5.<init>()     // Catch: java.lang.Throwable -> L41
            java.lang.String r6 = "Cleaning up state of never attached fragment: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L41
            r5.append(r3)     // Catch: java.lang.Throwable -> L41
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L41
            android.util.Log.d(r2, r5)     // Catch: java.lang.Throwable -> L41
        L1c6:
            androidx.fragment.app.v r5 = r8.d     // Catch: java.lang.Throwable -> L41
            r5.f(r3, r0)     // Catch: java.lang.Throwable -> L41
            r8.h(r10)     // Catch: java.lang.Throwable -> L41
            boolean r5 = androidx.fragment.app.u.K(r9)     // Catch: java.lang.Throwable -> L41
            if (r5 == 0) goto L1e8
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            r5.<init>()     // Catch: java.lang.Throwable -> L41
            java.lang.String r6 = "initState called for fragment: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L41
            r5.append(r3)     // Catch: java.lang.Throwable -> L41
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L41
            android.util.Log.d(r2, r5)     // Catch: java.lang.Throwable -> L41
        L1e8:
            r3.initState()     // Catch: java.lang.Throwable -> L41
        L1eb:
            boolean r5 = r3.mHiddenChanged     // Catch: java.lang.Throwable -> L41
            if (r5 == 0) goto L25c
            android.view.View r5 = r3.mView     // Catch: java.lang.Throwable -> L41
            if (r5 == 0) goto L240
            android.view.ViewGroup r5 = r3.mContainer     // Catch: java.lang.Throwable -> L41
            if (r5 == 0) goto L240
            androidx.fragment.app.u r6 = r3.getParentFragmentManager()     // Catch: java.lang.Throwable -> L41
            androidx.fragment.app.h r5 = androidx.fragment.app.h.j(r5, r6)     // Catch: java.lang.Throwable -> L41
            boolean r6 = r3.mHidden     // Catch: java.lang.Throwable -> L41
            if (r6 == 0) goto L222
            boolean r1 = androidx.fragment.app.u.K(r1)     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L21a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            java.lang.String r6 = "SpecialEffectsController: Enqueuing hide operation for fragment "
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L41
            r1.append(r3)     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L41
            android.util.Log.v(r2, r1)     // Catch: java.lang.Throwable -> L41
        L21a:
            ao6 r1 = defpackage.ao6.GONE     // Catch: java.lang.Throwable -> L41
            xn6 r2 = defpackage.xn6.NONE     // Catch: java.lang.Throwable -> L41
            r5.d(r1, r2, r10)     // Catch: java.lang.Throwable -> L41
            goto L240
        L222:
            boolean r1 = androidx.fragment.app.u.K(r1)     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L239
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            java.lang.String r6 = "SpecialEffectsController: Enqueuing show operation for fragment "
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L41
            r1.append(r3)     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L41
            android.util.Log.v(r2, r1)     // Catch: java.lang.Throwable -> L41
        L239:
            ao6 r1 = defpackage.ao6.VISIBLE     // Catch: java.lang.Throwable -> L41
            xn6 r2 = defpackage.xn6.NONE     // Catch: java.lang.Throwable -> L41
            r5.d(r1, r2, r10)     // Catch: java.lang.Throwable -> L41
        L240:
            androidx.fragment.app.u r1 = r3.mFragmentManager     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L250
            boolean r2 = r3.mAdded     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L250
            boolean r2 = androidx.fragment.app.u.L(r3)     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L250
            r1.G = r0     // Catch: java.lang.Throwable -> L41
        L250:
            r3.mHiddenChanged = r4     // Catch: java.lang.Throwable -> L41
            boolean r0 = r3.mHidden     // Catch: java.lang.Throwable -> L41
            r3.onHiddenChanged(r0)     // Catch: java.lang.Throwable -> L41
            androidx.fragment.app.u r0 = r3.mChildFragmentManager     // Catch: java.lang.Throwable -> L41
            r0.o()     // Catch: java.lang.Throwable -> L41
        L25c:
            r10.d = r4
            return
        L25f:
            r10.d = r4
            throw r0
    }

    public final void l(java.lang.ClassLoader r4) {
            r3 = this;
            androidx.fragment.app.o r3 = r3.c
            android.os.Bundle r0 = r3.mSavedFragmentState
            if (r0 != 0) goto L7
            goto L5f
        L7:
            r0.setClassLoader(r4)
            android.os.Bundle r4 = r3.mSavedFragmentState
            java.lang.String r0 = "savedInstanceState"
            android.os.Bundle r4 = r4.getBundle(r0)
            if (r4 != 0) goto L1e
            android.os.Bundle r4 = r3.mSavedFragmentState
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r4.putBundle(r0, r1)
        L1e:
            android.os.Bundle r4 = r3.mSavedFragmentState     // Catch: android.os.BadParcelableException -> L60
            java.lang.String r0 = "viewState"
            android.util.SparseArray r4 = r4.getSparseParcelableArray(r0)     // Catch: android.os.BadParcelableException -> L60
            r3.mSavedViewState = r4     // Catch: android.os.BadParcelableException -> L60
            android.os.Bundle r4 = r3.mSavedFragmentState
            java.lang.String r0 = "viewRegistryState"
            android.os.Bundle r4 = r4.getBundle(r0)
            r3.mSavedViewRegistryState = r4
            android.os.Bundle r4 = r3.mSavedFragmentState
            java.lang.String r0 = "state"
            android.os.Parcelable r4 = r4.getParcelable(r0)
            androidx.fragment.app.w r4 = (androidx.fragment.app.w) r4
            if (r4 == 0) goto L58
            java.lang.String r0 = r4.i0
            r3.mTargetWho = r0
            int r0 = r4.j0
            r3.mTargetRequestCode = r0
            java.lang.Boolean r0 = r3.mSavedUserVisibleHint
            if (r0 == 0) goto L54
            boolean r4 = r0.booleanValue()
            r3.mUserVisibleHint = r4
            r4 = 0
            r3.mSavedUserVisibleHint = r4
            goto L58
        L54:
            boolean r4 = r4.k0
            r3.mUserVisibleHint = r4
        L58:
            boolean r4 = r3.mUserVisibleHint
            if (r4 != 0) goto L5f
            r4 = 1
            r3.mDeferStart = r4
        L5f:
            return
        L60:
            r4 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to restore view hierarchy state for fragment "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3, r4)
            throw r0
    }

    public final void m() {
            r6 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.u.K(r0)
            java.lang.String r1 = "FragmentManager"
            androidx.fragment.app.o r2 = r6.c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "moveto RESUMED: "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1c:
            android.view.View r0 = r2.getFocusedView()
            if (r0 == 0) goto L78
            android.view.View r3 = r2.mView
            if (r0 != r3) goto L27
            goto L31
        L27:
            android.view.ViewParent r3 = r0.getParent()
        L2b:
            if (r3 == 0) goto L78
            android.view.View r4 = r2.mView
            if (r3 != r4) goto L73
        L31:
            boolean r3 = r0.requestFocus()
            r4 = 2
            boolean r4 = androidx.fragment.app.u.K(r4)
            if (r4 == 0) goto L78
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "requestFocus: Restoring focused view "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = " "
            r4.append(r0)
            if (r3 == 0) goto L50
            java.lang.String r0 = "succeeded"
            goto L52
        L50:
            java.lang.String r0 = "failed"
        L52:
            r4.append(r0)
            java.lang.String r0 = " on Fragment "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = " resulting in focused view "
            r4.append(r0)
            android.view.View r0 = r2.mView
            android.view.View r0 = r0.findFocus()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.v(r1, r0)
            goto L78
        L73:
            android.view.ViewParent r3 = r3.getParent()
            goto L2b
        L78:
            r0 = 0
            r2.setFocusedView(r0)
            r2.performResume()
            yc1 r1 = r6.a
            r3 = 0
            r1.x(r2, r3)
            androidx.fragment.app.y r6 = r6.b
            java.lang.String r1 = r2.mWho
            r6.i(r0, r1)
            r2.mSavedFragmentState = r0
            r2.mSavedViewState = r0
            r2.mSavedViewRegistryState = r0
            return
    }

    public final android.os.Bundle n() {
            r5 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            androidx.fragment.app.o r1 = r5.c
            int r2 = r1.mState
            r3 = -1
            if (r2 != r3) goto L13
            android.os.Bundle r2 = r1.mSavedFragmentState
            if (r2 == 0) goto L13
            r0.putAll(r2)
        L13:
            androidx.fragment.app.w r2 = new androidx.fragment.app.w
            r2.<init>(r1)
            java.lang.String r3 = "state"
            r0.putParcelable(r3, r2)
            int r2 = r1.mState
            if (r2 <= 0) goto L79
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r1.performSaveInstanceState(r2)
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L34
            java.lang.String r3 = "savedInstanceState"
            r0.putBundle(r3, r2)
        L34:
            yc1 r3 = r5.a
            r4 = 0
            r3.y(r1, r2, r4)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            e56 r3 = r1.mSavedStateRegistryController
            r3.c(r2)
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L4f
            java.lang.String r3 = "registryState"
            r0.putBundle(r3, r2)
        L4f:
            androidx.fragment.app.u r2 = r1.mChildFragmentManager
            android.os.Bundle r2 = r2.W()
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L60
            java.lang.String r3 = "childFragmentManager"
            r0.putBundle(r3, r2)
        L60:
            android.view.View r2 = r1.mView
            if (r2 == 0) goto L67
            r5.o()
        L67:
            android.util.SparseArray<android.os.Parcelable> r5 = r1.mSavedViewState
            if (r5 == 0) goto L70
            java.lang.String r2 = "viewState"
            r0.putSparseParcelableArray(r2, r5)
        L70:
            android.os.Bundle r5 = r1.mSavedViewRegistryState
            if (r5 == 0) goto L79
            java.lang.String r2 = "viewRegistryState"
            r0.putBundle(r2, r5)
        L79:
            android.os.Bundle r5 = r1.mArguments
            if (r5 == 0) goto L82
            java.lang.String r1 = "arguments"
            r0.putBundle(r1, r5)
        L82:
            return r0
    }

    public final void o() {
            r2 = this;
            androidx.fragment.app.o r2 = r2.c
            android.view.View r0 = r2.mView
            if (r0 != 0) goto L7
            goto L51
        L7:
            r0 = 2
            boolean r0 = androidx.fragment.app.u.K(r0)
            if (r0 == 0) goto L2b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Saving view state for fragment "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = " with view "
            r0.append(r1)
            android.view.View r1 = r2.mView
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L2b:
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            android.view.View r1 = r2.mView
            r1.saveHierarchyState(r0)
            int r1 = r0.size()
            if (r1 <= 0) goto L3d
            r2.mSavedViewState = r0
        L3d:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            androidx.fragment.app.z r1 = r2.mViewLifecycleOwner
            e56 r1 = r1.Y
            r1.c(r0)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L51
            r2.mSavedViewRegistryState = r0
        L51:
            return
    }
}
