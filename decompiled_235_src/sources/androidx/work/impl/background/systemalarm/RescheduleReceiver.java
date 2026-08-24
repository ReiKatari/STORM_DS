package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = ga0.h("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ga0 f = ga0.f();
        String str = a;
        f.b(str, "Received intent " + intent);
        try {
            lw7 b = lw7.b(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            b.getClass();
            synchronized (lw7.m) {
                BroadcastReceiver.PendingResult pendingResult = b.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                }
                b.i = goAsync;
                if (b.h) {
                    goAsync.finish();
                    b.i = null;
                }
            }
        } catch (IllegalStateException e) {
            ga0.f().e(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
