package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nq  reason: default package */
/* loaded from: classes.dex */
public abstract class nq {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback b(Object obj, tq tqVar) {
        Objects.requireNonNull(tqVar);
        jp jpVar = new jp(1, tqVar);
        m2.p(obj).registerOnBackInvokedCallback(1000000, jpVar);
        return jpVar;
    }

    public static void c(Object obj, Object obj2) {
        m2.p(obj).unregisterOnBackInvokedCallback(m2.l(obj2));
    }
}
