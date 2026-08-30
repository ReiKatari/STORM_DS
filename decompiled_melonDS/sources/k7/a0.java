package k7;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a0 implements Executor {
    public final /* synthetic */ int A;
    public final ArrayDeque B;
    public final Executor L;
    public Runnable R;
    public final Object X;

    public a0(Executor executor, int i2) {
        this.A = i2;
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                this.L = executor;
                this.B = new ArrayDeque();
                this.X = new Object();
                return;
            default:
                executor.getClass();
                this.L = executor;
                this.B = new ArrayDeque();
                this.X = new Object();
                return;
        }
    }

    public final void a() {
        switch (this.A) {
            case 0:
                synchronized (this.X) {
                    Object poll = this.B.poll();
                    Runnable runnable = (Runnable) poll;
                    this.R = runnable;
                    if (poll != null) {
                        this.L.execute(runnable);
                    }
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                Runnable runnable2 = (Runnable) this.B.poll();
                this.R = runnable2;
                if (runnable2 != null) {
                    this.L.execute(runnable2);
                    return;
                }
                return;
            default:
                synchronized (this.X) {
                    try {
                        Runnable runnable3 = (Runnable) this.B.poll();
                        this.R = runnable3;
                        if (runnable3 != null) {
                            ((l0.a) this.L).execute(runnable3);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.A) {
            case 0:
                runnable.getClass();
                synchronized (this.X) {
                    this.B.offer(new ad.c(16, runnable, this));
                    if (this.R == null) {
                        a();
                    }
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                synchronized (this.X) {
                    try {
                        this.B.add(new m0.h(12, this, runnable));
                        if (this.R == null) {
                            a();
                        }
                    } finally {
                    }
                }
                return;
            default:
                synchronized (this.X) {
                    try {
                        this.B.add(new ad.c(17, this, runnable));
                        if (this.R == null) {
                            a();
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public a0(l0.a aVar) {
        this.A = 2;
        this.X = new Object();
        this.B = new ArrayDeque();
        this.L = aVar;
    }
}
