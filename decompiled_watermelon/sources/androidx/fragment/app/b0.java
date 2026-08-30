package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class b0 {
    public kc6 a;
    public hc6 b;
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

    public b0(kc6 kc6Var, hc6 hc6Var, x xVar) {
        kc6Var.getClass();
        hc6Var.getClass();
        o oVar = xVar.c;
        oVar.getClass();
        kc6Var.getClass();
        hc6Var.getClass();
        oVar.getClass();
        this.a = kc6Var;
        this.b = hc6Var;
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
            for (gc6 gc6Var : tq0.n1(this.k)) {
                gc6Var.getClass();
                if (!gc6Var.b) {
                    gc6Var.b(viewGroup);
                }
                gc6Var.b = true;
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

    public final void c(gc6 gc6Var) {
        gc6Var.getClass();
        ArrayList arrayList = this.j;
        if (arrayList.remove(gc6Var) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(kc6 kc6Var, hc6 hc6Var) {
        kc6Var.getClass();
        hc6Var.getClass();
        int i = lc6.a[hc6Var.ordinal()];
        o oVar = this.c;
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && this.a != kc6.REMOVED) {
                    if (u.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + oVar + " mFinalState = " + this.a + " -> " + kc6Var + '.');
                    }
                    this.a = kc6Var;
                    return;
                }
                return;
            }
            if (u.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + oVar + " mFinalState = " + this.a + " -> REMOVED. mLifecycleImpact  = " + this.b + " to REMOVING.");
            }
            this.a = kc6.REMOVED;
            this.b = hc6.REMOVING;
            this.i = true;
        } else if (this.a == kc6.REMOVED) {
            if (u.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + oVar + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.b + " to ADDING.");
            }
            this.a = kc6.VISIBLE;
            this.b = hc6.ADDING;
            this.i = true;
        }
    }

    public final String toString() {
        StringBuilder u = b31.u("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        u.append(this.a);
        u.append(" lifecycleImpact = ");
        u.append(this.b);
        u.append(" fragment = ");
        u.append(this.c);
        u.append('}');
        return u.toString();
    }
}
