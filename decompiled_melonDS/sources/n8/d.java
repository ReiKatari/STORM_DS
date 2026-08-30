package n8;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;
import j8.j;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d implements b, g {

    /* renamed from: b  reason: collision with root package name */
    public static final d f10106b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final d f10107c = new Object();

    @Override // n8.g
    public j a(Activity activity, e eVar) {
        eVar.getClass();
        b.f10099a.getClass();
        return new j(new h8.b(a.a().c(activity)), eVar.d(activity));
    }

    @Override // n8.g
    public j b(Context context, e eVar) {
        eVar.getClass();
        float f8 = context.getResources().getDisplayMetrics().density;
        Rect bounds = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new j(bounds, f8);
    }

    @Override // n8.b
    public Rect c(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }
}
