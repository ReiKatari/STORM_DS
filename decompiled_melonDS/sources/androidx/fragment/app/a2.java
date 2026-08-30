package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a2 implements androidx.lifecycle.k, q7.f, androidx.lifecycle.e1 {
    public final j0 A;
    public final androidx.lifecycle.d1 B;
    public final x L;
    public androidx.lifecycle.a1 R;
    public androidx.lifecycle.z X = null;
    public q7.e Y = null;

    public a2(j0 j0Var, androidx.lifecycle.d1 d1Var, x xVar) {
        this.A = j0Var;
        this.B = d1Var;
        this.L = xVar;
    }

    public final void b(androidx.lifecycle.p pVar) {
        this.X.f(pVar);
    }

    public final void c() {
        if (this.X == null) {
            this.X = new androidx.lifecycle.z(this, true);
            q7.e eVar = new q7.e(new s7.a(this, new kf.s0(7, this)));
            this.Y = eVar;
            eVar.a();
            this.L.run();
        }
    }

    @Override // androidx.lifecycle.k
    public final w6.c getDefaultViewModelCreationExtras() {
        Application application;
        j0 j0Var = this.A;
        Context applicationContext = j0Var.requireContext().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        w6.d dVar = new w6.d(0);
        LinkedHashMap linkedHashMap = dVar.f14161a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.z0.f1512d, application);
        }
        linkedHashMap.put(androidx.lifecycle.s0.f1482a, j0Var);
        linkedHashMap.put(androidx.lifecycle.s0.f1483b, this);
        if (j0Var.getArguments() != null) {
            linkedHashMap.put(androidx.lifecycle.s0.f1484c, j0Var.getArguments());
        }
        return dVar;
    }

    @Override // androidx.lifecycle.k
    public final androidx.lifecycle.a1 getDefaultViewModelProviderFactory() {
        Application application;
        j0 j0Var = this.A;
        androidx.lifecycle.a1 defaultViewModelProviderFactory = j0Var.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(j0Var.mDefaultFactory)) {
            this.R = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.R == null) {
            Context applicationContext = j0Var.requireContext().getApplicationContext();
            while (true) {
                if (applicationContext instanceof ContextWrapper) {
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    }
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                } else {
                    application = null;
                    break;
                }
            }
            this.R = new androidx.lifecycle.v0(application, j0Var, j0Var.getArguments());
        }
        return this.R;
    }

    @Override // androidx.lifecycle.x
    public final androidx.lifecycle.r getLifecycle() {
        c();
        return this.X;
    }

    @Override // q7.f
    public final q7.d getSavedStateRegistry() {
        c();
        return this.Y.f12313b;
    }

    @Override // androidx.lifecycle.e1
    public final androidx.lifecycle.d1 getViewModelStore() {
        c();
        return this.B;
    }
}
