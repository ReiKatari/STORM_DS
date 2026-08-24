package defpackage;

import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.view.Surface;
import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q64  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class q64 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ q64(int i, Object obj, Object obj2) {
        this.A = i;
        this.L = obj;
        this.B = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                s64 s64Var = (s64) this.L;
                s64Var.n0.add((b63) this.B);
                s64Var.invalidate();
                return;
            case 1:
                u64 u64Var = (u64) this.L;
                u64Var.m0.add((b63) this.B);
                u64Var.invalidate();
                return;
            case 2:
                ((v96) this.L).k((xl4) this.B, jg7.a);
                return;
            case 3:
                bw6 bw6Var = (bw6) this.B;
                ((i) this.L).getClass();
                SurfaceTexture surfaceTexture = new SurfaceTexture(0);
                surfaceTexture.setDefaultBufferSize(bw6Var.b.getWidth(), bw6Var.b.getHeight());
                surfaceTexture.detachFromGLContext();
                Surface surface = new Surface(surfaceTexture);
                bw6Var.a(surface, u24.j(), new ri0(0, surface, surfaceTexture));
                return;
            case 4:
                o35 o35Var = (o35) this.L;
                gw7 gw7Var = (gw7) this.B;
                synchronized (o35Var.k) {
                    try {
                        ArrayList arrayList = o35Var.j;
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            ((b72) obj).b(gw7Var, false);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 5:
                ((gi2) this.L).L((Typeface) this.B);
                return;
            case 6:
                ((yh6) this.L).c.accept((kv7) this.B);
                return;
            case 7:
                ((b31) ((AtomicReference) this.B).get()).accept(new az((wv6) this.L));
                return;
            case 8:
                g04.x((w61) ((dh5) this.L).A, null);
                g04.x((w61) ((dh5) this.B).A, null);
                return;
            case 9:
                rk3 rk3Var = (rk3) this.L;
                CountDownLatch countDownLatch = (CountDownLatch) this.B;
                try {
                    rk3Var.run();
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            case 10:
                ((rr6) ((eb) this.L).L).q((jp6) this.B, 3);
                return;
            case 11:
                Runnable runnable = (Runnable) this.L;
                zb6 zb6Var = (zb6) this.B;
                try {
                    runnable.run();
                    return;
                } finally {
                    zb6Var.a();
                }
            case 12:
                Runnable runnable2 = (Runnable) this.B;
                ThreadLocal threadLocal = ((kj7) this.L).d;
                threadLocal.set(Boolean.TRUE);
                try {
                    runnable2.run();
                    return;
                } finally {
                    threadLocal.remove();
                }
            case 13:
                yp7 yp7Var = (yp7) this.L;
                View[] viewArr = (View[]) this.B;
                if (yp7Var.p != -1) {
                    for (View view : viewArr) {
                        view.setTag(yp7Var.p, Long.valueOf(System.nanoTime()));
                    }
                }
                if (yp7Var.q != -1) {
                    for (View view2 : viewArr) {
                        view2.setTag(yp7Var.q, null);
                    }
                    return;
                }
                return;
            default:
                xx7 xx7Var = (xx7) this.L;
                ut3 ut3Var = (ut3) this.B;
                if (!xx7Var.L) {
                    xx7Var.R = ut3Var;
                    ut3Var.a(xx7Var);
                    return;
                }
                return;
        }
    }
}
