package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e2 {

    /* renamed from: a  reason: collision with root package name */
    public i2 f1271a;

    /* renamed from: b  reason: collision with root package name */
    public f2 f1272b;

    /* renamed from: c  reason: collision with root package name */
    public final j0 f1273c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f1274d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1275e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1276f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1277g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1278h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1279i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f1280j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f1281k;

    /* renamed from: l  reason: collision with root package name */
    public final p1 f1282l;

    public e2(i2 i2Var, f2 f2Var, p1 p1Var) {
        i2Var.getClass();
        f2Var.getClass();
        j0 j0Var = p1Var.f1392c;
        j0Var.getClass();
        i2Var.getClass();
        f2Var.getClass();
        j0Var.getClass();
        this.f1271a = i2Var;
        this.f1272b = f2Var;
        this.f1273c = j0Var;
        this.f1274d = new ArrayList();
        this.f1279i = true;
        ArrayList arrayList = new ArrayList();
        this.f1280j = arrayList;
        this.f1281k = arrayList;
        this.f1282l = p1Var;
    }

    public final void a(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.f1278h = false;
        if (!this.f1275e) {
            this.f1275e = true;
            if (this.f1280j.isEmpty()) {
                b();
                return;
            }
            for (d2 d2Var : zb.l.p0(this.f1281k)) {
                d2Var.getClass();
                if (!d2Var.f1262b) {
                    d2Var.b(viewGroup);
                }
                d2Var.f1262b = true;
            }
        }
    }

    public final void b() {
        this.f1278h = false;
        if (!this.f1276f) {
            if (g1.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f1276f = true;
            ArrayList arrayList = this.f1274d;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((Runnable) obj).run();
            }
        }
        this.f1273c.mTransitioning = false;
        this.f1282l.k();
    }

    public final void c(d2 d2Var) {
        d2Var.getClass();
        ArrayList arrayList = this.f1280j;
        if (arrayList.remove(d2Var) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(i2 i2Var, f2 f2Var) {
        i2Var.getClass();
        f2Var.getClass();
        int i2 = j2.f1342a[f2Var.ordinal()];
        j0 j0Var = this.f1273c;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3 && this.f1271a != i2.REMOVED) {
                    if (g1.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + j0Var + " mFinalState = " + this.f1271a + " -> " + i2Var + '.');
                    }
                    this.f1271a = i2Var;
                    return;
                }
                return;
            }
            if (g1.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + j0Var + " mFinalState = " + this.f1271a + " -> REMOVED. mLifecycleImpact  = " + this.f1272b + " to REMOVING.");
            }
            this.f1271a = i2.REMOVED;
            this.f1272b = f2.REMOVING;
            this.f1279i = true;
        } else if (this.f1271a == i2.REMOVED) {
            if (g1.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + j0Var + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f1272b + " to ADDING.");
            }
            this.f1271a = i2.VISIBLE;
            this.f1272b = f2.ADDING;
            this.f1279i = true;
        }
    }

    public final String toString() {
        StringBuilder u4 = w.d.u("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        u4.append(this.f1271a);
        u4.append(" lifecycleImpact = ");
        u4.append(this.f1272b);
        u4.append(" fragment = ");
        u4.append(this.f1273c);
        u4.append('}');
        return u4.toString();
    }
}
