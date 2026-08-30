package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qd1  reason: default package */
/* loaded from: classes.dex */
public final class qd1 implements pd1, pg7 {
    public static final qd1 A = new Object();
    public static final qd1 B = new Object();

    @Override // defpackage.pg7
    public lg7 e(Activity activity, pd1 pd1Var) {
        pd1Var.getClass();
        x40.a.getClass();
        return new lg7(new t40(w40.a().h(activity)), pd1Var.f(activity));
    }

    @Override // defpackage.pd1
    public float f(Context context) {
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }

    @Override // defpackage.pg7
    public lg7 l(Context context, pd1 pd1Var) {
        WindowManager windowManager;
        pd1Var.getClass();
        if (context.isUiContext()) {
            windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        } else {
            windowManager = (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
        }
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new lg7(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }
}
