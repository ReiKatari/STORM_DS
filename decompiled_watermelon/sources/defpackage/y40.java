package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y40  reason: default package */
/* loaded from: classes.dex */
public final class y40 implements x40, pg7 {
    public static final y40 A = new Object();
    public static final y40 B = new Object();

    @Override // defpackage.pg7
    public lg7 e(Activity activity, pd1 pd1Var) {
        pd1Var.getClass();
        x40.a.getClass();
        return new lg7(new t40(w40.a().h(activity)), pd1Var.f(activity));
    }

    @Override // defpackage.x40
    public Rect h(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }

    @Override // defpackage.pg7
    public lg7 l(Context context, pd1 pd1Var) {
        pd1Var.getClass();
        float f = context.getResources().getDisplayMetrics().density;
        Rect bounds = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new lg7(bounds, f);
    }
}
