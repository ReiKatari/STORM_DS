package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class y {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public v d;

    public final void a(o oVar) {
        if (!this.a.contains(oVar)) {
            synchronized (this.a) {
                this.a.add(oVar);
            }
            oVar.mAdded = true;
            return;
        }
        f81.z(oVar, "Fragment already added: ");
    }

    public final o b(String str) {
        x xVar = (x) this.b.get(str);
        if (xVar != null) {
            return xVar.c;
        }
        return null;
    }

    public final o c(String str) {
        o findFragmentByWho;
        for (x xVar : this.b.values()) {
            if (xVar != null && (findFragmentByWho = xVar.c.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (x xVar : this.b.values()) {
            if (xVar != null) {
                arrayList.add(xVar);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (x xVar : this.b.values()) {
            if (xVar != null) {
                arrayList.add(xVar.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    public final void g(x xVar) {
        o oVar = xVar.c;
        String str = oVar.mWho;
        HashMap hashMap = this.b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(oVar.mWho, xVar);
        if (oVar.mRetainInstanceChangedWhileDetached) {
            boolean z = oVar.mRetainInstance;
            v vVar = this.d;
            if (z) {
                vVar.e(oVar);
            } else {
                vVar.i(oVar);
            }
            oVar.mRetainInstanceChangedWhileDetached = false;
        }
        if (u.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + oVar);
        }
    }

    public final void h(x xVar) {
        o oVar = xVar.c;
        if (oVar.mRetainInstance) {
            this.d.i(oVar);
        }
        String str = oVar.mWho;
        HashMap hashMap = this.b;
        if (hashMap.get(str) == xVar && ((x) hashMap.put(oVar.mWho, null)) != null && u.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + oVar);
        }
    }

    public final Bundle i(Bundle bundle, String str) {
        HashMap hashMap = this.c;
        if (bundle != null) {
            return (Bundle) hashMap.put(str, bundle);
        }
        return (Bundle) hashMap.remove(str);
    }
}
