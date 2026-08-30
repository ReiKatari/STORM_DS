package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f1401a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f1402b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f1403c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public k1 f1404d;

    public final void a(j0 j0Var) {
        if (!this.f1401a.contains(j0Var)) {
            synchronized (this.f1401a) {
                this.f1401a.add(j0Var);
            }
            j0Var.mAdded = true;
            return;
        }
        m9.o.h(j0Var, "Fragment already added: ");
    }

    public final j0 b(String str) {
        p1 p1Var = (p1) this.f1402b.get(str);
        if (p1Var != null) {
            return p1Var.f1392c;
        }
        return null;
    }

    public final j0 c(String str) {
        j0 findFragmentByWho;
        for (p1 p1Var : this.f1402b.values()) {
            if (p1Var != null && (findFragmentByWho = p1Var.f1392c.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (p1 p1Var : this.f1402b.values()) {
            if (p1Var != null) {
                arrayList.add(p1Var);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (p1 p1Var : this.f1402b.values()) {
            if (p1Var != null) {
                arrayList.add(p1Var.f1392c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.f1401a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f1401a) {
            arrayList = new ArrayList(this.f1401a);
        }
        return arrayList;
    }

    public final void g(p1 p1Var) {
        j0 j0Var = p1Var.f1392c;
        String str = j0Var.mWho;
        HashMap hashMap = this.f1402b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(j0Var.mWho, p1Var);
        if (j0Var.mRetainInstanceChangedWhileDetached) {
            boolean z10 = j0Var.mRetainInstance;
            k1 k1Var = this.f1404d;
            if (z10) {
                k1Var.e(j0Var);
            } else {
                k1Var.i(j0Var);
            }
            j0Var.mRetainInstanceChangedWhileDetached = false;
        }
        if (g1.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + j0Var);
        }
    }

    public final void h(p1 p1Var) {
        j0 j0Var = p1Var.f1392c;
        if (j0Var.mRetainInstance) {
            this.f1404d.i(j0Var);
        }
        String str = j0Var.mWho;
        HashMap hashMap = this.f1402b;
        if (hashMap.get(str) == p1Var && ((p1) hashMap.put(j0Var.mWho, null)) != null && g1.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + j0Var);
        }
    }

    public final Bundle i(Bundle bundle, String str) {
        HashMap hashMap = this.f1403c;
        if (bundle != null) {
            return (Bundle) hashMap.put(str, bundle);
        }
        return (Bundle) hashMap.remove(str);
    }
}
