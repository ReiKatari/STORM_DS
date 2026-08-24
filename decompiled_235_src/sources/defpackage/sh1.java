package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sh1  reason: default package */
/* loaded from: classes.dex */
public final class sh1 implements rh1, pv7 {
    public static final sh1 A = new Object();
    public static final sh1 B = new Object();

    @Override // defpackage.pv7
    public lv7 c(Activity activity, rh1 rh1Var) {
        rh1Var.getClass();
        a70.a.getClass();
        return new lv7(new w60(z60.a().f(activity)), rh1Var.l(activity));
    }

    @Override // defpackage.pv7
    public lv7 e(Context context, rh1 rh1Var) {
        WindowManager windowManager;
        rh1Var.getClass();
        if (context.isUiContext()) {
            windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        } else {
            windowManager = (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
        }
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new lv7(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }

    @Override // defpackage.rh1
    public float l(Context context) {
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }
}
