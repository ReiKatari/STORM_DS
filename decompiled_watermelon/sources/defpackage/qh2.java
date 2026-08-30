package defpackage;

import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qh2  reason: default package */
/* loaded from: classes.dex */
public final class qh2 extends b2 implements ag4 {
    public final int c;
    public final int d;
    public final cw e;
    public final /* synthetic */ th2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh2(th2 th2Var, int i, int i2, cw cwVar) {
        super(4);
        this.f = th2Var;
        this.c = i;
        this.d = i2;
        this.e = cwVar;
    }

    @Override // defpackage.ag4
    public final void a(Object obj) {
        eg4 eg4Var;
        int i;
        Object obj2;
        rh2 rh2Var;
        g46 g46Var;
        boolean isTerminated;
        boolean z = obj instanceof jg4;
        if (!z && obj != null) {
            eg4Var = obj;
        } else {
            eg4Var = null;
        }
        eg4 eg4Var2 = eg4Var;
        if (eg4Var2 != null) {
            if (eg4Var2 instanceof g46) {
                g46Var = ((g46) eg4Var2).k0();
            } else {
                g46 g46Var2 = (g46) eg4Var2.p(q75.a(g46.class));
                if (g46Var2 != null) {
                    g46Var = g46Var2.k0();
                } else {
                    g46Var = new g46(eg4Var2, new n85(eg4Var2));
                }
            }
            if (!((gs0) this.b).c0(new hg4(g46Var))) {
                if (g46Var instanceof AutoCloseable) {
                    g46Var.close();
                } else if (g46Var instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) g46Var;
                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z2 = false;
                        while (!isTerminated) {
                            try {
                                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z2) {
                                    executorService.shutdownNow();
                                    z2 = true;
                                }
                            }
                        }
                        if (z2) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } else {
                    c44.r();
                    return;
                }
            }
        } else {
            gs0 gs0Var = (gs0) this.b;
            if (!z && obj != null) {
                i = 1;
            } else if (obj == null) {
                i = 2;
            } else {
                i = ((jg4) obj).a;
            }
            gs0Var.c0(new hg4(new jg4(i)));
        }
        cw cwVar = this.e;
        cwVar.getClass();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = cw.b;
        if (atomicIntegerFieldUpdater.decrementAndGet(cwVar) == 0) {
            Iterator it = this.f.h.iterator();
            it.getClass();
            if (!it.hasNext()) {
                th2 th2Var = this.f;
                cw cwVar2 = th2Var.g;
                cwVar2.getClass();
                if (atomicIntegerFieldUpdater.decrementAndGet(cwVar2) == 0) {
                    fw fwVar = th2Var.f;
                    do {
                        obj2 = fwVar.a;
                        rh2 rh2Var2 = (rh2) obj2;
                        int i2 = sh2.a[rh2Var2.ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                rh2Var = rh2.COMPLETE;
                            } else {
                                throw new IllegalStateException("Unexpected frame state for " + th2Var + "! State is " + rh2Var2 + ' ');
                            }
                        } else {
                            rh2Var = rh2.STREAM_RESULTS_COMPLETE;
                        }
                    } while (!fwVar.a(obj2, rh2Var));
                    Iterator it2 = th2Var.h.iterator();
                    it2.getClass();
                    if (!it2.hasNext()) {
                        if (rh2Var == rh2.COMPLETE) {
                            Iterator it3 = th2Var.h.iterator();
                            it3.getClass();
                            if (it3.hasNext()) {
                                throw b31.m(it3);
                            }
                            return;
                        }
                        return;
                    }
                    throw b31.m(it2);
                }
                return;
            }
            throw b31.m(it);
        }
    }
}
