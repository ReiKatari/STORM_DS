package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class v extends ra7 {
    public static final og2 h = new og2(0);
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public v(boolean z) {
        this.e = z;
    }

    @Override // defpackage.ra7
    public final void d() {
        if (u.K(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f = true;
    }

    public final void e(o oVar) {
        if (this.g) {
            if (u.K(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        String str = oVar.mWho;
        HashMap hashMap = this.b;
        if (!hashMap.containsKey(str)) {
            hashMap.put(oVar.mWho, oVar);
            if (u.K(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + oVar);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass()) {
            v vVar = (v) obj;
            if (this.b.equals(vVar.b) && this.c.equals(vVar.c) && this.d.equals(vVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final void f(o oVar, boolean z) {
        if (u.K(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + oVar);
        }
        h(oVar.mWho, z);
    }

    public final void g(String str, boolean z) {
        if (u.K(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        h(str, z);
    }

    public final void h(String str, boolean z) {
        HashMap hashMap = this.c;
        v vVar = (v) hashMap.get(str);
        if (vVar != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(vVar.c.keySet());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    vVar.g((String) obj, true);
                }
            }
            vVar.d();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.d;
        za7 za7Var = (za7) hashMap2.get(str);
        if (za7Var != null) {
            za7Var.a();
            hashMap2.remove(str);
        }
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode();
        return this.d.hashCode() + ((hashCode + (this.b.hashCode() * 31)) * 31);
    }

    public final void i(o oVar) {
        if (this.g) {
            if (u.K(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.b.remove(oVar.mWho) != null && u.K(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + oVar);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
