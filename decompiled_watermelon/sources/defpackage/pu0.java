package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pu0  reason: default package */
/* loaded from: classes.dex */
public final class pu0 implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ qu0 A;

    public pu0(qu0 qu0Var) {
        this.A = qu0Var;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.A.d(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        qu0 qu0Var = this.A;
        qu0Var.f.a.clear();
        ub5 ub5Var = qu0Var.g;
        synchronized (ub5Var) {
            ub5Var.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        qu0 qu0Var = this.A;
        qu0Var.f.a.clear();
        ub5 ub5Var = qu0Var.g;
        synchronized (ub5Var) {
            ub5Var.a.c();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.A.s.c.setValue(Boolean.valueOf(z));
    }
}
