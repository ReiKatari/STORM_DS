package zf;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import oe.a0;
import u1.l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h implements k {

    /* renamed from: a  reason: collision with root package name */
    public final Context f15074a;

    /* renamed from: b  reason: collision with root package name */
    public final a0.g f15075b;

    public h(a0.g gVar, Context context) {
        this.f15074a = context;
        this.f15075b = gVar;
    }

    @Override // zf.k
    public final int a() {
        return 31;
    }

    @Override // zf.k
    public final int b() {
        return 32;
    }

    @Override // zf.k
    public final void c() {
        Point point;
        DisplayCutout cutout;
        int i2;
        int i10;
        int safeInsetTop;
        int safeInsetBottom;
        int safeInsetLeft;
        int safeInsetRight;
        yb.j jVar;
        int safeInsetLeft2;
        int safeInsetRight2;
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        WindowMetrics currentWindowMetrics2;
        WindowInsets windowInsets;
        Context context = this.f15074a;
        Object systemService = context.getSystemService(WindowManager.class);
        systemService.getClass();
        WindowManager windowManager = (WindowManager) systemService;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
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
            cutout = i11 >= 29 ? defaultDisplay.getCutout() : null;
        }
        if (context.getResources().getConfiguration().orientation == 1) {
            i2 = point.x;
            i10 = point.y;
            if (i11 >= 29 && cutout != null) {
                safeInsetLeft2 = cutout.getSafeInsetLeft();
                safeInsetRight2 = cutout.getSafeInsetRight();
                i2 -= safeInsetRight2 + safeInsetLeft2;
                safeInsetLeft = cutout.getSafeInsetTop();
                safeInsetRight = cutout.getSafeInsetBottom();
                i10 -= safeInsetRight + safeInsetLeft;
            }
        } else {
            i2 = point.y;
            i10 = point.x;
            if (i11 >= 29 && cutout != null) {
                safeInsetTop = cutout.getSafeInsetTop();
                safeInsetBottom = cutout.getSafeInsetBottom();
                i2 -= safeInsetBottom + safeInsetTop;
                safeInsetLeft = cutout.getSafeInsetLeft();
                safeInsetRight = cutout.getSafeInsetRight();
                i10 -= safeInsetRight + safeInsetLeft;
            }
        }
        Point point2 = new Point(i2, i10);
        int i12 = point2.x;
        int i13 = point2.y;
        if (i12 > i13) {
            jVar = new yb.j(new a0(i13, i12), new a0(i12, i13));
        } else {
            jVar = new yb.j(new a0(i12, i13), new a0(i13, i12));
        }
        this.f15075b.x("layouts.json", dg.b.class, new l1(13, (a0) jVar.A, (a0) jVar.B));
    }
}
