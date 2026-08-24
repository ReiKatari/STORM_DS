package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pi1  reason: default package */
/* loaded from: classes.dex */
public abstract class pi1 {
    public final Context a;

    public pi1(Context context) {
        this.a = context;
    }

    public final mk3 a(Display display, lk3 lk3Var) {
        vr4 vr4Var;
        int i;
        Context createWindowContext;
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        display.getClass();
        lk3Var.getClass();
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
            vr4Var = new vr4(Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height()));
        } else {
            Point point = new Point();
            display.getRealSize(point);
            vr4Var = new vr4(Integer.valueOf(point.x), Integer.valueOf(point.y));
        }
        return new mk3(display.getDisplayId(), lk3Var, ((Number) vr4Var.A).intValue(), ((Number) vr4Var.B).intValue());
    }

    public abstract ok3 b(Display display, Display display2);
}
