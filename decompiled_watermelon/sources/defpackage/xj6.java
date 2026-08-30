package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.view.Surface;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xj6  reason: default package */
/* loaded from: classes.dex */
public final class xj6 implements AutoCloseable {
    public final tf6 A;
    public final fw4 B;
    public final fg0 L;
    public final Map R;
    public final Object X;
    public final LinkedHashMap Y;
    public final LinkedHashMap Z;
    public boolean c0;
    public boolean d0;

    public xj6(tf6 tf6Var, wc1 wc1Var, fg0 fg0Var, Map map) {
        wc1Var.getClass();
        map.getClass();
        this.A = tf6Var;
        this.B = wc1Var;
        this.L = fg0Var;
        this.R = map;
        this.X = new Object();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            ((pw2) entry.getValue()).getClass();
            linkedHashMap.put(key, null);
        }
        this.Y = linkedHashMap;
        this.Z = new LinkedHashMap();
        this.c0 = true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        boolean isTerminated;
        synchronized (this.X) {
            if (this.d0) {
                return;
            }
            this.d0 = true;
            this.Y.clear();
            List<AutoCloseable> n1 = tq0.n1(this.Z.values());
            this.Z.clear();
            for (AutoCloseable autoCloseable : n1) {
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
                    c44.r();
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        r1 = defpackage.qp1.A;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r12 = this;
            java.lang.Object r0 = r12.X
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L4c
            r1.<init>()     // Catch: java.lang.Throwable -> L4c
            tf6 r2 = r12.A     // Catch: java.lang.Throwable -> L4c
            java.util.List r2 = r2.L     // Catch: java.lang.Throwable -> L4c
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L4c
        L10:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L4a
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L4c
            rf6 r3 = (defpackage.rf6) r3     // Catch: java.lang.Throwable -> L4c
            java.util.ArrayList r4 = r3.l     // Catch: java.lang.Throwable -> L4c
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L4c
            r6 = 0
            r7 = r6
        L24:
            if (r7 >= r5) goto L10
            java.lang.Object r8 = r4.get(r7)     // Catch: java.lang.Throwable -> L4c
            int r7 = r7 + 1
            bg0 r8 = (defpackage.bg0) r8     // Catch: java.lang.Throwable -> L4c
            java.util.LinkedHashMap r9 = r12.Y     // Catch: java.lang.Throwable -> L4c
            int r10 = r8.a     // Catch: java.lang.Throwable -> L4c
            uf6 r11 = new uf6     // Catch: java.lang.Throwable -> L4c
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r9 = r9.get(r11)     // Catch: java.lang.Throwable -> L4c
            android.view.Surface r9 = (android.view.Surface) r9     // Catch: java.lang.Throwable -> L4c
            if (r9 != 0) goto L4e
            sn1 r8 = r3.f     // Catch: java.lang.Throwable -> L4c
            if (r8 == 0) goto L45
            r8 = 1
            goto L46
        L45:
            r8 = r6
        L46:
            if (r8 != 0) goto L24
            qp1 r1 = defpackage.qp1.A     // Catch: java.lang.Throwable -> L4c
        L4a:
            monitor-exit(r0)
            goto L59
        L4c:
            r12 = move-exception
            goto L84
        L4e:
            int r8 = r8.a     // Catch: java.lang.Throwable -> L4c
            uf6 r10 = new uf6     // Catch: java.lang.Throwable -> L4c
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L4c
            r1.put(r10, r9)     // Catch: java.lang.Throwable -> L4c
            goto L24
        L59:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L60
            goto L80
        L60:
            fw4 r12 = r12.B
            java.lang.Object r12 = r12.get()
            ca0 r12 = (defpackage.ca0) r12
            r12.getClass()
            java.lang.Object r0 = r12.q
            monitor-enter(r0)
            boolean r2 = r12.e()     // Catch: java.lang.Throwable -> L81
            if (r2 == 0) goto L76
            monitor-exit(r0)
            return
        L76:
            r12.A = r1     // Catch: java.lang.Throwable -> L81
            qi0 r12 = r12.z     // Catch: java.lang.Throwable -> L81
            monitor-exit(r0)
            if (r12 == 0) goto L80
            r12.k(r1)
        L80:
            return
        L81:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
        L84:
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xj6.d():void");
    }

    public final void i() {
        synchronized (this.X) {
            try {
                if (!this.d0) {
                    for (Surface surface : this.Y.values()) {
                        this.Z.put(surface, this.L.a(surface));
                    }
                    this.c0 = true;
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p() {
        List<AutoCloseable> n1;
        boolean isTerminated;
        synchronized (this.X) {
            this.c0 = false;
            n1 = tq0.n1(this.Z.values());
            this.Z.clear();
        }
        for (AutoCloseable autoCloseable : n1) {
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
                c44.r();
                return;
            }
        }
    }
}
