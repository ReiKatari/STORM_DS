package defpackage;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wv  reason: default package */
/* loaded from: classes.dex */
public final class wv extends Thread {
    public final /* synthetic */ int A = 1;

    public /* synthetic */ wv(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        xv j;
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
                sb sbVar = xv.h;
                reentrantLock = xv.j;
                reentrantLock.lock();
                j = y60.j();
            } catch (InterruptedException unused) {
            }
            if (j == xv.i) {
                xv.i = null;
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            if (j != null) {
                j.k();
            }
        }
    }

    public /* synthetic */ wv(String str) {
        super(str);
    }
}
