package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = ga0.h("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        ga0 f = ga0.f();
        String str = a;
        f.b(str, "Requesting diagnostics");
        try {
            context.getClass();
            lw7 b = lw7.b(context);
            b.getClass();
            List b0 = hf.b0(new bk1(DiagnosticsWorker.class).c());
            if (!b0.isEmpty()) {
                new aw7(b, null, y72.KEEP, b0).a();
                return;
            }
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        } catch (IllegalStateException e) {
            ga0.f().e(str, "WorkManager is not initialized", e);
        }
    }
}
