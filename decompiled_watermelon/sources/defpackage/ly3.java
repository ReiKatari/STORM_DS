package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ly3  reason: default package */
/* loaded from: classes.dex */
public final class ly3 implements fy3 {
    public final Context a;
    public final k91 b;

    public ly3(k91 k91Var, Context context) {
        this.a = context;
        this.b = k91Var;
    }

    @Override // defpackage.fy3
    public final int a() {
        return 31;
    }

    @Override // defpackage.fy3
    public final int b() {
        return 32;
    }

    @Override // defpackage.fy3
    public final void c() {
        Point point;
        DisplayCutout cutout;
        int i;
        int i2;
        int safeInsetTop;
        int safeInsetBottom;
        int safeInsetLeft;
        int safeInsetRight;
        ti4 ti4Var;
        int safeInsetLeft2;
        int safeInsetRight2;
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        WindowMetrics currentWindowMetrics2;
        WindowInsets windowInsets;
        Context context = this.a;
        Object systemService = context.getSystemService(WindowManager.class);
        systemService.getClass();
        WindowManager windowManager = (WindowManager) systemService;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            bounds = currentWindowMetrics.getBounds();
            bounds.getClass();
            currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
            windowInsets = currentWindowMetrics2.getWindowInsets();
            cutout = windowInsets.getDisplayCutout();
            point = new Point(bounds.width(), bounds.height());
        } else {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            point = new Point();
            defaultDisplay.getRealSize(point);
            cutout = i3 >= 29 ? defaultDisplay.getCutout() : null;
        }
        if (context.getResources().getConfiguration().orientation == 1) {
            i = point.x;
            i2 = point.y;
            if (i3 >= 29 && cutout != null) {
                safeInsetLeft2 = cutout.getSafeInsetLeft();
                safeInsetRight2 = cutout.getSafeInsetRight();
                i -= safeInsetRight2 + safeInsetLeft2;
                safeInsetLeft = cutout.getSafeInsetTop();
                safeInsetRight = cutout.getSafeInsetBottom();
                i2 -= safeInsetRight + safeInsetLeft;
            }
        } else {
            i = point.y;
            i2 = point.x;
            if (i3 >= 29 && cutout != null) {
                safeInsetTop = cutout.getSafeInsetTop();
                safeInsetBottom = cutout.getSafeInsetBottom();
                i -= safeInsetBottom + safeInsetTop;
                safeInsetLeft = cutout.getSafeInsetLeft();
                safeInsetRight = cutout.getSafeInsetRight();
                i2 -= safeInsetRight + safeInsetLeft;
            }
        }
        Point point2 = new Point(i, i2);
        int i4 = point2.x;
        int i5 = point2.y;
        if (i4 > i5) {
            ti4Var = new ti4(new ip4(i5, i4), new ip4(i4, i5));
        } else {
            ti4Var = new ti4(new ip4(i4, i5), new ip4(i5, i4));
        }
        this.b.I("layouts.json", pd3.class, new gi2(17, (ip4) ti4Var.A, (ip4) ti4Var.B));
    }
}
