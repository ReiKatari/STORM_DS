package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class z implements lq2, au5, ab7 {
    public final o A;
    public final za7 B;
    public final j L;
    public xa7 R;
    public in3 X = null;
    public yt5 Y = null;

    public z(o oVar, za7 za7Var, j jVar) {
        this.A = oVar;
        this.B = za7Var;
        this.L = jVar;
    }

    public final void a(pm3 pm3Var) {
        this.X.f(pm3Var);
    }

    public final void c() {
        if (this.X == null) {
            this.X = new in3(this, true);
            yt5 yt5Var = new yt5(new zt5(this, new bz2(25, this)));
            this.Y = yt5Var;
            yt5Var.a();
            this.L.run();
        }
    }

    @Override // defpackage.lq2
    public final z31 getDefaultViewModelCreationExtras() {
        Application application;
        o oVar = this.A;
        Context applicationContext = oVar.requireContext().getApplicationContext();
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
        g14 g14Var = new g14(0);
        LinkedHashMap linkedHashMap = g14Var.a;
        if (application != null) {
            linkedHashMap.put(wa7.d, application);
        }
        linkedHashMap.put(st5.a, oVar);
        linkedHashMap.put(st5.b, this);
        if (oVar.getArguments() != null) {
            linkedHashMap.put(st5.c, oVar.getArguments());
        }
        return g14Var;
    }

    @Override // defpackage.lq2
    public final xa7 getDefaultViewModelProviderFactory() {
        Application application;
        o oVar = this.A;
        xa7 defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(oVar.mDefaultFactory)) {
            this.R = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.R == null) {
            Context applicationContext = oVar.requireContext().getApplicationContext();
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
            this.R = new bu5(application, oVar, oVar.getArguments());
        }
        return this.R;
    }

    @Override // defpackage.fn3
    public final rm3 getLifecycle() {
        c();
        return this.X;
    }

    @Override // defpackage.au5
    public final xt5 getSavedStateRegistry() {
        c();
        return this.Y.b;
    }

    @Override // defpackage.ab7
    public final za7 getViewModelStore() {
        c();
        return this.B;
    }
}
