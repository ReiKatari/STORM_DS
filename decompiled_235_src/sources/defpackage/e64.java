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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e64  reason: default package */
/* loaded from: classes.dex */
public final class e64 implements y54 {
    public final Context a;
    public final yc1 b;

    public e64(yc1 yc1Var, Context context) {
        this.a = context;
        this.b = yc1Var;
    }

    @Override // defpackage.y54
    public final int a() {
        return 31;
    }

    @Override // defpackage.y54
    public final void b() {
        Point point;
        DisplayCutout cutout;
        int i;
        int i2;
        int safeInsetTop;
        int safeInsetBottom;
        int safeInsetLeft;
        int safeInsetRight;
        vr4 vr4Var;
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
            vr4Var = new vr4(new my4(i5, i4), new my4(i4, i5));
        } else {
            vr4Var = new vr4(new my4(i4, i5), new my4(i5, i4));
        }
        this.b.H("layouts.json", hk3.class, new bi2(22, (my4) vr4Var.A, (my4) vr4Var.B));
    }

    @Override // defpackage.y54
    public final int c() {
        return 32;
    }
}
