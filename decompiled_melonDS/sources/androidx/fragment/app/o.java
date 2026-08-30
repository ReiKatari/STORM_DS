package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o extends d2 {

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f1365c;

    /* renamed from: d  reason: collision with root package name */
    public final e2 f1366d;

    /* renamed from: e  reason: collision with root package name */
    public final e2 f1367e;

    /* renamed from: f  reason: collision with root package name */
    public final z1 f1368f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f1369g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f1370h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f1371i;

    /* renamed from: j  reason: collision with root package name */
    public final a1.e f1372j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f1373k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f1374l;
    public final a1.e m;

    /* renamed from: n  reason: collision with root package name */
    public final a1.e f1375n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f1376o;

    /* renamed from: p  reason: collision with root package name */
    public final u5.a f1377p = new Object();

    /* renamed from: q  reason: collision with root package name */
    public Object f1378q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1379r;

    /* JADX WARN: Type inference failed for: r1v1, types: [u5.a, java.lang.Object] */
    public o(ArrayList arrayList, e2 e2Var, e2 e2Var2, z1 z1Var, Object obj, ArrayList arrayList2, ArrayList arrayList3, a1.e eVar, ArrayList arrayList4, ArrayList arrayList5, a1.e eVar2, a1.e eVar3, boolean z10) {
        this.f1365c = arrayList;
        this.f1366d = e2Var;
        this.f1367e = e2Var2;
        this.f1368f = z1Var;
        this.f1369g = obj;
        this.f1370h = arrayList2;
        this.f1371i = arrayList3;
        this.f1372j = eVar;
        this.f1373k = arrayList4;
        this.f1374l = arrayList5;
        this.m = eVar2;
        this.f1375n = eVar3;
        this.f1376o = z10;
    }

    public static void f(View view, ArrayList arrayList) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i2 = a6.z0.f541a;
            if (viewGroup.isTransitionGroup()) {
                if (!arrayList.contains(view)) {
                    arrayList.add(view);
                    return;
                }
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    f(childAt, arrayList);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    @Override // androidx.fragment.app.d2
    public final boolean a() {
        z1 z1Var = this.f1368f;
        if (z1Var.l()) {
            ArrayList arrayList = this.f1365c;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    p pVar = (p) obj;
                    if (Build.VERSION.SDK_INT >= 34) {
                        Object obj2 = pVar.f1385b;
                        if (obj2 != null) {
                            if (!z1Var.m(obj2)) {
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
            Object obj3 = this.f1369g;
            if (obj3 == null || z1Var.m(obj3)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.d2
    public final void b(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.f1377p.a();
    }

    @Override // androidx.fragment.app.d2
    public final void c(ViewGroup viewGroup) {
        viewGroup.getClass();
        boolean isLaidOut = viewGroup.isLaidOut();
        int i2 = 0;
        ArrayList arrayList = this.f1365c;
        int i10 = 2;
        if (isLaidOut && !this.f1379r) {
            Object obj = this.f1378q;
            z1 z1Var = this.f1368f;
            e2 e2Var = this.f1367e;
            e2 e2Var2 = this.f1366d;
            if (obj != null) {
                z1Var.c(obj);
                if (g1.K(2)) {
                    Log.v("FragmentManager", "Ending execution of operations from " + e2Var2 + " to " + e2Var);
                    return;
                }
                return;
            }
            yb.j g10 = g(viewGroup, e2Var, e2Var2);
            ArrayList arrayList2 = (ArrayList) g10.A;
            Object obj2 = g10.B;
            ArrayList arrayList3 = new ArrayList(zb.m.G(arrayList, 10));
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj3 = arrayList.get(i11);
                i11++;
                arrayList3.add(((p) obj3).f1343a);
            }
            int size2 = arrayList3.size();
            while (i2 < size2) {
                Object obj4 = arrayList3.get(i2);
                i2++;
                e2 e2Var3 = (e2) obj4;
                z1Var.u(e2Var3.f1273c, obj2, this.f1377p, new l(e2Var3, this, 1));
                i10 = i10;
            }
            i(arrayList2, viewGroup, new n(this, viewGroup, obj2, 0));
            if (g1.K(i10)) {
                Log.v("FragmentManager", "Completed executing operations from " + e2Var2 + " to " + e2Var);
                return;
            }
            return;
        }
        int size3 = arrayList.size();
        int i12 = 0;
        while (i12 < size3) {
            Object obj5 = arrayList.get(i12);
            i12++;
            p pVar = (p) obj5;
            e2 e2Var4 = pVar.f1343a;
            if (g1.K(2)) {
                if (this.f1379r) {
                    Log.v("FragmentManager", "SpecialEffectsController: TransitionSeekController was not created. Completing operation " + e2Var4);
                } else {
                    Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + e2Var4);
                }
            }
            pVar.f1343a.c(this);
        }
        this.f1379r = false;
    }

    @Override // androidx.fragment.app.d2
    public final void d(d.a aVar, ViewGroup viewGroup) {
        viewGroup.getClass();
        Object obj = this.f1378q;
        if (obj != null) {
            this.f1368f.r(obj, aVar.f3282c);
        }
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.io.Serializable] */
    @Override // androidx.fragment.app.d2
    public final void e(ViewGroup viewGroup) {
        Object obj;
        viewGroup.getClass();
        boolean isLaidOut = viewGroup.isLaidOut();
        int i2 = 0;
        ArrayList arrayList = this.f1365c;
        if (!isLaidOut) {
            int size = arrayList.size();
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                e2 e2Var = ((p) obj2).f1343a;
                if (g1.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Skipping onStart for operation " + e2Var);
                }
            }
        } else {
            boolean h2 = h();
            e2 e2Var2 = this.f1367e;
            e2 e2Var3 = this.f1366d;
            if (h2 && (obj = this.f1369g) != null && !a()) {
                Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + e2Var3 + " and " + e2Var2 + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (a() && h()) {
                ?? obj3 = new Object();
                yb.j g10 = g(viewGroup, e2Var2, e2Var3);
                ArrayList arrayList2 = (ArrayList) g10.A;
                Object obj4 = g10.B;
                ArrayList arrayList3 = new ArrayList(zb.m.G(arrayList, 10));
                int size2 = arrayList.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj5 = arrayList.get(i10);
                    i10++;
                    arrayList3.add(((p) obj5).f1343a);
                }
                int size3 = arrayList3.size();
                while (i2 < size3) {
                    Object obj6 = arrayList3.get(i2);
                    i2++;
                    e2 e2Var4 = (e2) obj6;
                    x xVar = new x(1, obj3);
                    j0 j0Var = e2Var4.f1273c;
                    this.f1368f.v(obj4, this.f1377p, xVar, new l(e2Var4, this, 0));
                }
                i(arrayList2, viewGroup, new a5.c(this, viewGroup, obj4, obj3, 1));
            }
        }
    }

    public final yb.j g(ViewGroup viewGroup, e2 e2Var, e2 e2Var2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Object obj;
        z1 z1Var;
        z1 z1Var2;
        Object obj2;
        ArrayList arrayList3;
        int i2;
        boolean z10;
        e2 e2Var3 = e2Var;
        View view = new View(viewGroup.getContext());
        Rect rect = new Rect();
        ArrayList arrayList4 = this.f1365c;
        int size = arrayList4.size();
        View view2 = null;
        boolean z11 = false;
        int i10 = 0;
        while (true) {
            arrayList = this.f1371i;
            arrayList2 = this.f1370h;
            obj = this.f1369g;
            z1Var = this.f1368f;
            if (i10 >= size) {
                break;
            }
            Object obj3 = arrayList4.get(i10);
            i10++;
            if (((p) obj3).f1387d != null && e2Var2 != null && e2Var3 != null && !this.f1372j.isEmpty() && obj != null) {
                j0 j0Var = e2Var3.f1273c;
                i2 = size;
                j0 j0Var2 = e2Var2.f1273c;
                x1 x1Var = s1.f1414a;
                j0Var.getClass();
                j0Var2.getClass();
                if (this.f1376o) {
                    j0Var2.getEnterTransitionCallback();
                } else {
                    j0Var.getEnterTransitionCallback();
                }
                a6.x.a(viewGroup, new a0.i(e2Var3, e2Var2, this, 2));
                a1.e eVar = this.m;
                arrayList2.addAll(eVar.values());
                ArrayList arrayList5 = this.f1374l;
                if (!arrayList5.isEmpty()) {
                    z10 = z11;
                    Object obj4 = arrayList5.get(0);
                    obj4.getClass();
                    View view3 = (View) eVar.get((String) obj4);
                    z1Var.s(view3, obj);
                    view2 = view3;
                } else {
                    z10 = z11;
                }
                a1.e eVar2 = this.f1375n;
                arrayList.addAll(eVar2.values());
                ArrayList arrayList6 = this.f1373k;
                if (!arrayList6.isEmpty()) {
                    Object obj5 = arrayList6.get(0);
                    obj5.getClass();
                    View view4 = (View) eVar2.get((String) obj5);
                    if (view4 != null) {
                        a6.x.a(viewGroup, new m(z1Var, view4, rect));
                        z11 = true;
                        z1Var.w(obj, view, arrayList2);
                        Object obj6 = this.f1369g;
                        z1Var.q(obj6, null, null, obj6, arrayList);
                    }
                }
                z11 = z10;
                z1Var.w(obj, view, arrayList2);
                Object obj62 = this.f1369g;
                z1Var.q(obj62, null, null, obj62, arrayList);
            } else {
                i2 = size;
                z11 = z11;
            }
            size = i2;
        }
        boolean z12 = z11;
        z1 z1Var3 = z1Var;
        ArrayList arrayList7 = new ArrayList();
        int size2 = arrayList4.size();
        Object obj7 = null;
        Object obj8 = null;
        int i11 = 0;
        while (i11 < size2) {
            Object obj9 = arrayList4.get(i11);
            int i12 = i11 + 1;
            ArrayList arrayList8 = arrayList4;
            p pVar = (p) obj9;
            int i13 = size2;
            e2 e2Var4 = pVar.f1343a;
            Object h2 = z1Var3.h(pVar.f1385b);
            if (h2 != null) {
                ArrayList arrayList9 = arrayList2;
                ArrayList arrayList10 = new ArrayList();
                Object obj10 = obj;
                j0 j0Var3 = e2Var4.f1273c;
                Object obj11 = obj8;
                View view5 = j0Var3.mView;
                view5.getClass();
                f(view5, arrayList10);
                if (obj10 != null && (e2Var4 == e2Var2 || e2Var4 == e2Var3)) {
                    if (e2Var4 == e2Var2) {
                        arrayList10.removeAll(zb.l.s0(arrayList9));
                    } else {
                        arrayList10.removeAll(zb.l.s0(arrayList));
                    }
                }
                if (arrayList10.isEmpty()) {
                    z1Var3.a(view, h2);
                    obj2 = h2;
                    z1Var2 = z1Var3;
                    arrayList3 = arrayList10;
                } else {
                    z1Var3.b(h2, arrayList10);
                    z1 z1Var4 = z1Var3;
                    z1Var4.q(h2, h2, arrayList10, null, null);
                    z1Var2 = z1Var4;
                    obj2 = h2;
                    arrayList3 = arrayList10;
                    if (e2Var4.f1271a == i2.GONE) {
                        e2Var4.f1279i = false;
                        ArrayList arrayList11 = new ArrayList(arrayList3);
                        arrayList11.remove(j0Var3.mView);
                        z1Var2.p(obj2, j0Var3.mView, arrayList11);
                        a6.x.a(viewGroup, new x(2, arrayList3));
                    }
                }
                if (e2Var4.f1271a == i2.VISIBLE) {
                    arrayList7.addAll(arrayList3);
                    if (z12) {
                        z1Var2.t(obj2, rect);
                    }
                    if (g1.K(2)) {
                        Log.v("FragmentManager", "Entering Transition: " + obj2);
                        Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                        int i14 = 0;
                        for (int size3 = arrayList3.size(); i14 < size3; size3 = size3) {
                            Object obj12 = arrayList3.get(i14);
                            i14++;
                            obj12.getClass();
                            Log.v("FragmentManager", "View: " + ((View) obj12));
                        }
                    }
                } else {
                    z1Var2.s(view2, obj2);
                    if (g1.K(2)) {
                        Log.v("FragmentManager", "Exiting Transition: " + obj2);
                        Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                        int i15 = 0;
                        for (int size4 = arrayList3.size(); i15 < size4; size4 = size4) {
                            Object obj13 = arrayList3.get(i15);
                            i15++;
                            obj13.getClass();
                            Log.v("FragmentManager", "View: " + ((View) obj13));
                        }
                    }
                }
                if (pVar.f1386c) {
                    obj7 = z1Var2.o(obj7, obj2);
                    e2Var3 = e2Var;
                    z1Var3 = z1Var2;
                    size2 = i13;
                    arrayList4 = arrayList8;
                    i11 = i12;
                    arrayList2 = arrayList9;
                    obj = obj10;
                    obj8 = obj11;
                } else {
                    obj8 = z1Var2.o(obj11, obj2);
                    e2Var3 = e2Var;
                    z1Var3 = z1Var2;
                    size2 = i13;
                    arrayList4 = arrayList8;
                    i11 = i12;
                    arrayList2 = arrayList9;
                    obj = obj10;
                }
            } else {
                size2 = i13;
                arrayList4 = arrayList8;
                i11 = i12;
                e2Var3 = e2Var;
            }
        }
        Object n10 = z1Var3.n(obj7, obj8, obj);
        if (g1.K(2)) {
            Log.v("FragmentManager", "Final merged transition: " + n10 + " for container " + viewGroup);
        }
        return new yb.j(arrayList7, n10);
    }

    public final boolean h() {
        ArrayList arrayList = this.f1365c;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                if (!((p) obj).f1343a.f1273c.mTransitioning) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public final void i(ArrayList arrayList, ViewGroup viewGroup, mc.a aVar) {
        s1.a(4, arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f1371i;
        int size = arrayList3.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) arrayList3.get(i2);
            WeakHashMap weakHashMap = a6.x0.f533a;
            arrayList2.add(a6.p0.e(view));
            a6.p0.l(view, null);
        }
        boolean K = g1.K(2);
        ArrayList arrayList4 = this.f1370h;
        if (K) {
            Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
            Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
            int size2 = arrayList4.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj = arrayList4.get(i10);
                i10++;
                obj.getClass();
                View view2 = (View) obj;
                StringBuilder sb2 = new StringBuilder("View: ");
                sb2.append(view2);
                sb2.append(" Name: ");
                WeakHashMap weakHashMap2 = a6.x0.f533a;
                sb2.append(a6.p0.e(view2));
                Log.v("FragmentManager", sb2.toString());
            }
            Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
            int size3 = arrayList3.size();
            int i11 = 0;
            while (i11 < size3) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                obj2.getClass();
                View view3 = (View) obj2;
                StringBuilder sb3 = new StringBuilder("View: ");
                sb3.append(view3);
                sb3.append(" Name: ");
                WeakHashMap weakHashMap3 = a6.x0.f533a;
                sb3.append(a6.p0.e(view3));
                Log.v("FragmentManager", sb3.toString());
            }
        }
        aVar.b();
        int size4 = arrayList3.size();
        ArrayList arrayList5 = new ArrayList();
        for (int i12 = 0; i12 < size4; i12++) {
            View view4 = (View) arrayList4.get(i12);
            WeakHashMap weakHashMap4 = a6.x0.f533a;
            String e6 = a6.p0.e(view4);
            arrayList5.add(e6);
            if (e6 != null) {
                a6.p0.l(view4, null);
                String str = (String) this.f1372j.get(e6);
                int i13 = 0;
                while (true) {
                    if (i13 >= size4) {
                        break;
                    } else if (str.equals(arrayList2.get(i13))) {
                        a6.p0.l((View) arrayList3.get(i13), e6);
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        }
        a6.x.a(viewGroup, new y1(size4, arrayList3, arrayList2, arrayList4, arrayList5));
        s1.a(0, arrayList);
        this.f1368f.x(this.f1369g, arrayList4, arrayList3);
    }
}
