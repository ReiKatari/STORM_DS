package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import me.magnum.melonds.debug.DebugCommandInitializer;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s81  reason: default package */
/* loaded from: classes.dex */
public final class s81 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ DebugCommandInitializer a;
    public final /* synthetic */ Context b;

    public s81(DebugCommandInitializer debugCommandInitializer, Context context) {
        this.a = debugCommandInitializer;
        this.b = context;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        DebugCommandInitializer.c(this.a, this.b, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        if (activity instanceof EmulatorActivity) {
            u81 u81Var = u81.a;
            if (u81.b.get() == ((EmulatorActivity) activity)) {
                u81.b = new WeakReference(null);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        DebugCommandInitializer.c(this.a, this.b, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
        DebugCommandInitializer.c(this.a, this.b, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
    }
}
