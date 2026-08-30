package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.HashSet;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements gz2 {
    @Override // defpackage.gz2
    public final List a() {
        return pp1.A;
    }

    @Override // defpackage.gz2
    public final Object b(Context context) {
        context.getClass();
        os y = os.y(context);
        y.getClass();
        if (((HashSet) y.L).contains(ProcessLifecycleInitializer.class)) {
            if (!an3.a.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new zm3());
            }
            du4 du4Var = du4.d0;
            du4Var.getClass();
            du4Var.X = new Handler();
            du4Var.Y.f(pm3.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            applicationContext2.getClass();
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new cu4(du4Var));
            return du4Var;
        }
        i.n("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        return null;
    }
}
