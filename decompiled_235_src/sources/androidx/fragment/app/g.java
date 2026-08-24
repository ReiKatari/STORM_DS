package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class g extends wn6 {
    public final ArrayList c;
    public final b0 d;
    public final b0 e;
    public final dm2 f;
    public final Object g;
    public final ArrayList h;
    public final ArrayList i;
    public final wu j;
    public final ArrayList k;
    public final ArrayList l;
    public final wu m;
    public final wu n;
    public final boolean o;
    public final uj0 p = new Object();
    public Object q;
    public boolean r;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, uj0] */
    public g(ArrayList arrayList, b0 b0Var, b0 b0Var2, dm2 dm2Var, Object obj, ArrayList arrayList2, ArrayList arrayList3, wu wuVar, ArrayList arrayList4, ArrayList arrayList5, wu wuVar2, wu wuVar3, boolean z) {
        this.c = arrayList;
        this.d = b0Var;
        this.e = b0Var2;
        this.f = dm2Var;
        this.g = obj;
        this.h = arrayList2;
        this.i = arrayList3;
        this.j = wuVar;
        this.k = arrayList4;
        this.l = arrayList5;
        this.m = wuVar2;
        this.n = wuVar3;
        this.o = z;
    }

    public static void f(View view, ArrayList arrayList) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = jo7.a;
            if (viewGroup.isTransitionGroup()) {
                if (!arrayList.contains(view)) {
                    arrayList.add(view);
                    return;
                }
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    f(childAt, arrayList);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    @Override // defpackage.wn6
    public final boolean a() {
        dm2 dm2Var = this.f;
        if (dm2Var.l()) {
            ArrayList arrayList = this.c;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    nf1 nf1Var = (nf1) obj;
                    if (Build.VERSION.SDK_INT >= 34) {
                        Object obj2 = nf1Var.b;
                        if (obj2 != null) {
                            if (!dm2Var.m(obj2)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            Object obj3 = this.g;
            if (obj3 == null || dm2Var.m(obj3)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.wn6
    public final void b(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.p.a();
    }

    @Override // defpackage.wn6
    public final void c(ViewGroup viewGroup) {
        viewGroup.getClass();
        boolean isLaidOut = viewGroup.isLaidOut();
        ArrayList arrayList = this.c;
        int i = 2;
        if (isLaidOut && !this.r) {
            Object obj = this.q;
            dm2 dm2Var = this.f;
            b0 b0Var = this.e;
            b0 b0Var2 = this.d;
            if (obj != null) {
                dm2Var.c(obj);
                if (u.K(2)) {
                    Log.v("FragmentManager", "Ending execution of operations from " + b0Var2 + " to " + b0Var);
                    return;
                }
                return;
            }
            vr4 g = g(viewGroup, b0Var, b0Var2);
            ArrayList arrayList2 = (ArrayList) g.A;
            Object obj2 = g.B;
            ArrayList arrayList3 = new ArrayList(ht0.v0(arrayList, 10));
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj3 = arrayList.get(i2);
                i2++;
                arrayList3.add(((nf1) obj3).a);
            }
            int size2 = arrayList3.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj4 = arrayList3.get(i3);
                i3++;
                b0 b0Var3 = (b0) obj4;
                int i4 = i;
                dm2Var.u(b0Var3.c, obj2, this.p, new kf1(b0Var3, this, 1));
                i = i4;
            }
            i(arrayList2, viewGroup, new mf1(this, viewGroup, obj2, 0));
            if (u.K(i)) {
                Log.v("FragmentManager", "Completed executing operations from " + b0Var2 + " to " + b0Var);
                return;
            }
            return;
        }
        int size3 = arrayList.size();
        int i5 = 0;
        while (i5 < size3) {
            Object obj5 = arrayList.get(i5);
            i5++;
            nf1 nf1Var = (nf1) obj5;
            b0 b0Var4 = nf1Var.a;
            if (u.K(2)) {
                if (this.r) {
                    Log.v("FragmentManager", "SpecialEffectsController: TransitionSeekController was not created. Completing operation " + b0Var4);
                } else {
                    Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + b0Var4);
                }
            }
            nf1Var.a.c(this);
        }
        this.r = false;
    }

    @Override // defpackage.wn6
    public final void d(b00 b00Var, ViewGroup viewGroup) {
        viewGroup.getClass();
        Object obj = this.q;
        if (obj != null) {
            this.f.r(obj, b00Var.c);
        }
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.io.Serializable] */
    @Override // defpackage.wn6
    public final void e(ViewGroup viewGroup) {
        Object obj;
        viewGroup.getClass();
        boolean isLaidOut = viewGroup.isLaidOut();
        int i = 0;
        ArrayList arrayList = this.c;
        if (!isLaidOut) {
            int size = arrayList.size();
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                b0 b0Var = ((nf1) obj2).a;
                if (u.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Skipping onStart for operation " + b0Var);
                }
            }
            return;
        }
        boolean h = h();
        b0 b0Var2 = this.e;
        b0 b0Var3 = this.d;
        if (h && (obj = this.g) != null && !a()) {
            Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + b0Var3 + " and " + b0Var2 + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
        }
        if (a() && h()) {
            ?? obj3 = new Object();
            vr4 g = g(viewGroup, b0Var2, b0Var3);
            ArrayList arrayList2 = (ArrayList) g.A;
            Object obj4 = g.B;
            ArrayList arrayList3 = new ArrayList(ht0.v0(arrayList, 10));
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj5 = arrayList.get(i2);
                i2++;
                arrayList3.add(((nf1) obj5).a);
            }
            int size3 = arrayList3.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj6 = arrayList3.get(i3);
                i3++;
                b0 b0Var4 = (b0) obj6;
                n0 n0Var = new n0(obj3, 15);
                o oVar = b0Var4.c;
                this.f.v(obj4, this.p, n0Var, new kf1(b0Var4, this, 0));
            }
            i(arrayList2, viewGroup, new ig(this, viewGroup, obj4, obj3, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0239 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0223 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vr4 g(ViewGroup viewGroup, b0 b0Var, b0 b0Var2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Object obj;
        dm2 dm2Var;
        Object obj2;
        ArrayList arrayList3;
        int i;
        b0 b0Var3 = b0Var;
        View view = new View(viewGroup.getContext());
        Rect rect = new Rect();
        ArrayList arrayList4 = this.c;
        int size = arrayList4.size();
        View view2 = null;
        boolean z = false;
        int i2 = 0;
        while (true) {
            arrayList = this.i;
            arrayList2 = this.h;
            obj = this.g;
            dm2Var = this.f;
            if (i2 >= size) {
                break;
            }
            Object obj3 = arrayList4.get(i2);
            i2++;
            if (((nf1) obj3).d != null && b0Var2 != null && b0Var3 != null && !this.j.isEmpty() && obj != null) {
                o oVar = b0Var3.c;
                int i3 = size;
                o oVar2 = b0Var2.c;
                bm2 bm2Var = wl2.a;
                oVar.getClass();
                oVar2.getClass();
                if (this.o) {
                    oVar2.getEnterTransitionCallback();
                } else {
                    oVar.getEnterTransitionCallback();
                }
                fm4.a(viewGroup, new defpackage.v(b0Var3, b0Var2, this, 11));
                wu wuVar = this.m;
                arrayList2.addAll(wuVar.values());
                ArrayList arrayList5 = this.l;
                boolean z2 = z;
                if (!arrayList5.isEmpty()) {
                    Object obj4 = arrayList5.get(0);
                    obj4.getClass();
                    View view3 = (View) wuVar.get((String) obj4);
                    dm2Var.s(view3, obj);
                    view2 = view3;
                }
                wu wuVar2 = this.n;
                arrayList.addAll(wuVar2.values());
                ArrayList arrayList6 = this.k;
                if (!arrayList6.isEmpty()) {
                    Object obj5 = arrayList6.get(0);
                    obj5.getClass();
                    View view4 = (View) wuVar2.get((String) obj5);
                    if (view4 != null) {
                        fm4.a(viewGroup, new mf(dm2Var, view4, rect));
                        z = true;
                        dm2Var.w(obj, view, arrayList2);
                        Object obj6 = this.g;
                        dm2Var.q(obj6, null, null, obj6, arrayList);
                        size = i3;
                    }
                }
                z = z2;
                dm2Var.w(obj, view, arrayList2);
                Object obj62 = this.g;
                dm2Var.q(obj62, null, null, obj62, arrayList);
                size = i3;
            } else {
                size = size;
                z = z;
            }
        }
        boolean z3 = z;
        ArrayList arrayList7 = arrayList;
        ArrayList arrayList8 = new ArrayList();
        int size2 = arrayList4.size();
        Object obj7 = null;
        Object obj8 = null;
        int i4 = 0;
        while (true) {
            ArrayList arrayList9 = arrayList7;
            if (i4 >= size2) {
                break;
            }
            Object obj9 = arrayList4.get(i4);
            int i5 = i4 + 1;
            ArrayList arrayList10 = arrayList4;
            nf1 nf1Var = (nf1) obj9;
            int i6 = size2;
            b0 b0Var4 = nf1Var.a;
            Object h = dm2Var.h(nf1Var.b);
            if (h != null) {
                ArrayList arrayList11 = arrayList2;
                ArrayList arrayList12 = new ArrayList();
                Object obj10 = obj;
                o oVar3 = b0Var4.c;
                Object obj11 = obj8;
                View view5 = oVar3.mView;
                view5.getClass();
                f(view5, arrayList12);
                if (obj10 != null && (b0Var4 == b0Var2 || b0Var4 == b0Var3)) {
                    if (b0Var4 == b0Var2) {
                        arrayList12.removeAll(gt0.p1(arrayList11));
                    } else {
                        arrayList12.removeAll(gt0.p1(arrayList9));
                    }
                }
                if (arrayList12.isEmpty()) {
                    dm2Var.a(view, h);
                    obj2 = h;
                    arrayList3 = arrayList12;
                } else {
                    dm2Var.b(h, arrayList12);
                    dm2Var.q(h, h, arrayList12, null, null);
                    obj2 = h;
                    arrayList3 = arrayList12;
                    if (b0Var4.a == ao6.GONE) {
                        b0Var4.i = false;
                        ArrayList arrayList13 = new ArrayList(arrayList3);
                        arrayList13.remove(oVar3.mView);
                        dm2Var.p(obj2, oVar3.mView, arrayList13);
                        i = 0;
                        fm4.a(viewGroup, new lf1(0, arrayList3));
                        if (b0Var4.a != ao6.VISIBLE) {
                            arrayList8.addAll(arrayList3);
                            if (z3) {
                                dm2Var.t(obj2, rect);
                            }
                            if (u.K(2)) {
                                Log.v("FragmentManager", "Entering Transition: " + obj2);
                                Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                                int i7 = i;
                                for (int size3 = arrayList3.size(); i7 < size3; size3 = size3) {
                                    Object obj12 = arrayList3.get(i7);
                                    i7++;
                                    obj12.getClass();
                                    View view6 = (View) obj12;
                                    Log.v("FragmentManager", "View: " + view6);
                                }
                            }
                        } else {
                            dm2Var.s(view2, obj2);
                            if (u.K(2)) {
                                Log.v("FragmentManager", "Exiting Transition: " + obj2);
                                Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                                int i8 = 0;
                                for (int size4 = arrayList3.size(); i8 < size4; size4 = size4) {
                                    Object obj13 = arrayList3.get(i8);
                                    i8++;
                                    obj13.getClass();
                                    Log.v("FragmentManager", "View: " + ((View) obj13));
                                }
                            }
                        }
                        if (!nf1Var.c) {
                            obj7 = dm2Var.o(obj7, obj2);
                            size2 = i6;
                            b0Var3 = b0Var;
                            arrayList7 = arrayList9;
                            arrayList4 = arrayList10;
                            i4 = i5;
                            arrayList2 = arrayList11;
                            obj = obj10;
                            obj8 = obj11;
                        } else {
                            obj8 = dm2Var.o(obj11, obj2);
                            size2 = i6;
                            b0Var3 = b0Var;
                            arrayList7 = arrayList9;
                            arrayList4 = arrayList10;
                            i4 = i5;
                            arrayList2 = arrayList11;
                            obj = obj10;
                        }
                    }
                }
                i = 0;
                if (b0Var4.a != ao6.VISIBLE) {
                }
                if (!nf1Var.c) {
                }
            } else {
                size2 = i6;
                arrayList7 = arrayList9;
                arrayList4 = arrayList10;
                i4 = i5;
                b0Var3 = b0Var;
            }
        }
        Object n = dm2Var.n(obj7, obj8, obj);
        if (u.K(2)) {
            Log.v("FragmentManager", "Final merged transition: " + n + " for container " + viewGroup);
        }
        return new vr4(arrayList8, n);
    }

    public final boolean h() {
        ArrayList arrayList = this.c;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (!((nf1) obj).a.c.mTransitioning) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public final void i(ArrayList arrayList, ViewGroup viewGroup, on2 on2Var) {
        wl2.a(4, arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.i;
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList3.get(i);
            WeakHashMap weakHashMap = ao7.a;
            arrayList2.add(view.getTransitionName());
            view.setTransitionName(null);
        }
        boolean K = u.K(2);
        ArrayList arrayList4 = this.h;
        if (K) {
            Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
            Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
            int size2 = arrayList4.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj = arrayList4.get(i2);
                i2++;
                obj.getClass();
                View view2 = (View) obj;
                StringBuilder sb = new StringBuilder("View: ");
                sb.append(view2);
                sb.append(" Name: ");
                WeakHashMap weakHashMap2 = ao7.a;
                sb.append(view2.getTransitionName());
                Log.v("FragmentManager", sb.toString());
            }
            Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
            int size3 = arrayList3.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj2 = arrayList3.get(i3);
                i3++;
                obj2.getClass();
                View view3 = (View) obj2;
                StringBuilder sb2 = new StringBuilder("View: ");
                sb2.append(view3);
                sb2.append(" Name: ");
                WeakHashMap weakHashMap3 = ao7.a;
                sb2.append(view3.getTransitionName());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        on2Var.c();
        int size4 = arrayList3.size();
        ArrayList arrayList5 = new ArrayList();
        for (int i4 = 0; i4 < size4; i4++) {
            View view4 = (View) arrayList4.get(i4);
            WeakHashMap weakHashMap4 = ao7.a;
            String transitionName = view4.getTransitionName();
            arrayList5.add(transitionName);
            if (transitionName != null) {
                view4.setTransitionName(null);
                String str = (String) this.j.get(transitionName);
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        break;
                    } else if (str.equals(arrayList2.get(i5))) {
                        ((View) arrayList3.get(i5)).setTransitionName(transitionName);
                        break;
                    } else {
                        i5++;
                    }
                }
            }
        }
        fm4.a(viewGroup, new cm2(size4, arrayList3, arrayList2, arrayList4, arrayList5));
        wl2.a(0, arrayList);
        this.f.x(this.g, arrayList4, arrayList3);
    }
}
