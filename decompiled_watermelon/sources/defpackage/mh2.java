package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mh2  reason: default package */
/* loaded from: classes.dex */
public final class mh2 implements AutoCloseable {
    public final th2 A;
    public final Set B;
    public final aw L;

    public mh2(th2 th2Var) {
        ip3 ip3Var = th2Var.e;
        ArrayList arrayList = new ArrayList(uq0.y0(ip3Var, 10));
        ListIterator listIterator = ip3Var.listIterator(0);
        while (true) {
            wr2 wr2Var = (wr2) listIterator;
            if (!wr2Var.hasNext()) {
                break;
            }
            arrayList.add(new uf6(((qh2) wr2Var.next()).c));
        }
        Set s1 = tq0.s1(arrayList);
        this.A = th2Var;
        this.B = s1;
        ArrayList arrayList2 = new ArrayList(uq0.y0(ip3Var, 10));
        ListIterator listIterator2 = ip3Var.listIterator(0);
        while (true) {
            wr2 wr2Var2 = (wr2) listIterator2;
            if (wr2Var2.hasNext()) {
                arrayList2.add(new dg4(((qh2) wr2Var2.next()).d));
            } else {
                tq0.s1(arrayList2);
                this.L = w81.e(false);
                return;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        d();
    }

    public final boolean d() {
        boolean isTerminated;
        if (!this.L.a()) {
            return false;
        }
        th2 th2Var = this.A;
        ph2 ph2Var = th2Var.d;
        ip3 ip3Var = th2Var.e;
        cw cwVar = (cw) ph2Var.a;
        cwVar.getClass();
        if (cw.b.decrementAndGet(cwVar) == 0) {
            ((gs0) ph2Var.b).c0(new hg4(new jg4(2)));
        }
        int b = ip3Var.b();
        for (int i = 0; i < b; i++) {
            qh2 qh2Var = (qh2) ip3Var.get(i);
            if (this.B.contains(new uf6(qh2Var.c))) {
                cw cwVar2 = (cw) qh2Var.a;
                cwVar2.getClass();
                if (cw.b.decrementAndGet(cwVar2) == 0) {
                    ((gs0) qh2Var.b).c0(new hg4(new jg4(2)));
                    gs0 gs0Var = (gs0) qh2Var.b;
                    Object obj = null;
                    if (gs0Var.a0() && !gs0Var.isCancelled()) {
                        Object obj2 = ((hg4) gs0Var.H()).a;
                        if (!(obj2 instanceof jg4) && obj2 != null) {
                            obj = obj2;
                        }
                    }
                    g46 g46Var = (g46) obj;
                    if (g46Var != null) {
                        if (g46Var instanceof AutoCloseable) {
                            g46Var.close();
                        } else if (g46Var instanceof ExecutorService) {
                            ExecutorService executorService = (ExecutorService) g46Var;
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
                            c44.r();
                        }
                    }
                }
            }
        }
        return true;
    }

    public final void finalize() {
        if (d()) {
            Log.e("CXCP", "Failed to close " + this + "! This indicates a memory leak and could cause the camera to stall, or images to be lost.");
        }
    }

    public final String toString() {
        return this.A.toString();
    }
}
