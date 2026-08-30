package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import e9.a;
import java.util.List;
import p7.t;
import p8.l;
import p8.v;
import q8.m;
import q8.p;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final String f1729a = v.g("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        v e6 = v.e();
        String str = f1729a;
        e6.a(str, "Requesting diagnostics");
        try {
            context.getClass();
            p a10 = p.a(context);
            a10.getClass();
            List x9 = t.x(new a(DiagnosticsWorker.class).c());
            if (!x9.isEmpty()) {
                new m(a10, null, l.KEEP, x9).a();
                return;
            }
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        } catch (IllegalStateException e10) {
            v.e().d(str, "WorkManager is not initialized", e10);
        }
    }
}
