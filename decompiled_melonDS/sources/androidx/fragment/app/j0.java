package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
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
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class j0 implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.x, androidx.lifecycle.e1, androidx.lifecycle.k, q7.f {
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
    f0 mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    androidx.lifecycle.a1 mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    g1 mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    s0 mHost;
    boolean mInDynamicContainer;
    boolean mInLayout;
    boolean mIsCreated;
    LayoutInflater mLayoutInflater;
    androidx.lifecycle.z mLifecycleRegistry;
    j0 mParentFragment;
    boolean mPerformedCreateView;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    q7.e mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    String mTag;
    j0 mTarget;
    int mTargetRequestCode;
    boolean mTransitioning;
    View mView;
    a2 mViewLifecycleOwner;
    int mState = INITIALIZING;
    String mWho = UUID.randomUUID().toString();
    String mTargetWho = null;
    private Boolean mIsPrimaryNavigationFragment = null;
    g1 mChildFragmentManager = new g1();
    boolean mMenuVisible = true;
    boolean mUserVisibleHint = true;
    Runnable mPostponedDurationRunnable = new z(this, 0);
    androidx.lifecycle.q mMaxState = androidx.lifecycle.q.RESUMED;
    androidx.lifecycle.f0 mViewLifecycleOwnerLiveData = new androidx.lifecycle.d0();
    private final AtomicInteger mNextLocalRequestCode = new AtomicInteger();
    private final ArrayList<h0> mOnPreAttachedListeners = new ArrayList<>();
    private final h0 mSavedStateAttachListener = new a0(this);

    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.d0, androidx.lifecycle.f0] */
    public j0() {
        f();
    }

    @Deprecated
    public static j0 instantiate(Context context, String str, Bundle bundle) {
        try {
            j0 j0Var = (j0) z0.c(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle != null) {
                bundle.setClassLoader(j0Var.getClass().getClassLoader());
                j0Var.setArguments(bundle);
                return j0Var;
            }
            return j0Var;
        } catch (IllegalAccessException e6) {
            throw new RuntimeException(kc.a.g("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e6);
        } catch (InstantiationException e10) {
            throw new RuntimeException(kc.a.g("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException(kc.a.g("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(kc.a.g("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e12);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.fragment.app.f0] */
    public final f0 b() {
        if (this.mAnimationInfo == null) {
            ?? obj = new Object();
            obj.f1294i = null;
            Object obj2 = USE_DEFAULT_TRANSITION;
            obj.f1295j = obj2;
            obj.f1296k = null;
            obj.f1297l = obj2;
            obj.m = null;
            obj.f1298n = obj2;
            obj.f1301q = 1.0f;
            obj.f1302r = null;
            this.mAnimationInfo = obj;
        }
        return this.mAnimationInfo;
    }

    public final int c() {
        androidx.lifecycle.q qVar = this.mMaxState;
        if (qVar != androidx.lifecycle.q.INITIALIZED && this.mParentFragment != null) {
            return Math.min(qVar.ordinal(), this.mParentFragment.c());
        }
        return qVar.ordinal();
    }

    public void callStartTransitionListener(boolean z10) {
        ViewGroup viewGroup;
        g1 g1Var;
        f0 f0Var = this.mAnimationInfo;
        if (f0Var != null) {
            f0Var.f1303s = false;
        }
        if (this.mView != null && (viewGroup = this.mContainer) != null && (g1Var = this.mFragmentManager) != null) {
            q j2 = q.j(viewGroup, g1Var);
            j2.l();
            if (z10) {
                this.mHost.L.post(new r(1, j2));
            } else {
                j2.e();
            }
            Handler handler = this.mPostponedHandler;
            if (handler != null) {
                handler.removeCallbacks(this.mPostponedDurationRunnable);
                this.mPostponedHandler = null;
            }
        }
    }

    public r0 createFragmentContainer() {
        return new b0(this);
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
        j0 e6 = e(false);
        if (e6 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(e6);
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
            androidx.lifecycle.d1 viewModelStore = getViewModelStore();
            viewModelStore.getClass();
            w6.a aVar = w6.a.f14160b;
            aVar.getClass();
            b9.e eVar = new b9.e(viewModelStore, z6.b.f14965c, aVar);
            nc.e a10 = nc.u.a(z6.b.class);
            String b10 = a10.b();
            if (b10 != null) {
                a1.x0 x0Var = ((z6.b) eVar.B("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b10), a10)).f14966b;
                if (x0Var.g() > 0) {
                    printWriter.print(str);
                    printWriter.println("Loaders:");
                    if (x0Var.g() > 0) {
                        if (x0Var.h(0) != null) {
                            m9.o.b();
                            return;
                        }
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(x0Var.e(0));
                        printWriter.print(": ");
                        throw null;
                    }
                }
            } else {
                a0.j.h("Local and anonymous classes can not be ViewModels");
                return;
            }
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        g1 g1Var = this.mChildFragmentManager;
        g1Var.v(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final j0 e(boolean z10) {
        String str;
        if (z10) {
            r6.c cVar = r6.d.f12618a;
            r6.d.b(new r6.h(this, "Attempting to get target fragment from fragment " + this));
            r6.d.a(this).getClass();
            r6.b bVar = r6.b.PENALTY_LOG;
        }
        j0 j0Var = this.mTarget;
        if (j0Var != null) {
            return j0Var;
        }
        g1 g1Var = this.mFragmentManager;
        if (g1Var != null && (str = this.mTargetWho) != null) {
            return g1Var.f1312c.b(str);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final void f() {
        this.mLifecycleRegistry = new androidx.lifecycle.z(this, true);
        this.mSavedStateRegistryController = new q7.e(new s7.a(this, new kf.s0(RESUMED, this)));
        this.mDefaultFactory = null;
        if (!this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            h0 h0Var = this.mSavedStateAttachListener;
            if (this.mState >= 0) {
                h0Var.a();
            } else {
                this.mOnPreAttachedListeners.add(h0Var);
            }
        }
    }

    public j0 findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager.f1312c.c(str);
    }

    public final y g(i.a aVar, t.a aVar2, h.b bVar) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            e0 e0Var = new e0(this, aVar2, atomicReference, aVar, bVar);
            if (this.mState >= 0) {
                e0Var.a();
            } else {
                this.mOnPreAttachedListeners.add(e0Var);
            }
            return new y(atomicReference);
        }
        a0.j.p(w.d.n("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        return null;
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final o0 getActivity() {
        s0 s0Var = this.mHost;
        if (s0Var == null) {
            return null;
        }
        return s0Var.A;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        f0 f0Var = this.mAnimationInfo;
        if (f0Var != null && (bool = f0Var.f1300p) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        f0 f0Var = this.mAnimationInfo;
        if (f0Var != null && (bool = f0Var.f1299o) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public View getAnimatingAway() {
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return null;
        }
        f0Var.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final g1 getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        a0.j.p(w.d.n("Fragment ", this, " has not been attached yet."));
        return null;
    }

    public Context getContext() {
        s0 s0Var = this.mHost;
        if (s0Var == null) {
            return null;
        }
        return s0Var.B;
    }

    @Override // androidx.lifecycle.k
    public w6.c getDefaultViewModelCreationExtras() {
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
        if (application == null && g1.K(AWAITING_EXIT_EFFECTS)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        w6.d dVar = new w6.d(0);
        LinkedHashMap linkedHashMap = dVar.f14161a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.z0.f1512d, application);
        }
        linkedHashMap.put(androidx.lifecycle.s0.f1482a, this);
        linkedHashMap.put(androidx.lifecycle.s0.f1483b, this);
        if (getArguments() != null) {
            linkedHashMap.put(androidx.lifecycle.s0.f1484c, getArguments());
        }
        return dVar;
    }

    @Override // androidx.lifecycle.k
    public androidx.lifecycle.a1 getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
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
                if (application == null && g1.K(AWAITING_EXIT_EFFECTS)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.mDefaultFactory = new androidx.lifecycle.v0(application, this, getArguments());
            }
            return this.mDefaultFactory;
        }
        a0.j.p("Can't access ViewModels from detached fragment");
        return null;
    }

    public int getEnterAnim() {
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return 0;
        }
        return f0Var.f1287b;
    }

    public Object getEnterTransition() {
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return null;
        }
        return f0Var.f1294i;
    }

    public m5.n getEnterTransitionCallback() {
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return null;
        }
        f0Var.getClass();
        return null;
    }

    public int getExitAnim() {
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return 0;
        }
        return f0Var.f1288c;
    }

    public Object getExitTransition() {
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return null;
        }
        return f0Var.f1296k;
    }

    public m5.n getExitTransitionCallback() {
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return null;
        }
        f0Var.getClass();
        return null;
    }

    public View getFocusedView() {
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return null;
        }
        return f0Var.f1302r;
    }

    @Deprecated
    public final g1 getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        s0 s0Var = this.mHost;
        if (s0Var == null) {
            return null;
        }
        return ((n0) s0Var).X;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        s0 s0Var = this.mHost;
        if (s0Var != null) {
            l.i iVar = ((n0) s0Var).X;
            LayoutInflater cloneInContext = iVar.getLayoutInflater().cloneInContext(iVar);
            cloneInContext.setFactory2(this.mChildFragmentManager.f1315f);
            return cloneInContext;
        }
        a0.j.p("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        return null;
    }

    @Override // androidx.lifecycle.x
    public androidx.lifecycle.r getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public z6.a getLoaderManager() {
        return new z6.c(this, getViewModelStore());
    }

    public int getNextTransition() {
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return 0;
        }
        return f0Var.f1291f;
    }

    public final j0 getParentFragment() {
        return this.mParentFragment;
    }

    public final g1 getParentFragmentManager() {
        g1 g1Var = this.mFragmentManager;
        if (g1Var != null) {
            return g1Var;
        }
        a0.j.p(w.d.n("Fragment ", this, " not associated with a fragment manager."));
        return null;
    }

    public boolean getPopDirection() {
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return false;
        }
        return f0Var.f1286a;
    }

    public int getPopEnterAnim() {
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return 0;
        }
        return f0Var.f1289d;
    }

    public int getPopExitAnim() {
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return 0;
        }
        return f0Var.f1290e;
    }

    public float getPostOnViewCreatedAlpha() {
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return 1.0f;
        }
        return f0Var.f1301q;
    }

    public Object getReenterTransition() {
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return null;
        }
        Object obj = f0Var.f1297l;
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
        r6.c cVar = r6.d.f12618a;
        r6.d.b(new r6.h(this, "Attempting to get retain instance for fragment " + this));
        r6.d.a(this).getClass();
        r6.b bVar = r6.b.PENALTY_LOG;
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return null;
        }
        Object obj = f0Var.f1295j;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getEnterTransition();
        }
        return obj;
    }

    @Override // q7.f
    public final q7.d getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f12313b;
    }

    public Object getSharedElementEnterTransition() {
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return null;
        }
        return f0Var.m;
    }

    public Object getSharedElementReturnTransition() {
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return null;
        }
        Object obj = f0Var.f1298n;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getSharedElementEnterTransition();
        }
        return obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        f0 f0Var = this.mAnimationInfo;
        if (f0Var != null && (arrayList = f0Var.f1292g) != null) {
            return arrayList;
        }
        return new ArrayList<>();
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        f0 f0Var = this.mAnimationInfo;
        if (f0Var != null && (arrayList = f0Var.f1293h) != null) {
            return arrayList;
        }
        return new ArrayList<>();
    }

    public final String getString(int i2) {
        return getResources().getString(i2);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final j0 getTargetFragment() {
        return e(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        r6.c cVar = r6.d.f12618a;
        r6.d.b(new r6.h(this, "Attempting to get target request code from fragment " + this));
        r6.d.a(this).getClass();
        r6.b bVar = r6.b.PENALTY_LOG;
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i2) {
        return getResources().getText(i2);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public androidx.lifecycle.x getViewLifecycleOwner() {
        a2 a2Var = this.mViewLifecycleOwner;
        if (a2Var != null) {
            return a2Var;
        }
        a0.j.p(w.d.n("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
        return null;
    }

    public androidx.lifecycle.d0 getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.e1
    public androidx.lifecycle.d1 getViewModelStore() {
        if (this.mFragmentManager != null) {
            if (c() != androidx.lifecycle.q.INITIALIZED.ordinal()) {
                HashMap hashMap = this.mFragmentManager.O.f1349d;
                androidx.lifecycle.d1 d1Var = (androidx.lifecycle.d1) hashMap.get(this.mWho);
                if (d1Var == null) {
                    androidx.lifecycle.d1 d1Var2 = new androidx.lifecycle.d1();
                    hashMap.put(this.mWho, d1Var2);
                    return d1Var2;
                }
                return d1Var;
            }
            a0.j.p("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        a0.j.p("Can't access ViewModels from detached fragment");
        return null;
    }

    @SuppressLint({"KotlinPropertyAccess"})
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
        this.mChildFragmentManager = new g1();
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
            g1 g1Var = this.mFragmentManager;
            if (g1Var != null) {
                j0 j0Var = this.mParentFragment;
                g1Var.getClass();
                if (j0Var == null) {
                    isHidden = false;
                } else {
                    isHidden = j0Var.isHidden();
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
                j0 j0Var = this.mParentFragment;
                if (j0Var == null) {
                    isMenuVisible = true;
                } else {
                    isMenuVisible = j0Var.isMenuVisible();
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
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return false;
        }
        return f0Var.f1303s;
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
        g1 g1Var = this.mFragmentManager;
        if (g1Var == null) {
            return false;
        }
        if (!g1Var.H && !g1Var.I) {
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
    public void onActivityResult(int i2, int i10, Intent intent) {
        if (g1.K(VIEW_CREATED)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i2 + " resultCode: " + i10 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        l.i iVar;
        this.mCalled = true;
        s0 s0Var = this.mHost;
        if (s0Var == null) {
            iVar = null;
        } else {
            iVar = s0Var.A;
        }
        if (iVar != null) {
            this.mCalled = false;
            onAttach((Activity) iVar);
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
        g1 g1Var = this.mChildFragmentManager;
        if (g1Var.f1330v >= 1) {
            return;
        }
        g1Var.H = false;
        g1Var.I = false;
        g1Var.O.f1352g = false;
        g1Var.u(1);
    }

    public Animation onCreateAnimation(int i2, boolean z10, int i10) {
        return null;
    }

    public Animator onCreateAnimator(int i2, boolean z10, int i10) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = this.mContentLayoutId;
        if (i2 != 0) {
            return layoutInflater.inflate(i2, viewGroup, false);
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
        l.i iVar;
        this.mCalled = true;
        s0 s0Var = this.mHost;
        if (s0Var == null) {
            iVar = null;
        } else {
            iVar = s0Var.A;
        }
        if (iVar != null) {
            this.mCalled = false;
            onInflate((Activity) iVar, attributeSet, bundle);
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
        this.mState = AWAITING_EXIT_EFFECTS;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            if (g1.K(AWAITING_EXIT_EFFECTS)) {
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
            g1 g1Var = this.mChildFragmentManager;
            g1Var.H = false;
            g1Var.I = false;
            g1Var.O.f1352g = false;
            g1Var.u(ACTIVITY_CREATED);
            return;
        }
        throw new AndroidRuntimeException(w.d.n("Fragment ", this, " did not call through to super.onActivityCreated()"));
    }

    public void performAttach() {
        ArrayList<h0> arrayList = this.mOnPreAttachedListeners;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            h0 h0Var = arrayList.get(i2);
            i2++;
            h0Var.a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach((Context) this.mHost.B);
        if (this.mCalled) {
            Iterator it = this.mFragmentManager.f1324p.iterator();
            while (it.hasNext()) {
                ((l1) it.next()).b(this);
            }
            g1 g1Var = this.mChildFragmentManager;
            g1Var.H = false;
            g1Var.I = false;
            g1Var.O.f1352g = false;
            g1Var.u(0);
            return;
        }
        throw new AndroidRuntimeException(w.d.n("Fragment ", this, " did not call through to super.onAttach()"));
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
        this.mLifecycleRegistry.a(new c0(this));
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.f(androidx.lifecycle.p.ON_CREATE);
            return;
        }
        throw new AndroidRuntimeException(w.d.n("Fragment ", this, " did not call through to super.onCreate()"));
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z10 = true;
        }
        return this.mChildFragmentManager.k(menu, menuInflater) | z10;
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.P();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new a2(this, getViewModelStore(), new x(0, this));
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        a2 a2Var = this.mViewLifecycleOwner;
        if (onCreateView != null) {
            a2Var.c();
            if (g1.K(AWAITING_EXIT_EFFECTS)) {
                Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
            }
            View view = this.mView;
            a2 a2Var2 = this.mViewLifecycleOwner;
            view.getClass();
            view.setTag(R.id.view_tree_lifecycle_owner, a2Var2);
            View view2 = this.mView;
            a2 a2Var3 = this.mViewLifecycleOwner;
            view2.getClass();
            view2.setTag(R.id.view_tree_view_model_store_owner, a2Var3);
            View view3 = this.mView;
            a2 a2Var4 = this.mViewLifecycleOwner;
            view3.getClass();
            view3.setTag(R.id.view_tree_saved_state_registry_owner, a2Var4);
            this.mViewLifecycleOwnerLiveData.h(this.mViewLifecycleOwner);
        } else if (a2Var.X == null) {
            this.mViewLifecycleOwner = null;
        } else {
            a0.j.p("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public void performDestroy() {
        this.mChildFragmentManager.l();
        this.mLifecycleRegistry.f(androidx.lifecycle.p.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        throw new AndroidRuntimeException(w.d.n("Fragment ", this, " did not call through to super.onDestroy()"));
    }

    public void performDestroyView() {
        this.mChildFragmentManager.u(1);
        if (this.mView != null) {
            a2 a2Var = this.mViewLifecycleOwner;
            a2Var.c();
            if (a2Var.X.f1504d.isAtLeast(androidx.lifecycle.q.CREATED)) {
                this.mViewLifecycleOwner.b(androidx.lifecycle.p.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            androidx.lifecycle.d1 viewModelStore = getViewModelStore();
            viewModelStore.getClass();
            w6.a aVar = w6.a.f14160b;
            aVar.getClass();
            b9.e eVar = new b9.e(viewModelStore, z6.b.f14965c, aVar);
            nc.e a10 = nc.u.a(z6.b.class);
            String b10 = a10.b();
            if (b10 != null) {
                a1.x0 x0Var = ((z6.b) eVar.B("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b10), a10)).f14966b;
                if (x0Var.g() <= 0) {
                    this.mPerformedCreateView = false;
                    return;
                }
                x0Var.h(0).getClass();
                m9.o.b();
                return;
            }
            a0.j.h("Local and anonymous classes can not be ViewModels");
            return;
        }
        throw new AndroidRuntimeException(w.d.n("Fragment ", this, " did not call through to super.onDestroyView()"));
    }

    public void performDetach() {
        this.mState = INITIALIZING;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            g1 g1Var = this.mChildFragmentManager;
            if (!g1Var.J) {
                g1Var.l();
                this.mChildFragmentManager = new g1();
                return;
            }
            return;
        }
        throw new AndroidRuntimeException(w.d.n("Fragment ", this, " did not call through to super.onDetach()"));
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z10) {
        onMultiWindowModeChanged(z10);
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
            this.mViewLifecycleOwner.b(androidx.lifecycle.p.ON_PAUSE);
        }
        this.mLifecycleRegistry.f(androidx.lifecycle.p.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        throw new AndroidRuntimeException(w.d.n("Fragment ", this, " did not call through to super.onPause()"));
    }

    public void performPictureInPictureModeChanged(boolean z10) {
        onPictureInPictureModeChanged(z10);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z10 = true;
        }
        return this.mChildFragmentManager.t(menu) | z10;
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean N = g1.N(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool != null && bool.booleanValue() == N) {
            return;
        }
        this.mIsPrimaryNavigationFragment = Boolean.valueOf(N);
        onPrimaryNavigationFragmentChanged(N);
        g1 g1Var = this.mChildFragmentManager;
        g1Var.e0();
        g1Var.r(g1Var.f1334z);
    }

    public void performResume() {
        this.mChildFragmentManager.P();
        this.mChildFragmentManager.z(true);
        this.mState = RESUMED;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            androidx.lifecycle.z zVar = this.mLifecycleRegistry;
            androidx.lifecycle.p pVar = androidx.lifecycle.p.ON_RESUME;
            zVar.f(pVar);
            if (this.mView != null) {
                this.mViewLifecycleOwner.X.f(pVar);
            }
            g1 g1Var = this.mChildFragmentManager;
            g1Var.H = false;
            g1Var.I = false;
            g1Var.O.f1352g = false;
            g1Var.u(RESUMED);
            return;
        }
        throw new AndroidRuntimeException(w.d.n("Fragment ", this, " did not call through to super.onResume()"));
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
            androidx.lifecycle.z zVar = this.mLifecycleRegistry;
            androidx.lifecycle.p pVar = androidx.lifecycle.p.ON_START;
            zVar.f(pVar);
            if (this.mView != null) {
                this.mViewLifecycleOwner.X.f(pVar);
            }
            g1 g1Var = this.mChildFragmentManager;
            g1Var.H = false;
            g1Var.I = false;
            g1Var.O.f1352g = false;
            g1Var.u(5);
            return;
        }
        throw new AndroidRuntimeException(w.d.n("Fragment ", this, " did not call through to super.onStart()"));
    }

    public void performStop() {
        g1 g1Var = this.mChildFragmentManager;
        g1Var.I = true;
        g1Var.O.f1352g = true;
        g1Var.u(ACTIVITY_CREATED);
        if (this.mView != null) {
            this.mViewLifecycleOwner.b(androidx.lifecycle.p.ON_STOP);
        }
        this.mLifecycleRegistry.f(androidx.lifecycle.p.ON_STOP);
        this.mState = ACTIVITY_CREATED;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        throw new AndroidRuntimeException(w.d.n("Fragment ", this, " did not call through to super.onStop()"));
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
        this.mChildFragmentManager.u(VIEW_CREATED);
    }

    public final void postponeEnterTransition(long j2, TimeUnit timeUnit) {
        b().f1303s = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        g1 g1Var = this.mFragmentManager;
        if (g1Var != null) {
            this.mPostponedHandler = g1Var.f1331w.L;
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j2));
    }

    public final <I, O> h.c registerForActivityResult(i.a aVar, h.b bVar) {
        return g(aVar, new d0(0, this), bVar);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i2) {
        if (this.mHost != null) {
            g1 parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.E != null) {
                parentFragmentManager.F.addLast(new c1(this.mWho, i2));
                parentFragmentManager.E.a(strArr);
                return;
            }
            parentFragmentManager.f1331w.getClass();
            strArr.getClass();
            return;
        }
        a0.j.p(w.d.n("Fragment ", this, " not attached to Activity"));
    }

    public final o0 requireActivity() {
        o0 activity = getActivity();
        if (activity != null) {
            return activity;
        }
        a0.j.p(w.d.n("Fragment ", this, " not attached to an activity."));
        return null;
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        a0.j.p(w.d.n("Fragment ", this, " does not have any arguments."));
        return null;
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        a0.j.p(w.d.n("Fragment ", this, " not attached to a context."));
        return null;
    }

    @Deprecated
    public final g1 requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        a0.j.p(w.d.n("Fragment ", this, " not attached to a host."));
        return null;
    }

    public final j0 requireParentFragment() {
        j0 parentFragment = getParentFragment();
        if (parentFragment == null) {
            if (getContext() == null) {
                a0.j.p(w.d.n("Fragment ", this, " is not attached to any Fragment or host"));
                return null;
            }
            StringBuilder sb2 = new StringBuilder("Fragment ");
            sb2.append(this);
            Context context = getContext();
            sb2.append(" is not a child Fragment, it is directly attached to ");
            sb2.append(context);
            throw new IllegalStateException(sb2.toString());
        }
        return parentFragment;
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        a0.j.p(w.d.n("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
        return null;
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 != null && (bundle = bundle2.getBundle("childFragmentManager")) != null) {
            this.mChildFragmentManager.V(bundle);
            g1 g1Var = this.mChildFragmentManager;
            g1Var.H = false;
            g1Var.I = false;
            g1Var.O.f1352g = false;
            g1Var.u(1);
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
                this.mViewLifecycleOwner.b(androidx.lifecycle.p.ON_CREATE);
                return;
            }
            return;
        }
        throw new AndroidRuntimeException(w.d.n("Fragment ", this, " did not call through to super.onViewStateRestored()"));
    }

    public void setAllowEnterTransitionOverlap(boolean z10) {
        b().f1300p = Boolean.valueOf(z10);
    }

    public void setAllowReturnTransitionOverlap(boolean z10) {
        b().f1299o = Boolean.valueOf(z10);
    }

    public void setAnimations(int i2, int i10, int i11, int i12) {
        if (this.mAnimationInfo == null && i2 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return;
        }
        b().f1287b = i2;
        b().f1288c = i10;
        b().f1289d = i11;
        b().f1290e = i12;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            a0.j.p("Fragment already added and state has been saved");
        } else {
            this.mArguments = bundle;
        }
    }

    public void setEnterSharedElementCallback(m5.n nVar) {
        b().getClass();
    }

    public void setEnterTransition(Object obj) {
        b().f1294i = obj;
    }

    public void setExitSharedElementCallback(m5.n nVar) {
        b().getClass();
    }

    public void setExitTransition(Object obj) {
        b().f1296k = obj;
    }

    public void setFocusedView(View view) {
        b().f1302r = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z10) {
        if (this.mHasMenu != z10) {
            this.mHasMenu = z10;
            if (isAdded() && !isHidden()) {
                ((n0) this.mHost).X.invalidateOptionsMenu();
            }
        }
    }

    public void setInitialSavedState(i0 i0Var) {
        if (this.mFragmentManager == null) {
            this.mSavedFragmentState = (i0Var == null || (r2 = i0Var.A) == null) ? null : null;
        } else {
            a0.j.p("Fragment already added");
        }
    }

    public void setMenuVisibility(boolean z10) {
        if (this.mMenuVisible != z10) {
            this.mMenuVisible = z10;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                ((n0) this.mHost).X.invalidateOptionsMenu();
            }
        }
    }

    public void setNextTransition(int i2) {
        if (this.mAnimationInfo == null && i2 == 0) {
            return;
        }
        b();
        this.mAnimationInfo.f1291f = i2;
    }

    public void setPopDirection(boolean z10) {
        if (this.mAnimationInfo == null) {
            return;
        }
        b().f1286a = z10;
    }

    public void setPostOnViewCreatedAlpha(float f8) {
        b().f1301q = f8;
    }

    public void setReenterTransition(Object obj) {
        b().f1297l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z10) {
        r6.c cVar = r6.d.f12618a;
        r6.d.b(new r6.h(this, "Attempting to set retain instance for fragment " + this));
        r6.d.a(this).getClass();
        r6.b bVar = r6.b.PENALTY_LOG;
        this.mRetainInstance = z10;
        g1 g1Var = this.mFragmentManager;
        if (g1Var != null) {
            k1 k1Var = g1Var.O;
            if (z10) {
                k1Var.e(this);
                return;
            } else {
                k1Var.i(this);
                return;
            }
        }
        this.mRetainInstanceChangedWhileDetached = true;
    }

    public void setReturnTransition(Object obj) {
        b().f1295j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        b().m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        b();
        f0 f0Var = this.mAnimationInfo;
        f0Var.f1292g = arrayList;
        f0Var.f1293h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        b().f1298n = obj;
    }

    @Deprecated
    public void setTargetFragment(j0 j0Var, int i2) {
        g1 g1Var;
        if (j0Var != null) {
            r6.c cVar = r6.d.f12618a;
            r6.d.b(new r6.h(this, "Attempting to set target fragment " + j0Var + " with request code " + i2 + " for fragment " + this));
            r6.d.a(this).getClass();
            r6.b bVar = r6.b.PENALTY_LOG;
        }
        g1 g1Var2 = this.mFragmentManager;
        if (j0Var != null) {
            g1Var = j0Var.mFragmentManager;
        } else {
            g1Var = null;
        }
        if (g1Var2 != null && g1Var != null && g1Var2 != g1Var) {
            a0.j.h(w.d.n("Fragment ", j0Var, " must share the same FragmentManager to be set as a target fragment"));
            return;
        }
        for (j0 j0Var2 = j0Var; j0Var2 != null; j0Var2 = j0Var2.e(false)) {
            if (j0Var2.equals(this)) {
                throw new IllegalArgumentException("Setting " + j0Var + " as the target of " + this + " would create a target cycle");
            }
        }
        if (j0Var == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager != null && j0Var.mFragmentManager != null) {
            this.mTargetWho = j0Var.mWho;
            this.mTarget = null;
        } else {
            this.mTargetWho = null;
            this.mTarget = j0Var;
        }
        this.mTargetRequestCode = i2;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z10) {
        r6.c cVar = r6.d.f12618a;
        r6.d.b(new r6.h(this, "Attempting to set user visible hint to " + z10 + " for fragment " + this));
        r6.d.a(this).getClass();
        r6.b bVar = r6.b.PENALTY_LOG;
        boolean z11 = false;
        if (!this.mUserVisibleHint && z10 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            g1 g1Var = this.mFragmentManager;
            p1 g10 = g1Var.g(this);
            j0 j0Var = g10.f1392c;
            if (j0Var.mDeferStart) {
                if (g1Var.f1311b) {
                    g1Var.K = true;
                } else {
                    j0Var.mDeferStart = false;
                    g10.k();
                }
            }
        }
        this.mUserVisibleHint = z10;
        if (this.mState < 5 && !z10) {
            z11 = true;
        }
        this.mDeferStart = z11;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z10);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        s0 s0Var = this.mHost;
        if (s0Var != null) {
            l.i iVar = ((n0) s0Var).X;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                if (i2 >= 32) {
                    return iVar.shouldShowRequestPermissionRationale(str);
                }
                if (i2 == 31) {
                    try {
                        return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(iVar.getApplication().getPackageManager(), str)).booleanValue();
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                        return iVar.shouldShowRequestPermissionRationale(str);
                    }
                }
                return iVar.shouldShowRequestPermissionRationale(str);
            }
            return false;
        }
        return false;
    }

    public void startActivity(Intent intent, Bundle bundle) {
        s0 s0Var = this.mHost;
        if (s0Var != null) {
            intent.getClass();
            s0Var.B.startActivity(intent, bundle);
            return;
        }
        a0.j.p(w.d.n("Fragment ", this, " not attached to Activity"));
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        if (this.mHost != null) {
            g1 parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.C != null) {
                parentFragmentManager.F.addLast(new c1(this.mWho, i2));
                if (bundle != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                parentFragmentManager.C.a(intent);
                return;
            }
            s0 s0Var = parentFragmentManager.f1331w;
            s0Var.getClass();
            intent.getClass();
            if (i2 == INITIALIZING) {
                s0Var.B.startActivity(intent, bundle);
                return;
            } else {
                a0.j.p("Starting activity with a requestCode requires a FragmentActivity host");
                return;
            }
        }
        a0.j.p(w.d.n("Fragment ", this, " not attached to Activity"));
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i10, int i11, int i12, Bundle bundle) {
        if (this.mHost != null) {
            if (g1.K(VIEW_CREATED)) {
                Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i2 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
            }
            g1 parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.D != null) {
                if (bundle != null) {
                    if (intent == null) {
                        intent = new Intent();
                        intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                    }
                    if (g1.K(VIEW_CREATED)) {
                        Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent + " for fragment " + this);
                    }
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                intentSender.getClass();
                h.j jVar = new h.j(intentSender, intent, i10, i11);
                parentFragmentManager.F.addLast(new c1(this.mWho, i2));
                if (g1.K(VIEW_CREATED)) {
                    Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
                }
                parentFragmentManager.D.a(jVar);
                return;
            }
            s0 s0Var = parentFragmentManager.f1331w;
            s0Var.getClass();
            intentSender.getClass();
            if (i2 == INITIALIZING) {
                l.i iVar = s0Var.A;
                if (iVar != null) {
                    iVar.startIntentSenderForResult(intentSender, i2, intent, i10, i11, i12, bundle);
                    return;
                } else {
                    a0.j.p("Starting intent sender with a requestCode requires a FragmentActivity host");
                    return;
                }
            }
            a0.j.p("Starting intent sender with a requestCode requires a FragmentActivity host");
            return;
        }
        a0.j.p(w.d.n("Fragment ", this, " not attached to Activity"));
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo != null && b().f1303s) {
            if (this.mHost == null) {
                b().f1303s = false;
            } else if (Looper.myLooper() != this.mHost.L.getLooper()) {
                this.mHost.L.postAtFrontOfQueue(new z(this, 1));
            } else {
                callStartTransitionListener(true);
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb2.append(" tag=");
            sb2.append(this.mTag);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    public final String getString(int i2, Object... objArr) {
        return getResources().getString(i2, objArr);
    }

    public final <I, O> h.c registerForActivityResult(i.a aVar, h.h hVar, h.b bVar) {
        return g(aVar, new d0(1, hVar), bVar);
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
    public void onAttachFragment(j0 j0Var) {
    }

    public void onHiddenChanged(boolean z10) {
    }

    public void onMultiWindowModeChanged(boolean z10) {
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z10) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z10) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void postponeEnterTransition() {
        b().f1303s = true;
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i2) {
        startActivityForResult(intent, i2, null);
    }

    @Deprecated
    public static j0 instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    @Deprecated
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
    }
}
