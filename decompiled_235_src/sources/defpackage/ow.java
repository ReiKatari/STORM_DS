package defpackage;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ow  reason: default package */
/* loaded from: classes.dex */
public final class ow extends Thread {
    public final /* synthetic */ int A = 1;

    public /* synthetic */ ow(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        pw o;
        switch (this.A) {
            case 0:
                break;
            default:
                Process.setThreadPriority(10);
                super.run();
                return;
        }
        while (true) {
            try {
                zb zbVar = pw.h;
                reentrantLock = pw.j;
                reentrantLock.lock();
                o = cs1.o();
            } catch (InterruptedException unused) {
            }
            if (o == pw.i) {
                pw.i = null;
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            if (o != null) {
                o.l();
            }
        }
    }

    public /* synthetic */ ow(String str) {
        super(str);
    }
}
