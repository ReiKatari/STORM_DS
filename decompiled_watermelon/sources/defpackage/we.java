package defpackage;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.b0;
import androidx.fragment.app.g;
import androidx.fragment.app.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import me.magnum.melonds.impl.emulator.EmulatorMessageQueue;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
import me.magnum.melonds.ui.layouteditor.LayoutEditorView;
import me.magnum.melonds.ui.layouteditor.b;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: we  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class we implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ we(dh2 dh2Var, View view, Rect rect) {
        this.A = 14;
        this.B = view;
        this.L = rect;
    }

    private final void a() {
        xg0 xg0Var = (xg0) this.B;
        i90 i90Var = (i90) this.L;
        zc0 zc0Var = xg0Var.g;
        if (!((AtomicBoolean) zc0Var.k).getAndSet(true)) {
            qc0 qc0Var = (qc0) zc0Var.g;
            qc0Var.getClass();
            qc0Var.f = false;
            synchronized (qc0Var.b) {
                qc0Var.c = null;
                qc0Var.e = 0;
                qc0Var.d.clear();
            }
            wn4 wn4Var = (wn4) zc0Var.h;
            wn4Var.getClass();
            Log.i("PipePresenceSrc", "Stopping camera ID flow collection.");
            if (wn4Var.h.compareAndSet(true, false)) {
                kd6 kd6Var = wn4Var.i;
                if (kd6Var != null) {
                    kd6Var.i(null);
                }
                wn4Var.i = null;
            }
            if (((il6) zc0Var.b).a()) {
                ke0 ke0Var = (ke0) ((il6) zc0Var.b).getValue();
                synchronized (ke0Var.c) {
                    if (!ke0Var.d) {
                        ((qe0) ke0Var.a.e.get()).b();
                        ke0Var.d = true;
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                }
            }
        }
        if (xg0Var.f != null) {
            Executor executor = xg0Var.d;
            if (executor instanceof xc0) {
                xc0 xc0Var = (xc0) executor;
                synchronized (xc0Var.A) {
                    try {
                        if (!xc0Var.B.isShutdown()) {
                            xc0Var.B.shutdown();
                        }
                    } finally {
                    }
                }
            }
            xg0Var.f.quit();
        }
        i90Var.a(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        nx nxVar;
        int i;
        int i2 = 0;
        switch (this.A) {
            case 0:
                b53.G((af) this.B, (LongSparseArray) this.L);
                return;
            case 1:
                ((qw2) this.L).b((qh) this.B);
                return;
            case 2:
                k06 k06Var = (k06) this.B;
                try {
                    ((Runnable) this.L).run();
                    return;
                } finally {
                    k06Var.a();
                }
            case 3:
                ((kg0) this.B).a.onCaptureSequenceAborted((CameraCaptureSession) this.L, -1);
                return;
            case 4:
                Set<pd0> set = (Set) this.L;
                tf0 tf0Var = ((we0) this.B).a;
                nk2.s();
                synchronized (tf0Var.A) {
                    try {
                        for (pd0 pd0Var : set) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : ((HashMap) tf0Var.Z).keySet()) {
                                if (((pd0) obj2).a.equals(pd0Var.a)) {
                                    arrayList.add(obj2);
                                }
                            }
                            int size = arrayList.size();
                            int i3 = 0;
                            while (i3 < size) {
                                Object obj3 = arrayList.get(i3);
                                i3++;
                                ((HashMap) tf0Var.Z).remove((pd0) obj3);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 5:
                ((vd0) this.B).l().q().e((l94) this.L);
                return;
            case ig7.b /* 6 */:
                ((td0) this.B).q().d((ve0) this.L);
                return;
            case 7:
                bf0 bf0Var = (bf0) this.B;
                vd0 vd0Var = (vd0) this.L;
                synchronized (bf0Var.a) {
                    try {
                        bf0Var.c.remove(vd0Var);
                        if (bf0Var.c.isEmpty()) {
                            bf0Var.e.getClass();
                            bf0Var.e.a(null);
                            bf0Var.e = null;
                            bf0Var.d = null;
                        }
                    } finally {
                    }
                }
                return;
            case 8:
                ((wz0) this.B).accept((qw) this.L);
                return;
            case 9:
                a();
                return;
            case 10:
                String uuid = ((UUID) this.L).toString();
                uuid.getClass();
                a53.o((kh7) this.B, uuid);
                return;
            case 11:
                ((ra5) this.B).N((sa5) this.L);
                return;
            case mj2.L /* 12 */:
                p pVar = (p) this.B;
                pVar.A.a(new qs0((kc4) this.L, pVar));
                return;
            case 13:
                vy0 vy0Var = (vy0) this.L;
                for (k00 k00Var : (List) this.B) {
                    Object obj4 = vy0Var.e;
                    l00 l00Var = k00Var.a;
                    if (l00Var.e(obj4)) {
                        obj = new rz0(l00Var.d());
                    } else {
                        obj = qz0.a;
                    }
                    nu4 nu4Var = k00Var.b;
                    nu4Var.getClass();
                    nu4Var.c(obj);
                }
                return;
            case 14:
                dh2.j((View) this.B, (Rect) this.L);
                return;
            case ig7.e /* 15 */:
                ViewGroup viewGroup = (ViewGroup) this.L;
                viewGroup.getClass();
                ArrayList arrayList2 = ((g) this.B).c;
                int size2 = arrayList2.size();
                while (i2 < size2) {
                    Object obj5 = arrayList2.get(i2);
                    i2++;
                    b0 b0Var = ((pb1) obj5).a;
                    View view = b0Var.c.getView();
                    if (view != null) {
                        b0Var.a.applyState(view, viewGroup);
                    }
                }
                return;
            case 16:
                sb1 sb1Var = (sb1) this.B;
                ck6 ck6Var = (ck6) this.L;
                Surface i4 = ck6Var.i(sb1Var.c, new ig0(1, sb1Var, ck6Var));
                sb1Var.a.n(i4);
                sb1Var.h.put(ck6Var, i4);
                return;
            case 17:
                final sb1 sb1Var2 = (sb1) this.B;
                final hk6 hk6Var = (hk6) this.L;
                sb1Var2.i++;
                pd4 pd4Var = sb1Var2.a;
                xj2.d((AtomicBoolean) pd4Var.L, true);
                xj2.c((Thread) pd4Var.X);
                final SurfaceTexture surfaceTexture = new SurfaceTexture(pd4Var.A);
                surfaceTexture.setDefaultBufferSize(hk6Var.b.getWidth(), hk6Var.b.getHeight());
                final Surface surface = new Surface(surfaceTexture);
                np2 np2Var = sb1Var2.c;
                hi0 hi0Var = new hi0(1, sb1Var2, hk6Var);
                synchronized (hk6Var.a) {
                    hk6Var.l = hi0Var;
                    hk6Var.m = np2Var;
                    nxVar = hk6Var.k;
                }
                if (nxVar != null) {
                    np2Var.execute(new ek6(hi0Var, nxVar, 1));
                }
                hk6Var.a(surface, sb1Var2.c, new wz0() { // from class: rb1
                    @Override // defpackage.wz0
                    public final void accept(Object obj6) {
                        sb1 sb1Var3 = sb1.this;
                        hk6 hk6Var2 = hk6Var;
                        SurfaceTexture surfaceTexture2 = surfaceTexture;
                        Surface surface2 = surface;
                        mx mxVar = (mx) obj6;
                        synchronized (hk6Var2.a) {
                            hk6Var2.l = null;
                            hk6Var2.m = null;
                        }
                        surfaceTexture2.setOnFrameAvailableListener(null);
                        surfaceTexture2.release();
                        surface2.release();
                        sb1Var3.i--;
                        sb1Var3.d();
                    }
                });
                surfaceTexture.setOnFrameAvailableListener(sb1Var2, sb1Var2.d);
                return;
            case 18:
                hc1 hc1Var = (hc1) this.B;
                String str = (String) this.L;
                try {
                    hc1Var.e.get();
                    hc1Var.e(hc1.m.decrementAndGet(), hc1.l.get(), "Surface terminated");
                    return;
                } catch (Exception e) {
                    ve2.w("DeferrableSurface", "Unexpected surface termination for " + hc1Var + "\nStack Trace:\n" + str);
                    synchronized (hc1Var.a) {
                        throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", hc1Var, Boolean.valueOf(hc1Var.c), Integer.valueOf(hc1Var.b)), e);
                    }
                }
            case 19:
                final fm1 fm1Var = (fm1) this.B;
                hk6 hk6Var2 = (hk6) this.L;
                fm1Var.e++;
                bm1 bm1Var = fm1Var.a;
                boolean z = hk6Var2.d;
                Size size3 = hk6Var2.b;
                xj2.d((AtomicBoolean) bm1Var.L, true);
                xj2.c((Thread) bm1Var.X);
                if (z) {
                    i = bm1Var.i0;
                } else {
                    i = bm1Var.j0;
                }
                final SurfaceTexture surfaceTexture2 = new SurfaceTexture(i);
                surfaceTexture2.setDefaultBufferSize(size3.getWidth(), size3.getHeight());
                final Surface surface2 = new Surface(surfaceTexture2);
                hk6Var2.a(surface2, fm1Var.c, new wz0() { // from class: em1
                    @Override // defpackage.wz0
                    public final void accept(Object obj6) {
                        fm1 fm1Var2;
                        mx mxVar = (mx) obj6;
                        SurfaceTexture surfaceTexture3 = surfaceTexture2;
                        surfaceTexture3.setOnFrameAvailableListener(null);
                        surfaceTexture3.release();
                        surface2.release();
                        fm1Var2.e--;
                        fm1.this.d();
                    }
                });
                if (z) {
                    fm1Var.i = surfaceTexture2;
                    return;
                }
                fm1Var.j = surfaceTexture2;
                surfaceTexture2.setOnFrameAvailableListener(fm1Var, fm1Var.d);
                return;
            case 20:
                fm1 fm1Var2 = (fm1) this.B;
                ck6 ck6Var2 = (ck6) this.L;
                Surface i5 = ck6Var2.i(fm1Var2.c, new ig0(2, fm1Var2, ck6Var2));
                fm1Var2.a.n(i5);
                fm1Var2.h.put(ck6Var2, i5);
                return;
            case 21:
                EmulatorActivity emulatorActivity = (EmulatorActivity) this.B;
                int i6 = EmulatorActivity.P1;
                emulatorActivity.K((cm1) this.L);
                emulatorActivity.Q0();
                k42 k42Var = emulatorActivity.J0;
                if (k42Var != null) {
                    k42Var.b();
                    return;
                }
                return;
            case 22:
                EmulatorMessageQueue emulatorMessageQueue = (EmulatorMessageQueue) this.B;
                CountDownLatch countDownLatch = (CountDownLatch) this.L;
                try {
                    emulatorMessageQueue.e();
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            case 23:
                ((ih0) this.B).H((ip2) this.L, o27.a);
                return;
            case 24:
                e55 e55Var = (e55) this.L;
                ((e55) this.B).j();
                if (e55Var != null) {
                    e55Var.j();
                    return;
                }
                return;
            case 25:
                LayoutEditorActivity layoutEditorActivity = (LayoutEditorActivity) this.B;
                m41 m41Var = (m41) this.L;
                b bVar = layoutEditorActivity.E0;
                if (bVar != null) {
                    LayoutEditorView layoutEditorView = bVar.getLayoutEditorView();
                    k17 k17Var = m41Var.a;
                    int i7 = wg3.L;
                    layoutEditorView.e(k17Var, ug3.MAIN_SCREEN);
                    h42 h42Var = layoutEditorActivity.H0;
                    if (h42Var != null) {
                        k17 k17Var2 = m41Var.a;
                        k17Var2.getClass();
                        h42Var.A.getLayoutEditorView().e(k17Var2, ug3.SECONDARY_SCREEN);
                    }
                    f34.R(layoutEditorActivity, m41Var.b);
                    return;
                }
                b53.g0("layoutEditorManager");
                throw null;
            case 26:
                vc3 vc3Var = (vc3) this.L;
                LayoutEditorView layoutEditorView2 = ((b) this.B).L.v;
                vc3Var.getClass();
                hd3 hd3Var = layoutEditorView2.getViews().get(vc3Var);
                if (hd3Var != null) {
                    layoutEditorView2.u(hd3Var);
                    hd3Var.a.setAlpha(1.0f);
                    hd3Var.c(true);
                    return;
                }
                return;
            case 27:
                qb5 qb5Var = (qb5) this.B;
                me1 me1Var = (me1) this.L;
                HashSet hashSet = new HashSet();
                if (qb5Var != null) {
                    hashSet.addAll(qb5Var.b);
                }
                ((zh0) me1Var.h).getClass();
                return;
            case 28:
                ((qw2) this.L).b((vx3) this.B);
                return;
            default:
                ((Surface) this.B).release();
                ((SurfaceTexture) this.L).release();
                return;
        }
    }

    public /* synthetic */ we(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }
}
