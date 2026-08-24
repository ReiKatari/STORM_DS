package me.magnum.melonds.initializer;

import android.app.Application;
import android.content.Context;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class AppForegroundStateTrackerInitializer implements j53 {
    @Override // defpackage.j53
    public final List a() {
        return yt1.A;
    }

    @Override // defpackage.j53
    public final Object b(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            at atVar = (at) ((sb1) ((k53) hv.D(applicationContext, k53.class))).G.get();
            if (atVar != null) {
                ((Application) context).registerActivityLifecycleCallbacks(atVar.c);
                return jg7.a;
            }
            nb3.a0("appForegroundStateTracker");
            throw null;
        }
        e41.m();
        return null;
    }
}
