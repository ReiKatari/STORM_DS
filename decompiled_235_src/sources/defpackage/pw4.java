package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.Process;
import java.lang.ref.ReferenceQueue;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pw4  reason: default package */
/* loaded from: classes.dex */
public final class pw4 extends Thread {
    public final ReferenceQueue A;
    public final Handler B;

    public pw4(ReferenceQueue referenceQueue, Handler handler) {
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
                p7 p7Var = (p7) this.A.remove(1000L);
                Message obtainMessage = handler.obtainMessage();
                if (p7Var != null) {
                    obtainMessage.what = 3;
                    obtainMessage.obj = p7Var.a;
                    handler.sendMessage(obtainMessage);
                } else {
                    obtainMessage.recycle();
                }
            } catch (InterruptedException unused) {
                return;
            } catch (Exception e) {
                handler.post(new g15(e, 18));
                return;
            }
        }
    }
}
