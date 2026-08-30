package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class h {
    public final ViewGroup a;
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;
    public boolean e;
    public boolean f;

    public h(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.a = viewGroup;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public static void f(eu euVar, View view) {
        WeakHashMap weakHashMap = aa7.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            euVar.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    f(euVar, childAt);
                }
            }
        }
    }

    public static final h j(ViewGroup viewGroup, u uVar) {
        viewGroup.getClass();
        uVar.getClass();
        uVar.I().getClass();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof h) {
            return (h) tag;
        }
        h hVar = new h(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, hVar);
        return hVar;
    }

    public static boolean k(ArrayList arrayList) {
        boolean z;
        int size = arrayList.size();
        int i = 0;
        loop0: while (true) {
            z = true;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                b0 b0Var = (b0) obj;
                if (!b0Var.k.isEmpty()) {
                    ArrayList arrayList2 = b0Var.k;
                    if (arrayList2 == null || !arrayList2.isEmpty()) {
                        int size2 = arrayList2.size();
                        int i2 = 0;
                        while (i2 < size2) {
                            Object obj2 = arrayList2.get(i2);
                            i2++;
                            if (!((gc6) obj2).a()) {
                                break;
                            }
                        }
                    }
                }
                z = false;
            }
            break loop0;
        }
        if (z) {
            ArrayList arrayList3 = new ArrayList();
            int size3 = arrayList.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayList.get(i3);
                i3++;
                tq0.D0(arrayList3, ((b0) obj3).k);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void a(b0 b0Var) {
        b0Var.getClass();
        if (b0Var.i) {
            kc6 kc6Var = b0Var.a;
            View requireView = b0Var.c.requireView();
            requireView.getClass();
            kc6Var.applyState(requireView, this.a);
            b0Var.i = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x042f A[LOOP:19: B:134:0x042d->B:135:0x042f, LOOP_END] */
    /* JADX WARN: Type inference failed for: r11v2, types: [eu, m66] */
    /* JADX WARN: Type inference failed for: r12v1, types: [eu, m66] */
    /* JADX WARN: Type inference failed for: r13v1, types: [eu, m66] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.util.ArrayList r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 1324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.h.b(java.util.ArrayList, boolean):void");
    }

    public final void c(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tq0.D0(arrayList, ((b0) it.next()).k);
        }
        List n1 = tq0.n1(tq0.s1(arrayList));
        int size = n1.size();
        for (int i = 0; i < size; i++) {
            ((gc6) n1.get(i)).c(this.a);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            a((b0) list.get(i2));
        }
        List n12 = tq0.n1(list);
        int size3 = n12.size();
        for (int i3 = 0; i3 < size3; i3++) {
            b0 b0Var = (b0) n12.get(i3);
            if (b0Var.k.isEmpty()) {
                b0Var.b();
            }
        }
    }

    public final void d(kc6 kc6Var, hc6 hc6Var, x xVar) {
        synchronized (this.b) {
            try {
                o oVar = xVar.c;
                oVar.getClass();
                b0 g = g(oVar);
                if (g == null) {
                    o oVar2 = xVar.c;
                    if (!oVar2.mTransitioning && !oVar2.mRemoving) {
                        g = null;
                    }
                    g = h(oVar2);
                }
                if (g != null) {
                    g.d(kc6Var, hc6Var);
                    return;
                }
                final b0 b0Var = new b0(kc6Var, hc6Var, xVar);
                this.b.add(b0Var);
                b0Var.d.add(new Runnable() { // from class: androidx.fragment.app.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        h hVar = h.this;
                        ArrayList arrayList = hVar.b;
                        b0 b0Var2 = b0Var;
                        if (arrayList.contains(b0Var2)) {
                            kc6 kc6Var2 = b0Var2.a;
                            View view = b0Var2.c.mView;
                            view.getClass();
                            kc6Var2.applyState(view, hVar.a);
                        }
                    }
                });
                b0Var.d.add(new hb1(this, b0Var, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        boolean z;
        if (this.f) {
            return;
        }
        if (!this.a.isAttachedToWindow()) {
            i();
            this.e = false;
            return;
        }
        synchronized (this.b) {
            try {
                ArrayList p1 = tq0.p1(this.c);
                this.c.clear();
                int size = p1.size();
                int i = 0;
                while (true) {
                    z = true;
                    if (i >= size) {
                        break;
                    }
                    Object obj = p1.get(i);
                    i++;
                    b0 b0Var = (b0) obj;
                    if (this.b.isEmpty() || !b0Var.c.mTransitioning) {
                        z = false;
                    }
                    b0Var.g = z;
                }
                int size2 = p1.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = p1.get(i2);
                    i2++;
                    b0 b0Var2 = (b0) obj2;
                    if (this.d) {
                        if (u.K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + b0Var2);
                        }
                        b0Var2.b();
                    } else {
                        if (u.K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + b0Var2);
                        }
                        b0Var2.a(this.a);
                    }
                    this.d = false;
                    if (!b0Var2.f) {
                        this.c.add(b0Var2);
                    }
                }
                if (!this.b.isEmpty()) {
                    n();
                    ArrayList p12 = tq0.p1(this.b);
                    if (p12.isEmpty()) {
                        return;
                    }
                    this.b.clear();
                    this.c.addAll(p12);
                    if (u.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(p12, this.e);
                    boolean k = k(p12);
                    int size3 = p12.size();
                    int i3 = 0;
                    boolean z2 = true;
                    while (i3 < size3) {
                        Object obj3 = p12.get(i3);
                        i3++;
                        if (!((b0) obj3).c.mTransitioning) {
                            z2 = false;
                        }
                    }
                    if (!z2 || k) {
                        z = false;
                    }
                    this.d = z;
                    if (u.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + k + " \ntransition = " + z2);
                    }
                    if (!z2) {
                        m(p12);
                        c(p12);
                    } else if (k) {
                        m(p12);
                        int size4 = p12.size();
                        for (int i4 = 0; i4 < size4; i4++) {
                            a((b0) p12.get(i4));
                        }
                    }
                    this.e = false;
                    if (u.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final b0 g(o oVar) {
        Object obj;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                obj = arrayList.get(i);
                i++;
                b0 b0Var = (b0) obj;
                if (b53.x(b0Var.c, oVar) && !b0Var.e) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (b0) obj;
    }

    public final b0 h(o oVar) {
        Object obj;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                obj = arrayList.get(i);
                i++;
                b0 b0Var = (b0) obj;
                if (b53.x(b0Var.c, oVar) && !b0Var.e) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (b0) obj;
    }

    public final void i() {
        String str;
        String str2;
        if (u.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.b) {
            try {
                n();
                m(this.b);
                ArrayList p1 = tq0.p1(this.c);
                int size = p1.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = p1.get(i2);
                    i2++;
                    ((b0) obj).g = false;
                }
                int size2 = p1.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = p1.get(i3);
                    i3++;
                    b0 b0Var = (b0) obj2;
                    if (u.K(2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + b0Var);
                    }
                    b0Var.a(this.a);
                }
                ArrayList p12 = tq0.p1(this.b);
                int size3 = p12.size();
                int i4 = 0;
                while (i4 < size3) {
                    Object obj3 = p12.get(i4);
                    i4++;
                    ((b0) obj3).g = false;
                }
                int size4 = p12.size();
                while (i < size4) {
                    Object obj4 = p12.get(i);
                    i++;
                    b0 b0Var2 = (b0) obj4;
                    if (u.K(2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + b0Var2);
                    }
                    b0Var2.a(this.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l() {
        o oVar;
        Object obj;
        boolean z;
        synchronized (this.b) {
            try {
                n();
                ArrayList arrayList = this.b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    oVar = null;
                    if (listIterator.hasPrevious()) {
                        obj = listIterator.previous();
                        b0 b0Var = (b0) obj;
                        ic6 ic6Var = kc6.Companion;
                        View view = b0Var.c.mView;
                        view.getClass();
                        ic6Var.getClass();
                        kc6 a = ic6.a(view);
                        kc6 kc6Var = b0Var.a;
                        kc6 kc6Var2 = kc6.VISIBLE;
                        if (kc6Var == kc6Var2 && a != kc6Var2) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                b0 b0Var2 = (b0) obj;
                if (b0Var2 != null) {
                    oVar = b0Var2.c;
                }
                if (oVar != null) {
                    z = oVar.isPostponed();
                } else {
                    z = false;
                }
                this.f = z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            b0 b0Var = (b0) list.get(i);
            x xVar = b0Var.l;
            if (!b0Var.h) {
                b0Var.h = true;
                hc6 hc6Var = b0Var.b;
                if (hc6Var == hc6.ADDING) {
                    o oVar = xVar.c;
                    oVar.getClass();
                    View findFocus = oVar.mView.findFocus();
                    if (findFocus != null) {
                        oVar.setFocusedView(findFocus);
                        if (u.K(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + oVar);
                        }
                    }
                    View requireView = b0Var.c.requireView();
                    requireView.getClass();
                    if (requireView.getParent() == null) {
                        if (u.K(2)) {
                            Log.v("FragmentManager", "Adding fragment " + oVar + " view " + requireView + " to container in onStart");
                        }
                        xVar.b();
                        requireView.setAlpha(RecyclerView.A1);
                    }
                    if (requireView.getAlpha() == RecyclerView.A1 && requireView.getVisibility() == 0) {
                        if (u.K(2)) {
                            Log.v("FragmentManager", "Making view " + requireView + " INVISIBLE in onStart");
                        }
                        requireView.setVisibility(4);
                    }
                    requireView.setAlpha(oVar.getPostOnViewCreatedAlpha());
                    if (u.K(2)) {
                        Log.v("FragmentManager", "Setting view alpha to " + oVar.getPostOnViewCreatedAlpha() + " in onStart");
                    }
                } else if (hc6Var == hc6.REMOVING) {
                    o oVar2 = xVar.c;
                    oVar2.getClass();
                    View requireView2 = oVar2.requireView();
                    requireView2.getClass();
                    if (u.K(2)) {
                        Log.v("FragmentManager", "Clearing focus " + requireView2.findFocus() + " on view " + requireView2 + " for Fragment " + oVar2);
                    }
                    requireView2.clearFocus();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tq0.D0(arrayList, ((b0) it.next()).k);
        }
        List n1 = tq0.n1(tq0.s1(arrayList));
        int size2 = n1.size();
        for (int i2 = 0; i2 < size2; i2++) {
            gc6 gc6Var = (gc6) n1.get(i2);
            gc6Var.getClass();
            ViewGroup viewGroup = this.a;
            viewGroup.getClass();
            if (!gc6Var.a) {
                gc6Var.e(viewGroup);
            }
            gc6Var.a = true;
        }
    }

    public final void n() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            b0 b0Var = (b0) obj;
            if (b0Var.b == hc6.ADDING) {
                View requireView = b0Var.c.requireView();
                requireView.getClass();
                ic6 ic6Var = kc6.Companion;
                int visibility = requireView.getVisibility();
                ic6Var.getClass();
                b0Var.d(ic6.b(visibility), hc6.NONE);
            }
        }
    }
}
