package l0;

import android.os.Handler;
import d0.n;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements Executor {
    public static volatile e L;
    public final /* synthetic */ int A;
    public final Object B;

    public e() {
        this.A = 0;
        this.B = Executors.newFixedThreadPool(2, new n(1));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.A) {
            case 0:
                ((ExecutorService) this.B).execute(runnable);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                Handler handler = (Handler) this.B;
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                ((z8.a) this.B).f14971c.post(runnable);
                return;
        }
    }

    public /* synthetic */ e(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }
}
