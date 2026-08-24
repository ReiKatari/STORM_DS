package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g35  reason: default package */
/* loaded from: classes.dex */
public final class g35 extends st1 {
    final /* synthetic */ h35 this$0;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: g35$a */
    /* loaded from: classes.dex */
    public static final class a extends st1 {
        final /* synthetic */ h35 this$0;

        public a(h35 h35Var) {
            this.this$0 = h35Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            h35 h35Var = this.this$0;
            int i = h35Var.A + 1;
            h35Var.A = i;
            if (i == 1 && h35Var.R) {
                h35Var.Y.f(st3.ON_START);
                h35Var.R = false;
            }
        }
    }

    public g35(h35 h35Var) {
        this.this$0 = h35Var;
    }

    @Override // defpackage.st1, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = ik5.B;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            findFragmentByTag.getClass();
            ((ik5) findFragmentByTag).A = this.this$0.d0;
        }
    }

    @Override // defpackage.st1, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        h35 h35Var = this.this$0;
        int i = h35Var.B - 1;
        h35Var.B = i;
        if (i == 0) {
            Handler handler = h35Var.X;
            handler.getClass();
            handler.postDelayed(h35Var.Z, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        rp.p(activity, new a(this.this$0));
    }

    @Override // defpackage.st1, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        h35 h35Var = this.this$0;
        int i = h35Var.A - 1;
        h35Var.A = i;
        if (i == 0 && h35Var.L) {
            h35Var.Y.f(st3.ON_STOP);
            h35Var.R = true;
        }
    }
}
