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
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mf  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mf implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ mf(dm2 dm2Var, View view, Rect rect) {
        this.A = 14;
        this.B = view;
        this.L = rect;
    }

    private final void a() {
        gj0 gj0Var = (gj0) this.B;
        qb0 qb0Var = (qb0) this.L;
        if0 if0Var = gj0Var.g;
        if (!((AtomicBoolean) if0Var.k).getAndSet(true)) {
            ze0 ze0Var = (ze0) if0Var.g;
            ze0Var.getClass();
            ze0Var.f = false;
            synchronized (ze0Var.b) {
                ze0Var.c = null;
                ze0Var.e = 0;
                ze0Var.d.clear();
            }
            bx4 bx4Var = (bx4) if0Var.h;
            bx4Var.getClass();
            Log.i("PipePresenceSrc", "Stopping camera ID flow collection.");
            if (bx4Var.h.compareAndSet(true, false)) {
                ap6 ap6Var = bx4Var.i;
                if (ap6Var != null) {
                    ap6Var.h(null);
                }
                bx4Var.i = null;
            }
            if (((ex6) if0Var.b).a()) {
                tg0 tg0Var = (tg0) ((ex6) if0Var.b).getValue();
                synchronized (tg0Var.c) {
                    if (!tg0Var.d) {
                        ((zg0) ((m55) tg0Var.a.e).get()).b();
                        tg0Var.d = true;
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                }
            }
        }
        if (gj0Var.f != null) {
            Executor executor = gj0Var.d;
            if (executor instanceof gf0) {
                gf0 gf0Var = (gf0) executor;
                synchronized (gf0Var.A) {
                    try {
                        if (!gf0Var.B.isShutdown()) {
                            gf0Var.B.shutdown();
                        }
                    } finally {
                    }
                }
            }
            gj0Var.f.quit();
        }
        qb0Var.a(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        cz czVar;
        int i;
        int i2 = 0;
        switch (this.A) {
            case 0:
                ge7.x((qf) this.B, (LongSparseArray) this.L);
                return;
            case 1:
                ((u23) this.L).b((ci) this.B);
                return;
            case 2:
                zb6 zb6Var = (zb6) this.B;
                try {
                    ((Runnable) this.L).run();
                    return;
                } finally {
                    zb6Var.a();
                }
            case 3:
                ((ti0) this.B).a.onCaptureSequenceAborted((CameraCaptureSession) this.L, -1);
                return;
            case 4:
                Set<yf0> set = (Set) this.L;
                ci0 ci0Var = ((fh0) this.B).a;
                nj2.h();
                synchronized (ci0Var.a) {
                    try {
                        for (yf0 yf0Var : set) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : ((HashMap) ci0Var.g).keySet()) {
                                if (((yf0) obj2).a.equals(yf0Var.a)) {
                                    arrayList.add(obj2);
                                }
                            }
                            int size = arrayList.size();
                            int i3 = 0;
                            while (i3 < size) {
                                Object obj3 = arrayList.get(i3);
                                i3++;
                                ((HashMap) ci0Var.g).remove((yf0) obj3);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 5:
                ((eg0) this.B).q().l().e((fi4) this.L);
                return;
            case 6:
                ((cg0) this.B).l().d((eh0) this.L);
                return;
            case 7:
                kh0 kh0Var = (kh0) this.B;
                eg0 eg0Var = (eg0) this.L;
                synchronized (kh0Var.a) {
                    try {
                        kh0Var.c.remove(eg0Var);
                        if (kh0Var.c.isEmpty()) {
                            kh0Var.e.getClass();
                            kh0Var.e.a(null);
                            kh0Var.e = null;
                            kh0Var.d = null;
                        }
                    } finally {
                    }
                }
                return;
            case 8:
                ((b31) this.B).accept((sx) this.L);
                return;
            case 9:
                a();
                return;
            case 10:
                String uuid = ((UUID) this.L).toString();
                uuid.getClass();
                lb4.o((lw7) this.B, uuid);
                return;
            case 11:
                ((jk5) this.B).N((kk5) this.L);
                return;
            case 12:
                mv0 mv0Var = (mv0) this.B;
                mv0Var.A.a(new ev0((il4) this.L, mv0Var));
                return;
            case 13:
                a21 a21Var = (a21) this.L;
                for (b20 b20Var : (List) this.B) {
                    Object obj4 = a21Var.e;
                    c20 c20Var = b20Var.a;
                    if (c20Var.e(obj4)) {
                        obj = new w21(c20Var.d());
                    } else {
                        obj = v21.a;
                    }
                    r35 r35Var = b20Var.b;
                    r35Var.getClass();
                    r35Var.c(obj);
                }
                return;
            case 14:
                dm2.j((View) this.B, (Rect) this.L);
                return;
            case 15:
                ViewGroup viewGroup = (ViewGroup) this.L;
                viewGroup.getClass();
                ArrayList arrayList2 = ((g) this.B).c;
                int size2 = arrayList2.size();
                while (i2 < size2) {
                    Object obj5 = arrayList2.get(i2);
                    i2++;
                    b0 b0Var = ((nf1) obj5).a;
                    View view = b0Var.c.getView();
                    if (view != null) {
                        b0Var.a.applyState(view, viewGroup);
                    }
                }
                return;
            case 16:
                qf1 qf1Var = (qf1) this.B;
                wv6 wv6Var = (wv6) this.L;
                Surface h = wv6Var.h(qf1Var.c, new ri0(1, qf1Var, wv6Var));
                qf1Var.a.m(h);
                qf1Var.h.put(wv6Var, h);
                return;
            case 17:
                final qf1 qf1Var2 = (qf1) this.B;
                final bw6 bw6Var = (bw6) this.L;
                qf1Var2.i++;
                qm4 qm4Var = qf1Var2.a;
                bp2.d((AtomicBoolean) qm4Var.L, true);
                bp2.c((Thread) qm4Var.X);
                final SurfaceTexture surfaceTexture = new SurfaceTexture(qm4Var.A);
                surfaceTexture.setDefaultBufferSize(bw6Var.b.getWidth(), bw6Var.b.getHeight());
                final Surface surface = new Surface(surfaceTexture);
                ov2 ov2Var = qf1Var2.c;
                pk0 pk0Var = new pk0(1, qf1Var2, bw6Var);
                synchronized (bw6Var.a) {
                    bw6Var.l = pk0Var;
                    bw6Var.m = ov2Var;
                    czVar = bw6Var.k;
                }
                if (czVar != null) {
                    ov2Var.execute(new yv6(pk0Var, czVar, 1));
                }
                bw6Var.a(surface, qf1Var2.c, new b31() { // from class: pf1
                    @Override // defpackage.b31
                    public final void accept(Object obj6) {
                        qf1 qf1Var3 = qf1.this;
                        bw6 bw6Var2 = bw6Var;
                        SurfaceTexture surfaceTexture2 = surfaceTexture;
                        Surface surface2 = surface;
                        bz bzVar = (bz) obj6;
                        synchronized (bw6Var2.a) {
                            bw6Var2.l = null;
                            bw6Var2.m = null;
                        }
                        surfaceTexture2.setOnFrameAvailableListener(null);
                        surfaceTexture2.release();
                        surface2.release();
                        qf1Var3.i--;
                        qf1Var3.c();
                    }
                });
                surfaceTexture.setOnFrameAvailableListener(qf1Var2, qf1Var2.d);
                return;
            case 18:
                ig1 ig1Var = (ig1) this.B;
                String str = (String) this.L;
                try {
                    ig1Var.e.get();
                    ig1Var.e(ig1.m.decrementAndGet(), ig1.l.get(), "Surface terminated");
                    return;
                } catch (Exception e) {
                    kj2.v("DeferrableSurface", "Unexpected surface termination for " + ig1Var + "\nStack Trace:\n" + str);
                    synchronized (ig1Var.a) {
                        throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", ig1Var, Boolean.valueOf(ig1Var.c), Integer.valueOf(ig1Var.b)), e);
                    }
                }
            case 19:
                final mq1 mq1Var = (mq1) this.B;
                bw6 bw6Var2 = (bw6) this.L;
                mq1Var.e++;
                iq1 iq1Var = mq1Var.a;
                boolean z = bw6Var2.d;
                Size size3 = bw6Var2.b;
                bp2.d((AtomicBoolean) iq1Var.L, true);
                bp2.c((Thread) iq1Var.X);
                if (z) {
                    i = iq1Var.j0;
                } else {
                    i = iq1Var.k0;
                }
                final SurfaceTexture surfaceTexture2 = new SurfaceTexture(i);
                surfaceTexture2.setDefaultBufferSize(size3.getWidth(), size3.getHeight());
                final Surface surface2 = new Surface(surfaceTexture2);
                bw6Var2.a(surface2, mq1Var.c, new b31() { // from class: lq1
                    @Override // defpackage.b31
                    public final void accept(Object obj6) {
                        mq1 mq1Var2;
                        bz bzVar = (bz) obj6;
                        SurfaceTexture surfaceTexture3 = surfaceTexture2;
                        surfaceTexture3.setOnFrameAvailableListener(null);
                        surfaceTexture3.release();
                        surface2.release();
                        mq1Var2.e--;
                        mq1.this.c();
                    }
                });
                if (z) {
                    mq1Var.i = surfaceTexture2;
                    return;
                }
                mq1Var.j = surfaceTexture2;
                surfaceTexture2.setOnFrameAvailableListener(mq1Var, mq1Var.d);
                return;
            case 20:
                mq1 mq1Var2 = (mq1) this.B;
                wv6 wv6Var2 = (wv6) this.L;
                Surface h2 = wv6Var2.h(mq1Var2.c, new ri0(2, mq1Var2, wv6Var2));
                mq1Var2.a.m(h2);
                mq1Var2.h.put(wv6Var2, h2);
                return;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                EmulatorActivity emulatorActivity = (EmulatorActivity) this.B;
                int i4 = EmulatorActivity.Z1;
                emulatorActivity.K((jq1) this.L);
                emulatorActivity.U0();
                c92 c92Var = emulatorActivity.K0;
                if (c92Var != null) {
                    c92Var.b();
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
            case ConnectionResult.API_DISABLED /* 23 */:
                ((rj0) this.B).I((jv2) this.L, jg7.a);
                return;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                re5 re5Var = (re5) this.L;
                ((re5) this.B).i();
                if (re5Var != null) {
                    re5Var.i();
                    return;
                }
                return;
            case 25:
                LayoutEditorActivity layoutEditorActivity = (LayoutEditorActivity) this.B;
                w71 w71Var = (w71) this.L;
                b bVar = layoutEditorActivity.F0;
                if (bVar != null) {
                    LayoutEditorView layoutEditorView = bVar.getLayoutEditorView();
                    ff7 ff7Var = w71Var.a;
                    int i5 = un3.L;
                    layoutEditorView.e(ff7Var, sn3.MAIN_SCREEN);
                    z82 z82Var = layoutEditorActivity.I0;
                    if (z82Var != null) {
                        ff7 ff7Var2 = w71Var.a;
                        ff7Var2.getClass();
                        z82Var.A.getLayoutEditorView().e(ff7Var2, sn3.SECONDARY_SCREEN);
                    }
                    vy7.r0(layoutEditorActivity, w71Var.b);
                    return;
                }
                nb3.a0("layoutEditorManager");
                throw null;
            case SubAllocator.N4 /* 26 */:
                nj3 nj3Var = (nj3) this.L;
                LayoutEditorView layoutEditorView2 = (LayoutEditorView) ((b) this.B).L.A;
                nj3Var.getClass();
                zj3 zj3Var = layoutEditorView2.getViews().get(nj3Var);
                if (zj3Var != null) {
                    layoutEditorView2.v(zj3Var);
                    zj3Var.a.setAlpha(1.0f);
                    zj3Var.c(true);
                    return;
                }
                return;
            case 27:
                il5 il5Var = (il5) this.B;
                qi1 qi1Var = (qi1) this.L;
                HashSet hashSet = new HashSet();
                if (il5Var != null) {
                    hashSet.addAll(il5Var.b);
                }
                ((hk0) qi1Var.h).getClass();
                return;
            case 28:
                ((u23) this.L).b((o54) this.B);
                return;
            default:
                ((Surface) this.B).release();
                ((SurfaceTexture) this.L).release();
                return;
        }
    }

    public /* synthetic */ mf(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }
}
