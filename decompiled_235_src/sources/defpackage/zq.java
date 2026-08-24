package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zq  reason: default package */
/* loaded from: classes.dex */
public abstract class zq {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback b(Object obj, fr frVar) {
        Objects.requireNonNull(frVar);
        vp vpVar = new vp(frVar, 1);
        o2.p(obj).registerOnBackInvokedCallback(1000000, vpVar);
        return vpVar;
    }

    public static void c(Object obj, Object obj2) {
        o2.p(obj).unregisterOnBackInvokedCallback(o2.l(obj2));
    }
}
