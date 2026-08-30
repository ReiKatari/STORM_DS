package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.Process;
import java.lang.ref.ReferenceQueue;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kn4  reason: default package */
/* loaded from: classes.dex */
public final class kn4 extends Thread {
    public final ReferenceQueue A;
    public final Handler B;

    public kn4(ReferenceQueue referenceQueue, Handler handler) {
        this.A = referenceQueue;
        this.B = handler;
        setDaemon(true);
        setName("Picasso-refQueue");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Handler handler = this.B;
        Process.setThreadPriority(10);
        while (true) {
            try {
                o7 o7Var = (o7) this.A.remove(1000L);
                Message obtainMessage = handler.obtainMessage();
                if (o7Var != null) {
                    obtainMessage.what = 3;
                    obtainMessage.obj = o7Var.a;
                    handler.sendMessage(obtainMessage);
                } else {
                    obtainMessage.recycle();
                }
            } catch (InterruptedException unused) {
                return;
            } catch (Exception e) {
                handler.post(new es4(18, e));
                return;
            }
        }
    }
}
