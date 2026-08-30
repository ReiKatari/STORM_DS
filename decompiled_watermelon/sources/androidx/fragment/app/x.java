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
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class x {
    public final k91 a;
    public final y b;
    public final o c;
    public boolean d = false;
    public int e = -1;

    public x(k91 k91Var, y yVar, ClassLoader classLoader, hg2 hg2Var, Bundle bundle) {
        this.a = k91Var;
        this.b = yVar;
        w wVar = (w) bundle.getParcelable("state");
        o a = hg2Var.a(wVar.A);
        a.mWho = wVar.B;
        a.mFromLayout = wVar.L;
        a.mInDynamicContainer = wVar.R;
        a.mRestored = true;
        a.mFragmentId = wVar.X;
        a.mContainerId = wVar.Y;
        a.mTag = wVar.Z;
        a.mRetainInstance = wVar.c0;
        a.mRemoving = wVar.d0;
        a.mDetached = wVar.e0;
        a.mHidden = wVar.f0;
        a.mMaxState = qm3.values()[wVar.g0];
        a.mTargetWho = wVar.h0;
        a.mTargetRequestCode = wVar.i0;
        a.mUserVisibleHint = wVar.j0;
        this.c = a;
        a.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a.setArguments(bundle2);
        if (u.K(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a);
        }
    }

    public final void a() {
        Bundle bundle;
        boolean K = u.K(3);
        o oVar = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + oVar);
        }
        Bundle bundle2 = oVar.mSavedFragmentState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        oVar.performActivityCreated(bundle);
        this.a.q(oVar, false);
    }

    public final void b() {
        o oVar;
        View view;
        View view2;
        o oVar2;
        o oVar3 = this.c;
        View view3 = oVar3.mContainer;
        while (true) {
            oVar = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            if (tag instanceof o) {
                oVar2 = (o) tag;
            } else {
                oVar2 = null;
            }
            if (oVar2 != null) {
                oVar = oVar2;
                break;
            }
            ViewParent parent = view3.getParent();
            if (parent instanceof View) {
                view3 = (View) parent;
            } else {
                view3 = null;
            }
        }
        o parentFragment = oVar3.getParentFragment();
        if (oVar != null && !oVar.equals(parentFragment)) {
            int i = oVar3.mContainerId;
            tg2 tg2Var = ug2.a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(oVar3);
            sb.append(" within the view of parent fragment ");
            sb.append(oVar);
            sb.append(" via container with ID ");
            ug2.b(new hc7(oVar3, wh1.m(sb, i, " without using parent's childFragmentManager")));
            ug2.a(oVar3).getClass();
            sg2 sg2Var = sg2.PENALTY_LOG;
        }
        ArrayList arrayList = this.b.a;
        ViewGroup viewGroup = oVar3.mContainer;
        int i2 = -1;
        if (viewGroup != null) {
            int indexOf = arrayList.indexOf(oVar3);
            int i3 = indexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        o oVar4 = (o) arrayList.get(indexOf);
                        if (oVar4.mContainer == viewGroup && (view = oVar4.mView) != null) {
                            i2 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    o oVar5 = (o) arrayList.get(i3);
                    if (oVar5.mContainer == viewGroup && (view2 = oVar5.mView) != null) {
                        i2 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
        }
        oVar3.mContainer.addView(oVar3.mView, i2);
    }

    public final void c() {
        boolean K = u.K(3);
        o oVar = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto ATTACHED: " + oVar);
        }
        o oVar2 = oVar.mTarget;
        x xVar = null;
        y yVar = this.b;
        if (oVar2 != null) {
            x xVar2 = (x) yVar.b.get(oVar2.mWho);
            if (xVar2 != null) {
                oVar.mTargetWho = oVar.mTarget.mWho;
                oVar.mTarget = null;
                xVar = xVar2;
            } else {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(oVar);
                o oVar3 = oVar.mTarget;
                sb.append(" declared target fragment ");
                sb.append(oVar3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
        } else {
            String str = oVar.mTargetWho;
            if (str != null && (xVar = (x) yVar.b.get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(oVar);
                sb2.append(" declared target fragment ");
                defpackage.i.n(b31.q(sb2, oVar.mTargetWho, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (xVar != null) {
            xVar.k();
        }
        u uVar = oVar.mFragmentManager;
        oVar.mHost = uVar.w;
        oVar.mParentFragment = uVar.y;
        k91 k91Var = this.a;
        k91Var.w(oVar, false);
        oVar.performAttach();
        k91Var.r(oVar, false);
    }

    public final int d() {
        hc6 hc6Var;
        int i;
        o oVar = this.c;
        if (oVar.mFragmentManager == null) {
            return oVar.mState;
        }
        int i2 = this.e;
        int i3 = rg2.a[oVar.mMaxState.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        i2 = Math.min(i2, -1);
                    } else {
                        i2 = Math.min(i2, 0);
                    }
                } else {
                    i2 = Math.min(i2, 1);
                }
            } else {
                i2 = Math.min(i2, 5);
            }
        }
        if (oVar.mFromLayout) {
            boolean z = oVar.mInLayout;
            int i4 = this.e;
            if (z) {
                i2 = Math.max(i4, 2);
                View view = oVar.mView;
                if (view != null && view.getParent() == null) {
                    i2 = Math.min(i2, 2);
                }
            } else {
                i2 = i4 < 4 ? Math.min(i2, oVar.mState) : Math.min(i2, 1);
            }
        }
        if (oVar.mInDynamicContainer && oVar.mContainer == null) {
            i2 = Math.min(i2, 4);
        }
        if (!oVar.mAdded) {
            i2 = Math.min(i2, 1);
        }
        ViewGroup viewGroup = oVar.mContainer;
        hc6 hc6Var2 = null;
        if (viewGroup != null) {
            h j = h.j(viewGroup, oVar.getParentFragmentManager());
            b0 g = j.g(oVar);
            if (g != null) {
                hc6Var = g.b;
            } else {
                hc6Var = null;
            }
            b0 h = j.h(oVar);
            if (h != null) {
                hc6Var2 = h.b;
            }
            if (hc6Var == null) {
                i = -1;
            } else {
                i = mc6.a[hc6Var.ordinal()];
            }
            if (i != -1 && i != 1) {
                hc6Var2 = hc6Var;
            }
        }
        if (hc6Var2 == hc6.ADDING) {
            i2 = Math.min(i2, 6);
        } else if (hc6Var2 == hc6.REMOVING) {
            i2 = Math.max(i2, 3);
        } else if (oVar.mRemoving) {
            if (oVar.isInBackStack()) {
                i2 = Math.min(i2, 1);
            } else {
                i2 = Math.min(i2, -1);
            }
        }
        if (oVar.mDeferStart && oVar.mState < 5) {
            i2 = Math.min(i2, 4);
        }
        if (oVar.mTransitioning) {
            i2 = Math.max(i2, 3);
        }
        if (u.K(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i2 + " for " + oVar);
        }
        return i2;
    }

    public final void e() {
        Bundle bundle;
        boolean K = u.K(3);
        o oVar = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto CREATED: " + oVar);
        }
        Bundle bundle2 = oVar.mSavedFragmentState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        if (!oVar.mIsCreated) {
            k91 k91Var = this.a;
            k91Var.x(oVar, false);
            oVar.performCreate(bundle);
            k91Var.s(oVar, false);
            return;
        }
        oVar.mState = 1;
        oVar.restoreChildFragmentState();
    }

    public final void f() {
        Bundle bundle;
        String str;
        o oVar = this.c;
        if (oVar.mFromLayout) {
            return;
        }
        if (u.K(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + oVar);
        }
        Bundle bundle2 = oVar.mSavedFragmentState;
        ViewGroup viewGroup = null;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        LayoutInflater performGetLayoutInflater = oVar.performGetLayoutInflater(bundle);
        ViewGroup viewGroup2 = oVar.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = oVar.mContainerId;
            if (i != 0) {
                if (i != -1) {
                    viewGroup = (ViewGroup) oVar.mFragmentManager.x.d(i);
                    if (viewGroup == null) {
                        if (!oVar.mRestored && !oVar.mInDynamicContainer) {
                            try {
                                str = oVar.getResources().getResourceName(oVar.mContainerId);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(oVar.mContainerId) + " (" + str + ") for fragment " + oVar);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        tg2 tg2Var = ug2.a;
                        ug2.b(new hc7(oVar, "Attempting to add fragment " + oVar + " to container " + viewGroup + " which is not a FragmentContainerView"));
                        ug2.a(oVar).getClass();
                        sg2 sg2Var = sg2.PENALTY_LOG;
                    }
                } else {
                    defpackage.i.i(wh1.k("Cannot create fragment ", oVar, " for a container view with no id"));
                    return;
                }
            }
        }
        oVar.mContainer = viewGroup;
        oVar.performCreateView(performGetLayoutInflater, viewGroup, bundle);
        if (oVar.mView != null) {
            if (u.K(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + oVar);
            }
            oVar.mView.setSaveFromParentEnabled(false);
            oVar.mView.setTag(R.id.fragment_container_view_tag, oVar);
            if (viewGroup != null) {
                b();
            }
            if (oVar.mHidden) {
                oVar.mView.setVisibility(8);
            }
            boolean isAttachedToWindow = oVar.mView.isAttachedToWindow();
            View view = oVar.mView;
            if (isAttachedToWindow) {
                WeakHashMap weakHashMap = aa7.a;
                view.requestApplyInsets();
            } else {
                view.addOnAttachStateChangeListener(new kh(3, view));
            }
            oVar.performViewCreated();
            this.a.C(oVar, oVar.mView, false);
            int visibility = oVar.mView.getVisibility();
            oVar.setPostOnViewCreatedAlpha(oVar.mView.getAlpha());
            if (oVar.mContainer != null && visibility == 0) {
                View findFocus = oVar.mView.findFocus();
                if (findFocus != null) {
                    oVar.setFocusedView(findFocus);
                    if (u.K(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + oVar);
                    }
                }
                oVar.mView.setAlpha(RecyclerView.A1);
            }
        }
        oVar.mState = 2;
    }

    public final void g() {
        boolean z;
        boolean z2;
        o b;
        boolean K = u.K(3);
        o oVar = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom CREATED: " + oVar);
        }
        boolean z3 = true;
        int i = 0;
        if (oVar.mRemoving && !oVar.isInBackStack()) {
            z = true;
        } else {
            z = false;
        }
        y yVar = this.b;
        if (z && !oVar.mBeingSaved) {
            yVar.i(null, oVar.mWho);
        }
        if (!z) {
            v vVar = yVar.d;
            if (vVar.b.containsKey(oVar.mWho) && vVar.e) {
                z2 = vVar.f;
            } else {
                z2 = true;
            }
            if (!z2) {
                String str = oVar.mTargetWho;
                if (str != null && (b = yVar.b(str)) != null && b.mRetainInstance) {
                    oVar.mTarget = b;
                }
                oVar.mState = 0;
                return;
            }
        }
        dg2 dg2Var = oVar.mHost;
        if (dg2Var instanceof ab7) {
            z3 = yVar.d.f;
        } else {
            xp xpVar = dg2Var.B;
            if (xpVar != null) {
                z3 = true ^ xpVar.isChangingConfigurations();
            }
        }
        if ((z && !oVar.mBeingSaved) || z3) {
            yVar.d.f(oVar, false);
        }
        oVar.performDestroy();
        this.a.t(oVar, false);
        ArrayList d = yVar.d();
        int size = d.size();
        while (i < size) {
            Object obj = d.get(i);
            i++;
            x xVar = (x) obj;
            if (xVar != null) {
                o oVar2 = xVar.c;
                if (oVar.mWho.equals(oVar2.mTargetWho)) {
                    oVar2.mTarget = oVar;
                    oVar2.mTargetWho = null;
                }
            }
        }
        String str2 = oVar.mTargetWho;
        if (str2 != null) {
            oVar.mTarget = yVar.b(str2);
        }
        yVar.h(this);
    }

    public final void h() {
        View view;
        boolean K = u.K(3);
        o oVar = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + oVar);
        }
        ViewGroup viewGroup = oVar.mContainer;
        if (viewGroup != null && (view = oVar.mView) != null) {
            viewGroup.removeView(view);
        }
        oVar.performDestroyView();
        this.a.D(oVar, false);
        oVar.mContainer = null;
        oVar.mView = null;
        oVar.mViewLifecycleOwner = null;
        oVar.mViewLifecycleOwnerLiveData.f(null);
        oVar.mInLayout = false;
    }

    public final void i() {
        boolean z;
        boolean K = u.K(3);
        o oVar = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + oVar);
        }
        oVar.performDetach();
        this.a.u(oVar, false);
        oVar.mState = -1;
        oVar.mHost = null;
        oVar.mParentFragment = null;
        oVar.mFragmentManager = null;
        if (!oVar.mRemoving || oVar.isInBackStack()) {
            v vVar = this.b.d;
            if (vVar.b.containsKey(oVar.mWho) && vVar.e) {
                z = vVar.f;
            } else {
                z = true;
            }
            if (!z) {
                return;
            }
        }
        if (u.K(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + oVar);
        }
        oVar.initState();
    }

    public final void j() {
        Bundle bundle;
        o oVar = this.c;
        if (oVar.mFromLayout && oVar.mInLayout && !oVar.mPerformedCreateView) {
            if (u.K(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + oVar);
            }
            Bundle bundle2 = oVar.mSavedFragmentState;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("savedInstanceState");
            } else {
                bundle = null;
            }
            oVar.performCreateView(oVar.performGetLayoutInflater(bundle), null, bundle);
            View view = oVar.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                oVar.mView.setTag(R.id.fragment_container_view_tag, oVar);
                if (oVar.mHidden) {
                    oVar.mView.setVisibility(8);
                }
                oVar.performViewCreated();
                this.a.C(oVar, oVar.mView, false);
                oVar.mState = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z = this.d;
        o oVar = this.c;
        if (z) {
            if (u.K(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + oVar);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int d = d();
                int i = oVar.mState;
                y yVar = this.b;
                if (d != i) {
                    k91 k91Var = this.a;
                    if (d > i) {
                        switch (i + 1) {
                            case 0:
                                c();
                                continue;
                            case 1:
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
                                if (oVar.mView != null && (viewGroup3 = oVar.mContainer) != null) {
                                    h j = h.j(viewGroup3, oVar.getParentFragmentManager());
                                    kc6 from = kc6.from(oVar.mView.getVisibility());
                                    from.getClass();
                                    if (u.K(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + oVar);
                                    }
                                    j.d(from, hc6.ADDING, this);
                                }
                                oVar.mState = 4;
                                continue;
                            case 5:
                                if (u.K(3)) {
                                    Log.d("FragmentManager", "moveto STARTED: " + oVar);
                                }
                                oVar.performStart();
                                k91Var.A(oVar, false);
                                continue;
                            case ig7.b /* 6 */:
                                oVar.mState = 6;
                                continue;
                            case 7:
                                m();
                                continue;
                        }
                    } else {
                        switch (i - 1) {
                            case -1:
                                i();
                                continue;
                            case 0:
                                if (oVar.mBeingSaved) {
                                    if (((Bundle) yVar.c.get(oVar.mWho)) == null) {
                                        yVar.i(n(), oVar.mWho);
                                    }
                                }
                                g();
                                continue;
                            case 1:
                                h();
                                oVar.mState = 1;
                                continue;
                            case 2:
                                oVar.mInLayout = false;
                                oVar.mState = 2;
                                continue;
                            case 3:
                                if (u.K(3)) {
                                    Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + oVar);
                                }
                                if (oVar.mBeingSaved) {
                                    yVar.i(n(), oVar.mWho);
                                } else if (oVar.mView != null && oVar.mSavedViewState == null) {
                                    o();
                                }
                                if (oVar.mView != null && (viewGroup2 = oVar.mContainer) != null) {
                                    h j2 = h.j(viewGroup2, oVar.getParentFragmentManager());
                                    if (u.K(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + oVar);
                                    }
                                    j2.d(kc6.REMOVED, hc6.REMOVING, this);
                                }
                                oVar.mState = 3;
                                continue;
                            case 4:
                                if (u.K(3)) {
                                    Log.d("FragmentManager", "movefrom STARTED: " + oVar);
                                }
                                oVar.performStop();
                                k91Var.B(oVar, false);
                                continue;
                            case 5:
                                oVar.mState = 5;
                                continue;
                            case ig7.b /* 6 */:
                                if (u.K(3)) {
                                    Log.d("FragmentManager", "movefrom RESUMED: " + oVar);
                                }
                                oVar.performPause();
                                k91Var.v(oVar, false);
                                continue;
                            default:
                                continue;
                        }
                    }
                    z2 = true;
                } else {
                    if (!z2 && i == -1 && oVar.mRemoving && !oVar.isInBackStack() && !oVar.mBeingSaved) {
                        if (u.K(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + oVar);
                        }
                        yVar.d.f(oVar, true);
                        yVar.h(this);
                        if (u.K(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + oVar);
                        }
                        oVar.initState();
                    }
                    if (oVar.mHiddenChanged) {
                        if (oVar.mView != null && (viewGroup = oVar.mContainer) != null) {
                            h j3 = h.j(viewGroup, oVar.getParentFragmentManager());
                            if (oVar.mHidden) {
                                if (u.K(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + oVar);
                                }
                                j3.d(kc6.GONE, hc6.NONE, this);
                            } else {
                                if (u.K(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + oVar);
                                }
                                j3.d(kc6.VISIBLE, hc6.NONE, this);
                            }
                        }
                        u uVar = oVar.mFragmentManager;
                        if (uVar != null && oVar.mAdded && u.L(oVar)) {
                            uVar.G = true;
                        }
                        oVar.mHiddenChanged = false;
                        oVar.onHiddenChanged(oVar.mHidden);
                        oVar.mChildFragmentManager.o();
                    }
                    this.d = false;
                    return;
                }
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public final void l(ClassLoader classLoader) {
        o oVar = this.c;
        Bundle bundle = oVar.mSavedFragmentState;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            if (oVar.mSavedFragmentState.getBundle("savedInstanceState") == null) {
                oVar.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
            }
            try {
                oVar.mSavedViewState = oVar.mSavedFragmentState.getSparseParcelableArray("viewState");
                oVar.mSavedViewRegistryState = oVar.mSavedFragmentState.getBundle("viewRegistryState");
                w wVar = (w) oVar.mSavedFragmentState.getParcelable("state");
                if (wVar != null) {
                    oVar.mTargetWho = wVar.h0;
                    oVar.mTargetRequestCode = wVar.i0;
                    Boolean bool = oVar.mSavedUserVisibleHint;
                    if (bool != null) {
                        oVar.mUserVisibleHint = bool.booleanValue();
                        oVar.mSavedUserVisibleHint = null;
                    } else {
                        oVar.mUserVisibleHint = wVar.j0;
                    }
                }
                if (!oVar.mUserVisibleHint) {
                    oVar.mDeferStart = true;
                }
            } catch (BadParcelableException e) {
                throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + oVar, e);
            }
        }
    }

    public final void m() {
        String str;
        boolean K = u.K(3);
        o oVar = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto RESUMED: " + oVar);
        }
        View focusedView = oVar.getFocusedView();
        if (focusedView != null) {
            if (focusedView != oVar.mView) {
                for (ViewParent parent = focusedView.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != oVar.mView) {
                    }
                }
            }
            boolean requestFocus = focusedView.requestFocus();
            if (u.K(2)) {
                StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                sb.append(focusedView);
                sb.append(" ");
                if (requestFocus) {
                    str = "succeeded";
                } else {
                    str = "failed";
                }
                sb.append(str);
                sb.append(" on Fragment ");
                sb.append(oVar);
                sb.append(" resulting in focused view ");
                sb.append(oVar.mView.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        oVar.setFocusedView(null);
        oVar.performResume();
        this.a.y(oVar, false);
        this.b.i(null, oVar.mWho);
        oVar.mSavedFragmentState = null;
        oVar.mSavedViewState = null;
        oVar.mSavedViewRegistryState = null;
    }

    public final Bundle n() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        o oVar = this.c;
        if (oVar.mState == -1 && (bundle = oVar.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new w(oVar));
        if (oVar.mState > 0) {
            Bundle bundle3 = new Bundle();
            oVar.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.a.z(oVar, bundle3, false);
            Bundle bundle4 = new Bundle();
            oVar.mSavedStateRegistryController.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle W = oVar.mChildFragmentManager.W();
            if (!W.isEmpty()) {
                bundle2.putBundle("childFragmentManager", W);
            }
            if (oVar.mView != null) {
                o();
            }
            SparseArray<Parcelable> sparseArray = oVar.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = oVar.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = oVar.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void o() {
        o oVar = this.c;
        if (oVar.mView != null) {
            if (u.K(2)) {
                Log.v("FragmentManager", "Saving view state for fragment " + oVar + " with view " + oVar.mView);
            }
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            oVar.mView.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                oVar.mSavedViewState = sparseArray;
            }
            Bundle bundle = new Bundle();
            oVar.mViewLifecycleOwner.Y.c(bundle);
            if (!bundle.isEmpty()) {
                oVar.mSavedViewRegistryState = bundle;
            }
        }
    }

    public x(k91 k91Var, y yVar, o oVar) {
        this.a = k91Var;
        this.b = yVar;
        this.c = oVar;
    }

    public x(k91 k91Var, y yVar, o oVar, Bundle bundle) {
        this.a = k91Var;
        this.b = yVar;
        this.c = oVar;
        oVar.mSavedViewState = null;
        oVar.mSavedViewRegistryState = null;
        oVar.mBackStackNesting = 0;
        oVar.mInLayout = false;
        oVar.mAdded = false;
        o oVar2 = oVar.mTarget;
        oVar.mTargetWho = oVar2 != null ? oVar2.mWho : null;
        oVar.mTarget = null;
        oVar.mSavedFragmentState = bundle;
        oVar.mArguments = bundle.getBundle("arguments");
    }
}
