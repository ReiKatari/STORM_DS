package l;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class s {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback b(Object obj, x xVar) {
        Objects.requireNonNull(xVar);
        a5.y yVar = new a5.y(2, xVar);
        b6.c.s(obj).registerOnBackInvokedCallback(1000000, yVar);
        return yVar;
    }

    public static void c(Object obj, Object obj2) {
        b6.c.s(obj).unregisterOnBackInvokedCallback(b6.c.o(obj2));
    }
}
