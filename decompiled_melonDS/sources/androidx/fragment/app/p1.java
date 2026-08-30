package androidx.fragment.app;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.WeakHashMap;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a  reason: collision with root package name */
    public final p0 f1390a;

    /* renamed from: b  reason: collision with root package name */
    public final q1 f1391b;

    /* renamed from: c  reason: collision with root package name */
    public final j0 f1392c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1393d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f1394e = -1;

    public p1(p0 p0Var, q1 q1Var, ClassLoader classLoader, z0 z0Var, Bundle bundle) {
        this.f1390a = p0Var;
        this.f1391b = q1Var;
        m1 m1Var = (m1) bundle.getParcelable("state");
        j0 a10 = z0Var.a(m1Var.A);
        a10.mWho = m1Var.B;
        a10.mFromLayout = m1Var.L;
        a10.mInDynamicContainer = m1Var.R;
        a10.mRestored = true;
        a10.mFragmentId = m1Var.X;
        a10.mContainerId = m1Var.Y;
        a10.mTag = m1Var.Z;
        a10.mRetainInstance = m1Var.f1357b0;
        a10.mRemoving = m1Var.f1358c0;
        a10.mDetached = m1Var.f1359d0;
        a10.mHidden = m1Var.f1360e0;
        a10.mMaxState = androidx.lifecycle.q.values()[m1Var.f1361f0];
        a10.mTargetWho = m1Var.f1362g0;
        a10.mTargetRequestCode = m1Var.f1363h0;
        a10.mUserVisibleHint = m1Var.f1364i0;
        this.f1392c = a10;
        a10.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a10.setArguments(bundle2);
        if (g1.K(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a10);
        }
    }

    public final void a() {
        Bundle bundle;
        boolean K = g1.K(3);
        j0 j0Var = this.f1392c;
        if (K) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + j0Var);
        }
        Bundle bundle2 = j0Var.mSavedFragmentState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        j0Var.performActivityCreated(bundle);
        this.f1390a.a(j0Var, false);
    }

    public final void b() {
        j0 j0Var;
        View view;
        View view2;
        j0 j0Var2;
        j0 j0Var3 = this.f1392c;
        View view3 = j0Var3.mContainer;
        while (true) {
            j0Var = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            if (tag instanceof j0) {
                j0Var2 = (j0) tag;
            } else {
                j0Var2 = null;
            }
            if (j0Var2 != null) {
                j0Var = j0Var2;
                break;
            }
            ViewParent parent = view3.getParent();
            if (parent instanceof View) {
                view3 = (View) parent;
            } else {
                view3 = null;
            }
        }
        j0 parentFragment = j0Var3.getParentFragment();
        if (j0Var != null && !j0Var.equals(parentFragment)) {
            int i2 = j0Var3.mContainerId;
            r6.c cVar = r6.d.f12618a;
            StringBuilder sb2 = new StringBuilder("Attempting to nest fragment ");
            sb2.append(j0Var3);
            sb2.append(" within the view of parent fragment ");
            sb2.append(j0Var);
            sb2.append(" via container with ID ");
            r6.d.b(new r6.h(j0Var3, w.d.q(sb2, i2, " without using parent's childFragmentManager")));
            r6.d.a(j0Var3).getClass();
            r6.b bVar = r6.b.PENALTY_LOG;
        }
        ArrayList arrayList = this.f1391b.f1401a;
        ViewGroup viewGroup = j0Var3.mContainer;
        int i10 = -1;
        if (viewGroup != null) {
            int indexOf = arrayList.indexOf(j0Var3);
            int i11 = indexOf - 1;
            while (true) {
                if (i11 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        j0 j0Var4 = (j0) arrayList.get(indexOf);
                        if (j0Var4.mContainer == viewGroup && (view = j0Var4.mView) != null) {
                            i10 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    j0 j0Var5 = (j0) arrayList.get(i11);
                    if (j0Var5.mContainer == viewGroup && (view2 = j0Var5.mView) != null) {
                        i10 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i11--;
                }
            }
        }
        j0Var3.mContainer.addView(j0Var3.mView, i10);
    }

    public final void c() {
        boolean K = g1.K(3);
        j0 j0Var = this.f1392c;
        if (K) {
            Log.d("FragmentManager", "moveto ATTACHED: " + j0Var);
        }
        j0 j0Var2 = j0Var.mTarget;
        p1 p1Var = null;
        q1 q1Var = this.f1391b;
        if (j0Var2 != null) {
            p1 p1Var2 = (p1) q1Var.f1402b.get(j0Var2.mWho);
            if (p1Var2 != null) {
                j0Var.mTargetWho = j0Var.mTarget.mWho;
                j0Var.mTarget = null;
                p1Var = p1Var2;
            } else {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(j0Var);
                j0 j0Var3 = j0Var.mTarget;
                sb2.append(" declared target fragment ");
                sb2.append(j0Var3);
                sb2.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb2.toString());
            }
        } else {
            String str = j0Var.mTargetWho;
            if (str != null && (p1Var = (p1) q1Var.f1402b.get(str)) == null) {
                StringBuilder sb3 = new StringBuilder("Fragment ");
                sb3.append(j0Var);
                sb3.append(" declared target fragment ");
                a0.j.p(w.d.s(sb3, j0Var.mTargetWho, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (p1Var != null) {
            p1Var.k();
        }
        g1 g1Var = j0Var.mFragmentManager;
        j0Var.mHost = g1Var.f1331w;
        j0Var.mParentFragment = g1Var.f1333y;
        p0 p0Var = this.f1390a;
        p0Var.g(j0Var, false);
        j0Var.performAttach();
        p0Var.b(j0Var, false);
    }

    public final int d() {
        f2 f2Var;
        int i2;
        j0 j0Var = this.f1392c;
        if (j0Var.mFragmentManager == null) {
            return j0Var.mState;
        }
        int i10 = this.f1394e;
        int i11 = o1.f1384a[j0Var.mMaxState.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        i10 = Math.min(i10, -1);
                    } else {
                        i10 = Math.min(i10, 0);
                    }
                } else {
                    i10 = Math.min(i10, 1);
                }
            } else {
                i10 = Math.min(i10, 5);
            }
        }
        if (j0Var.mFromLayout) {
            boolean z10 = j0Var.mInLayout;
            int i12 = this.f1394e;
            if (z10) {
                i10 = Math.max(i12, 2);
                View view = j0Var.mView;
                if (view != null && view.getParent() == null) {
                    i10 = Math.min(i10, 2);
                }
            } else {
                i10 = i12 < 4 ? Math.min(i10, j0Var.mState) : Math.min(i10, 1);
            }
        }
        if (j0Var.mInDynamicContainer && j0Var.mContainer == null) {
            i10 = Math.min(i10, 4);
        }
        if (!j0Var.mAdded) {
            i10 = Math.min(i10, 1);
        }
        ViewGroup viewGroup = j0Var.mContainer;
        f2 f2Var2 = null;
        if (viewGroup != null) {
            q j2 = q.j(viewGroup, j0Var.getParentFragmentManager());
            e2 g10 = j2.g(j0Var);
            if (g10 != null) {
                f2Var = g10.f1272b;
            } else {
                f2Var = null;
            }
            e2 h2 = j2.h(j0Var);
            if (h2 != null) {
                f2Var2 = h2.f1272b;
            }
            if (f2Var == null) {
                i2 = -1;
            } else {
                i2 = k2.f1353a[f2Var.ordinal()];
            }
            if (i2 != -1 && i2 != 1) {
                f2Var2 = f2Var;
            }
        }
        if (f2Var2 == f2.ADDING) {
            i10 = Math.min(i10, 6);
        } else if (f2Var2 == f2.REMOVING) {
            i10 = Math.max(i10, 3);
        } else if (j0Var.mRemoving) {
            if (j0Var.isInBackStack()) {
                i10 = Math.min(i10, 1);
            } else {
                i10 = Math.min(i10, -1);
            }
        }
        if (j0Var.mDeferStart && j0Var.mState < 5) {
            i10 = Math.min(i10, 4);
        }
        if (j0Var.mTransitioning) {
            i10 = Math.max(i10, 3);
        }
        if (g1.K(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i10 + " for " + j0Var);
        }
        return i10;
    }

    public final void e() {
        Bundle bundle;
        boolean K = g1.K(3);
        j0 j0Var = this.f1392c;
        if (K) {
            Log.d("FragmentManager", "moveto CREATED: " + j0Var);
        }
        Bundle bundle2 = j0Var.mSavedFragmentState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        if (!j0Var.mIsCreated) {
            p0 p0Var = this.f1390a;
            p0Var.h(j0Var, false);
            j0Var.performCreate(bundle);
            p0Var.c(j0Var, false);
            return;
        }
        j0Var.mState = 1;
        j0Var.restoreChildFragmentState();
    }

    public final void f() {
        Bundle bundle;
        String str;
        j0 j0Var = this.f1392c;
        if (j0Var.mFromLayout) {
            return;
        }
        if (g1.K(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + j0Var);
        }
        Bundle bundle2 = j0Var.mSavedFragmentState;
        ViewGroup viewGroup = null;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        LayoutInflater performGetLayoutInflater = j0Var.performGetLayoutInflater(bundle);
        ViewGroup viewGroup2 = j0Var.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i2 = j0Var.mContainerId;
            if (i2 != 0) {
                if (i2 != -1) {
                    viewGroup = (ViewGroup) j0Var.mFragmentManager.f1332x.d(i2);
                    if (viewGroup == null) {
                        if (!j0Var.mRestored && !j0Var.mInDynamicContainer) {
                            try {
                                str = j0Var.getResources().getResourceName(j0Var.mContainerId);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(j0Var.mContainerId) + " (" + str + ") for fragment " + j0Var);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        r6.c cVar = r6.d.f12618a;
                        r6.d.b(new r6.h(j0Var, "Attempting to add fragment " + j0Var + " to container " + viewGroup + " which is not a FragmentContainerView"));
                        r6.d.a(j0Var).getClass();
                        r6.b bVar = r6.b.PENALTY_LOG;
                    }
                } else {
                    a0.j.h(w.d.n("Cannot create fragment ", j0Var, " for a container view with no id"));
                    return;
                }
            }
        }
        j0Var.mContainer = viewGroup;
        j0Var.performCreateView(performGetLayoutInflater, viewGroup, bundle);
        if (j0Var.mView != null) {
            if (g1.K(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + j0Var);
            }
            j0Var.mView.setSaveFromParentEnabled(false);
            j0Var.mView.setTag(R.id.fragment_container_view_tag, j0Var);
            if (viewGroup != null) {
                b();
            }
            if (j0Var.mHidden) {
                j0Var.mView.setVisibility(8);
            }
            boolean isAttachedToWindow = j0Var.mView.isAttachedToWindow();
            View view = j0Var.mView;
            if (isAttachedToWindow) {
                WeakHashMap weakHashMap = a6.x0.f533a;
                a6.n0.c(view);
            } else {
                view.addOnAttachStateChangeListener(new n1(view));
            }
            j0Var.performViewCreated();
            this.f1390a.m(j0Var, j0Var.mView, false);
            int visibility = j0Var.mView.getVisibility();
            j0Var.setPostOnViewCreatedAlpha(j0Var.mView.getAlpha());
            if (j0Var.mContainer != null && visibility == 0) {
                View findFocus = j0Var.mView.findFocus();
                if (findFocus != null) {
                    j0Var.setFocusedView(findFocus);
                    if (g1.K(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + j0Var);
                    }
                }
                j0Var.mView.setAlpha(0.0f);
            }
        }
        j0Var.mState = 2;
    }

    public final void g() {
        boolean z10;
        boolean z11;
        j0 b10;
        boolean K = g1.K(3);
        j0 j0Var = this.f1392c;
        if (K) {
            Log.d("FragmentManager", "movefrom CREATED: " + j0Var);
        }
        boolean z12 = true;
        int i2 = 0;
        if (j0Var.mRemoving && !j0Var.isInBackStack()) {
            z10 = true;
        } else {
            z10 = false;
        }
        q1 q1Var = this.f1391b;
        if (z10 && !j0Var.mBeingSaved) {
            q1Var.i(null, j0Var.mWho);
        }
        if (!z10) {
            k1 k1Var = q1Var.f1404d;
            if (k1Var.f1347b.containsKey(j0Var.mWho) && k1Var.f1350e) {
                z11 = k1Var.f1351f;
            } else {
                z11 = true;
            }
            if (!z11) {
                String str = j0Var.mTargetWho;
                if (str != null && (b10 = q1Var.b(str)) != null && b10.mRetainInstance) {
                    j0Var.mTarget = b10;
                }
                j0Var.mState = 0;
                return;
            }
        }
        s0 s0Var = j0Var.mHost;
        if (s0Var instanceof androidx.lifecycle.e1) {
            z12 = q1Var.f1404d.f1351f;
        } else {
            l.i iVar = s0Var.B;
            if (iVar != null) {
                z12 = true ^ iVar.isChangingConfigurations();
            }
        }
        if ((z10 && !j0Var.mBeingSaved) || z12) {
            q1Var.f1404d.f(j0Var, false);
        }
        j0Var.performDestroy();
        this.f1390a.d(j0Var, false);
        ArrayList d4 = q1Var.d();
        int size = d4.size();
        while (i2 < size) {
            Object obj = d4.get(i2);
            i2++;
            p1 p1Var = (p1) obj;
            if (p1Var != null) {
                j0 j0Var2 = p1Var.f1392c;
                if (j0Var.mWho.equals(j0Var2.mTargetWho)) {
                    j0Var2.mTarget = j0Var;
                    j0Var2.mTargetWho = null;
                }
            }
        }
        String str2 = j0Var.mTargetWho;
        if (str2 != null) {
            j0Var.mTarget = q1Var.b(str2);
        }
        q1Var.h(this);
    }

    public final void h() {
        View view;
        boolean K = g1.K(3);
        j0 j0Var = this.f1392c;
        if (K) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + j0Var);
        }
        ViewGroup viewGroup = j0Var.mContainer;
        if (viewGroup != null && (view = j0Var.mView) != null) {
            viewGroup.removeView(view);
        }
        j0Var.performDestroyView();
        this.f1390a.n(j0Var, false);
        j0Var.mContainer = null;
        j0Var.mView = null;
        j0Var.mViewLifecycleOwner = null;
        j0Var.mViewLifecycleOwnerLiveData.h(null);
        j0Var.mInLayout = false;
    }

    public final void i() {
        boolean z10;
        boolean K = g1.K(3);
        j0 j0Var = this.f1392c;
        if (K) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + j0Var);
        }
        j0Var.performDetach();
        this.f1390a.e(j0Var, false);
        j0Var.mState = -1;
        j0Var.mHost = null;
        j0Var.mParentFragment = null;
        j0Var.mFragmentManager = null;
        if (!j0Var.mRemoving || j0Var.isInBackStack()) {
            k1 k1Var = this.f1391b.f1404d;
            if (k1Var.f1347b.containsKey(j0Var.mWho) && k1Var.f1350e) {
                z10 = k1Var.f1351f;
            } else {
                z10 = true;
            }
            if (!z10) {
                return;
            }
        }
        if (g1.K(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + j0Var);
        }
        j0Var.initState();
    }

    public final void j() {
        Bundle bundle;
        j0 j0Var = this.f1392c;
        if (j0Var.mFromLayout && j0Var.mInLayout && !j0Var.mPerformedCreateView) {
            if (g1.K(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + j0Var);
            }
            Bundle bundle2 = j0Var.mSavedFragmentState;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("savedInstanceState");
            } else {
                bundle = null;
            }
            j0Var.performCreateView(j0Var.performGetLayoutInflater(bundle), null, bundle);
            View view = j0Var.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                j0Var.mView.setTag(R.id.fragment_container_view_tag, j0Var);
                if (j0Var.mHidden) {
                    j0Var.mView.setVisibility(8);
                }
                j0Var.performViewCreated();
                this.f1390a.m(j0Var, j0Var.mView, false);
                j0Var.mState = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z10 = this.f1393d;
        j0 j0Var = this.f1392c;
        if (z10) {
            if (g1.K(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + j0Var);
                return;
            }
            return;
        }
        try {
            this.f1393d = true;
            boolean z11 = false;
            while (true) {
                int d4 = d();
                int i2 = j0Var.mState;
                q1 q1Var = this.f1391b;
                if (d4 != i2) {
                    p0 p0Var = this.f1390a;
                    if (d4 > i2) {
                        switch (i2 + 1) {
                            case 0:
                                c();
                                continue;
                            case DSiCameraSource.FrontCamera /* 1 */:
                                e();
                                continue;
                            case 2:
                                j();
                                f();
                                continue;
                            case 3:
                                a();
                                continue;
                            case 4:
                                if (j0Var.mView != null && (viewGroup3 = j0Var.mContainer) != null) {
                                    q j2 = q.j(viewGroup3, j0Var.getParentFragmentManager());
                                    i2 from = i2.from(j0Var.mView.getVisibility());
                                    from.getClass();
                                    if (g1.K(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + j0Var);
                                    }
                                    j2.d(from, f2.ADDING, this);
                                }
                                j0Var.mState = 4;
                                continue;
                            case l1.c.f8511g /* 5 */:
                                if (g1.K(3)) {
                                    Log.d("FragmentManager", "moveto STARTED: " + j0Var);
                                }
                                j0Var.performStart();
                                p0Var.k(j0Var, false);
                                continue;
                            case l1.c.f8509e /* 6 */:
                                j0Var.mState = 6;
                                continue;
                            case 7:
                                m();
                                continue;
                        }
                    } else {
                        switch (i2 - 1) {
                            case -1:
                                i();
                                continue;
                            case 0:
                                if (j0Var.mBeingSaved) {
                                    if (((Bundle) q1Var.f1403c.get(j0Var.mWho)) == null) {
                                        q1Var.i(n(), j0Var.mWho);
                                    }
                                }
                                g();
                                continue;
                            case DSiCameraSource.FrontCamera /* 1 */:
                                h();
                                j0Var.mState = 1;
                                continue;
                            case 2:
                                j0Var.mInLayout = false;
                                j0Var.mState = 2;
                                continue;
                            case 3:
                                if (g1.K(3)) {
                                    Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + j0Var);
                                }
                                if (j0Var.mBeingSaved) {
                                    q1Var.i(n(), j0Var.mWho);
                                } else if (j0Var.mView != null && j0Var.mSavedViewState == null) {
                                    o();
                                }
                                if (j0Var.mView != null && (viewGroup2 = j0Var.mContainer) != null) {
                                    q j10 = q.j(viewGroup2, j0Var.getParentFragmentManager());
                                    if (g1.K(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + j0Var);
                                    }
                                    j10.d(i2.REMOVED, f2.REMOVING, this);
                                }
                                j0Var.mState = 3;
                                continue;
                            case 4:
                                if (g1.K(3)) {
                                    Log.d("FragmentManager", "movefrom STARTED: " + j0Var);
                                }
                                j0Var.performStop();
                                p0Var.l(j0Var, false);
                                continue;
                            case l1.c.f8511g /* 5 */:
                                j0Var.mState = 5;
                                continue;
                            case l1.c.f8509e /* 6 */:
                                if (g1.K(3)) {
                                    Log.d("FragmentManager", "movefrom RESUMED: " + j0Var);
                                }
                                j0Var.performPause();
                                p0Var.f(j0Var, false);
                                continue;
                            default:
                                continue;
                        }
                    }
                    z11 = true;
                } else {
                    if (!z11 && i2 == -1 && j0Var.mRemoving && !j0Var.isInBackStack() && !j0Var.mBeingSaved) {
                        if (g1.K(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + j0Var);
                        }
                        q1Var.f1404d.f(j0Var, true);
                        q1Var.h(this);
                        if (g1.K(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + j0Var);
                        }
                        j0Var.initState();
                    }
                    if (j0Var.mHiddenChanged) {
                        if (j0Var.mView != null && (viewGroup = j0Var.mContainer) != null) {
                            q j11 = q.j(viewGroup, j0Var.getParentFragmentManager());
                            if (j0Var.mHidden) {
                                if (g1.K(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + j0Var);
                                }
                                j11.d(i2.GONE, f2.NONE, this);
                            } else {
                                if (g1.K(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + j0Var);
                                }
                                j11.d(i2.VISIBLE, f2.NONE, this);
                            }
                        }
                        g1 g1Var = j0Var.mFragmentManager;
                        if (g1Var != null && j0Var.mAdded && g1.L(j0Var)) {
                            g1Var.G = true;
                        }
                        j0Var.mHiddenChanged = false;
                        j0Var.onHiddenChanged(j0Var.mHidden);
                        j0Var.mChildFragmentManager.o();
                    }
                    this.f1393d = false;
                    return;
                }
            }
        } catch (Throwable th2) {
            this.f1393d = false;
            throw th2;
        }
    }

    public final void l(ClassLoader classLoader) {
        j0 j0Var = this.f1392c;
        Bundle bundle = j0Var.mSavedFragmentState;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            if (j0Var.mSavedFragmentState.getBundle("savedInstanceState") == null) {
                j0Var.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
            }
            try {
                j0Var.mSavedViewState = j0Var.mSavedFragmentState.getSparseParcelableArray("viewState");
                j0Var.mSavedViewRegistryState = j0Var.mSavedFragmentState.getBundle("viewRegistryState");
                m1 m1Var = (m1) j0Var.mSavedFragmentState.getParcelable("state");
                if (m1Var != null) {
                    j0Var.mTargetWho = m1Var.f1362g0;
                    j0Var.mTargetRequestCode = m1Var.f1363h0;
                    Boolean bool = j0Var.mSavedUserVisibleHint;
                    if (bool != null) {
                        j0Var.mUserVisibleHint = bool.booleanValue();
                        j0Var.mSavedUserVisibleHint = null;
                    } else {
                        j0Var.mUserVisibleHint = m1Var.f1364i0;
                    }
                }
                if (!j0Var.mUserVisibleHint) {
                    j0Var.mDeferStart = true;
                }
            } catch (BadParcelableException e6) {
                throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + j0Var, e6);
            }
        }
    }

    public final void m() {
        String str;
        boolean K = g1.K(3);
        j0 j0Var = this.f1392c;
        if (K) {
            Log.d("FragmentManager", "moveto RESUMED: " + j0Var);
        }
        View focusedView = j0Var.getFocusedView();
        if (focusedView != null) {
            if (focusedView != j0Var.mView) {
                for (ViewParent parent = focusedView.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != j0Var.mView) {
                    }
                }
            }
            boolean requestFocus = focusedView.requestFocus();
            if (g1.K(2)) {
                StringBuilder sb2 = new StringBuilder("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(" ");
                if (requestFocus) {
                    str = "succeeded";
                } else {
                    str = "failed";
                }
                sb2.append(str);
                sb2.append(" on Fragment ");
                sb2.append(j0Var);
                sb2.append(" resulting in focused view ");
                sb2.append(j0Var.mView.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        j0Var.setFocusedView(null);
        j0Var.performResume();
        this.f1390a.i(j0Var, false);
        this.f1391b.i(null, j0Var.mWho);
        j0Var.mSavedFragmentState = null;
        j0Var.mSavedViewState = null;
        j0Var.mSavedViewRegistryState = null;
    }

    public final Bundle n() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        j0 j0Var = this.f1392c;
        if (j0Var.mState == -1 && (bundle = j0Var.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new m1(j0Var));
        if (j0Var.mState > 0) {
            Bundle bundle3 = new Bundle();
            j0Var.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f1390a.j(j0Var, bundle3, false);
            Bundle bundle4 = new Bundle();
            j0Var.mSavedStateRegistryController.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle W = j0Var.mChildFragmentManager.W();
            if (!W.isEmpty()) {
                bundle2.putBundle("childFragmentManager", W);
            }
            if (j0Var.mView != null) {
                o();
            }
            SparseArray<Parcelable> sparseArray = j0Var.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = j0Var.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = j0Var.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void o() {
        j0 j0Var = this.f1392c;
        if (j0Var.mView != null) {
            if (g1.K(2)) {
                Log.v("FragmentManager", "Saving view state for fragment " + j0Var + " with view " + j0Var.mView);
            }
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            j0Var.mView.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                j0Var.mSavedViewState = sparseArray;
            }
            Bundle bundle = new Bundle();
            j0Var.mViewLifecycleOwner.Y.c(bundle);
            if (!bundle.isEmpty()) {
                j0Var.mSavedViewRegistryState = bundle;
            }
        }
    }

    public p1(p0 p0Var, q1 q1Var, j0 j0Var) {
        this.f1390a = p0Var;
        this.f1391b = q1Var;
        this.f1392c = j0Var;
    }

    public p1(p0 p0Var, q1 q1Var, j0 j0Var, Bundle bundle) {
        this.f1390a = p0Var;
        this.f1391b = q1Var;
        this.f1392c = j0Var;
        j0Var.mSavedViewState = null;
        j0Var.mSavedViewRegistryState = null;
        j0Var.mBackStackNesting = 0;
        j0Var.mInLayout = false;
        j0Var.mAdded = false;
        j0 j0Var2 = j0Var.mTarget;
        j0Var.mTargetWho = j0Var2 != null ? j0Var2.mWho : null;
        j0Var.mTarget = null;
        j0Var.mSavedFragmentState = bundle;
        j0Var.mArguments = bundle.getBundle("arguments");
    }
}
