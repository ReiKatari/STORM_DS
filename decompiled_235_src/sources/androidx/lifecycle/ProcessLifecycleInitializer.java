package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.HashSet;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements j53 {
    @Override // defpackage.j53
    public final List a() {
        return yt1.A;
    }

    @Override // defpackage.j53
    public final Object b(Context context) {
        context.getClass();
        bt J = bt.J(context);
        J.getClass();
        if (((HashSet) J.L).contains(ProcessLifecycleInitializer.class)) {
            if (!cu3.a.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new bu3());
            }
            h35 h35Var = h35.e0;
            h35Var.getClass();
            h35Var.X = new Handler();
            h35Var.Y.f(st3.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            applicationContext2.getClass();
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new g35(h35Var));
            return h35Var;
        }
        i.m("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        return null;
    }
}
