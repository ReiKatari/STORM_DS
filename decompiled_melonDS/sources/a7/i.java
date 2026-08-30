package a7;

import android.os.Bundle;
import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.e1;
import androidx.lifecycle.v0;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i implements androidx.lifecycle.x, e1, androidx.lifecycle.k, q7.f {
    public final d7.c A;
    public x B;
    public final Bundle L;
    public androidx.lifecycle.q R;
    public final o X;
    public final String Y;
    public final Bundle Z;

    /* renamed from: b0  reason: collision with root package name */
    public final com.squareup.picasso.m f576b0 = new com.squareup.picasso.m(this);

    public i(d7.c cVar, x xVar, Bundle bundle, androidx.lifecycle.q qVar, o oVar, String str, Bundle bundle2) {
        this.A = cVar;
        this.B = xVar;
        this.L = bundle;
        this.R = qVar;
        this.X = oVar;
        this.Y = str;
        this.Z = bundle2;
        new yb.n(new a2.n(1, this));
    }

    public final void b(androidx.lifecycle.q qVar) {
        qVar.getClass();
        com.squareup.picasso.m mVar = this.f576b0;
        mVar.getClass();
        mVar.f3263l = qVar;
        mVar.f();
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        Object obj2;
        if (obj != null && (obj instanceof i)) {
            i iVar = (i) obj;
            Bundle bundle = iVar.L;
            if (nc.k.a(this.Y, iVar.Y) && nc.k.a(this.B, iVar.B) && nc.k.a((androidx.lifecycle.z) this.f576b0.f3262k, (androidx.lifecycle.z) iVar.f576b0.f3262k) && nc.k.a(getSavedStateRegistry(), iVar.getSavedStateRegistry())) {
                Bundle bundle2 = this.L;
                if (!nc.k.a(bundle2, bundle)) {
                    if (bundle2 != null && (keySet = bundle2.keySet()) != null) {
                        Set<String> set = keySet;
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            for (String str : set) {
                                Object obj3 = bundle2.get(str);
                                if (bundle != null) {
                                    obj2 = bundle.get(str);
                                } else {
                                    obj2 = null;
                                }
                                if (!nc.k.a(obj3, obj2)) {
                                }
                            }
                            return true;
                        }
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    @Override // androidx.lifecycle.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final w6.c getDefaultViewModelCreationExtras() {
        /*
            r5 = this;
            com.squareup.picasso.m r0 = r5.f576b0
            r0.getClass()
            w6.d r1 = new w6.d
            r2 = 0
            r1.<init>(r2)
            x8.e r2 = androidx.lifecycle.s0.f1482a
            java.lang.Object r3 = r0.f3254c
            a7.i r3 = (a7.i) r3
            java.util.LinkedHashMap r4 = r1.f14161a
            r4.put(r2, r3)
            na.f r2 = androidx.lifecycle.s0.f1483b
            r4.put(r2, r3)
            android.os.Bundle r0 = r0.c()
            if (r0 == 0) goto L26
            x8.e r2 = androidx.lifecycle.s0.f1484c
            r4.put(r2, r0)
        L26:
            r0 = 0
            d7.c r2 = r5.A
            if (r2 == 0) goto L3c
            android.content.Context r2 = r2.f3920a
            if (r2 == 0) goto L34
            android.content.Context r2 = r2.getApplicationContext()
            goto L35
        L34:
            r2 = r0
        L35:
            boolean r3 = r2 instanceof android.app.Application
            if (r3 == 0) goto L3c
            android.app.Application r2 = (android.app.Application) r2
            goto L3d
        L3c:
            r2 = r0
        L3d:
            if (r2 == 0) goto L40
            r0 = r2
        L40:
            if (r0 == 0) goto L47
            na.f r2 = androidx.lifecycle.z0.f1512d
            r4.put(r2, r0)
        L47:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.i.getDefaultViewModelCreationExtras():w6.c");
    }

    @Override // androidx.lifecycle.k
    public final a1 getDefaultViewModelProviderFactory() {
        return (v0) this.f576b0.m;
    }

    @Override // androidx.lifecycle.x
    public final androidx.lifecycle.r getLifecycle() {
        return (androidx.lifecycle.z) this.f576b0.f3262k;
    }

    @Override // q7.f
    public final q7.d getSavedStateRegistry() {
        return ((q7.e) this.f576b0.f3261j).f12313b;
    }

    @Override // androidx.lifecycle.e1
    public final d1 getViewModelStore() {
        com.squareup.picasso.m mVar = this.f576b0;
        if (mVar.f3253b) {
            if (((androidx.lifecycle.z) mVar.f3262k).f1504d != androidx.lifecycle.q.DESTROYED) {
                o oVar = (o) mVar.f3258g;
                if (oVar != null) {
                    String str = (String) mVar.f3259h;
                    str.getClass();
                    LinkedHashMap linkedHashMap = oVar.f609b;
                    d1 d1Var = (d1) linkedHashMap.get(str);
                    if (d1Var == null) {
                        d1 d1Var2 = new d1();
                        linkedHashMap.put(str, d1Var2);
                        return d1Var2;
                    }
                    return d1Var;
                }
                a0.j.p("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
                return null;
            }
            a0.j.p("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        a0.j.p("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        return null;
    }

    public final int hashCode() {
        Set<String> keySet;
        int i2;
        int hashCode = this.B.hashCode() + (this.Y.hashCode() * 31);
        Bundle bundle = this.L;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            for (String str : keySet) {
                int i10 = hashCode * 31;
                Object obj = bundle.get(str);
                if (obj != null) {
                    i2 = obj.hashCode();
                } else {
                    i2 = 0;
                }
                hashCode = i10 + i2;
            }
        }
        return getSavedStateRegistry().hashCode() + ((((androidx.lifecycle.z) this.f576b0.f3262k).hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return this.f576b0.toString();
    }
}
