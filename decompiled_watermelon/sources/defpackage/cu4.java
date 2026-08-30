package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cu4  reason: default package */
/* loaded from: classes.dex */
public final class cu4 extends jp1 {
    final /* synthetic */ du4 this$0;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: cu4$a */
    /* loaded from: classes.dex */
    public static final class a extends jp1 {
        final /* synthetic */ du4 this$0;

        public a(du4 du4Var) {
            this.this$0 = du4Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            du4 du4Var = this.this$0;
            int i = du4Var.A + 1;
            du4Var.A = i;
            if (i == 1 && du4Var.R) {
                du4Var.Y.f(pm3.ON_START);
                du4Var.R = false;
            }
        }
    }

    public cu4(du4 du4Var) {
        this.this$0 = du4Var;
    }

    @Override // defpackage.jp1, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = qa5.B;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            findFragmentByTag.getClass();
            ((qa5) findFragmentByTag).A = this.this$0.c0;
        }
    }

    @Override // defpackage.jp1, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        du4 du4Var = this.this$0;
        int i = du4Var.B - 1;
        du4Var.B = i;
        if (i == 0) {
            Handler handler = du4Var.X;
            handler.getClass();
            handler.postDelayed(du4Var.Z, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        fp.p(activity, new a(this.this$0));
    }

    @Override // defpackage.jp1, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        du4 du4Var = this.this$0;
        int i = du4Var.A - 1;
        du4Var.A = i;
        if (i == 0 && du4Var.L) {
            du4Var.Y.f(pm3.ON_STOP);
            du4Var.R = true;
        }
    }
}
