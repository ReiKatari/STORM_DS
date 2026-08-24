package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jc1  reason: default package */
/* loaded from: classes.dex */
public final class jc1 implements android.app.Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ me.magnum.melonds.debug.DebugCommandInitializer A;
    public final /* synthetic */ android.content.Context B;

    public jc1(me.magnum.melonds.debug.DebugCommandInitializer r1, android.content.Context r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            r1.getClass()
            me.magnum.melonds.debug.DebugCommandInitializer r2 = r0.A
            android.content.Context r0 = r0.B
            me.magnum.melonds.debug.DebugCommandInitializer.c(r2, r0, r1)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity r1) {
            r0 = this;
            r1.getClass()
            boolean r0 = r1 instanceof me.magnum.melonds.ui.emulator.EmulatorActivity
            if (r0 == 0) goto L1b
            lc1 r0 = defpackage.lc1.a
            me.magnum.melonds.ui.emulator.EmulatorActivity r1 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r1
            java.lang.ref.WeakReference r0 = defpackage.lc1.b
            java.lang.Object r0 = r0.get()
            if (r0 != r1) goto L1b
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = 0
            r0.<init>(r1)
            defpackage.lc1.b = r0
        L1b:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity r1) {
            r0 = this;
            r1.getClass()
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity r2) {
            r1 = this;
            r2.getClass()
            me.magnum.melonds.debug.DebugCommandInitializer r0 = r1.A
            android.content.Context r1 = r1.B
            me.magnum.melonds.debug.DebugCommandInitializer.c(r0, r1, r2)
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
    public final void onActivityStarted(android.app.Activity r2) {
            r1 = this;
            r2.getClass()
            me.magnum.melonds.debug.DebugCommandInitializer r0 = r1.A
            android.content.Context r1 = r1.B
            me.magnum.melonds.debug.DebugCommandInitializer.c(r0, r1, r2)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity r1) {
            r0 = this;
            r1.getClass()
            return
    }
}
