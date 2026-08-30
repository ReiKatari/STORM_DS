package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fc4  reason: default package */
/* loaded from: classes.dex */
public abstract class fc4 {
    public boolean b;
    public final ArrayList a = new ArrayList();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    public fc4(boolean z) {
        this.b = z;
    }

    public abstract void b();

    public final void e() {
        boolean isTerminated;
        CopyOnWriteArrayList copyOnWriteArrayList = this.c;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (true) {
            int i = 0;
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
                                if (i == 0) {
                                    executorService.shutdownNow();
                                    i = 1;
                                }
                            }
                        }
                        if (i != 0) {
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
                    c44.r();
                    return;
                }
            } else {
                copyOnWriteArrayList.clear();
                ArrayList arrayList = this.a;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((ec4) obj).e();
                }
                arrayList.clear();
                return;
            }
        }
    }

    public final void f(boolean z) {
        boolean z2;
        this.b = z;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ec4 ec4Var = (ec4) obj;
            if (ec4Var.e && z) {
                z2 = true;
            } else {
                z2 = false;
            }
            ec4Var.f(z2);
        }
    }

    public void a() {
    }

    public void c(ky kyVar) {
    }

    public void d(ky kyVar) {
    }
}
