package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.concurrent.ExecutorService;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends CoroutineWorker {
    public final WorkerParameters g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.g = workerParameters;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(androidx.work.impl.workers.ConstraintTrackingWorker r4, defpackage.mq3 r5, defpackage.vq2 r6, defpackage.xh7 r7, defpackage.k11 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.yy0
            if (r0 == 0) goto L13
            r0 = r8
            yy0 r0 = (defpackage.yy0) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            yy0 r0 = new yy0
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r4 = r0.R
            p31 r8 = defpackage.p31.COROUTINE_SUSPENDED
            int r1 = r0.Y
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            defpackage.me2.a0(r4)
            goto L3f
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r4)
            return r2
        L2e:
            defpackage.me2.a0(r4)
            vm r4 = new vm
            r4.<init>(r5, r6, r7, r2)
            r0.Y = r3
            java.lang.Object r4 = defpackage.iq2.k(r4, r0)
            if (r4 != r8) goto L3f
            return r8
        L3f:
            r4.getClass()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.g(androidx.work.impl.workers.ConstraintTrackingWorker, mq3, vq2, xh7, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(androidx.work.impl.workers.ConstraintTrackingWorker r22, defpackage.k11 r23) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.h(androidx.work.impl.workers.ConstraintTrackingWorker, k11):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    public final Object e(j11 j11Var) {
        ExecutorService executorService = this.b.c;
        executorService.getClass();
        return tq5.G(w81.n(executorService), new a6(this, null, 12), j11Var);
    }
}
