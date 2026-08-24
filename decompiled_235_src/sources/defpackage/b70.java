package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b70  reason: default package */
/* loaded from: classes.dex */
public final class b70 implements a70, pv7 {
    public static final b70 A = new Object();
    public static final b70 B = new Object();

    @Override // defpackage.pv7
    public lv7 c(Activity activity, rh1 rh1Var) {
        rh1Var.getClass();
        a70.a.getClass();
        return new lv7(new w60(z60.a().f(activity)), rh1Var.l(activity));
    }

    @Override // defpackage.pv7
    public lv7 e(Context context, rh1 rh1Var) {
        rh1Var.getClass();
        float f = context.getResources().getDisplayMetrics().density;
        Rect bounds = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new lv7(bounds, f);
    }

    @Override // defpackage.a70
    public Rect f(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }
}
