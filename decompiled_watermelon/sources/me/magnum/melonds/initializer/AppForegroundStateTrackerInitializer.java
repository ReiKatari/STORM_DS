package me.magnum.melonds.initializer;

import android.app.Application;
import android.content.Context;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class AppForegroundStateTrackerInitializer implements gz2 {
    @Override // defpackage.gz2
    public final List a() {
        return pp1.A;
    }

    @Override // defpackage.gz2
    public final Object b(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            ns nsVar = (ns) ((b81) ((hz2) mh7.L(applicationContext, hz2.class))).G.get();
            if (nsVar != null) {
                ((Application) context).registerActivityLifecycleCallbacks(nsVar.c);
                return o27.a;
            }
            b53.g0("appForegroundStateTracker");
            throw null;
        }
        f81.o();
        return null;
    }
}
