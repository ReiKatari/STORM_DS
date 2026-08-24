package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sb4  reason: default package */
/* loaded from: classes.dex */
public final class sb4 implements hu3, bp7, mw2, g56 {
    public final rh A;
    public ic4 B;
    public final Bundle L;
    public tt3 R;
    public final ac4 X;
    public final String Y;
    public final Bundle Z;
    public final uk1 d0 = new uk1(this);

    public sb4(rh rhVar, ic4 ic4Var, Bundle bundle, tt3 tt3Var, ac4 ac4Var, String str, Bundle bundle2) {
        this.A = rhVar;
        this.B = ic4Var;
        this.L = bundle;
        this.R = tt3Var;
        this.X = ac4Var;
        this.Y = str;
        this.Z = bundle2;
        new ex6(new er2(this, 9));
    }

    public final void a(tt3 tt3Var) {
        tt3Var.getClass();
        uk1 uk1Var = this.d0;
        uk1Var.getClass();
        uk1Var.l = tt3Var;
        uk1Var.f();
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        Object obj2;
        if (obj != null && (obj instanceof sb4)) {
            sb4 sb4Var = (sb4) obj;
            Bundle bundle = sb4Var.L;
            if (nb3.k(this.Y, sb4Var.Y) && nb3.k(this.B, sb4Var.B) && nb3.k((ku3) this.d0.k, (ku3) sb4Var.d0.k) && nb3.k(getSavedStateRegistry(), sb4Var.getSavedStateRegistry())) {
                Bundle bundle2 = this.L;
                if (!nb3.k(bundle2, bundle)) {
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
                                if (!nb3.k(obj3, obj2)) {
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
    @Override // defpackage.mw2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j71 getDefaultViewModelCreationExtras() {
        Application application;
        Context context;
        uk1 uk1Var = this.d0;
        uk1Var.getClass();
        m94 m94Var = new m94(0);
        sb4 sb4Var = (sb4) uk1Var.c;
        LinkedHashMap linkedHashMap = m94Var.a;
        linkedHashMap.put(y46.a, sb4Var);
        linkedHashMap.put(y46.b, sb4Var);
        Bundle c = uk1Var.c();
        if (c != null) {
            linkedHashMap.put(y46.c, c);
        }
        Application application2 = null;
        rh rhVar = this.A;
        if (rhVar != null) {
            Context context2 = rhVar.a;
            if (context2 != null) {
                context = context2.getApplicationContext();
            } else {
                context = null;
            }
            if (context instanceof Application) {
                application = (Application) context;
                if (application != null) {
                    application2 = application;
                }
                if (application2 != null) {
                    linkedHashMap.put(wo7.d, application2);
                }
                return m94Var;
            }
        }
        application = null;
        if (application != null) {
        }
        if (application2 != null) {
        }
        return m94Var;
    }

    @Override // defpackage.mw2
    public final yo7 getDefaultViewModelProviderFactory() {
        return (h56) this.d0.m;
    }

    @Override // defpackage.hu3
    public final ut3 getLifecycle() {
        return (ku3) this.d0.k;
    }

    @Override // defpackage.g56
    public final d56 getSavedStateRegistry() {
        return ((e56) this.d0.j).b;
    }

    @Override // defpackage.bp7
    public final ap7 getViewModelStore() {
        uk1 uk1Var = this.d0;
        if (uk1Var.b) {
            if (((ku3) uk1Var.k).d != tt3.DESTROYED) {
                ac4 ac4Var = (ac4) uk1Var.g;
                if (ac4Var != null) {
                    String str = (String) uk1Var.h;
                    str.getClass();
                    LinkedHashMap linkedHashMap = ac4Var.b;
                    ap7 ap7Var = (ap7) linkedHashMap.get(str);
                    if (ap7Var == null) {
                        ap7 ap7Var2 = new ap7();
                        linkedHashMap.put(str, ap7Var2);
                        return ap7Var2;
                    }
                    return ap7Var;
                }
                i.m("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
                return null;
            }
            i.m("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        i.m("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
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
        return getSavedStateRegistry().hashCode() + ((((ku3) this.d0.k).hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return this.d0.toString();
    }
}
