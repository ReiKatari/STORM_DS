package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zs  reason: default package */
/* loaded from: classes.dex */
public final class zs implements android.app.Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ defpackage.at A;

    public zs(defpackage.at r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            r1.getClass()
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity r1) {
            r0 = this;
            r1.getClass()
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity r1) {
            r0 = this;
            r1.getClass()
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity r1) {
            r0 = this;
            r1.getClass()
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity r1) {
            r0 = this;
            r1.getClass()
            at r0 = r0.A
            int r1 = r0.b
            int r1 = r1 + 1
            r0.b = r1
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity r1) {
            r0 = this;
            r1.getClass()
            at r0 = r0.A
            int r1 = r0.b
            int r1 = r1 + (-1)
            r0.b = r1
            if (r1 != 0) goto L14
            of6 r0 = r0.a
            jg7 r1 = defpackage.jg7.a
            r0.k(r1)
        L14:
            return
    }
}
