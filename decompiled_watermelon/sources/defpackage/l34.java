package defpackage;

import android.os.Bundle;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l34  reason: default package */
/* loaded from: classes.dex */
public final class l34 implements fn3, ab7, lq2, au5 {
    public final fh A;
    public b44 B;
    public final Bundle L;
    public qm3 R;
    public final t34 X;
    public final String Y;
    public final Bundle Z;
    public final qg1 c0 = new qg1(this);

    public l34(fh fhVar, b44 b44Var, Bundle bundle, qm3 qm3Var, t34 t34Var, String str, Bundle bundle2) {
        this.A = fhVar;
        this.B = b44Var;
        this.L = bundle;
        this.R = qm3Var;
        this.X = t34Var;
        this.Y = str;
        this.Z = bundle2;
        new il6(new bz2(6, this));
    }

    public final void a(qm3 qm3Var) {
        qm3Var.getClass();
        qg1 qg1Var = this.c0;
        qg1Var.getClass();
        qg1Var.l = qm3Var;
        qg1Var.f();
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        Object obj2;
        if (obj != null && (obj instanceof l34)) {
            l34 l34Var = (l34) obj;
            Bundle bundle = l34Var.L;
            if (b53.x(this.Y, l34Var.Y) && b53.x(this.B, l34Var.B) && b53.x((in3) this.c0.k, (in3) l34Var.c0.k) && b53.x(getSavedStateRegistry(), l34Var.getSavedStateRegistry())) {
                Bundle bundle2 = this.L;
                if (!b53.x(bundle2, bundle)) {
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
                                if (!b53.x(obj3, obj2)) {
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
    @Override // defpackage.lq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.z31 getDefaultViewModelCreationExtras() {
        /*
            r5 = this;
            qg1 r0 = r5.c0
            r0.getClass()
            g14 r1 = new g14
            r2 = 0
            r1.<init>(r2)
            java.lang.Object r2 = r0.c
            l34 r2 = (defpackage.l34) r2
            java.util.LinkedHashMap r3 = r1.a
            vn1 r4 = defpackage.st5.a
            r3.put(r4, r2)
            jo1 r4 = defpackage.st5.b
            r3.put(r4, r2)
            android.os.Bundle r0 = r0.c()
            if (r0 == 0) goto L26
            so1 r2 = defpackage.st5.c
            r3.put(r2, r0)
        L26:
            r0 = 0
            fh r5 = r5.A
            if (r5 == 0) goto L3c
            android.content.Context r5 = r5.A
            if (r5 == 0) goto L34
            android.content.Context r5 = r5.getApplicationContext()
            goto L35
        L34:
            r5 = r0
        L35:
            boolean r2 = r5 instanceof android.app.Application
            if (r2 == 0) goto L3c
            android.app.Application r5 = (android.app.Application) r5
            goto L3d
        L3c:
            r5 = r0
        L3d:
            if (r5 == 0) goto L40
            r0 = r5
        L40:
            if (r0 == 0) goto L47
            so1 r5 = defpackage.wa7.d
            r3.put(r5, r0)
        L47:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l34.getDefaultViewModelCreationExtras():z31");
    }

    @Override // defpackage.lq2
    public final xa7 getDefaultViewModelProviderFactory() {
        return (bu5) this.c0.m;
    }

    @Override // defpackage.fn3
    public final rm3 getLifecycle() {
        return (in3) this.c0.k;
    }

    @Override // defpackage.au5
    public final xt5 getSavedStateRegistry() {
        return ((yt5) this.c0.j).b;
    }

    @Override // defpackage.ab7
    public final za7 getViewModelStore() {
        qg1 qg1Var = this.c0;
        if (qg1Var.b) {
            if (((in3) qg1Var.k).d != qm3.DESTROYED) {
                t34 t34Var = (t34) qg1Var.g;
                if (t34Var != null) {
                    String str = (String) qg1Var.h;
                    str.getClass();
                    LinkedHashMap linkedHashMap = t34Var.b;
                    za7 za7Var = (za7) linkedHashMap.get(str);
                    if (za7Var == null) {
                        za7 za7Var2 = new za7();
                        linkedHashMap.put(str, za7Var2);
                        return za7Var2;
                    }
                    return za7Var;
                }
                i.n("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
                return null;
            }
            i.n("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        i.n("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        return null;
    }

    public final int hashCode() {
        Set<String> keySet;
        int i;
        int hashCode = this.B.hashCode() + (this.Y.hashCode() * 31);
        Bundle bundle = this.L;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            for (String str : keySet) {
                int i2 = hashCode * 31;
                Object obj = bundle.get(str);
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                hashCode = i2 + i;
            }
        }
        return getSavedStateRegistry().hashCode() + ((((in3) this.c0.k).hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return this.c0.toString();
    }
}
