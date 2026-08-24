package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import me.magnum.melonds.debug.DebugCommandInitializer;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jc1  reason: default package */
/* loaded from: classes.dex */
public final class jc1 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ DebugCommandInitializer A;
    public final /* synthetic */ Context B;

    public jc1(DebugCommandInitializer debugCommandInitializer, Context context) {
        this.A = debugCommandInitializer;
        this.B = context;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        DebugCommandInitializer.c(this.A, this.B, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        if (activity instanceof EmulatorActivity) {
            lc1 lc1Var = lc1.a;
            if (lc1.b.get() == ((EmulatorActivity) activity)) {
                lc1.b = new WeakReference(null);
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
        DebugCommandInitializer.c(this.A, this.B, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
        DebugCommandInitializer.c(this.A, this.B, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
    }
}
