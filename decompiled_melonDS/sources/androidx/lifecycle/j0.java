package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j0 extends i {
    final /* synthetic */ k0 this$0;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public static final class a extends i {
        final /* synthetic */ k0 this$0;

        public a(k0 k0Var) {
            this.this$0 = k0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            k0 k0Var = this.this$0;
            int i2 = k0Var.A + 1;
            k0Var.A = i2;
            if (i2 == 1 && k0Var.R) {
                k0Var.Y.f(p.ON_START);
                k0Var.R = false;
            }
        }
    }

    public j0(k0 k0Var) {
        this.this$0 = k0Var;
    }

    @Override // androidx.lifecycle.i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i2 = o0.B;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            findFragmentByTag.getClass();
            ((o0) findFragmentByTag).A = this.this$0.f1476b0;
        }
    }

    @Override // androidx.lifecycle.i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        k0 k0Var = this.this$0;
        int i2 = k0Var.B - 1;
        k0Var.B = i2;
        if (i2 == 0) {
            Handler handler = k0Var.X;
            handler.getClass();
            handler.postDelayed(k0Var.Z, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        i0.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        k0 k0Var = this.this$0;
        int i2 = k0Var.A - 1;
        k0Var.A = i2;
        if (i2 == 0 && k0Var.L) {
            k0Var.Y.f(p.ON_STOP);
            k0Var.R = true;
        }
    }
}
