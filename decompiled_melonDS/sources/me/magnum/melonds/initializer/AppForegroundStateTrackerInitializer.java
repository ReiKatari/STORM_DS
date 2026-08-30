package me.magnum.melonds.initializer;

import android.app.Application;
import android.content.Context;
import java.util.List;
import nc.k;
import ne.a;
import rd.g;
import y7.b;
import yb.y;
import zb.q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class AppForegroundStateTrackerInitializer implements b {
    @Override // y7.b
    public final List a() {
        return q.A;
    }

    @Override // y7.b
    public final Object b(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            yf.b bVar = (yf.b) ((g) ((a) pc.a.u(applicationContext, a.class))).f12684w.get();
            if (bVar != null) {
                ((Application) context).registerActivityLifecycleCallbacks(bVar.f14818c);
                return y.f14813a;
            }
            k.f("appForegroundStateTracker");
            throw null;
        }
        throw new IllegalStateException();
    }
}
