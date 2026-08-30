package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tf6  reason: default package */
/* loaded from: classes.dex */
public final class tf6 implements AutoCloseable {
    public static final cw d0 = w81.f(0);
    public static final cw e0 = w81.f(0);
    public static final cw f0 = w81.f(0);
    public static final cw g0 = w81.f(0);
    public static final cw h0 = w81.f(0);
    public static final List i0 = l07.c0(sn1.l0, sn1.m0);
    public static final so5 j0 = new so5(7);
    public static final List k0 = l07.c0(new pf6(0), new pf6(34));
    public static final so5 l0 = new so5(8);
    public final bd0 A;
    public final LinkedHashMap B;
    public final List L;
    public final LinkedHashMap R;
    public final mt3 X;
    public final List Y;
    public final ArrayList Z;
    public final ArrayList c0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14, types: [kg4] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v7, types: [pp1] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public tf6(defpackage.ce0 r28, defpackage.bd0 r29, defpackage.hm1 r30, defpackage.wc1 r31) {
        /*
            Method dump skipped, instructions count: 1307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tf6.<init>(ce0, bd0, hm1, wc1):void");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        boolean isTerminated;
        Iterator it = ((ot3) this.X.values()).iterator();
        while (it.hasNext()) {
            pw2 pw2Var = (pw2) it.next();
            if (pw2Var instanceof AutoCloseable) {
                pw2Var.close();
            } else if (pw2Var instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) pw2Var;
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
                return;
            }
        }
    }

    public final bg0 d(int i) {
        Object obj;
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                obj = arrayList.get(i2);
                i2++;
                if (((bg0) obj).a == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (bg0) obj;
    }

    public final ag0 i(int i) {
        Object obj;
        Iterator it = this.B.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((bg0) ((Map.Entry) obj).getValue()).a == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return null;
        }
        return (ag0) entry.getKey();
    }

    public final String toString() {
        return "StreamGraph(" + this.B + ')';
    }
}
