package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f1395a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f1396b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f1397c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1398d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1399e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1400f;

    public q(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.f1395a = viewGroup;
        this.f1396b = new ArrayList();
        this.f1397c = new ArrayList();
    }

    public static void f(a1.e eVar, View view) {
        WeakHashMap weakHashMap = a6.x0.f533a;
        String e6 = a6.p0.e(view);
        if (e6 != null) {
            eVar.put(e6, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    f(eVar, childAt);
                }
            }
        }
    }

    public static final q j(ViewGroup viewGroup, g1 g1Var) {
        viewGroup.getClass();
        g1Var.getClass();
        g1Var.I().getClass();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof q) {
            return (q) tag;
        }
        q qVar = new q(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, qVar);
        return qVar;
    }

    public static boolean k(ArrayList arrayList) {
        boolean z10;
        int size = arrayList.size();
        int i2 = 0;
        loop0: while (true) {
            z10 = true;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                e2 e2Var = (e2) obj;
                if (!e2Var.f1281k.isEmpty()) {
                    ArrayList arrayList2 = e2Var.f1281k;
                    if (arrayList2 == null || !arrayList2.isEmpty()) {
                        int size2 = arrayList2.size();
                        int i10 = 0;
                        while (i10 < size2) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
                            if (!((d2) obj2).a()) {
                                break;
                            }
                        }
                    }
                }
                z10 = false;
            }
            break loop0;
        }
        if (z10) {
            ArrayList arrayList3 = new ArrayList();
            int size3 = arrayList.size();
            int i11 = 0;
            while (i11 < size3) {
                Object obj3 = arrayList.get(i11);
                i11++;
                zb.l.L(((e2) obj3).f1281k, arrayList3);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void a(e2 e2Var) {
        e2Var.getClass();
        if (e2Var.f1279i) {
            i2 i2Var = e2Var.f1271a;
            View requireView = e2Var.f1273c.requireView();
            requireView.getClass();
            i2Var.applyState(requireView, this.f1395a);
            e2Var.f1279i = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x042e A[LOOP:20: B:136:0x042c->B:137:0x042e, LOOP_END] */
    /* JADX WARN: Type inference failed for: r11v2, types: [a1.w0, a1.e] */
    /* JADX WARN: Type inference failed for: r12v1, types: [a1.w0, a1.e] */
    /* JADX WARN: Type inference failed for: r13v1, types: [a1.w0, a1.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.util.ArrayList r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 1325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.q.b(java.util.ArrayList, boolean):void");
    }

    public final void c(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zb.l.L(((e2) it.next()).f1281k, arrayList);
        }
        List p0 = zb.l.p0(zb.l.s0(arrayList));
        int size = p0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((d2) p0.get(i2)).c(this.f1395a);
        }
        int size2 = list.size();
        for (int i10 = 0; i10 < size2; i10++) {
            a((e2) list.get(i10));
        }
        List p02 = zb.l.p0(list);
        int size3 = p02.size();
        for (int i11 = 0; i11 < size3; i11++) {
            e2 e2Var = (e2) p02.get(i11);
            if (e2Var.f1281k.isEmpty()) {
                e2Var.b();
            }
        }
    }

    public final void d(i2 i2Var, f2 f2Var, p1 p1Var) {
        synchronized (this.f1396b) {
            try {
                j0 j0Var = p1Var.f1392c;
                j0Var.getClass();
                e2 g10 = g(j0Var);
                if (g10 == null) {
                    j0 j0Var2 = p1Var.f1392c;
                    if (!j0Var2.mTransitioning && !j0Var2.mRemoving) {
                        g10 = null;
                    }
                    g10 = h(j0Var2);
                }
                if (g10 != null) {
                    g10.d(i2Var, f2Var);
                    return;
                }
                e2 e2Var = new e2(i2Var, f2Var, p1Var);
                this.f1396b.add(e2Var);
                e2Var.f1274d.add(new c2(this, e2Var, 0));
                e2Var.f1274d.add(new c2(this, e2Var, 2));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        boolean z10;
        if (this.f1400f) {
            return;
        }
        if (!this.f1395a.isAttachedToWindow()) {
            i();
            this.f1399e = false;
            return;
        }
        synchronized (this.f1396b) {
            try {
                ArrayList q02 = zb.l.q0(this.f1397c);
                this.f1397c.clear();
                int size = q02.size();
                int i2 = 0;
                while (true) {
                    z10 = true;
                    if (i2 >= size) {
                        break;
                    }
                    Object obj = q02.get(i2);
                    i2++;
                    e2 e2Var = (e2) obj;
                    if (this.f1396b.isEmpty() || !e2Var.f1273c.mTransitioning) {
                        z10 = false;
                    }
                    e2Var.f1277g = z10;
                }
                int size2 = q02.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj2 = q02.get(i10);
                    i10++;
                    e2 e2Var2 = (e2) obj2;
                    if (this.f1398d) {
                        if (g1.K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + e2Var2);
                        }
                        e2Var2.b();
                    } else {
                        if (g1.K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + e2Var2);
                        }
                        e2Var2.a(this.f1395a);
                    }
                    this.f1398d = false;
                    if (!e2Var2.f1276f) {
                        this.f1397c.add(e2Var2);
                    }
                }
                if (!this.f1396b.isEmpty()) {
                    n();
                    ArrayList q03 = zb.l.q0(this.f1396b);
                    if (q03.isEmpty()) {
                        return;
                    }
                    this.f1396b.clear();
                    this.f1397c.addAll(q03);
                    if (g1.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(q03, this.f1399e);
                    boolean k10 = k(q03);
                    int size3 = q03.size();
                    int i11 = 0;
                    boolean z11 = true;
                    while (i11 < size3) {
                        Object obj3 = q03.get(i11);
                        i11++;
                        if (!((e2) obj3).f1273c.mTransitioning) {
                            z11 = false;
                        }
                    }
                    if (!z11 || k10) {
                        z10 = false;
                    }
                    this.f1398d = z10;
                    if (g1.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + k10 + " \ntransition = " + z11);
                    }
                    if (!z11) {
                        m(q03);
                        c(q03);
                    } else if (k10) {
                        m(q03);
                        int size4 = q03.size();
                        for (int i12 = 0; i12 < size4; i12++) {
                            a((e2) q03.get(i12));
                        }
                    }
                    this.f1399e = false;
                    if (g1.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final e2 g(j0 j0Var) {
        Object obj;
        ArrayList arrayList = this.f1396b;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                obj = arrayList.get(i2);
                i2++;
                e2 e2Var = (e2) obj;
                if (nc.k.a(e2Var.f1273c, j0Var) && !e2Var.f1275e) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (e2) obj;
    }

    public final e2 h(j0 j0Var) {
        Object obj;
        ArrayList arrayList = this.f1397c;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                obj = arrayList.get(i2);
                i2++;
                e2 e2Var = (e2) obj;
                if (nc.k.a(e2Var.f1273c, j0Var) && !e2Var.f1275e) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (e2) obj;
    }

    public final void i() {
        String str;
        String str2;
        if (g1.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.f1395a.isAttachedToWindow();
        synchronized (this.f1396b) {
            try {
                n();
                m(this.f1396b);
                ArrayList q02 = zb.l.q0(this.f1397c);
                int size = q02.size();
                int i2 = 0;
                int i10 = 0;
                while (i10 < size) {
                    Object obj = q02.get(i10);
                    i10++;
                    ((e2) obj).f1277g = false;
                }
                int size2 = q02.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = q02.get(i11);
                    i11++;
                    e2 e2Var = (e2) obj2;
                    if (g1.K(2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f1395a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + e2Var);
                    }
                    e2Var.a(this.f1395a);
                }
                ArrayList q03 = zb.l.q0(this.f1396b);
                int size3 = q03.size();
                int i12 = 0;
                while (i12 < size3) {
                    Object obj3 = q03.get(i12);
                    i12++;
                    ((e2) obj3).f1277g = false;
                }
                int size4 = q03.size();
                while (i2 < size4) {
                    Object obj4 = q03.get(i2);
                    i2++;
                    e2 e2Var2 = (e2) obj4;
                    if (g1.K(2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f1395a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + e2Var2);
                    }
                    e2Var2.a(this.f1395a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l() {
        j0 j0Var;
        Object obj;
        boolean z10;
        synchronized (this.f1396b) {
            try {
                n();
                ArrayList arrayList = this.f1396b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    j0Var = null;
                    if (listIterator.hasPrevious()) {
                        obj = listIterator.previous();
                        e2 e2Var = (e2) obj;
                        g2 g2Var = i2.Companion;
                        View view = e2Var.f1273c.mView;
                        view.getClass();
                        g2Var.getClass();
                        i2 a10 = g2.a(view);
                        i2 i2Var = e2Var.f1271a;
                        i2 i2Var2 = i2.VISIBLE;
                        if (i2Var == i2Var2 && a10 != i2Var2) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                e2 e2Var2 = (e2) obj;
                if (e2Var2 != null) {
                    j0Var = e2Var2.f1273c;
                }
                if (j0Var != null) {
                    z10 = j0Var.isPostponed();
                } else {
                    z10 = false;
                }
                this.f1400f = z10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m(List list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            e2 e2Var = (e2) list.get(i2);
            p1 p1Var = e2Var.f1282l;
            if (!e2Var.f1278h) {
                e2Var.f1278h = true;
                f2 f2Var = e2Var.f1272b;
                if (f2Var == f2.ADDING) {
                    j0 j0Var = p1Var.f1392c;
                    j0Var.getClass();
                    View findFocus = j0Var.mView.findFocus();
                    if (findFocus != null) {
                        j0Var.setFocusedView(findFocus);
                        if (g1.K(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + j0Var);
                        }
                    }
                    View requireView = e2Var.f1273c.requireView();
                    requireView.getClass();
                    if (requireView.getParent() == null) {
                        if (g1.K(2)) {
                            Log.v("FragmentManager", "Adding fragment " + j0Var + " view " + requireView + " to container in onStart");
                        }
                        p1Var.b();
                        requireView.setAlpha(0.0f);
                    }
                    if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                        if (g1.K(2)) {
                            Log.v("FragmentManager", "Making view " + requireView + " INVISIBLE in onStart");
                        }
                        requireView.setVisibility(4);
                    }
                    requireView.setAlpha(j0Var.getPostOnViewCreatedAlpha());
                    if (g1.K(2)) {
                        Log.v("FragmentManager", "Setting view alpha to " + j0Var.getPostOnViewCreatedAlpha() + " in onStart");
                    }
                } else if (f2Var == f2.REMOVING) {
                    j0 j0Var2 = p1Var.f1392c;
                    j0Var2.getClass();
                    View requireView2 = j0Var2.requireView();
                    requireView2.getClass();
                    if (g1.K(2)) {
                        Log.v("FragmentManager", "Clearing focus " + requireView2.findFocus() + " on view " + requireView2 + " for Fragment " + j0Var2);
                    }
                    requireView2.clearFocus();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zb.l.L(((e2) it.next()).f1281k, arrayList);
        }
        List p0 = zb.l.p0(zb.l.s0(arrayList));
        int size2 = p0.size();
        for (int i10 = 0; i10 < size2; i10++) {
            d2 d2Var = (d2) p0.get(i10);
            d2Var.getClass();
            ViewGroup viewGroup = this.f1395a;
            viewGroup.getClass();
            if (!d2Var.f1261a) {
                d2Var.e(viewGroup);
            }
            d2Var.f1261a = true;
        }
    }

    public final void n() {
        ArrayList arrayList = this.f1396b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            e2 e2Var = (e2) obj;
            if (e2Var.f1272b == f2.ADDING) {
                View requireView = e2Var.f1273c.requireView();
                requireView.getClass();
                g2 g2Var = i2.Companion;
                int visibility = requireView.getVisibility();
                g2Var.getClass();
                e2Var.d(g2.b(visibility), f2.NONE);
            }
        }
    }
}
