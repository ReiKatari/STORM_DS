package a0;

import android.content.Context;
import android.hardware.camera2.CameraCaptureSession;
import android.util.Log;
import android.view.ActionMode;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e2;
import androidx.fragment.app.j0;
import androidx.fragment.app.o;
import androidx.fragment.app.s1;
import androidx.fragment.app.x1;
import androidx.lifecycle.d0;
import androidx.lifecycle.g0;
import androidx.work.impl.WorkDatabase;
import d0.a0;
import g2.z1;
import gk.r0;
import j0.b0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import k7.w;
import m6.p;
import m6.q;
import me.magnum.melonds.common.camera.DSiCameraSource;
import p1.c1;
import p8.v;
import p8.x;
import q8.r;
import q8.z;
import x8.u;
import zc.a1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ i(r0.d dVar, a0 a0Var, b5.i iVar) {
        this.A = 10;
        Map map = Collections.EMPTY_MAP;
        this.B = dVar;
        this.L = a0Var;
        this.R = iVar;
    }

    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, q.q3] */
    @Override // java.lang.Runnable
    public final void run() {
        d0 l10;
        Object obj = null;
        int i2 = 0;
        boolean z10 = true;
        switch (this.A) {
            case 0:
                l lVar = (l) this.B;
                Log.d("RequestMonitor", "RequestListener " + ((k) this.L) + " done " + lVar);
                ((List) lVar.B).remove((ta.a) this.R);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                ViewGroup viewGroup = (ViewGroup) this.B;
                androidx.fragment.app.e eVar = (androidx.fragment.app.e) this.R;
                viewGroup.getClass();
                viewGroup.endViewTransition((View) this.L);
                eVar.f1263c.f1343a.c(eVar);
                return;
            case 2:
                j0 j0Var = ((e2) this.B).f1273c;
                j0 j0Var2 = ((e2) this.L).f1273c;
                boolean z11 = ((o) this.R).f1376o;
                x1 x1Var = s1.f1414a;
                j0Var.getClass();
                j0Var2.getClass();
                if (z11) {
                    j0Var2.getEnterTransitionCallback();
                    return;
                } else {
                    j0Var.getEnterTransitionCallback();
                    return;
                }
            case 3:
                gk.h hVar = (gk.h) this.L;
                r0 r0Var = (r0) this.R;
                gk.o oVar = (gk.o) ((g) this.B).L;
                if (oVar.B.m()) {
                    hVar.c(oVar, new IOException("Canceled"));
                    return;
                } else {
                    hVar.b(oVar, r0Var);
                    return;
                }
            case 4:
                ((gk.h) this.L).c((gk.o) ((g) this.B).L, (Throwable) this.R);
                return;
            case l1.c.f8511g /* 5 */:
                Throwable th2 = (Throwable) this.B;
                j0.a aVar = (j0.a) this.L;
                List list = (List) this.R;
                if (th2 != null) {
                    aVar.f7146b.C(th2);
                    return;
                } else {
                    aVar.f7146b.D(list);
                    return;
                }
            case l1.c.f8509e /* 6 */:
                ArrayList arrayList = (ArrayList) this.B;
                g0 g0Var = (g0) this.L;
                String str = (String) this.R;
                try {
                    int size = arrayList.size();
                    while (true) {
                        if (i2 < size) {
                            Object obj2 = arrayList.get(i2);
                            i2++;
                            if (nc.k.a(((b0) obj2).d(), str)) {
                                obj = obj2;
                            }
                        }
                    }
                    b0 b0Var = (b0) obj;
                    if (b0Var != null && (l10 = b0Var.l()) != null) {
                        l10.g(g0Var);
                        return;
                    }
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            case 7:
                d7.c cVar = (d7.c) this.B;
                w wVar = (w) this.L;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.R;
                try {
                    q r5 = k0.d.r(cVar.f3920a);
                    if (r5 != null) {
                        p pVar = (p) ((m6.h) r5.f7542b);
                        synchronized (pVar.f9296d) {
                            pVar.f9298f = threadPoolExecutor;
                        }
                        ((m6.h) r5.f7542b).b(new m6.k(wVar, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th3) {
                    wVar.x(th3);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 8:
                q8.d dVar = (q8.d) this.B;
                b5.l lVar2 = (b5.l) this.L;
                q8.b0 b0Var2 = (q8.b0) this.R;
                dVar.getClass();
                try {
                    z10 = ((Boolean) lVar2.B.get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused2) {
                }
                synchronized (dVar.f12351k) {
                    try {
                        x8.i k10 = p7.l.k(b0Var2.f12324a);
                        String str2 = k10.f14391a;
                        if (dVar.c(str2) == b0Var2) {
                            dVar.b(str2);
                        }
                        v.e().a(q8.d.f12340l, q8.d.class.getSimpleName() + " " + str2 + " executed; reschedule = " + z10);
                        ArrayList arrayList2 = dVar.f12350j;
                        int size2 = arrayList2.size();
                        while (i2 < size2) {
                            Object obj3 = arrayList2.get(i2);
                            i2++;
                            ((q8.a) obj3).b(k10, z10);
                        }
                    } finally {
                    }
                }
                return;
            case l1.c.f8508d /* 9 */:
                q8.j jVar = (q8.j) this.L;
                final q8.d dVar2 = (q8.d) ((p1.a0) this.B).B;
                dVar2.getClass();
                x8.i iVar = jVar.f12355a;
                final String str3 = iVar.f14391a;
                final ArrayList arrayList3 = new ArrayList();
                x8.p pVar2 = (x8.p) dVar2.f12345e.o(new a2.n(28, new Callable() { // from class: q8.c
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        WorkDatabase workDatabase = d.this.f12345e;
                        x8.w x9 = workDatabase.x();
                        x9.getClass();
                        String str4 = str3;
                        str4.getClass();
                        arrayList3.addAll((List) r.K(x9.f14448a, true, false, new z1(str4, 22)));
                        return workDatabase.w().d(str4);
                    }
                }));
                if (pVar2 == null) {
                    v.e().h(q8.d.f12340l, "Didn't find WorkSpec for id " + iVar);
                    dVar2.f12344d.f14972d.execute(new ad.c(20, dVar2, iVar));
                    return;
                }
                synchronized (dVar2.f12351k) {
                    try {
                        synchronized (dVar2.f12351k) {
                            if (dVar2.c(str3) != null) {
                                i2 = 1;
                            }
                        }
                        if (i2 != 0) {
                            Set set = (Set) dVar2.f12348h.get(str3);
                            if (((q8.j) set.iterator().next()).f12355a.f14392b == iVar.f14392b) {
                                set.add(jVar);
                                v.e().a(q8.d.f12340l, "Work " + iVar + " is already enqueued for processing");
                            } else {
                                dVar2.f12344d.f14972d.execute(new ad.c(20, dVar2, iVar));
                            }
                            return;
                        } else if (pVar2.f14438t != iVar.f14392b) {
                            dVar2.f12344d.f14972d.execute(new ad.c(20, dVar2, iVar));
                            return;
                        } else {
                            Context context = dVar2.f12342b;
                            p8.b bVar = dVar2.f12343c;
                            z8.a aVar2 = dVar2.f12344d;
                            WorkDatabase workDatabase = dVar2.f12345e;
                            context.getClass();
                            dVar2.getClass();
                            ?? obj4 = new Object();
                            obj4.f11995b = bVar;
                            obj4.f11996c = aVar2;
                            obj4.f11997d = dVar2;
                            obj4.f11998e = workDatabase;
                            obj4.f11999f = pVar2;
                            obj4.f12000g = arrayList3;
                            Context applicationContext = context.getApplicationContext();
                            applicationContext.getClass();
                            obj4.f11994a = applicationContext;
                            new x();
                            q8.b0 b0Var3 = new q8.b0(obj4);
                            zc.q qVar = b0Var3.f12327d.f14970b;
                            a1 b10 = zc.x.b();
                            qVar.getClass();
                            b5.l t5 = p7.k.t(pc.a.G(qVar, b10), new z(b0Var3, null, 1));
                            t5.B.a(new i(dVar2, t5, b0Var3, 8), dVar2.f12344d.f14972d);
                            dVar2.f12347g.put(str3, b0Var3);
                            HashSet hashSet = new HashSet();
                            hashSet.add(jVar);
                            dVar2.f12348h.put(str3, hashSet);
                            v.e().a(q8.d.f12340l, q8.d.class.getSimpleName() + ": processing " + iVar);
                            return;
                        }
                    } finally {
                    }
                }
            case l1.c.f8510f /* 10 */:
                r0.d dVar3 = (r0.d) this.B;
                a0 a0Var = (a0) this.L;
                Map map = Collections.EMPTY_MAP;
                b5.i iVar2 = (b5.i) this.R;
                try {
                    dVar3.f12565a.i(a0Var);
                    iVar2.b(null);
                    return;
                } catch (RuntimeException e6) {
                    iVar2.c(e6);
                    return;
                }
            case 11:
                Runnable runnable = (Runnable) this.L;
                Runnable runnable2 = (Runnable) this.R;
                if (((r0.d) this.B).f12574j) {
                    runnable.run();
                    return;
                } else {
                    runnable2.run();
                    return;
                }
            case 12:
                ((c1) this.B).a((r0.l) this.L, (Map.Entry) this.R);
                return;
            case 13:
                s0.e eVar2 = (s0.e) this.B;
                a0 a0Var2 = (a0) this.L;
                Map map2 = Collections.EMPTY_MAP;
                b5.i iVar3 = (b5.i) this.R;
                try {
                    eVar2.f12794a.i(a0Var2);
                    iVar3.b(null);
                    return;
                } catch (RuntimeException e10) {
                    iVar3.c(e10);
                    return;
                }
            case 14:
                Runnable runnable3 = (Runnable) this.L;
                Runnable runnable4 = (Runnable) this.R;
                if (((s0.e) this.B).f12799f) {
                    runnable3.run();
                    return;
                } else {
                    runnable4.run();
                    return;
                }
            case l1.c.f8512h /* 15 */:
                ((x.f) this.B).f14294a.onSurfacePrepared((CameraCaptureSession) this.L, (Surface) this.R);
                return;
            case 16:
                String str4 = (String) this.L;
                q8.p pVar3 = (q8.p) this.R;
                u w10 = ((WorkDatabase) this.B).w();
                w10.getClass();
                str4.getClass();
                for (String str5 : (List) r.K(w10.f14444a, true, false, new z1(str4, 14))) {
                    y8.g.a(pVar3, str5);
                }
                return;
            default:
                z1.f fVar = (z1.f) this.B;
                z1.e eVar3 = (z1.e) this.R;
                ActionMode startActionMode = fVar.f14867a.startActionMode(new z1.l((z1.d) this.L), 1);
                nc.k.a(fVar.f14874h, startActionMode);
                if (startActionMode == null) {
                    eVar3.close();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, int i2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
    }

    public /* synthetic */ i(s0.e eVar, a0 a0Var, b5.i iVar) {
        this.A = 13;
        Map map = Collections.EMPTY_MAP;
        this.B = eVar;
        this.L = a0Var;
        this.R = iVar;
    }
}
