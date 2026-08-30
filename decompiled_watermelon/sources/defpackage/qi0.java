package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qi0  reason: default package */
/* loaded from: classes.dex */
public final class qi0 implements cc0 {
    public final an2 a;
    public final ki0 b;
    public final r9 c;
    public final fg0 d;
    public final cm6 e;
    public final dd0 f;
    public final tf6 g;
    public final ct6 h;
    public final o31 i;
    public final int j;
    public final Object k;
    public final fw l;
    public final Map m;
    public final Map n;
    public pt6 o;
    public final dz4 p;
    public sc0 q;
    public li0 r;
    public Map s;
    public LinkedHashMap t;
    public mi0 u;
    public final CountDownLatch v;
    public boolean w;
    public final CountDownLatch x;
    public Map y;
    public final LinkedHashMap z;

    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, dz4] */
    public qi0(an2 an2Var, ki0 ki0Var, r9 r9Var, fg0 fg0Var, cm6 cm6Var, dd0 dd0Var, se seVar, tf6 tf6Var, tg6 tg6Var, ct6 ct6Var, o31 o31Var) {
        dz4 dz4Var;
        ki0Var.getClass();
        fg0Var.getClass();
        cm6Var.getClass();
        dd0Var.getClass();
        tg6Var.getClass();
        ct6Var.getClass();
        o31Var.getClass();
        this.a = an2Var;
        this.b = ki0Var;
        this.c = r9Var;
        this.d = fg0Var;
        this.e = cm6Var;
        this.f = dd0Var;
        this.g = tf6Var;
        this.h = ct6Var;
        this.i = o31Var;
        cw cwVar = ri0.a;
        cwVar.getClass();
        this.j = cw.b.incrementAndGet(cwVar);
        this.k = new Object();
        this.l = w81.g(Boolean.FALSE);
        this.m = Collections.synchronizedMap(new HashMap());
        this.n = Collections.synchronizedMap(new HashMap());
        if (seVar != null) {
            seVar.getClass();
            ?? obj = new Object();
            obj.A = w81.g(j16.PENDING);
            dz4Var = obj;
        } else {
            dz4Var = null;
        }
        this.p = dz4Var;
        this.u = mi0.PENDING;
        this.v = new CountDownLatch(1);
        this.x = new CountDownLatch(1);
        this.z = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0127  */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, n75] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, n75] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(defpackage.qi0 r12, defpackage.k11 r13) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qi0.i(qi0, k11):java.lang.Object");
    }

    @Override // defpackage.cc0
    public final void a(dc0 dc0Var) {
        Log.d("CXCP", this + " Ready");
    }

    @Override // defpackage.l16
    public final void b() {
        if (this.l.a(Boolean.FALSE, Boolean.TRUE)) {
            Log.d("CXCP", this + " session finalizing");
            Trace.beginSection(this + "#onSessionFinalized");
            o();
            n(0L);
            Trace.endSection();
        }
    }

    @Override // defpackage.l16
    public final void c() {
        Log.d("CXCP", this + " session disconnecting");
        Trace.beginSection(this + "#onSessionDisconnected");
        l();
        try {
            Trace.beginSection(this + "#onSessionDisconnected Await");
            this.v.await();
            Trace.endSection();
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.cc0
    public final void d(dc0 dc0Var) {
        Log.d("CXCP", this + " CaptureQueueEmpty");
    }

    @Override // defpackage.cc0
    public final void e(dc0 dc0Var) {
        Log.d("CXCP", this + " Active");
    }

    @Override // defpackage.cc0
    public final void f(dc0 dc0Var) {
        Log.d("CXCP", this + " Configured");
        Trace.beginSection(this + "#configure");
        j(dc0Var);
        this.x.countDown();
        dz4 dz4Var = this.p;
        if (dz4Var != null) {
            dz4Var.x();
        }
        Trace.endSection();
    }

    @Override // defpackage.cc0
    public final void g(dc0 dc0Var) {
        Log.w("CXCP", this + " Configuration Failed");
        Trace.beginSection(this + "#onConfigureFailed");
        this.a.a(new en2(9, false));
        o();
        this.x.countDown();
        dz4 dz4Var = this.p;
        if (dz4Var != null) {
            dz4Var.x();
        }
        Trace.endSection();
    }

    @Override // defpackage.cc0
    public final void h(dc0 dc0Var) {
        Log.d("CXCP", this + " Closed");
        Trace.beginSection(this + "#onClosed");
        o();
        this.x.countDown();
        dz4 dz4Var = this.p;
        if (dz4Var != null) {
            dz4Var.x();
        }
        Trace.endSection();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(defpackage.dc0 r10) {
        /*
            r9 = this;
            java.lang.String r0 = "Configured "
            java.lang.Object r1 = r9.k
            monitor-enter(r1)
            li0 r2 = r9.r     // Catch: java.lang.Throwable -> L29
            if (r2 != 0) goto L2c
            if (r10 == 0) goto L2c
            r9 r2 = r9.c     // Catch: java.lang.Throwable -> L29
            java.util.Map r3 = r9.m     // Catch: java.lang.Throwable -> L29
            r3.getClass()     // Catch: java.lang.Throwable -> L29
            java.util.Map r4 = r9.n     // Catch: java.lang.Throwable -> L29
            r4.getClass()     // Catch: java.lang.Throwable -> L29
            pa0 r2 = r2.q(r10, r3, r4)     // Catch: java.lang.Throwable -> L29
            li0 r3 = new li0     // Catch: java.lang.Throwable -> L29
            vh0 r4 = new vh0     // Catch: java.lang.Throwable -> L29
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L29
            r3.<init>(r10, r4, r2)     // Catch: java.lang.Throwable -> L29
            r9.r = r3     // Catch: java.lang.Throwable -> L29
            r2 = r3
            goto L2c
        L29:
            r9 = move-exception
            goto L9d
        L2c:
            mi0 r10 = r9.u     // Catch: java.lang.Throwable -> L29
            mi0 r3 = defpackage.mi0.CREATED     // Catch: java.lang.Throwable -> L29
            if (r10 != r3) goto L9b
            if (r2 != 0) goto L35
            goto L9b
        L35:
            java.util.Map r10 = r9.s     // Catch: java.lang.Throwable -> L29
            r3 = 1
            r4 = 0
            if (r10 == 0) goto L41
            java.util.LinkedHashMap r10 = r9.t     // Catch: java.lang.Throwable -> L29
            if (r10 == 0) goto L41
            r10 = r3
            goto L42
        L41:
            r10 = r4
        L42:
            monitor-exit(r1)
            if (r10 == 0) goto L48
            r9.m(r4)
        L48:
            java.lang.Object r10 = r9.k
            monitor-enter(r10)
            java.lang.String r1 = "CXCP"
            cm6 r4 = r9.e     // Catch: java.lang.Throwable -> L98
            r4.getClass()     // Catch: java.lang.Throwable -> L98
            long r4 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> L98
            pt6 r6 = r9.o     // Catch: java.lang.Throwable -> L98
            r6.getClass()     // Catch: java.lang.Throwable -> L98
            long r6 = r6.a     // Catch: java.lang.Throwable -> L98
            long r4 = r4 - r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L98
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L98
            r6.append(r9)     // Catch: java.lang.Throwable -> L98
            java.lang.String r0 = " in "
            r6.append(r0)     // Catch: java.lang.Throwable -> L98
            java.lang.String r0 = "%.3f ms"
            double r4 = (double) r4     // Catch: java.lang.Throwable -> L98
            r7 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r4 = r4 / r7
            java.lang.Double r4 = java.lang.Double.valueOf(r4)     // Catch: java.lang.Throwable -> L98
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L98
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r4, r3)     // Catch: java.lang.Throwable -> L98
            r4 = 0
            java.lang.String r0 = java.lang.String.format(r4, r0, r3)     // Catch: java.lang.Throwable -> L98
            r6.append(r0)     // Catch: java.lang.Throwable -> L98
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L98
            android.util.Log.i(r1, r0)     // Catch: java.lang.Throwable -> L98
            an2 r9 = r9.a     // Catch: java.lang.Throwable -> L98
            vh0 r0 = r2.b     // Catch: java.lang.Throwable -> L98
            r9.b(r0)     // Catch: java.lang.Throwable -> L98
            monitor-exit(r10)
            return
        L98:
            r9 = move-exception
            monitor-exit(r10)
            throw r9
        L9b:
            monitor-exit(r1)
            return
        L9d:
            monitor-exit(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qi0.j(dc0):void");
    }

    public final void k(Map map) {
        map.getClass();
        synchronized (this.k) {
            try {
                mi0 mi0Var = this.u;
                if (mi0Var != mi0.CLOSING && mi0Var != mi0.CLOSED) {
                    Map map2 = this.y;
                    if (map2 == null) {
                        map2 = qp1.A;
                    }
                    p(map2, map);
                    this.y = map;
                    Map map3 = this.s;
                    if (map3 != null && this.t == null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : map.entrySet()) {
                            if (map3.containsKey(entry.getKey())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        if (linkedHashMap.size() == map3.size()) {
                            this.t = linkedHashMap;
                            tq5.w(this.i, null, null, new x3(this, (j11) null, 4), 3);
                        }
                    }
                    tq5.w(this.i, null, null, new ni0(this, null, 1), 3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l() {
        synchronized (this.k) {
            try {
                mi0 mi0Var = this.u;
                mi0 mi0Var2 = mi0.CLOSING;
                if (mi0Var != mi0Var2 && mi0Var != mi0.CLOSED) {
                    this.u = mi0Var2;
                    li0 li0Var = this.r;
                    boolean z = false;
                    if (li0Var != null) {
                        this.r = null;
                    } else {
                        if (this.f.d && this.w) {
                            z = true;
                        }
                        li0Var = null;
                    }
                    dz4 dz4Var = this.p;
                    if (dz4Var != null) {
                        dz4Var.x();
                    }
                    if (z) {
                        Log.d("CXCP", "Waiting for CameraCaptureSession configuration");
                        if (((o27) this.h.b(3000L, new qf0(this, null, 1))) == null) {
                            Log.e("CXCP", "Waiting for CameraCaptureSession configuration timed out");
                        }
                        synchronized (this.k) {
                            li0Var = this.r;
                            this.r = null;
                        }
                    }
                    Trace.beginSection(this.a + "#onGraphStopping");
                    an2 an2Var = this.a;
                    Log.d("CXCP", an2Var + " onGraphStopping");
                    an2Var.d.k(hn2.b);
                    an2Var.b.J(null);
                    for (kn2 kn2Var : an2Var.c) {
                        kn2Var.a.b(kn2Var.a(), hn2.b);
                    }
                    Trace.endSection();
                    if (li0Var != null) {
                        vh0 vh0Var = li0Var.b;
                        Log.d("CXCP", this + " Shutdown");
                        Trace.beginSection(this + "#shutdown");
                        if (this.f.a && ((o27) this.h.b(2000L, new sm(this, vh0Var, null, 3))) == null) {
                            Log.e("CXCP", "Failed to abort captures in 2000ms");
                        }
                        Trace.beginSection(this + "#disconnect");
                        li0Var.c.c();
                        Trace.endSection();
                        if (this.f.d && ((o27) this.h.b(3000L, new sm(this, li0Var, null, 2))) == null) {
                            Log.e("CXCP", "Failed to close the capture session in 3000ms");
                        }
                        Trace.beginSection(this.a + "#onGraphStopped");
                        this.a.c();
                        Trace.endSection();
                        Trace.endSection();
                    } else {
                        Trace.beginSection(this.a + "#onGraphStopped");
                        this.a.c();
                        Trace.endSection();
                    }
                    this.v.countDown();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(boolean z) {
        li0 li0Var;
        Map map;
        LinkedHashMap linkedHashMap;
        boolean z2;
        synchronized (this.k) {
            li0Var = this.r;
            map = this.s;
            linkedHashMap = this.t;
        }
        if (li0Var != null && map != null && linkedHashMap != null) {
            Trace.beginSection(this + "#finalizeOutputConfigurations");
            this.e.getClass();
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            for (Map.Entry entry : map.entrySet()) {
                int i = ((uf6) entry.getKey()).a;
                li liVar = (li) entry.getValue();
                Object obj = linkedHashMap.get(new uf6(i));
                if (obj != null) {
                    liVar.a((Surface) obj);
                } else {
                    i.n("Required value was null.");
                    return;
                }
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Map.Entry entry2 : map.entrySet()) {
                linkedHashSet.add((li) entry2.getValue());
            }
            li0Var.a.z(tq0.n1(linkedHashSet));
            synchronized (this.k) {
                try {
                    if (this.u == mi0.CREATED) {
                        this.m.putAll(linkedHashMap);
                        Iterator it = linkedHashMap.entrySet().iterator();
                        while (true) {
                            z2 = true;
                            if (it.hasNext()) {
                                Map.Entry entry3 = (Map.Entry) it.next();
                                int i2 = ((uf6) entry3.getKey()).a;
                                Surface surface = (Surface) entry3.getValue();
                                bg0 d = this.g.d(i2);
                                if (d != null) {
                                    if (d.b.size() == 1) {
                                        Map map2 = this.n;
                                        map2.getClass();
                                        map2.put(new dg4(((sf6) tq0.e1(d.b)).a), surface);
                                    } else {
                                        throw new IllegalStateException("Cannot finalize a multi-output stream!");
                                    }
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            } else {
                                this.e.getClass();
                                long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos;
                                StringBuilder sb = new StringBuilder();
                                sb.append("Finalized ");
                                ArrayList arrayList = new ArrayList(map.size());
                                for (Map.Entry entry4 : map.entrySet()) {
                                    arrayList.add(new uf6(((uf6) entry4.getKey()).a));
                                }
                                sb.append(arrayList);
                                sb.append(" for ");
                                sb.append(this);
                                sb.append(" in ");
                                sb.append(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(elapsedRealtimeNanos2 / 1000000.0d)}, 1)));
                                Log.i("CXCP", sb.toString());
                            }
                        }
                    } else {
                        z2 = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z2 && z) {
                an2 an2Var = this.a;
                Log.d("CXCP", an2Var + " onGraphModified");
                an2Var.b.Z.H(nm2.b);
            }
            Trace.endSection();
        }
    }

    public final void n(long j) {
        List<AutoCloseable> n1;
        boolean isTerminated;
        if (j != 0) {
            tq5.w(this.i, null, null, new oi0(j, this, (j11) null), 3);
            return;
        }
        Log.d("CXCP", "Finalizing " + this);
        synchronized (this.k) {
            n1 = tq0.n1(this.z.values());
            this.z.clear();
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

    public final void o() {
        long j;
        boolean z;
        int i;
        l();
        synchronized (this.k) {
            try {
                mi0 mi0Var = this.u;
                mi0 mi0Var2 = mi0.CLOSED;
                j = 0;
                if (mi0Var != mi0Var2) {
                    z = true;
                    if (this.q != null && this.w && (i = this.f.c) != 1) {
                        if (i == 2) {
                            j = 2000;
                        }
                    }
                    this.q = null;
                    this.u = mi0Var2;
                }
                z = false;
                this.q = null;
                this.u = mi0Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            n(j);
        }
    }

    public final void p(Map map, Map map2) {
        Surface surface;
        AutoCloseable autoCloseable;
        boolean isTerminated;
        Set s1 = tq0.s1(map.values());
        Set s12 = tq0.s1(map2.values());
        Iterator it = hi2.I(s1, s12).iterator();
        do {
            boolean hasNext = it.hasNext();
            LinkedHashMap linkedHashMap = this.z;
            if (hasNext) {
                surface = (Surface) it.next();
                autoCloseable = (AutoCloseable) linkedHashMap.remove(surface);
                if (autoCloseable != null) {
                    if (autoCloseable instanceof AutoCloseable) {
                        autoCloseable.close();
                        continue;
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
                                continue;
                            } else {
                                continue;
                            }
                        }
                    } else if (autoCloseable instanceof TypedArray) {
                        ((TypedArray) autoCloseable).recycle();
                        continue;
                    } else if (autoCloseable instanceof MediaMetadataRetriever) {
                        ((MediaMetadataRetriever) autoCloseable).release();
                        continue;
                    } else if (autoCloseable instanceof MediaDrm) {
                        ((MediaDrm) autoCloseable).release();
                        continue;
                    } else {
                        c44.r();
                        return;
                    }
                } else {
                    autoCloseable = null;
                    continue;
                }
            } else {
                for (Surface surface2 : hi2.I(s12, s1)) {
                    linkedHashMap.put(surface2, this.d.a(surface2));
                }
                return;
            }
        } while (autoCloseable != null);
        i.m(surface, " doesn't have a matching surface token!", "Surface ");
    }

    public final String toString() {
        return "CaptureSessionState-" + this.j;
    }
}
