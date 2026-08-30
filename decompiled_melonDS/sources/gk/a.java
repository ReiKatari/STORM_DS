package gk;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements Executor {
    public static volatile a L;
    public final /* synthetic */ int A;
    public final Object B;

    public a(int i2) {
        this.A = i2;
        switch (i2) {
            case 2:
                this.B = Executors.newSingleThreadExecutor(new com.squareup.picasso.j0(1));
                return;
            default:
                this.B = new Handler(Looper.getMainLooper());
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.A) {
            case 0:
                ((Handler) this.B).post(runnable);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                Handler handler = (Handler) this.B;
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                ((ExecutorService) this.B).execute(runnable);
                return;
        }
    }

    public a(Handler handler) {
        this.A = 1;
        this.B = handler;
    }
}
