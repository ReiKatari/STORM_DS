package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k1 extends androidx.lifecycle.y0 {

    /* renamed from: h  reason: collision with root package name */
    public static final j1 f1346h = new j1(0);

    /* renamed from: e  reason: collision with root package name */
    public final boolean f1350e;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f1347b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f1348c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f1349d = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public boolean f1351f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1352g = false;

    public k1(boolean z10) {
        this.f1350e = z10;
    }

    @Override // androidx.lifecycle.y0
    public final void d() {
        if (g1.K(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1351f = true;
    }

    public final void e(j0 j0Var) {
        if (this.f1352g) {
            if (g1.K(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        String str = j0Var.mWho;
        HashMap hashMap = this.f1347b;
        if (!hashMap.containsKey(str)) {
            hashMap.put(j0Var.mWho, j0Var);
            if (g1.K(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + j0Var);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k1.class == obj.getClass()) {
            k1 k1Var = (k1) obj;
            if (this.f1347b.equals(k1Var.f1347b) && this.f1348c.equals(k1Var.f1348c) && this.f1349d.equals(k1Var.f1349d)) {
                return true;
            }
        }
        return false;
    }

    public final void f(j0 j0Var, boolean z10) {
        if (g1.K(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + j0Var);
        }
        h(j0Var.mWho, z10);
    }

    public final void g(String str, boolean z10) {
        if (g1.K(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        h(str, z10);
    }

    public final void h(String str, boolean z10) {
        HashMap hashMap = this.f1348c;
        k1 k1Var = (k1) hashMap.get(str);
        if (k1Var != null) {
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(k1Var.f1348c.keySet());
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    k1Var.g((String) obj, true);
                }
            }
            k1Var.d();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f1349d;
        androidx.lifecycle.d1 d1Var = (androidx.lifecycle.d1) hashMap2.get(str);
        if (d1Var != null) {
            d1Var.a();
            hashMap2.remove(str);
        }
    }

    public final int hashCode() {
        int hashCode = this.f1348c.hashCode();
        return this.f1349d.hashCode() + ((hashCode + (this.f1347b.hashCode() * 31)) * 31);
    }

    public final void i(j0 j0Var) {
        if (this.f1352g) {
            if (g1.K(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.f1347b.remove(j0Var.mWho) != null && g1.K(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + j0Var);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.f1347b.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.f1348c.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f1349d.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append((String) it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
