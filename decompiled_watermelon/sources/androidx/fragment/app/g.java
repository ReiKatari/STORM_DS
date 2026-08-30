package androidx.fragment.app;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class g extends gc6 {
    public final ArrayList c;
    public final b0 d;
    public final b0 e;
    public final dh2 f;
    public final Object g;
    public final ArrayList h;
    public final ArrayList i;
    public final eu j;
    public final ArrayList k;
    public final ArrayList l;
    public final eu m;
    public final eu n;
    public final boolean o;
    public final lh0 p = new Object();
    public Object q;
    public boolean r;

    /* JADX WARN: Type inference failed for: r1v1, types: [lh0, java.lang.Object] */
    public g(ArrayList arrayList, b0 b0Var, b0 b0Var2, dh2 dh2Var, Object obj, ArrayList arrayList2, ArrayList arrayList3, eu euVar, ArrayList arrayList4, ArrayList arrayList5, eu euVar2, eu euVar3, boolean z) {
        this.c = arrayList;
        this.d = b0Var;
        this.e = b0Var2;
        this.f = dh2Var;
        this.g = obj;
        this.h = arrayList2;
        this.i = arrayList3;
        this.j = euVar;
        this.k = arrayList4;
        this.l = arrayList5;
        this.m = euVar2;
        this.n = euVar3;
        this.o = z;
    }

    public static void f(View view, ArrayList arrayList) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = ja7.a;
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

    @Override // defpackage.gc6
    public final boolean a() {
        dh2 dh2Var = this.f;
        if (dh2Var.l()) {
            ArrayList arrayList = this.c;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    pb1 pb1Var = (pb1) obj;
                    if (Build.VERSION.SDK_INT >= 34) {
                        Object obj2 = pb1Var.b;
                        if (obj2 != null) {
                            if (!dh2Var.m(obj2)) {
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
            if (obj3 == null || dh2Var.m(obj3)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gc6
    public final void b(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.p.a();
    }

    @Override // defpackage.gc6
    public final void c(ViewGroup viewGroup) {
        viewGroup.getClass();
        boolean isLaidOut = viewGroup.isLaidOut();
        ArrayList arrayList = this.c;
        int i = 2;
        if (isLaidOut && !this.r) {
            Object obj = this.q;
            dh2 dh2Var = this.f;
            b0 b0Var = this.e;
            b0 b0Var2 = this.d;
            if (obj != null) {
                dh2Var.c(obj);
                if (u.K(2)) {
                    Log.v("FragmentManager", "Ending execution of operations from " + b0Var2 + " to " + b0Var);
                    return;
                }
                return;
            }
            ti4 g = g(viewGroup, b0Var, b0Var2);
            ArrayList arrayList2 = (ArrayList) g.A;
            Object obj2 = g.B;
            ArrayList arrayList3 = new ArrayList(uq0.y0(arrayList, 10));
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj3 = arrayList.get(i2);
                i2++;
                arrayList3.add(((pb1) obj3).a);
            }
            int size2 = arrayList3.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj4 = arrayList3.get(i3);
                i3++;
                b0 b0Var3 = (b0) obj4;
                int i4 = i;
                dh2Var.u(b0Var3.c, obj2, this.p, new mb1(b0Var3, this, 1));
                i = i4;
            }
            i(arrayList2, viewGroup, new ob1(this, viewGroup, obj2, 0));
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
            pb1 pb1Var = (pb1) obj5;
            b0 b0Var4 = pb1Var.a;
            if (u.K(2)) {
                if (this.r) {
                    Log.v("FragmentManager", "SpecialEffectsController: TransitionSeekController was not created. Completing operation " + b0Var4);
                } else {
                    Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + b0Var4);
                }
            }
            pb1Var.a.c(this);
        }
        this.r = false;
    }

    @Override // defpackage.gc6
    public final void d(ky kyVar, ViewGroup viewGroup) {
        viewGroup.getClass();
        Object obj = this.q;
        if (obj != null) {
            this.f.r(obj, kyVar.c);
        }
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.io.Serializable] */
    @Override // defpackage.gc6
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
                b0 b0Var = ((pb1) obj2).a;
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
            ti4 g = g(viewGroup, b0Var2, b0Var3);
            ArrayList arrayList2 = (ArrayList) g.A;
            Object obj4 = g.B;
            ArrayList arrayList3 = new ArrayList(uq0.y0(arrayList, 10));
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj5 = arrayList.get(i2);
                i2++;
                arrayList3.add(((pb1) obj5).a);
            }
            int size3 = arrayList3.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj6 = arrayList3.get(i3);
                i3++;
                b0 b0Var4 = (b0) obj6;
                m0 m0Var = new m0(15, obj3);
                o oVar = b0Var4.c;
                this.f.v(obj4, this.p, m0Var, new mb1(b0Var4, this, 0));
            }
            i(arrayList2, viewGroup, new tf(this, viewGroup, obj4, obj3, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0239 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0223 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ti4 g(android.view.ViewGroup r31, androidx.fragment.app.b0 r32, androidx.fragment.app.b0 r33) {
        /*
            Method dump skipped, instructions count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.g.g(android.view.ViewGroup, androidx.fragment.app.b0, androidx.fragment.app.b0):ti4");
    }

    public final boolean h() {
        ArrayList arrayList = this.c;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (!((pb1) obj).a.c.mTransitioning) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public final void i(ArrayList arrayList, ViewGroup viewGroup, ki2 ki2Var) {
        wg2.a(4, arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.i;
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList3.get(i);
            WeakHashMap weakHashMap = aa7.a;
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
                WeakHashMap weakHashMap2 = aa7.a;
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
                WeakHashMap weakHashMap3 = aa7.a;
                sb2.append(view3.getTransitionName());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        ki2Var.c();
        int size4 = arrayList3.size();
        ArrayList arrayList5 = new ArrayList();
        for (int i4 = 0; i4 < size4; i4++) {
            View view4 = (View) arrayList4.get(i4);
            WeakHashMap weakHashMap4 = aa7.a;
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
        hd4.a(viewGroup, new ch2(size4, arrayList3, arrayList2, arrayList4, arrayList5));
        wg2.a(0, arrayList);
        this.f.x(this.g, arrayList4, arrayList3);
    }
}
