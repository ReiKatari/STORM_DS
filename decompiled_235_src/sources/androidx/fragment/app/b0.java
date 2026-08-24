package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class b0 {
    public ao6 a;
    public xn6 b;
    public final o c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final ArrayList j;
    public final ArrayList k;
    public final x l;

    public b0(ao6 ao6Var, xn6 xn6Var, x xVar) {
        ao6Var.getClass();
        xn6Var.getClass();
        o oVar = xVar.c;
        oVar.getClass();
        ao6Var.getClass();
        xn6Var.getClass();
        oVar.getClass();
        this.a = ao6Var;
        this.b = xn6Var;
        this.c = oVar;
        this.d = new ArrayList();
        this.i = true;
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        this.k = arrayList;
        this.l = xVar;
    }

    public final void a(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.h = false;
        if (!this.e) {
            this.e = true;
            if (this.j.isEmpty()) {
                b();
                return;
            }
            for (wn6 wn6Var : gt0.k1(this.k)) {
                wn6Var.getClass();
                if (!wn6Var.b) {
                    wn6Var.b(viewGroup);
                }
                wn6Var.b = true;
            }
        }
    }

    public final void b() {
        this.h = false;
        if (!this.f) {
            if (u.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f = true;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }
        this.c.mTransitioning = false;
        this.l.k();
    }

    public final void c(wn6 wn6Var) {
        wn6Var.getClass();
        ArrayList arrayList = this.j;
        if (arrayList.remove(wn6Var) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(ao6 ao6Var, xn6 xn6Var) {
        ao6Var.getClass();
        xn6Var.getClass();
        int i = bo6.a[xn6Var.ordinal()];
        o oVar = this.c;
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && this.a != ao6.REMOVED) {
                    if (u.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + oVar + " mFinalState = " + this.a + " -> " + ao6Var + '.');
                    }
                    this.a = ao6Var;
                    return;
                }
                return;
            }
            if (u.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + oVar + " mFinalState = " + this.a + " -> REMOVED. mLifecycleImpact  = " + this.b + " to REMOVING.");
            }
            this.a = ao6.REMOVED;
            this.b = xn6.REMOVING;
            this.i = true;
        } else if (this.a == ao6.REMOVED) {
            if (u.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + oVar + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.b + " to ADDING.");
            }
            this.a = ao6.VISIBLE;
            this.b = xn6.ADDING;
            this.i = true;
        }
    }

    public final String toString() {
        StringBuilder t = i61.t("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        t.append(this.a);
        t.append(" lifecycleImpact = ");
        t.append(this.b);
        t.append(" fragment = ");
        t.append(this.c);
        t.append('}');
        return t.toString();
    }
}
