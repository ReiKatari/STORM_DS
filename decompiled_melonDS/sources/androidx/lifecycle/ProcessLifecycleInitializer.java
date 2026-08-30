package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements y7.b {
    @Override // y7.b
    public final List a() {
        return zb.q.A;
    }

    @Override // y7.b
    public final Object b(Context context) {
        context.getClass();
        y7.a c4 = y7.a.c(context);
        c4.getClass();
        if (c4.f14789b.contains(ProcessLifecycleInitializer.class)) {
            if (!u.f1490a.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new t());
            }
            k0 k0Var = k0.f1475c0;
            k0Var.getClass();
            k0Var.X = new Handler();
            k0Var.Y.f(p.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            applicationContext2.getClass();
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new j0(k0Var));
            return k0Var;
        }
        a0.j.p("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        return null;
    }
}
