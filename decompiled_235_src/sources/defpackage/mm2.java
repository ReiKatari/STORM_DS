package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mm2  reason: default package */
/* loaded from: classes.dex */
public final class mm2 implements AutoCloseable {
    public final tm2 A;
    public final Set B;
    public final sw L;

    public mm2(tm2 tm2Var) {
        kw3 kw3Var = tm2Var.e;
        ArrayList arrayList = new ArrayList(ht0.v0(kw3Var, 10));
        ListIterator listIterator = kw3Var.listIterator(0);
        while (true) {
            xx2 xx2Var = (xx2) listIterator;
            if (!xx2Var.hasNext()) {
                break;
            }
            arrayList.add(new kr6(((qm2) xx2Var.next()).c));
        }
        Set p1 = gt0.p1(arrayList);
        this.A = tm2Var;
        this.B = p1;
        ArrayList arrayList2 = new ArrayList(ht0.v0(kw3Var, 10));
        ListIterator listIterator2 = kw3Var.listIterator(0);
        while (true) {
            xx2 xx2Var2 = (xx2) listIterator2;
            if (xx2Var2.hasNext()) {
                arrayList2.add(new gp4(((qm2) xx2Var2.next()).d));
            } else {
                gt0.p1(arrayList2);
                this.L = g04.s(false);
                return;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        e();
    }

    public final boolean e() {
        boolean isTerminated;
        if (!this.L.a()) {
            return false;
        }
        tm2 tm2Var = this.A;
        pm2 pm2Var = tm2Var.d;
        kw3 kw3Var = tm2Var.e;
        uw uwVar = (uw) pm2Var.a;
        uwVar.getClass();
        if (uw.b.decrementAndGet(uwVar) == 0) {
            ((tu0) pm2Var.b).b0(new kp4(new mp4(2)));
        }
        int a = kw3Var.a();
        for (int i = 0; i < a; i++) {
            qm2 qm2Var = (qm2) kw3Var.get(i);
            if (this.B.contains(new kr6(qm2Var.c))) {
                uw uwVar2 = (uw) qm2Var.a;
                uwVar2.getClass();
                if (uw.b.decrementAndGet(uwVar2) == 0) {
                    ((tu0) qm2Var.b).b0(new kp4(new mp4(2)));
                    tu0 tu0Var = (tu0) qm2Var.b;
                    Object obj = null;
                    if (tu0Var.W() && !tu0Var.isCancelled()) {
                        Object obj2 = ((kp4) tu0Var.J()).a;
                        if (!(obj2 instanceof mp4) && obj2 != null) {
                            obj = obj2;
                        }
                    }
                    sf6 sf6Var = (sf6) obj;
                    if (sf6Var != null) {
                        if (sf6Var instanceof AutoCloseable) {
                            sf6Var.close();
                        } else if (sf6Var instanceof ExecutorService) {
                            ExecutorService executorService = (ExecutorService) sf6Var;
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
                        } else {
                            u34.t();
                        }
                    }
                }
            }
        }
        return true;
    }

    public final void finalize() {
        if (e()) {
            Log.e("CXCP", "Failed to close " + this + "! This indicates a memory leak and could cause the camera to stall, or images to be lost.");
        }
    }

    public final String toString() {
        return this.A.toString();
    }
}
