package defpackage;

import android.content.res.TypedArray;
import android.media.Image;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g46  reason: default package */
/* loaded from: classes.dex */
public final class g46 implements eg4 {
    public final eg4 A;
    public final n85 B;
    public final aw L = w81.e(false);

    public g46(eg4 eg4Var, n85 n85Var) {
        this.A = eg4Var;
        this.B = n85Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        boolean isTerminated;
        if (this.L.a()) {
            n85 n85Var = this.B;
            cw cwVar = (cw) n85Var.L;
            cwVar.getClass();
            if (cw.b.decrementAndGet(cwVar) == 0) {
                ((tp0) ((fw) n85Var.R).b(null)).getClass();
                eg4 eg4Var = (eg4) n85Var.B;
                if (eg4Var instanceof AutoCloseable) {
                    eg4Var.close();
                } else if (eg4Var instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) eg4Var;
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
                } else if (eg4Var instanceof TypedArray) {
                    ((TypedArray) eg4Var).recycle();
                } else if (eg4Var instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) eg4Var).release();
                } else if (eg4Var instanceof MediaDrm) {
                    ((MediaDrm) eg4Var).release();
                } else {
                    c44.r();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.g46 k0() {
        /*
            r6 = this;
            aw r0 = r6.L
            boolean r0 = r0.b()
            r1 = 0
            if (r0 == 0) goto Lb
        L9:
            r0 = r1
            goto L34
        Lb:
            n85 r0 = r6.B
            java.lang.Object r2 = r0.L
            cw r2 = (defpackage.cw) r2
        L11:
            int r3 = r2.a
            if (r3 != 0) goto L17
            r4 = 0
            goto L19
        L17:
            int r4 = r3 + 1
        L19:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = defpackage.cw.b
            boolean r3 = r5.compareAndSet(r2, r3, r4)
            if (r3 == 0) goto L11
            if (r4 == 0) goto L28
            java.lang.Object r0 = r0.B
            eg4 r0 = (defpackage.eg4) r0
            goto L29
        L28:
            r0 = r1
        L29:
            if (r0 == 0) goto L9
            g46 r0 = new g46
            eg4 r2 = r6.A
            n85 r6 = r6.B
            r0.<init>(r2, r6)
        L34:
            if (r0 == 0) goto L37
            return r0
        L37:
            java.lang.String r6 = "Required value was null."
            defpackage.i.n(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g46.k0():g46");
    }

    @Override // defpackage.m37
    public final Object p(qo0 qo0Var) {
        if (this.L.b()) {
            return null;
        }
        if (qo0Var.equals(q75.a(g46.class)) || qo0Var.equals(q75.a(eg4.class)) || qo0Var.equals(q75.a(fx2.class))) {
            return this;
        }
        if (!qo0Var.equals(q75.a(Image.class))) {
            return this.A.p(qo0Var);
        }
        throw new UnsupportedOperationException("Cannot unwrap " + this + " as android.media.Image. Use setFinalizerinstead and close all outstanding references.");
    }

    public final String toString() {
        return this.A.toString();
    }
}
