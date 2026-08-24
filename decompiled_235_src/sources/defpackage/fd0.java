package defpackage;

import android.content.res.TypedArray;
import android.graphics.SurfaceTexture;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import android.view.Surface;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fd0  reason: default package */
/* loaded from: classes.dex */
public final class fd0 implements le0 {
    public final /* synthetic */ CountDownLatch a;
    public final /* synthetic */ sw b;
    public final /* synthetic */ Surface c;
    public final /* synthetic */ SurfaceTexture d;

    public fd0(CountDownLatch countDownLatch, sw swVar, Surface surface, SurfaceTexture surfaceTexture) {
        this.a = countDownLatch;
        this.b = swVar;
        this.c = surface;
        this.d = surfaceTexture;
    }

    @Override // defpackage.le0
    public final void d(me0 me0Var) {
        Log.d("CXCP", "Empty capture session closed");
        if (this.b.a()) {
            this.c.release();
            this.d.release();
        }
    }

    @Override // defpackage.le0
    public final void g(me0 me0Var) {
        boolean isTerminated;
        Log.d("CXCP", "Empty capture session configured. Closing it");
        if (me0Var instanceof AutoCloseable) {
            me0Var.close();
        } else if (me0Var instanceof ExecutorService) {
            ExecutorService executorService = (ExecutorService) me0Var;
            if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                executorService.shutdown();
                boolean z = false;
                while (!isTerminated) {
                    try {
                        isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                    } catch (InterruptedException unused) {
                        if (!z) {
                            executorService.shutdownNow();
                            z = true;
                        }
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        } else if (me0Var instanceof TypedArray) {
            ((TypedArray) me0Var).recycle();
        } else if (me0Var instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) me0Var).release();
        } else if (me0Var instanceof MediaDrm) {
            ((MediaDrm) me0Var).release();
        } else {
            u34.t();
            return;
        }
        this.a.countDown();
    }

    @Override // defpackage.le0
    public final void h(me0 me0Var) {
        Log.d("CXCP", "Empty capture session configure failed");
        if (this.b.a()) {
            this.c.release();
            this.d.release();
        }
        this.a.countDown();
    }

    @Override // defpackage.zc6
    public final void a() {
    }

    @Override // defpackage.zc6
    public final void b() {
    }

    @Override // defpackage.le0
    public final void c(me0 me0Var) {
    }

    @Override // defpackage.le0
    public final void e(me0 me0Var) {
    }

    @Override // defpackage.le0
    public final void f(me0 me0Var) {
    }
}
