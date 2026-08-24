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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yk0  reason: default package */
/* loaded from: classes.dex */
public final class yk0 implements le0 {
    public final gt2 a;
    public final sk0 b;
    public final s9 c;
    public final oi0 d;
    public final yx6 e;
    public final mf0 f;
    public final jr6 g;
    public final t57 h;
    public final w61 i;
    public final int j;
    public final Object k;
    public final xw l;
    public final Map m;
    public final Map n;
    public g67 o;
    public final s35 p;
    public bf0 q;
    public tk0 r;
    public Map s;
    public LinkedHashMap t;
    public uk0 u;
    public final CountDownLatch v;
    public boolean w;
    public final CountDownLatch x;
    public Map y;
    public final LinkedHashMap z;

    /* JADX WARN: Type inference failed for: r1v16, types: [s35, java.lang.Object] */
    public yk0(gt2 gt2Var, sk0 sk0Var, s9 s9Var, oi0 oi0Var, yx6 yx6Var, mf0 mf0Var, nc1 nc1Var, jr6 jr6Var, ks6 ks6Var, t57 t57Var, w61 w61Var) {
        s35 s35Var;
        sk0Var.getClass();
        oi0Var.getClass();
        yx6Var.getClass();
        mf0Var.getClass();
        ks6Var.getClass();
        t57Var.getClass();
        w61Var.getClass();
        this.a = gt2Var;
        this.b = sk0Var;
        this.c = s9Var;
        this.d = oi0Var;
        this.e = yx6Var;
        this.f = mf0Var;
        this.g = jr6Var;
        this.h = t57Var;
        this.i = w61Var;
        uw uwVar = zk0.a;
        uwVar.getClass();
        this.j = uw.b.incrementAndGet(uwVar);
        this.k = new Object();
        this.l = g04.u(Boolean.FALSE);
        this.m = Collections.synchronizedMap(new HashMap());
        this.n = Collections.synchronizedMap(new HashMap());
        if (nc1Var != null) {
            nc1Var.getClass();
            ?? obj = new Object();
            obj.A = g04.u(xc6.PENDING);
            s35Var = obj;
        } else {
            s35Var = null;
        }
        this.p = s35Var;
        this.u = uk0.PENDING;
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
    /* JADX WARN: Type inference failed for: r13v2, types: [dh5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [dh5, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(yk0 yk0Var, s41 s41Var) {
        xk0 xk0Var;
        int i;
        dh5 dh5Var;
        dh5 dh5Var2;
        dh5 dh5Var3;
        dh5 dh5Var4;
        bf0 bf0Var;
        String str;
        String b;
        bf0 bf0Var2;
        String str2;
        rk0 a;
        LinkedHashMap linkedHashMap;
        yk0Var.getClass();
        try {
            if (s41Var instanceof xk0) {
                xk0Var = (xk0) s41Var;
                int i2 = xk0Var.d0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    xk0Var.d0 = i2 - Integer.MIN_VALUE;
                    Object obj = xk0Var.Y;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = xk0Var.d0;
                    if (i == 0) {
                        if (i == 1) {
                            dh5Var2 = xk0Var.X;
                            dh5Var = xk0Var.R;
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        ?? obj2 = new Object();
                        ?? obj3 = new Object();
                        synchronized (yk0Var.k) {
                            if (yk0Var.u != uk0.PENDING) {
                                return jg7.a;
                            }
                            obj2.A = yk0Var.y;
                            bf0 bf0Var3 = yk0Var.q;
                            obj3.A = bf0Var3;
                            if (obj2.A != null && bf0Var3 != null) {
                                yk0Var.u = uk0.CREATING;
                                yk0Var.w = true;
                                yk0Var.e.getClass();
                                yk0Var.o = new g67(SystemClock.elapsedRealtimeNanos());
                                s35 s35Var = yk0Var.p;
                                dh5Var4 = obj3;
                                dh5Var3 = obj2;
                                if (s35Var != null) {
                                    Log.d("CXCP", "Awaiting session lock");
                                    xk0Var.R = obj2;
                                    xk0Var.X = obj3;
                                    xk0Var.d0 = 1;
                                    if (s35Var.o(xk0Var) == x61Var) {
                                        return x61Var;
                                    }
                                    dh5Var = obj2;
                                    dh5Var2 = obj3;
                                }
                                StringBuilder sb = new StringBuilder("Creating CameraCaptureSession from ");
                                bf0Var = (bf0) dh5Var4.A;
                                if (bf0Var != null) {
                                    str = bf0Var.h();
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    b = "null";
                                } else {
                                    b = xf0.b(str);
                                }
                                sb.append((Object) b);
                                sb.append(" using ");
                                sb.append(yk0Var);
                                sb.append(" with ");
                                sb.append(dh5Var3.A);
                                Log.i("CXCP", sb.toString());
                                StringBuilder sb2 = new StringBuilder("CameraDevice-");
                                bf0Var2 = (bf0) dh5Var4.A;
                                if (bf0Var2 != null) {
                                    str2 = bf0Var2.h();
                                } else {
                                    str2 = null;
                                }
                                Trace.beginSection(i61.n(sb2, str2, "#createCaptureSession"));
                                sk0 sk0Var = yk0Var.b;
                                Object obj4 = dh5Var4.A;
                                obj4.getClass();
                                Object obj5 = dh5Var3.A;
                                obj5.getClass();
                                a = sk0Var.a((bf0) obj4, (Map) obj5, yk0Var);
                                Trace.endSection();
                                if (!(a instanceof qk0)) {
                                    Log.e("CXCP", "Failed to create capture session for " + yk0Var + '!');
                                    return jg7.a;
                                }
                                synchronized (yk0Var.k) {
                                    try {
                                        uk0 uk0Var = yk0Var.u;
                                        if (uk0Var != uk0.CLOSING && uk0Var != uk0.CLOSED) {
                                            if (uk0Var == uk0.CREATING) {
                                                yk0Var.u = uk0.CREATED;
                                                Map map = yk0Var.m;
                                                Object obj6 = dh5Var3.A;
                                                obj6.getClass();
                                                map.putAll((Map) obj6);
                                                yk0Var.n.putAll(((qk0) a).B);
                                                Map map2 = ((qk0) a).A;
                                                if (!map2.isEmpty()) {
                                                    Log.i("CXCP", "Created " + yk0Var + " with " + gt0.k1(((Map) dh5Var3.A).keySet()) + ". Waiting to finalize " + gt0.k1(map2.keySet()));
                                                    yk0Var.s = map2;
                                                    Map map3 = yk0Var.y;
                                                    if (map3 != null) {
                                                        linkedHashMap = new LinkedHashMap();
                                                        for (Map.Entry entry : map3.entrySet()) {
                                                            if (map2.containsKey(entry.getKey())) {
                                                                linkedHashMap.put(entry.getKey(), entry.getValue());
                                                            }
                                                        }
                                                    } else {
                                                        linkedHashMap = null;
                                                    }
                                                    if (linkedHashMap != null && linkedHashMap.size() == map2.size()) {
                                                        yk0Var.t = linkedHashMap;
                                                    }
                                                }
                                                yk0Var.j(null);
                                                return jg7.a;
                                            }
                                            throw new IllegalStateException(("Unexpected state: " + yk0Var.u).toString());
                                        }
                                        Log.i("CXCP", "Warning: " + yk0Var + " was " + yk0Var.u + " while configuration was in progress.");
                                        return jg7.a;
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                            return jg7.a;
                        }
                    }
                    dh5Var3 = dh5Var;
                    dh5Var4 = dh5Var2;
                    StringBuilder sb3 = new StringBuilder("Creating CameraCaptureSession from ");
                    bf0Var = (bf0) dh5Var4.A;
                    if (bf0Var != null) {
                    }
                    if (str == null) {
                    }
                    sb3.append((Object) b);
                    sb3.append(" using ");
                    sb3.append(yk0Var);
                    sb3.append(" with ");
                    sb3.append(dh5Var3.A);
                    Log.i("CXCP", sb3.toString());
                    StringBuilder sb22 = new StringBuilder("CameraDevice-");
                    bf0Var2 = (bf0) dh5Var4.A;
                    if (bf0Var2 != null) {
                    }
                    Trace.beginSection(i61.n(sb22, str2, "#createCaptureSession"));
                    sk0 sk0Var2 = yk0Var.b;
                    Object obj42 = dh5Var4.A;
                    obj42.getClass();
                    Object obj52 = dh5Var3.A;
                    obj52.getClass();
                    a = sk0Var2.a((bf0) obj42, (Map) obj52, yk0Var);
                    Trace.endSection();
                    if (!(a instanceof qk0)) {
                    }
                }
            }
            Trace.beginSection(i61.n(sb22, str2, "#createCaptureSession"));
            sk0 sk0Var22 = yk0Var.b;
            Object obj422 = dh5Var4.A;
            obj422.getClass();
            Object obj522 = dh5Var3.A;
            obj522.getClass();
            a = sk0Var22.a((bf0) obj422, (Map) obj522, yk0Var);
            Trace.endSection();
            if (!(a instanceof qk0)) {
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
        xk0Var = new xk0(yk0Var, s41Var);
        Object obj7 = xk0Var.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = xk0Var.d0;
        if (i == 0) {
        }
        dh5Var3 = dh5Var;
        dh5Var4 = dh5Var2;
        StringBuilder sb32 = new StringBuilder("Creating CameraCaptureSession from ");
        bf0Var = (bf0) dh5Var4.A;
        if (bf0Var != null) {
        }
        if (str == null) {
        }
        sb32.append((Object) b);
        sb32.append(" using ");
        sb32.append(yk0Var);
        sb32.append(" with ");
        sb32.append(dh5Var3.A);
        Log.i("CXCP", sb32.toString());
        StringBuilder sb222 = new StringBuilder("CameraDevice-");
        bf0Var2 = (bf0) dh5Var4.A;
        if (bf0Var2 != null) {
        }
    }

    @Override // defpackage.zc6
    public final void a() {
        if (this.l.a(Boolean.FALSE, Boolean.TRUE)) {
            Log.d("CXCP", this + " session finalizing");
            Trace.beginSection(this + "#onSessionFinalized");
            o();
            n(0L);
            Trace.endSection();
        }
    }

    @Override // defpackage.zc6
    public final void b() {
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

    @Override // defpackage.le0
    public final void c(me0 me0Var) {
        Log.d("CXCP", this + " Active");
    }

    @Override // defpackage.le0
    public final void d(me0 me0Var) {
        Log.d("CXCP", this + " Closed");
        Trace.beginSection(this + "#onClosed");
        o();
        this.x.countDown();
        s35 s35Var = this.p;
        if (s35Var != null) {
            s35Var.B();
        }
        Trace.endSection();
    }

    @Override // defpackage.le0
    public final void e(me0 me0Var) {
        Log.d("CXCP", this + " Ready");
    }

    @Override // defpackage.le0
    public final void f(me0 me0Var) {
        Log.d("CXCP", this + " CaptureQueueEmpty");
    }

    @Override // defpackage.le0
    public final void g(me0 me0Var) {
        Log.d("CXCP", this + " Configured");
        Trace.beginSection(this + "#configure");
        j(me0Var);
        this.x.countDown();
        s35 s35Var = this.p;
        if (s35Var != null) {
            s35Var.B();
        }
        Trace.endSection();
    }

    @Override // defpackage.le0
    public final void h(me0 me0Var) {
        Log.w("CXCP", this + " Configuration Failed");
        Trace.beginSection(this + "#onConfigureFailed");
        this.a.a(new kt2(9, false));
        o();
        this.x.countDown();
        s35 s35Var = this.p;
        if (s35Var != null) {
            s35Var.B();
        }
        Trace.endSection();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(me0 me0Var) {
        boolean z;
        synchronized (this.k) {
            try {
                tk0 tk0Var = this.r;
                if (tk0Var == null && me0Var != null) {
                    s9 s9Var = this.c;
                    Map map = this.m;
                    map.getClass();
                    Map map2 = this.n;
                    map2.getClass();
                    xc0 q = s9Var.q(me0Var, map, map2);
                    tk0 tk0Var2 = new tk0(me0Var, new dk0(q), q);
                    this.r = tk0Var2;
                    tk0Var = tk0Var2;
                }
                if (this.u == uk0.CREATED && tk0Var != null) {
                    if (this.s != null) {
                        if (this.t != null) {
                            z = true;
                            if (z) {
                                m(false);
                            }
                            synchronized (this.k) {
                                this.e.getClass();
                                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                                g67 g67Var = this.o;
                                g67Var.getClass();
                                long j = elapsedRealtimeNanos - g67Var.a;
                                Log.i("CXCP", "Configured " + this + " in " + String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(j / 1000000.0d)}, 1)));
                                this.a.b(tk0Var.b);
                            }
                            return;
                        }
                    }
                    z = false;
                    if (z) {
                    }
                    synchronized (this.k) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(Map map) {
        map.getClass();
        synchronized (this.k) {
            try {
                uk0 uk0Var = this.u;
                if (uk0Var != uk0.CLOSING && uk0Var != uk0.CLOSED) {
                    Map map2 = this.y;
                    if (map2 == null) {
                        map2 = zt1.A;
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
                            hv.L(this.i, null, null, new y3(this, (r41) null, 5), 3);
                        }
                    }
                    hv.L(this.i, null, null, new vk0(this, null, 1), 3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l() {
        synchronized (this.k) {
            try {
                uk0 uk0Var = this.u;
                uk0 uk0Var2 = uk0.CLOSING;
                if (uk0Var != uk0Var2 && uk0Var != uk0.CLOSED) {
                    this.u = uk0Var2;
                    tk0 tk0Var = this.r;
                    boolean z = false;
                    if (tk0Var != null) {
                        this.r = null;
                    } else {
                        if (this.f.d && this.w) {
                            z = true;
                        }
                        tk0Var = null;
                    }
                    s35 s35Var = this.p;
                    if (s35Var != null) {
                        s35Var.B();
                    }
                    if (z) {
                        Log.d("CXCP", "Waiting for CameraCaptureSession configuration");
                        if (((jg7) this.h.b(3000L, new zh0(this, null, 1))) == null) {
                            Log.e("CXCP", "Waiting for CameraCaptureSession configuration timed out");
                        }
                        synchronized (this.k) {
                            tk0Var = this.r;
                            this.r = null;
                        }
                    }
                    Trace.beginSection(this.a + "#onGraphStopping");
                    gt2 gt2Var = this.a;
                    Log.d("CXCP", gt2Var + " onGraphStopping");
                    gt2Var.d.l(nt2.b);
                    gt2Var.b.F(null);
                    for (qt2 qt2Var : gt2Var.c) {
                        qt2Var.a.b(qt2Var.a(), nt2.b);
                    }
                    Trace.endSection();
                    if (tk0Var != null) {
                        dk0 dk0Var = tk0Var.b;
                        Log.d("CXCP", this + " Shutdown");
                        Trace.beginSection(this + "#shutdown");
                        if (this.f.a && ((jg7) this.h.b(2000L, new en(this, dk0Var, null, 3))) == null) {
                            Log.e("CXCP", "Failed to abort captures in 2000ms");
                        }
                        Trace.beginSection(this + "#disconnect");
                        tk0Var.c.c();
                        Trace.endSection();
                        if (this.f.d && ((jg7) this.h.b(3000L, new en(this, tk0Var, null, 2))) == null) {
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
        tk0 tk0Var;
        Map map;
        LinkedHashMap linkedHashMap;
        boolean z2;
        synchronized (this.k) {
            tk0Var = this.r;
            map = this.s;
            linkedHashMap = this.t;
        }
        if (tk0Var != null && map != null && linkedHashMap != null) {
            Trace.beginSection(this + "#finalizeOutputConfigurations");
            this.e.getClass();
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            for (Map.Entry entry : map.entrySet()) {
                int i = ((kr6) entry.getKey()).a;
                xi xiVar = (xi) entry.getValue();
                Object obj = linkedHashMap.get(new kr6(i));
                if (obj != null) {
                    xiVar.a((Surface) obj);
                } else {
                    i.m("Required value was null.");
                    return;
                }
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Map.Entry entry2 : map.entrySet()) {
                linkedHashSet.add((xi) entry2.getValue());
            }
            tk0Var.a.V(gt0.k1(linkedHashSet));
            synchronized (this.k) {
                try {
                    if (this.u == uk0.CREATED) {
                        this.m.putAll(linkedHashMap);
                        Iterator it = linkedHashMap.entrySet().iterator();
                        while (true) {
                            z2 = true;
                            if (it.hasNext()) {
                                Map.Entry entry3 = (Map.Entry) it.next();
                                int i2 = ((kr6) entry3.getKey()).a;
                                Surface surface = (Surface) entry3.getValue();
                                ki0 e = this.g.e(i2);
                                if (e != null) {
                                    if (e.b.size() == 1) {
                                        Map map2 = this.n;
                                        map2.getClass();
                                        map2.put(new gp4(((ir6) gt0.b1(e.b)).a), surface);
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
                                    arrayList.add(new kr6(((kr6) entry4.getKey()).a));
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
                gt2 gt2Var = this.a;
                Log.d("CXCP", gt2Var + " onGraphModified");
                gt2Var.b.Z.H(ts2.b);
            }
            Trace.endSection();
        }
    }

    public final void n(long j) {
        List<AutoCloseable> k1;
        boolean isTerminated;
        if (j != 0) {
            hv.L(this.i, null, null, new wk0(j, this, (r41) null), 3);
            return;
        }
        Log.d("CXCP", "Finalizing " + this);
        synchronized (this.k) {
            k1 = gt0.k1(this.z.values());
            this.z.clear();
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

    public final void o() {
        long j;
        boolean z;
        int i;
        l();
        synchronized (this.k) {
            try {
                uk0 uk0Var = this.u;
                uk0 uk0Var2 = uk0.CLOSED;
                j = 0;
                if (uk0Var != uk0Var2) {
                    z = true;
                    if (this.q != null && this.w && (i = this.f.c) != 1) {
                        if (i == 2) {
                            j = 2000;
                        }
                    }
                    this.q = null;
                    this.u = uk0Var2;
                }
                z = false;
                this.q = null;
                this.u = uk0Var2;
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
        Set p1 = gt0.p1(map.values());
        Set p12 = gt0.p1(map2.values());
        Iterator it = ii2.F(p1, p12).iterator();
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
                        u34.t();
                        return;
                    }
                } else {
                    autoCloseable = null;
                    continue;
                }
            } else {
                for (Surface surface2 : ii2.F(p12, p1)) {
                    linkedHashMap.put(surface2, this.d.a(surface2));
                }
                return;
            }
        } while (autoCloseable != null);
        e41.g(surface, " doesn't have a matching surface token!", "Surface ");
    }

    public final String toString() {
        return "CaptureSessionState-" + this.j;
    }
}
