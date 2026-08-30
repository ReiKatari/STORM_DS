package m5;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public Object f9234a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f9235b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9236c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f9237d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9238e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f9239f = false;

    public a(Activity activity) {
        this.f9235b = activity;
        this.f9236c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f9235b == activity) {
            this.f9235b = null;
            this.f9238e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.f9238e && !this.f9239f && !this.f9237d) {
            Object obj = this.f9234a;
            try {
                Object obj2 = b.f9242c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f9236c) {
                    b.f9246g.postAtFrontOfQueue(new m0.h(6, b.f9241b.get(activity), obj2));
                    this.f9239f = true;
                    this.f9234a = null;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f9235b == activity) {
            this.f9237d = true;
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
