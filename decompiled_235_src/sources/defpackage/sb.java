package defpackage;

import android.os.Trace;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class sb implements Runnable {
    public static final sb B = new sb(0);
    public final /* synthetic */ int A;

    public /* synthetic */ sb(int i) {
        this.A = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                int i = AlarmManagerSchedulerBroadcastReceiver.a;
                return;
            case 1:
                throw null;
            default:
                try {
                    Method method = v87.b;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (ws1.d()) {
                        ws1.a().e();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    Method method2 = v87.b;
                    Trace.endSection();
                    throw th;
                }
        }
    }
}
