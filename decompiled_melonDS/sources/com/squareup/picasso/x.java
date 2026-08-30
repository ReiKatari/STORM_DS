package com.squareup.picasso;

import android.os.Handler;
import android.os.Message;
import android.os.Process;
import java.lang.ref.ReferenceQueue;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x extends Thread {
    public final ReferenceQueue A;
    public final Handler B;

    public x(ReferenceQueue referenceQueue, Handler handler) {
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
                a aVar = (a) this.A.remove(1000L);
                Message obtainMessage = handler.obtainMessage();
                if (aVar != null) {
                    obtainMessage.what = 3;
                    obtainMessage.obj = aVar.f3180a;
                    handler.sendMessage(obtainMessage);
                } else {
                    obtainMessage.recycle();
                }
            } catch (InterruptedException unused) {
                return;
            } catch (Exception e6) {
                handler.post(new ad.g(2, e6));
                return;
            }
        }
    }
}
