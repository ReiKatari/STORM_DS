package defpackage;

import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.view.Surface;
import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xc4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xc4 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ xc4(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                ((jy5) this.B).k((zc4) this.L, o27.a);
                return;
            case 1:
                hk6 hk6Var = (hk6) this.L;
                ((i) this.B).getClass();
                SurfaceTexture surfaceTexture = new SurfaceTexture(0);
                surfaceTexture.setDefaultBufferSize(hk6Var.b.getWidth(), hk6Var.b.getHeight());
                surfaceTexture.detachFromGLContext();
                Surface surface = new Surface(surfaceTexture);
                hk6Var.a(surface, iq2.l(), new ig0(0, surface, surfaceTexture));
                return;
            case 2:
                ku4 ku4Var = (ku4) this.B;
                gh7 gh7Var = (gh7) this.L;
                synchronized (ku4Var.k) {
                    try {
                        ArrayList arrayList = ku4Var.j;
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            ((k22) obj).d(gh7Var, false);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 3:
                ((io2) this.B).d0((Typeface) this.L);
                return;
            case 4:
                ((k66) this.B).c.accept((kg7) this.L);
                return;
            case 5:
                ((wz0) ((AtomicReference) this.L).get()).accept(new lx((ck6) this.B));
                return;
            case ig7.b /* 6 */:
                iq2.f((o31) ((n75) this.B).A, null);
                iq2.f((o31) ((n75) this.L).A, null);
                return;
            case 7:
                tm3 tm3Var = (tm3) this.B;
                CountDownLatch countDownLatch = (CountDownLatch) this.L;
                try {
                    tm3Var.run();
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            case 8:
                ((wv6) ((q9) this.B).L).l((td6) this.L, 3);
                return;
            case 9:
                Runnable runnable = (Runnable) this.B;
                k06 k06Var = (k06) this.L;
                try {
                    runnable.run();
                    return;
                } finally {
                    k06Var.a();
                }
            case 10:
                Runnable runnable2 = (Runnable) this.L;
                ThreadLocal threadLocal = ((n57) this.B).d;
                threadLocal.set(Boolean.TRUE);
                try {
                    runnable2.run();
                    return;
                } finally {
                    threadLocal.remove();
                }
            case 11:
                xb7 xb7Var = (xb7) this.B;
                View[] viewArr = (View[]) this.L;
                if (xb7Var.p != -1) {
                    for (View view : viewArr) {
                        view.setTag(xb7Var.p, Long.valueOf(System.nanoTime()));
                    }
                }
                if (xb7Var.q != -1) {
                    for (View view2 : viewArr) {
                        view2.setTag(xb7Var.q, null);
                    }
                    return;
                }
                return;
            default:
                aj7 aj7Var = (aj7) this.B;
                rm3 rm3Var = (rm3) this.L;
                if (!aj7Var.L) {
                    aj7Var.R = rm3Var;
                    rm3Var.a(aj7Var);
                    return;
                }
                return;
        }
    }
}
