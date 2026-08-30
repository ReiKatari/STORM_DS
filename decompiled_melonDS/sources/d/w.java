package d;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: b  reason: collision with root package name */
    public boolean f3314b;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f3313a = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final CopyOnWriteArrayList f3315c = new CopyOnWriteArrayList();

    public w(boolean z10) {
        this.f3314b = z10;
    }

    public abstract void b();

    public final void e() {
        boolean isTerminated;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3315c;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (true) {
            int i2 = 0;
            if (it.hasNext()) {
                AutoCloseable autoCloseable = (AutoCloseable) it.next();
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else if (autoCloseable instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) autoCloseable;
                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        while (!isTerminated) {
                            try {
                                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (i2 == 0) {
                                    executorService.shutdownNow();
                                    i2 = 1;
                                }
                            }
                        }
                        if (i2 != 0) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } else if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                } else if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                } else if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                } else {
                    fj.j.b();
                    return;
                }
            } else {
                copyOnWriteArrayList.clear();
                ArrayList arrayList = this.f3313a;
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((v) obj).e();
                }
                arrayList.clear();
                return;
            }
        }
    }

    public final void f(boolean z10) {
        boolean z11;
        this.f3314b = z10;
        ArrayList arrayList = this.f3313a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            v vVar = (v) obj;
            if (vVar.f3312e && z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            vVar.f(z11);
        }
    }

    public void a() {
    }

    public void c(a aVar) {
    }

    public void d(a aVar) {
    }
}
