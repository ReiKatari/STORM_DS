package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lx0  reason: default package */
/* loaded from: classes.dex */
public final class lx0 implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ mx0 A;

    public lx0(mx0 mx0Var) {
        this.A = mx0Var;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.A.d(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        mx0 mx0Var = this.A;
        mx0Var.f.a.clear();
        ml5 ml5Var = mx0Var.g;
        synchronized (ml5Var) {
            ml5Var.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        mx0 mx0Var = this.A;
        mx0Var.f.a.clear();
        ml5 ml5Var = mx0Var.g;
        synchronized (ml5Var) {
            ml5Var.a.c();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.A.s.c.setValue(Boolean.valueOf(z));
    }
}
