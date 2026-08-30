package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p8.v;
import q8.p;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final String f1728a = v.g("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        v e6 = v.e();
        String str = f1728a;
        e6.a(str, "Received intent " + intent);
        try {
            p a10 = p.a(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            a10.getClass();
            synchronized (p.m) {
                BroadcastReceiver.PendingResult pendingResult = a10.f12379i;
                if (pendingResult != null) {
                    pendingResult.finish();
                }
                a10.f12379i = goAsync;
                if (a10.f12378h) {
                    goAsync.finish();
                    a10.f12379i = null;
                }
            }
        } catch (IllegalStateException e10) {
            v.e().d(f1728a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
        }
    }
}
