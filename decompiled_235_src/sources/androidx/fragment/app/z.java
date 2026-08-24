package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class z implements mw2, g56, bp7 {
    public final o A;
    public final ap7 B;
    public final j L;
    public yo7 R;
    public ku3 X = null;
    public e56 Y = null;

    public z(o oVar, ap7 ap7Var, j jVar) {
        this.A = oVar;
        this.B = ap7Var;
        this.L = jVar;
    }

    public final void a(st3 st3Var) {
        this.X.f(st3Var);
    }

    public final void c() {
        if (this.X == null) {
            this.X = new ku3(this, true);
            e56 e56Var = new e56(new f56(this, new t46(this, 2)));
            this.Y = e56Var;
            e56Var.a();
            this.L.run();
        }
    }

    @Override // defpackage.mw2
    public final j71 getDefaultViewModelCreationExtras() {
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
        m94 m94Var = new m94(0);
        LinkedHashMap linkedHashMap = m94Var.a;
        if (application != null) {
            linkedHashMap.put(wo7.d, application);
        }
        linkedHashMap.put(y46.a, oVar);
        linkedHashMap.put(y46.b, this);
        if (oVar.getArguments() != null) {
            linkedHashMap.put(y46.c, oVar.getArguments());
        }
        return m94Var;
    }

    @Override // defpackage.mw2
    public final yo7 getDefaultViewModelProviderFactory() {
        Application application;
        o oVar = this.A;
        yo7 defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory();
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
            this.R = new h56(application, oVar, oVar.getArguments());
        }
        return this.R;
    }

    @Override // defpackage.hu3
    public final ut3 getLifecycle() {
        c();
        return this.X;
    }

    @Override // defpackage.g56
    public final d56 getSavedStateRegistry() {
        c();
        return this.Y.b;
    }

    @Override // defpackage.bp7
    public final ap7 getViewModelStore() {
        c();
        return this.B;
    }
}
