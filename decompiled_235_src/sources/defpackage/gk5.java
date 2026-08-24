package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import defpackage.ik5;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gk5  reason: default package */
/* loaded from: classes.dex */
public abstract class gk5 {
    public static void a(Activity activity, st3 st3Var) {
        st3Var.getClass();
        if (activity instanceof hu3) {
            ut3 lifecycle = ((hu3) activity).getLifecycle();
            if (lifecycle instanceof ku3) {
                ((ku3) lifecycle).f(st3Var);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            ik5.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new ik5.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new ik5(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
