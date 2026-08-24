package androidx.fragment.app;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class o implements android.content.ComponentCallbacks, android.view.View.OnCreateContextMenuListener, defpackage.hu3, defpackage.bp7, defpackage.mw2, defpackage.g56 {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final java.lang.Object USE_DEFAULT_TRANSITION = null;
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    defpackage.rk2 mAnimationInfo;
    android.os.Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    androidx.fragment.app.u mChildFragmentManager;
    android.view.ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    defpackage.yo7 mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    androidx.fragment.app.u mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    defpackage.cl2 mHost;
    boolean mInDynamicContainer;
    boolean mInLayout;
    boolean mIsCreated;
    private java.lang.Boolean mIsPrimaryNavigationFragment;
    android.view.LayoutInflater mLayoutInflater;
    defpackage.ku3 mLifecycleRegistry;
    defpackage.tt3 mMaxState;
    boolean mMenuVisible;
    private final java.util.concurrent.atomic.AtomicInteger mNextLocalRequestCode;
    private final java.util.ArrayList<defpackage.sk2> mOnPreAttachedListeners;
    androidx.fragment.app.o mParentFragment;
    boolean mPerformedCreateView;
    java.lang.Runnable mPostponedDurationRunnable;
    android.os.Handler mPostponedHandler;
    public java.lang.String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    android.os.Bundle mSavedFragmentState;
    private final defpackage.sk2 mSavedStateAttachListener;
    defpackage.e56 mSavedStateRegistryController;
    java.lang.Boolean mSavedUserVisibleHint;
    android.os.Bundle mSavedViewRegistryState;
    android.util.SparseArray<android.os.Parcelable> mSavedViewState;
    int mState;
    java.lang.String mTag;
    androidx.fragment.app.o mTarget;
    int mTargetRequestCode;
    java.lang.String mTargetWho;
    boolean mTransitioning;
    boolean mUserVisibleHint;
    android.view.View mView;
    androidx.fragment.app.z mViewLifecycleOwner;
    defpackage.s94 mViewLifecycleOwnerLiveData;
    java.lang.String mWho;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.fragment.app.o.USE_DEFAULT_TRANSITION = r0
            return
    }

    public o() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.mState = r0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r2.mWho = r0
            r0 = 0
            r2.mTargetWho = r0
            r2.mIsPrimaryNavigationFragment = r0
            ll2 r0 = new ll2
            r0.<init>()
            r2.mChildFragmentManager = r0
            r0 = 1
            r2.mMenuVisible = r0
            r2.mUserVisibleHint = r0
            pk2 r0 = new pk2
            r1 = 0
            r0.<init>(r2, r1)
            r2.mPostponedDurationRunnable = r0
            tt3 r0 = defpackage.tt3.RESUMED
            r2.mMaxState = r0
            s94 r0 = new s94
            r0.<init>()
            r2.mViewLifecycleOwnerLiveData = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r2.mNextLocalRequestCode = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mOnPreAttachedListeners = r0
            androidx.fragment.app.k r0 = new androidx.fragment.app.k
            r0.<init>(r2)
            r2.mSavedStateAttachListener = r0
            r2.f()
            return
    }

    @java.lang.Deprecated
    public static androidx.fragment.app.o instantiate(android.content.Context r1, java.lang.String r2) {
            r0 = 0
            androidx.fragment.app.o r1 = instantiate(r1, r2, r0)
            return r1
    }

    @java.lang.Deprecated
    public static androidx.fragment.app.o instantiate(android.content.Context r3, java.lang.String r4, android.os.Bundle r5) {
            java.lang.String r0 = ": make sure class name exists, is public, and has an empty constructor that is public"
            java.lang.String r1 = "Unable to instantiate fragment "
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2c java.lang.InstantiationException -> L2e
            java.lang.Class r3 = defpackage.gl2.c(r4, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2c java.lang.InstantiationException -> L2e
            r2 = 0
            java.lang.reflect.Constructor r3 = r3.getConstructor(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2c java.lang.InstantiationException -> L2e
            java.lang.Object r3 = r3.newInstance(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2c java.lang.InstantiationException -> L2e
            androidx.fragment.app.o r3 = (androidx.fragment.app.o) r3     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2c java.lang.InstantiationException -> L2e
            if (r5 == 0) goto L30
            java.lang.Class r2 = r3.getClass()     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2c java.lang.InstantiationException -> L2e
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2c java.lang.InstantiationException -> L2e
            r5.setClassLoader(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2c java.lang.InstantiationException -> L2e
            r3.setArguments(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L28 java.lang.NoSuchMethodException -> L2a java.lang.IllegalAccessException -> L2c java.lang.InstantiationException -> L2e
            return r3
        L28:
            r3 = move-exception
            goto L31
        L2a:
            r3 = move-exception
            goto L3d
        L2c:
            r3 = move-exception
            goto L49
        L2e:
            r3 = move-exception
            goto L53
        L30:
            return r3
        L31:
            ug r5 = new ug
            java.lang.String r0 = ": calling Fragment constructor caused an exception"
            java.lang.String r4 = defpackage.lb1.A(r1, r4, r0)
            r5.<init>(r4, r3)
            throw r5
        L3d:
            ug r5 = new ug
            java.lang.String r0 = ": could not find Fragment constructor"
            java.lang.String r4 = defpackage.lb1.A(r1, r4, r0)
            r5.<init>(r4, r3)
            throw r5
        L49:
            ug r5 = new ug
            java.lang.String r4 = defpackage.lb1.A(r1, r4, r0)
            r5.<init>(r4, r3)
            throw r5
        L53:
            ug r5 = new ug
            java.lang.String r4 = defpackage.lb1.A(r1, r4, r0)
            r5.<init>(r4, r3)
            throw r5
    }

    public final defpackage.rk2 a() {
            r3 = this;
            rk2 r0 = r3.mAnimationInfo
            if (r0 != 0) goto L20
            rk2 r0 = new rk2
            r0.<init>()
            r1 = 0
            r0.i = r1
            java.lang.Object r2 = androidx.fragment.app.o.USE_DEFAULT_TRANSITION
            r0.j = r2
            r0.k = r1
            r0.l = r2
            r0.m = r1
            r0.n = r2
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.q = r2
            r0.r = r1
            r3.mAnimationInfo = r0
        L20:
            rk2 r3 = r3.mAnimationInfo
            return r3
    }

    public void callStartTransitionListener(boolean r4) {
            r3 = this;
            rk2 r0 = r3.mAnimationInfo
            if (r0 == 0) goto L7
            r1 = 0
            r0.s = r1
        L7:
            android.view.View r0 = r3.mView
            if (r0 == 0) goto L3a
            android.view.ViewGroup r0 = r3.mContainer
            if (r0 == 0) goto L3a
            androidx.fragment.app.u r1 = r3.mFragmentManager
            if (r1 == 0) goto L3a
            androidx.fragment.app.h r0 = androidx.fragment.app.h.j(r0, r1)
            r0.l()
            if (r4 == 0) goto L2b
            cl2 r4 = r3.mHost
            android.os.Handler r4 = r4.L
            g15 r1 = new g15
            r2 = 9
            r1.<init>(r0, r2)
            r4.post(r1)
            goto L2e
        L2b:
            r0.e()
        L2e:
            android.os.Handler r4 = r3.mPostponedHandler
            if (r4 == 0) goto L3a
            java.lang.Runnable r0 = r3.mPostponedDurationRunnable
            r4.removeCallbacks(r0)
            r4 = 0
            r3.mPostponedHandler = r4
        L3a:
            return
    }

    public defpackage.zk2 createFragmentContainer() {
            r1 = this;
            androidx.fragment.app.l r0 = new androidx.fragment.app.l
            r0.<init>(r1)
            return r0
    }

    public final int d() {
            r2 = this;
            tt3 r0 = r2.mMaxState
            tt3 r1 = defpackage.tt3.INITIALIZED
            if (r0 == r1) goto L1a
            androidx.fragment.app.o r1 = r2.mParentFragment
            if (r1 != 0) goto Lb
            goto L1a
        Lb:
            int r0 = r0.ordinal()
            androidx.fragment.app.o r2 = r2.mParentFragment
            int r2 = r2.d()
            int r2 = java.lang.Math.min(r0, r2)
            return r2
        L1a:
            int r2 = r0.ordinal()
            return r2
    }

    public void dump(java.lang.String r6, java.io.FileDescriptor r7, java.io.PrintWriter r8, java.lang.String[] r9) {
            r5 = this;
            r8.print(r6)
            java.lang.String r0 = "mFragmentId=#"
            r8.print(r0)
            int r0 = r5.mFragmentId
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r8.print(r0)
            java.lang.String r0 = " mContainerId=#"
            r8.print(r0)
            int r0 = r5.mContainerId
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r8.print(r0)
            java.lang.String r0 = " mTag="
            r8.print(r0)
            java.lang.String r0 = r5.mTag
            r8.println(r0)
            r8.print(r6)
            java.lang.String r0 = "mState="
            r8.print(r0)
            int r0 = r5.mState
            r8.print(r0)
            java.lang.String r0 = " mWho="
            r8.print(r0)
            java.lang.String r0 = r5.mWho
            r8.print(r0)
            java.lang.String r0 = " mBackStackNesting="
            r8.print(r0)
            int r0 = r5.mBackStackNesting
            r8.println(r0)
            r8.print(r6)
            java.lang.String r0 = "mAdded="
            r8.print(r0)
            boolean r0 = r5.mAdded
            r8.print(r0)
            java.lang.String r0 = " mRemoving="
            r8.print(r0)
            boolean r0 = r5.mRemoving
            r8.print(r0)
            java.lang.String r0 = " mFromLayout="
            r8.print(r0)
            boolean r0 = r5.mFromLayout
            r8.print(r0)
            java.lang.String r0 = " mInLayout="
            r8.print(r0)
            boolean r0 = r5.mInLayout
            r8.println(r0)
            r8.print(r6)
            java.lang.String r0 = "mHidden="
            r8.print(r0)
            boolean r0 = r5.mHidden
            r8.print(r0)
            java.lang.String r0 = " mDetached="
            r8.print(r0)
            boolean r0 = r5.mDetached
            r8.print(r0)
            java.lang.String r0 = " mMenuVisible="
            r8.print(r0)
            boolean r0 = r5.mMenuVisible
            r8.print(r0)
            java.lang.String r0 = " mHasMenu="
            r8.print(r0)
            boolean r0 = r5.mHasMenu
            r8.println(r0)
            r8.print(r6)
            java.lang.String r0 = "mRetainInstance="
            r8.print(r0)
            boolean r0 = r5.mRetainInstance
            r8.print(r0)
            java.lang.String r0 = " mUserVisibleHint="
            r8.print(r0)
            boolean r0 = r5.mUserVisibleHint
            r8.println(r0)
            androidx.fragment.app.u r0 = r5.mFragmentManager
            if (r0 == 0) goto Lc8
            r8.print(r6)
            java.lang.String r0 = "mFragmentManager="
            r8.print(r0)
            androidx.fragment.app.u r0 = r5.mFragmentManager
            r8.println(r0)
        Lc8:
            cl2 r0 = r5.mHost
            if (r0 == 0) goto Ld9
            r8.print(r6)
            java.lang.String r0 = "mHost="
            r8.print(r0)
            cl2 r0 = r5.mHost
            r8.println(r0)
        Ld9:
            androidx.fragment.app.o r0 = r5.mParentFragment
            if (r0 == 0) goto Lea
            r8.print(r6)
            java.lang.String r0 = "mParentFragment="
            r8.print(r0)
            androidx.fragment.app.o r0 = r5.mParentFragment
            r8.println(r0)
        Lea:
            android.os.Bundle r0 = r5.mArguments
            if (r0 == 0) goto Lfb
            r8.print(r6)
            java.lang.String r0 = "mArguments="
            r8.print(r0)
            android.os.Bundle r0 = r5.mArguments
            r8.println(r0)
        Lfb:
            android.os.Bundle r0 = r5.mSavedFragmentState
            if (r0 == 0) goto L10c
            r8.print(r6)
            java.lang.String r0 = "mSavedFragmentState="
            r8.print(r0)
            android.os.Bundle r0 = r5.mSavedFragmentState
            r8.println(r0)
        L10c:
            android.util.SparseArray<android.os.Parcelable> r0 = r5.mSavedViewState
            if (r0 == 0) goto L11d
            r8.print(r6)
            java.lang.String r0 = "mSavedViewState="
            r8.print(r0)
            android.util.SparseArray<android.os.Parcelable> r0 = r5.mSavedViewState
            r8.println(r0)
        L11d:
            android.os.Bundle r0 = r5.mSavedViewRegistryState
            if (r0 == 0) goto L12e
            r8.print(r6)
            java.lang.String r0 = "mSavedViewRegistryState="
            r8.print(r0)
            android.os.Bundle r0 = r5.mSavedViewRegistryState
            r8.println(r0)
        L12e:
            r0 = 0
            androidx.fragment.app.o r1 = r5.e(r0)
            if (r1 == 0) goto L14a
            r8.print(r6)
            java.lang.String r2 = "mTarget="
            r8.print(r2)
            r8.print(r1)
            java.lang.String r1 = " mTargetRequestCode="
            r8.print(r1)
            int r1 = r5.mTargetRequestCode
            r8.println(r1)
        L14a:
            r8.print(r6)
            java.lang.String r1 = "mPopDirection="
            r8.print(r1)
            boolean r1 = r5.getPopDirection()
            r8.println(r1)
            int r1 = r5.getEnterAnim()
            if (r1 == 0) goto L16e
            r8.print(r6)
            java.lang.String r1 = "getEnterAnim="
            r8.print(r1)
            int r1 = r5.getEnterAnim()
            r8.println(r1)
        L16e:
            int r1 = r5.getExitAnim()
            if (r1 == 0) goto L183
            r8.print(r6)
            java.lang.String r1 = "getExitAnim="
            r8.print(r1)
            int r1 = r5.getExitAnim()
            r8.println(r1)
        L183:
            int r1 = r5.getPopEnterAnim()
            if (r1 == 0) goto L198
            r8.print(r6)
            java.lang.String r1 = "getPopEnterAnim="
            r8.print(r1)
            int r1 = r5.getPopEnterAnim()
            r8.println(r1)
        L198:
            int r1 = r5.getPopExitAnim()
            if (r1 == 0) goto L1ad
            r8.print(r6)
            java.lang.String r1 = "getPopExitAnim="
            r8.print(r1)
            int r1 = r5.getPopExitAnim()
            r8.println(r1)
        L1ad:
            android.view.ViewGroup r1 = r5.mContainer
            if (r1 == 0) goto L1be
            r8.print(r6)
            java.lang.String r1 = "mContainer="
            r8.print(r1)
            android.view.ViewGroup r1 = r5.mContainer
            r8.println(r1)
        L1be:
            android.view.View r1 = r5.mView
            if (r1 == 0) goto L1cf
            r8.print(r6)
            java.lang.String r1 = "mView="
            r8.print(r1)
            android.view.View r1 = r5.mView
            r8.println(r1)
        L1cf:
            android.view.View r1 = r5.getAnimatingAway()
            if (r1 == 0) goto L1e4
            r8.print(r6)
            java.lang.String r1 = "mAnimatingAway="
            r8.print(r1)
            android.view.View r1 = r5.getAnimatingAway()
            r8.println(r1)
        L1e4:
            android.content.Context r1 = r5.getContext()
            if (r1 == 0) goto L252
            ap7 r1 = r5.getViewModelStore()
            r1.getClass()
            h71 r2 = defpackage.h71.b
            r2.getClass()
            eb r3 = new eb
            nl2 r4 = defpackage.tx3.c
            r3.<init>(r1, r4, r2)
            java.lang.Class<tx3> r1 = defpackage.tx3.class
            ar0 r1 = defpackage.gh5.a(r1)
            java.lang.String r2 = r1.b()
            if (r2 == 0) goto L24c
            java.lang.String r4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r2 = r4.concat(r2)
            qo7 r1 = r3.G(r1, r2)
            tx3 r1 = (defpackage.tx3) r1
            un6 r1 = r1.b
            int r2 = r1.f()
            if (r2 <= 0) goto L252
            r8.print(r6)
            java.lang.String r2 = "Loaders:"
            r8.println(r2)
            int r2 = r1.f()
            if (r2 > 0) goto L22c
            goto L252
        L22c:
            java.lang.Object r5 = r1.g(r0)
            if (r5 == 0) goto L236
            defpackage.u34.a()
            return
        L236:
            r8.print(r6)
            java.lang.String r5 = "  #"
            r8.print(r5)
            int r5 = r1.d(r0)
            r8.print(r5)
            java.lang.String r5 = ": "
            r8.print(r5)
            r5 = 0
            throw r5
        L24c:
            java.lang.String r5 = "Local and anonymous classes can not be ViewModels"
            defpackage.i.h(r5)
            return
        L252:
            r8.print(r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Child "
            r0.<init>(r1)
            androidx.fragment.app.u r1 = r5.mChildFragmentManager
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.println(r0)
            androidx.fragment.app.u r5 = r5.mChildFragmentManager
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r6 = "  "
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.v(r6, r7, r8, r9)
            return
    }

    public final androidx.fragment.app.o e(boolean r3) {
            r2 = this;
            if (r3 == 0) goto L23
            sl2 r3 = defpackage.tl2.a
            xr2 r3 = new xr2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Attempting to get target fragment from fragment "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r2, r0)
            defpackage.tl2.b(r3)
            sl2 r3 = defpackage.tl2.a(r2)
            r3.getClass()
            rl2 r3 = defpackage.rl2.PENALTY_LOG
        L23:
            androidx.fragment.app.o r3 = r2.mTarget
            if (r3 == 0) goto L28
            return r3
        L28:
            androidx.fragment.app.u r3 = r2.mFragmentManager
            if (r3 == 0) goto L37
            java.lang.String r2 = r2.mTargetWho
            if (r2 == 0) goto L37
            androidx.fragment.app.y r3 = r3.c
            androidx.fragment.app.o r2 = r3.b(r2)
            return r2
        L37:
            r2 = 0
            return r2
    }

    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            if (r0 == r1) goto L4
            r0 = 0
            return r0
        L4:
            r0 = 1
            return r0
    }

    public final void f() {
            r3 = this;
            ku3 r0 = new ku3
            r1 = 1
            r0.<init>(r3, r1)
            r3.mLifecycleRegistry = r0
            f56 r0 = new f56
            t46 r1 = new t46
            r2 = 2
            r1.<init>(r3, r2)
            r0.<init>(r3, r1)
            e56 r1 = new e56
            r1.<init>(r0)
            r3.mSavedStateRegistryController = r1
            r0 = 0
            r3.mDefaultFactory = r0
            java.util.ArrayList<sk2> r0 = r3.mOnPreAttachedListeners
            sk2 r1 = r3.mSavedStateAttachListener
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L36
            sk2 r0 = r3.mSavedStateAttachListener
            int r1 = r3.mState
            if (r1 < 0) goto L31
            r0.a()
            return
        L31:
            java.util.ArrayList<sk2> r3 = r3.mOnPreAttachedListeners
            r3.add(r0)
        L36:
            return
    }

    public androidx.fragment.app.o findFragmentByWho(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.mWho
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            return r1
        L9:
            androidx.fragment.app.u r1 = r1.mChildFragmentManager
            androidx.fragment.app.y r1 = r1.c
            androidx.fragment.app.o r1 = r1.c(r2)
            return r1
    }

    public final defpackage.ok2 g(defpackage.b9 r9, defpackage.mo2 r10, defpackage.a9 r11) {
            r8 = this;
            int r0 = r8.mState
            r1 = 1
            if (r0 > r1) goto L26
            java.util.concurrent.atomic.AtomicReference r5 = new java.util.concurrent.atomic.AtomicReference
            r5.<init>()
            qk2 r2 = new qk2
            r3 = r8
            r6 = r9
            r4 = r10
            r7 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            int r8 = r3.mState
            if (r8 < 0) goto L1b
            r2.a()
            goto L20
        L1b:
            java.util.ArrayList<sk2> r8 = r3.mOnPreAttachedListeners
            r8.add(r2)
        L20:
            ok2 r8 = new ok2
            r8.<init>(r5)
            return r8
        L26:
            r3 = r8
            java.lang.String r8 = "Fragment "
            java.lang.String r9 = " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."
            java.lang.String r8 = defpackage.lb1.l(r8, r3, r9)
            defpackage.i.m(r8)
            r8 = 0
            return r8
    }

    public java.lang.String generateActivityResultKey() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "fragment_"
            r0.<init>(r1)
            java.lang.String r1 = r2.mWho
            r0.append(r1)
            java.lang.String r1 = "_rq#"
            r0.append(r1)
            java.util.concurrent.atomic.AtomicInteger r2 = r2.mNextLocalRequestCode
            int r2 = r2.getAndIncrement()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public final androidx.fragment.app.p getActivity() {
            r0 = this;
            cl2 r0 = r0.mHost
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            jq r0 = r0.A
            return r0
    }

    public boolean getAllowEnterTransitionOverlap() {
            r0 = this;
            rk2 r0 = r0.mAnimationInfo
            if (r0 == 0) goto Le
            java.lang.Boolean r0 = r0.p
            if (r0 != 0) goto L9
            goto Le
        L9:
            boolean r0 = r0.booleanValue()
            return r0
        Le:
            r0 = 1
            return r0
    }

    public boolean getAllowReturnTransitionOverlap() {
            r0 = this;
            rk2 r0 = r0.mAnimationInfo
            if (r0 == 0) goto Le
            java.lang.Boolean r0 = r0.o
            if (r0 != 0) goto L9
            goto Le
        L9:
            boolean r0 = r0.booleanValue()
            return r0
        Le:
            r0 = 1
            return r0
    }

    public android.view.View getAnimatingAway() {
            r1 = this;
            rk2 r1 = r1.mAnimationInfo
            r0 = 0
            if (r1 != 0) goto L6
            return r0
        L6:
            r1.getClass()
            return r0
    }

    public final android.os.Bundle getArguments() {
            r0 = this;
            android.os.Bundle r0 = r0.mArguments
            return r0
    }

    public final androidx.fragment.app.u getChildFragmentManager() {
            r2 = this;
            cl2 r0 = r2.mHost
            if (r0 == 0) goto L7
            androidx.fragment.app.u r2 = r2.mChildFragmentManager
            return r2
        L7:
            java.lang.String r0 = "Fragment "
            java.lang.String r1 = " has not been attached yet."
            java.lang.String r2 = defpackage.lb1.l(r0, r2, r1)
            defpackage.i.m(r2)
            r2 = 0
            return r2
    }

    public android.content.Context getContext() {
            r0 = this;
            cl2 r0 = r0.mHost
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            jq r0 = r0.B
            return r0
    }

    @Override // defpackage.mw2
    public defpackage.j71 getDefaultViewModelCreationExtras() {
            r4 = this;
            android.content.Context r0 = r4.requireContext()
            android.content.Context r0 = r0.getApplicationContext()
        L8:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L1a
            boolean r1 = r0 instanceof android.app.Application
            if (r1 == 0) goto L13
            android.app.Application r0 = (android.app.Application) r0
            goto L1b
        L13:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L8
        L1a:
            r0 = 0
        L1b:
            if (r0 != 0) goto L44
            r1 = 3
            boolean r1 = androidx.fragment.app.u.K(r1)
            if (r1 == 0) goto L44
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not find Application instance from Context "
            r1.<init>(r2)
            android.content.Context r2 = r4.requireContext()
            android.content.Context r2 = r2.getApplicationContext()
            r1.append(r2)
            java.lang.String r2 = ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r1)
        L44:
            m94 r1 = new m94
            r2 = 0
            r1.<init>(r2)
            java.util.LinkedHashMap r2 = r1.a
            if (r0 == 0) goto L53
            vo7 r3 = defpackage.wo7.d
            r2.put(r3, r0)
        L53:
            q61 r0 = defpackage.y46.a
            r2.put(r0, r4)
            jd1 r0 = defpackage.y46.b
            r2.put(r0, r4)
            android.os.Bundle r0 = r4.getArguments()
            if (r0 == 0) goto L6c
            w31 r0 = defpackage.y46.c
            android.os.Bundle r4 = r4.getArguments()
            r2.put(r0, r4)
        L6c:
            return r1
    }

    @Override // defpackage.mw2
    public defpackage.yo7 getDefaultViewModelProviderFactory() {
            r3 = this;
            androidx.fragment.app.u r0 = r3.mFragmentManager
            r1 = 0
            if (r0 == 0) goto L5b
            yo7 r0 = r3.mDefaultFactory
            if (r0 != 0) goto L58
            android.content.Context r0 = r3.requireContext()
            android.content.Context r0 = r0.getApplicationContext()
        L11:
            boolean r2 = r0 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L24
            boolean r2 = r0 instanceof android.app.Application
            if (r2 == 0) goto L1d
            r1 = r0
            android.app.Application r1 = (android.app.Application) r1
            goto L24
        L1d:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L11
        L24:
            if (r1 != 0) goto L4d
            r0 = 3
            boolean r0 = androidx.fragment.app.u.K(r0)
            if (r0 == 0) goto L4d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not find Application instance from Context "
            r0.<init>(r2)
            android.content.Context r2 = r3.requireContext()
            android.content.Context r2 = r2.getApplicationContext()
            r0.append(r2)
            java.lang.String r2 = ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r0)
        L4d:
            h56 r0 = new h56
            android.os.Bundle r2 = r3.getArguments()
            r0.<init>(r1, r3, r2)
            r3.mDefaultFactory = r0
        L58:
            yo7 r3 = r3.mDefaultFactory
            return r3
        L5b:
            java.lang.String r3 = "Can't access ViewModels from detached fragment"
            defpackage.i.m(r3)
            return r1
    }

    public int getEnterAnim() {
            r0 = this;
            rk2 r0 = r0.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.b
            return r0
    }

    public java.lang.Object getEnterTransition() {
            r0 = this;
            rk2 r0 = r0.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.i
            return r0
    }

    public defpackage.hf6 getEnterTransitionCallback() {
            r1 = this;
            rk2 r1 = r1.mAnimationInfo
            r0 = 0
            if (r1 != 0) goto L6
            return r0
        L6:
            r1.getClass()
            return r0
    }

    public int getExitAnim() {
            r0 = this;
            rk2 r0 = r0.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.c
            return r0
    }

    public java.lang.Object getExitTransition() {
            r0 = this;
            rk2 r0 = r0.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.k
            return r0
    }

    public defpackage.hf6 getExitTransitionCallback() {
            r1 = this;
            rk2 r1 = r1.mAnimationInfo
            r0 = 0
            if (r1 != 0) goto L6
            return r0
        L6:
            r1.getClass()
            return r0
    }

    public android.view.View getFocusedView() {
            r0 = this;
            rk2 r0 = r0.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.view.View r0 = r0.r
            return r0
    }

    @java.lang.Deprecated
    public final androidx.fragment.app.u getFragmentManager() {
            r0 = this;
            androidx.fragment.app.u r0 = r0.mFragmentManager
            return r0
    }

    public final java.lang.Object getHost() {
            r0 = this;
            cl2 r0 = r0.mHost
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            vk2 r0 = (defpackage.vk2) r0
            jq r0 = r0.X
            return r0
    }

    public final int getId() {
            r0 = this;
            int r0 = r0.mFragmentId
            return r0
    }

    public final android.view.LayoutInflater getLayoutInflater() {
            r1 = this;
            android.view.LayoutInflater r0 = r1.mLayoutInflater
            if (r0 != 0) goto La
            r0 = 0
            android.view.LayoutInflater r1 = r1.performGetLayoutInflater(r0)
            return r1
        La:
            return r0
    }

    @java.lang.Deprecated
    public android.view.LayoutInflater getLayoutInflater(android.os.Bundle r2) {
            r1 = this;
            cl2 r2 = r1.mHost
            if (r2 == 0) goto L18
            vk2 r2 = (defpackage.vk2) r2
            jq r2 = r2.X
            android.view.LayoutInflater r0 = r2.getLayoutInflater()
            android.view.LayoutInflater r2 = r0.cloneInContext(r2)
            androidx.fragment.app.u r1 = r1.mChildFragmentManager
            androidx.fragment.app.r r1 = r1.f
            r2.setFactory2(r1)
            return r2
        L18:
            java.lang.String r1 = "onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager."
            defpackage.i.m(r1)
            r1 = 0
            return r1
    }

    @Override // defpackage.hu3
    public defpackage.ut3 getLifecycle() {
            r0 = this;
            ku3 r0 = r0.mLifecycleRegistry
            return r0
    }

    @java.lang.Deprecated
    public defpackage.sx3 getLoaderManager() {
            r2 = this;
            ux3 r0 = new ux3
            ap7 r1 = r2.getViewModelStore()
            r0.<init>(r2, r1)
            return r0
    }

    public int getNextTransition() {
            r0 = this;
            rk2 r0 = r0.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.f
            return r0
    }

    public final androidx.fragment.app.o getParentFragment() {
            r0 = this;
            androidx.fragment.app.o r0 = r0.mParentFragment
            return r0
    }

    public final androidx.fragment.app.u getParentFragmentManager() {
            r2 = this;
            androidx.fragment.app.u r0 = r2.mFragmentManager
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "Fragment "
            java.lang.String r1 = " not associated with a fragment manager."
            java.lang.String r2 = defpackage.lb1.l(r0, r2, r1)
            defpackage.i.m(r2)
            r2 = 0
            return r2
    }

    public boolean getPopDirection() {
            r0 = this;
            rk2 r0 = r0.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = r0.a
            return r0
    }

    public int getPopEnterAnim() {
            r0 = this;
            rk2 r0 = r0.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.d
            return r0
    }

    public int getPopExitAnim() {
            r0 = this;
            rk2 r0 = r0.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.e
            return r0
    }

    public float getPostOnViewCreatedAlpha() {
            r0 = this;
            rk2 r0 = r0.mAnimationInfo
            if (r0 != 0) goto L7
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
        L7:
            float r0 = r0.q
            return r0
    }

    public java.lang.Object getReenterTransition() {
            r2 = this;
            rk2 r0 = r2.mAnimationInfo
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.Object r0 = r0.l
            java.lang.Object r1 = androidx.fragment.app.o.USE_DEFAULT_TRANSITION
            if (r0 != r1) goto L11
            java.lang.Object r2 = r2.getExitTransition()
            return r2
        L11:
            return r0
    }

    public final android.content.res.Resources getResources() {
            r0 = this;
            android.content.Context r0 = r0.requireContext()
            android.content.res.Resources r0 = r0.getResources()
            return r0
    }

    @java.lang.Deprecated
    public final boolean getRetainInstance() {
            r3 = this;
            sl2 r0 = defpackage.tl2.a
            wr2 r0 = new wr2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Attempting to get retain instance for fragment "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r3, r1)
            defpackage.tl2.b(r0)
            sl2 r0 = defpackage.tl2.a(r3)
            r0.getClass()
            rl2 r0 = defpackage.rl2.PENALTY_LOG
            boolean r3 = r3.mRetainInstance
            return r3
    }

    public java.lang.Object getReturnTransition() {
            r2 = this;
            rk2 r0 = r2.mAnimationInfo
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.Object r0 = r0.j
            java.lang.Object r1 = androidx.fragment.app.o.USE_DEFAULT_TRANSITION
            if (r0 != r1) goto L11
            java.lang.Object r2 = r2.getEnterTransition()
            return r2
        L11:
            return r0
    }

    @Override // defpackage.g56
    public final defpackage.d56 getSavedStateRegistry() {
            r0 = this;
            e56 r0 = r0.mSavedStateRegistryController
            d56 r0 = r0.b
            return r0
    }

    public java.lang.Object getSharedElementEnterTransition() {
            r0 = this;
            rk2 r0 = r0.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.m
            return r0
    }

    public java.lang.Object getSharedElementReturnTransition() {
            r2 = this;
            rk2 r0 = r2.mAnimationInfo
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.Object r0 = r0.n
            java.lang.Object r1 = androidx.fragment.app.o.USE_DEFAULT_TRANSITION
            if (r0 != r1) goto L11
            java.lang.Object r2 = r2.getSharedElementEnterTransition()
            return r2
        L11:
            return r0
    }

    public java.util.ArrayList<java.lang.String> getSharedElementSourceNames() {
            r0 = this;
            rk2 r0 = r0.mAnimationInfo
            if (r0 == 0) goto La
            java.util.ArrayList r0 = r0.g
            if (r0 != 0) goto L9
            goto La
        L9:
            return r0
        La:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    public java.util.ArrayList<java.lang.String> getSharedElementTargetNames() {
            r0 = this;
            rk2 r0 = r0.mAnimationInfo
            if (r0 == 0) goto La
            java.util.ArrayList r0 = r0.h
            if (r0 != 0) goto L9
            goto La
        L9:
            return r0
        La:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    public final java.lang.String getString(int r1) {
            r0 = this;
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    public final java.lang.String getString(int r1, java.lang.Object... r2) {
            r0 = this;
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r0 = r0.getString(r1, r2)
            return r0
    }

    public final java.lang.String getTag() {
            r0 = this;
            java.lang.String r0 = r0.mTag
            return r0
    }

    @java.lang.Deprecated
    public final androidx.fragment.app.o getTargetFragment() {
            r1 = this;
            r0 = 1
            androidx.fragment.app.o r1 = r1.e(r0)
            return r1
    }

    @java.lang.Deprecated
    public final int getTargetRequestCode() {
            r3 = this;
            sl2 r0 = defpackage.tl2.a
            xr2 r0 = new xr2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Attempting to get target request code from fragment "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r3, r1)
            defpackage.tl2.b(r0)
            sl2 r0 = defpackage.tl2.a(r3)
            r0.getClass()
            rl2 r0 = defpackage.rl2.PENALTY_LOG
            int r3 = r3.mTargetRequestCode
            return r3
    }

    public final java.lang.CharSequence getText(int r1) {
            r0 = this;
            android.content.res.Resources r0 = r0.getResources()
            java.lang.CharSequence r0 = r0.getText(r1)
            return r0
    }

    @java.lang.Deprecated
    public boolean getUserVisibleHint() {
            r0 = this;
            boolean r0 = r0.mUserVisibleHint
            return r0
    }

    public android.view.View getView() {
            r0 = this;
            android.view.View r0 = r0.mView
            return r0
    }

    public defpackage.hu3 getViewLifecycleOwner() {
            r2 = this;
            androidx.fragment.app.z r0 = r2.mViewLifecycleOwner
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "Can't access the Fragment View's LifecycleOwner for "
            java.lang.String r1 = " when getView() is null i.e., before onCreateView() or after onDestroyView()"
            java.lang.String r2 = defpackage.lb1.l(r0, r2, r1)
            defpackage.i.m(r2)
            r2 = 0
            return r2
    }

    public defpackage.qx3 getViewLifecycleOwnerLiveData() {
            r0 = this;
            s94 r0 = r0.mViewLifecycleOwnerLiveData
            return r0
    }

    @Override // defpackage.bp7
    public defpackage.ap7 getViewModelStore() {
            r3 = this;
            androidx.fragment.app.u r0 = r3.mFragmentManager
            r1 = 0
            if (r0 == 0) goto L32
            int r0 = r3.d()
            tt3 r2 = defpackage.tt3.INITIALIZED
            int r2 = r2.ordinal()
            if (r0 == r2) goto L2c
            androidx.fragment.app.u r0 = r3.mFragmentManager
            androidx.fragment.app.v r0 = r0.O
            java.util.HashMap r0 = r0.d
            java.lang.String r1 = r3.mWho
            java.lang.Object r1 = r0.get(r1)
            ap7 r1 = (defpackage.ap7) r1
            if (r1 != 0) goto L2b
            ap7 r1 = new ap7
            r1.<init>()
            java.lang.String r3 = r3.mWho
            r0.put(r3, r1)
        L2b:
            return r1
        L2c:
            java.lang.String r3 = "Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported"
            defpackage.i.m(r3)
            return r1
        L32:
            java.lang.String r3 = "Can't access ViewModels from detached fragment"
            defpackage.i.m(r3)
            return r1
    }

    public final boolean hasOptionsMenu() {
            r0 = this;
            boolean r0 = r0.mHasMenu
            return r0
    }

    public final int hashCode() {
            r0 = this;
            int r0 = super.hashCode()
            return r0
    }

    public void initState() {
            r3 = this;
            r3.f()
            java.lang.String r0 = r3.mWho
            r3.mPreviousWho = r0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r3.mWho = r0
            r0 = 0
            r3.mAdded = r0
            r3.mRemoving = r0
            r3.mFromLayout = r0
            r3.mInLayout = r0
            r3.mRestored = r0
            r3.mBackStackNesting = r0
            r1 = 0
            r3.mFragmentManager = r1
            ll2 r2 = new ll2
            r2.<init>()
            r3.mChildFragmentManager = r2
            r3.mHost = r1
            r3.mFragmentId = r0
            r3.mContainerId = r0
            r3.mTag = r1
            r3.mHidden = r0
            r3.mDetached = r0
            return
    }

    public final boolean isAdded() {
            r1 = this;
            cl2 r0 = r1.mHost
            if (r0 == 0) goto La
            boolean r1 = r1.mAdded
            if (r1 == 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public final boolean isDetached() {
            r0 = this;
            boolean r0 = r0.mDetached
            return r0
    }

    public final boolean isHidden() {
            r2 = this;
            boolean r0 = r2.mHidden
            if (r0 != 0) goto L1a
            androidx.fragment.app.u r0 = r2.mFragmentManager
            r1 = 0
            if (r0 == 0) goto L19
            androidx.fragment.app.o r2 = r2.mParentFragment
            r0.getClass()
            if (r2 != 0) goto L12
            r2 = r1
            goto L16
        L12:
            boolean r2 = r2.isHidden()
        L16:
            if (r2 == 0) goto L19
            goto L1a
        L19:
            return r1
        L1a:
            r2 = 1
            return r2
    }

    public final boolean isInBackStack() {
            r0 = this;
            int r0 = r0.mBackStackNesting
            if (r0 <= 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final boolean isInLayout() {
            r0 = this;
            boolean r0 = r0.mInLayout
            return r0
    }

    public final boolean isMenuVisible() {
            r2 = this;
            boolean r0 = r2.mMenuVisible
            if (r0 == 0) goto L16
            androidx.fragment.app.u r0 = r2.mFragmentManager
            r1 = 1
            if (r0 == 0) goto L15
            androidx.fragment.app.o r2 = r2.mParentFragment
            if (r2 != 0) goto Lf
            r2 = r1
            goto L13
        Lf:
            boolean r2 = r2.isMenuVisible()
        L13:
            if (r2 == 0) goto L16
        L15:
            return r1
        L16:
            r2 = 0
            return r2
    }

    public boolean isPostponed() {
            r0 = this;
            rk2 r0 = r0.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = r0.s
            return r0
    }

    public final boolean isRemoving() {
            r0 = this;
            boolean r0 = r0.mRemoving
            return r0
    }

    public final boolean isResumed() {
            r1 = this;
            int r1 = r1.mState
            r0 = 7
            if (r1 < r0) goto L7
            r1 = 1
            return r1
        L7:
            r1 = 0
            return r1
    }

    public final boolean isStateSaved() {
            r2 = this;
            androidx.fragment.app.u r2 = r2.mFragmentManager
            r0 = 0
            if (r2 != 0) goto L6
            return r0
        L6:
            boolean r1 = r2.H
            if (r1 != 0) goto L10
            boolean r2 = r2.I
            if (r2 == 0) goto Lf
            goto L10
        Lf:
            return r0
        L10:
            r2 = 1
            return r2
    }

    public final boolean isVisible() {
            r1 = this;
            boolean r0 = r1.isAdded()
            if (r0 == 0) goto L20
            boolean r0 = r1.isHidden()
            if (r0 != 0) goto L20
            android.view.View r0 = r1.mView
            if (r0 == 0) goto L20
            android.os.IBinder r0 = r0.getWindowToken()
            if (r0 == 0) goto L20
            android.view.View r1 = r1.mView
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L20
            r1 = 1
            return r1
        L20:
            r1 = 0
            return r1
    }

    public void noteStateNotSaved() {
            r0 = this;
            androidx.fragment.app.u r0 = r0.mChildFragmentManager
            r0.P()
            return
    }

    @java.lang.Deprecated
    public void onActivityCreated(android.os.Bundle r1) {
            r0 = this;
            r1 = 1
            r0.mCalled = r1
            return
    }

    @java.lang.Deprecated
    public void onActivityResult(int r3, int r4, android.content.Intent r5) {
            r2 = this;
            r0 = 2
            boolean r0 = androidx.fragment.app.u.K(r0)
            if (r0 == 0) goto L32
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Fragment "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = " received the following in onActivityResult(): requestCode: "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = " resultCode: "
            r0.append(r2)
            r0.append(r4)
            java.lang.String r2 = " data: "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r2 = r0.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.v(r3, r2)
        L32:
            return
    }

    @java.lang.Deprecated
    public void onAttach(android.app.Activity r1) {
            r0 = this;
            r1 = 1
            r0.mCalled = r1
            return
    }

    public void onAttach(android.content.Context r2) {
            r1 = this;
            r2 = 1
            r1.mCalled = r2
            cl2 r2 = r1.mHost
            if (r2 != 0) goto L9
            r2 = 0
            goto Lb
        L9:
            jq r2 = r2.A
        Lb:
            if (r2 == 0) goto L13
            r0 = 0
            r1.mCalled = r0
            r1.onAttach(r2)
        L13:
            return
    }

    @java.lang.Deprecated
    public void onAttachFragment(androidx.fragment.app.o r1) {
            r0 = this;
            return
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            r1 = 1
            r0.mCalled = r1
            return
    }

    public boolean onContextItemSelected(android.view.MenuItem r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    public void onCreate(android.os.Bundle r3) {
            r2 = this;
            r3 = 1
            r2.mCalled = r3
            r2.restoreChildFragmentState()
            androidx.fragment.app.u r2 = r2.mChildFragmentManager
            int r0 = r2.v
            if (r0 < r3) goto Ld
            return
        Ld:
            r0 = 0
            r2.H = r0
            r2.I = r0
            androidx.fragment.app.v r1 = r2.O
            r1.g = r0
            r2.u(r3)
            return
    }

    public android.view.animation.Animation onCreateAnimation(int r1, boolean r2, int r3) {
            r0 = this;
            r0 = 0
            return r0
    }

    public android.animation.Animator onCreateAnimator(int r1, boolean r2, int r3) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu r1, android.view.View r2, android.view.ContextMenu.ContextMenuInfo r3) {
            r0 = this;
            androidx.fragment.app.p r0 = r0.requireActivity()
            r0.onCreateContextMenu(r1, r2, r3)
            return
    }

    @java.lang.Deprecated
    public void onCreateOptionsMenu(android.view.Menu r1, android.view.MenuInflater r2) {
            r0 = this;
            return
    }

    public android.view.View onCreateView(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3) {
            r0 = this;
            int r0 = r0.mContentLayoutId
            if (r0 == 0) goto La
            r3 = 0
            android.view.View r0 = r1.inflate(r0, r2, r3)
            return r0
        La:
            r0 = 0
            return r0
    }

    public void onDestroy() {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    @java.lang.Deprecated
    public void onDestroyOptionsMenu() {
            r0 = this;
            return
    }

    public void onDestroyView() {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    public void onDetach() {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle r1) {
            r0 = this;
            android.view.LayoutInflater r0 = r0.getLayoutInflater(r1)
            return r0
    }

    public void onHiddenChanged(boolean r1) {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public void onInflate(android.app.Activity r1, android.util.AttributeSet r2, android.os.Bundle r3) {
            r0 = this;
            r1 = 1
            r0.mCalled = r1
            return
    }

    public void onInflate(android.content.Context r2, android.util.AttributeSet r3, android.os.Bundle r4) {
            r1 = this;
            r2 = 1
            r1.mCalled = r2
            cl2 r2 = r1.mHost
            if (r2 != 0) goto L9
            r2 = 0
            goto Lb
        L9:
            jq r2 = r2.A
        Lb:
            if (r2 == 0) goto L13
            r0 = 0
            r1.mCalled = r0
            r1.onInflate(r2, r3, r4)
        L13:
            return
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    public void onMultiWindowModeChanged(boolean r1) {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public boolean onOptionsItemSelected(android.view.MenuItem r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public void onOptionsMenuClosed(android.view.Menu r1) {
            r0 = this;
            return
    }

    public void onPause() {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    public void onPictureInPictureModeChanged(boolean r1) {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public void onPrepareOptionsMenu(android.view.Menu r1) {
            r0 = this;
            return
    }

    public void onPrimaryNavigationFragmentChanged(boolean r1) {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public void onRequestPermissionsResult(int r1, java.lang.String[] r2, int[] r3) {
            r0 = this;
            return
    }

    public void onResume() {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    public void onSaveInstanceState(android.os.Bundle r1) {
            r0 = this;
            return
    }

    public void onStart() {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    public void onStop() {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    public void onViewCreated(android.view.View r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    public void onViewStateRestored(android.os.Bundle r1) {
            r0 = this;
            r1 = 1
            r0.mCalled = r1
            return
    }

    public void performActivityCreated(android.os.Bundle r4) {
            r3 = this;
            androidx.fragment.app.u r0 = r3.mChildFragmentManager
            r0.P()
            r0 = 3
            r3.mState = r0
            r1 = 0
            r3.mCalled = r1
            r3.onActivityCreated(r4)
            boolean r4 = r3.mCalled
            if (r4 == 0) goto L50
            boolean r4 = androidx.fragment.app.u.K(r0)
            if (r4 == 0) goto L2b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "moveto RESTORE_VIEW_STATE: "
            r4.<init>(r0)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.d(r0, r4)
        L2b:
            android.view.View r4 = r3.mView
            r0 = 0
            if (r4 == 0) goto L3f
            android.os.Bundle r4 = r3.mSavedFragmentState
            if (r4 == 0) goto L3b
            java.lang.String r2 = "savedInstanceState"
            android.os.Bundle r4 = r4.getBundle(r2)
            goto L3c
        L3b:
            r4 = r0
        L3c:
            r3.restoreViewState(r4)
        L3f:
            r3.mSavedFragmentState = r0
            androidx.fragment.app.u r3 = r3.mChildFragmentManager
            r3.H = r1
            r3.I = r1
            androidx.fragment.app.v r4 = r3.O
            r4.g = r1
            r4 = 4
            r3.u(r4)
            return
        L50:
            eu6 r4 = new eu6
            java.lang.String r0 = "Fragment "
            java.lang.String r1 = " did not call through to super.onActivityCreated()"
            java.lang.String r3 = defpackage.lb1.l(r0, r3, r1)
            r4.<init>(r3)
            throw r4
    }

    public void performAttach() {
            r5 = this;
            java.util.ArrayList<sk2> r0 = r5.mOnPreAttachedListeners
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r1) goto L16
            java.lang.Object r4 = r0.get(r3)
            int r3 = r3 + 1
            sk2 r4 = (defpackage.sk2) r4
            r4.a()
            goto L8
        L16:
            java.util.ArrayList<sk2> r0 = r5.mOnPreAttachedListeners
            r0.clear()
            androidx.fragment.app.u r0 = r5.mChildFragmentManager
            cl2 r1 = r5.mHost
            zk2 r3 = r5.createFragmentContainer()
            r0.b(r1, r3, r5)
            r5.mState = r2
            r5.mCalled = r2
            cl2 r0 = r5.mHost
            jq r0 = r0.B
            r5.onAttach(r0)
            boolean r0 = r5.mCalled
            if (r0 == 0) goto L5b
            androidx.fragment.app.u r0 = r5.mFragmentManager
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.p
            java.util.Iterator r0 = r0.iterator()
        L3d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r0.next()
            ol2 r1 = (defpackage.ol2) r1
            r1.a(r5)
            goto L3d
        L4d:
            androidx.fragment.app.u r5 = r5.mChildFragmentManager
            r5.H = r2
            r5.I = r2
            androidx.fragment.app.v r0 = r5.O
            r0.g = r2
            r5.u(r2)
            return
        L5b:
            eu6 r0 = new eu6
            java.lang.String r1 = "Fragment "
            java.lang.String r2 = " did not call through to super.onAttach()"
            java.lang.String r5 = defpackage.lb1.l(r1, r5, r2)
            r0.<init>(r5)
            throw r0
    }

    public void performConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            r0.onConfigurationChanged(r1)
            return
    }

    public boolean performContextItemSelected(android.view.MenuItem r2) {
            r1 = this;
            boolean r0 = r1.mHidden
            if (r0 != 0) goto L13
            boolean r0 = r1.onContextItemSelected(r2)
            if (r0 == 0) goto Lc
            r1 = 1
            return r1
        Lc:
            androidx.fragment.app.u r1 = r1.mChildFragmentManager
            boolean r1 = r1.j(r2)
            return r1
        L13:
            r1 = 0
            return r1
    }

    public void performCreate(android.os.Bundle r4) {
            r3 = this;
            androidx.fragment.app.u r0 = r3.mChildFragmentManager
            r0.P()
            r0 = 1
            r3.mState = r0
            r1 = 0
            r3.mCalled = r1
            ku3 r1 = r3.mLifecycleRegistry
            androidx.fragment.app.m r2 = new androidx.fragment.app.m
            r2.<init>(r3)
            r1.a(r2)
            r3.onCreate(r4)
            r3.mIsCreated = r0
            boolean r4 = r3.mCalled
            if (r4 == 0) goto L26
            ku3 r3 = r3.mLifecycleRegistry
            st3 r4 = defpackage.st3.ON_CREATE
            r3.f(r4)
            return
        L26:
            eu6 r4 = new eu6
            java.lang.String r0 = "Fragment "
            java.lang.String r1 = " did not call through to super.onCreate()"
            java.lang.String r3 = defpackage.lb1.l(r0, r3, r1)
            r4.<init>(r3)
            throw r4
    }

    public boolean performCreateOptionsMenu(android.view.Menu r3, android.view.MenuInflater r4) {
            r2 = this;
            boolean r0 = r2.mHidden
            r1 = 0
            if (r0 != 0) goto L19
            boolean r0 = r2.mHasMenu
            if (r0 == 0) goto L11
            boolean r0 = r2.mMenuVisible
            if (r0 == 0) goto L11
            r2.onCreateOptionsMenu(r3, r4)
            r1 = 1
        L11:
            androidx.fragment.app.u r2 = r2.mChildFragmentManager
            boolean r2 = r2.k(r3, r4)
            r2 = r2 | r1
            return r2
        L19:
            return r1
    }

    public void performCreateView(android.view.LayoutInflater r4, android.view.ViewGroup r5, android.os.Bundle r6) {
            r3 = this;
            androidx.fragment.app.u r0 = r3.mChildFragmentManager
            r0.P()
            r0 = 1
            r3.mPerformedCreateView = r0
            androidx.fragment.app.z r0 = new androidx.fragment.app.z
            ap7 r1 = r3.getViewModelStore()
            androidx.fragment.app.j r2 = new androidx.fragment.app.j
            r2.<init>(r3)
            r0.<init>(r3, r1, r2)
            r3.mViewLifecycleOwner = r0
            android.view.View r4 = r3.onCreateView(r4, r5, r6)
            r3.mView = r4
            androidx.fragment.app.z r5 = r3.mViewLifecycleOwner
            if (r4 == 0) goto L78
            r5.c()
            r4 = 3
            boolean r4 = androidx.fragment.app.u.K(r4)
            if (r4 == 0) goto L49
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Setting ViewLifecycleOwner on View "
            r4.<init>(r5)
            android.view.View r5 = r3.mView
            r4.append(r5)
            java.lang.String r5 = " for Fragment "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "FragmentManager"
            android.util.Log.d(r5, r4)
        L49:
            android.view.View r4 = r3.mView
            androidx.fragment.app.z r5 = r3.mViewLifecycleOwner
            r4.getClass()
            r6 = 2131428076(0x7f0b02ec, float:1.8477786E38)
            r4.setTag(r6, r5)
            android.view.View r4 = r3.mView
            androidx.fragment.app.z r5 = r3.mViewLifecycleOwner
            r4.getClass()
            r6 = 2131428080(0x7f0b02f0, float:1.8477794E38)
            r4.setTag(r6, r5)
            android.view.View r4 = r3.mView
            androidx.fragment.app.z r5 = r3.mViewLifecycleOwner
            r4.getClass()
            r6 = 2131428079(0x7f0b02ef, float:1.8477792E38)
            r4.setTag(r6, r5)
            s94 r4 = r3.mViewLifecycleOwnerLiveData
            androidx.fragment.app.z r3 = r3.mViewLifecycleOwner
            r4.f(r3)
            return
        L78:
            ku3 r4 = r5.X
            if (r4 != 0) goto L80
            r4 = 0
            r3.mViewLifecycleOwner = r4
            return
        L80:
            java.lang.String r3 = "Called getViewLifecycleOwner() but onCreateView() returned null"
            defpackage.i.m(r3)
            return
    }

    public void performDestroy() {
            r3 = this;
            androidx.fragment.app.u r0 = r3.mChildFragmentManager
            r0.l()
            ku3 r0 = r3.mLifecycleRegistry
            st3 r1 = defpackage.st3.ON_DESTROY
            r0.f(r1)
            r0 = 0
            r3.mState = r0
            r3.mCalled = r0
            r3.mIsCreated = r0
            r3.onDestroy()
            boolean r0 = r3.mCalled
            if (r0 == 0) goto L1b
            return
        L1b:
            eu6 r0 = new eu6
            java.lang.String r1 = "Fragment "
            java.lang.String r2 = " did not call through to super.onDestroy()"
            java.lang.String r3 = defpackage.lb1.l(r1, r3, r2)
            r0.<init>(r3)
            throw r0
    }

    public void performDestroyView() {
            r5 = this;
            androidx.fragment.app.u r0 = r5.mChildFragmentManager
            r1 = 1
            r0.u(r1)
            android.view.View r0 = r5.mView
            if (r0 == 0) goto L22
            androidx.fragment.app.z r0 = r5.mViewLifecycleOwner
            r0.c()
            ku3 r0 = r0.X
            tt3 r0 = r0.d
            tt3 r2 = defpackage.tt3.CREATED
            boolean r0 = r0.isAtLeast(r2)
            if (r0 == 0) goto L22
            androidx.fragment.app.z r0 = r5.mViewLifecycleOwner
            st3 r2 = defpackage.st3.ON_DESTROY
            r0.a(r2)
        L22:
            r5.mState = r1
            r0 = 0
            r5.mCalled = r0
            r5.onDestroyView()
            boolean r1 = r5.mCalled
            if (r1 == 0) goto L75
            ap7 r1 = r5.getViewModelStore()
            r1.getClass()
            h71 r2 = defpackage.h71.b
            r2.getClass()
            eb r3 = new eb
            nl2 r4 = defpackage.tx3.c
            r3.<init>(r1, r4, r2)
            java.lang.Class<tx3> r1 = defpackage.tx3.class
            ar0 r1 = defpackage.gh5.a(r1)
            java.lang.String r2 = r1.b()
            if (r2 == 0) goto L6f
            java.lang.String r4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r2 = r4.concat(r2)
            qo7 r1 = r3.G(r1, r2)
            tx3 r1 = (defpackage.tx3) r1
            un6 r1 = r1.b
            int r2 = r1.f()
            if (r2 > 0) goto L64
            r5.mPerformedCreateView = r0
            return
        L64:
            java.lang.Object r5 = r1.g(r0)
            r5.getClass()
            defpackage.u34.a()
            return
        L6f:
            java.lang.String r5 = "Local and anonymous classes can not be ViewModels"
            defpackage.i.h(r5)
            return
        L75:
            eu6 r0 = new eu6
            java.lang.String r1 = "Fragment "
            java.lang.String r2 = " did not call through to super.onDestroyView()"
            java.lang.String r5 = defpackage.lb1.l(r1, r5, r2)
            r0.<init>(r5)
            throw r0
    }

    public void performDetach() {
            r3 = this;
            r0 = -1
            r3.mState = r0
            r0 = 0
            r3.mCalled = r0
            r3.onDetach()
            r0 = 0
            r3.mLayoutInflater = r0
            boolean r0 = r3.mCalled
            if (r0 == 0) goto L21
            androidx.fragment.app.u r0 = r3.mChildFragmentManager
            boolean r1 = r0.J
            if (r1 != 0) goto L20
            r0.l()
            ll2 r0 = new ll2
            r0.<init>()
            r3.mChildFragmentManager = r0
        L20:
            return
        L21:
            eu6 r0 = new eu6
            java.lang.String r1 = "Fragment "
            java.lang.String r2 = " did not call through to super.onDetach()"
            java.lang.String r3 = defpackage.lb1.l(r1, r3, r2)
            r0.<init>(r3)
            throw r0
    }

    public android.view.LayoutInflater performGetLayoutInflater(android.os.Bundle r1) {
            r0 = this;
            android.view.LayoutInflater r1 = r0.onGetLayoutInflater(r1)
            r0.mLayoutInflater = r1
            return r1
    }

    public void performLowMemory() {
            r0 = this;
            r0.onLowMemory()
            return
    }

    public void performMultiWindowModeChanged(boolean r1) {
            r0 = this;
            r0.onMultiWindowModeChanged(r1)
            return
    }

    public boolean performOptionsItemSelected(android.view.MenuItem r2) {
            r1 = this;
            boolean r0 = r1.mHidden
            if (r0 != 0) goto L1b
            boolean r0 = r1.mHasMenu
            if (r0 == 0) goto L14
            boolean r0 = r1.mMenuVisible
            if (r0 == 0) goto L14
            boolean r0 = r1.onOptionsItemSelected(r2)
            if (r0 == 0) goto L14
            r1 = 1
            return r1
        L14:
            androidx.fragment.app.u r1 = r1.mChildFragmentManager
            boolean r1 = r1.p(r2)
            return r1
        L1b:
            r1 = 0
            return r1
    }

    public void performOptionsMenuClosed(android.view.Menu r2) {
            r1 = this;
            boolean r0 = r1.mHidden
            if (r0 != 0) goto L14
            boolean r0 = r1.mHasMenu
            if (r0 == 0) goto Lf
            boolean r0 = r1.mMenuVisible
            if (r0 == 0) goto Lf
            r1.onOptionsMenuClosed(r2)
        Lf:
            androidx.fragment.app.u r1 = r1.mChildFragmentManager
            r1.q(r2)
        L14:
            return
    }

    public void performPause() {
            r3 = this;
            androidx.fragment.app.u r0 = r3.mChildFragmentManager
            r1 = 5
            r0.u(r1)
            android.view.View r0 = r3.mView
            if (r0 == 0) goto L11
            androidx.fragment.app.z r0 = r3.mViewLifecycleOwner
            st3 r1 = defpackage.st3.ON_PAUSE
            r0.a(r1)
        L11:
            ku3 r0 = r3.mLifecycleRegistry
            st3 r1 = defpackage.st3.ON_PAUSE
            r0.f(r1)
            r0 = 6
            r3.mState = r0
            r0 = 0
            r3.mCalled = r0
            r3.onPause()
            boolean r0 = r3.mCalled
            if (r0 == 0) goto L26
            return
        L26:
            eu6 r0 = new eu6
            java.lang.String r1 = "Fragment "
            java.lang.String r2 = " did not call through to super.onPause()"
            java.lang.String r3 = defpackage.lb1.l(r1, r3, r2)
            r0.<init>(r3)
            throw r0
    }

    public void performPictureInPictureModeChanged(boolean r1) {
            r0 = this;
            r0.onPictureInPictureModeChanged(r1)
            return
    }

    public boolean performPrepareOptionsMenu(android.view.Menu r3) {
            r2 = this;
            boolean r0 = r2.mHidden
            r1 = 0
            if (r0 != 0) goto L19
            boolean r0 = r2.mHasMenu
            if (r0 == 0) goto L11
            boolean r0 = r2.mMenuVisible
            if (r0 == 0) goto L11
            r2.onPrepareOptionsMenu(r3)
            r1 = 1
        L11:
            androidx.fragment.app.u r2 = r2.mChildFragmentManager
            boolean r2 = r2.t(r3)
            r2 = r2 | r1
            return r2
        L19:
            return r1
    }

    public void performPrimaryNavigationFragmentChanged() {
            r2 = this;
            androidx.fragment.app.u r0 = r2.mFragmentManager
            r0.getClass()
            boolean r0 = androidx.fragment.app.u.N(r2)
            java.lang.Boolean r1 = r2.mIsPrimaryNavigationFragment
            if (r1 == 0) goto L15
            boolean r1 = r1.booleanValue()
            if (r1 == r0) goto L14
            goto L15
        L14:
            return
        L15:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r2.mIsPrimaryNavigationFragment = r1
            r2.onPrimaryNavigationFragmentChanged(r0)
            androidx.fragment.app.u r2 = r2.mChildFragmentManager
            r2.e0()
            androidx.fragment.app.o r0 = r2.z
            r2.r(r0)
            return
    }

    public void performResume() {
            r4 = this;
            androidx.fragment.app.u r0 = r4.mChildFragmentManager
            r0.P()
            androidx.fragment.app.u r0 = r4.mChildFragmentManager
            r1 = 1
            r0.z(r1)
            r0 = 7
            r4.mState = r0
            r1 = 0
            r4.mCalled = r1
            r4.onResume()
            boolean r2 = r4.mCalled
            if (r2 == 0) goto L38
            ku3 r2 = r4.mLifecycleRegistry
            st3 r3 = defpackage.st3.ON_RESUME
            r2.f(r3)
            android.view.View r2 = r4.mView
            if (r2 == 0) goto L2a
            androidx.fragment.app.z r2 = r4.mViewLifecycleOwner
            ku3 r2 = r2.X
            r2.f(r3)
        L2a:
            androidx.fragment.app.u r4 = r4.mChildFragmentManager
            r4.H = r1
            r4.I = r1
            androidx.fragment.app.v r2 = r4.O
            r2.g = r1
            r4.u(r0)
            return
        L38:
            eu6 r0 = new eu6
            java.lang.String r1 = "Fragment "
            java.lang.String r2 = " did not call through to super.onResume()"
            java.lang.String r4 = defpackage.lb1.l(r1, r4, r2)
            r0.<init>(r4)
            throw r0
    }

    public void performSaveInstanceState(android.os.Bundle r1) {
            r0 = this;
            r0.onSaveInstanceState(r1)
            return
    }

    public void performStart() {
            r4 = this;
            androidx.fragment.app.u r0 = r4.mChildFragmentManager
            r0.P()
            androidx.fragment.app.u r0 = r4.mChildFragmentManager
            r1 = 1
            r0.z(r1)
            r0 = 5
            r4.mState = r0
            r1 = 0
            r4.mCalled = r1
            r4.onStart()
            boolean r2 = r4.mCalled
            if (r2 == 0) goto L38
            ku3 r2 = r4.mLifecycleRegistry
            st3 r3 = defpackage.st3.ON_START
            r2.f(r3)
            android.view.View r2 = r4.mView
            if (r2 == 0) goto L2a
            androidx.fragment.app.z r2 = r4.mViewLifecycleOwner
            ku3 r2 = r2.X
            r2.f(r3)
        L2a:
            androidx.fragment.app.u r4 = r4.mChildFragmentManager
            r4.H = r1
            r4.I = r1
            androidx.fragment.app.v r2 = r4.O
            r2.g = r1
            r4.u(r0)
            return
        L38:
            eu6 r0 = new eu6
            java.lang.String r1 = "Fragment "
            java.lang.String r2 = " did not call through to super.onStart()"
            java.lang.String r4 = defpackage.lb1.l(r1, r4, r2)
            r0.<init>(r4)
            throw r0
    }

    public void performStop() {
            r3 = this;
            androidx.fragment.app.u r0 = r3.mChildFragmentManager
            r1 = 1
            r0.I = r1
            androidx.fragment.app.v r2 = r0.O
            r2.g = r1
            r1 = 4
            r0.u(r1)
            android.view.View r0 = r3.mView
            if (r0 == 0) goto L18
            androidx.fragment.app.z r0 = r3.mViewLifecycleOwner
            st3 r2 = defpackage.st3.ON_STOP
            r0.a(r2)
        L18:
            ku3 r0 = r3.mLifecycleRegistry
            st3 r2 = defpackage.st3.ON_STOP
            r0.f(r2)
            r3.mState = r1
            r0 = 0
            r3.mCalled = r0
            r3.onStop()
            boolean r0 = r3.mCalled
            if (r0 == 0) goto L2c
            return
        L2c:
            eu6 r0 = new eu6
            java.lang.String r1 = "Fragment "
            java.lang.String r2 = " did not call through to super.onStop()"
            java.lang.String r3 = defpackage.lb1.l(r1, r3, r2)
            r0.<init>(r3)
            throw r0
    }

    public void performViewCreated() {
            r2 = this;
            android.os.Bundle r0 = r2.mSavedFragmentState
            if (r0 == 0) goto Lb
            java.lang.String r1 = "savedInstanceState"
            android.os.Bundle r0 = r0.getBundle(r1)
            goto Lc
        Lb:
            r0 = 0
        Lc:
            android.view.View r1 = r2.mView
            r2.onViewCreated(r1, r0)
            androidx.fragment.app.u r2 = r2.mChildFragmentManager
            r0 = 2
            r2.u(r0)
            return
    }

    public void postponeEnterTransition() {
            r1 = this;
            rk2 r1 = r1.a()
            r0 = 1
            r1.s = r0
            return
    }

    public final void postponeEnterTransition(long r3, java.util.concurrent.TimeUnit r5) {
            r2 = this;
            rk2 r0 = r2.a()
            r1 = 1
            r0.s = r1
            android.os.Handler r0 = r2.mPostponedHandler
            if (r0 == 0) goto L10
            java.lang.Runnable r1 = r2.mPostponedDurationRunnable
            r0.removeCallbacks(r1)
        L10:
            androidx.fragment.app.u r0 = r2.mFragmentManager
            if (r0 == 0) goto L1b
            cl2 r0 = r0.w
            android.os.Handler r0 = r0.L
            r2.mPostponedHandler = r0
            goto L26
        L1b:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.mPostponedHandler = r0
        L26:
            android.os.Handler r0 = r2.mPostponedHandler
            java.lang.Runnable r1 = r2.mPostponedDurationRunnable
            r0.removeCallbacks(r1)
            android.os.Handler r0 = r2.mPostponedHandler
            java.lang.Runnable r2 = r2.mPostponedDurationRunnable
            long r3 = r5.toMillis(r3)
            r0.postDelayed(r2, r3)
            return
    }

    public final <I, O> defpackage.d9 registerForActivityResult(defpackage.b9 r2, defpackage.a9 r3) {
            r1 = this;
            androidx.fragment.app.n r0 = new androidx.fragment.app.n
            r0.<init>(r1)
            ok2 r1 = r1.g(r2, r0, r3)
            return r1
    }

    public final <I, O> defpackage.d9 registerForActivityResult(defpackage.b9 r3, defpackage.j9 r4, defpackage.a9 r5) {
            r2 = this;
            d51 r0 = new d51
            r1 = 19
            r0.<init>(r4, r1)
            ok2 r2 = r2.g(r3, r0, r5)
            return r2
    }

    public void registerForContextMenu(android.view.View r1) {
            r0 = this;
            r1.setOnCreateContextMenuListener(r0)
            return
    }

    @java.lang.Deprecated
    public final void requestPermissions(java.lang.String[] r3, int r4) {
            r2 = this;
            cl2 r0 = r2.mHost
            if (r0 == 0) goto L27
            androidx.fragment.app.u r0 = r2.getParentFragmentManager()
            i9 r1 = r0.E
            if (r1 == 0) goto L1e
            il2 r1 = new il2
            java.lang.String r2 = r2.mWho
            r1.<init>(r2, r4)
            java.util.ArrayDeque r2 = r0.F
            r2.addLast(r1)
            i9 r2 = r0.E
            r2.a(r3)
            return
        L1e:
            cl2 r2 = r0.w
            r2.getClass()
            r3.getClass()
            return
        L27:
            java.lang.String r3 = "Fragment "
            java.lang.String r4 = " not attached to Activity"
            java.lang.String r2 = defpackage.lb1.l(r3, r2, r4)
            defpackage.i.m(r2)
            return
    }

    public final androidx.fragment.app.p requireActivity() {
            r2 = this;
            androidx.fragment.app.p r0 = r2.getActivity()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.String r0 = "Fragment "
            java.lang.String r1 = " not attached to an activity."
            java.lang.String r2 = defpackage.lb1.l(r0, r2, r1)
            defpackage.i.m(r2)
            r2 = 0
            return r2
    }

    public final android.os.Bundle requireArguments() {
            r2 = this;
            android.os.Bundle r0 = r2.getArguments()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.String r0 = "Fragment "
            java.lang.String r1 = " does not have any arguments."
            java.lang.String r2 = defpackage.lb1.l(r0, r2, r1)
            defpackage.i.m(r2)
            r2 = 0
            return r2
    }

    public final android.content.Context requireContext() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.String r0 = "Fragment "
            java.lang.String r1 = " not attached to a context."
            java.lang.String r2 = defpackage.lb1.l(r0, r2, r1)
            defpackage.i.m(r2)
            r2 = 0
            return r2
    }

    @java.lang.Deprecated
    public final androidx.fragment.app.u requireFragmentManager() {
            r0 = this;
            androidx.fragment.app.u r0 = r0.getParentFragmentManager()
            return r0
    }

    public final java.lang.Object requireHost() {
            r2 = this;
            java.lang.Object r0 = r2.getHost()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.String r0 = "Fragment "
            java.lang.String r1 = " not attached to a host."
            java.lang.String r2 = defpackage.lb1.l(r0, r2, r1)
            defpackage.i.m(r2)
            r2 = 0
            return r2
    }

    public final androidx.fragment.app.o requireParentFragment() {
            r3 = this;
            androidx.fragment.app.o r0 = r3.getParentFragment()
            if (r0 != 0) goto L37
            android.content.Context r0 = r3.getContext()
            java.lang.String r1 = "Fragment "
            if (r0 != 0) goto L19
            java.lang.String r0 = " is not attached to any Fragment or host"
            java.lang.String r3 = defpackage.lb1.l(r1, r3, r0)
            defpackage.i.m(r3)
            r3 = 0
            return r3
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r3)
            android.content.Context r3 = r3.getContext()
            java.lang.String r1 = " is not a child Fragment, it is directly attached to "
            r2.append(r1)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            r0.<init>(r3)
            throw r0
        L37:
            return r0
    }

    public final android.view.View requireView() {
            r2 = this;
            android.view.View r0 = r2.getView()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.String r0 = "Fragment "
            java.lang.String r1 = " did not return a View from onCreateView() or this was called before onCreateView()."
            java.lang.String r2 = defpackage.lb1.l(r0, r2, r1)
            defpackage.i.m(r2)
            r2 = 0
            return r2
    }

    public void restoreChildFragmentState() {
            r2 = this;
            android.os.Bundle r0 = r2.mSavedFragmentState
            if (r0 == 0) goto L20
            java.lang.String r1 = "childFragmentManager"
            android.os.Bundle r0 = r0.getBundle(r1)
            if (r0 == 0) goto L20
            androidx.fragment.app.u r1 = r2.mChildFragmentManager
            r1.V(r0)
            androidx.fragment.app.u r2 = r2.mChildFragmentManager
            r0 = 0
            r2.H = r0
            r2.I = r0
            androidx.fragment.app.v r1 = r2.O
            r1.g = r0
            r0 = 1
            r2.u(r0)
        L20:
            return
    }

    public final void restoreViewState(android.os.Bundle r3) {
            r2 = this;
            android.util.SparseArray<android.os.Parcelable> r0 = r2.mSavedViewState
            if (r0 == 0) goto Lc
            android.view.View r1 = r2.mView
            r1.restoreHierarchyState(r0)
            r0 = 0
            r2.mSavedViewState = r0
        Lc:
            r0 = 0
            r2.mCalled = r0
            r2.onViewStateRestored(r3)
            boolean r3 = r2.mCalled
            if (r3 == 0) goto L22
            android.view.View r3 = r2.mView
            if (r3 == 0) goto L21
            androidx.fragment.app.z r2 = r2.mViewLifecycleOwner
            st3 r3 = defpackage.st3.ON_CREATE
            r2.a(r3)
        L21:
            return
        L22:
            eu6 r3 = new eu6
            java.lang.String r0 = "Fragment "
            java.lang.String r1 = " did not call through to super.onViewStateRestored()"
            java.lang.String r2 = defpackage.lb1.l(r0, r2, r1)
            r3.<init>(r2)
            throw r3
    }

    public void setAllowEnterTransitionOverlap(boolean r1) {
            r0 = this;
            rk2 r0 = r0.a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.p = r1
            return
    }

    public void setAllowReturnTransitionOverlap(boolean r1) {
            r0 = this;
            rk2 r0 = r0.a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.o = r1
            return
    }

    public void setAnimations(int r2, int r3, int r4, int r5) {
            r1 = this;
            rk2 r0 = r1.mAnimationInfo
            if (r0 != 0) goto Ld
            if (r2 != 0) goto Ld
            if (r3 != 0) goto Ld
            if (r4 != 0) goto Ld
            if (r5 != 0) goto Ld
            return
        Ld:
            rk2 r0 = r1.a()
            r0.b = r2
            rk2 r2 = r1.a()
            r2.c = r3
            rk2 r2 = r1.a()
            r2.d = r4
            rk2 r1 = r1.a()
            r1.e = r5
            return
    }

    public void setArguments(android.os.Bundle r2) {
            r1 = this;
            androidx.fragment.app.u r0 = r1.mFragmentManager
            if (r0 == 0) goto L11
            boolean r0 = r1.isStateSaved()
            if (r0 != 0) goto Lb
            goto L11
        Lb:
            java.lang.String r1 = "Fragment already added and state has been saved"
            defpackage.i.m(r1)
            return
        L11:
            r1.mArguments = r2
            return
    }

    public void setEnterSharedElementCallback(defpackage.hf6 r1) {
            r0 = this;
            rk2 r0 = r0.a()
            r0.getClass()
            return
    }

    public void setEnterTransition(java.lang.Object r1) {
            r0 = this;
            rk2 r0 = r0.a()
            r0.i = r1
            return
    }

    public void setExitSharedElementCallback(defpackage.hf6 r1) {
            r0 = this;
            rk2 r0 = r0.a()
            r0.getClass()
            return
    }

    public void setExitTransition(java.lang.Object r1) {
            r0 = this;
            rk2 r0 = r0.a()
            r0.k = r1
            return
    }

    public void setFocusedView(android.view.View r1) {
            r0 = this;
            rk2 r0 = r0.a()
            r0.r = r1
            return
    }

    @java.lang.Deprecated
    public void setHasOptionsMenu(boolean r2) {
            r1 = this;
            boolean r0 = r1.mHasMenu
            if (r0 == r2) goto L1b
            r1.mHasMenu = r2
            boolean r2 = r1.isAdded()
            if (r2 == 0) goto L1b
            boolean r2 = r1.isHidden()
            if (r2 != 0) goto L1b
            cl2 r1 = r1.mHost
            vk2 r1 = (defpackage.vk2) r1
            jq r1 = r1.X
            r1.invalidateOptionsMenu()
        L1b:
            return
    }

    public void setInitialSavedState(defpackage.tk2 r2) {
            r1 = this;
            androidx.fragment.app.u r0 = r1.mFragmentManager
            if (r0 != 0) goto Lf
            if (r2 == 0) goto Lb
            android.os.Bundle r2 = r2.A
            if (r2 == 0) goto Lb
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.mSavedFragmentState = r2
            return
        Lf:
            java.lang.String r1 = "Fragment already added"
            defpackage.i.m(r1)
            return
    }

    public void setMenuVisibility(boolean r2) {
            r1 = this;
            boolean r0 = r1.mMenuVisible
            if (r0 == r2) goto L1f
            r1.mMenuVisible = r2
            boolean r2 = r1.mHasMenu
            if (r2 == 0) goto L1f
            boolean r2 = r1.isAdded()
            if (r2 == 0) goto L1f
            boolean r2 = r1.isHidden()
            if (r2 != 0) goto L1f
            cl2 r1 = r1.mHost
            vk2 r1 = (defpackage.vk2) r1
            jq r1 = r1.X
            r1.invalidateOptionsMenu()
        L1f:
            return
    }

    public void setNextTransition(int r2) {
            r1 = this;
            rk2 r0 = r1.mAnimationInfo
            if (r0 != 0) goto L7
            if (r2 != 0) goto L7
            return
        L7:
            r1.a()
            rk2 r1 = r1.mAnimationInfo
            r1.f = r2
            return
    }

    public void setPopDirection(boolean r2) {
            r1 = this;
            rk2 r0 = r1.mAnimationInfo
            if (r0 != 0) goto L5
            return
        L5:
            rk2 r1 = r1.a()
            r1.a = r2
            return
    }

    public void setPostOnViewCreatedAlpha(float r1) {
            r0 = this;
            rk2 r0 = r0.a()
            r0.q = r1
            return
    }

    public void setReenterTransition(java.lang.Object r1) {
            r0 = this;
            rk2 r0 = r0.a()
            r0.l = r1
            return
    }

    @java.lang.Deprecated
    public void setRetainInstance(boolean r4) {
            r3 = this;
            sl2 r0 = defpackage.tl2.a
            wr2 r0 = new wr2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Attempting to set retain instance for fragment "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r3, r1)
            defpackage.tl2.b(r0)
            sl2 r0 = defpackage.tl2.a(r3)
            r0.getClass()
            rl2 r0 = defpackage.rl2.PENALTY_LOG
            r3.mRetainInstance = r4
            androidx.fragment.app.u r0 = r3.mFragmentManager
            if (r0 == 0) goto L33
            androidx.fragment.app.v r0 = r0.O
            if (r4 == 0) goto L2f
            r0.e(r3)
            return
        L2f:
            r0.i(r3)
            return
        L33:
            r4 = 1
            r3.mRetainInstanceChangedWhileDetached = r4
            return
    }

    public void setReturnTransition(java.lang.Object r1) {
            r0 = this;
            rk2 r0 = r0.a()
            r0.j = r1
            return
    }

    public void setSharedElementEnterTransition(java.lang.Object r1) {
            r0 = this;
            rk2 r0 = r0.a()
            r0.m = r1
            return
    }

    public void setSharedElementNames(java.util.ArrayList<java.lang.String> r1, java.util.ArrayList<java.lang.String> r2) {
            r0 = this;
            r0.a()
            rk2 r0 = r0.mAnimationInfo
            r0.g = r1
            r0.h = r2
            return
    }

    public void setSharedElementReturnTransition(java.lang.Object r1) {
            r0 = this;
            rk2 r0 = r0.a()
            r0.n = r1
            return
    }

    @java.lang.Deprecated
    public void setTargetFragment(androidx.fragment.app.o r4, int r5) {
            r3 = this;
            if (r4 == 0) goto L33
            sl2 r0 = defpackage.tl2.a
            xr2 r0 = new xr2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Attempting to set target fragment "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r2 = " with request code "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = " for fragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r3, r1)
            defpackage.tl2.b(r0)
            sl2 r0 = defpackage.tl2.a(r3)
            r0.getClass()
            rl2 r0 = defpackage.rl2.PENALTY_LOG
        L33:
            androidx.fragment.app.u r0 = r3.mFragmentManager
            r1 = 0
            if (r4 == 0) goto L3b
            androidx.fragment.app.u r2 = r4.mFragmentManager
            goto L3c
        L3b:
            r2 = r1
        L3c:
            if (r0 == 0) goto L4f
            if (r2 == 0) goto L4f
            if (r0 != r2) goto L43
            goto L4f
        L43:
            java.lang.String r3 = "Fragment "
            java.lang.String r5 = " must share the same FragmentManager to be set as a target fragment"
            java.lang.String r3 = defpackage.lb1.l(r3, r4, r5)
            defpackage.i.h(r3)
            return
        L4f:
            r0 = r4
        L50:
            if (r0 == 0) goto L7f
            boolean r2 = r0.equals(r3)
            if (r2 != 0) goto L5e
            r2 = 0
            androidx.fragment.app.o r0 = r0.e(r2)
            goto L50
        L5e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Setting "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = " as the target of "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r3 = " would create a target cycle"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r5.<init>(r3)
            throw r5
        L7f:
            if (r4 != 0) goto L86
            r3.mTargetWho = r1
            r3.mTarget = r1
            goto L99
        L86:
            androidx.fragment.app.u r0 = r3.mFragmentManager
            if (r0 == 0) goto L95
            androidx.fragment.app.u r0 = r4.mFragmentManager
            if (r0 == 0) goto L95
            java.lang.String r4 = r4.mWho
            r3.mTargetWho = r4
            r3.mTarget = r1
            goto L99
        L95:
            r3.mTargetWho = r1
            r3.mTarget = r4
        L99:
            r3.mTargetRequestCode = r5
            return
    }

    @java.lang.Deprecated
    public void setUserVisibleHint(boolean r8) {
            r7 = this;
            sl2 r0 = defpackage.tl2.a
            pl2 r0 = new pl2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Attempting to set user visible hint to "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r2 = " for fragment "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r7, r1)
            defpackage.tl2.b(r0)
            sl2 r0 = defpackage.tl2.a(r7)
            r0.getClass()
            rl2 r0 = defpackage.rl2.PENALTY_LOG
            boolean r0 = r7.mUserVisibleHint
            r1 = 0
            r2 = 1
            r3 = 5
            if (r0 != 0) goto L5c
            if (r8 == 0) goto L5c
            int r0 = r7.mState
            if (r0 >= r3) goto L5c
            androidx.fragment.app.u r0 = r7.mFragmentManager
            if (r0 == 0) goto L5c
            boolean r0 = r7.isAdded()
            if (r0 == 0) goto L5c
            boolean r0 = r7.mIsCreated
            if (r0 == 0) goto L5c
            androidx.fragment.app.u r0 = r7.mFragmentManager
            androidx.fragment.app.x r4 = r0.g(r7)
            androidx.fragment.app.o r5 = r4.c
            boolean r6 = r5.mDeferStart
            if (r6 == 0) goto L5c
            boolean r6 = r0.b
            if (r6 == 0) goto L57
            r0.K = r2
            goto L5c
        L57:
            r5.mDeferStart = r1
            r4.k()
        L5c:
            r7.mUserVisibleHint = r8
            int r0 = r7.mState
            if (r0 >= r3) goto L65
            if (r8 != 0) goto L65
            r1 = r2
        L65:
            r7.mDeferStart = r1
            android.os.Bundle r0 = r7.mSavedFragmentState
            if (r0 == 0) goto L71
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r7.mSavedUserVisibleHint = r8
        L71:
            return
    }

    public boolean shouldShowRequestPermissionRationale(java.lang.String r5) {
            r4 = this;
            cl2 r4 = r4.mHost
            if (r4 == 0) goto L53
            vk2 r4 = (defpackage.vk2) r4
            jq r4 = r4.X
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 >= r1) goto L17
            java.lang.String r1 = "android.permission.POST_NOTIFICATIONS"
            boolean r1 = android.text.TextUtils.equals(r1, r5)
            if (r1 == 0) goto L17
            goto L53
        L17:
            r1 = 32
            if (r0 < r1) goto L20
            boolean r4 = r4.shouldShowRequestPermissionRationale(r5)
            return r4
        L20:
            r1 = 31
            if (r0 != r1) goto L4e
            android.app.Application r0 = r4.getApplication()     // Catch: java.lang.Throwable -> L49
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L49
            java.lang.Class<android.content.pm.PackageManager> r1 = android.content.pm.PackageManager.class
            java.lang.String r2 = "shouldShowRequestPermissionRationale"
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> L49
            java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L49
            java.lang.Object[] r2 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L49
            java.lang.Object r0 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L49
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L49
            boolean r4 = r0.booleanValue()     // Catch: java.lang.Throwable -> L49
            return r4
        L49:
            boolean r4 = r4.shouldShowRequestPermissionRationale(r5)
            return r4
        L4e:
            boolean r4 = r4.shouldShowRequestPermissionRationale(r5)
            return r4
        L53:
            r4 = 0
            return r4
    }

    public void startActivity(android.content.Intent r2) {
            r1 = this;
            r0 = 0
            r1.startActivity(r2, r0)
            return
    }

    public void startActivity(android.content.Intent r2, android.os.Bundle r3) {
            r1 = this;
            cl2 r0 = r1.mHost
            if (r0 == 0) goto Ld
            r2.getClass()
            jq r1 = r0.B
            r1.startActivity(r2, r3)
            return
        Ld:
            java.lang.String r2 = "Fragment "
            java.lang.String r3 = " not attached to Activity"
            java.lang.String r1 = defpackage.lb1.l(r2, r1, r3)
            defpackage.i.m(r1)
            return
    }

    @java.lang.Deprecated
    public void startActivityForResult(android.content.Intent r2, int r3) {
            r1 = this;
            r0 = 0
            r1.startActivityForResult(r2, r3, r0)
            return
    }

    @java.lang.Deprecated
    public void startActivityForResult(android.content.Intent r3, int r4, android.os.Bundle r5) {
            r2 = this;
            cl2 r0 = r2.mHost
            if (r0 == 0) goto L3c
            androidx.fragment.app.u r0 = r2.getParentFragmentManager()
            i9 r1 = r0.C
            if (r1 == 0) goto L25
            il2 r1 = new il2
            java.lang.String r2 = r2.mWho
            r1.<init>(r2, r4)
            java.util.ArrayDeque r2 = r0.F
            r2.addLast(r1)
            if (r5 == 0) goto L1f
            java.lang.String r2 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
            r3.putExtra(r2, r5)
        L1f:
            i9 r2 = r0.C
            r2.a(r3)
            return
        L25:
            cl2 r2 = r0.w
            r2.getClass()
            r3.getClass()
            r0 = -1
            if (r4 != r0) goto L36
            jq r2 = r2.B
            r2.startActivity(r3, r5)
            return
        L36:
            java.lang.String r2 = "Starting activity with a requestCode requires a FragmentActivity host"
            defpackage.i.m(r2)
            return
        L3c:
            java.lang.String r3 = "Fragment "
            java.lang.String r4 = " not attached to Activity"
            java.lang.String r2 = defpackage.lb1.l(r3, r2, r4)
            defpackage.i.m(r2)
            return
    }

    @java.lang.Deprecated
    public void startIntentSenderForResult(android.content.IntentSender r10, int r11, android.content.Intent r12, int r13, int r14, int r15, android.os.Bundle r16) {
            r9 = this;
            r7 = r16
            cl2 r0 = r9.mHost
            java.lang.String r1 = "Fragment "
            if (r0 == 0) goto Lda
            r0 = 2
            boolean r2 = androidx.fragment.app.u.K(r0)
            java.lang.String r3 = "FragmentManager"
            if (r2 == 0) goto L40
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r9)
            java.lang.String r4 = " received the following in startIntentSenderForResult() requestCode: "
            r2.append(r4)
            r2.append(r11)
            java.lang.String r4 = " IntentSender: "
            r2.append(r4)
            r2.append(r10)
            java.lang.String r4 = " fillInIntent: "
            r2.append(r4)
            r2.append(r12)
            java.lang.String r4 = " options: "
            r2.append(r4)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r3, r2)
        L40:
            androidx.fragment.app.u r2 = r9.getParentFragmentManager()
            i9 r4 = r2.D
            if (r4 == 0) goto Lb7
            if (r7 == 0) goto L83
            if (r12 != 0) goto L57
            android.content.Intent r12 = new android.content.Intent
            r12.<init>()
            java.lang.String r4 = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE"
            r5 = 1
            r12.putExtra(r4, r5)
        L57:
            boolean r4 = androidx.fragment.app.u.K(r0)
            if (r4 == 0) goto L7e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "ActivityOptions "
            r4.<init>(r5)
            r4.append(r7)
            java.lang.String r5 = " were added to fillInIntent "
            r4.append(r5)
            r4.append(r12)
            java.lang.String r5 = " for fragment "
            r4.append(r5)
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            android.util.Log.v(r3, r4)
        L7e:
            java.lang.String r4 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
            r12.putExtra(r4, r7)
        L83:
            r10.getClass()
            s93 r4 = new s93
            r4.<init>(r10, r12, r13, r14)
            il2 r10 = new il2
            java.lang.String r12 = r9.mWho
            r10.<init>(r12, r11)
            java.util.ArrayDeque r11 = r2.F
            r11.addLast(r10)
            boolean r10 = androidx.fragment.app.u.K(r0)
            if (r10 == 0) goto Lb1
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r1)
            r10.append(r9)
            java.lang.String r9 = "is launching an IntentSender for result "
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            android.util.Log.v(r3, r9)
        Lb1:
            i9 r9 = r2.D
            r9.a(r4)
            return
        Lb7:
            cl2 r9 = r2.w
            r9.getClass()
            r10.getClass()
            r0 = -1
            java.lang.String r8 = "Starting intent sender with a requestCode requires a FragmentActivity host"
            if (r11 != r0) goto Ld6
            jq r0 = r9.A
            if (r0 == 0) goto Ld2
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r0.startIntentSenderForResult(r1, r2, r3, r4, r5, r6, r7)
            return
        Ld2:
            defpackage.i.m(r8)
            return
        Ld6:
            defpackage.i.m(r8)
            return
        Lda:
            java.lang.String r10 = " not attached to Activity"
            java.lang.String r9 = defpackage.lb1.l(r1, r9, r10)
            defpackage.i.m(r9)
            return
    }

    public void startPostponedEnterTransition() {
            r3 = this;
            rk2 r0 = r3.mAnimationInfo
            if (r0 == 0) goto L39
            rk2 r0 = r3.a()
            boolean r0 = r0.s
            if (r0 != 0) goto Ld
            goto L39
        Ld:
            cl2 r0 = r3.mHost
            if (r0 != 0) goto L19
            rk2 r3 = r3.a()
            r0 = 0
            r3.s = r0
            return
        L19:
            android.os.Looper r0 = android.os.Looper.myLooper()
            cl2 r1 = r3.mHost
            android.os.Handler r1 = r1.L
            android.os.Looper r1 = r1.getLooper()
            if (r0 == r1) goto L35
            cl2 r0 = r3.mHost
            android.os.Handler r0 = r0.L
            pk2 r1 = new pk2
            r2 = 1
            r1.<init>(r3, r2)
            r0.postAtFrontOfQueue(r1)
            return
        L35:
            r0 = 1
            r3.callStartTransitionListener(r0)
        L39:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = "{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "} ("
            r0.append(r1)
            java.lang.String r1 = r2.mWho
            r0.append(r1)
            int r1 = r2.mFragmentId
            if (r1 == 0) goto L3e
            java.lang.String r1 = " id=0x"
            r0.append(r1)
            int r1 = r2.mFragmentId
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
        L3e:
            java.lang.String r1 = r2.mTag
            if (r1 == 0) goto L4c
            java.lang.String r1 = " tag="
            r0.append(r1)
            java.lang.String r2 = r2.mTag
            r0.append(r2)
        L4c:
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public void unregisterForContextMenu(android.view.View r1) {
            r0 = this;
            r0 = 0
            r1.setOnCreateContextMenuListener(r0)
            return
    }
}
