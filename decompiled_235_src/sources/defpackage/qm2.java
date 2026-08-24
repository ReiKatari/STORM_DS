package defpackage;

import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qm2  reason: default package */
/* loaded from: classes.dex */
public final class qm2 extends d2 implements dp4 {
    public final int c;
    public final int d;
    public final uw e;
    public final /* synthetic */ tm2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm2(tm2 tm2Var, int i, int i2, uw uwVar) {
        super(4);
        this.f = tm2Var;
        this.c = i;
        this.d = i2;
        this.e = uwVar;
    }

    @Override // defpackage.dp4
    public final void b(Object obj) {
        hp4 hp4Var;
        int i;
        Object obj2;
        rm2 rm2Var;
        sf6 sf6Var;
        boolean isTerminated;
        boolean z = obj instanceof mp4;
        if (!z && obj != null) {
            hp4Var = obj;
        } else {
            hp4Var = null;
        }
        hp4 hp4Var2 = hp4Var;
        if (hp4Var2 != null) {
            if (hp4Var2 instanceof sf6) {
                sf6Var = ((sf6) hp4Var2).k0();
            } else {
                sf6 sf6Var2 = (sf6) hp4Var2.e(gh5.a(sf6.class));
                if (sf6Var2 != null) {
                    sf6Var = sf6Var2.k0();
                } else {
                    sf6Var = new sf6(hp4Var2, new m44(hp4Var2));
                }
            }
            if (!((tu0) this.b).b0(new kp4(sf6Var))) {
                if (sf6Var instanceof AutoCloseable) {
                    sf6Var.close();
                } else if (sf6Var instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) sf6Var;
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
                    u34.t();
                    return;
                }
            }
        } else {
            tu0 tu0Var = (tu0) this.b;
            if (!z && obj != null) {
                i = 1;
            } else if (obj == null) {
                i = 2;
            } else {
                i = ((mp4) obj).a;
            }
            tu0Var.b0(new kp4(new mp4(i)));
        }
        uw uwVar = this.e;
        uwVar.getClass();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = uw.b;
        if (atomicIntegerFieldUpdater.decrementAndGet(uwVar) == 0) {
            Iterator it = this.f.h.iterator();
            it.getClass();
            if (!it.hasNext()) {
                tm2 tm2Var = this.f;
                uw uwVar2 = tm2Var.g;
                uwVar2.getClass();
                if (atomicIntegerFieldUpdater.decrementAndGet(uwVar2) == 0) {
                    xw xwVar = tm2Var.f;
                    do {
                        obj2 = xwVar.a;
                        rm2 rm2Var2 = (rm2) obj2;
                        int i2 = sm2.a[rm2Var2.ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                rm2Var = rm2.COMPLETE;
                            } else {
                                throw new IllegalStateException("Unexpected frame state for " + tm2Var + "! State is " + rm2Var2 + ' ');
                            }
                        } else {
                            rm2Var = rm2.STREAM_RESULTS_COMPLETE;
                        }
                    } while (!xwVar.a(obj2, rm2Var));
                    Iterator it2 = tm2Var.h.iterator();
                    it2.getClass();
                    if (!it2.hasNext()) {
                        if (rm2Var == rm2.COMPLETE) {
                            Iterator it3 = tm2Var.h.iterator();
                            it3.getClass();
                            if (it3.hasNext()) {
                                throw i61.j(it3);
                            }
                            return;
                        }
                        return;
                    }
                    throw i61.j(it2);
                }
                return;
            }
            throw i61.j(it);
        }
    }
}
