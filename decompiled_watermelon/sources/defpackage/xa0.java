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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xa0  reason: default package */
/* loaded from: classes.dex */
public final class xa0 implements cc0 {
    public final /* synthetic */ CountDownLatch a;
    public final /* synthetic */ aw b;
    public final /* synthetic */ Surface c;
    public final /* synthetic */ SurfaceTexture d;

    public xa0(CountDownLatch countDownLatch, aw awVar, Surface surface, SurfaceTexture surfaceTexture) {
        this.a = countDownLatch;
        this.b = awVar;
        this.c = surface;
        this.d = surfaceTexture;
    }

    @Override // defpackage.cc0
    public final void f(dc0 dc0Var) {
        boolean isTerminated;
        Log.d("CXCP", "Empty capture session configured. Closing it");
        if (dc0Var instanceof AutoCloseable) {
            dc0Var.close();
        } else if (dc0Var instanceof ExecutorService) {
            ExecutorService executorService = (ExecutorService) dc0Var;
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
        } else if (dc0Var instanceof TypedArray) {
            ((TypedArray) dc0Var).recycle();
        } else if (dc0Var instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) dc0Var).release();
        } else if (dc0Var instanceof MediaDrm) {
            ((MediaDrm) dc0Var).release();
        } else {
            c44.r();
            return;
        }
        this.a.countDown();
    }

    @Override // defpackage.cc0
    public final void g(dc0 dc0Var) {
        Log.d("CXCP", "Empty capture session configure failed");
        if (this.b.a()) {
            this.c.release();
            this.d.release();
        }
        this.a.countDown();
    }

    @Override // defpackage.cc0
    public final void h(dc0 dc0Var) {
        Log.d("CXCP", "Empty capture session closed");
        if (this.b.a()) {
            this.c.release();
            this.d.release();
        }
    }

    @Override // defpackage.l16
    public final void b() {
    }

    @Override // defpackage.l16
    public final void c() {
    }

    @Override // defpackage.cc0
    public final void a(dc0 dc0Var) {
    }

    @Override // defpackage.cc0
    public final void d(dc0 dc0Var) {
    }

    @Override // defpackage.cc0
    public final void e(dc0 dc0Var) {
    }
}
