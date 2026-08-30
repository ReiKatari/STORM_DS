package sf;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import ve.g;
import ve.h;
import ve.i;
import yb.j;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f12890a;

    public c(Context context) {
        this.f12890a = context;
    }

    public final h a(Display display, g gVar) {
        j jVar;
        int i2;
        Context createWindowContext;
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        display.getClass();
        gVar.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            if ((display.getFlags() & 4) != 0) {
                i2 = 2030;
            } else {
                i2 = 2037;
            }
            createWindowContext = this.f12890a.createDisplayContext(display).createWindowContext(i2, null);
            createWindowContext.getClass();
            Object systemService = createWindowContext.getSystemService(WindowManager.class);
            systemService.getClass();
            currentWindowMetrics = ((WindowManager) systemService).getCurrentWindowMetrics();
            bounds = currentWindowMetrics.getBounds();
            bounds.getClass();
            jVar = new j(Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height()));
        } else {
            Point point = new Point();
            display.getRealSize(point);
            jVar = new j(Integer.valueOf(point.x), Integer.valueOf(point.y));
        }
        return new h(display.getDisplayId(), gVar, ((Number) jVar.A).intValue(), ((Number) jVar.B).intValue());
    }

    public abstract i b(Display display, Display display2);
}
