package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: le1  reason: default package */
/* loaded from: classes.dex */
public abstract class le1 {
    public final Context a;

    public le1(Context context) {
        this.a = context;
    }

    public final ud3 a(Display display, td3 td3Var) {
        ti4 ti4Var;
        int i;
        Context createWindowContext;
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        display.getClass();
        td3Var.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            if ((display.getFlags() & 4) != 0) {
                i = 2030;
            } else {
                i = 2037;
            }
            createWindowContext = this.a.createDisplayContext(display).createWindowContext(i, null);
            createWindowContext.getClass();
            Object systemService = createWindowContext.getSystemService(WindowManager.class);
            systemService.getClass();
            currentWindowMetrics = ((WindowManager) systemService).getCurrentWindowMetrics();
            bounds = currentWindowMetrics.getBounds();
            bounds.getClass();
            ti4Var = new ti4(Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height()));
        } else {
            Point point = new Point();
            display.getRealSize(point);
            ti4Var = new ti4(Integer.valueOf(point.x), Integer.valueOf(point.y));
        }
        return new ud3(display.getDisplayId(), td3Var, ((Number) ti4Var.A).intValue(), ((Number) ti4Var.B).intValue());
    }

    public abstract wd3 b(Display display, Display display2);
}
