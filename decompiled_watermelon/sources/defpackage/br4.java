package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: br4  reason: default package */
/* loaded from: classes.dex */
public final class br4 extends ar4 {
    @Override // defpackage.jo1
    public final void t(View view, Rect rect) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        currentWindowMetrics = ((WindowManager) systemService).getCurrentWindowMetrics();
        bounds = currentWindowMetrics.getBounds();
        rect.set(bounds);
    }
}
