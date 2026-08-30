package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public abstract class o implements ComponentCallbacks, View.OnCreateContextMenuListener, fn3, ab7, lq2, au5 {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    sf2 mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    xa7 mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    u mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    dg2 mHost;
    boolean mInDynamicContainer;
    boolean mInLayout;
    boolean mIsCreated;
    LayoutInflater mLayoutInflater;
    in3 mLifecycleRegistry;
    o mParentFragment;
    boolean mPerformedCreateView;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    yt5 mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    String mTag;
    o mTarget;
    int mTargetRequestCode;
    boolean mTransitioning;
    View mView;
    z mViewLifecycleOwner;
    int mState = INITIALIZING;
    String mWho = UUID.randomUUID().toString();
    String mTargetWho = null;
    private Boolean mIsPrimaryNavigationFragment = null;
    u mChildFragmentManager = new u();
    boolean mMenuVisible = true;
    boolean mUserVisibleHint = true;
    Runnable mPostponedDurationRunnable = new qf2(this, 0);
    qm3 mMaxState = qm3.RESUMED;
    m14 mViewLifecycleOwnerLiveData = new pq3();
    private final AtomicInteger mNextLocalRequestCode = new AtomicInteger();
    private final ArrayList<tf2> mOnPreAttachedListeners = new ArrayList<>();
    private final tf2 mSavedStateAttachListener = new k(this);

    /* JADX WARN: Type inference failed for: r0v8, types: [m14, pq3] */
    public o() {
        f();
    }

    @Deprecated
    public static o instantiate(Context context, String str, Bundle bundle) {
        try {
            o oVar = (o) hg2.c(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle != null) {
                bundle.setClassLoader(oVar.getClass().getClassLoader());
                oVar.setArguments(bundle);
                return oVar;
            }
            return oVar;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(wh1.A("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(wh1.A("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(wh1.A("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(wh1.A("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, sf2] */
    public final sf2 a() {
        if (this.mAnimationInfo == null) {
            ?? obj = new Object();
            obj.i = null;
            Object obj2 = USE_DEFAULT_TRANSITION;
            obj.j = obj2;
            obj.k = null;
            obj.l = obj2;
            obj.m = null;
            obj.n = obj2;
            obj.q = 1.0f;
            obj.r = null;
            this.mAnimationInfo = obj;
        }
        return this.mAnimationInfo;
    }

    public final int c() {
        qm3 qm3Var = this.mMaxState;
        if (qm3Var != qm3.INITIALIZED && this.mParentFragment != null) {
            return Math.min(qm3Var.ordinal(), this.mParentFragment.c());
        }
        return qm3Var.ordinal();
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        u uVar;
        sf2 sf2Var = this.mAnimationInfo;
        if (sf2Var != null) {
            sf2Var.s = false;
        }
        if (this.mView != null && (viewGroup = this.mContainer) != null && (uVar = this.mFragmentManager) != null) {
            h j = h.j(viewGroup, uVar);
            j.l();
            if (z) {
                this.mHost.L.post(new es4(9, j));
            } else {
                j.e();
            }
            Handler handler = this.mPostponedHandler;
            if (handler != null) {
                handler.removeCallbacks(this.mPostponedDurationRunnable);
                this.mPostponedHandler = null;
            }
        }
    }

    public ag2 createFragmentContainer() {
        return new l(this);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        o e = e(false);
        if (e != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(e);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            za7 viewModelStore = getViewModelStore();
            viewModelStore.getClass();
            x31 x31Var = x31.b;
            x31Var.getClass();
            q9 q9Var = new q9(viewModelStore, sq3.c, x31Var);
            qo0 a = q75.a(sq3.class);
            String b = a.b();
            if (b != null) {
                ec6 ec6Var = ((sq3) q9Var.F(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b))).b;
                if (ec6Var.g() > 0) {
                    printWriter.print(str);
                    printWriter.println("Loaders:");
                    if (ec6Var.g() > 0) {
                        if (ec6Var.h(0) != null) {
                            c44.b();
                            return;
                        }
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(ec6Var.e(0));
                        printWriter.print(": ");
                        throw null;
                    }
                }
            } else {
                defpackage.i.i("Local and anonymous classes can not be ViewModels");
                return;
            }
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        u uVar = this.mChildFragmentManager;
        uVar.v(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final o e(boolean z) {
        String str;
        if (z) {
            tg2 tg2Var = ug2.a;
            ug2.b(new hc7(this, "Attempting to get target fragment from fragment " + this));
            ug2.a(this).getClass();
            sg2 sg2Var = sg2.PENALTY_LOG;
        }
        o oVar = this.mTarget;
        if (oVar != null) {
            return oVar;
        }
        u uVar = this.mFragmentManager;
        if (uVar != null && (str = this.mTargetWho) != null) {
            return uVar.c.b(str);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return false;
        }
        return true;
    }

    public final void f() {
        this.mLifecycleRegistry = new in3(this, true);
        this.mSavedStateRegistryController = new yt5(new zt5(this, new bz2(25, this)));
        this.mDefaultFactory = null;
        if (!this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            tf2 tf2Var = this.mSavedStateAttachListener;
            if (this.mState >= 0) {
                tf2Var.a();
            } else {
                this.mOnPreAttachedListeners.add(tf2Var);
            }
        }
    }

    public o findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager.c.c(str);
    }

    public final pf2 g(a9 a9Var, ij2 ij2Var, z8 z8Var) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            rf2 rf2Var = new rf2(this, ij2Var, atomicReference, a9Var, z8Var);
            if (this.mState >= 0) {
                rf2Var.a();
            } else {
                this.mOnPreAttachedListeners.add(rf2Var);
            }
            return new pf2(atomicReference);
        }
        defpackage.i.n(wh1.k("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        return null;
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final p getActivity() {
        dg2 dg2Var = this.mHost;
        if (dg2Var == null) {
            return null;
        }
        return dg2Var.A;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        sf2 sf2Var = this.mAnimationInfo;
        if (sf2Var != null && (bool = sf2Var.p) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        sf2 sf2Var = this.mAnimationInfo;
        if (sf2Var != null && (bool = sf2Var.o) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public View getAnimatingAway() {
        sf2 sf2Var = this.mAnimationInfo;
        if (sf2Var == null) {
            return null;
        }
        sf2Var.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final u getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        defpackage.i.n(wh1.k("Fragment ", this, " has not been attached yet."));
        return null;
    }

    public Context getContext() {
        dg2 dg2Var = this.mHost;
        if (dg2Var == null) {
            return null;
        }
        return dg2Var.B;
    }

    @Override // defpackage.lq2
    public z31 getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        if (application == null && u.K(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        g14 g14Var = new g14(0);
        LinkedHashMap linkedHashMap = g14Var.a;
        if (application != null) {
            linkedHashMap.put(wa7.d, application);
        }
        linkedHashMap.put(st5.a, this);
        linkedHashMap.put(st5.b, this);
        if (getArguments() != null) {
            linkedHashMap.put(st5.c, getArguments());
        }
        return g14Var;
    }

    @Override // defpackage.lq2
    public xa7 getDefaultViewModelProviderFactory() {
        Application application = null;
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                Context applicationContext = requireContext().getApplicationContext();
                while (true) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        break;
                    } else if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    } else {
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
                }
                if (application == null && u.K(3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.mDefaultFactory = new bu5(application, this, getArguments());
            }
            return this.mDefaultFactory;
        }
        defpackage.i.n("Can't access ViewModels from detached fragment");
        return null;
    }

    public int getEnterAnim() {
        sf2 sf2Var = this.mAnimationInfo;
        if (sf2Var == null) {
            return 0;
        }
        return sf2Var.b;
    }

    public Object getEnterTransition() {
        sf2 sf2Var = this.mAnimationInfo;
        if (sf2Var == null) {
            return null;
        }
        return sf2Var.i;
    }

    public v36 getEnterTransitionCallback() {
        sf2 sf2Var = this.mAnimationInfo;
        if (sf2Var == null) {
            return null;
        }
        sf2Var.getClass();
        return null;
    }

    public int getExitAnim() {
        sf2 sf2Var = this.mAnimationInfo;
        if (sf2Var == null) {
            return 0;
        }
        return sf2Var.c;
    }

    public Object getExitTransition() {
        sf2 sf2Var = this.mAnimationInfo;
        if (sf2Var == null) {
            return null;
        }
        return sf2Var.k;
    }

    public v36 getExitTransitionCallback() {
        sf2 sf2Var = this.mAnimationInfo;
        if (sf2Var == null) {
            return null;
        }
        sf2Var.getClass();
        return null;
    }

    public View getFocusedView() {
        sf2 sf2Var = this.mAnimationInfo;
        if (sf2Var == null) {
            return null;
        }
        return sf2Var.r;
    }

    @Deprecated
    public final u getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        dg2 dg2Var = this.mHost;
        if (dg2Var == null) {
            return null;
        }
        return ((wf2) dg2Var).X;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        dg2 dg2Var = this.mHost;
        if (dg2Var != null) {
            xp xpVar = ((wf2) dg2Var).X;
            LayoutInflater cloneInContext = xpVar.getLayoutInflater().cloneInContext(xpVar);
            cloneInContext.setFactory2(this.mChildFragmentManager.f);
            return cloneInContext;
        }
        defpackage.i.n("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        return null;
    }

    @Override // defpackage.fn3
    public rm3 getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public rq3 getLoaderManager() {
        return new tq3(this, getViewModelStore());
    }

    public int getNextTransition() {
        sf2 sf2Var = this.mAnimationInfo;
        if (sf2Var == null) {
            return 0;
        }
        return sf2Var.f;
    }

    public final o getParentFragment() {
        return this.mParentFragment;
    }

    public final u getParentFragmentManager() {
        u uVar = this.mFragmentManager;
        if (uVar != null) {
            return uVar;
        }
        defpackage.i.n(wh1.k("Fragment ", this, " not associated with a fragment manager."));
        return null;
    }

    public boolean getPopDirection() {
        sf2 sf2Var = this.mAnimationInfo;
        if (sf2Var == null) {
            return false;
        }
        return sf2Var.a;
    }

    public int getPopEnterAnim() {
        sf2 sf2Var = this.mAnimationInfo;
        if (sf2Var == null) {
            return 0;
        }
        return sf2Var.d;
    }

    public int getPopExitAnim() {
        sf2 sf2Var = this.mAnimationInfo;
        if (sf2Var == null) {
            return 0;
        }
        return sf2Var.e;
    }

    public float getPostOnViewCreatedAlpha() {
        sf2 sf2Var = this.mAnimationInfo;
        if (sf2Var == null) {
            return 1.0f;
        }
        return sf2Var.q;
    }

    public Object getReenterTransition() {
        sf2 sf2Var = this.mAnimationInfo;
        if (sf2Var == null) {
            return null;
        }
        Object obj = sf2Var.l;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getExitTransition();
        }
        return obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        tg2 tg2Var = ug2.a;
        ug2.b(new hc7(this, "Attempting to get retain instance for fragment " + this));
        ug2.a(this).getClass();
        sg2 sg2Var = sg2.PENALTY_LOG;
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        sf2 sf2Var = this.mAnimationInfo;
        if (sf2Var == null) {
            return null;
        }
        Object obj = sf2Var.j;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getEnterTransition();
        }
        return obj;
    }

    @Override // defpackage.au5
    public final xt5 getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b;
    }

    public Object getSharedElementEnterTransition() {
        sf2 sf2Var = this.mAnimationInfo;
        if (sf2Var == null) {
            return null;
        }
        return sf2Var.m;
    }

    public Object getSharedElementReturnTransition() {
        sf2 sf2Var = this.mAnimationInfo;
        if (sf2Var == null) {
            return null;
        }
        Object obj = sf2Var.n;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getSharedElementEnterTransition();
        }
        return obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        sf2 sf2Var = this.mAnimationInfo;
        if (sf2Var != null && (arrayList = sf2Var.g) != null) {
            return arrayList;
        }
        return new ArrayList<>();
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        sf2 sf2Var = this.mAnimationInfo;
        if (sf2Var != null && (arrayList = sf2Var.h) != null) {
            return arrayList;
        }
        return new ArrayList<>();
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final o getTargetFragment() {
        return e(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        tg2 tg2Var = ug2.a;
        ug2.b(new hc7(this, "Attempting to get target request code from fragment " + this));
        ug2.a(this).getClass();
        sg2 sg2Var = sg2.PENALTY_LOG;
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public fn3 getViewLifecycleOwner() {
        z zVar = this.mViewLifecycleOwner;
        if (zVar != null) {
            return zVar;
        }
        defpackage.i.n(wh1.k("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
        return null;
    }

    public pq3 getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // defpackage.ab7
    public za7 getViewModelStore() {
        if (this.mFragmentManager != null) {
            if (c() != qm3.INITIALIZED.ordinal()) {
                HashMap hashMap = this.mFragmentManager.O.d;
                za7 za7Var = (za7) hashMap.get(this.mWho);
                if (za7Var == null) {
                    za7 za7Var2 = new za7();
                    hashMap.put(this.mWho, za7Var2);
                    return za7Var2;
                }
                return za7Var;
            }
            defpackage.i.n("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        defpackage.i.n("Can't access ViewModels from detached fragment");
        return null;
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        f();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new u();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        if (this.mHost != null && this.mAdded) {
            return true;
        }
        return false;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        boolean isHidden;
        if (!this.mHidden) {
            u uVar = this.mFragmentManager;
            if (uVar != null) {
                o oVar = this.mParentFragment;
                uVar.getClass();
                if (oVar == null) {
                    isHidden = false;
                } else {
                    isHidden = oVar.isHidden();
                }
                if (isHidden) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean isInBackStack() {
        if (this.mBackStackNesting > 0) {
            return true;
        }
        return false;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        boolean isMenuVisible;
        if (this.mMenuVisible) {
            if (this.mFragmentManager != null) {
                o oVar = this.mParentFragment;
                if (oVar == null) {
                    isMenuVisible = true;
                } else {
                    isMenuVisible = oVar.isMenuVisible();
                }
                if (!isMenuVisible) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean isPostponed() {
        sf2 sf2Var = this.mAnimationInfo;
        if (sf2Var == null) {
            return false;
        }
        return sf2Var.s;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        if (this.mState >= RESUMED) {
            return true;
        }
        return false;
    }

    public final boolean isStateSaved() {
        u uVar = this.mFragmentManager;
        if (uVar == null) {
            return false;
        }
        if (!uVar.H && !uVar.I) {
            return false;
        }
        return true;
    }

    public final boolean isVisible() {
        View view;
        if (isAdded() && !isHidden() && (view = this.mView) != null && view.getWindowToken() != null && this.mView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.P();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (u.K(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        xp xpVar;
        this.mCalled = true;
        dg2 dg2Var = this.mHost;
        if (dg2Var == null) {
            xpVar = null;
        } else {
            xpVar = dg2Var.A;
        }
        if (xpVar != null) {
            this.mCalled = false;
            onAttach((Activity) xpVar);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        u uVar = this.mChildFragmentManager;
        if (uVar.v >= 1) {
            return;
        }
        uVar.H = false;
        uVar.I = false;
        uVar.O.g = false;
        uVar.u(1);
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        xp xpVar;
        this.mCalled = true;
        dg2 dg2Var = this.mHost;
        if (dg2Var == null) {
            xpVar = null;
        } else {
            xpVar = dg2Var.A;
        }
        if (xpVar != null) {
            this.mCalled = false;
            onInflate((Activity) xpVar, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        Bundle bundle2;
        this.mChildFragmentManager.P();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            if (u.K(3)) {
                Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
            }
            if (this.mView != null) {
                Bundle bundle3 = this.mSavedFragmentState;
                if (bundle3 != null) {
                    bundle2 = bundle3.getBundle("savedInstanceState");
                } else {
                    bundle2 = null;
                }
                restoreViewState(bundle2);
            }
            this.mSavedFragmentState = null;
            u uVar = this.mChildFragmentManager;
            uVar.H = false;
            uVar.I = false;
            uVar.O.g = false;
            uVar.u(4);
            return;
        }
        throw new AndroidRuntimeException(wh1.k("Fragment ", this, " did not call through to super.onActivityCreated()"));
    }

    public void performAttach() {
        ArrayList<tf2> arrayList = this.mOnPreAttachedListeners;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            tf2 tf2Var = arrayList.get(i);
            i++;
            tf2Var.a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach((Context) this.mHost.B);
        if (this.mCalled) {
            Iterator it = this.mFragmentManager.p.iterator();
            while (it.hasNext()) {
                ((pg2) it.next()).a(this);
            }
            u uVar = this.mChildFragmentManager;
            uVar.H = false;
            uVar.I = false;
            uVar.O.g = false;
            uVar.u(0);
            return;
        }
        throw new AndroidRuntimeException(wh1.k("Fragment ", this, " did not call through to super.onAttach()"));
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (onContextItemSelected(menuItem)) {
                return true;
            }
            return this.mChildFragmentManager.j(menuItem);
        }
        return false;
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.P();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new m(this));
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.f(pm3.ON_CREATE);
            return;
        }
        throw new AndroidRuntimeException(wh1.k("Fragment ", this, " did not call through to super.onCreate()"));
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        return this.mChildFragmentManager.k(menu, menuInflater) | z;
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.P();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new z(this, getViewModelStore(), new j(this));
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        z zVar = this.mViewLifecycleOwner;
        if (onCreateView != null) {
            zVar.c();
            if (u.K(3)) {
                Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
            }
            View view = this.mView;
            z zVar2 = this.mViewLifecycleOwner;
            view.getClass();
            view.setTag(R.id.view_tree_lifecycle_owner, zVar2);
            View view2 = this.mView;
            z zVar3 = this.mViewLifecycleOwner;
            view2.getClass();
            view2.setTag(R.id.view_tree_view_model_store_owner, zVar3);
            View view3 = this.mView;
            z zVar4 = this.mViewLifecycleOwner;
            view3.getClass();
            view3.setTag(R.id.view_tree_saved_state_registry_owner, zVar4);
            this.mViewLifecycleOwnerLiveData.f(this.mViewLifecycleOwner);
        } else if (zVar.X == null) {
            this.mViewLifecycleOwner = null;
        } else {
            defpackage.i.n("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public void performDestroy() {
        this.mChildFragmentManager.l();
        this.mLifecycleRegistry.f(pm3.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        throw new AndroidRuntimeException(wh1.k("Fragment ", this, " did not call through to super.onDestroy()"));
    }

    public void performDestroyView() {
        this.mChildFragmentManager.u(1);
        if (this.mView != null) {
            z zVar = this.mViewLifecycleOwner;
            zVar.c();
            if (zVar.X.d.isAtLeast(qm3.CREATED)) {
                this.mViewLifecycleOwner.a(pm3.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            za7 viewModelStore = getViewModelStore();
            viewModelStore.getClass();
            x31 x31Var = x31.b;
            x31Var.getClass();
            q9 q9Var = new q9(viewModelStore, sq3.c, x31Var);
            qo0 a = q75.a(sq3.class);
            String b = a.b();
            if (b != null) {
                ec6 ec6Var = ((sq3) q9Var.F(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b))).b;
                if (ec6Var.g() <= 0) {
                    this.mPerformedCreateView = false;
                    return;
                }
                ec6Var.h(0).getClass();
                c44.b();
                return;
            }
            defpackage.i.i("Local and anonymous classes can not be ViewModels");
            return;
        }
        throw new AndroidRuntimeException(wh1.k("Fragment ", this, " did not call through to super.onDestroyView()"));
    }

    public void performDetach() {
        this.mState = INITIALIZING;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            u uVar = this.mChildFragmentManager;
            if (!uVar.J) {
                uVar.l();
                this.mChildFragmentManager = new u();
                return;
            }
            return;
        }
        throw new AndroidRuntimeException(wh1.k("Fragment ", this, " did not call through to super.onDetach()"));
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
                return true;
            }
            return this.mChildFragmentManager.p(menuItem);
        }
        return false;
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.q(menu);
        }
    }

    public void performPause() {
        this.mChildFragmentManager.u(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(pm3.ON_PAUSE);
        }
        this.mLifecycleRegistry.f(pm3.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        throw new AndroidRuntimeException(wh1.k("Fragment ", this, " did not call through to super.onPause()"));
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        return this.mChildFragmentManager.t(menu) | z;
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean N = u.N(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool != null && bool.booleanValue() == N) {
            return;
        }
        this.mIsPrimaryNavigationFragment = Boolean.valueOf(N);
        onPrimaryNavigationFragmentChanged(N);
        u uVar = this.mChildFragmentManager;
        uVar.e0();
        uVar.r(uVar.z);
    }

    public void performResume() {
        this.mChildFragmentManager.P();
        this.mChildFragmentManager.z(true);
        this.mState = RESUMED;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            in3 in3Var = this.mLifecycleRegistry;
            pm3 pm3Var = pm3.ON_RESUME;
            in3Var.f(pm3Var);
            if (this.mView != null) {
                this.mViewLifecycleOwner.X.f(pm3Var);
            }
            u uVar = this.mChildFragmentManager;
            uVar.H = false;
            uVar.I = false;
            uVar.O.g = false;
            uVar.u(RESUMED);
            return;
        }
        throw new AndroidRuntimeException(wh1.k("Fragment ", this, " did not call through to super.onResume()"));
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.P();
        this.mChildFragmentManager.z(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            in3 in3Var = this.mLifecycleRegistry;
            pm3 pm3Var = pm3.ON_START;
            in3Var.f(pm3Var);
            if (this.mView != null) {
                this.mViewLifecycleOwner.X.f(pm3Var);
            }
            u uVar = this.mChildFragmentManager;
            uVar.H = false;
            uVar.I = false;
            uVar.O.g = false;
            uVar.u(5);
            return;
        }
        throw new AndroidRuntimeException(wh1.k("Fragment ", this, " did not call through to super.onStart()"));
    }

    public void performStop() {
        u uVar = this.mChildFragmentManager;
        uVar.I = true;
        uVar.O.g = true;
        uVar.u(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(pm3.ON_STOP);
        }
        this.mLifecycleRegistry.f(pm3.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        throw new AndroidRuntimeException(wh1.k("Fragment ", this, " did not call through to super.onStop()"));
    }

    public void performViewCreated() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        onViewCreated(this.mView, bundle);
        this.mChildFragmentManager.u(2);
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        a().s = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        u uVar = this.mFragmentManager;
        if (uVar != null) {
            this.mPostponedHandler = uVar.w.L;
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public final <I, O> c9 registerForActivityResult(a9 a9Var, i9 i9Var, z8 z8Var) {
        return g(a9Var, new t71(17, i9Var), z8Var);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i) {
        if (this.mHost != null) {
            u parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.E != null) {
                parentFragmentManager.F.addLast(new jg2(this.mWho, i));
                parentFragmentManager.E.a(strArr);
                return;
            }
            parentFragmentManager.w.getClass();
            strArr.getClass();
            return;
        }
        defpackage.i.n(wh1.k("Fragment ", this, " not attached to Activity"));
    }

    public final p requireActivity() {
        p activity = getActivity();
        if (activity != null) {
            return activity;
        }
        defpackage.i.n(wh1.k("Fragment ", this, " not attached to an activity."));
        return null;
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        defpackage.i.n(wh1.k("Fragment ", this, " does not have any arguments."));
        return null;
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        defpackage.i.n(wh1.k("Fragment ", this, " not attached to a context."));
        return null;
    }

    @Deprecated
    public final u requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        defpackage.i.n(wh1.k("Fragment ", this, " not attached to a host."));
        return null;
    }

    public final o requireParentFragment() {
        o parentFragment = getParentFragment();
        if (parentFragment == null) {
            if (getContext() == null) {
                defpackage.i.n(wh1.k("Fragment ", this, " is not attached to any Fragment or host"));
                return null;
            }
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(this);
            Context context = getContext();
            sb.append(" is not a child Fragment, it is directly attached to ");
            sb.append(context);
            throw new IllegalStateException(sb.toString());
        }
        return parentFragment;
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        defpackage.i.n(wh1.k("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
        return null;
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 != null && (bundle = bundle2.getBundle("childFragmentManager")) != null) {
            this.mChildFragmentManager.V(bundle);
            u uVar = this.mChildFragmentManager;
            uVar.H = false;
            uVar.I = false;
            uVar.O.g = false;
            uVar.u(1);
        }
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(pm3.ON_CREATE);
                return;
            }
            return;
        }
        throw new AndroidRuntimeException(wh1.k("Fragment ", this, " did not call through to super.onViewStateRestored()"));
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        a().p = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        a().o = Boolean.valueOf(z);
    }

    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        a().b = i;
        a().c = i2;
        a().d = i3;
        a().e = i4;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            defpackage.i.n("Fragment already added and state has been saved");
        } else {
            this.mArguments = bundle;
        }
    }

    public void setEnterSharedElementCallback(v36 v36Var) {
        a().getClass();
    }

    public void setEnterTransition(Object obj) {
        a().i = obj;
    }

    public void setExitSharedElementCallback(v36 v36Var) {
        a().getClass();
    }

    public void setExitTransition(Object obj) {
        a().k = obj;
    }

    public void setFocusedView(View view) {
        a().r = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                ((wf2) this.mHost).X.invalidateOptionsMenu();
            }
        }
    }

    public void setInitialSavedState(uf2 uf2Var) {
        if (this.mFragmentManager == null) {
            this.mSavedFragmentState = (uf2Var == null || (r2 = uf2Var.A) == null) ? null : null;
        } else {
            defpackage.i.n("Fragment already added");
        }
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                ((wf2) this.mHost).X.invalidateOptionsMenu();
            }
        }
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        a();
        this.mAnimationInfo.f = i;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        a().a = z;
    }

    public void setPostOnViewCreatedAlpha(float f) {
        a().q = f;
    }

    public void setReenterTransition(Object obj) {
        a().l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        tg2 tg2Var = ug2.a;
        ug2.b(new hc7(this, "Attempting to set retain instance for fragment " + this));
        ug2.a(this).getClass();
        sg2 sg2Var = sg2.PENALTY_LOG;
        this.mRetainInstance = z;
        u uVar = this.mFragmentManager;
        if (uVar != null) {
            v vVar = uVar.O;
            if (z) {
                vVar.e(this);
                return;
            } else {
                vVar.i(this);
                return;
            }
        }
        this.mRetainInstanceChangedWhileDetached = true;
    }

    public void setReturnTransition(Object obj) {
        a().j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        a().m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        a();
        sf2 sf2Var = this.mAnimationInfo;
        sf2Var.g = arrayList;
        sf2Var.h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        a().n = obj;
    }

    @Deprecated
    public void setTargetFragment(o oVar, int i) {
        u uVar;
        if (oVar != null) {
            tg2 tg2Var = ug2.a;
            ug2.b(new hc7(this, "Attempting to set target fragment " + oVar + " with request code " + i + " for fragment " + this));
            ug2.a(this).getClass();
            sg2 sg2Var = sg2.PENALTY_LOG;
        }
        u uVar2 = this.mFragmentManager;
        if (oVar != null) {
            uVar = oVar.mFragmentManager;
        } else {
            uVar = null;
        }
        if (uVar2 != null && uVar != null && uVar2 != uVar) {
            defpackage.i.i(wh1.k("Fragment ", oVar, " must share the same FragmentManager to be set as a target fragment"));
            return;
        }
        for (o oVar2 = oVar; oVar2 != null; oVar2 = oVar2.e(false)) {
            if (oVar2.equals(this)) {
                throw new IllegalArgumentException("Setting " + oVar + " as the target of " + this + " would create a target cycle");
            }
        }
        if (oVar == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager != null && oVar.mFragmentManager != null) {
            this.mTargetWho = oVar.mWho;
            this.mTarget = null;
        } else {
            this.mTargetWho = null;
            this.mTarget = oVar;
        }
        this.mTargetRequestCode = i;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        tg2 tg2Var = ug2.a;
        ug2.b(new hc7(this, "Attempting to set user visible hint to " + z + " for fragment " + this));
        ug2.a(this).getClass();
        sg2 sg2Var = sg2.PENALTY_LOG;
        boolean z2 = false;
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            u uVar = this.mFragmentManager;
            x g = uVar.g(this);
            o oVar = g.c;
            if (oVar.mDeferStart) {
                if (uVar.b) {
                    uVar.K = true;
                } else {
                    oVar.mDeferStart = false;
                    g.k();
                }
            }
        }
        this.mUserVisibleHint = z;
        if (this.mState < 5 && !z) {
            z2 = true;
        }
        this.mDeferStart = z2;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        dg2 dg2Var = this.mHost;
        if (dg2Var != null) {
            xp xpVar = ((wf2) dg2Var).X;
            int i = Build.VERSION.SDK_INT;
            if (i >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                if (i >= 32) {
                    return xpVar.shouldShowRequestPermissionRationale(str);
                }
                if (i == 31) {
                    try {
                        return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(xpVar.getApplication().getPackageManager(), str)).booleanValue();
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                        return xpVar.shouldShowRequestPermissionRationale(str);
                    }
                }
                return xpVar.shouldShowRequestPermissionRationale(str);
            }
            return false;
        }
        return false;
    }

    public void startActivity(Intent intent, Bundle bundle) {
        dg2 dg2Var = this.mHost;
        if (dg2Var != null) {
            intent.getClass();
            dg2Var.B.startActivity(intent, bundle);
            return;
        }
        defpackage.i.n(wh1.k("Fragment ", this, " not attached to Activity"));
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (this.mHost != null) {
            u parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.C != null) {
                parentFragmentManager.F.addLast(new jg2(this.mWho, i));
                if (bundle != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                parentFragmentManager.C.a(intent);
                return;
            }
            dg2 dg2Var = parentFragmentManager.w;
            dg2Var.getClass();
            intent.getClass();
            if (i == INITIALIZING) {
                dg2Var.B.startActivity(intent, bundle);
                return;
            } else {
                defpackage.i.n("Starting activity with a requestCode requires a FragmentActivity host");
                return;
            }
        }
        defpackage.i.n(wh1.k("Fragment ", this, " not attached to Activity"));
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (this.mHost != null) {
            if (u.K(2)) {
                Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
            }
            u parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.D != null) {
                if (bundle != null) {
                    if (intent == null) {
                        intent = new Intent();
                        intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                    }
                    if (u.K(2)) {
                        Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent + " for fragment " + this);
                    }
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                intentSender.getClass();
                k33 k33Var = new k33(intentSender, intent, i2, i3);
                parentFragmentManager.F.addLast(new jg2(this.mWho, i));
                if (u.K(2)) {
                    Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
                }
                parentFragmentManager.D.a(k33Var);
                return;
            }
            dg2 dg2Var = parentFragmentManager.w;
            dg2Var.getClass();
            intentSender.getClass();
            if (i == INITIALIZING) {
                xp xpVar = dg2Var.A;
                if (xpVar != null) {
                    xpVar.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
                    return;
                } else {
                    defpackage.i.n("Starting intent sender with a requestCode requires a FragmentActivity host");
                    return;
                }
            }
            defpackage.i.n("Starting intent sender with a requestCode requires a FragmentActivity host");
            return;
        }
        defpackage.i.n(wh1.k("Fragment ", this, " not attached to Activity"));
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo != null && a().s) {
            if (this.mHost == null) {
                a().s = false;
            } else if (Looper.myLooper() != this.mHost.L.getLooper()) {
                this.mHost.L.postAtFrontOfQueue(new qf2(this, 1));
            } else {
                callStartTransitionListener(true);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final <I, O> c9 registerForActivityResult(a9 a9Var, z8 z8Var) {
        return g(a9Var, new n(this), z8Var);
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Deprecated
    public void onAttachFragment(o oVar) {
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void postponeEnterTransition() {
        a().s = true;
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    @Deprecated
    public static o instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }
}
