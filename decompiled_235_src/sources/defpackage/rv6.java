package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rv6  reason: default package */
/* loaded from: classes.dex */
public final class rv6 implements AutoCloseable {
    public final jr6 A;
    public final n55 B;
    public final oi0 L;
    public final Map R;
    public final Object X;
    public final LinkedHashMap Y;
    public final LinkedHashMap Z;
    public boolean d0;
    public boolean e0;

    public rv6(jr6 jr6Var, yg1 yg1Var, oi0 oi0Var, Map map) {
        yg1Var.getClass();
        map.getClass();
        this.A = jr6Var;
        this.B = yg1Var;
        this.L = oi0Var;
        this.R = map;
        this.X = new Object();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            ((t23) entry.getValue()).getClass();
            linkedHashMap.put(key, null);
        }
        this.Y = linkedHashMap;
        this.Z = new LinkedHashMap();
        this.d0 = true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        boolean isTerminated;
        synchronized (this.X) {
            if (this.e0) {
                return;
            }
            this.e0 = true;
            this.Y.clear();
            List<AutoCloseable> k1 = gt0.k1(this.Z.values());
            this.Z.clear();
            for (AutoCloseable autoCloseable : k1) {
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else if (autoCloseable instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) autoCloseable;
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
                } else if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                } else if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                } else if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                } else {
                    u34.t();
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        r1 = defpackage.zt1.A;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        Map linkedHashMap;
        boolean z;
        synchronized (this.X) {
            linkedHashMap = new LinkedHashMap();
            Iterator it = this.A.L.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    break;
                }
                hr6 hr6Var = (hr6) it.next();
                ArrayList arrayList = hr6Var.l;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ki0 ki0Var = (ki0) obj;
                    Surface surface = (Surface) this.Y.get(new kr6(ki0Var.a));
                    if (surface == null) {
                        if (hr6Var.f != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            break loop0;
                        }
                    } else {
                        linkedHashMap.put(new kr6(ki0Var.a), surface);
                    }
                }
            }
        }
        if (!linkedHashMap.isEmpty()) {
            kc0 kc0Var = (kc0) this.B.get();
            kc0Var.getClass();
            synchronized (kc0Var.q) {
                if (kc0Var.e()) {
                    return;
                }
                kc0Var.A = linkedHashMap;
                yk0 yk0Var = kc0Var.z;
                if (yk0Var != null) {
                    yk0Var.k(linkedHashMap);
                }
            }
        }
    }

    public final void h() {
        synchronized (this.X) {
            try {
                if (!this.e0) {
                    for (Surface surface : this.Y.values()) {
                        this.Z.put(surface, this.L.a(surface));
                    }
                    this.d0 = true;
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        List<AutoCloseable> k1;
        boolean isTerminated;
        synchronized (this.X) {
            this.d0 = false;
            k1 = gt0.k1(this.Z.values());
            this.Z.clear();
        }
        for (AutoCloseable autoCloseable : k1) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
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
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
            } else {
                u34.t();
                return;
            }
        }
    }
}
