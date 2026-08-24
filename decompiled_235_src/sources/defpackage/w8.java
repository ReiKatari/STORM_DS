package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w8  reason: default package */
/* loaded from: classes.dex */
public final class w8 implements Application.ActivityLifecycleCallbacks {
    public Object A;
    public Activity B;
    public final int L;
    public boolean R = false;
    public boolean X = false;
    public boolean Y = false;

    public w8(Activity activity) {
        this.B = activity;
        this.L = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.B == activity) {
            this.B = null;
            this.X = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.X && !this.Y && !this.R) {
            Object obj = this.A;
            try {
                Object obj2 = x8.c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.L) {
                    x8.g.postAtFrontOfQueue(new uo2(4, x8.b.get(activity), obj2));
                    this.Y = true;
                    this.A = null;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.B == activity) {
            this.R = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
