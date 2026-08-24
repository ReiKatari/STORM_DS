package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lx0  reason: default package */
/* loaded from: classes.dex */
public final class lx0 implements android.content.ComponentCallbacks2, android.view.ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ defpackage.mx0 A;

    public lx0(defpackage.mx0 r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            mx0 r0 = r0.A
            r0.d(r1)
            return
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
            r1 = this;
            mx0 r1 = r1.A
            h33 r0 = r1.f
            java.util.HashMap r0 = r0.a
            r0.clear()
            ml5 r1 = r1.g
            monitor-enter(r1)
            p94 r0 = r1.a     // Catch: java.lang.Throwable -> L13
            r0.c()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)
            return
        L13:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int r1) {
            r0 = this;
            mx0 r0 = r0.A
            h33 r1 = r0.f
            java.util.HashMap r1 = r1.a
            r1.clear()
            ml5 r0 = r0.g
            monitor-enter(r0)
            p94 r1 = r0.a     // Catch: java.lang.Throwable -> L13
            r1.c()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return
        L13:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean r1) {
            r0 = this;
            mx0 r0 = r0.A
            zr3 r0 = r0.s
            vs4 r0 = r0.c
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.setValue(r1)
            return
    }
}
