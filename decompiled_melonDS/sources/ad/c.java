package ad;

import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.util.LongSparseArray;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import androidx.fragment.app.o0;
import androidx.lifecycle.g0;
import b5.l;
import bd.v;
import d0.d1;
import d0.i1;
import d0.k;
import d0.m1;
import d0.o;
import d0.r1;
import d0.w;
import d1.e2;
import h5.c0;
import j0.b0;
import j0.c1;
import j0.d0;
import j0.e0;
import j0.j0;
import j0.u0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import k7.a0;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
import me.magnum.melonds.ui.layouteditor.LayoutEditorView;
import r0.m;
import ve.n;
import w.j;
import x8.i;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ c(int i2, Object obj, Object obj2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
    }

    private final void a() {
        q8.d dVar = (q8.d) this.B;
        i iVar = (i) this.L;
        synchronized (dVar.f12351k) {
            try {
                ArrayList arrayList = dVar.f12350j;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((q8.a) obj).b(iVar, false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void b() {
        k kVar;
        final r0.d dVar = (r0.d) this.B;
        final r1 r1Var = (r1) this.L;
        dVar.f12573i++;
        e2 e2Var = dVar.f12565a;
        t0.i.d((AtomicBoolean) e2Var.L, true);
        t0.i.c((Thread) e2Var.X);
        final SurfaceTexture surfaceTexture = new SurfaceTexture(e2Var.B);
        surfaceTexture.setDefaultBufferSize(r1Var.f3446b.getWidth(), r1Var.f3446b.getHeight());
        final Surface surface = new Surface(surfaceTexture);
        l0.d dVar2 = dVar.f12567c;
        bi.h hVar = new bi.h(10, dVar, r1Var);
        synchronized (r1Var.f3445a) {
            r1Var.f3456l = hVar;
            r1Var.m = dVar2;
            kVar = r1Var.f3455k;
        }
        if (kVar != null) {
            dVar2.execute(new m1(hVar, kVar, 1));
        }
        r1Var.a(surface, dVar.f12567c, new z5.a() { // from class: r0.c
            @Override // z5.a
            public final void accept(Object obj) {
                d dVar3 = d.this;
                r1 r1Var2 = r1Var;
                SurfaceTexture surfaceTexture2 = surfaceTexture;
                Surface surface2 = surface;
                d0.j jVar = (d0.j) obj;
                synchronized (r1Var2.f3445a) {
                    r1Var2.f3456l = null;
                    r1Var2.m = null;
                }
                surfaceTexture2.setOnFrameAvailableListener(null);
                surfaceTexture2.release();
                surface2.release();
                dVar3.f12573i--;
                dVar3.d();
            }
        });
        surfaceTexture.setOnFrameAvailableListener(dVar, dVar.f12568d);
    }

    /* JADX WARN: Type inference failed for: r4v21, types: [b5.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, b5.n] */
    @Override // java.lang.Runnable
    public final void run() {
        a0 a0Var;
        int i2;
        Object obj;
        Object obj2 = null;
        switch (this.A) {
            case 0:
                ((zc.h) this.B).F((e) this.L, y.f14813a);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                o0 o0Var = (o0) this.B;
                o0Var.A.a(new d.d((d.a0) this.L, o0Var));
                return;
            case 2:
                ((c1) this.L).c((d0.c) this.B);
                return;
            case 3:
                w wVar = (w) this.B;
                b5.i iVar = (b5.i) this.L;
                j jVar = wVar.f3490g;
                b0.a aVar = jVar.f13975b;
                synchronized (aVar.f1732a) {
                    aVar.f1734c.clear();
                    aVar.f1735d.clear();
                    aVar.f1737f.clear();
                    aVar.f1736e.clear();
                    aVar.f1738g = 0;
                }
                jVar.f13983j.i();
                if (wVar.f3489f != null) {
                    Executor executor = wVar.f3487d;
                    if (executor instanceof o) {
                        o oVar = (o) executor;
                        synchronized (oVar.A) {
                            try {
                                if (!oVar.B.isShutdown()) {
                                    oVar.B.shutdown();
                                }
                            } finally {
                            }
                        }
                    }
                    wVar.f3489f.quit();
                }
                iVar.b(null);
                return;
            case 4:
                i1 i1Var = (i1) this.L;
                ((i1) this.B).o();
                if (i1Var != null) {
                    i1Var.o();
                    return;
                }
                return;
            case l1.c.f8511g /* 5 */:
                ((c1) this.L).c((d1) this.B);
                return;
            case l1.c.f8509e /* 6 */:
                r1 r1Var = (r1) this.L;
                ((m9.o) this.B).getClass();
                SurfaceTexture surfaceTexture = new SurfaceTexture(0);
                surfaceTexture.setDefaultBufferSize(r1Var.f3446b.getWidth(), r1Var.f3446b.getHeight());
                surfaceTexture.detachFromGLContext();
                Surface surface = new Surface(surfaceTexture);
                r1Var.a(surface, ij.a.D(), new m8.h(1, surface, surfaceTexture));
                return;
            case 7:
                d0.d.Q((d3.e) this.B, (LongSparseArray) this.L);
                return;
            case 8:
                c0 c0Var = (c0) this.B;
                View[] viewArr = (View[]) this.L;
                if (c0Var.f6112p != -1) {
                    for (View view : viewArr) {
                        view.setTag(c0Var.f6112p, Long.valueOf(System.nanoTime()));
                    }
                }
                if (c0Var.f6113q != -1) {
                    for (View view2 : viewArr) {
                        view2.setTag(c0Var.f6113q, null);
                    }
                    return;
                }
                return;
            case l1.c.f8508d /* 9 */:
                ((hd.e) this.B).g((hd.b) this.L, y.f14813a);
                return;
            case l1.c.f8510f /* 10 */:
                ((d0) this.B).k().l().g((g0) this.L);
                return;
            case 11:
                ((b0) this.B).l().d((e0) this.L);
                return;
            case 12:
                j0 j0Var = (j0) this.B;
                d0 d0Var = (d0) this.L;
                synchronized (j0Var.f7222a) {
                    try {
                        j0Var.f7224c.remove(d0Var);
                        if (j0Var.f7224c.isEmpty()) {
                            j0Var.f7226e.getClass();
                            j0Var.f7226e.b(null);
                            j0Var.f7226e = null;
                            j0Var.f7225d = null;
                        }
                    } finally {
                    }
                }
                return;
            case 13:
                u0 u0Var = (u0) this.B;
                String str = (String) this.L;
                try {
                    u0Var.f7299e.get();
                    u0Var.e(u0.f7294n.decrementAndGet(), u0.m.get(), "Surface terminated");
                    return;
                } catch (Exception e6) {
                    aj.g.s("DeferrableSurface", "Unexpected surface termination for " + u0Var + "\nStack Trace:\n" + str);
                    synchronized (u0Var.f7295a) {
                        throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", u0Var, Boolean.valueOf(u0Var.f7297c), Integer.valueOf(u0Var.f7296b)), e6);
                    }
                }
            case 14:
                k0.f fVar = (k0.f) this.B;
                androidx.lifecycle.d0 d0Var2 = (androidx.lifecycle.d0) this.L;
                k0.e eVar = new k0.e(new a2.c(25, fVar));
                if (d0Var2 != null) {
                    androidx.lifecycle.e0 e0Var = new androidx.lifecycle.e0(d0Var2, eVar);
                    s.f fVar2 = fVar.f7948l;
                    s.c a10 = fVar2.a(d0Var2);
                    if (a10 != null) {
                        obj2 = a10.B;
                    } else {
                        s.c cVar = new s.c(d0Var2, e0Var);
                        fVar2.R++;
                        s.c cVar2 = fVar2.B;
                        if (cVar2 == null) {
                            fVar2.A = cVar;
                            fVar2.B = cVar;
                        } else {
                            cVar2.L = cVar;
                            cVar.R = cVar2;
                            fVar2.B = cVar;
                        }
                    }
                    androidx.lifecycle.e0 e0Var2 = (androidx.lifecycle.e0) obj2;
                    if (e0Var2 != null && e0Var2.f1472b != eVar) {
                        a0.j.h("This source was already added with the different observer");
                        return;
                    } else if (e0Var2 == null && fVar.f1462c > 0) {
                        d0Var2.d(e0Var);
                        return;
                    } else {
                        return;
                    }
                }
                m9.o.i("source cannot be null");
                return;
            case l1.c.f8512h /* 15 */:
                r0.b bVar = (r0.b) this.B;
                CountDownLatch countDownLatch = (CountDownLatch) this.L;
                try {
                    bVar.run();
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            case 16:
                Runnable runnable = (Runnable) this.B;
                a0Var = (a0) this.L;
                try {
                    runnable.run();
                    return;
                } finally {
                }
            case 17:
                a0Var = (a0) this.B;
                try {
                    ((Runnable) this.L).run();
                    return;
                } finally {
                }
            case 18:
                ((m8.k) this.B).f9357c.accept((j8.i) this.L);
                return;
            case 19:
                ((p5.b) this.B).j((Typeface) this.L);
                return;
            case 20:
                a();
                return;
            case 21:
                r0.d dVar = (r0.d) this.B;
                m mVar = (m) this.L;
                Surface i10 = mVar.i(dVar.f12567c, new m8.h(2, dVar, mVar));
                dVar.f12565a.l(i10);
                dVar.f12572h.put(mVar, i10);
                return;
            case 22:
                b();
                return;
            case 23:
                ((z5.a) ((AtomicReference) this.L).get()).accept(new d0.i((m) this.B));
                return;
            case 24:
                ((p1.a0) ((b9.e) this.B).L).J((q8.j) this.L, 3);
                return;
            case 25:
                LayoutEditorActivity layoutEditorActivity = (LayoutEditorActivity) this.B;
                sh.a aVar2 = (sh.a) this.L;
                me.magnum.melonds.ui.layouteditor.b bVar2 = layoutEditorActivity.C0;
                if (bVar2 != null) {
                    LayoutEditorView layoutEditorView = bVar2.getLayoutEditorView();
                    n nVar = aVar2.f12919a;
                    int i11 = og.n.L;
                    layoutEditorView.e(nVar, sh.d.MAIN_SCREEN);
                    rh.c cVar3 = layoutEditorActivity.F0;
                    if (cVar3 != null) {
                        n nVar2 = aVar2.f12919a;
                        nVar2.getClass();
                        cVar3.A.getLayoutEditorView().e(nVar2, sh.d.SECONDARY_SCREEN);
                    }
                    d0.d.g0(layoutEditorActivity, aVar2.f12920b);
                    return;
                }
                nc.k.f("layoutEditorManager");
                throw null;
            case 26:
                final s0.e eVar2 = (s0.e) this.B;
                r1 r1Var2 = (r1) this.L;
                eVar2.f12798e++;
                s0.c cVar4 = eVar2.f12794a;
                boolean z10 = r1Var2.f3448d;
                Size size = r1Var2.f3446b;
                t0.i.d((AtomicBoolean) cVar4.L, true);
                t0.i.c((Thread) cVar4.X);
                if (z10) {
                    i2 = cVar4.f12787h0;
                } else {
                    i2 = cVar4.f12788i0;
                }
                final SurfaceTexture surfaceTexture2 = new SurfaceTexture(i2);
                surfaceTexture2.setDefaultBufferSize(size.getWidth(), size.getHeight());
                final Surface surface2 = new Surface(surfaceTexture2);
                r1Var2.a(surface2, eVar2.f12796c, new z5.a() { // from class: s0.d
                    @Override // z5.a
                    public final void accept(Object obj3) {
                        e eVar3;
                        d0.j jVar2 = (d0.j) obj3;
                        SurfaceTexture surfaceTexture3 = surfaceTexture2;
                        surfaceTexture3.setOnFrameAvailableListener(null);
                        surfaceTexture3.release();
                        surface2.release();
                        eVar3.f12798e--;
                        e.this.d();
                    }
                });
                if (z10) {
                    eVar2.f12802i = surfaceTexture2;
                    return;
                }
                eVar2.f12803j = surfaceTexture2;
                surfaceTexture2.setOnFrameAvailableListener(eVar2, eVar2.f12797d);
                return;
            case 27:
                s0.e eVar3 = (s0.e) this.B;
                m mVar2 = (m) this.L;
                Surface i12 = mVar2.i(eVar3.f12796c, new m8.h(3, eVar3, mVar2));
                eVar3.f12794a.l(i12);
                eVar3.f12801h.put(mVar2, i12);
                return;
            case 28:
                v8.e eVar4 = (v8.e) this.L;
                for (u8.a aVar3 : (List) this.B) {
                    Object obj3 = eVar4.f13766e;
                    u8.b bVar3 = aVar3.f13502a;
                    if (bVar3.e(obj3)) {
                        obj = new t8.b(bVar3.d());
                    } else {
                        obj = t8.a.f13135a;
                    }
                    v vVar = aVar3.f13503b;
                    vVar.getClass();
                    vVar.a(obj);
                }
                return;
            default:
                w.i iVar2 = (w.i) this.B;
                b5.i iVar3 = (b5.i) this.L;
                final long p10 = iVar2.p();
                final ?? obj4 = new Object();
                obj4.f2053c = new Object();
                l lVar = new l(obj4);
                obj4.f2052b = lVar;
                obj4.f2051a = w.d.class;
                try {
                    iVar2.h(new w.h() { // from class: w.e
                        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                        /* JADX WARN: Removed duplicated region for block: B:17:0x0039 A[RETURN] */
                        @Override // w.h
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final boolean b(android.hardware.camera2.TotalCaptureResult r5) {
                            /*
                                r4 = this;
                                android.hardware.camera2.CaptureRequest r0 = r5.getRequest()
                                if (r0 != 0) goto L7
                                goto L2e
                            L7:
                                android.hardware.camera2.CaptureRequest r5 = r5.getRequest()
                                java.lang.Object r5 = r5.getTag()
                                boolean r0 = r5 instanceof j0.h2
                                if (r0 == 0) goto L2e
                                j0.h2 r5 = (j0.h2) r5
                                java.lang.String r0 = "CameraControlSessionUpdateId"
                                android.util.ArrayMap r5 = r5.f7212a
                                java.lang.Object r5 = r5.get(r0)
                                java.lang.Long r5 = (java.lang.Long) r5
                                if (r5 != 0) goto L22
                                goto L2e
                            L22:
                                long r0 = r5.longValue()
                                long r2 = r1
                                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                                if (r5 < 0) goto L2e
                                r5 = 1
                                goto L2f
                            L2e:
                                r5 = 0
                            L2f:
                                if (r5 == 0) goto L39
                                r5 = 0
                                b5.i r0 = r3
                                r0.b(r5)
                                r5 = 1
                                return r5
                            L39:
                                r5 = 0
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: w.e.b(android.hardware.camera2.TotalCaptureResult):boolean");
                        }
                    });
                    obj4.f2051a = "waitForSessionUpdateId:" + p10;
                } catch (Exception e10) {
                    lVar.b(e10);
                }
                m0.i.e(lVar, iVar3);
                return;
        }
    }
}
