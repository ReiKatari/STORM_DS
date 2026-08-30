package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import defpackage.qa5;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oa5  reason: default package */
/* loaded from: classes.dex */
public abstract class oa5 {
    public static void a(Activity activity, pm3 pm3Var) {
        pm3Var.getClass();
        if (activity instanceof fn3) {
            rm3 lifecycle = ((fn3) activity).getLifecycle();
            if (lifecycle instanceof in3) {
                ((in3) lifecycle).f(pm3Var);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            qa5.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new qa5.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new qa5(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
