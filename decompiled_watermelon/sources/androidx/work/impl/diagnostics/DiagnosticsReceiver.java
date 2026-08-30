package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = y70.h("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        y70 f = y70.f();
        String str = a;
        f.b(str, "Requesting diagnostics");
        try {
            context.getClass();
            kh7 b = kh7.b(context);
            b.getClass();
            List b0 = l07.b0(new xf1(DiagnosticsWorker.class).c());
            if (!b0.isEmpty()) {
                new ah7(b, null, g32.KEEP, b0).a();
                return;
            }
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        } catch (IllegalStateException e) {
            y70.f().e(str, "WorkManager is not initialized", e);
        }
    }
}
