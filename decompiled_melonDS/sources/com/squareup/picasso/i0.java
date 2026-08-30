package com.squareup.picasso;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i0 extends Thread {
    public final /* synthetic */ int A = 0;

    public /* synthetic */ i0(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        fj.b g10;
        switch (this.A) {
            case 0:
                Process.setThreadPriority(10);
                super.run();
                return;
        }
        while (true) {
            try {
                bk.a aVar = fj.b.f4968h;
                reentrantLock = fj.b.f4970j;
                reentrantLock.lock();
                g10 = x8.e.g();
            } catch (InterruptedException unused) {
            }
            if (g10 == fj.b.f4969i) {
                fj.b.f4969i = null;
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            if (g10 != null) {
                g10.k();
            }
        }
    }

    public /* synthetic */ i0(String str) {
        super(str);
    }
}
