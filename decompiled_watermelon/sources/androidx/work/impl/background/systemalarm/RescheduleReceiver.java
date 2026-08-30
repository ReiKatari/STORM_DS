package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = y70.h("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        y70 f = y70.f();
        String str = a;
        f.b(str, "Received intent " + intent);
        try {
            kh7 b = kh7.b(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            b.getClass();
            synchronized (kh7.m) {
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
            y70.f().e(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
