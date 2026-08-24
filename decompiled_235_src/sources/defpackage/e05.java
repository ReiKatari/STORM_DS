package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e05  reason: default package */
/* loaded from: classes.dex */
public final class e05 extends d05 {
    @Override // defpackage.q61
    public final void m(View view, Rect rect) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        currentWindowMetrics = ((WindowManager) systemService).getCurrentWindowMetrics();
        bounds = currentWindowMetrics.getBounds();
        rect.set(bounds);
    }
}
